package main;
import javax.swing.JFrame;
// Main game window
// Draw shits here
public class GameWindow {
    
    private JFrame jframe;

    public GameWindow(GamePanel gamePanel) {
        // object window
        jframe = new JFrame();

        // set window size
        jframe.setSize(400,400);
        // window visibility
        jframe.setVisible(true);
        // terminate runtime on close
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        // jframe.setVisible(true);
        // why here ?

    }
}