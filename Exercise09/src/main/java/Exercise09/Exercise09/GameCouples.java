package Exercise09.Exercise09;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JButton;

public class GameCouples extends JFrame {

	private EventManager manager = new EventManager(this);
	private JPanel contentPane;
	JPanel panel;
	JToggleButton tglbtn_A1;
	JToggleButton tglbtn_A2;
	JToggleButton tglbtn_A3;
	JToggleButton tglbtn_A4;
	JToggleButton tglbtn_B1;
	JToggleButton tglbtn_B2;
	JToggleButton tglbtn_B3;
	JToggleButton tglbtn_B4;
	JToggleButton tglbtn_C1;
	JToggleButton tglbtn_C2;
	JToggleButton tglbtn_C3;
	JToggleButton tglbtn_C4;
	JToggleButton tglbtn_D1;
	JToggleButton tglbtn_D2;
	JToggleButton tglbtn_D3;
	JToggleButton tglbtn_D4;
	JButton btnRestart;
	/**
	 * Create the frame.
	 */
	public GameCouples() {
		setTitle("GAME COUPLES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 557);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setBounds(10, 10, 533, 464);
		contentPane.add(panel);
		panel.setLayout(null);
		
		tglbtn_A1 = new JToggleButton("");
		tglbtn_A1.addMouseListener(manager);
		tglbtn_A1.setSelected(true);
		tglbtn_A1.setBackground(Color.WHITE);
		tglbtn_A1.setBounds(10, 10, 115, 100);
		tglbtn_A1.addActionListener(manager);
		panel.add(tglbtn_A1);
		
		tglbtn_A2 = new JToggleButton("");
		tglbtn_A2.addMouseListener(manager);
		tglbtn_A2.setSelected(true);
		tglbtn_A2.setBackground(Color.YELLOW);
		tglbtn_A2.setBounds(10, 120, 115, 100);
		tglbtn_A2.addActionListener(manager);
		panel.add(tglbtn_A2);
		
		tglbtn_A3 = new JToggleButton("");
		tglbtn_A3.addMouseListener(manager);
		tglbtn_A3.setSelected(true);
		tglbtn_A3.setBackground(Color.GREEN);
		tglbtn_A3.setBounds(10, 230, 115, 100);
		tglbtn_A3.addActionListener(manager);
		panel.add(tglbtn_A3);
		
		tglbtn_A4 = new JToggleButton("");
		tglbtn_A4.addMouseListener(manager);
		tglbtn_A4.setSelected(true);
		tglbtn_A4.setBackground(Color.RED);
		tglbtn_A4.setBounds(10, 342, 115, 100);
		tglbtn_A4.addActionListener(manager);
		panel.add(tglbtn_A4);
		
		tglbtn_B1 = new JToggleButton("");
		tglbtn_B1.addMouseListener(manager);
		tglbtn_B1.setSelected(true);
		tglbtn_B1.setBackground(Color.GRAY);
		tglbtn_B1.setBounds(135, 10, 115, 100);
		tglbtn_B1.addActionListener(manager);
		panel.add(tglbtn_B1);
		
		tglbtn_C1 = new JToggleButton("");
		tglbtn_C1.addMouseListener(manager);
		tglbtn_C1.setSelected(true);
		tglbtn_C1.setBackground(Color.ORANGE);
		tglbtn_C1.setBounds(260, 10, 115, 100);
		tglbtn_C1.addActionListener(manager);
		panel.add(tglbtn_C1);
		
		tglbtn_D1 = new JToggleButton("");
		tglbtn_D1.addMouseListener(manager);
		tglbtn_D1.setSelected(true);
		tglbtn_D1.setBackground(Color.MAGENTA);
		tglbtn_D1.setBounds(385, 10, 115, 100);
		tglbtn_D1.addActionListener(manager);
		panel.add(tglbtn_D1);
		
		tglbtn_B2 = new JToggleButton("");
		tglbtn_B2.addMouseListener(manager);
		tglbtn_B2.setSelected(true);
		tglbtn_B2.setBackground(Color.ORANGE);
		tglbtn_B2.setBounds(135, 120, 115, 100);
		tglbtn_B2.addActionListener(manager);
		panel.add(tglbtn_B2);
		
		tglbtn_C2 = new JToggleButton("");
		tglbtn_C2.addMouseListener(manager);
		tglbtn_C2.setSelected(true);
		tglbtn_C2.setBackground(Color.PINK);
		tglbtn_C2.setBounds(260, 120, 115, 100);
		tglbtn_C2.addActionListener(manager);
		panel.add(tglbtn_C2);
		
		tglbtn_D2 = new JToggleButton("");
		tglbtn_D2.addMouseListener(manager);
		tglbtn_D2.setSelected(true);
		tglbtn_D2.setBackground(Color.CYAN);
		tglbtn_D2.setBounds(385, 120, 115, 100);
		tglbtn_D2.addActionListener(manager);
		panel.add(tglbtn_D2);
		
		tglbtn_B3 = new JToggleButton("");
		tglbtn_B3.addMouseListener(manager);
		tglbtn_B3.setSelected(true);
		tglbtn_B3.setBackground(Color.CYAN);
		tglbtn_B3.setBounds(135, 230, 115, 100);
		tglbtn_B3.addActionListener(manager);
		panel.add(tglbtn_B3);
		
		tglbtn_C3 = new JToggleButton("");
		tglbtn_C3.addMouseListener(manager);
		tglbtn_C3.setSelected(true);
		tglbtn_C3.setBackground(Color.BLACK);
		tglbtn_C3.setBounds(260, 230, 115, 100);
		tglbtn_C3.addActionListener(manager);
		panel.add(tglbtn_C3);
		
		tglbtn_D3 = new JToggleButton("");
		tglbtn_D3.addMouseListener(manager);
		tglbtn_D3.setSelected(true);
		tglbtn_D3.setBackground(Color.RED);
		tglbtn_D3.setBounds(385, 230, 115, 100);
		tglbtn_D3.addActionListener(manager);
		panel.add(tglbtn_D3);
		
		tglbtn_B4 = new JToggleButton("");
		tglbtn_B4.addMouseListener(manager);
		tglbtn_B4.setSelected(true);
		tglbtn_B4.setBackground(Color.BLUE);
		tglbtn_B4.setBounds(135, 342, 115, 100);
		tglbtn_B4.addActionListener(manager);
		panel.add(tglbtn_B4);
		
		tglbtn_C4 = new JToggleButton("");
		tglbtn_C4.addMouseListener(manager);
		tglbtn_C4.setSelected(true);
		tglbtn_C4.setBackground(Color.WHITE);
		tglbtn_C4.setBounds(260, 342, 115, 100);
		tglbtn_C4.addActionListener(manager);
		panel.add(tglbtn_C4);
		
		tglbtn_D4 = new JToggleButton("");
		tglbtn_D4.addMouseListener(manager);
		tglbtn_D4.setSelected(true);
		tglbtn_D4.setBackground(Color.GREEN);
		tglbtn_D4.setBounds(385, 342, 115, 100);
		tglbtn_D4.addActionListener(manager);
		panel.add(tglbtn_D4);
		
		btnRestart = new JButton("RESTART");
		btnRestart.setBounds(229, 484, 85, 21);
		btnRestart.addActionListener(manager);
		contentPane.add(btnRestart);
		
		backGround();
		
	}
	
	public void backGround() {
		Color[] colors = {Color.MAGENTA,Color.RED,Color.WHITE,Color.ORANGE,Color.CYAN,Color.BLACK,Color.GREEN,Color.YELLOW};
		
		tglbtn_A1.setBackground(colors[manager.numbers[0]-1]);
		tglbtn_A2.setBackground(colors[manager.numbers[1]-1]);
		tglbtn_A3.setBackground(colors[manager.numbers[2]-1]);
		tglbtn_A4.setBackground(colors[manager.numbers[3]-1]);
		tglbtn_B1.setBackground(colors[manager.numbers[4]-1]);
		tglbtn_B2.setBackground(colors[manager.numbers[5]-1]);
		tglbtn_B3.setBackground(colors[manager.numbers[6]-1]);
		tglbtn_B4.setBackground(colors[manager.numbers[7]-1]);
		tglbtn_C1.setBackground(colors[manager.numbers[8]-1]);
		tglbtn_C2.setBackground(colors[manager.numbers[9]-1]);
		tglbtn_C3.setBackground(colors[manager.numbers[10]-1]);
		tglbtn_C4.setBackground(colors[manager.numbers[11]-1]);
		tglbtn_D1.setBackground(colors[manager.numbers[12]-1]);
		tglbtn_D2.setBackground(colors[manager.numbers[13]-1]);
		tglbtn_D3.setBackground(colors[manager.numbers[14]-1]);
		tglbtn_D4.setBackground(colors[manager.numbers[15]-1]);
	}
	
	public void reiniciar() {
		tglbtn_A1.setVisible(true);
		tglbtn_A2.setVisible(true);
		tglbtn_A3.setVisible(true);
		tglbtn_A4.setVisible(true);
		tglbtn_B1.setVisible(true);
		tglbtn_B2.setVisible(true);
		tglbtn_B3.setVisible(true);
		tglbtn_B4.setVisible(true);
		tglbtn_C1.setVisible(true);
		tglbtn_C2.setVisible(true);
		tglbtn_C3.setVisible(true);
		tglbtn_C4.setVisible(true);
		tglbtn_D1.setVisible(true);
		tglbtn_D2.setVisible(true);
		tglbtn_D3.setVisible(true);
		tglbtn_D4.setVisible(true);
		
		tglbtn_A1.setSelected(true);
		tglbtn_A2.setSelected(true);
		tglbtn_A3.setSelected(true);
		tglbtn_A4.setSelected(true);
		tglbtn_B1.setSelected(true);
		tglbtn_B2.setSelected(true);
		tglbtn_B3.setSelected(true);
		tglbtn_B4.setSelected(true);
		tglbtn_C1.setSelected(true);
		tglbtn_C2.setSelected(true);
		tglbtn_C3.setSelected(true);
		tglbtn_C4.setSelected(true);
		tglbtn_D1.setSelected(true);
		tglbtn_D2.setSelected(true);
		tglbtn_D3.setSelected(true);
		tglbtn_D4.setSelected(true);
		
		tglbtn_A1.setEnabled(true);
		tglbtn_A2.setEnabled(true);
		tglbtn_A3.setEnabled(true);
		tglbtn_A4.setEnabled(true);
		tglbtn_B1.setEnabled(true);
		tglbtn_B2.setEnabled(true);
		tglbtn_B3.setEnabled(true);
		tglbtn_B4.setEnabled(true);
		tglbtn_C1.setEnabled(true);
		tglbtn_C2.setEnabled(true);
		tglbtn_C3.setEnabled(true);
		tglbtn_C4.setEnabled(true);
		tglbtn_D1.setEnabled(true);
		tglbtn_D2.setEnabled(true);
		tglbtn_D3.setEnabled(true);
		tglbtn_D4.setEnabled(true);
		
	}
}
