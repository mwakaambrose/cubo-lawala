package circlespear;

import MAIN.MENU;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class CircleSpear extends JFrame {
    
    public CircleSpear() {
        initUI();
    }
    
    private void initUI() {
        add(new Scene());
        setTitle("Circle Spear");
        pack();
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Closed");
                new MENU().setVisible(true);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Closing");
                new MENU().setVisible(true);
            }
            
        });
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            CircleSpear ex = new CircleSpear();
            ex.setVisible(true);
        });
    }
    
}
