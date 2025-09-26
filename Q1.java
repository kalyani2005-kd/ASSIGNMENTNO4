package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class  Q1 extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2;

Q1() {
        setTitle("Login");

        // Labels
        l1 = new JLabel("Username:");
        l2 = new JLabel("Password:");

        // Text fields
        t1 = new JTextField(15);
        t2 = new JPasswordField(15);

        // Buttons
        b1 = new JButton("Login");
        b2 = new JButton("Reset");

        // Panel & Layout
        JPanel p = new JPanel(new GridLayout(3, 2, 10, 10));
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(b1);
        p.add(b2);

        add(p);

        // Action listeners
        b1.addActionListener(this);
        b2.addActionListener(this);

        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String user = t1.getText();
            String pass = new String(t2.getPassword());
            if (user.equals("admin") && pass.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
            }
        } else if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
        }
    }

    public static void main(String[] args) {
        new Q1();
    }
}

