import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agentcontractselect {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agentcontractselect window = new Agentcontractselect();
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
	public Agentcontractselect() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
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
		
		JLabel lblAppointments = new JLabel("Contracts");
		lblAppointments.setHorizontalAlignment(SwingConstants.CENTER);
		lblAppointments.setForeground(new Color(199, 208, 231));
		lblAppointments.setFont(new Font("Uni Sans Heavy CAPS", Font.BOLD, 70));
		lblAppointments.setBackground(new Color(50, 72, 81));
		lblAppointments.setBounds(0, 11, 964, 110);
		panel_2.add(lblAppointments);
		
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		panel_3.setBackground(new Color(199, 208, 231));
		panel_3.setBounds(74, 129, 823, 194);
		panel_1.add(panel_3);
		
		JButton btnCiewContract = new JButton("view contract");
		btnCiewContract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose();
				agentcontracts main = new agentcontracts(); 
				main.frame.setVisible(true);
				
				
			}
		});
		btnCiewContract.setFocusable(false);
		btnCiewContract.setBounds(632, 138, 181, 45);
		panel_3.add(btnCiewContract);
		
		JLabel lblNewLabel = new JLabel("Price : 40000000.00 DZD");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 26));
		lblNewLabel.setBounds(20, 11, 263, 33);
		panel_3.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBounds(634, 11, 179, 115);
		panel_3.add(btnNewButton_1);
		ImageIcon reqimg = new ImageIcon("dar2.png");
		btnNewButton_1.setIcon(reqimg);
		btnNewButton_1.setHorizontalTextPosition(JButton.CENTER);
		btnNewButton_1.setVerticalTextPosition(JButton.BOTTOM);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBorder(null);
		panel_3.add(btnNewButton_1);
		
		JTextPane txtpnTestTestTest = new JTextPane();
		txtpnTestTestTest.setText("Description : \r\nVilla R+1 avec piscine \r\nPrix : 4milliards \r\nAdresse: Rue 08 Ali Amar - Alger");
		txtpnTestTestTest.setFont(new Font("Impact", Font.PLAIN, 18));
		txtpnTestTestTest.setEditable(false);
		txtpnTestTestTest.setBackground(new Color(199, 208, 231));
		txtpnTestTestTest.setBounds(20, 55, 447, 128);
		panel_3.add(txtpnTestTestTest);
		
		ImageIcon logo = new ImageIcon("KOLDEXCHIKOUR.png");
		frame.setIconImage(logo.getImage());
		
	}
}
