

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agent_menu {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agent_menu window = new Agent_menu();
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
	public Agent_menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int window_height=1000;
		int window_width=600;
		
		
		
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, window_height, window_width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Koldex immobilier");
		ImageIcon logo = new ImageIcon("KOLDEXCHIKOUR.png");
		frame.setIconImage(logo.getImage());
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 984, 561);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(199, 208, 231));
		panel_1.setBounds(10, 11, 964, 539);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(80, 88, 108));
		panel_2.setBounds(0, 0, 964, 102);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Main menu");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(199, 208, 231));
		lblNewLabel.setFont(new Font("Uni Sans Heavy CAPS", Font.BOLD, 70));
		lblNewLabel.setBackground(new Color(50, 72, 81));
		lblNewLabel.setBounds(0, 27, 964, 95);
		panel_2.add(lblNewLabel);
		
		JButton bot1 = new JButton("My account");
		bot1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				myaccountagent myacc = new myaccountagent(); 
				myacc.frame.setVisible(true);
			}
		});
		bot1.setBackground(new Color(199, 208, 231));
		bot1.setForeground(new Color(80, 88, 108));
		bot1.setFont(new Font("Impact", Font.PLAIN, 20));
		bot1.setBounds(244, 102, 191, 151);
		panel_1.add(bot1);
		bot1.setFocusable(false);
		bot1.setBorder(null);
		ImageIcon info = new ImageIcon("inforesize.png");
		bot1.setIcon(info);
		bot1.setHorizontalTextPosition(JButton.CENTER);
		bot1.setVerticalTextPosition(JButton.BOTTOM);
		
		JButton bot2 = new JButton("Appointment Requests ");
		bot2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				apprequest appreq = new apprequest(); 
				appreq.frame.setVisible(true);
				
			}
		});
		bot2.setVerticalTextPosition(SwingConstants.BOTTOM);
		bot2.setHorizontalTextPosition(SwingConstants.CENTER);
		bot2.setForeground(new Color(80, 88, 108));
		bot2.setFont(new Font("Impact", Font.PLAIN, 20));
		bot2.setFocusable(false);
		bot2.setBorder(null);
		bot2.setBackground(new Color(199, 208, 231));
		bot2.setBounds(244, 245, 191, 122);		
		ImageIcon reqimg = new ImageIcon("request.png");
		bot2.setIcon(reqimg);
		bot2.setHorizontalTextPosition(JButton.CENTER);
		bot2.setVerticalTextPosition(JButton.BOTTOM);
		panel_1.add(bot2);
		
		JButton bot3 = new JButton("Contracts");
		bot3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Agentcontractselect main = new Agentcontractselect(); 
				main.frame.setVisible(true);
			}
		});
		bot3.setVerticalTextPosition(SwingConstants.BOTTOM);
		bot3.setHorizontalTextPosition(SwingConstants.CENTER);
		bot3.setForeground(new Color(80, 88, 108));
		bot3.setFont(new Font("Impact", Font.PLAIN, 20));
		bot3.setFocusable(false);
		bot3.setBorder(null);
		bot3.setBackground(new Color(199, 208, 231));
		bot3.setBounds(244, 382, 191, 122);
		ImageIcon contrat = new ImageIcon("contraresize.png");
		bot3.setIcon(contrat);
		bot3.setHorizontalTextPosition(JButton.CENTER);
		bot3.setVerticalTextPosition(JButton.BOTTOM);
		panel_1.add(bot3);
		
		JButton bot4 = new JButton("Appointments");
		bot4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				agentappoint main = new agentappoint(); 
				main.frame.setVisible(true);
			}
		});
		bot4.setVerticalTextPosition(SwingConstants.BOTTOM);
		bot4.setHorizontalTextPosition(SwingConstants.CENTER);
		bot4.setForeground(new Color(80, 88, 108));
		bot4.setFont(new Font("Impact", Font.PLAIN, 20));
		bot4.setFocusable(false);
		bot4.setBorder(null);
		bot4.setBackground(new Color(199, 208, 231));
		bot4.setBounds(545, 102, 191, 151);
		ImageIcon rend = new ImageIcon("rendresize.png");
		bot4.setIcon(rend);
		bot4.setHorizontalTextPosition(JButton.CENTER);
		bot4.setVerticalTextPosition(JButton.BOTTOM);
		panel_1.add(bot4);
		
		JButton bot6 = new JButton("Disconnect");
		bot6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				frame.dispose();
				Login login = new Login(); 
				login.frame.setVisible(true);
				
				
			}
		});
		
		bot6.setVerticalTextPosition(SwingConstants.BOTTOM);
		bot6.setHorizontalTextPosition(SwingConstants.CENTER);
		bot6.setForeground(new Color(80, 88, 108));
		bot6.setFont(new Font("Impact", Font.PLAIN, 20));
		bot6.setFocusable(false);
		bot6.setBorder(null);
		bot6.setBackground(new Color(199, 208, 231));
		bot6.setBounds(545, 243, 191, 122);
		ImageIcon agent = new ImageIcon("logout.png");
		bot6.setIcon(agent);
		bot6.setHorizontalTextPosition(JButton.CENTER);
		bot6.setVerticalTextPosition(JButton.BOTTOM);
		panel_1.add(bot6);
		
		
	}

}
