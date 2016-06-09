
package MAIN;

import java.awt.BorderLayout;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Mwk Ams
 */
public class TimerClass extends TimerTask{
    
    public JLabel updater;
    public int h;
    public int m;
    public int s;
    public int bgMover;
    
    public TimerClass(){
        h = 0;
        m = 0;
        s = 0;
        bgMover = 0;
        //createGUI();
    }
//    
//    public void createGUI(){
//        JFrame frame = new JFrame("hello printing");
//        updater = new JLabel(""+counter);        
//        frame.pack();
//        frame.setLayout(new BorderLayout(2, 2));
//        frame.add(updater, BorderLayout.CENTER);
//        frame.setVisible(true);
//        frame.setSize(70, 70);
//        frame.setResizable(false);
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
//    }
//    
    public void printHelloWorld(){
        s++;
        RUN.s.setText(""+s);
        if(s==60){
            m++;
            RUN.m.setText(""+m);
            s = 0;
        }
        if(m==60){
            h++;
            RUN.h.setText(""+h);
            m = 0;
        }
        
        
        
        
        
        //RUN.bg.setLocation(bgMover--, 0);
        //RUN.ring.setLocation(counter, RUN.ring.getY());
        //updater.setText(""+counter);
        //System.out.println("x "+ counter +"y "+ RUN.ring.getY());
    }
    
    @Override
    public void run() {
        printHelloWorld();
    }
    
//    public static void main(String[] args) {
//        java.util.Timer timer = new java.util.Timer();
//        timer.schedule(new TimerClass(), 0, 2000);
//    }  
}
