package Exercise09.Exercise09;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.Color;

public class JuegoParejas extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public JuegoParejas() {
		setTitle("JUEGO DE PAREJAS");
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
		
		JToggleButton tglbtn_A1 = new JToggleButton("New toggle button");
		tglbtn_A1.setForeground(Color.MAGENTA);
		tglbtn_A1.setBounds(10, 10, 115, 100);
		panel.add(tglbtn_A1);
		
		JToggleButton tglbtn_A2 = new JToggleButton("New toggle button");
		tglbtn_A2.setForeground(Color.GREEN);
		tglbtn_A2.setBounds(10, 120, 115, 100);
		panel.add(tglbtn_A2);
		
		JToggleButton tglbtn_A3 = new JToggleButton("New toggle button");
		tglbtn_A3.setBounds(10, 230, 115, 100);
		panel.add(tglbtn_A3);
		
		JToggleButton tglbtn_A4 = new JToggleButton("New toggle button");
		tglbtn_A4.setForeground(Color.YELLOW);
		tglbtn_A4.setBounds(10, 342, 115, 100);
		panel.add(tglbtn_A4);
		
		JToggleButton tglbtn_A1_1 = new JToggleButton("New toggle button");
		tglbtn_A1_1.setBounds(135, 10, 115, 100);
		panel.add(tglbtn_A1_1);
		
		JToggleButton tglbtn_A1_1_1 = new JToggleButton("New toggle button");
		tglbtn_A1_1_1.setForeground(Color.BLUE);
		tglbtn_A1_1_1.setBounds(260, 10, 115, 100);
		panel.add(tglbtn_A1_1_1);
		
		JToggleButton tglbtn_A1_1_2 = new JToggleButton("New toggle button");
		tglbtn_A1_1_2.setBounds(385, 10, 115, 100);
		panel.add(tglbtn_A1_1_2);
		
		JToggleButton tglbtn_A1_1_3 = new JToggleButton("New toggle button");
		tglbtn_A1_1_3.setForeground(Color.ORANGE);
		tglbtn_A1_1_3.setBounds(135, 120, 115, 100);
		panel.add(tglbtn_A1_1_3);
		
		JToggleButton tglbtn_A1_1_4 = new JToggleButton("New toggle button");
		tglbtn_A1_1_4.setForeground(Color.PINK);
		tglbtn_A1_1_4.setBounds(260, 120, 115, 100);
		panel.add(tglbtn_A1_1_4);
		
		JToggleButton tglbtn_A1_1_5 = new JToggleButton("New toggle button");
		tglbtn_A1_1_5.setForeground(Color.ORANGE);
		tglbtn_A1_1_5.setBounds(385, 120, 115, 100);
		panel.add(tglbtn_A1_1_5);
		
		JToggleButton tglbtn_A1_1_6 = new JToggleButton("New toggle button");
		tglbtn_A1_1_6.setForeground(Color.RED);
		tglbtn_A1_1_6.setBounds(135, 230, 115, 100);
		panel.add(tglbtn_A1_1_6);
		
		JToggleButton tglbtn_A1_1_7 = new JToggleButton("New toggle button");
		tglbtn_A1_1_7.setForeground(Color.GREEN);
		tglbtn_A1_1_7.setBounds(260, 230, 115, 100);
		panel.add(tglbtn_A1_1_7);
		
		JToggleButton tglbtn_A1_1_8 = new JToggleButton("New toggle button");
		tglbtn_A1_1_8.setBounds(385, 230, 115, 100);
		panel.add(tglbtn_A1_1_8);
		
		JToggleButton tglbtn_A1_1_9 = new JToggleButton("New toggle button");
		tglbtn_A1_1_9.setBounds(135, 342, 115, 100);
		panel.add(tglbtn_A1_1_9);
		
		JToggleButton tglbtn_A1_1_10 = new JToggleButton("New toggle button");
		tglbtn_A1_1_10.setBounds(260, 342, 115, 100);
		panel.add(tglbtn_A1_1_10);
		
		JToggleButton tglbtn_A1_1_11 = new JToggleButton("New toggle button");
		tglbtn_A1_1_11.setForeground(Color.MAGENTA);
		tglbtn_A1_1_11.setBounds(385, 342, 115, 100);
		panel.add(tglbtn_A1_1_11);
	}
}
