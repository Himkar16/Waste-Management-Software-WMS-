package soft;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Soft {

	private JFrame frame1;
	private JTextField txtSoThisIs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Soft window = new Soft();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Soft() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.setBackground(SystemColor.inactiveCaption);
		frame1.setBounds(100, 100, 450, 300);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("Cancel");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame1.dispose();
			}
		});
		button1.setBackground(SystemColor.activeCaption);
		button1.setBounds(162, 110, 89, 23);
		frame1.getContentPane().add(button1);
		
		txtSoThisIs = new JTextField();
		txtSoThisIs.setText("so this is welcome screen");
		txtSoThisIs.setBounds(113, 36, 214, 63);
		frame1.getContentPane().add(txtSoThisIs);
		txtSoThisIs.setColumns(10);
	}
}
