package swing;

import javax.swing.*;
import java.awt.*;

// Combine layout manager
public class Exercise2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Exercise 2");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setLayout(new BorderLayout());
        JPanel formPanel = createFormPanel();
        frame.add(formPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static JPanel createFormPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        panel.add(nameLabel);
        panel.add(nameField);
        return panel;
    }
}

