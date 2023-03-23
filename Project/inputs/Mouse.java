package inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import main.GamePanel;

public class Mouse implements MouseListener, MouseMotionListener {
    
    private GamePanel gamePanel;

    public Mouse(GamePanel gamePanel){
        this.gamePanel = gamePanel;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // System.out.println("Drag");
        gamePanel.setRecPos(e.getX(), e.getY());
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // System.out.println("look at him goooo ");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}