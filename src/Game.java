import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Game extends JPanel  implements KeyListener, ActionListener {

    private int currentTime = 0 ;
    private int spendShoot = 0 ;
    private BufferedImage image;

    private ArrayList<Shoot> shoots = new ArrayList<Shoot>();

    private int shootY = 1;

    private int ball = 0;

    private int ballX = 2;

    private int spacePlaneX = 0 ;
    private int isSpaceX = 20 ;




    public Game() {

        try {
            image = ImageIO.read(new FileImageInputStream(new File("png.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        setBackground(Color.DARK_GRAY);



    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.RED);
        g.fillOval(ballX,0,20,20);

        g.drawImage(image,spacePlaneX,590,image.getWidth()/10,image.getHeight()/10,this);

    }

    @Override
    public void repaint() {
        super.repaint();
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
