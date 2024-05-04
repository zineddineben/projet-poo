import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;




import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 // Create the application.
	 
	public menu() {
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
		frame.getContentPane().setFont(new Font("Impact", Font.PLAIN, 11));
		frame.setBounds(100, 100, window_height, window_width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 984, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(199, 208, 231));
		panel_1.setBounds(10, 11, 964, 539);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(80, 88, 108));
		panel_2.setBounds(0, 0, 964, 102);	
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Main menu");
		lblNewLabel.setBackground(new Color(50, 72, 81));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(199, 208, 231));
		lblNewLabel.setFont(new Font("Ink Free", Font.BOLD, 70));
		lblNewLabel.setBounds(0, 0, 964, 102);
		panel_2.add(lblNewLabel);
		
		JButton bot1 = new JButton("My account");
		bot1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				my_account myacc = new my_account(); 
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
		
		JButton bot2 = new JButton("Search");
		bot2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				search srch = new search(); 
				srch.frame.setVisible(true);
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
		ImageIcon search = new ImageIcon("search2resize.png");
		bot2.setIcon(search);
		bot2.setHorizontalTextPosition(JButton.CENTER);
		bot2.setVerticalTextPosition(JButton.BOTTOM);
		panel_1.add(bot2);
		
		JButton bot3 = new JButton("Appointments");
		bot3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Appointments apoin = new Appointments(); 
				apoin.frame.setVisible(true);
				
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
		ImageIcon rend = new ImageIcon("rendresize.png");
		bot3.setIcon(rend);
		bot3.setHorizontalTextPosition(JButton.CENTER);
		bot3.setVerticalTextPosition(JButton.BOTTOM);
		panel_1.add(bot3);
		
		JButton bot4 = new JButton("pending requests");
		bot4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose();
				pendingreq contrat = new pendingreq(); 
				contrat.frame.setVisible(true);
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
		ImageIcon contrat = new ImageIcon("pending.png");
		bot4.setIcon(contrat);
		bot4.setHorizontalTextPosition(JButton.CENTER);
		bot4.setVerticalTextPosition(JButton.BOTTOM);
		panel_1.add(bot4);
		
		JButton bot5 = new JButton("transaction");
		bot5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

				frame.dispose();
				transactions_tap trans = new transactions_tap(); 
				trans.frame.setVisible(true);
				
				
			}
		});
		
		
		bot5.setVerticalTextPosition(SwingConstants.BOTTOM);
		bot5.setHorizontalTextPosition(SwingConstants.CENTER);
		bot5.setForeground(new Color(80, 88, 108));
		bot5.setFont(new Font("Impact", Font.PLAIN, 20));
		bot5.setFocusable(false);
		bot5.setBorder(null);
		bot5.setBackground(new Color(199, 208, 231));
		bot5.setBounds(545, 245, 191, 122);
		ImageIcon trans = new ImageIcon("transresize.png");
		bot5.setIcon(trans);
		bot5.setHorizontalTextPosition(JButton.CENTER);
		bot5.setVerticalTextPosition(JButton.BOTTOM);
		panel_1.add(bot5);
		
		JButton bot6 = new JButton("Disconnect");
		bot6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				frame.dispose();
				app login = new app(); 
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
		bot6.setBounds(545, 382, 191, 122);
		ImageIcon agent = new ImageIcon("logout.png");
		bot6.setIcon(agent);
		bot6.setHorizontalTextPosition(JButton.CENTER);
		bot6.setVerticalTextPosition(JButton.BOTTOM);
		panel_1.add(bot6);
		
	}
}
