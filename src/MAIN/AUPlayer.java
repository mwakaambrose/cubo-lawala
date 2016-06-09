
package MAIN;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 * @author Mwk Ams
 * This is a helper class plays audio (au format) in a program
 * from within a jar file.
 */

public class AUPlayer {
    
    AudioClip audio;
    
    public AUPlayer(String file){
        audio = Applet.newAudioClip(returnUrl(file));
        audio.loop();
    }
    public void playSound(){
        audio.loop();
    }
    
    public void stopSound(){
        audio.stop();
    }
    public URL returnUrl(String audioFileName){
        URL url = null;
        try{
            url = this.getClass().getResource(audioFileName);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Failed to laod audio. sound will not work");
        }
        return url;
    }
}
