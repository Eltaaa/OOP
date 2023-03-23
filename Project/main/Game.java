package main;

public class Game implements Runnable {

    private GameWindow gameWindow;
    private GamePanel gamePanel;
    private Thread gameThread;
    private final int fps = 120;

    public Game() {
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);

        gamePanel.setFocusable(true);
        gamePanel.requestFocus();

        startGameLoop();

    }

    private void startGameLoop() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        // frame time in nano sec (10**-9) more precise than microsec
        double frametime = 1_000_000_000.0 / fps;
        double lastFrame = System.nanoTime();
        double now = System.nanoTime();
        int frames = 0;
        double lastCheck = System.currentTimeMillis();
        while (true) {
            // 120 frames has passed (certain frame times has passed)
            now = System.nanoTime();
            if (now - lastFrame >= frametime) {

                // repaint every 120 frames
                gamePanel.repaint();
                lastFrame = now;
                frames++;

            }

            if (System.currentTimeMillis() - lastCheck >= 1000) {
                lastCheck = System.currentTimeMillis();
                System.out.println("fps : " + frames);

                frames = 0;
            }
        }
    }

}
