package MAIN;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Game extends Canvas {
    
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    
    @Override
    public void paint(Graphics g) {
        g.drawString("GAME PLAY WILL BE HERE....", 200, 200);
    }
    
    public static void main(String[] args) {
        Game game = new Game();
        JFrame frame = new JFrame("GAME");
        frame.add(game);
        frame.setSize(700, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
    }
}
