package Exercise05.Exercise05;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class MyEventMouse extends JFrame {
	
	JTextArea textArea;

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MyEventMouse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 318);
		contentPane = new JPanel();
		// TODO
		MouseListener ml = new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				textArea.setText(textArea.getText()+"You've released the mouse button\n");
				
			}
			
			public void mousePressed(MouseEvent e) {
				textArea.setText(textArea.getText()+"You've pressed the mouse button\n");
				
			}
			
			public void mouseExited(MouseEvent e) {
				textArea.setText(textArea.getText()+"You've moved the mouse out of the text area\n");
				
			}
			
			public void mouseEntered(MouseEvent e) {
				textArea.setText(textArea.getText()+"You've just entered the mouse on the text area\n");
				
			}
			
			public void mouseClicked(MouseEvent e) {
				textArea.setText(textArea.getText()+"You've just clicked the mouse on the text area\n");
				
			}
		};
		// ADD LISTENER TO MOUSE
		
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblEventMouseViewer = new JLabel("EVENT MOUSE VIEWER");
		lblEventMouseViewer.setBounds(10, 129, 140, 13);
		contentPane.add(lblEventMouseViewer);
		
		textArea = new JTextArea();
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		textArea.setEditable(false);
		textArea.setBounds(149, 10, 285, 243);
		textArea.setBorder(border);
		textArea.addMouseListener(ml);
		contentPane.add(textArea);
		
		JButton button = new JButton("CLEAR");
		button.setBounds(10, 152, 85, 21);
		contentPane.add(button);
		
		button.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cleaner();
		}});
	}
	
	public void cleaner() {
		textArea.setText("");
		
	}
}
