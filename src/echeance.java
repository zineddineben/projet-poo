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

public class echeance {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					echeance window = new echeance();
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
	public echeance() {
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
		
		JLabel lblEcheance = new JLabel("Due Date");
		lblEcheance.setHorizontalAlignment(SwingConstants.CENTER);
		lblEcheance.setForeground(new Color(199, 208, 231));
		lblEcheance.setFont(new Font("Uni Sans Heavy CAPS", Font.BOLD, 66));
		lblEcheance.setBackground(new Color(50, 72, 81));
		lblEcheance.setBounds(0, 0, 964, 121);
		panel_2.add(lblEcheance);
		

		JButton backmenu = new JButton("");
		backmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				transactions_tap main = new transactions_tap(); 
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
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		panel_3_1.setBackground(new Color(199, 208, 231));
		panel_3_1.setBounds(95, 161, 823, 69);
		panel_1.add(panel_3_1);
		
		JLabel lblType_1 = new JLabel("Monthly payment");
		lblType_1.setFont(new Font("Impact", Font.PLAIN, 18));
		lblType_1.setBounds(237, 0, 133, 69);
		panel_3_1.add(lblType_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Type :");
		lblNewLabel_1_2.setForeground(new Color(80, 88, 108));
		lblNewLabel_1_2.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(186, 0, 46, 69);
		panel_3_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("17/05/2025");
		lblNewLabel_3_2.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_3_2.setBounds(74, -1, 113, 69);
		panel_3_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("Date :");
		lblNewLabel_4_2.setForeground(new Color(80, 88, 108));
		lblNewLabel_4_2.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_4_2.setBounds(29, 0, 46, 69);
		panel_3_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Amount due :");
		lblNewLabel_4_1_1.setForeground(new Color(80, 88, 108));
		lblNewLabel_4_1_1.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_4_1_1.setBounds(396, 0, 102, 69);
		panel_3_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("40000000 DZD ");
		lblNewLabel_3_1_2.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_3_1_2.setBounds(496, 0, 113, 69);
		panel_3_1.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Status :");
		lblNewLabel_1_1_1.setForeground(new Color(80, 88, 108));
		lblNewLabel_1_1_1.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(642, 0, 58, 69);
		panel_3_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Pending");
		lblNewLabel_3_1_1_1.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1.setBounds(700, -1, 113, 69);
		panel_3_1.add(lblNewLabel_3_1_1_1);
		
		ImageIcon logo = new ImageIcon("KOLDEXCHIKOUR.png");
		frame.setIconImage(logo.getImage());
	}
}
