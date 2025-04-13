package pak;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Label;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JFormattedTextField;

public class Cashierinterface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table_code;
	private JTable table_name;
	private JTable table_qty;
	private JTable table_price;
	private JTable table;
	private JTextField txtItemCode;
	private JTextField txtItemName;
	private JTextField txtItemQuantity;
	private JTextField txtItemPrice;
	private JTextField txtAmount;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cashierinterface frame = new Cashierinterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cashierinterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EasySari");
		lblNewLabel.setFont(new Font("Eras Bold ITC", Font.BOLD, 40));
		lblNewLabel.setBounds(462, 0, 178, 72);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(Color.decode("#ff5050"));
		panel_1.setBounds(-97, 0, 1165, 72);
		panel.add(panel_1);
		
		Label label_code = new Label("Code");
		label_code.setFont(new Font("Dialog", Font.BOLD, 19));
		label_code.setBounds(40, 78, 54, 22);
		panel.add(label_code);
		
		Label label_name = new Label("Name");
		label_name.setFont(new Font("Dialog", Font.BOLD, 19));
		label_name.setBounds(278, 78, 54, 22);
		panel.add(label_name);
		
		Label label_qty = new Label("Quantity");
		label_qty.setFont(new Font("Dialog", Font.BOLD, 19));
		label_qty.setBounds(512, 78, 80, 22);
		panel.add(label_qty);
		
		Label label_price = new Label("Price");
		label_price.setFont(new Font("Dialog", Font.BOLD, 19));
		label_price.setBounds(656, 78, 54, 22);
		panel.add(label_price);
		
		table_code = new JTable();
		table_code.setBounds(10, 129, 110, 20);
		panel.add(table_code);
		
		table_name = new JTable();
		table_name.setBounds(130, 130, 357, 20);
		panel.add(table_name);
		
		table_qty = new JTable();
		table_qty.setBounds(497, 130, 116, 20);
		panel.add(table_qty);
		
		table_price = new JTable();
		table_price.setBounds(623, 130, 118, 20);
		panel.add(table_price);
		
		table = new JTable();
		table.setBounds(10, 106, 731, 423);
		panel.add(table);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(751, 223, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setBounds(850, 223, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.setBounds(949, 223, 89, 23);
		panel.add(btnNewButton_2);
		
		txtItemCode = new JTextField();
		txtItemCode.setText("Item code");
		txtItemCode.setBounds(751, 130, 100, 20);
		panel.add(txtItemCode);
		txtItemCode.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Code");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(753, 106, 54, 22);
		panel.add(lblNewLabel_1);
		
		txtItemName = new JTextField();
		txtItemName.setText("Item name");
		txtItemName.setColumns(10);
		txtItemName.setBounds(938, 130, 100, 20);
		panel.add(txtItemName);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(940, 106, 67, 22);
		panel.add(lblNewLabel_1_1);
		
		txtItemQuantity = new JTextField();
		txtItemQuantity.setText("Item quantity");
		txtItemQuantity.setColumns(10);
		txtItemQuantity.setBounds(751, 185, 100, 20);
		panel.add(txtItemQuantity);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Quantity");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(753, 161, 89, 22);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Price");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(940, 161, 89, 22);
		panel.add(lblNewLabel_1_1_1_1);
		
		txtItemPrice = new JTextField();
		txtItemPrice.setText("Item price");
		txtItemPrice.setColumns(10);
		txtItemPrice.setBounds(938, 185, 100, 20);
		panel.add(txtItemPrice);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Money Recieved");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1_2.setBounds(751, 276, 166, 22);
		panel.add(lblNewLabel_1_1_1_2);
		
		txtAmount = new JTextField();
		txtAmount.setText("Amount");
		txtAmount.setColumns(10);
		txtAmount.setBounds(751, 309, 166, 20);
		panel.add(txtAmount);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Change");
		lblNewLabel_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1_2_1.setBounds(751, 340, 166, 22);
		panel.add(lblNewLabel_1_1_1_2_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(751, 373, 166, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Pay Balance");
		btnNewButton_3.setBounds(751, 418, 100, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Print Receipt");
		btnNewButton_4.setBounds(938, 418, 100, 23);
		panel.add(btnNewButton_4);
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, label_code, label_name, label_qty, label_price, table_code, table_name, table_qty, table_price, table, panel_1, btnNewButton, btnNewButton_1, btnNewButton_2, txtItemCode, lblNewLabel_1, txtItemName, lblNewLabel_1_1, txtItemQuantity, lblNewLabel_1_1_1, lblNewLabel_1_1_1_1, txtItemPrice, lblNewLabel_1_1_1_2, txtAmount, lblNewLabel_1_1_1_2_1, textField, btnNewButton_3, btnNewButton_4}));
		
		
	}
}
