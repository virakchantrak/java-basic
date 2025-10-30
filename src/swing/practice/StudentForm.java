package swing.practice;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentForm extends JFrame {
    private static JTable table;
    private static JTextField nameField;
    private static JRadioButton maleButton;
    private static JRadioButton femaleButton;
    private static JComboBox<Integer> gradeComboBox;
    private static JTextField ageField;
    private static int selectedRow = -1;
    private static JButton submitButton;
    private static JButton deleteButton;

    public StudentForm () {
        this.setTitle("Student Form");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Add components
        JPanel panel = createForm();
        this.getContentPane().add(panel, BorderLayout.NORTH);
        table = createTable();
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(table);
        addMouseClickEventToTable();
        this.getContentPane().add(scrollPane);
        this.setVisible(true);
    }

    private static JPanel createForm() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        panel.add(nameLabel);
        panel.add(nameField);

        JLabel genderLabel = new JLabel("Gender:");
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        JPanel pGender = new JPanel(new FlowLayout());
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        pGender.add(maleButton);
        pGender.add(femaleButton);
        panel.add(genderLabel);
        panel.add(pGender);

        JLabel gradeLabel = new JLabel("Grade:");
        Integer[] grade = {1,2,3,4,5,6,7,8,9,10,11,12};
        gradeComboBox = new JComboBox<>(grade);
        panel.add(gradeLabel);
        panel.add(gradeComboBox);

        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField();
        panel.add(ageLabel);
        panel.add(ageField);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitButtonListener());
        panel.add(submitButton);

        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new SubmitButtonListener());
        panel.add(deleteButton);

        return panel;
    }

    private static class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == submitButton) {
                saveOrUpdate();
            } else if (e.getSource() == deleteButton) {
                removeRowData();
            }
        }

        private void removeRowData() {
            if (selectedRow != -1) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.removeRow(selectedRow);
                selectedRow = -1; // Reset selected row after deletion
                clearForm();
            }
        }
    }

    private static void saveOrUpdate() {
        // Update row data
        if ( selectedRow != -1 ) {
            table.setValueAt(nameField.getText(), selectedRow, 0);
            table.setValueAt(maleButton.isSelected() ? "Male" : "Female", selectedRow, 1);
            table.setValueAt(gradeComboBox.getSelectedItem(), selectedRow, 2);
            table.setValueAt(ageField.getText(), selectedRow, 3);
            selectedRow = -1; // Reset selected row after update
        } else {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] data = new Object[] {
                    nameField.getText(),
                    maleButton.isSelected() ? "Male" : "Female",
                    gradeComboBox.getSelectedItem(),
                    ageField.getText()
            };
            model.addRow(data);
        }
        clearForm();
    }

    private static JTable createTable() {
        String[] columns = {"Name", "Gender", "Grade", "Age"};
        Object[][] rowData = {
                {"John Doe", " Male", 10, 15},
                {"Jane Smith", " Female", 11, 16},
        };
        DefaultTableModel defaultTableModel = new DefaultTableModel(rowData, columns);
        return new JTable(defaultTableModel);
    }

    private static void clearForm() {
        nameField.setText("");
        maleButton.setSelected(false);
        femaleButton.setSelected(false);
        gradeComboBox.setSelectedIndex(0);
        ageField.setText("");
    }

    private static void addMouseClickEventToTable() {
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setFormValues();
            }
        });
    }

    private static void setFormValues() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        selectedRow = table.getSelectedRow();
        Object name = model.getValueAt(selectedRow, 0);
        Object gender = model.getValueAt(selectedRow, 1);
        Object grade = model.getValueAt(selectedRow, 2);
        Object age = model.getValueAt(selectedRow, 3);
        nameField.setText(name.toString());
        if (gender.toString().trim().equals("Male")) {
            maleButton.setSelected(true);
        } else {
            femaleButton.setSelected(true);
        }
        gradeComboBox.setSelectedItem(Integer.parseInt(grade.toString()));
        ageField.setText(age.toString());
    }
}
