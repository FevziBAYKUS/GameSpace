import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    public GameWindow(String spaceGame) throws HeadlessException {
        super(spaceGame);

    }

    public static void main(String[] args) {

        GameWindow gameWindow = new GameWindow("FEVZI'S Game");

        gameWindow.setResizable(false);
        gameWindow.setFocusable(false);


        gameWindow.setSize(816,614);

        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game game= new Game();
        game.requestFocus();

        game.addKeyListener(game);

        game.setFocusable(true);
        game.setFocusTraversalKeysEnabled(false);


        gameWindow.add(game);

        gameWindow.setVisible(true);
    }
}
