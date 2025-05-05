import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        char player = 'o'; //default value TODO: make changable and deafult what player sets

        Game game = new Game();
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setTitle("Ultimate Tic-Tac-Toe");
        game.setResizable(false);
        game.pack();

        game.setLocationRelativeTo(null);
        game.setVisible(true);

    //TODO: Create Main menu
        //settings
        //save
        //load

    }
}