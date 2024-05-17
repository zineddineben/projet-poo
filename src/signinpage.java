import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
//import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import GestionClients.Client;


public class signinpage {
	
	private Connection connection;
	private Statement statement;
	JFrame signinframe;
	private JTextField firstname;
	private JPasswordField passwordField;
	private JTextField lastname;
	private JTextField username;
	private JTextField numf;
	private JTextField emailf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					signinpage window = new signinpage();
					window.signinframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public signinpage() {
		
		
		
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	 void initialize() {
		int window_height=1000;
		int window_width=600;
		signinframe = new JFrame();
		signinframe.setResizable(false);
		signinframe.getContentPane().setFont(new Font("Impact", Font.PLAIN, 24));
		signinframe.setBounds(100, 100, window_height, window_width);
		signinframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signinframe.getContentPane().setLayout(null);
		signinframe.setTitle("Koldex immobilier");
		JPanel blackback = new JPanel();
		blackback.setLayout(null);
		blackback.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		blackback.setBackground(Color.BLACK);
		blackback.setBounds(0, 0, 984, 561);
		signinframe.getContentPane().add(blackback);
		
		JPanel halfwhite = new JPanel();
		halfwhite.setLayout(null);
		halfwhite.setBackground(new Color(199, 208, 231));
		halfwhite.setBounds(370, 11, 604, 539);
		blackback.add(halfwhite);
		
		firstname = new JTextField();
		firstname.setColumns(10);
		firstname.setBounds(224, 131, 262, 37);
		halfwhite.add(firstname);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(224, 296, 262, 37);
		halfwhite.add(passwordField);
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName.setForeground(new Color(80, 88, 108));
		lblFirstName.setFont(new Font("Impact", Font.PLAIN, 24));
		lblFirstName.setBounds(83, 135, 131, 26);
		halfwhite.add(lblFirstName);
		
		JLabel enterpass = new JLabel("Password");
		enterpass.setHorizontalAlignment(SwingConstants.CENTER);
		enterpass.setForeground(new Color(80, 88, 108));
		enterpass.setFont(new Font("Impact", Font.PLAIN, 24));
		enterpass.setBounds(83, 300, 131, 26);
		halfwhite.add(enterpass);
		
		JLabel lblAllreadyHaveAn = new JLabel("already have an account ?");
		lblAllreadyHaveAn.setForeground(new Color(80, 88, 108));
		lblAllreadyHaveAn.setFont(new Font("Impact", Font.PLAIN, 15));
		lblAllreadyHaveAn.setBounds(224, 500, 186, 23);
		halfwhite.add(lblAllreadyHaveAn);
		
		
		
		// 3endo compte 
		JButton btnLogIn = new JButton("Login");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signinframe.dispose();
				Login frmOmarImmobilier = new Login();				
				frmOmarImmobilier.frame.setVisible(true);
			}
		});
		btnLogIn.setHorizontalAlignment(SwingConstants.LEFT);
		btnLogIn.setForeground(new Color(80, 88, 108));
		btnLogIn.setFont(new Font("Impact", Font.PLAIN, 15));
		btnLogIn.setFocusable(false);
		btnLogIn.setBorder(null);
		btnLogIn.setBackground(new Color(199, 208, 231));
		btnLogIn.setBounds(402, 500, 43, 23);
		halfwhite.add(btnLogIn);
		
		JLabel lblSignin = new JLabel("Sign in");
		lblSignin.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignin.setForeground(new Color(80, 88, 108));
		lblSignin.setFont(new Font("Ink Free", Font.BOLD, 64));
		lblSignin.setBounds(141, 23, 404, 97);
		halfwhite.add(lblSignin);
		
		
		
		// sign in 
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Client client = new Client();
						
				String password = new String(passwordField.getPassword());
				client.ajouterClient(firstname.getText(), lastname.getText(),username.getText(),password, numf.getText(), emailf.getText() );			
				String query="insert into signin values("+client.getId()+",'"+client.getNom()+"','"+client.getPrenom()+"','"+client.getusername()+"','"+client.getpassword()+"','"+client.getTelephone()+"','"+client.getEmail()+"')";					
				
				try {
					
					statement=connection.createStatement();
					statement.execute(query);
										
					signinframe.dispose();
					Login frmOmarImmobilier = new Login();
					
					frmOmarImmobilier.frame.setVisible(true);
										
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					
					username.setText("");
					
					signinerror frame = new signinerror();				
					frame.frame.setVisible(true);
									
				}
				
			}
		});
		btnSignIn.setForeground(new Color(199, 208, 231));
		btnSignIn.setFont(new Font("Impact", Font.PLAIN, 20));
		btnSignIn.setFocusable(false);
		btnSignIn.setBorder(null);
		btnSignIn.setBackground(new Color(80, 88, 108));
		btnSignIn.setBounds(224, 461, 262, 37);
		halfwhite.add(btnSignIn);
		
		lastname = new JTextField();
		lastname.setBounds(224, 186, 262, 37);
		halfwhite.add(lastname);
		lastname.setColumns(10);
		
		username = new JTextField();
		username.setBounds(224, 241, 262, 37);
		halfwhite.add(username);
		username.setColumns(10);
		
		numf = new JTextField();
		numf.setBounds(224, 351, 262, 37);
		halfwhite.add(numf);
		numf.setColumns(10);
		
		emailf = new JTextField();
		emailf.setBounds(224, 406, 262, 37);
		halfwhite.add(emailf);
		emailf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Last name");
		lblNewLabel_1.setForeground(new Color(80, 88, 108));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Impact", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(83, 190, 131, 26);
		halfwhite.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setForeground(new Color(80, 88, 108));
		lblNewLabel_2.setFont(new Font("Impact", Font.PLAIN, 24));
		lblNewLabel_2.setBackground(new Color(80, 88, 108));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(83, 245, 131, 26);
		halfwhite.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone number");
		lblNewLabel_3.setFont(new Font("Impact", Font.PLAIN, 22));
		lblNewLabel_3.setForeground(new Color(80, 88, 108));
		lblNewLabel_3.setBounds(83, 355, 144, 26);
		halfwhite.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Impact", Font.PLAIN, 24));
		lblNewLabel_4.setForeground(new Color(80, 88, 108));
		lblNewLabel_4.setBounds(83, 410, 131, 26);
		halfwhite.add(lblNewLabel_4);
		
		
		
		JPanel halfcolor = new JPanel();
		halfcolor.setLayout(null);
		halfcolor.setBackground(new Color(80, 88, 108));
		halfcolor.setBounds(10, 11, 364, 539);
		blackback.add(halfcolor);
		
		ImageIcon logo = new ImageIcon("KOLDEXCHIKOUR.png");
		
		JButton bot1 = new JButton("");
		bot1.setBounds(10, 101, 344, 332);
		halfcolor.add(bot1);		
		bot1.setBackground(new Color(80, 88, 108));
		bot1.setForeground(new Color(80, 88, 108));
		bot1.setFont(new Font("Impact", Font.PLAIN, 20));
		bot1.setBorder(null);
		bot1.setIcon(logo);
		bot1.setHorizontalTextPosition(JButton.CENTER);
		bot1.setVerticalTextPosition(JButton.BOTTOM);
		bot1.setFocusable(false);
		bot1.setBorder(null);
		halfcolor.add(bot1);
		
	}
}
