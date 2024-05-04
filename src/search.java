

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;





import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class search {

	public JFrame frame;
	private JTextField getmax;
	private JTextField getmin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					search window = new search();
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
	public search() {
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
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setForeground(new Color(199, 208, 231));
		lblSearch.setFont(new Font("Ink Free", Font.BOLD, 70));
		lblSearch.setBackground(new Color(50, 72, 81));
		lblSearch.setBounds(0, 0, 964, 102);
		panel_2.add(lblSearch);
		
		JLabel lblSize = new JLabel("Maximum price :");
		lblSize.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSize.setForeground(new Color(80, 88, 108));
		lblSize.setFont(new Font("Impact", Font.PLAIN, 19));
		lblSize.setBounds(255, 121, 161, 34);
		panel_1.add(lblSize);
		
		JLabel lblNewLabel = new JLabel("Minimum price :");
		lblNewLabel.setForeground(new Color(80, 88, 108));
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(255, 166, 161, 34);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Size :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setForeground(new Color(80, 88, 108));
		lblNewLabel_1.setFont(new Font("Impact", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(255, 256, 161, 34);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Location :");
		lblNewLabel_2.setForeground(new Color(80, 88, 108));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setFont(new Font("Impact", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(255, 303, 161, 34);
		panel_1.add(lblNewLabel_2);
		
		
		
		String[] loca = {
				"Algiers center",
				"Algiers east",
				"Algiers west",			
				"Algiers south"		      
			};

		JComboBox<String> comboBox = new JComboBox<>(loca);
		comboBox.setForeground(new Color(80, 88, 108));
		comboBox.setToolTipText("");
		comboBox.setFont(new Font("Impact", Font.PLAIN, 18));
		comboBox.setBounds(434, 308, 173, 29);
		panel_1.add(comboBox);
		
		getmax = new JTextField();
		getmax.setFont(new Font("Impact", Font.PLAIN, 18));
		getmax.setBounds(440, 125, 151, 34);
		panel_1.add(getmax);
		getmax.setColumns(10);
		
		getmin = new JTextField();
		getmin.setFont(new Font("Impact", Font.PLAIN, 19));
		getmin.setBounds(440, 166, 151, 34);
		panel_1.add(getmin);
		getmin.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Type  :");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3.setFont(new Font("Impact", Font.PLAIN, 19));
		lblNewLabel_3.setForeground(new Color(80, 88, 108));
		lblNewLabel_3.setBounds(255, 211, 161, 34);
		panel_1.add(lblNewLabel_3);
		
		
		JRadioButton getappart = new JRadioButton("Apartment");
		
		getappart.setForeground(new Color(80, 88, 108));
		getappart.setFont(new Font("Impact", Font.PLAIN, 18));
		getappart.setBackground(new Color(199, 208, 231));
		getappart.setBounds(439, 221, 109, 23);
		panel_1.add(getappart);
		getappart.setFocusable(false);
		
		JRadioButton getvilla = new JRadioButton("villa");
		getvilla.setForeground(new Color(80, 88, 108));
		getvilla.setFont(new Font("Impact", Font.PLAIN, 18));
		getvilla.setBackground(new Color(199, 208, 231));
		getvilla.setBounds(563, 221, 109, 24);
		panel_1.add(getvilla);
		getvilla.setFocusable(false);
		
		ButtonGroup typegroupe = new ButtonGroup();
		typegroupe.add(getappart);
		typegroupe.add(getvilla);
		
		
	
		String[] apartstring={"Studio","F1","F2","F3","F4","F5","duplex"};
		String[] villastring={"R","R+1","R+2","R+3"};
		
		
		JComboBox<String> size = new JComboBox<>();

		// size 3la hsab type
		getappart.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        size.removeAllItems();
		        for (String item : apartstring) {
		            size.addItem(item);
		        }
		    }
		});
		getvilla.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        size.removeAllItems();
		        for (String item : villastring) {
		            size.addItem(item);
		        }
		    }
		});
		
		
		size.setForeground(new Color(80, 88, 108));
		size.setFont(new Font("Impact", Font.PLAIN, 18));
		size.setBounds(437, 266, 131, 23);
		panel_1.add(size);
		
		JLabel lblNewLabel_4 = new JLabel("Buy/Rent :");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_4.setForeground(new Color(80, 88, 108));
		lblNewLabel_4.setFont(new Font("Impact", Font.PLAIN, 19));
		lblNewLabel_4.setBounds(255, 354, 161, 34);
		panel_1.add(lblNewLabel_4);
		
		JRadioButton getbuy = new JRadioButton("Buy");
		getbuy.setForeground(new Color(80, 88, 108));
		getbuy.setFont(new Font("Impact", Font.PLAIN, 18));
		getbuy.setBackground(new Color(199, 208, 231));
		getbuy.setBounds(434, 359, 74, 24);
		panel_1.add(getbuy);
		getbuy.setFocusable(false);
		
		JRadioButton getrent = new JRadioButton("Rent");
		getrent.setBackground(new Color(199, 208, 231));
		getrent.setForeground(new Color(80, 88, 108));
		getrent.setFont(new Font("Impact", Font.PLAIN, 18));
		getrent.setBounds(510, 359, 74, 24);
		panel_1.add(getrent);
		getrent.setFocusable(false);
		
		ButtonGroup buyrent = new ButtonGroup();
		buyrent.add(getbuy);
		buyrent.add(getrent);
		
		JLabel lblNewLabel_5 = new JLabel("Extra features :");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_5.setForeground(new Color(80, 88, 108));
		lblNewLabel_5.setFont(new Font("Impact", Font.PLAIN, 19));
		lblNewLabel_5.setBounds(255, 399, 161, 29);
		panel_1.add(lblNewLabel_5);
		
		JRadioButton getgarage = new JRadioButton("Garage ");
		getgarage.setForeground(new Color(80, 88, 108));
		getgarage.setFont(new Font("Impact", Font.PLAIN, 18));
		getgarage.setBackground(new Color(199, 208, 231));
		getgarage.setBounds(434, 406, 81, 23);
		panel_1.add(getgarage);
		getgarage.setFocusable(false);
		
		JRadioButton getswim = new JRadioButton("Swimming Pool");
		getswim.setBackground(new Color(199, 208, 231));
		getswim.setForeground(new Color(80, 88, 108));
		getswim.setFont(new Font("Impact", Font.PLAIN, 18));
		getswim.setBounds(517, 406, 135, 23);
		panel_1.add(getswim);
		getswim.setFocusable(false);
		
		JRadioButton getgarden = new JRadioButton("Garden");
		getgarden.setForeground(new Color(80, 88, 108));
		getgarden.setFont(new Font("Impact", Font.PLAIN, 18));
		getgarden.setBackground(new Color(199, 208, 231));
		getgarden.setBounds(656, 406, 95, 23);
		panel_1.add(getgarden);
		getgarden.setFocusable(false);
		
		JButton searchrs = new JButton("Search");
		searchrs.setFont(new Font("Impact", Font.PLAIN, 39));
		searchrs.setForeground(new Color(199, 208, 231));
		searchrs.setBackground(new Color(80, 88, 108));
		searchrs.setBounds(290, 455, 407, 46);
		panel_1.add(searchrs);
		searchrs.setFocusable(false);
		searchrs.setBorder(null);
		
		JLabel maxdzd = new JLabel(".00 da");
		maxdzd.setForeground(new Color(80, 88, 108));
		maxdzd.setFont(new Font("Impact", Font.PLAIN, 19));
		maxdzd.setBounds(592, 135, 54, 20);
		panel_1.add(maxdzd);
		
		JLabel lblNewLabel_6 = new JLabel(".00 da");
		lblNewLabel_6.setForeground(new Color(80, 88, 108));
		lblNewLabel_6.setFont(new Font("Impact", Font.PLAIN, 19));
		lblNewLabel_6.setBounds(592, 173, 54, 20);
		panel_1.add(lblNewLabel_6);
		
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
