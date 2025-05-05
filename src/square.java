import javax.swing.*;
import java.awt.*;

public class square extends JButton {
    public char claim = 'n';
    public square() {

        this.setBackground(Color.cyan);
        this.setBorder(BorderFactory.createLineBorder(Color.green));
        //TODO: change colors to look better
        //+ add functionality to switch claim value's when button is pressed
        //and move to next tile (Also must check if said tile is claimed)
    }

}
