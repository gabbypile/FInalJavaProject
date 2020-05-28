import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Image;
import javax.swing.ImageIcon;
public class Frame1 {

	private JFrame frame;
	private JTextField txtAreYouInvited;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(78, 22, 250, 41);
		frame.getContentPane().add(lblNewLabel);
		
		txtAreYouInvited = new JTextField();
		txtAreYouInvited.setFont(new Font("Noteworthy", Font.PLAIN, 16));
		txtAreYouInvited.setText("Are you Invited to the cookout?");
		txtAreYouInvited.setBounds(100, 22, 215, 34);
		frame.getContentPane().add(txtAreYouInvited);
		txtAreYouInvited.setColumns(10);
		
		JButton btnNewButton = new JButton("Play!!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Frame2 nw = new Frame2();
				nw.NewScreen();
			}
		});
		
		btnNewButton.setBounds(143, 207, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(179, 82, 159, 113);
		frame.getContentPane().add(lblNewLabel_1);
		Image image = new ImageIcon(this.getClass().getResource("bbq.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(image));


		
	}
}
