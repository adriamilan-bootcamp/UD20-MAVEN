package Exercise09.Exercise09;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

public class EventManager implements ActionListener{
	
	GameCouples gc = new GameCouples();
	
	
	/**
	 * @param gc
	 */
	public EventManager(GameCouples gc) {
		this.gc = gc;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand() == "A1") {
			// TODO
		};
		

		
	}
	
	public void colorSwitcher(JToggleButton tg, int key) {
		switch (key) {
		case 1:
			tg.setForeground(Color.MAGENTA);
			break;
		case 2:
			tg.setForeground(Color.RED);
			break;
		case 3:
			tg.setForeground(Color.WHITE);
			break;
		case 4:
			tg.setForeground(Color.ORANGE);
			break;
		case 5:
			tg.setForeground(Color.CYAN);
			break;
		case 6:
			tg.setForeground(Color.BLACK);
			break;
		case 7:
			tg.setForeground(Color.GREEN);
			break;
		case 8:
			tg.setForeground(Color.YELLOW);
			break;
		default:
			break;
		}
		
	}
	
	
	
	

}
