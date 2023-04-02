import javax.swing.*;
import java.awt.*;

public class TellerGUI {
    private JFrame fr;

    private JPanel mainPanel;
    private JPanel gridPanel;
    private JPanel line1Panel;
    private JPanel line2Panel;
    private JPanel line3Panel;

    private JLabel balance;
    private JLabel amount;

    private JTextField baltxt;
    private JTextField amotxt;

    private JButton depo;
    private JButton widr;
    private JButton exit;

    public TellerGUI() {
        fr = new JFrame("Tller GUI");

        mainPanel = new JPanel();
        gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(4, 1));

        line1Panel = new JPanel();
        line2Panel = new JPanel();
        line3Panel = new JPanel();

        line1Panel.setLayout(new GridLayout(1, 2));
        line2Panel.setLayout(new GridLayout(1, 2));
        line3Panel.setLayout(new FlowLayout());

        balance = new JLabel("Balance");
        amount = new JLabel("Amount");

        baltxt = new JTextField("6000");
        baltxt.setEditable(false);
        amotxt = new JTextField();

        depo = new JButton("Deposit");
        widr = new JButton("Withdraw");
        exit = new JButton("Exit");

        fr.add(mainPanel);
        mainPanel.add(gridPanel);

        gridPanel.add(line1Panel);
        line1Panel.add(balance);
        // line1Panel.add(emptyPanel);
        line1Panel.add(baltxt);

        gridPanel.add(line2Panel);
        line2Panel.add(amount);
        // line2Panel.add(emptyPanel);
        line2Panel.add(amotxt);

        gridPanel.add(line3Panel);
        line3Panel.add(depo);
        line3Panel.add(widr);
        line3Panel.add(exit);

        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);

    }
}