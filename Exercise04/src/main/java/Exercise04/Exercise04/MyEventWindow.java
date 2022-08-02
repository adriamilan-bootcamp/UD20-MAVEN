package Exercise04.Exercise04;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class MyEventWindow extends JFrame {
	
	JTextArea textArea;
	boolean gate = true;
	int resized = 2;

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MyEventWindow() {
		// creates the main panel 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 356);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		// creates a window listener
		WindowListener wl = new WindowListener() {
			
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void windowIconified(WindowEvent e) {
				textArea.setText(textArea.getText()+"WINDOW POPS AGAIN!\n");
				
			}
			
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void windowActivated(WindowEvent e) {
				if (gate)
					textArea.setText(textArea.getText()+"WINDOW ACTIVATED!\n");
				gate = false;
				
			}
		};
		
		 addComponentListener(new java.awt.event.ComponentAdapter() {
	            public void componentResized(java.awt.event.ComponentEvent evt) {
	            	if(resized <= 0)
	            		textArea.setText(textArea.getText()+"WINDOW RESIZED!\n");
	            	resized--;
	            }
	        });
		
		JLabel lblEvents = new JLabel("Activated, hidden and resized WINDOW monitoring");
		lblEvents.setBounds(30, 27, 496, 13);
		contentPane.add(lblEvents);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(30, 49, 473, 207);
		addWindowListener(wl);
		contentPane.add(textArea);
			

	}
	
}
