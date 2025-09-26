package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q3 extends JFrame {
    private JTextArea textArea;
    private JLabel wordLabel, charLabel;

    public Q3() {
        setTitle("Count Words and Characters");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Text area with scrollbars
        textArea = new JTextArea(8, 30);
        JScrollPane scrollPane = new JScrollPane(
            textArea,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
        );
        add(scrollPane, BorderLayout.CENTER);

        // Panel for button and result labels
        JPanel bottomPanel = new JPanel();
        JButton countButton = new JButton("Count Words");
        wordLabel = new JLabel("Words: 0");
        charLabel = new JLabel("Characters: 0");

        bottomPanel.add(countButton);
        bottomPanel.add(wordLabel);
        bottomPanel.add(charLabel);
        add(bottomPanel, BorderLayout.SOUTH);

        // Action for button
        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText().trim();
                int charCount = text.length();
                int wordCount = text.isEmpty() ? 0 : text.split("\\s+").length;
                wordLabel.setText("Words: " + wordCount);
                charLabel.setText("Characters: " + charCount);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q3().setVisible(true));
    }
}