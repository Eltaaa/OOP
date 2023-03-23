package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.GamePanel;

public class Keyboard implements KeyListener {
    private GamePanel gamePanel;

    public Keyboard(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent key) {
    }

    @Override
    public void keyReleased(KeyEvent key) {
    }

    @Override
    public void keyPressed(KeyEvent key) {
        // System.out.println("aaa");

        switch (key.getKeyCode()) {
            // W
            case KeyEvent.VK_W:
                System.out.println("W");
                gamePanel.moveXY(0, -5);
                break;
            // A
            case KeyEvent.VK_A:
                System.out.println("A");
                gamePanel.moveXY(-5, 0);
                break;
            // S
            case KeyEvent.VK_S:
                System.out.println("S");
                gamePanel.moveXY(0, 5);
                break;
            // D
            case KeyEvent.VK_D:
                System.out.println("D");
                gamePanel.moveXY(5, 0);
                break;
        }

    }
}
