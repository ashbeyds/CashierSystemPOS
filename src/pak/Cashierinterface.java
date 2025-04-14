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
//import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;

public class Cashierinterface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtItemCode;
	private JTextField txtItemName;
	private JTextField txtItemQuantity;
	private JTextField txtItemPrice;
	private JTextField txtAmount;
	private JTextField textFieldChange;
	private JTextField textField_TotalPrice;
	private JTable table;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 640);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem MenuItemAddProd = new JMenuItem("Add Product");
		MenuItemAddProd.setBorderPainted(true);
		menuBar.add(MenuItemAddProd);
		
		//opens adding of items/ deleting
		
		MenuItemAddProd.addActionListener(e -> {
		    AddProductFrame addFrame = new AddProductFrame();
		    addFrame.setVisible(true);
		});
		
				
				JMenuItem MenuItemStoreIncome = new JMenuItem("Store Income");
				menuBar.add(MenuItemStoreIncome);
				
				//opens store income.
				
				MenuItemStoreIncome.addActionListener(e -> {
				    StoreIncomeFrame incomeFrame = new StoreIncomeFrame();
				    incomeFrame.setVisible(true);
				});
		
		JMenuItem MenuItemStockMonitor = new JMenuItem("Stock Monitoring");
		menuBar.add(MenuItemStockMonitor);
		
		//opens stock monitoring.
		
		MenuItemStockMonitor.addActionListener(e -> {
		    StockMonitoringFrame stockFrame = new StockMonitoringFrame();
		    stockFrame.setVisible(true);
		});
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 70, 741, 455);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		// Define column names
		String[] columnNames = {"Code", "Product Name", "Quantity","Price"};

		// Sample data rows
		Object[][] data = {
		    {1, "Apple", 1 , 0.99},
		    {2, "Banana", 1 , 0.59},
		    {3, "Orange", 1 , 1.29}
		};

		// Create the table model
		DefaultTableModel model = new DefaultTableModel(data, columnNames);

		// Set the model to the table
		table = new JTable(model);

		// Set table into the scroll pane
		scrollPane.setViewportView(table); // <- This sets the full table in the scroll pane
		
		JLabel lblNewLabel = new JLabel("EasySari");
		lblNewLabel.setFont(new Font("Eras Bold ITC", Font.BOLD, 40));
		lblNewLabel.setBounds(462, 0, 178, 72);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(Color.decode("#ff5050"));
		panel_1.setBounds(-97, 0, 1165, 72);
		panel.add(panel_1);
		
		JButton AddButton = new JButton("Add");
		AddButton.setBounds(751, 223, 89, 23);
		panel.add(AddButton);
		
		JButton DeleteButton = new JButton("Delete");
		DeleteButton.setBounds(850, 223, 89, 23);
		panel.add(DeleteButton);
		
		JButton UpdateButton = new JButton("Update");
		UpdateButton.setBounds(949, 223, 89, 23);
		panel.add(UpdateButton);
		
		txtItemCode = new JTextField();
		txtItemCode.setText("Item code");
		txtItemCode.setBounds(751, 130, 100, 20);
		panel.add(txtItemCode);
		txtItemCode.setColumns(10);
		
		JLabel lblNewLabel_Code = new JLabel("Code");
		lblNewLabel_Code.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_Code.setBounds(753, 106, 54, 22);
		panel.add(lblNewLabel_Code);
		
		txtItemName = new JTextField();
		txtItemName.setText("Item name");
		txtItemName.setColumns(10);
		txtItemName.setBounds(938, 130, 100, 20);
		panel.add(txtItemName);
		
		JLabel lblNewLabel_Name = new JLabel("Name");
		lblNewLabel_Name.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_Name.setBounds(940, 106, 67, 22);
		panel.add(lblNewLabel_Name);
		
		txtItemQuantity = new JTextField();
		txtItemQuantity.setText("Item quantity");
		txtItemQuantity.setColumns(10);
		txtItemQuantity.setBounds(751, 185, 100, 20);
		panel.add(txtItemQuantity);
		
		JLabel lblNewLabel_Quantity = new JLabel("Quantity");
		lblNewLabel_Quantity.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_Quantity.setBounds(753, 161, 89, 22);
		panel.add(lblNewLabel_Quantity);
		
		JLabel lblNewLabel_Price = new JLabel("Price");
		lblNewLabel_Price.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_Price.setBounds(940, 161, 89, 22);
		panel.add(lblNewLabel_Price);
		
		txtItemPrice = new JTextField();
		txtItemPrice.setText("Item price");
		txtItemPrice.setColumns(10);
		txtItemPrice.setBounds(938, 185, 100, 20);
		panel.add(txtItemPrice);
		
		JLabel lblNewLabel_MoneyRecieved = new JLabel("Money Recieved");
		lblNewLabel_MoneyRecieved.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_MoneyRecieved.setBounds(751, 276, 166, 22);
		panel.add(lblNewLabel_MoneyRecieved);
		
		txtAmount = new JTextField();
		txtAmount.setText("Amount");
		txtAmount.setColumns(10);
		txtAmount.setBounds(751, 309, 166, 20);
		panel.add(txtAmount);
		
		JLabel lblNewLabel_Change = new JLabel("Change");
		lblNewLabel_Change.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_Change.setBounds(751, 340, 166, 22);
		panel.add(lblNewLabel_Change);
		
		textFieldChange = new JTextField();
		textFieldChange.setEditable(false);
		textFieldChange.setBounds(751, 373, 166, 20);
		panel.add(textFieldChange);
		textFieldChange.setColumns(10);
		
		JButton btnNewButton_PayBal = new JButton("Pay Balance");
		btnNewButton_PayBal.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_PayBal.setBounds(751, 418, 100, 23);
		panel.add(btnNewButton_PayBal);
		
		JButton btnNewButton_PrintReceipt = new JButton("Print Receipt");
		btnNewButton_PrintReceipt.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_PrintReceipt.setBounds(938, 418, 100, 23);
		panel.add(btnNewButton_PrintReceipt);
		
		JLabel lblNewLabel_TotalPrice = new JLabel("Total:");
		lblNewLabel_TotalPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_TotalPrice.setBounds(10, 536, 166, 22);
		panel.add(lblNewLabel_TotalPrice);
		
		textField_TotalPrice = new JTextField();
		textField_TotalPrice.setFont(new Font("Monospaced", Font.BOLD, 16));
		textField_TotalPrice.setText("0.00");
		textField_TotalPrice.setEditable(false);
		textField_TotalPrice.setColumns(10);
		textField_TotalPrice.setBounds(129, 536, 613, 24);
		panel.add(textField_TotalPrice);
		
		
		//panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, label_code, label_name, label_qty, label_price, table_code, table_name, table_qty, table_price, table, panel_1, btnNewButton, btnNewButton_1, btnNewButton_2, txtItemCode, lblNewLabel_1, txtItemName, lblNewLabel_1_1, txtItemQuantity, lblNewLabel_1_1_1, lblNewLabel_1_1_1_1, txtItemPrice, lblNewLabel_1_1_1_2, txtAmount, lblNewLabel_1_1_1_2_1, textField, btnNewButton_3, btnNewButton_4, lblNewLabel_1_1_1_2_1_1, textField_1}));
		
		
	}
}
