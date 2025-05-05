import javax.swing.*;
import java.awt.*;

public class Tile extends JPanel {

    boolean active = true;
    char claim = 'n';
    square[] squares = new square[9];
    //all tiles can be used when game starts (swap 8/9 to false after first move)
    //When moving to a tile check claim for n and active to false to flip to true
    //otherwise all other tiles that are n will be set to true

    public Tile() {

        this.setPreferredSize(new Dimension(200, 200));
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++)
        {
            squares[i] = new square();
            this.add(squares[i]);
        }

    }

    public char checkTile(char player, int squarePlayed) //'x' or 'o' will be assigned to tiles after plays
    {
        char result = 'n'; //n stands for no one
        squares[squarePlayed].claim = player;

        if (squares[0].claim == player && squares[1].claim == player && squares[2].claim == player)
        {
            result = player;
        }
        else if (squares[3].claim == player && squares[4].claim == player && squares[5].claim == player)
        {
            result = player;
        }
        else if (squares[6].claim == player && squares[7].claim == player && squares[8].claim == player)
        {
            result = player;
        }
        else if (squares[0].claim == player && squares[3].claim == player && squares[6].claim == player)
        {
            result = player;
        }
        else if (squares[1].claim == player && squares[4].claim == player && squares[7].claim == player)
        {
            result = player;
        }
        else if (squares[2].claim == player && squares[5].claim == player && squares[8].claim == player)
        {
            result = player;
        }
        else if (squares[0].claim == player && squares[4].claim == player && squares[8].claim == player)
        {
            result = player;
        }
        else if (squares[2].claim == player && squares[4].claim == player && squares[6].claim == player)
        {
            result = player;
        }

        return result;
    }

}
