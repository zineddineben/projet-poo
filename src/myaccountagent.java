import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class myaccountagent {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myaccountagent window = new myaccountagent();
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
	public myaccountagent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int window_height=1000;
		int window_width=600;
		frame = new JFrame();
		frame.setBounds(100, 100, window_height, window_width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Koldex immobilier");
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 984, 561);
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 964, 539);
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(199, 208, 231));
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(80, 88, 108));
		panel_2.setBounds(0, 0, 964, 102);
		panel_1.add(panel_2);
		
		JLabel lblMyAccount = new JLabel("My account");
		lblMyAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyAccount.setForeground(new Color(199, 208, 231));
		lblMyAccount.setFont(new Font("Uni Sans Heavy CAPS", Font.BOLD, 66));
		lblMyAccount.setBackground(new Color(50, 72, 81));
		lblMyAccount.setBounds(0, 0, 964, 121);
		panel_2.add(lblMyAccount);
		
		JButton backmenu = new JButton("");
		backmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Agent_menu main = new Agent_menu(); 
				main.frame.setVisible(true);
			}
		});
		backmenu.setBackground(new Color(199, 208, 231));
		backmenu.setBounds(10, 113, 54, 34);
		panel_1.add(backmenu);
		ImageIcon back = new ImageIcon("backmenu.png");
		backmenu.setIcon(back);
		backmenu.setHorizontalTextPosition(JButton.CENTER);
		backmenu.setVerticalTextPosition(JButton.BOTTOM);
		backmenu.setFocusable(false);
		backmenu.setBorder(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFirstName.setForeground(new Color(80, 88, 108));
		lblFirstName.setFont(new Font("Impact", Font.PLAIN, 24));
		lblFirstName.setBounds(340, 141, 131, 26);
		panel_1.add(lblFirstName);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setForeground(new Color(80, 88, 108));
		lblNewLabel_1.setFont(new Font("Impact", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(340, 191, 131, 26);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPassword.setForeground(new Color(80, 88, 108));
		lblPassword.setFont(new Font("Impact", Font.PLAIN, 24));
		lblPassword.setBounds(340, 291, 131, 26);
		panel_1.add(lblPassword);
		
		JLabel lblNewLabel_3 = new JLabel("Phone number :");
		lblNewLabel_3.setForeground(new Color(80, 88, 108));
		lblNewLabel_3.setFont(new Font("Impact", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(327, 341, 144, 26);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email :");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_4.setForeground(new Color(80, 88, 108));
		lblNewLabel_4.setFont(new Font("Impact", Font.PLAIN, 24));
		lblNewLabel_4.setBounds(340, 391, 131, 26);
		panel_1.add(lblNewLabel_4);
		
		JTextPane editfirst = new JTextPane();
		editfirst.setText("Ouraou");
		editfirst.setFont(new Font("Impact", Font.PLAIN, 16));
		editfirst.setBounds(484, 143, 204, 26);
		panel_1.add(editfirst);
		
		JTextPane editlast = new JTextPane();
		editlast.setText("Abdelillah");
		editlast.setFont(new Font("Impact", Font.PLAIN, 16));
		editlast.setBounds(484, 193, 204, 26);
		panel_1.add(editlast);
		
		JTextPane txtpnQeqeweqwe_2 = new JTextPane();
		txtpnQeqeweqwe_2.setText("abdou");
		txtpnQeqeweqwe_2.setForeground(new Color(126, 126, 126));
		txtpnQeqeweqwe_2.setFont(new Font("Impact", Font.PLAIN, 16));
		txtpnQeqeweqwe_2.setEditable(false);
		txtpnQeqeweqwe_2.setBounds(484, 243, 204, 26);
		panel_1.add(txtpnQeqeweqwe_2);
		
		JTextPane editphone = new JTextPane();
		editphone.setText("0559249914");
		editphone.setFont(new Font("Impact", Font.PLAIN, 16));
		editphone.setBounds(484, 343, 204, 26);
		panel_1.add(editphone);
		
		JTextPane editmail = new JTextPane();
		editmail.setText("Ouraou.Abdelillah@gmail.com");
		editmail.setFont(new Font("Impact", Font.PLAIN, 16));
		editmail.setBounds(484, 393, 204, 26);
		panel_1.add(editmail);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setForeground(new Color(80, 88, 108));
		lblNewLabel_2.setFont(new Font("Impact", Font.PLAIN, 24));
		lblNewLabel_2.setBackground(new Color(80, 88, 108));
		lblNewLabel_2.setBounds(340, 241, 131, 26);
		panel_1.add(lblNewLabel_2);
		
		JTextPane editpass = new JTextPane();
		editpass.setForeground(new Color(126, 126, 126));
		editpass.setEditable(false);
		editpass.setText("2005");
		editpass.setFont(new Font("Impact", Font.PLAIN, 16));
		editpass.setBounds(484, 293, 204, 26);
		panel_1.add(editpass);
		
		JButton save = new JButton("Save changes");
		save.setForeground(new Color(199, 208, 231));
		save.setFont(new Font("Impact", Font.PLAIN, 24));
		save.setFocusable(false);
		save.setBorder(null);
		save.setBackground(new Color(80, 88, 108));
		save.setBounds(484, 440, 151, 50);
		panel_1.add(save);
		
		JButton reset = new JButton("Reset");
		reset.setForeground(new Color(199, 208, 231));
		reset.setFont(new Font("Impact", Font.PLAIN, 24));
		reset.setFocusable(false);
		reset.setBorder(null);
		reset.setBackground(new Color(80, 88, 108));
		reset.setBounds(320, 440, 151, 50);
		panel_1.add(reset);
		
		ImageIcon logo = new ImageIcon("KOLDEXCHIKOUR.png");
		frame.setIconImage(logo.getImage());
	}

}
