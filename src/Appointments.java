

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

public class Appointments {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Appointments window = new Appointments();
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
	public Appointments() {
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
		
		JLabel lblAppointments = new JLabel("Appointments");
		lblAppointments.setHorizontalAlignment(SwingConstants.CENTER);
		lblAppointments.setForeground(new Color(199, 208, 231));
		lblAppointments.setFont(new Font("Uni Sans Heavy CAPS", Font.BOLD, 70));
		lblAppointments.setBackground(new Color(50, 72, 81));
		lblAppointments.setBounds(0, 0, 964, 130);
		panel_2.add(lblAppointments);
		
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
		panel_3.setBounds(87, 166, 823, 65);
		panel_1.add(panel_3);
		
		JLabel lblNewLabel = new JLabel("Ouraou Abdelillah");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 15));
		lblNewLabel.setBounds(254, 18, 113, 14);
		panel_3.add(lblNewLabel);
		
		JLabel lblSadmiilyesgmailcom = new JLabel("Ouraou.Abdelillah@gmail.com");
		lblSadmiilyesgmailcom.setFont(new Font("Impact", Font.PLAIN, 15));
		lblSadmiilyesgmailcom.setBounds(377, 13, 189, 25);
		panel_3.add(lblSadmiilyesgmailcom);
		
		JLabel lblNewLabel_2 = new JLabel("0559249914");
		lblNewLabel_2.setFont(new Font("Impact", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(576, 13, 96, 25);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("With :");
		lblNewLabel_1.setForeground(new Color(80, 88, 108));
		lblNewLabel_1.setFont(new Font("Impact", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(198, 18, 46, 14);
		panel_3.add(lblNewLabel_1);
		
	
		
		JLabel lblNewLabel_3 = new JLabel("25/05/2024");
		lblNewLabel_3.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(85, 11, 113, 27);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Date :");
		lblNewLabel_4.setForeground(new Color(80, 88, 108));
		lblNewLabel_4.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(29, 11, 46, 25);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Rue 08 Ali Amar - Alger");
		lblNewLabel_5.setFont(new Font("Impact", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(671, 18, 142, 14);
		panel_3.add(lblNewLabel_5);
		
		ImageIcon logo = new ImageIcon("KOLDEXCHIKOUR.png");
		frame.setIconImage(logo.getImage());
	}
}
