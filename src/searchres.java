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
import javax.swing.JTextPane;

public class searchres {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchres window = new searchres();
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
	public searchres() {
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
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setForeground(new Color(199, 208, 231));
		lblSearch.setFont(new Font("Uni Sans Heavy CAPS", Font.BOLD, 68));
		lblSearch.setBackground(new Color(50, 72, 81));
		lblSearch.setBounds(0, 0, 964, 127);
		panel_2.add(lblSearch);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(199, 208, 231));
		panel_3.setBounds(77, 143, 823, 194);
		panel_1.add(panel_3);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		panel_3.setLayout(null);
		
		
		
		
		JButton btnNewButton = new JButton("send request");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(632, 138, 181, 45);
		panel_3.add(btnNewButton);
		btnNewButton.setFocusable(false);
		
		JLabel lblNewLabel = new JLabel("Price : 40000000.00 DZD");
		lblNewLabel.setBounds(20, 11, 263, 33);
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 26));
		panel_3.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(634, 11, 179, 115);
		
	
		ImageIcon reqimg = new ImageIcon("dar2.png");
		btnNewButton_1.setIcon(reqimg);
		btnNewButton_1.setHorizontalTextPosition(JButton.CENTER);
		btnNewButton_1.setVerticalTextPosition(JButton.BOTTOM);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBorder(null);
		panel_3.add(btnNewButton_1);
		
		JTextPane txtpnTestTestTest = new JTextPane();
		txtpnTestTestTest.setEditable(false);
		txtpnTestTestTest.setText("Description : \r\nVilla R+1 avec piscine \r\nPrix : 4milliards \r\nAdresse: Rue 08 Ali Amar - Alger");
		txtpnTestTestTest.setFont(new Font("Impact", Font.PLAIN, 18));
		txtpnTestTestTest.setBackground(new Color(199, 208, 231));
		txtpnTestTestTest.setBounds(20, 55, 447, 128);
		panel_3.add(txtpnTestTestTest);
		
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
		
		ImageIcon logo = new ImageIcon("KOLDEXCHIKOUR.png");
		frame.setIconImage(logo.getImage());
	}
}
