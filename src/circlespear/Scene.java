package circlespear;

import MAIN.PlayerPrefferences;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Scene extends JPanel implements ActionListener, KeyListener {

    Image BG;
    BufferedImage img, spear, ring, bg, timeboard, gameover, scoreboard, win;
    int ringX = 0, velX = 0, ringY = 400, velY = 0;
    int spearX = 1200, spearVelX = 0, spearY = 20, spearVelY = 0;
    int angle = 0, angularVel = 0;
    int spearAngle = 0, spearAngleVel = 0;
    java.util.Timer timer;
    private AffineTransform ringTAnim, spearTAnim;
    Graphics g;
    private boolean isPlaying = true;
    private int trials = 3;
    public int scores = 0;
    public String score, playername;
    public String min, sec;
    Rectangle spearBound, ringBound;
    private int ringWidth, ringHeight;
    private boolean isCollided = false;
    Timer time = new Timer(3, this);

    Dimension d = new Dimension();
    PlayerPrefferences playerPrefferences;

    public Scene() {
        setSurfaceSize();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        loadImage();
        min = "0";
        sec = "00";
        time.start();
        playerPrefferences = new PlayerPrefferences();
        score = playerPrefferences.getPlayerScore();
        playername = playerPrefferences.getPlayerName();
        //timer = new java.util.Timer();
        //timer.schedule(new TimerClass(), 1000);
    }

    private void setSurfaceSize() {
        d.width = 1300;
        d.height = 500;
        setPreferredSize(d);
    }

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        ringTAnim = AffineTransform.getTranslateInstance(ringX, ringY);
        ringTAnim.rotate(Math.toRadians(angle), ring.getWidth() / 2, ring.getHeight() / 2);

        spearTAnim = AffineTransform.getTranslateInstance(spearX, spearY);
        spearTAnim.rotate(Math.toRadians(spearAngle));

        ringWidth = ring.getWidth() - 60;
        ringHeight = ring.getHeight() - 60;

        g2d.drawImage(bg, 0, 0, null);
        //g2d.drawImage(timeboard, 0, 10, null);
        g2d.drawImage(timeboard, (d.width / 2) - 500, 0, null);
        g2d.setColor(Color.white);
        g2d.drawString("SCORES", 200, 30);
        g2d.drawString("TIME", 300, 30);
        g2d.drawString("SPEARS REMAINING", 500, 30);
        g2d.drawString("PLAYER NAME", 700, 30);
        Font small = new Font("Helvetica", Font.BOLD, 30);
        FontMetrics metr = getFontMetrics(small);
        g.setColor(Color.white);
        g.setFont(small);
        g2d.drawString(scores + "", 200, 70);
        g2d.drawString(min + ":" + sec, 300, 70);
        g2d.drawString(trials + "", 500, 70);
        g2d.drawString(playername, 700, 70);
        g2d.drawImage(ring, ringTAnim, this);
        g2d.drawImage(spear, spearTAnim, this);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (isPlaying && isCollided == false) {
            doDrawing(g);
        } else if (!isPlaying) {
            drawGameOver(g, "Press Escape to play Again..");
        } else if (isCollided == true) {
            drawWin(g, "Press Escape to play Again..");
            scores = scores + 1;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("UP");
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            spearAngleVel = -5;
            System.out.println("LEFT");
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            spearAngleVel = 5;
            System.out.println("RIGHT");
        } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            spearVelX = -8;
            spearVelY = 6;
            System.out.println("ENTER");
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            velX = 3;
            angularVel = 5;
            System.out.println("SPACE");
        } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            playerPrefferences.setPlayerScore(scores+"");
            resetGame();
            System.out.println("ESCAPE");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        spearAngleVel = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (ringX > 1250) {
            velX = 0;
            angularVel = 0;
            isPlaying = false;
        }

        if (spearY > 500) {
            spearVelY = 0;
            spearVelX = 0;
        }
        ringX = ringX + velX;
        spearX += spearVelX;
        spearY += spearVelY;
        spearAngle += spearAngleVel;
        angle += angularVel;
        spearBound = new Rectangle(spearX, spearY, spear.getWidth(), spear.getHeight());
        ringBound = new Rectangle(ringX, ringY, ring.getWidth(), ring.getHeight());
        checkCollision();
        repaint();
    }

    public void drawGameOver(Graphics g, String message) {
        g.drawImage(bg, 0, 0, null);
        Font small = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics metr = getFontMetrics(small);
        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(message, 10, 20);
        g.drawImage(gameover, (1300 / 2) - 250, (500 / 2) - 150, this);
    }

    protected void checkCollision() {
        if (ringBound.intersects(spearBound)) {
            spearVelY = 0;
            spearVelX = 0;
            velX = 0;
            angularVel = 0;
            isCollided = true;
            //trials = trials - 1;
        }
    }

    protected void loadImage() {
        try {
            spear = ImageIO.read(getClass().getResourceAsStream("spear.png"));
            ring = ImageIO.read(getClass().getResourceAsStream("ring.png"));
            bg = ImageIO.read(getClass().getResourceAsStream("bg.png"));
            timeboard = ImageIO.read(getClass().getResourceAsStream("timeboard.png"));
            gameover = ImageIO.read(getClass().getResourceAsStream("gameover.png"));
            scoreboard = ImageIO.read(getClass().getResourceAsStream("scoreboard.png"));
            win = ImageIO.read(getClass().getResourceAsStream("win.png"));
        } catch (IOException ex) {
            System.out.println("failed to load images");
        }
    }

    protected void resetGame() {
        isPlaying = true;
        isCollided = false;
        ringX = 0;
        velX = 0;
        ringY = 400;
        velY = 0;
        spearX = 1250;
        spearVelX = 0;
        spearY = 10;
        spearVelY = 0;
        angle = 0;
        angularVel = 0;
        spearAngle = 0;
        spearAngleVel = 0;
    }

    private void drawWin(Graphics g, String msg) {
        g.drawImage(bg, 0, 0, null);
        Font small = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics metr = getFontMetrics(small);
        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(msg, 10, 20);
        g.drawImage(win, (1300 / 2) - 250, (500 / 2) - 150, this);
    }
}
