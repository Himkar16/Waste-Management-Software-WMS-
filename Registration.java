package soft;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFirstName.setBounds(49, 89, 87, 39);
		contentPane.add(lblFirstName);
		
		JLabel lblSecondName = new JLabel("Second name");
		lblSecondName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSecondName.setBounds(49, 139, 98, 39);
		contentPane.add(lblSecondName);
		
		JLabel lblNewLabel = new JLabel("Age");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(49, 186, 61, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmailid = new JLabel("Email-id");
		lblEmailid.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmailid.setBounds(49, 236, 200, 50);
		contentPane.add(lblEmailid);
		
		textField = new JTextField();
		textField.setBounds(162, 89, 186, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 145, 186, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(162, 195, 186, 30);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(162, 247, 186, 32);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblUserRegisteration = new JLabel("User Registeration");
		lblUserRegisteration.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblUserRegisteration.setBounds(227, 10, 236, 50);
		contentPane.add(lblUserRegisteration);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRegister.setBounds(97, 332, 107, 30);
		contentPane.add(btnRegister);
		
		JLabel lblUserId = new JLabel("Username");
		lblUserId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUserId.setBounds(380, 89, 98, 39);
		contentPane.add(lblUserId);
		
		textField_4 = new JTextField();
		textField_4.setBounds(488, 95, 200, 30);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(380, 133, 200, 50);
		contentPane.add(lblPassword);
		
		textField_5 = new JTextField();
		textField_5.setBounds(488, 148, 200, 30);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
	}

}
