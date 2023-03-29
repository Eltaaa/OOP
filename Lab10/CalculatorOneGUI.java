
import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {
    private JFrame fr;

    private JPanel mainPanel;
    private JPanel subPanel;

    private JTextField num1;
    private JTextField num2;

    private JButton plus;
    private JButton minus;
    private JButton multiply;
    private JButton divide;

    public CalculatorOneGUI() {
        fr = new JFrame("����ͧ�Դ�Ţ");
        mainPanel = new JPanel();
        subPanel = new JPanel();

        num1 = new JTextField();
        num2 = new JTextField();

        plus = new JButton("�ǡ");
        minus = new JButton("ź");
        multiply = new JButton("�ٳ");
        divide = new JButton("���");

        fr.add(mainPanel);
        mainPanel.setLayout(new GridLayout(4, 1));
        mainPanel.add(num1);
        mainPanel.add(num2);

        subPanel.setLayout(new FlowLayout());
        mainPanel.add(subPanel);
        subPanel.add(plus);
        subPanel.add(minus);
        subPanel.add(multiply);
        subPanel.add(divide);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

}