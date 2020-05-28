import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;

public class Frame2 {

	private JFrame frame;
	private JTextField txtTheRules;
	private JTextField txtAreYouInvited;
	private JTextField txtY;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 window = new Frame2();
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
	public Frame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtTheRules = new JTextField();
		txtTheRules.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		txtTheRules.setText("    How To Play!");
		txtTheRules.setBounds(175, 19, 130, 26);
		frame.getContentPane().add(txtTheRules);
		txtTheRules.setColumns(10);
		
		txtAreYouInvited = new JTextField();
		txtAreYouInvited.setText("What's good y'all my name is Gabby ");
		txtAreYouInvited.setBounds(91, 58, 244, 33);
		frame.getContentPane().add(txtAreYouInvited);
		txtAreYouInvited.setColumns(10);
		
		JButton btnNewButton = new JButton(" Start the game!!");
		btnNewButton.setBounds(159, 221, 145, 26);
		frame.getContentPane().add(btnNewButton);
		
		txtY = new JTextField();
		txtY.setText("Y'");
		txtY.setBounds(159, 103, 130, 26);
		frame.getContentPane().add(txtY);
		txtY.setColumns(10);
	}
}
