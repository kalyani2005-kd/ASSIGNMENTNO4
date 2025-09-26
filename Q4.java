package Swing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q4 extends JFrame implements ActionListener {

    private JComboBox<String> comboBox;
    private JButton showButton;
    private JLabel resultLabel;

    public Q4() {
        setTitle("ComboBox Example");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // ComboBox items
        String[] languages = {"C", "C++", "Java", "PHP"};
        comboBox = new JComboBox<>(languages);
        add(comboBox);

        // Show button
        showButton = new JButton("Show");
        showButton.addActionListener(this);
        add(showButton);

        // Label to display selection
        resultLabel = new JLabel("Programming language selected:");
        add(resultLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selected = (String) comboBox.getSelectedItem();
        resultLabel.setText("Programming language selected: " + selected);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Q4().setVisible(true);
        });
    }
}