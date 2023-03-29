import javax.swing.*;
import java.awt.*;

public class MDIFromGUI {
    private JFrame fr;
    private JDesktopPane pane;
    private JInternalFrame[] internal;
    private JMenuBar bar;
    private JMenu file, edit, view;
    private JMenu neww;
    private JMenuItem open, save, exit;
    private JMenuItem window, message;

    public MDIFromGUI() {
        fr = new JFrame("SubMenuItem Demo");
        pane = new JDesktopPane();
        internal = new JInternalFrame[3];

        for (int i = 0; i < 3; i++) {
            internal[i] = new JInternalFrame("Application 0" + i);
            pane.add(internal[i]);
            internal[i].pack();
            internal[i].setResizable(true);
            internal[i].setIconifiable(true);
            internal[i].setMaximizable(true);
            internal[i].setClosable(true);
            internal[i].setVisible(true);
            internal[i].setSize(500 + 10 * i, 100 + 10 * i);
            internal[i].setLocation(150 +100 * i, 200 + 50 * i);
        }

        bar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        view = new JMenu("View");

        neww = new JMenu("New");
        window = new JMenuItem("Window");
        message = new JMenuItem("Message");

        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        fr.add(pane);
        pane.setBackground(Color.black);

        // add bar
        fr.setJMenuBar(bar);
        bar.add(file);
        bar.add(edit);
        bar.add(view);

        file.add(neww);
        neww.add(window);
        neww.addSeparator();
        neww.add(message);

        file.addSeparator();
        file.add(open);
        file.addSeparator();
        file.add(save);
        file.addSeparator();
        file.add(exit);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        fr.setSize(1000, 800);
    }
}
