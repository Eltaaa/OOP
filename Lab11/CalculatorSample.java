
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorSample implements ActionListener {

    private JFrame fr;
    private JPanel GridPanel;

    private JTextField txt;
    private String num, operator;

    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;

    public CalculatorSample() {
        //
        fr = new JFrame("My Calculator");
        fr.setLayout(new BorderLayout());
        GridPanel = new JPanel();

        txt = new JTextField();

        b1 = new JButton("7");
        b2 = new JButton("8");
        b3 = new JButton("9");
        b4 = new JButton("+");
        b5 = new JButton("4");
        b6 = new JButton("5");
        b7 = new JButton("6");
        b8 = new JButton("-");
        b9 = new JButton("1");
        b10 = new JButton("2");
        b11 = new JButton("3");
        b12 = new JButton("x");
        b13 = new JButton("0");
        b14 = new JButton("c");
        b15 = new JButton("=");
        b16 = new JButton("/");

        // LISTENER
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);

        // LAYOUT
        GridPanel.setLayout(new GridLayout(4,4));
        fr.add(GridPanel);
        fr.setLayout(new BorderLayout());
        fr.add(txt, BorderLayout.NORTH);
        fr.add(GridPanel, BorderLayout.CENTER);
        

        GridPanel.add(b1);
        GridPanel.add(b2);
        GridPanel.add(b3);
        GridPanel.add(b4);
        GridPanel.add(b5);
        GridPanel.add(b6);
        GridPanel.add(b7);
        GridPanel.add(b8);
        GridPanel.add(b9);
        GridPanel.add(b10);
        GridPanel.add(b11);
        GridPanel.add(b12);
        GridPanel.add(b13);
        GridPanel.add(b14);
        GridPanel.add(b15);
        GridPanel.add(b16);

        // Property
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        fr.setSize(300, 300);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource().equals(b1)) {
            txt.setText(txt.getText() + "7");
        } else if (ae.getSource().equals(b2)) {
            txt.setText(txt.getText() + "8");
        } else if (ae.getSource().equals(b2)) {
            txt.setText(txt.getText() + "8");
        } else if (ae.getSource().equals(b3)) {
            txt.setText(txt.getText() + "9");
        } else if (ae.getSource().equals(b4)) {
            num = txt.getText();
            txt.setText("");
            operator = "+";

        } else if (ae.getSource().equals(b5)) {
            txt.setText(txt.getText() + "4");
        } else if (ae.getSource().equals(b6)) {
            txt.setText(txt.getText() + "5");
        } else if (ae.getSource().equals(b7)) {
            txt.setText(txt.getText() + "6");
        } else if (ae.getSource().equals(b8)) {
            num = txt.getText();
            txt.setText("");
            operator = "-";

        } else if (ae.getSource().equals(b9)) {
            txt.setText(txt.getText() + "1");
        } else if (ae.getSource().equals(b10)) {
            txt.setText(txt.getText() + "2");
        } else if (ae.getSource().equals(b11)) {
            txt.setText(txt.getText() + "3");
        } else if (ae.getSource().equals(b12)) {
            num = txt.getText();
            txt.setText("");
            operator = "*";

        } else if (ae.getSource().equals(b13)) {
            txt.setText(txt.getText() + "0");
        } else if (ae.getSource().equals(b14)) {
            txt.setText("");
        } else if (ae.getSource().equals(b15)) {
            switch (operator) {
                case "+" ->
                    txt.setText((Double.parseDouble(num) + Double.parseDouble(txt.getText())) + "");
                case "-" ->
                    txt.setText((Double.parseDouble(num) - Double.parseDouble(txt.getText())) + "");
                case "*" ->
                    txt.setText((Double.parseDouble(num) * Double.parseDouble(txt.getText())) + "");
                case "/" ->
                    txt.setText((Double.parseDouble(num) / Double.parseDouble(txt.getText())) + "");
                default -> {
                }
            }
        } else if (ae.getSource().equals(b16)) {
            num = txt.getText();
            txt.setText("");
            operator = "/";

        }
    }
}
