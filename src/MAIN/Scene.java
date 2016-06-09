package MAIN;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
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
    BufferedImage img, spear;
    int ringX = 0, velX = 0, ringY = 400, velY = 0;
    int spearX = 1250, spearVelX = 0, spearY = 10, spearVelY = 0;
    int angle = 0, angularVel = 0;
    int spearAngle = 0, spearAngleVel = 0;
    Timer timer = new Timer(5, this);
    private AffineTransform ringTAnim, spearTAnim;

    public Scene() {
        setSurfaceSize();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer.start();
    }

    private BufferedImage loadImage(String name) {
        BufferedImage bImg = null;
        try {
            bImg = ImageIO.read(getClass().getResourceAsStream(name));
        } catch (IOException ex) {
            //failed to load image.
        }
        return bImg;
    }

    private void setSurfaceSize() {
        Dimension d = new Dimension();
        d.width = 1300;
        d.height = 500;
        setPreferredSize(d);
    }

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        ringTAnim = AffineTransform.getTranslateInstance(ringX, ringY);
        ringTAnim.scale(0.4, 0.4);
        ringTAnim.rotate(Math.toRadians(angle), loadImage("ring.png").getWidth() / 2, loadImage("ring.png").getHeight() / 2);

        spearTAnim = AffineTransform.getTranslateInstance(spearX, spearY);
        spearTAnim.scale(0.5, 0.5);
        spearTAnim.rotate(Math.toRadians(spearAngle));

        g2d.drawImage(loadImage("bg.png"), 0, 0, null);
        g2d.drawImage(loadImage("timeboard.png"), 0, 10, null);
        g2d.setColor(Color.white);
        g2d.drawString("SCORES", 5, 35);
        g2d.drawString("0", 100, 35);
        g2d.drawString("TIME", 5, 70);
        g2d.drawString("0:00", 100, 70);
        g2d.drawImage(loadImage("ring.png"), ringTAnim, this);
        g2d.drawImage(loadImage("spear.png"), spearTAnim, this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {

        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            spearAngleVel = -10;     
        }else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            spearAngleVel = 10;
        }else if (e.getKeyCode() == KeyEvent.VK_ENTER){
            spearVelX = -15;
            spearVelY =  10;
        }else if (e.getKeyCode() == KeyEvent.VK_SPACE){
            velX = 7;
            angularVel = 20;
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
        }
        
        if (spearY > 500 ) {
            spearVelY = 0;
            spearVelX = 0;
        }
        ringX = ringX + velX;
        spearX += spearVelX;
        spearY += spearVelY;
        spearAngle += spearAngleVel;
        angle += angularVel;
        repaint();
    }
}
