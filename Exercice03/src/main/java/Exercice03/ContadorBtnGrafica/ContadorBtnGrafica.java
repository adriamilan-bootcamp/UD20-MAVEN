package Exercice03.ContadorBtnGrafica;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContadorBtnGrafica extends JFrame {

	private JPanel contentPane;
	
	public ContadorBtnGrafica() {

		// Anadimos un titulo al programa
		setTitle("Exercice 03");
		
		// Coordenadas x y  de la aplicacion
		setBounds(400, 200, 290, 100);
		
		// Indica cuando se cierra la ventana se cierra la aplicacion
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Hace visible la ventana
		setVisible(true);
		
		// Creamos el panel
		contentPane = new JPanel();
		
		// Indicamos el diseno del panel
		contentPane.setLayout(null);
		
		// Asignamos el panel a la ventana
		setContentPane(contentPane);
		
		// Declaramos una constante mensaje para el boton 1
		final String message1 = "Boton1:";
		// Anadimos un Label para mostrar el mensaje
		JLabel textBtn1 = new JLabel(message1);
		textBtn1.setBounds(12, 12, 126, 15);
		contentPane.add(textBtn1);
		
		// Declaramos una constante mensaje para el boton 2
		final String message2 = "Boton2:";
		// Anadimos un Label para mostrar el mensaje
		JLabel textBtn2 = new JLabel(message2);
		textBtn2.setBounds(150, 12, 126, 15);
		contentPane.add(textBtn2);
		
		JButton btn1 = new JButton("Boton1");
		btn1.addActionListener(new ActionListener() {
			// Declaramos un contador para el boton1
			int counter = 0;
			public void actionPerformed(ActionEvent e) {
				/*
				 *  Cada vez que iniciemos el evento del boton 1
				 *  - Sumamos 1 al contador
				 *  - Mostramos el mensaje + el valor del contador
				 */
				counter += 1;
				textBtn1.setText(message1 + " " + counter + " veces");
			}
		});
		btn1.setBounds(12, 30, 117, 25);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Boton2");
		btn2.addActionListener(new ActionListener() {
			// Declaramos un contador para el boton2
			int counter = 0;
			public void actionPerformed(ActionEvent e) {
				/*
				 *  Cada vez que iniciemos el evento del boton 2
				 *  - Sumamos 1 al contador
				 *  - Mostramos el mensaje + el valor del contador
				 */
				counter += 1;
				textBtn2.setText(message2 + " " + counter + " veces");
			}
		});
		btn2.setBounds(150, 30, 117, 25);
		contentPane.add(btn2);
		
	}
	
}
