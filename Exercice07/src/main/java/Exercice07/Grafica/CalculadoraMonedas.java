package Exercice07.Grafica;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;

public class CalculadoraMonedas extends JFrame {

	private JPanel contentPane;
	JTextField tFieldCantidad;
	JTextField tFieldResultado;
	
	//Constantes del conversor
	final double PTAS = 166.386;
	final double EURO = 1/166.386;
	
	//Boleano para el control del tipo de moneda de cambio
	boolean cambio = true;
	JButton btnEP;
	
	DecimalFormat formato1 = new DecimalFormat("0.00");
	/**
	 * Create the frame.
	 */
	public CalculadoraMonedas() {
		setTitle("Calculadora cambio de monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblCantidad = new JLabel("Cantidad a convertir");
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setBounds(73, 38, 128, 23);
		contentPane.add(lblCantidad);
		
		tFieldCantidad = new JTextField();
		tFieldCantidad.setBounds(94, 72, 86, 20);
		contentPane.add(tFieldCantidad);
		tFieldCantidad.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(233, 38, 111, 23);
		contentPane.add(lblResultado);
		
		tFieldResultado = new JTextField();
		tFieldResultado.setBounds(243, 72, 86, 20);
		contentPane.add(tFieldResultado);
		tFieldResultado.setColumns(10);
		
		//Boton para cambiar el tipo de moneda de cambio
		btnEP = new JButton("Euros a ptas");
		btnEP.setBounds(94, 135, 118, 23);
		btnEP.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//Cambio el estado del booleano para cambiar el tipo de moneda de cambio
				//Setteo el texto del boton
				if (cambio) {
					euros();
				}else {
					pesetas();
				}
				
			}
		});
		
		contentPane.add(btnEP);
		
		//Boton para hacer el cambio de moneda
		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.setBounds(233, 135, 89, 23);
		btnCambiar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//Con un booleano guardo el tipo de cambio que estoy haciendo y llamo a uno u otro metodo
				if (cambio) {
					String resultado = cambiarPta(tFieldCantidad);
					tFieldResultado.setText(resultado);
				}else {
					String resultado = cambiarEuro(tFieldCantidad);
					tFieldResultado.setText(resultado);
				}
				
			}
		});
		
		contentPane.add(btnCambiar);
	}
	
	//Conversor de euros a pesetas
	public String cambiarPta (JTextField cantidad) {
		try {
			double moneda = Double.parseDouble(cantidad.getText());
			return formato1.format(moneda*PTAS);
		} catch (Exception e) {
			return "0";
		}
		
	}
	
	//Conversor de pesetas a euros
	public String cambiarEuro (JTextField cantidad) {
		try {
			double moneda = Double.parseDouble(cantidad.getText());
			return formato1.format(moneda*EURO);
		} catch (Exception e) {
			return "0";
		}
	}
	
	public void euros() {
		cambio = false;
		btnEP.setText("Ptas a euros");
	}
	
	public void pesetas() {
		cambio = true;
		btnEP.setText("Euros a Ptas");
	}
}
