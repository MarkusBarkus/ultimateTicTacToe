import org.w3c.dom.css.RGBColor;

import javax.swing.*;
import java.awt.*;

public class mainMenu extends JPanel {

    JButton newGame = new JButton("Start new Game"),
            settings = new JButton("Settings"),
            loadGame = new JButton("Load Game"),
            credits = new JButton("Credits");

    public mainMenu()
    {
        this.setPreferredSize(new Dimension(600,600));
        this.setBackground(Color.PINK);

        this.add(newGame);
        this.add(settings);
        this.add(loadGame);
        this.add(credits);
        //TODO: give buttons functionality
    }

}
