package Exercise05.Exercise05;

import java.awt.EventQueue;

/**
 * Hello world!
 *
 */
public class MainApp 
{
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyEventMouse frame = new MyEventMouse();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
