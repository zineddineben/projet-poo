import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class agentcontracts {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agentcontracts window = new agentcontracts();
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
	public agentcontracts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(250, 0, 966, 920);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Koldex immobilier");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 950, 881);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(199, 208, 231));
		panel_1.setBounds(10, 11, 930, 859);
		panel.add(panel_1);
		
		JButton backmenu = new JButton("");
		backmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Agentcontractselect main = new Agentcontractselect(); 
				main.frame.setVisible(true);
			}
		});
		backmenu.setBackground(new Color(255, 255, 255));
		backmenu.setBounds(10, 109, 54, 34);
		panel_1.add(backmenu);
		ImageIcon back = new ImageIcon("backmenu.png");
		backmenu.setIcon(back);
		backmenu.setHorizontalTextPosition(JButton.CENTER);
		backmenu.setVerticalTextPosition(JButton.BOTTOM);
		backmenu.setFocusable(false);
		backmenu.setBorder(null);
		
		JButton printbot = new JButton("");
		printbot.setBackground(new Color(255, 255, 255));
		printbot.setBounds(866, 98, 54, 58);
		panel_1.add(printbot);
		ImageIcon print = new ImageIcon("print2.png");
		printbot.setIcon(print);
		printbot.setHorizontalTextPosition(JButton.CENTER);
		printbot.setVerticalTextPosition(JButton.BOTTOM);
		printbot.setFocusable(false);
		printbot.setBorder(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(80, 88, 108));
		panel_2.setBounds(0, 0, 930, 74);
		panel_1.add(panel_2);
		
		JLabel lblAppointmentRequests = new JLabel("Contracts");
		lblAppointmentRequests.setHorizontalAlignment(SwingConstants.CENTER);
		lblAppointmentRequests.setForeground(new Color(199, 208, 231));
		lblAppointmentRequests.setFont(new Font("Uni Sans Heavy CAPS", Font.BOLD, 65));
		lblAppointmentRequests.setBackground(new Color(50, 72, 81));
		lblAppointmentRequests.setBounds(0, 0, 920, 87);
		panel_2.add(lblAppointmentRequests);
			
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 64, 930, 795);
		panel_1.add(lblNewLabel);
		ImageIcon contra = new ImageIcon("contratex2.png");
		lblNewLabel.setIcon(contra);
		
		ImageIcon logo = new ImageIcon("KOLDEXCHIKOUR.png");
		frame.setIconImage(logo.getImage());
	}

}
