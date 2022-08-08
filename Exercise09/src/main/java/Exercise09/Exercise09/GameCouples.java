package Exercise09.Exercise09;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class GameCouples extends JFrame {

	private EventManager em = new EventManager(this);
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public GameCouples() {
		setTitle("GAME COUPLES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 521);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 533, 464);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JToggleButton tglbtn_A1 = new JToggleButton("");
		tglbtn_A1.setBackground(new Color(255, 255, 255));
		tglbtn_A1.setForeground(Color.MAGENTA);
		tglbtn_A1.setBounds(10, 10, 115, 100);
		tglbtn_A1.addActionListener(em);
		panel.add(tglbtn_A1);
		
		JToggleButton tglbtn_A2 = new JToggleButton("");
		tglbtn_A2.setBackground(Color.YELLOW);
		tglbtn_A2.setBounds(10, 120, 115, 100);
		tglbtn_A2.addActionListener(em);
		panel.add(tglbtn_A2);
		
		JToggleButton tglbtn_A3 = new JToggleButton("");
		tglbtn_A3.setBackground(Color.GREEN);
		tglbtn_A3.setBounds(10, 230, 115, 100);
		tglbtn_A3.addActionListener(em);
		panel.add(tglbtn_A3);
		
		JToggleButton tglbtn_A4 = new JToggleButton("");
		tglbtn_A4.setBackground(Color.RED);
		tglbtn_A4.setBounds(10, 342, 115, 100);
		tglbtn_A4.addActionListener(em);
		panel.add(tglbtn_A4);
		
		JToggleButton tglbtn_B1 = new JToggleButton("");
		tglbtn_B1.setBackground(Color.GRAY);
		tglbtn_B1.setBounds(135, 10, 115, 100);
		tglbtn_B1.addActionListener(em);
		panel.add(tglbtn_B1);
		
		JToggleButton tglbtn_C1 = new JToggleButton("");
		tglbtn_C1.setBackground(Color.ORANGE);
		tglbtn_C1.setBounds(260, 10, 115, 100);
		tglbtn_C1.addActionListener(em);
		panel.add(tglbtn_C1);
		
		JToggleButton tglbtn_D1 = new JToggleButton("");
		tglbtn_D1.setBackground(Color.MAGENTA);
		tglbtn_D1.setBounds(385, 10, 115, 100);
		tglbtn_D1.addActionListener(em);
		panel.add(tglbtn_D1);
		
		JToggleButton tglbtn_B2 = new JToggleButton("");
		tglbtn_B2.setBackground(Color.ORANGE);
		tglbtn_B2.setBounds(135, 120, 115, 100);
		tglbtn_B2.addActionListener(em);
		panel.add(tglbtn_B2);
		
		JToggleButton tglbtn_C2 = new JToggleButton("");
		tglbtn_C2.setBackground(Color.PINK);
		tglbtn_C2.setBounds(260, 120, 115, 100);
		tglbtn_C2.addActionListener(em);
		panel.add(tglbtn_C2);
		
		JToggleButton tglbtn_D2 = new JToggleButton("");
		tglbtn_D2.setBackground(Color.CYAN);
		tglbtn_D2.setBounds(385, 120, 115, 100);
		tglbtn_D2.addActionListener(em);
		panel.add(tglbtn_D2);
		
		JToggleButton tglbtn_B3 = new JToggleButton("");
		tglbtn_B3.setBackground(Color.CYAN);
		tglbtn_B3.setBounds(135, 230, 115, 100);
		tglbtn_B3.addActionListener(em);
		panel.add(tglbtn_B3);
		
		JToggleButton tglbtn_C3 = new JToggleButton("");
		tglbtn_C3.setBackground(Color.BLACK);
		tglbtn_C3.setBounds(260, 230, 115, 100);
		tglbtn_C3.addActionListener(em);
		panel.add(tglbtn_C3);
		
		JToggleButton tglbtn_D3 = new JToggleButton("");
		tglbtn_D3.setBackground(Color.RED);
		tglbtn_D3.setBounds(385, 230, 115, 100);
		tglbtn_D3.addActionListener(em);
		panel.add(tglbtn_D3);
		
		JToggleButton tglbtn_B4 = new JToggleButton("");
		tglbtn_B4.setBackground(Color.BLUE);
		tglbtn_B4.setBounds(135, 342, 115, 100);
		tglbtn_B4.addActionListener(em);
		panel.add(tglbtn_B4);
		
		JToggleButton tglbtn_C4 = new JToggleButton("");
		tglbtn_C4.setBackground(Color.WHITE);
		tglbtn_C4.setBounds(260, 342, 115, 100);
		tglbtn_C4.addActionListener(em);
		panel.add(tglbtn_C4);
		
		JToggleButton tglbtn_D4 = new JToggleButton("");
		tglbtn_D4.setBackground(Color.GREEN);
		tglbtn_D4.setBounds(385, 342, 115, 100);
		tglbtn_D4.addActionListener(em);
		panel.add(tglbtn_D4);
	}
}
