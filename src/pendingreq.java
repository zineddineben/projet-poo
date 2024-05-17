

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
import javax.swing.border.BevelBorder;


public class pendingreq {
	

	public JFrame frame;
	boolean acpt=false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pendingreq window = new pendingreq();
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
	public pendingreq() {
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
		
		JLabel lblPendingRequests = new JLabel("pending requests");
		lblPendingRequests.setHorizontalAlignment(SwingConstants.CENTER);
		lblPendingRequests.setForeground(new Color(199, 208, 231));
		lblPendingRequests.setFont(new Font("Uni Sans Heavy CAPS", Font.BOLD, 66));
		lblPendingRequests.setBackground(new Color(50, 72, 81));
		lblPendingRequests.setBounds(0, 0, 964, 116);
		panel_2.add(lblPendingRequests);
		
		JButton backmenu = new JButton("");
		backmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				menu main = new menu(); 
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
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		panel_3.setBackground(new Color(199, 208, 231));
		panel_3.setBounds(97, 186, 823, 143);
		panel_1.add(panel_3);
		
		JLabel lblNewLabel = new JLabel("Ouraou Abdelillah");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 17));
		lblNewLabel.setBounds(66, 14, 141, 25);
		panel_3.add(lblNewLabel);
		
		JLabel lblSadmiilyesgmailcom = new JLabel("Ouraou.Abdelillah@gmail.com");
		lblSadmiilyesgmailcom.setFont(new Font("Impact", Font.PLAIN, 17));
		lblSadmiilyesgmailcom.setBounds(66, 47, 221, 25);
		panel_3.add(lblSadmiilyesgmailcom);
		
		JLabel lblNewLabel_2 = new JLabel("0559249914");
		lblNewLabel_2.setFont(new Font("Impact", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(66, 72, 96, 25);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("To :");
		lblNewLabel_1.setFont(new Font("Impact", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 19, 46, 14);
		panel_3.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(634, 11, 179, 115);
		
	
		ImageIcon reqimg = new ImageIcon("dar2.png");
		btnNewButton_1.setIcon(reqimg);
		btnNewButton_1.setHorizontalTextPosition(JButton.CENTER);
		btnNewButton_1.setVerticalTextPosition(JButton.BOTTOM);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBorder(null);
		panel_3.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Rue 08 Ali Amar - Alger");
		lblNewLabel_3.setFont(new Font("Impact", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(61, 103, 247, 23);
		panel_3.add(lblNewLabel_3);
		
		ImageIcon logo = new ImageIcon("KOLDEXCHIKOUR.png");
		frame.setIconImage(logo.getImage());
		
	}
}
