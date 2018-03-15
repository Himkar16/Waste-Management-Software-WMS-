package soft;

import java.awt.EventQueue;

import org.apache.commons.lang.ArrayUtils;

import java.awt.Image;
import java.sql.*;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;

import java.awt.CardLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.FlowLayout;

import javax.swing.JMenuBar;

import java.awt.Scrollbar;

import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JComboBox;

import java.awt.Choice;

import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

import net.proteanit.sql.DbUtils;

import javax.swing.table.DefaultTableModel;
import javax.swing.JPasswordField;

public class login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/** 
	 * Create the application.
	 */
	Connection connt=null;
	Connection connt2=null;
	Connection connt3=null;
	private JTextField textFieldUn;
	private JTextField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;
	private JTable table_2;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTable table_1;
	
	public login() {
		initialize();
		connt=sqlite.connect();	
		connt2=sqlite.connect();
		connt3=sqlite.connect();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 102, 102));
		frame.setBounds(100, 100, 843, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		Image img= new ImageIcon(frame.getClass().getResource("/waste9.gif")).getImage();
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 102, 102));
		frame.getContentPane().add(panel_3, "t3");
		panel_3.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 101, 1298, 593);
		panel_3.add(panel_2);
		panel_2.setBackground(new Color(0, 102, 102));
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 116, 734, 499);
		panel_2.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon(img));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(815, 99, 474, 439);
		panel_2.add(tabbedPane);
		tabbedPane.setBackground(new Color(255, 255, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("Login to contiue further..\r\n\r\n\r\n");
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(47, 79, 79));
		tabbedPane.addTab("USER", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblLoginWindow = new JLabel("Login Window");
		lblLoginWindow.setForeground(new Color(123, 104, 238));
		lblLoginWindow.setBounds(130, 47, 234, 57);
		panel_1.add(lblLoginWindow);
		lblLoginWindow.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblUsername.setBounds(47, 156, 112, 50);
		panel_1.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblPassword.setBounds(47, 234, 200, 50);
		panel_1.add(lblPassword);
		
		textFieldUn = new JTextField();
		textFieldUn.setBounds(206, 169, 179, 32);
		panel_1.add(textFieldUn);
		textFieldUn.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(206, 236, 179, 32);
		panel_1.add(passwordField);
		passwordField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setBounds(113, 320, 112, 38);
		panel_1.add(btnLogin);
		final JLabel lblNewLabel_3 = new JLabel("New label");
		final JLabel label_35 = new JLabel("First name");
		label_35.setForeground(new Color(106, 90, 205));
		final JLabel label_36 = new JLabel("Second name");
		label_36.setForeground(new Color(106, 90, 205));
		final JLabel label_37 = new JLabel();
		label_37.setForeground(new Color(106, 90, 205));
		final JLabel label_38 = new JLabel();
		label_38.setForeground(new Color(106, 90, 205));
		final JLabel label_39 = new JLabel();
		final JLabel label_40 = new JLabel();
		final JLabel label_41 = new JLabel();
		final JLabel label_20 = new JLabel();
		label_39.setForeground(new Color(106, 90, 205));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String query="select * from userinfo where username=? and password=?";
					PreparedStatement b=connt.prepareStatement(query);
					b.setString(1,textFieldUn.getText() );
					b.setString(2,passwordField.getText() );
				
					ResultSet ra = b.executeQuery();
				int count=0;
				while(ra.next())
				{
					count++;
					
					lblNewLabel_3.setText(ra.getString("firstname"));
					label_35.setText(ra.getString("firstname"));
					label_20.setText(ra.getString("firstname"));
					label_40.setText(ra.getString("firstname"));
					label_41.setText(ra.getString("firstname"));
					label_36.setText(ra.getString("secondname"));
					label_37.setText(ra.getString("username"));
					label_38.setText((String)ra.getString("age"));
					label_39.setText(ra.getString("emailid"));
					
				}
				
				if(count==1)
				{
					JOptionPane.showMessageDialog(null,"user name and password are correct");
					CardLayout c2 = (CardLayout)(frame.getContentPane().getLayout());
					c2.show(frame.getContentPane(), "t5");
						
				}
				else if(count>1)
				{
					JOptionPane.showMessageDialog(null,"duplicate user name and password is correct");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"user name or password is incorrect.\nTry Again!");
				}
				ra.close();
				b.close();
			}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"Something's wrong");
				}
			}
		});
		btnLogin.setBackground(SystemColor.activeCaption);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Login to contiue further..");
		panel.setBorder(null);
		panel.setBackground(new Color(47, 79, 79));
		tabbedPane.addTab("ADMIN", null, panel, null);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Login Window");
		label.setForeground(new Color(123, 104, 238));
		label.setBounds(132, 55, 208, 45);
		panel.add(label);
		label.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		
		JLabel lblUsername_1 = new JLabel("Admin ID");
		lblUsername_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUsername_1.setBounds(51, 165, 89, 39);
		panel.add(lblUsername_1);
		
		textField = new JTextField();
		textField.setBounds(206, 165, 171, 36);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblPassword_1.setBounds(51, 225, 200, 50);
		panel.add(lblPassword_1);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(208, 231, 169, 36);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin_1 = new JButton("Login");
		btnLogin_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin_1.setBounds(109, 325, 104, 39);
		panel.add(btnLogin_1);
		
		JLabel lblNewLabel_1 = new JLabel("Don't have a account ?");
		lblNewLabel_1.setBounds(654, 559, 141, 34);
		panel_2.add(lblNewLabel_1);
		
		JButton btnSignUp = new JButton("Sign up ");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c = (CardLayout)(frame.getContentPane().getLayout());
				c.show(frame.getContentPane(), "t4");
			}
		});
		btnSignUp.setBackground(new Color(0, 102, 102));
		btnSignUp.setBounds(794, 565, 89, 23);
		panel_2.add(btnSignUp);
		
		JLabel lblFirst = new JLabel("first");
		lblFirst.setBounds(893, 557, 37, 39);
		panel_2.add(lblFirst);
		
		JLabel lblWelcomeToWms = new JLabel("Welcome to WMS(Waste Management System)");
		lblWelcomeToWms.setBounds(233, 40, 723, 50);
		panel_3.add(lblWelcomeToWms);
		lblWelcomeToWms.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 45));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 102, 102));
		frame.getContentPane().add(panel_4, "t4");
		panel_4.setLayout(null);
		
		JLabel label_1 = new JLabel("User Registeration");
		label_1.setFont(new Font("Tekton Pro Cond", Font.BOLD, 40));
		label_1.setBounds(211, 39, 299, 50);
		panel_4.add(label_1);
		
		JLabel label_2 = new JLabel("First name");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(82, 135, 98, 39);
		panel_4.add(label_2);
		
		JLabel label_3 = new JLabel("Second name");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(82, 225, 122, 39);
		panel_4.add(label_3);
		
		JLabel label_4 = new JLabel("Age");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_4.setBounds(82, 301, 61, 44);
		panel_4.add(label_4);
		
		JLabel label_5 = new JLabel("Email-id");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_5.setBounds(82, 375, 200, 50);
		panel_4.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(245, 142, 202, 30);
		panel_4.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(245, 219, 202, 30);
		panel_4.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(245, 311, 202, 30);
		panel_4.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(245, 387, 202, 32);
		panel_4.add(textField_5);
		
		JLabel label_6 = new JLabel("Username");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_6.setBounds(658, 184, 98, 39);
		panel_4.add(label_6);
		
		JLabel label_7 = new JLabel("Password");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_7.setBounds(663, 268, 200, 50);
		panel_4.add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(841, 191, 200, 30);
		panel_4.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(841, 281, 200, 30);
		panel_4.add(textField_7);
		
		JButton button = new JButton("Register");
		connt=sqlite.connect();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String query4="insert into userinfo (firstname,secondname,username,password,emailid) values (?,?,?,?,?)";
					PreparedStatement b7=connt.prepareStatement(query4);
					b7.setString(1,textField_2.getText() );
					b7.setString(2,textField_3.getText() );
					b7.setString(3,textField_6.getText() );
					
					b7.setString(4,textField_7.getText() );
					
					b7.setString(5,textField_5.getText() );
					//b7.setString(6,textField_4.getText() );
					b7.execute();
					JOptionPane.showMessageDialog(null,"Data saved");

				b7.close();
			}catch(Exception e)
				{
					e.printStackTrace();
					JOptionPane.showMessageDialog(null,"Data not saved");
				}
				
			}
		});
		button.setFont(new Font("Adobe Garamond Pro Bold", Font.PLAIN, 18));
		button.setBounds(383, 542, 107, 30);
		panel_4.add(button);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Adobe Garamond Pro Bold", Font.PLAIN, 18));
		btnReset.setBounds(658, 542, 122, 32);
		panel_4.add(btnReset);
		
		JButton btnLogin_2 = new JButton("Login");
		btnLogin_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1 = (CardLayout)(frame.getContentPane().getLayout());
				c1.show(frame.getContentPane(), "t3");
			}
		});
		btnLogin_2.setFont(new Font("Adobe Garamond Pro Bold", Font.PLAIN, 18));
		btnLogin_2.setBounds(996, 542, 132, 30);
		panel_4.add(btnLogin_2);
		
		Panel panel_5 = new Panel();
		frame.getContentPane().add(panel_5, "t5");
		panel_5.setLayout(null);
		
		Panel panel_6 = new Panel();
		panel_6.setBounds(0, 0, 1362, 104);
		panel_5.add(panel_6,"t6");
		panel_6.setLayout(null);
		
		JLabel label_8 = new JLabel("Welcome to WMS(Waste Management System)");
		label_8.setForeground(new Color(102, 102, 204));
		label_8.setBounds(41, 31, 723, 50);
		label_8.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 45));
		panel_6.add(label_8);
		
		JLabel lblNewLabel_2 = new JLabel("|");
		lblNewLabel_2.setBounds(742, 11, 75, 82);
		lblNewLabel_2.setFont(new Font("SWIsot3", Font.PLAIN, 90));
		panel_6.add(lblNewLabel_2);
		
		JLabel lblHello = new JLabel("Hello");
		lblHello.setBounds(800, 55, 75, 50);
		lblHello.setFont(new Font("Tekton Pro", Font.PLAIN, 35));
		panel_6.add(lblHello);
		
		JLabel label_10 = new JLabel("|");
		label_10.setBounds(1180, 11, 75, 82);
		label_10.setFont(new Font("SWIsot3", Font.PLAIN, 90));
		panel_6.add(label_10);
		
		Button button_4 = new Button("Logout");
		button_4.setBounds(1261, 48, 91, 33);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CardLayout c3 = (CardLayout)(frame.getContentPane().getLayout());
				c3.show(frame.getContentPane(), "t3");
			}
		});
		button_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel_6.add(button_4);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(1059, 52, 132, 29);
		comboBox.addItem("Home");
		comboBox.addItem("Account");
		//comboBox.addItem("Edit profile");
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					
				String msg=(String)comboBox.getSelectedItem();
				if(msg=="Home")
				{
					CardLayout c12 = (CardLayout)(frame.getContentPane().getLayout());
					c12.show(frame.getContentPane(), "t5");
				}
				else if(msg=="Account")
				{
					CardLayout c13 = (CardLayout)(frame.getContentPane().getLayout());
					c13.show(frame.getContentPane(), "t10");				
				}
				else if(msg=="Edit profile")
				{
					CardLayout c13 = (CardLayout)(frame.getContentPane().getLayout());
					c13.show(frame.getContentPane(), "t3");
				}
				
			}
		});
		panel_6.add(comboBox);
		

		lblNewLabel_3.setFont(new Font("Tekton Pro", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(878, 63, 146, 36);
		panel_6.add(lblNewLabel_3);
		
		Panel panel_7 = new Panel();
		panel_7.setBounds(0, 102, 146, 603);
		panel_5.add(panel_7);
		panel_7.setLayout(null);
		
		Panel panel_8 = new Panel();
		panel_8.setBounds(142, 102, 1220, 603);
		panel_5.add(panel_8,"t8");
		panel_8.setLayout(new CardLayout(0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(null);
		panel_9.setBackground(new Color(0, 102, 102));
		panel_8.add(panel_9, "t9");
		panel_9.setLayout(null);
		
		Button button_1 = new Button("Report Problem");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c8 = (CardLayout)(frame.getContentPane().getLayout());
				c8.show(frame.getContentPane(), "t9");
			}
		});
		button_1.setBounds(22, 172, 98, 30);
		panel_7.add(button_1);
		
		Button button_2 = new Button("Feedback");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c11 = (CardLayout)(frame.getContentPane().getLayout());
				c11.show(frame.getContentPane(), "t11");
			}
		});
		button_2.setBounds(22, 236, 98, 30);
		panel_7.add(button_2);
		
		Button button_3 = new Button("Check status");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c11 = (CardLayout)(frame.getContentPane().getLayout());
				c11.show(frame.getContentPane(), "t19");
			}
		});
		button_3.setBounds(22, 291, 98, 30);
		panel_7.add(button_3);
		

		

		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 11, 1210, 53);
		panel_9.add(separator);
		
		JLabel lblSelectProblem = new JLabel("Select Problem");
		lblSelectProblem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSelectProblem.setBounds(46, 100, 200, 50);
		panel_9.add(lblSelectProblem);
		
		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(442, 108, 214, 33);
		comboBox_2.addItem("Sewage Treatment");
		comboBox_2.addItem("Water logging");
		comboBox_2.addItem("labour work");
		panel_9.add(comboBox_2);
		
		JLabel lblWorkersRequired = new JLabel("Worker's Required");
		lblWorkersRequired.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWorkersRequired.setBounds(46, 218, 227, 50);
		panel_9.add(lblWorkersRequired);
		
		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(442, 237, 214, 33);
		comboBox_3.addItem("1");
		comboBox_3.addItem("2");
		comboBox_3.addItem("3");
		comboBox_3.addItem("4");
		comboBox_3.addItem("5");
		final JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(945, 368, 70, 20);
		comboBox_5.addItem("1");
		comboBox_5.addItem("2");
		comboBox_5.addItem("3");
		comboBox_5.addItem("4");
		comboBox_5.addItem("5");
		comboBox_5.addItem("6");
		comboBox_5.addItem("7");
		comboBox_5.addItem("8");
		comboBox_5.addItem("9");
		comboBox_5.addItem("10");

		


		panel_9.add(comboBox_5);
		final JComboBox comboBox_8 = new JComboBox();
		
		comboBox_8.setBounds(945, 440, 70, 20);
		comboBox_8.addItem("1");
		comboBox_8.addItem("2");
		comboBox_8.addItem("3");
		comboBox_8.addItem("4");
		comboBox_8.addItem("5");
		comboBox_8.addItem("6");
		comboBox_8.addItem("7");
		comboBox_8.addItem("8");
		comboBox_8.addItem("9");
		comboBox_8.addItem("10");

		


		panel_9.add(comboBox_8);

		
		JButton btnNewButton = new JButton("Report");
		final JLabel lblNewLabel_4 = new JLabel("New label");
		//System.out.println(s1);
		

		final int size=15;
		final JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setForeground(new Color(0, 0, 102));
		final JLabel label_50 = new JLabel("");
		final JLabel label_51 = new JLabel("");
		label_51.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_51.setForeground(new Color(0, 0, 102));
		final JLabel label_52 = new JLabel("");
		label_52.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_52.setForeground(new Color(0, 0, 102));
		final JLabel label_53 = new JLabel("");
		final JLabel label_55 = new JLabel("");
		label_55.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_55.setForeground(new Color(0, 0, 102));
		final JLabel label_56 = new JLabel("");
		label_56.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_56.setForeground(new Color(0, 0, 102));
		final JLabel label_57 = new JLabel("");
		label_57.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_57.setForeground(new Color(0, 0, 102));
		final JLabel label_58 = new JLabel("");
		label_58.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_58.setForeground(new Color(0, 0, 102));
		final JLabel label_59 = new JLabel("");
		final JLabel label_60 = new JLabel("");
		label_60.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_60.setForeground(new Color(0, 0, 102));
		final JLabel label_61 = new JLabel("");
		final JLabel label_62 = new JLabel("");
		label_62.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_62.setForeground(new Color(0, 0, 102));
		final JLabel label_63 = new JLabel("");
		final JLabel label_64 = new JLabel("");
		label_64.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_64.setForeground(new Color(0, 0, 102));
		final JLabel lblNewLabel_9 = new JLabel("Problem Reported");
		final JLabel lblWorkerAlloted = new JLabel("Worker allotted");
		

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int []distance=new int[15];
				String []firstname=new String[5];
				String []emailid=new String[5];
				int []mob=new int[5];
				Arrays.fill(distance, 10001);
				String s1=(String) comboBox_5.getSelectedItem();
				String s2=(String) comboBox_8.getSelectedItem();
				final int x=Integer.parseInt(s1);

				final int y=Integer.parseInt(s2);
				System.out.println(x);
				System.out.println(y);
				int count=0;
				int worker = 0;
				try
				{
					String query="select * from workerdb where work=? and Availability=?";
					PreparedStatement b=connt.prepareStatement(query);
					b.setString(1,(String)comboBox_2.getSelectedItem() );
					b.setString(2,"Y");
				
					ResultSet ra = b.executeQuery();

					while(ra.next())
					{
						int x1=ra.getInt("location_x");
						int y1=ra.getInt("location_y");
						int index=ra.getInt("id");
						distance[index]=(((x1-x)*(x1-x))+((y1-y)*(y1-y)));
						count++;
					}
					String s5=String.valueOf(count);
					lblNewLabel_4.setText(s5);
					String s6=(String) comboBox_3.getSelectedItem();
					worker=Integer.parseInt(s6);
					for(int i=0;i<15;i++)
					{
						System.out.println(distance[i]);
					}
					ra.close();
					b.close();
			}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"some error in distance calculation");
				
				}

				if(count<worker)
				{
					JOptionPane.showMessageDialog(null,"Not enough workers available \nTry again later.");
				}
				else
				{
					connt3=sqlite.connect();
					//System.out.println("workers needed "+worker);
					int min=10001,min_index=0;
					for(int i=0;i<worker;i++)
					{
						//JOptionPane.showMessageDialog(null,"loop "+i);
						min=10001;
						min_index=0;
						for(int j=0;j<15-i;j++)
						{
							if(distance[j]<min && distance[j]<10000)
							{
								min=distance[j];
								min_index=j;
							}
						}
						distance[min_index]=10001;
						//JOptionPane.showMessageDialog(null,"try catch");
						try
						{
							String query="select * from workerdb where id=?";
							//JOptionPane.showMessageDialog(null,"query intiated");
							PreparedStatement b=connt3.prepareStatement(query);
							//JOptionPane.showMessageDialog(null,"prep stat");
							b.setInt(1, min_index);
						
							ResultSet ra = b.executeQuery();

						while(ra.next())
						{
							firstname[i]=ra.getString("firstname");
							emailid[i]=ra.getString("emailid");
							mob[i]=ra.getInt("mobile_no");
							System.out.println(firstname[i]);
						}
						//JOptionPane.showMessageDialog(null,"printed firstname");
						ra.close();
						b.close();
					}catch(Exception e)
						{
							JOptionPane.showMessageDialog(null,"Something's wrong");
						}
						
					}
					lblNewLabel_9.setForeground(new Color(0, 0, 102));
					lblWorkerAlloted.setForeground(new Color(0, 0, 102));
				}
				
				lblNewLabel_6.setText(firstname[0]);
				label_52.setText(firstname[1]);
				label_56.setText(firstname[2]);
				label_57.setText(firstname[3]);
				label_58.setText(firstname[4]);
				
				label_51.setText(emailid[0]);
				label_55.setText(emailid[1]);
				label_60.setText(emailid[2]);
				label_62.setText(emailid[3]);
				label_64.setText(emailid[4]);
				

				
				
			}
				
		});
		
		panel_9.add(comboBox_3);

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(262, 525, 123, 41);
		panel_9.add(btnNewButton);
		
		JLabel lblAdress = new JLabel("Address");
		lblAdress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAdress.setBounds(46, 349, 200, 50);
		panel_9.add(lblAdress);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(442, 342, 214, 141);
		panel_9.add(textArea);
		
		JLabel lblLocationx = new JLabel("Location_x");
		lblLocationx.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocationx.setBounds(746, 351, 227, 50);
		panel_9.add(lblLocationx);
		
		JLabel lblLocationy = new JLabel("Location_y");
		lblLocationy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocationy.setBounds(746, 423, 200, 50);
		panel_9.add(lblLocationy);
		

		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(502, 542, 154, 24);
		panel_9.add(lblNewLabel_4);
		
		JPanel panel_11 = new JPanel();
		frame.getContentPane().add(panel_11, "t11");
		panel_11.setLayout(null);
		
		Panel panel_12 = new Panel();
		panel_12.setLayout(null);
		panel_12.setBounds(0, 0, 1362, 705);
		panel_11.add(panel_12);
		
		Panel panel_13 = new Panel();
		panel_13.setBackground(new Color(0, 102, 102));
		panel_13.setLayout(null);
		panel_13.setBounds(0, 0, 1362, 104);
		panel_12.add(panel_13);
		
		JLabel label_12 = new JLabel("|");
		label_12.setFont(new Font("SWIsot3", Font.PLAIN, 90));
		label_12.setBounds(802, 11, 75, 82);
		panel_13.add(label_12);
		
		JLabel lblHello_3 = new JLabel("Hello ");
		lblHello_3.setFont(new Font("Tekton Pro", Font.PLAIN, 35));
		lblHello_3.setBounds(887, 48, 131, 50);
		panel_13.add(lblHello_3);
		
		JLabel label_14 = new JLabel("|");
		label_14.setFont(new Font("SWIsot3", Font.PLAIN, 90));
		label_14.setBounds(1180, 11, 75, 82);
		panel_13.add(label_14);
		
		Button button_5 = new Button("Logout");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c3 = (CardLayout)(frame.getContentPane().getLayout());
				c3.show(frame.getContentPane(), "t3");
			}
		});
		button_5.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_5.setBounds(1261, 48, 91, 33);
		panel_13.add(button_5);
		
		JLabel label_9 = new JLabel("Welcome to WMS(Waste Management System)");
		label_9.setForeground(new Color(102, 102, 204));
		label_9.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 45));
		label_9.setBounds(47, 25, 723, 50);
		panel_13.add(label_9);
		
		//JLabel label_20 = new JLabel("New label");
		label_20.setFont(new Font("Tekton Pro", Font.PLAIN, 30));
		label_20.setBounds(975, 56, 146, 36);
		panel_13.add(label_20);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					
				String msg=(String)comboBox.getSelectedItem();
				if(msg=="Home")
				{
					CardLayout c12 = (CardLayout)(frame.getContentPane().getLayout());
					c12.show(frame.getContentPane(), "t5");
				}
				else if(msg=="Account")
				{
					CardLayout c13 = (CardLayout)(frame.getContentPane().getLayout());
					c13.show(frame.getContentPane(), "t10");				
				}
				else if(msg=="Edit profile")
				{
					CardLayout c13 = (CardLayout)(frame.getContentPane().getLayout());
					c13.show(frame.getContentPane(), "t3");
				}
				
			}
		});
		
		Panel panel_14 = new Panel();
		panel_14.setBackground(new Color(0, 102, 102));
		panel_14.setLayout(null);
		panel_14.setBounds(0, 102, 146, 603);
		panel_12.add(panel_14);
		
		Button button_6 = new Button("Report Problem");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c10 = (CardLayout)(frame.getContentPane().getLayout());
				c10.show(frame.getContentPane(), "t5");
			}
		});
		button_6.setBounds(22, 172, 98, 30);
		panel_14.add(button_6);
		
		Button button_7 = new Button("Feedback");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_7.setBounds(22, 236, 98, 30);
		panel_14.add(button_7);
		
		Button button_8 = new Button("Check status");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c11 = (CardLayout)(frame.getContentPane().getLayout());
				c11.show(frame.getContentPane(), "t19");
			}
		});
		button_8.setBounds(22, 291, 98, 30);
		panel_14.add(button_8);
		
		Panel panel_15 = new Panel();
		panel_15.setBackground(new Color(0, 102, 102));
		panel_15.setBounds(142, 102, 1220, 603);
		panel_12.add(panel_15);
		panel_15.setLayout(null);
		
		JLabel label_15 = new JLabel("Workers feedback");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_15.setBounds(50, 111, 200, 50);
		panel_15.add(label_15);
		
		JLabel label_16 = new JLabel("Software feedback");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_16.setBounds(50, 389, 200, 50);
		panel_15.add(label_16);
		
		final JTextArea txtrHi = new JTextArea();
		txtrHi.setBounds(298, 111, 323, 144);
		panel_15.add(txtrHi);
		
		final JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(298, 389, 323, 144);
		panel_15.add(textArea_1);
		
		JLabel label_17 = new JLabel("Give rating");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_17.setBounds(912, 112, 103, 50);
		panel_15.add(label_17);
		
		final JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(1054, 130, 45, 20);
		comboBox_6.addItem("1");
		comboBox_6.addItem("2");
		comboBox_6.addItem("3");
		comboBox_6.addItem("4");
		comboBox_6.addItem("5");
		panel_15.add(comboBox_6);
		
		JLabel label_18 = new JLabel("Give rating");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_18.setBounds(912, 389, 103, 50);
		panel_15.add(label_18);
		
		final JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(1054, 408, 45, 20);
		comboBox_7.addItem("1");
		comboBox_7.addItem("2");
		comboBox_7.addItem("3");
		comboBox_7.addItem("4");
		comboBox_7.addItem("5");
		panel_15.add(comboBox_7);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 11, 1210, 53);
		panel_15.add(separator_1);
		
		JLabel lblWantToDirectly = new JLabel("want to directly");
		lblWantToDirectly.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWantToDirectly.setBounds(116, 543, 103, 50);
		panel_15.add(lblWantToDirectly);
		
		JButton btnContact = new JButton("contact");
		btnContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"mobile no 7478544666 \n Email id - patankar0123@gmail.com");
				
			}
		});
		btnContact.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnContact.setBackground(new Color(0, 102, 102));
		btnContact.setBounds(216, 557, 89, 23);
		panel_15.add(btnContact);
		
		JLabel lblManagingStaff = new JLabel("managing staff?");
		lblManagingStaff.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblManagingStaff.setBounds(319, 543, 200, 50);
		panel_15.add(lblManagingStaff);
		
		JButton btnGiveFeedback = new JButton("Give Feedback");
		connt=sqlite.connect();
		btnGiveFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String query4="insert into feedback1 (Username,Workers_rating,Workers_feedback,Software_rating,Software_feedback) values (?,?,?,?,?)";
					PreparedStatement b7=connt.prepareStatement(query4);
					b7.setString(1,textFieldUn.getText() );
					b7.setString(2,(String)comboBox_6.getSelectedItem() );
					b7.setString(3,txtrHi.getText() );
					
					b7.setString(4,(String)comboBox_7.getSelectedItem() );
					
					b7.setString(5,textArea_1.getText() );
					//b7.setString(6,textField_4.getText() );
					b7.execute();
					JOptionPane.showMessageDialog(null,"Data saved");

				b7.close();
			}catch(Exception e)
				{
					e.printStackTrace();
					JOptionPane.showMessageDialog(null,"Data not saved");
				}
			}
		});
		btnGiveFeedback.setFont(new Font("Tekton Pro", Font.PLAIN, 15));
		btnGiveFeedback.setBounds(635, 557, 131, 25);
		panel_15.add(btnGiveFeedback);
		
		JPanel panel_10 = new JPanel();
		frame.getContentPane().add(panel_10, "t10");
		panel_10.setLayout(null);
		
		Panel panel_16 = new Panel();
		panel_16.setLayout(null);
		panel_16.setBackground(new Color(0, 102, 102));
		panel_16.setBounds(0, 102, 146, 603);
		panel_10.add(panel_16);
		
		Button button_9 = new Button("Report Problem");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c10 = (CardLayout)(frame.getContentPane().getLayout());
				c10.show(frame.getContentPane(), "t5");
			}
		});
		button_9.setBounds(22, 172, 98, 30);
		panel_16.add(button_9);
		
		Button button_10 = new Button("Feedback");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c11 = (CardLayout)(frame.getContentPane().getLayout());
				c11.show(frame.getContentPane(), "t11");
			}
		});
		button_10.setBounds(22, 236, 98, 30);
		panel_16.add(button_10);
		
		Button button_11 = new Button("Check status");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c11 = (CardLayout)(frame.getContentPane().getLayout());
				c11.show(frame.getContentPane(), "t19");
			}
		});
		button_11.setBounds(22, 291, 98, 30);
		panel_16.add(button_11);
		
		Panel panel_17 = new Panel();
		panel_17.setLayout(null);
		panel_17.setBackground(new Color(0, 102, 102));
		panel_17.setBounds(0, 0, 1362, 104);
		panel_10.add(panel_17);
		
		JLabel label_19 = new JLabel("|");
		label_19.setFont(new Font("SWIsot3", Font.PLAIN, 90));
		label_19.setBounds(738, 16, 75, 82);
		panel_17.add(label_19);
		
		JLabel lblHello_1 = new JLabel("Hello ");
		lblHello_1.setFont(new Font("Tekton Pro", Font.PLAIN, 35));
		lblHello_1.setBounds(799, 55, 131, 50);
		panel_17.add(lblHello_1);
		
		JLabel label_21 = new JLabel("|");
		label_21.setFont(new Font("SWIsot3", Font.PLAIN, 90));
		label_21.setBounds(1180, 11, 75, 82);
		panel_17.add(label_21);
		
		Button button_12 = new Button("Logout");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c3 = (CardLayout)(frame.getContentPane().getLayout());
				c3.show(frame.getContentPane(), "t3");
			}
		});
		button_12.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_12.setBounds(1261, 48, 91, 33);
		panel_17.add(button_12);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(1059, 52, 132, 29);
		comboBox_1.addItem("Home");
		comboBox_1.addItem("Account");
		//comboBox_1.addItem("Edit profile");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					
				String msg1=(String)comboBox.getSelectedItem();
				if(msg1=="Home")
				{
					CardLayout c12 = (CardLayout)(frame.getContentPane().getLayout());
					c12.show(frame.getContentPane(), "t5");
				}
				else if(msg1=="Edit profile")
				{
					CardLayout c13 = (CardLayout)(frame.getContentPane().getLayout());
					c13.show(frame.getContentPane(), "t3");
				}
				
			}
		});
		panel_17.add(comboBox_1);
		
		JLabel label_11 = new JLabel("Welcome to WMS(Waste Management System)");
		label_11.setForeground(new Color(102, 102, 204));
		label_11.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 45));
		label_11.setBounds(45, 25, 723, 50);
		panel_17.add(label_11);
		
		//JLabel label_40 = new JLabel("New label");
		label_40.setFont(new Font("Tekton Pro", Font.PLAIN, 30));
		label_40.setBounds(879, 63, 146, 36);
		panel_17.add(label_40);
		
		Panel panel_18 = new Panel();
		panel_18.setLayout(null);
		panel_18.setBackground(new Color(0, 102, 102));
		panel_18.setBounds(142, 102, 1220, 603);
		panel_10.add(panel_18);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 11, 1210, 53);
		panel_18.add(separator_2);
		
		JLabel label_22 = new JLabel("First name");
		label_22.setFont(new Font("Tekton Pro Cond", Font.BOLD, 30));
		label_22.setBounds(61, 75, 165, 39);
		panel_18.add(label_22);
		
		JLabel label_23 = new JLabel("Second name");
		label_23.setFont(new Font("Tekton Pro Cond", Font.BOLD, 30));
		label_23.setBounds(61, 165, 165, 39);
		panel_18.add(label_23);
		
		JLabel label_24 = new JLabel("Age");
		label_24.setFont(new Font("Tekton Pro Cond", Font.BOLD, 30));
		label_24.setBounds(61, 350, 75, 44);
		panel_18.add(label_24);
		
		JLabel label_25 = new JLabel("Email-id");
		label_25.setFont(new Font("Tekton Pro Cond", Font.BOLD, 30));
		label_25.setBounds(61, 416, 200, 50);
		panel_18.add(label_25);
		
		JLabel label_26 = new JLabel("Username");
		label_26.setFont(new Font("Tekton Pro Cond", Font.BOLD, 30));
		label_26.setBounds(61, 248, 142, 39);
		panel_18.add(label_26);
		
		
		label_35.setFont(new Font("Tekton Pro Cond", Font.BOLD, 30));
		label_35.setBounds(315, 75, 222, 39);
		panel_18.add(label_35);
		

		label_36.setFont(new Font("Tekton Pro Cond", Font.BOLD, 30));
		label_36.setBounds(315, 165, 207, 39);
		panel_18.add(label_36);
		

		label_37.setFont(new Font("Tekton Pro Cond", Font.BOLD, 30));
		label_37.setBounds(315, 248, 184, 39);
		panel_18.add(label_37);
		

		label_38.setFont(new Font("Tekton Pro Cond", Font.BOLD, 30));
		label_38.setBounds(315, 350, 149, 44);
		panel_18.add(label_38);
		

		label_39.setFont(new Font("Tekton Pro Cond", Font.BOLD, 30));
		label_39.setBounds(315, 416, 309, 50);
		panel_18.add(label_39);
		
		JPanel panel_19 = new JPanel();
		frame.getContentPane().add(panel_19, "t19");
		panel_19.setLayout(null);
		
		Panel panel_20 = new Panel();
		panel_20.setLayout(null);
		panel_20.setBackground(new Color(0, 102, 102));
		panel_20.setBounds(0, 102, 146, 603);
		panel_19.add(panel_20);
		
		Button button_13 = new Button("Report Problem");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c10 = (CardLayout)(frame.getContentPane().getLayout());
				c10.show(frame.getContentPane(), "t5");
			}
		});
		button_13.setBounds(22, 172, 98, 30);
		panel_20.add(button_13);
		
		Button button_14 = new Button("Feedback");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c11 = (CardLayout)(frame.getContentPane().getLayout());
				c11.show(frame.getContentPane(), "t11");
			}
		});
		button_14.setBounds(22, 236, 98, 30);
		panel_20.add(button_14);
		
		Button button_15 = new Button("Check status");
		button_15.setBounds(22, 291, 98, 30);
		panel_20.add(button_15);
		
		Panel panel_21 = new Panel();
		panel_21.setLayout(null);
		panel_21.setBackground(new Color(0, 102, 102));
		panel_21.setBounds(0, 0, 1362, 104);
		panel_19.add(panel_21);
		
		JLabel label_27 = new JLabel("Welcome to WMS(Waste Management System)");
		label_27.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 45));
		label_27.setForeground(new Color(102, 102, 204));
		label_27.setBounds(41, 31, 723, 50);
		panel_21.add(label_27);
		
		JLabel label_28 = new JLabel("|");
		label_28.setFont(new Font("SWIsot3", Font.PLAIN, 90));
		label_28.setBounds(802, 11, 75, 82);
		panel_21.add(label_28);
		
		JLabel lblHello_2 = new JLabel("Hello ");
		lblHello_2.setFont(new Font("Tekton Pro", Font.PLAIN, 35));
		lblHello_2.setBounds(887, 48, 131, 50);
		panel_21.add(lblHello_2);
		
		JLabel label_30 = new JLabel("|");
		label_30.setFont(new Font("SWIsot3", Font.PLAIN, 90));
		label_30.setBounds(1180, 11, 75, 82);
		panel_21.add(label_30);
		
		Button button_16 = new Button("Logout");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c3 = (CardLayout)(frame.getContentPane().getLayout());
				c3.show(frame.getContentPane(), "t3");
			}
		});
		button_16.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_16.setBounds(1261, 48, 91, 33);
		panel_21.add(button_16);
		

		label_41.setFont(new Font("Tekton Pro", Font.PLAIN, 30));
		label_41.setBounds(974, 56, 146, 36);
		panel_21.add(label_41);
		
		Panel panel_22 = new Panel();
		panel_22.setLayout(null);
		panel_22.setBackground(new Color(0, 102, 102));
		panel_22.setBounds(132, 92, 1220, 603);
		panel_19.add(panel_22);
		
		JLabel lblWorkAllotment = new JLabel("Work Allotment");
		lblWorkAllotment.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWorkAllotment.setBounds(62, 355, 200, 50);
		panel_22.add(lblWorkAllotment);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 11, 1210, 53);
		panel_22.add(separator_3);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStatus.setBounds(62, 107, 200, 50);
		panel_22.add(lblStatus);
		
		JLabel lblWorkersName = new JLabel("worker's name");
		lblWorkersName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWorkersName.setBounds(341, 355, 181, 14);
		panel_22.add(lblWorkersName);
		
		JLabel lblNewLabel_5 = new JLabel("Emailid");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(708, 355, 70, 14);
		panel_22.add(lblNewLabel_5);
		

		lblNewLabel_6.setBounds(341, 404, 658, 23);
		panel_22.add(lblNewLabel_6);
		

		label_50.setBounds(530, 404, 95, 23);
		panel_22.add(label_50);
		

		label_51.setBounds(710, 404, 289, 23);
		panel_22.add(label_51);
		

		label_52.setBounds(341, 449, 658, 23);
		panel_22.add(label_52);
		

		label_53.setBounds(530, 449, 95, 23);
		panel_22.add(label_53);
		

		label_55.setBounds(710, 453, 289, 23);
		panel_22.add(label_55);
		

		label_56.setBounds(341, 491, 658, 23);
		panel_22.add(label_56);
		

		label_57.setBounds(341, 525, 658, 23);
		panel_22.add(label_57);
		
		
		label_58.setBounds(341, 569, 658, 23);
		panel_22.add(label_58);
		

		label_59.setBounds(531, 491, 95, 23);
		panel_22.add(label_59);
		

		label_60.setBounds(710, 487, 289, 23);
		panel_22.add(label_60);
		

		label_61.setBounds(530, 525, 95, 23);
		panel_22.add(label_61);
		

		label_62.setBounds(708, 525, 291, 23);
		panel_22.add(label_62);
		

		label_63.setBounds(530, 569, 95, 23);
		panel_22.add(label_63);
		

		label_64.setBounds(708, 569, 291, 23);
		panel_22.add(label_64);
		

		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(304, 107, 158, 36);
		panel_22.add(lblNewLabel_9);
		
	
		lblWorkerAlloted.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWorkerAlloted.setBounds(537, 107, 131, 36);
		panel_22.add(lblWorkerAlloted);
		
		JLabel lblJobDone = new JLabel("Job done");
		lblJobDone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblJobDone.setBounds(743, 107, 95, 36);
		panel_22.add(lblJobDone);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(448, 125, 88, 36);
		panel_22.add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(657, 125, 88, 36);
		panel_22.add(separator_8);
		
		JPanel panel_23 = new JPanel();
		frame.getContentPane().add(panel_23, "t23");
		panel_23.setLayout(null);
		
		Panel panel_24 = new Panel();
		panel_24.setLayout(null);
		panel_24.setBackground(new Color(139, 0, 139));
		panel_24.setBounds(0, 0, 1362, 104);
		panel_23.add(panel_24);
		
		JLabel label_31 = new JLabel("Welcome to WMS(Waste Management System)");
		label_31.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 45));
		label_31.setBounds(41, 31, 723, 50);
		panel_24.add(label_31);
		
		JLabel label_32 = new JLabel("|");
		label_32.setFont(new Font("SWIsot3", Font.PLAIN, 90));
		label_32.setBounds(802, 11, 75, 82);
		panel_24.add(label_32);
		
		JLabel lblHello_4 = new JLabel("Hello ");
		lblHello_4.setFont(new Font("Tekton Pro", Font.PLAIN, 35));
		lblHello_4.setBounds(887, 48, 131, 50);
		panel_24.add(lblHello_4);
		
		JLabel label_34 = new JLabel("|");
		label_34.setFont(new Font("SWIsot3", Font.PLAIN, 90));
		label_34.setBounds(1180, 11, 75, 82);
		panel_24.add(label_34);
		
		Button button_17 = new Button("Logout");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c3 = (CardLayout)(frame.getContentPane().getLayout());
				c3.show(frame.getContentPane(), "t3");
			}
		});
		button_17.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_17.setBounds(1261, 48, 91, 33);
		panel_24.add(button_17);
		
		Panel panel_25 = new Panel();
		panel_25.setLayout(null);
		panel_25.setBackground(new Color(139, 0, 139));
		panel_25.setBounds(0, 102, 146, 603);
		panel_23.add(panel_25);
		
		Button button_18 = new Button("Check feedback");
		connt=sqlite.connect();
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String query="select * from feedback1";
					PreparedStatement b=connt.prepareStatement(query);
					ResultSet ra = b.executeQuery();
				   
				  table.setModel(DbUtils.resultSetToTableModel(ra));
				   
			}catch(Exception e)
				{
				JOptionPane.showMessageDialog(null,e);
				
				}
			}
		});
		button_18.setBounds(10, 158, 114, 30);
		panel_25.add(button_18);
		
		Button button_19 = new Button("Add/Remove worker");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c8 = (CardLayout)(frame.getContentPane().getLayout());
				c8.show(frame.getContentPane(), "t27");
			}
		});
		button_19.setBounds(10, 226, 114, 30);
		panel_25.add(button_19);
		
		Panel panel_26 = new Panel();
		panel_26.setLayout(null);
		panel_26.setBackground(new Color(218, 112, 214));
		panel_26.setBounds(142, 102, 1220, 603);
		panel_23.add(panel_26);
		
		table = new JTable();
		table.setForeground(new Color(255, 255, 255));
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setBackground(new Color(139, 0, 139));
		table.setBounds(142, 105, 604, 75);
		panel_26.add(table);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(new Color(255, 51, 0));
		separator_4.setBounds(10, 11, 1210, 53);
		panel_26.add(separator_4);
		
		JLabel lblNewLabel_7 = new JLabel("Username");
		lblNewLabel_7.setBounds(149, 79, 77, 21);
		panel_26.add(lblNewLabel_7);
		
		JLabel lblWorkersRating = new JLabel("Workers rating");
		lblWorkersRating.setBounds(276, 75, 108, 29);
		panel_26.add(lblWorkersRating);
		
		JLabel lblWorkerFeedback = new JLabel("Worker feedback");
		lblWorkerFeedback.setBounds(399, 75, 113, 29);
		panel_26.add(lblWorkerFeedback);
		
		JLabel lblSoftwareRating = new JLabel("Software rating");
		lblSoftwareRating.setBounds(515, 75, 113, 29);
		panel_26.add(lblSoftwareRating);
		
		JLabel lblSoftwareFeedback = new JLabel("Software feedback");
		lblSoftwareFeedback.setBounds(633, 75, 113, 29);
		panel_26.add(lblSoftwareFeedback);
		
		JPanel panel_27 = new JPanel();
		frame.getContentPane().add(panel_27, "t27");
		panel_27.setLayout(null);
		
		Panel panel_29 = new Panel();
		panel_29.setLayout(null);
		panel_29.setBackground(new Color(139, 0, 139));
		panel_29.setBounds(0, 102, 146, 603);
		panel_27.add(panel_29);
		
		Button button_21 = new Button("Check feedback");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c8 = (CardLayout)(frame.getContentPane().getLayout());
				c8.show(frame.getContentPane(), "t23");
			}
		});
		button_21.setBounds(10, 158, 114, 30);
		panel_29.add(button_21);
		
		Button button_22 = new Button("Add/Remove worker");
		button_22.setBounds(10, 226, 114, 30);
		panel_29.add(button_22);
		
		Button button_23 = new Button("Payement status");
		button_23.setBounds(10, 291, 114, 30);
		panel_29.add(button_23);
		
		Panel panel_30 = new Panel();
		panel_30.setLayout(null);
		panel_30.setBackground(new Color(139, 0, 139));
		panel_30.setBounds(0, 0, 1362, 104);
		panel_27.add(panel_30);
		
		JLabel label_13 = new JLabel("Welcome to WMS(Waste Management System)");
		label_13.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 45));
		label_13.setBounds(41, 31, 723, 50);
		panel_30.add(label_13);
		
		JLabel label_29 = new JLabel("|");
		label_29.setFont(new Font("SWIsot3", Font.PLAIN, 90));
		label_29.setBounds(802, 11, 75, 82);
		panel_30.add(label_29);
		
		JLabel label_33 = new JLabel("Hello ");
		label_33.setFont(new Font("Tekton Pro", Font.PLAIN, 35));
		label_33.setBounds(887, 48, 131, 50);
		panel_30.add(label_33);
		
		JLabel label_42 = new JLabel("|");
		label_42.setFont(new Font("SWIsot3", Font.PLAIN, 90));
		label_42.setBounds(1180, 11, 75, 82);
		panel_30.add(label_42);
		
		Button button_24 = new Button("Logout");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c3 = (CardLayout)(frame.getContentPane().getLayout());
				c3.show(frame.getContentPane(), "t3");
			}
		});
		button_24.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_24.setBounds(1261, 48, 91, 33);
		panel_30.add(button_24);
		
		Panel panel_31 = new Panel();
		panel_31.setLayout(null);
		panel_31.setBackground(new Color(218, 112, 214));
		panel_31.setBounds(142, 102, 1220, 603);
		panel_27.add(panel_31);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBackground(new Color(255, 51, 0));
		separator_5.setBounds(10, 11, 1210, 30);
		panel_31.add(separator_5);
		
		JLabel label_47 = new JLabel("First name");
		label_47.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_47.setBounds(69, 56, 98, 39);
		panel_31.add(label_47);
		
		final JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(304, 184, 202, 30);
		comboBox_4.addItem("Sewage Treatment");
		comboBox_4.addItem("Water logging");
		comboBox_4.addItem("labour work");
		
		panel_31.add(comboBox_4);
		
		JLabel label_48 = new JLabel("Second name");
		label_48.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_48.setBounds(67, 116, 122, 39);
		panel_31.add(label_48);
		
		JLabel label_49 = new JLabel("Age");
		label_49.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_49.setBounds(69, 246, 61, 44);
		panel_31.add(label_49);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(304, 65, 202, 30);
		panel_31.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(304, 123, 202, 30);
		panel_31.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(304, 256, 202, 30);
		panel_31.add(textField_10);
		
		JLabel lblModeOfTransportation = new JLabel("Mode of Transportation");
		lblModeOfTransportation.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblModeOfTransportation.setBounds(69, 397, 225, 39);
		panel_31.add(lblModeOfTransportation);
		
		JLabel lblMobileNo = new JLabel("Mobile no.");
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMobileNo.setBounds(69, 465, 154, 44);
		panel_31.add(lblMobileNo);
		
		JLabel label_54 = new JLabel("Email-id");
		label_54.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_54.setBounds(69, 315, 200, 50);
		panel_31.add(label_54);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(304, 404, 202, 30);
		panel_31.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(304, 475, 202, 30);
		panel_31.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(304, 327, 202, 32);
		panel_31.add(textField_15);
		
		JButton btnNewButton_1 = new JButton("Add Worker");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String query4="insert into workerdb (firstname,lastname,age,work,mode_of_transportation,mobile_no,emailid) values (?,?,?,?,?,?,?)";
					PreparedStatement b7=connt.prepareStatement(query4);
					b7.setString(1,textField_8.getText() );
					b7.setString(2,textField_9.getText() );
					b7.setString(3,textField_10.getText() );
					
					b7.setString(4,(String)comboBox_4.getSelectedItem() );
					
					b7.setString(5,textField_13.getText() );
					b7.setString(6,textField_14.getText() );
					b7.setString(7,textField_15.getText() );
					//b7.setString(6,textField_4.getText() );
					b7.execute();
					JOptionPane.showMessageDialog(null,"Data saved");

				b7.close();
			}catch(Exception e)
				{
					e.printStackTrace();
					JOptionPane.showMessageDialog(null,"Data not saved");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(180, 545, 145, 39);
		panel_31.add(btnNewButton_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"firstname", "lastname", "age", "work", "vehicle", "mobile no"
			}
		));
		table_1.setForeground(new Color(0, 0, 0));
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table_1.setBackground(new Color(139, 0, 139));
		table_1.setBounds(534, 75, 676, 415);
		panel_31.add(table_1);
		
		JLabel lblWork = new JLabel("Work");
		lblWork.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWork.setBounds(69, 179, 61, 44);
		panel_31.add(lblWork);
		
		JLabel lblNewLabel_8 = new JLabel("First name");
		lblNewLabel_8.setBounds(534, 52, 61, 23);
		panel_31.add(lblNewLabel_8);
		
		JLabel lblLastName = new JLabel("last name");
		lblLastName.setBounds(601, 52, 61, 23);
		panel_31.add(lblLastName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(667, 52, 61, 23);
		panel_31.add(lblAge);
		
		JLabel lblWork_1 = new JLabel("Work");
		lblWork_1.setBounds(724, 52, 61, 23);
		panel_31.add(lblWork_1);
		
		JLabel lblVehicle = new JLabel("Vehicle");
		lblVehicle.setBounds(775, 52, 61, 23);
		panel_31.add(lblVehicle);
		
		JLabel lblMobileno = new JLabel("mobileno.");
		lblMobileno.setBounds(838, 52, 61, 23);
		panel_31.add(lblMobileno);
		
		JLabel lblEmailid = new JLabel("emailid");
		lblEmailid.setBounds(909, 52, 61, 23);
		panel_31.add(lblEmailid);
		
		JLabel lblAvailability = new JLabel("Availability");
		lblAvailability.setBounds(967, 52, 61, 23);
		panel_31.add(lblAvailability);
		
		JLabel lblLocationx_1 = new JLabel("loc_x");
		lblLocationx_1.setBounds(1038, 52, 61, 23);
		panel_31.add(lblLocationx_1);
		
		JLabel lblY = new JLabel("loc_y");
		lblY.setBounds(1086, 52, 61, 23);
		panel_31.add(lblY);
		
		JLabel lblId = new JLabel("id");
		lblId.setBounds(1149, 52, 61, 23);
		panel_31.add(lblId);
		
		JPanel panel_28 = new JPanel();
		frame.getContentPane().add(panel_28, "t28");
		panel_28.setLayout(null);
		
		Panel panel_32 = new Panel();
		panel_32.setLayout(null);
		panel_32.setBackground(new Color(139, 0, 139));
		panel_32.setBounds(0, 102, 146, 603);
		panel_28.add(panel_32);
		
		Button button_25 = new Button("Check feedback");
		button_25.setBounds(10, 158, 114, 30);
		panel_32.add(button_25);
		
		Button button_26 = new Button("Add/Remove worker");
		button_26.setBounds(10, 226, 114, 30);
		panel_32.add(button_26);
		
		Button button_27 = new Button("Payement status");
		button_27.setBounds(10, 291, 114, 30);
		panel_32.add(button_27);
		
		Panel panel_33 = new Panel();
		panel_33.setLayout(null);
		panel_33.setBackground(new Color(139, 0, 139));
		panel_33.setBounds(0, 0, 1362, 104);
		panel_28.add(panel_33);
		
		JLabel label_43 = new JLabel("Welcome to WMS(Waste Management System)");
		label_43.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 45));
		label_43.setBounds(41, 31, 723, 50);
		panel_33.add(label_43);
		
		JLabel label_44 = new JLabel("|");
		label_44.setFont(new Font("SWIsot3", Font.PLAIN, 90));
		label_44.setBounds(802, 11, 75, 82);
		panel_33.add(label_44);
		
		JLabel label_45 = new JLabel("Hello ");
		label_45.setFont(new Font("Tekton Pro", Font.PLAIN, 35));
		label_45.setBounds(887, 48, 131, 50);
		panel_33.add(label_45);
		
		JLabel label_46 = new JLabel("|");
		label_46.setFont(new Font("SWIsot3", Font.PLAIN, 90));
		label_46.setBounds(1180, 11, 75, 82);
		panel_33.add(label_46);
		
		Button button_28 = new Button("Logout");
		button_28.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_28.setBounds(1261, 48, 91, 33);
		panel_33.add(button_28);
		
		Panel panel_34 = new Panel();
		panel_34.setLayout(null);
		panel_34.setBackground(new Color(218, 112, 214));
		panel_34.setBounds(142, 102, 1220, 603);
		panel_28.add(panel_34);
		
		table_2 = new JTable();
		table_2.setForeground(Color.WHITE);
		table_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table_2.setBackground(new Color(139, 0, 139));
		table_2.setBounds(142, 105, 604, 75);
		panel_34.add(table_2);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBackground(new Color(255, 51, 0));
		separator_6.setBounds(10, 11, 1210, 53);
		panel_34.add(separator_6);

		

		btnLogin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String query1="select * from admininfo where Adminid=? and password=?";
					PreparedStatement b1=connt2.prepareStatement(query1);
					b1.setString(1,textField.getText() );
					b1.setString(2,textField_1.getText() );
					ResultSet ra1 = b1.executeQuery();
				int count=0;
				while(ra1.next())
				{
					count++;
				}
				if(count==1)
				{
					JOptionPane.showMessageDialog(null,"Admin Id and password are correct");
					CardLayout c = (CardLayout)(frame.getContentPane().getLayout());
					c.show(frame.getContentPane(), "t23");
					
				}
				else if(count>1)
				{
					JOptionPane.showMessageDialog(null,"duplicate user name and password is correct");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Admin Id or password is incorrect.\nTry Again!");
				}
				ra1.close();
				b1.close();
			}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e);
				}
				
				try
				{
					String query="select * from feedback1";
					PreparedStatement b=connt.prepareStatement(query);
					ResultSet ra = b.executeQuery();
				   
				  table.setModel(DbUtils.resultSetToTableModel(ra));
				   
			}catch(Exception e)
				{
				JOptionPane.showMessageDialog(null,e);
				
				}
				try
				{
					String query="select * from workerdb";
					PreparedStatement b=connt.prepareStatement(query);
					ResultSet ra = b.executeQuery();
				   
					table_1.setModel(DbUtils.resultSetToTableModel(ra));
				   
			}catch(Exception e)
				{
				JOptionPane.showMessageDialog(null,e);
				
				}
				
			}
		});
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
