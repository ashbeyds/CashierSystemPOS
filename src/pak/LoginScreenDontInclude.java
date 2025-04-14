package pak;

import java.sql.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginScreenDontInclude {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreenDontInclude window = new LoginScreenDontInclude();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection=null;
	private JTextField LoginUserinput;
	private JPasswordField UserPasswordInput;
	/**
	 * Create the application.
	 */
	public LoginScreenDontInclude() {
		initialize();
		 connection= ConnectiontoDATABASEDontInclude.connect();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(22, 82, 133, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 15));
		lblPassword.setBounds(22, 142, 133, 35);
		frame.getContentPane().add(lblPassword);
		
		LoginUserinput = new JTextField();
		LoginUserinput.setBounds(154, 90, 190, 20);
		frame.getContentPane().add(LoginUserinput);
		LoginUserinput.setColumns(10);
		
		UserPasswordInput = new JPasswordField();
		UserPasswordInput.setBounds(154, 150, 190, 20);
		frame.getContentPane().add(UserPasswordInput);
		
		JButton LoginBUTTON = new JButton("Login");
		LoginBUTTON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		LoginBUTTON.setBounds(81, 200, 89, 23);
		frame.getContentPane().add(LoginBUTTON);
		
		JButton ClearBUTTON = new JButton("Clear");
		ClearBUTTON.setBounds(243, 200, 89, 23);
		frame.getContentPane().add(ClearBUTTON);
	}

}
