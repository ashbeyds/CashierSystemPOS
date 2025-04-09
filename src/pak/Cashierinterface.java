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

public class Cashierinterface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEasyStore;
	private JPanel panel_2;
	private JTextField txtId;
	private JTextField txtProduct;
	private JTextField txtQuantity;
	private JTextField textField_3;
	private JTextField textField_4;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setBounds(328, 129, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(328, 171, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		txtEasyStore = new JTextField();
		txtEasyStore.setBorder(null);
		txtEasyStore.setBackground(Color.decode("#ff5050"));
		txtEasyStore.setFont(new Font("Castellar", Font.PLAIN, 25));
		txtEasyStore.setText("Easy Store");
		txtEasyStore.setBounds(10, 11, 168, 42);
		panel.add(txtEasyStore);
		txtEasyStore.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(Color.decode("#ff5050"));
		panel_1.setBounds(-97, -31, 595, 103);
		panel.add(panel_1);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(309, 0, 115, 359);
		panel.add(panel_2);
		
		txtId = new JTextField();
		txtId.setText("ID");
		txtId.setBounds(0, 83, 86, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		txtProduct = new JTextField();
		txtProduct.setText("Product");
		txtProduct.setBounds(96, 83, 86, 20);
		panel.add(txtProduct);
		txtProduct.setColumns(10);
		
		txtQuantity = new JTextField();
		txtQuantity.setText("Quantity");
		txtQuantity.setBounds(197, 83, 86, 20);
		panel.add(txtQuantity);
		txtQuantity.setColumns(10);
	}
}
