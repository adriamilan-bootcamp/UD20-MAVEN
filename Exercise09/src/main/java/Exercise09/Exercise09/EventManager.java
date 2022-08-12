package Exercise09.Exercise09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

public class EventManager implements ActionListener,MouseListener{

	GameCouples gc;
	
	boolean primero = false;
	boolean segundo = false;
	JToggleButton[] buttons = new JToggleButton[2];
	public int[] numbers;
	
	private int numParejas=0;
	
	public EventManager(GameCouples gc) {
		this.gc = gc;
		colorSwitcher();
	}

	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		compare();
		if (numParejas == 8) {
			JOptionPane.showMessageDialog(gc, "Bien, has encontrado todas las parejas");
		}
	}
	
	public void saveButtons(JToggleButton btn) {
		if (!primero) {
			buttons[0] = btn;
			btn.setEnabled(false);
			primero = true;
		}else {
			buttons[1] = btn;
			segundo = true;
		}
	}
	
	public void compare() {
		if (primero && segundo) {
			System.out.println(buttons[0].getBackground());
			System.out.println(buttons[1].getBackground());
			if (buttons[0].getBackground() != buttons[1].getBackground()) {
				buttons[0].setSelected(true);
				buttons[0].setEnabled(true);
				buttons[1].setSelected(true);
				buttons[1].setEnabled(true);
			}else {
				buttons[0].setVisible(false);
				buttons[1].setVisible(false);
				numParejas++;
			}

			segundo = false;
			primero = false;
		}
	}
	
	public void colorSwitcher() {
		
		numbers = new int[16];
		int count = 0;
		
		while (count<16) {
			int random = (int)Math.random()*8;
			int num=0;
			
			for (int i = 0; i < 16; i++) {
				if (numbers[i] == random) {
					num++;
				}
			}
			if (num < 2) {
				numbers[count] = random;
				count++;
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}
	
	public void initializeGame() {
		colorSwitcher();
		gc.backGround();
		gc.iniciar();
		numParejas = 0;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub		
		if(e.getSource() == gc.btnRestart) {
			initializeGame();
		}else {
			JToggleButton btn = (JToggleButton) e.getSource();
			saveButtons(btn);			
		}
	}

}
