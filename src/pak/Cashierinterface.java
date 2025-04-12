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

public class Cashierinterface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEasyStore;
	private JPanel panel_2;
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
		setBounds(100, 100, 1080, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setBounds(711, 189, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(711, 231, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		txtEasyStore = new JTextField();
		txtEasyStore.setBorder(null);
		txtEasyStore.setBackground(Color.decode("#ff5050"));
		txtEasyStore.setFont(new Font("Eras Demi ITC", Font.BOLD, 40));
		txtEasyStore.setText("Easy Sari");
		txtEasyStore.setBounds(10, 0, 188, 72);
		panel.add(txtEasyStore);
		txtEasyStore.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(Color.decode("#ff5050"));
		panel_1.setBounds(-97, -31, 1165, 103);
		panel.add(panel_1);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(751, 0, 303, 591);
		panel.add(panel_2);
		
		Label label = new Label("Code");
		label.setFont(new Font("Dialog", Font.BOLD, 19));
		label.setBounds(10, 78, 54, 22);
		panel.add(label);
		
		Label label_1 = new Label("Name");
		label_1.setFont(new Font("Dialog", Font.BOLD, 19));
		label_1.setBounds(120, 78, 54, 22);
		panel.add(label_1);
		
		Label label_1_1 = new Label("Quantity");
		label_1_1.setFont(new Font("Dialog", Font.BOLD, 19));
		label_1_1.setBounds(243, 78, 80, 22);
		panel.add(label_1_1);
	}
}
