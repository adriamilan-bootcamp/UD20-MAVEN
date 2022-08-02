package Exercise06.Exercise06;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class myBMI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private float weight;
	private float size;
	private float bmi = 0;



	/**
	 * Create the frame.
	 */
	public myBMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 176);
		setTitle("BODY MASS INDEX CALCULATOR");
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblEnterYourWeight = new JLabel("ENTER YOUR WEIGHT: ");
		lblEnterYourWeight.setBounds(10, 34, 138, 13);
		contentPane.add(lblEnterYourWeight);
		
		JLabel label_1 = new JLabel("ENTER YOUR SIZE:");
		label_1.setBounds(312, 34, 120, 13);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("BMI");
		label_2.setBounds(128, 85, 31, 13);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(169, 31, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(432, 31, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("CALCULATE");
		button.setBounds(10, 81, 108, 21);
		contentPane.add(button);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setBounds(169, 82, 359, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		button.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				weight = Float.parseFloat(textField.getText());
				size = Float.parseFloat(textField.getText());
				bmi = bmi(weight, size);
				String parsedBMI = String.valueOf(bmi);
				textField_2.setText(parsedBMI);
				
			}	

		});
		//
	}
	
	float bmi(Float weight, Float size){
		  return weight/(size*size);
		}
}
