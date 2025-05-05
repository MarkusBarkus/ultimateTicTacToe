import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {

    char[] Board = {'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n'};

    public GameBoard() {
        this.setPreferredSize(new Dimension(600, 600));
        this.setBackground(Color.BLACK);
        this.setLayout(new GridLayout(3, 3));
        Tile[] tiles = new Tile[9];
        for(int i = 0; i < 9; i++)
        {
            tiles[i] = new Tile();
            this.add(tiles[i]);
        }

    }


    public char checkWin(char player, int tileWon)
    {
        char result = 'n';
        Board[tileWon] = player;

        if (Board[0] == player && Board[1] == player && Board[2] == player)
        {
            result = player;
        }
        else if (Board[3] == player && Board[4] == player && Board[5] == player)
        {
            result = player;
        }
        else if (Board[6] == player && Board[7] == player && Board[8] == player)
        {
            result = player;
        }
        else if (Board[0] == player && Board[3] == player && Board[6] == player)
        {
            result = player;
        }
        else if (Board[1] == player && Board[4] == player && Board[7] == player)
        {
            result = player;
        }
        else if (Board[2] == player && Board[5] == player && Board[8] == player)
        {
            result = player;
        }
        else if (Board[0] == player && Board[4] == player && Board[8] == player)
        {
            result = player;
        }
        else if (Board[2] == player && Board[4] == player && Board[6] == player)
        {
            result = player;
        }

        return result;
    }


}
