

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

public class pendingreq {

	public JFrame frame;

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
		lblPendingRequests.setFont(new Font("Ink Free", Font.BOLD, 70));
		lblPendingRequests.setBackground(new Color(50, 72, 81));
		lblPendingRequests.setBounds(0, 0, 964, 102);
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
	}

}
