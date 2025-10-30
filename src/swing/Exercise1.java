package swing;

import javax.swing.*;

public class Exercise1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Exercise 1");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel name = new JLabel("Name");
        name.setBounds(10, 10, 50, 25);
        frame.add(name);

        JTextField textField = new JTextField();
        textField.setBounds(70, 10, 250, 25);
        frame.add(textField);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(10, 50, 50, 25);
        frame.add(gender);

        String[] genders = {"Male", "Female", "Other"};
        JComboBox<String> genderComboBox = new JComboBox<>(genders);
        genderComboBox.setBounds(70, 50, 100, 25);
        frame.add(genderComboBox);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(10, 90, 100, 25);
        submitButton. addActionListener(e -> {
            String nameInput = textField.getText();
            String genderInput = (String) genderComboBox.getSelectedItem();
            JOptionPane.showMessageDialog(frame, "Name: " + nameInput + "\nGender: " + genderInput);
        });
        frame.add(submitButton);

        frame.setVisible(true);
    }
}
