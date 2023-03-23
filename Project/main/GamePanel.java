package main;

// import hand-made inputs package
import inputs.*;

import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel {

    private Mouse mouse;
    private int xDelta = 100, yDelta = 100;

    public Mouse getMouse() {
        return this.mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public int getXDelta() {
        return this.xDelta;
    }

    public void setXDelta(int xDelta) {
        this.xDelta = xDelta;
    }

    public int getYDelta() {
        return this.yDelta;
    }

    public void setYDelta(int yDelta) {
        this.yDelta = yDelta;
    }

    public void moveXY(int xdel, int ydel) {
        this.setXDelta(this.getXDelta() + xdel);
        this.setYDelta(this.getYDelta() + ydel);
        // repaint();
    }

    public GamePanel() {
        mouse = new Mouse(this);

        addKeyListener(new Keyboard(this));
        addMouseListener(mouse);
        addMouseMotionListener(mouse);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillRect(this.getXDelta(), this.getYDelta(), 100, 100);

    }

    public void setRecPos(int x, int y) {
        this.setXDelta(x);
        this.setYDelta(y);
        // repaint();

    }

}
