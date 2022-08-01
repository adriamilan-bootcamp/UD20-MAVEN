package Exercice01.Grafica;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Grafica extends JFrame {

	private JPanel contentPane;
	
	public Grafica() {
		
		// Anadimos un titulo al programa
		setTitle("Exercice 01");
		
		// Coordenadas x y  de la aplicacion
		setBounds(400, 200, 400, 196);
		
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
		
		// Boton para restaurar las dimensiones del programa
		JButton restaurar = new JButton("Restaurar");
		restaurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setSize(400,196);
				setExtendedState(JFrame.NORMAL);
			}
		});
		restaurar.setBounds(12, 12, 117, 25);
		contentPane.add(restaurar);
		
		// Boton para maximizar el programa
		JButton maximizar = new JButton("Maximizar");
		maximizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(MAXIMIZED_BOTH);
			}
		});
		maximizar.setBounds(141, 12, 117, 25);
		contentPane.add(maximizar);
		
		// Boton para cerrar el programa
		JButton cerrar = new JButton("Cerrar");
		cerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		cerrar.setBounds(270, 12, 117, 25);
		contentPane.add(cerrar);
		
		// TextPanel Width
		JTextPane cordX = new JTextPane();
		cordX.setBounds(12, 83, 117, 25);
		contentPane.add(cordX);
		
		// Texto Informativo
		JLabel lblCordX = new JLabel("Width");
		lblCordX.setBounds(12, 65, 70, 15);
		contentPane.add(lblCordX);
		
		// TextPanel Height
		JTextPane cordY = new JTextPane();
		cordY.setBounds(141, 83, 117, 25);
		contentPane.add(cordY);
		
		// Texto Informativo
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(141, 65, 70, 15);
		contentPane.add(lblHeight);
		
		// Boton para establecer las dimensiones que el usuario ha decidido
		JButton btnEstablecer = new JButton("Establecer");
		btnEstablecer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Establecemos las dimensiones
				setSize(Integer.parseInt(cordX.getText()), Integer.parseInt(cordY.getText()));
			}
		});
		btnEstablecer.setBounds(270, 83, 117, 25);
		contentPane.add(btnEstablecer);
		
	}
}
