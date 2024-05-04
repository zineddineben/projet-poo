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

public class agentappoint {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agentappoint window = new agentappoint();
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
	public agentappoint() {
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
		
		JLabel lblAppointments = new JLabel("Appointments");
		lblAppointments.setHorizontalAlignment(SwingConstants.CENTER);
		lblAppointments.setForeground(new Color(199, 208, 231));
		lblAppointments.setFont(new Font("Ink Free", Font.BOLD, 70));
		lblAppointments.setBackground(new Color(50, 72, 81));
		lblAppointments.setBounds(0, 0, 964, 102);
		panel_2.add(lblAppointments);
		
		JLabel lblNewLabel = new JLabel("your next appointments :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setForeground(new Color(80, 88, 108));
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 19));
		lblNewLabel.setBounds(228, 150, 217, 35);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("With :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setForeground(new Color(80, 88, 108));
		lblNewLabel_1.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(265, 200, 180, 27);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contact informations :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setForeground(new Color(80, 88, 108));
		lblNewLabel_2.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(265, 250, 180, 27);
		panel_1.add(lblNewLabel_2);
		
		JButton backmenu = new JButton("");
		backmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				sell_rent main = new sell_rent(); 
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
