import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class loginerr {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginerr window = new loginerr();
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
	public loginerr() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(460, 400, 450, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Koldex immobilier");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		panel.setBackground(new Color(199, 208, 231));
		panel.setBounds(0, 0, 434, 161);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Wrong username and password combination");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(80, 88, 108));
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 16));
		lblNewLabel.setBounds(73, 11, 314, 83);
		panel.add(lblNewLabel);
		
		JButton okbot = new JButton("ok");
		okbot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				
			}
		});
		okbot.setFont(new Font("Impact", Font.PLAIN, 14));
		okbot.setForeground(new Color(80, 88, 108));
		okbot.setBounds(183, 108, 89, 23);
		panel.add(okbot);
		okbot.setFocusable(false);
	}

}
