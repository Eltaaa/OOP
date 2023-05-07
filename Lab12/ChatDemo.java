
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatDemo implements ActionListener, WindowListener {

    private JFrame frame;
    private JPanel panel, panelagain;
    private JTextArea area;
    private JTextField field;
    private JButton submit, reset;

    public ChatDemo() {
        frame = new JFrame();
        frame.addWindowListener(this);
        frame.setLayout(new BorderLayout());
        panel = new JPanel();
        panelagain = new JPanel();
        panelagain.setLayout(new BorderLayout());
        panel.setLayout(new FlowLayout());
        area = new JTextArea(20, 45);
        area.setEditable(false);
        field = new JTextField(45);
        submit = new JButton("Submit");
        submit.addActionListener(this);
        reset = new JButton("Reset");
        reset.addActionListener(this);

        frame.add(panelagain, BorderLayout.CENTER);
        panelagain.add(area, BorderLayout.CENTER);
        panelagain.add(field, BorderLayout.SOUTH);

        frame.add(panel, BorderLayout.SOUTH);
        panel.add(submit);
        panel.add(reset);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(submit)) {
            if (!field.getText().equals("")) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                String time = dtf.format(LocalDateTime.now()) + " : ";
                area.setText(area.getText() + time + field.getText() + "\n");
                field.setText("");
            }
        } else {
            area.setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent ae) {
        // show data as string from file 
        try ( FileReader fr = new FileReader("ChatDemo.dat");) {
            int ch = fr.read();
            while (ch != -1) {
                area.setText(area.getText() + (char) ch);
                ch = fr.read();
            }
        } catch (IOException e) {
        }
    }

    @Override
    public void windowClosing(WindowEvent ae) {
        // store String into a file
        try (FileWriter fw = new FileWriter("ChatDemo.dat");) {
            fw.write(area.getText());
        } catch (IOException e) {
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
