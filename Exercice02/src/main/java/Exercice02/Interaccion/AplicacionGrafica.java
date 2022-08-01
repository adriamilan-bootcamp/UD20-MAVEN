package Exercice02.Interaccion;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AplicacionGrafica extends JFrame {

	private JPanel contentPane;
	
	public AplicacionGrafica() {
		
		// Anadimos un titulo al programa
		setTitle("Exercice 02");
		
		// Coordenadas x y  de la aplicacion
		setBounds(400, 200, 275, 132);
		
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
		
		// Mensaje inicial
		final String message = "Has pulsado el boton:";
		// Label inicial
		JLabel textInfoBtn = new JLabel(message);
		textInfoBtn.setBounds(12, 12, 297, 15);
		contentPane.add(textInfoBtn);
		
		// Boton numero 1
		JButton boton1 = new JButton("Boton1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Label inicial + nombre del boton pulsado
				textInfoBtn.setText(message + " Boton1");
			}
		});
		boton1.setBounds(12, 39, 117, 25);
		contentPane.add(boton1);
		
		// Boton numero 2
		JButton boton2 = new JButton("Boton2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Label inicial + nombre del boton pulsado
				textInfoBtn.setText(message + " Boton2");
			}
		});
		boton2.setBounds(141, 39, 117, 25);
		contentPane.add(boton2);
		
	}
	
}
