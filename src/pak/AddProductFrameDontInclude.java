package pak;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class AddProductFrameDontInclude extends JFrame {

    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField txtCode, txtName, txtPrice, txtQty;

    public AddProductFrameDontInclude() {
        setTitle("Add Product");
        setSize(700, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        getContentPane().add(panel);

        // Table Setup
        tableModel = new DefaultTableModel(new Object[]{"Code", "Name", "Quantity", "Price"}, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Input Field
        JPanel inputPanel = new JPanel(new FlowLayout());

        txtCode = new JTextField(8);
        txtCode.setToolTipText("Product Code");

        txtName = new JTextField(10);
        txtName.setToolTipText("Product Name");

        txtQty = new JTextField(6);
        txtQty.setToolTipText("Quantity");

        txtPrice = new JTextField(8);
        txtPrice.setToolTipText("Product Price");

        inputPanel.add(new JLabel("Code:"));
        inputPanel.add(txtCode);
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(txtName);
        inputPanel.add(new JLabel("Qty:"));
        inputPanel.add(txtQty);
        inputPanel.add(new JLabel("Price:"));
        inputPanel.add(txtPrice);

        panel.add(inputPanel, BorderLayout.NORTH);

        // Button Panel
        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");

        buttonPanel.add(btnAdd);
        buttonPanel.add(btnDelete);
        buttonPanel.add(btnUpdate);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        // Button Actions
        btnAdd.addActionListener(e -> {
            String code = txtCode.getText();
            String name = txtName.getText();
            String qty = txtQty.getText();
            String price = txtPrice.getText();

            if (!code.isEmpty() && !name.isEmpty() && !qty.isEmpty() && !price.isEmpty()) {
                tableModel.addRow(new Object[]{code, name, qty, price});
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        btnDelete.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow >= 0) {
                tableModel.removeRow(selectedRow);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Delete Error", JOptionPane.WARNING_MESSAGE);
            }
        });

        btnUpdate.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow >= 0) {
                String code = txtCode.getText();
                String name = txtName.getText();
                String qty = txtQty.getText();
                String price = txtPrice.getText();

                if (!code.isEmpty() && !name.isEmpty() && !qty.isEmpty() && !price.isEmpty()) {
                    tableModel.setValueAt(code, selectedRow, 0);
                    tableModel.setValueAt(name, selectedRow, 1);
                    tableModel.setValueAt(qty, selectedRow, 2);
                    tableModel.setValueAt(price, selectedRow, 3);
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(this, "Fill in all fields before updating.", "Update Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Select a row to update.", "Update Error", JOptionPane.WARNING_MESSAGE);
            }
        });

        // Table Row Selection (Fill input fields)
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    txtCode.setText(tableModel.getValueAt(selectedRow, 0).toString());
                    txtName.setText(tableModel.getValueAt(selectedRow, 1).toString());
                    txtQty.setText(tableModel.getValueAt(selectedRow, 2).toString());
                    txtPrice.setText(tableModel.getValueAt(selectedRow, 3).toString());
                }
            }
        });
    }

    private void clearFields() {
        txtCode.setText("");
        txtName.setText("");
        txtQty.setText("");
        txtPrice.setText("");
    }
}
