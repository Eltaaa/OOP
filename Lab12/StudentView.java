
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class StudentView implements ActionListener, WindowListener {

    private JFrame frame;
    private JPanel panel1, panel2, panel3, panel4;
    private JLabel labelID, labelName, labelMoney;
    private JTextField fieldID, fieldName, fieldMoney;
    private JButton deposit, withdraw;

    private Student student;

    public StudentView() {
        student = new Student("Yuka", 65070999, 1000);

        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();

        labelID = new JLabel("ID:");
        labelName = new JLabel("Name:");
        labelMoney = new JLabel("Money:");

        fieldID = new JTextField(student.getID() + "");
        fieldName = new JTextField(student.getName());
        fieldMoney = new JTextField(student.getMoney() + "");

        deposit = new JButton("Deposit");
        deposit.addActionListener(this);
        withdraw = new JButton("Withdraw");
        withdraw.addActionListener(this);

        frame.setLayout(new GridLayout(4, 1));
        frame.addWindowListener(this);
        panel1.setLayout(new GridLayout(1, 2));
        panel2.setLayout(new GridLayout(1, 2));
        panel3.setLayout(new GridLayout(1, 2));
        panel4.setLayout(new FlowLayout());

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

        panel1.add(labelID);
        panel1.add(fieldID);

        panel2.add(labelName);
        panel2.add(fieldName);

        panel3.add(labelMoney);
        panel3.add(fieldMoney);
        fieldMoney.setEditable(false);

        panel4.add(deposit);
        panel4.add(withdraw);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(deposit)) {
            student.setMoney(student.getMoney() + 100);
        } else {
            student.setMoney(student.getMoney() - 100);
        }
        fieldMoney.setText(student.getMoney() + "");
    }

    @Override
    public void windowOpened(WindowEvent ae) {
        try ( FileInputStream fin = new FileInputStream("StudentM.dat");  ObjectInputStream in = new ObjectInputStream(fin);) {
            student = (Student) in.readObject();
            fieldID.setText(String.valueOf(student.getID()));
            fieldName.setText(student.getName());
            fieldMoney.setText(String.valueOf(student.getMoney()));
        } catch (IOException e) {
        } catch (ClassNotFoundException c) {
        }
    }

    @Override
    public void windowClosing(WindowEvent ae) {
        try ( FileOutputStream fin = new FileOutputStream("StudentM.dat");  ObjectOutputStream oout = new ObjectOutputStream(fin);) {
            student.setID(Integer.parseInt(fieldID.getText()));
            student.setName(fieldName.getText());
            student.setMoney(Integer.parseInt(fieldMoney.getText()));
            oout.writeObject(student);
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
