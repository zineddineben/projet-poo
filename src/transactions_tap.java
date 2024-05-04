

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

public class transactions_tap {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					transactions_tap window = new transactions_tap();
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
	public transactions_tap() {
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
		
		JLabel lblTransactions = new JLabel("Transactions");
		lblTransactions.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransactions.setForeground(new Color(199, 208, 231));
		lblTransactions.setFont(new Font("Ink Free", Font.BOLD, 70));
		lblTransactions.setBackground(new Color(50, 72, 81));
		lblTransactions.setBounds(0, 0, 964, 102);
		panel_2.add(lblTransactions);
		
		JButton bot1 = new JButton("Echeance ‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎  ‎");
		bot1.setHorizontalTextPosition(SwingConstants.LEADING);
		bot1.setHorizontalAlignment(SwingConstants.LEADING);
		bot1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		bot1.setBackground(new Color(255, 255, 255));
		bot1.setForeground(new Color(80, 88, 108));
		bot1.setFont(new Font("Impact", Font.PLAIN, 25));
		bot1.setBounds(340, 136, 363, 116);
		panel_1.add(bot1);
		bot1.setFocusable(false);
		//bot1.setBorder(null);
		ImageIcon info = new ImageIcon("echeance.png");
		bot1.setIcon(info);
		bot1.setVerticalTextPosition(JButton.CENTER);
		
		JButton btnPayment = new JButton("Payment‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎  ‎‏‏‎  ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ");
		btnPayment.setVerticalTextPosition(SwingConstants.CENTER);
		btnPayment.setHorizontalTextPosition(SwingConstants.LEADING);
		btnPayment.setHorizontalAlignment(SwingConstants.LEADING);
		btnPayment.setForeground(new Color(80, 88, 108));
		btnPayment.setFont(new Font("Impact", Font.PLAIN, 25));
		btnPayment.setFocusable(false);
		//btnPayment.setBorder(null);
		btnPayment.setBackground(new Color(255, 255, 255));
		btnPayment.setBounds(340, 264, 363, 116);
		panel_1.add(btnPayment);
		ImageIcon pay = new ImageIcon("pay.png");
		btnPayment.setIcon(pay);
		btnPayment.setVerticalTextPosition(JButton.CENTER);
		
		JButton btnContract = new JButton("Contract‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎  ‎‏‏‎  ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ‎‏‏‎‎‏‏‎ ‎‏‏‎ ‎‏‏‎ ");
		btnContract.setVerticalTextPosition(SwingConstants.CENTER);
		btnContract.setHorizontalTextPosition(SwingConstants.LEADING);
		btnContract.setHorizontalAlignment(SwingConstants.LEADING);
		btnContract.setForeground(new Color(80, 88, 108));
		btnContract.setFont(new Font("Impact", Font.PLAIN, 25));
		btnContract.setFocusable(false);
		//btnContract.setBorder(null);
		btnContract.setBackground(new Color(255, 255, 255));
		btnContract.setBounds(340, 391, 363, 116);
		panel_1.add(btnContract);
		ImageIcon contra = new ImageIcon("contraresize.png");
		btnContract.setIcon(contra);
		btnContract.setVerticalTextPosition(JButton.CENTER);
		
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
	}
}
