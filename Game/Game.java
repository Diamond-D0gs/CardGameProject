package Game;

import javax.swing.JFrame;
import java.awt.GraphicsEnvironment;
import java.util.Calendar;

public class Game {
    public static void main(String[] args) {
        // var graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        // var displayMode = graphicsEnvironment.getScreenDevices()[0].getDisplayMode();
        // int windowSize = (int)(displayMode.getHeight() * (1000.0f / 1080.0f));

        // var frame = new JFrame("Unstable Unicorns");
        // frame.setSize(windowSize, windowSize);
        // frame.setVisible(true);

        var repo = CardRepository.GetCardRepository();
        
        long seed = Calendar.getInstance().getTime().getTime();
        
        var nursery = repo.CreateShuffledNursery(seed);
        var deck = repo.CreateShuffledDeck(seed);

        return;
    }
}