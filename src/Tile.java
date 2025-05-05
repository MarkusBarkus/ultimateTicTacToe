import javax.swing.*;
import java.awt.*;

public class Tile extends JPanel {

    char[] squares = {'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n'};



    public Tile() {
        this.setPreferredSize(new Dimension(200, 200));
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setLayout(new GridLayout(3, 3));

        JButton[] buttons = new JButton[9];
        for (int i = 0; i < 9; i++)
        {
            buttons[i] = new JButton();
            buttons[i].setBackground(Color.cyan);
            buttons[i].setBorder(BorderFactory.createLineBorder(Color.green));
            this.add(buttons[i]);
        }


    }

    public char checkTile(char player, int squarePlayed) //'x' or 'o' will be assigned to tiles after plays
    {
        char result = 'n'; //n stands for no one
        squares[squarePlayed] = player;

        if (squares[0] == player && squares[1] == player && squares[2] == player)
        {
            result = player;
        }
        else if (squares[3] == player && squares[4] == player && squares[5] == player)
        {
            result = player;
        }
        else if (squares[6] == player && squares[7] == player && squares[8] == player)
        {
            result = player;
        }
        else if (squares[0] == player && squares[3] == player && squares[6] == player)
        {
            result = player;
        }
        else if (squares[1] == player && squares[4] == player && squares[7] == player)
        {
            result = player;
        }
        else if (squares[2] == player && squares[5] == player && squares[8] == player)
        {
            result = player;
        }
        else if (squares[0] == player && squares[4] == player && squares[8] == player)
        {
            result = player;
        }
        else if (squares[2] == player && squares[4] == player && squares[6] == player)
        {
            result = player;
        }

        return result;
    }


}
