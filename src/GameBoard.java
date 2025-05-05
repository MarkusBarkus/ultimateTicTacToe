import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {

    Tile[] tiles = new Tile[9];

    public GameBoard() {
        this.setPreferredSize(new Dimension(600, 600));
        this.setBackground(Color.BLACK);
        this.setLayout(new GridLayout(3, 3));

        for(int i = 0; i < 9; i++)
        {
            tiles[i] = new Tile();
            this.add(tiles[i]);
        }

    }


    public char checkWin(char player)
    {
        char result = 'n';

        if (tiles[0].claim == player && tiles[1].claim == player && tiles[2].claim == player)
        {
            result = player;
        }
        else if (tiles[3].claim == player && tiles[4].claim == player && tiles[5].claim == player)
        {
            result = player;
        }
        else if (tiles[6].claim == player && tiles[7].claim == player && tiles[8].claim == player)
        {
            result = player;
        }
        else if (tiles[0].claim == player && tiles[3].claim == player && tiles[6].claim == player)
        {
            result = player;
        }
        else if (tiles[1].claim == player && tiles[4].claim == player && tiles[7].claim == player)
        {
            result = player;
        }
        else if (tiles[2].claim == player && tiles[5].claim == player && tiles[8].claim == player)
        {
            result = player;
        }
        else if (tiles[0].claim == player && tiles[4].claim == player && tiles[8].claim == player)
        {
            result = player;
        }
        else if (tiles[2].claim == player && tiles[4].claim == player && tiles[6].claim == player)
        {
            result = player;
        }

        return result;
    }


}
