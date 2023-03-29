
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorTwoGUI {

    private JFrame fr;

    private JPanel mainPanel;
    private JPanel GridPanel;

    private JTextField txt;

    private String[] buttonsText = {"7", "8", "9", "+",
        "4", "5", "6", "-",
        "1", "2", "3", "x",
        "0", "c", "=", "/"};

    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        mainPanel = new JPanel();
        GridPanel = new JPanel();

        txt = new JTextField();

        fr.add(mainPanel);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(txt, BorderLayout.NORTH);
        mainPanel.add(GridPanel, BorderLayout.CENTER);

        GridPanel.setLayout(new GridLayout(4,4));
        for (int i = 0; i < buttonsText.length; i++) {
            GridPanel.add(new JButton(buttonsText[i]));
        }
        
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        mainPanel.setSize(400, 200);

    }

}
