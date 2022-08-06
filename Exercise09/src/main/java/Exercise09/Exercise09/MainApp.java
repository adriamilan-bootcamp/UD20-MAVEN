package Exercise09.Exercise09;

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
					JuegoParejas frame = new JuegoParejas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
