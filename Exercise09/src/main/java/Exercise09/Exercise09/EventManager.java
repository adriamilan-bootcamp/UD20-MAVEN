package Exercise09.Exercise09;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;

import javax.swing.JToggleButton;

import org.w3c.dom.events.MouseEvent;

public class EventManager implements ItemListener,MouseListener{

	boolean primero = false;
	boolean segundo = false;
	JToggleButton[] buttons = new JToggleButton[2];
	
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		JToggleButton btn = (JToggleButton)e.getSource();
		saveButtons(btn);
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
			}

			segundo = false;
			primero = false;
		}
	}

}
