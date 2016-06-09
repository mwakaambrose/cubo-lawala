package MAIN;

import java.util.prefs.Preferences;

/**
 *
 * @author WINGERsoft-AMBROSE
 */
public class PlayerPrefferences {
    Preferences configs;
    public PlayerPrefferences(){
       configs  = Preferences.userRoot();
    }

    public String getPlayerName() {
        return configs.get("name", "0");
    }

    public void setPlayerName(String playerName) {
        configs.put("name", playerName);
    }

    public String getPlayerScore() {
        return configs.get("score", "0");
    }

    public void setPlayerScore(String playerScore) {
        configs.put("score", playerScore);
    }
}

