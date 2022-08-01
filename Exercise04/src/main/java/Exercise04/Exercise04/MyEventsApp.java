package Exercise04.Exercise04;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class MyEventsApp extends JFrame {
	
	JTextArea textArea;

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MyEventsApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 356);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblEvents = new JLabel("Events");
		lblEvents.setBounds(10, 143, 45, 13);
		contentPane.add(lblEvents);
		
		textArea = new JTextArea();
		textArea.setBounds(71, 49, 432, 207);
		contentPane.add(textArea);
			

	}
	
	public void actionPerformed(ActionEvent e){
		int key = e.getID();
		
		if(key == ActionEvent.WINDOW_EVENT_MASK) {
			textArea.setText("window event mask");
		}else if (key == ActionEvent.WINDOW_FOCUS_EVENT_MASK) {
			textArea.setText("window focus event mask");
		}else if (key == ActionEvent.WINDOW_STATE_EVENT_MASK) {
			textArea.setText("window state event mask");
		}else if (key == ActionEvent.MOUSE_EVENT_MASK){
			textArea.setText("mouse event mask");
		}else if (key == ActionEvent.MOUSE_MOTION_EVENT_MASK) {
			textArea.setText("mouse motion event mask");
		}else if (key == ActionEvent.MOUSE_WHEEL_EVENT_MASK) {
			textArea.setText("mouse wheel event mask");
		};	  

	

	}
	
}
