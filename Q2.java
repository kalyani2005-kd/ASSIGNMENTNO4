package Swing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2 extends JFrame implements ActionListener {
    JLabel nameLabel, vaccineLabel, doseLabel;
    JTextField nameField;
    JRadioButton rb1, rb2, rb3;
    JCheckBox cb1, cb2;
    JButton submit, reset;
    ButtonGroup bg;

   Q2() {
        setTitle("Vaccination Details");

        nameLabel = new JLabel("Name:");
        nameField = new JTextField(15);

        vaccineLabel = new JLabel("Vaccine:");
        rb1 = new JRadioButton("Covishield");
        rb2 = new JRadioButton("Covaxin");
        rb3 = new JRadioButton("Sputnik V");
        bg = new ButtonGroup();
        bg.add(rb1); bg.add(rb2); bg.add(rb3);

        doseLabel = new JLabel("Dose:");
        cb1 = new JCheckBox("1st Dose");
        cb2 = new JCheckBox("2nd Dose");

        submit = new JButton("Submit");
        reset = new JButton("Reset");

        JPanel p = new JPanel(new GridLayout(6, 2, 10, 10));
        p.add(nameLabel); p.add(nameField);
        p.add(vaccineLabel);
        JPanel vp = new JPanel(new FlowLayout(FlowLayout.LEFT));
        vp.add(rb1); vp.add(rb2); vp.add(rb3);
        p.add(vp);

        p.add(doseLabel);
        JPanel dp = new JPanel(new FlowLayout(FlowLayout.LEFT));
        dp.add(cb1); dp.add(cb2);
        p.add(dp);

        p.add(submit); p.add(reset);

        add(p);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String name = nameField.getText();
            String vaccine = "";
            if (rb1.isSelected()) vaccine = "Covishield";
            else if (rb2.isSelected()) vaccine = "Covaxin";
            else if (rb3.isSelected()) vaccine = "Sputnik V";

            String doses = "";
            if (cb1.isSelected()) doses += "1st Dose ";
            if (cb2.isSelected()) doses += "2nd Dose ";

            JOptionPane.showMessageDialog(this,
                "Name: " + name +
                "\nVaccine: " + vaccine +
                "\nDoses: " + doses);
        } else if (e.getSource() == reset) {
            nameField.setText("");
            bg.clearSelection();
            cb1.setSelected(false);
            cb2.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new Q2();
    }
}