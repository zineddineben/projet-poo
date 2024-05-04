import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
//import java.awt.Frame;

//import javax.swing.DropMode;
import javax.swing.SwingConstants;
//import java.awt.FlowLayout;
//import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
//import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//final boss test


public class app {
	
	

	JFrame frame;
	
	private JTextField username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					app window = new app();
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
	public app() {	
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int window_height=1000;
		int window_width=600;
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(173, 173, 230));
		frame.setTitle("Omar immobilier");
		frame.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		frame.setBounds(200, 100,window_height , window_width );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel blackback = new JPanel();
		blackback.setBounds(0, 0, 984, 561);
		blackback.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		blackback.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(blackback);
		blackback.setLayout(null);
		
		JPanel halfwhite = new JPanel();
		halfwhite.setBackground(new Color(199, 208, 231));
		halfwhite.setBounds(370, 11, 604, 539);
		blackback.add(halfwhite);
		halfwhite.setLayout(null);
		
		username = new JTextField();
		username.setBounds(224, 180, 262, 37);
		halfwhite.add(username);
		username.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(224, 248, 262, 37);
		halfwhite.add(passwordField);
		
		JLabel enteruser = new JLabel("User name");
		enteruser.setHorizontalAlignment(SwingConstants.CENTER);
		enteruser.setForeground(new Color(80, 88, 108));
		enteruser.setFont(new Font("Impact", Font.PLAIN, 24));
		enteruser.setBounds(67, 185, 131, 26);
		halfwhite.add(enteruser);
		
		JLabel enterpass = new JLabel("password");
		enterpass.setHorizontalAlignment(SwingConstants.CENTER);
		enterpass.setFont(new Font("Impact", Font.PLAIN, 24));
		enterpass.setForeground(new Color(80, 88, 108));
		enterpass.setBounds(67, 248, 131, 26);
		halfwhite.add(enterpass);
		
		JLabel signintxt = new JLabel("dont have an account ? ");
		signintxt.setFont(new Font("Impact", Font.PLAIN, 15));
		signintxt.setForeground(new Color(80, 88, 108));
		signintxt.setBounds(234, 350, 153, 23);
		halfwhite.add(signintxt);
		
		// dont have an accont sign in shit 
		JButton signinbot = new JButton("sign in");
		signinbot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				signinpage signin = new signinpage();				
                signin.signinframe.setVisible(true);
				
					 
			}
		});
		signinbot.setHorizontalAlignment(SwingConstants.LEFT);
		signinbot.setFont(new Font("Impact", Font.PLAIN, 15));
		signinbot.setBackground(new Color(199, 208, 231));
		signinbot.setForeground(new Color(80, 88, 108));
		signinbot.setBounds(387, 350, 43, 23);
		halfwhite.add(signinbot);
		signinbot.setBorder(null);
		signinbot.setFocusable(false);
		
		JLabel logintitle = new JLabel("Login");
		logintitle.setForeground(new Color(80, 88, 108));
		logintitle.setFont(new Font("Ink Free", Font.BOLD, 64));
		logintitle.setHorizontalAlignment(SwingConstants.CENTER);
		logintitle.setBounds(141, 72, 404, 97);
		halfwhite.add(logintitle);
		
		
		
		JButton loginsucbot = new JButton("login");
		loginsucbot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// ida makach error yroh llmenu 
				frame.dispose();
				menu  menu = new menu();				
                menu.frame.setVisible(true);
				
			}
		});
		loginsucbot.setForeground(new Color(199, 208, 231));
		loginsucbot.setBackground(new Color(80, 88, 108));
		loginsucbot.setFont(new Font("Impact", Font.PLAIN, 20));
		loginsucbot.setBounds(224, 310, 262, 37);
		halfwhite.add(loginsucbot);
		loginsucbot.setBorder(null);
		loginsucbot.setFocusable(false);
		
		JPanel halfcolor = new JPanel();
		halfcolor.setBackground(new Color(80, 88, 108));
		halfcolor.setBounds(10, 11, 364, 539);
		blackback.add(halfcolor);
		halfcolor.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Omar Immobilier");
		lblNewLabel.setBounds(0, 85, 363, 120);
		halfcolor.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(173, 173, 230));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Ink Free", Font.BOLD, 40));
		
		
	}
}
