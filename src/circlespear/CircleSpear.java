package circlespear;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class CircleSpear extends JFrame {
    
    public CircleSpear(){
        initUI();
    }

    private void initUI() {
        add(new Scene());
        setTitle("Circle Spear");
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            CircleSpear ex = new CircleSpear();
            ex.setVisible(true);
        });
    }

}
