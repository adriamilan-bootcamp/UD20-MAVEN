package Exercice08.Grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculadoraMonedas extends JFrame implements KeyListener,ActionListener{

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
	private JButton btnDelete;
	JButton btnCambiar;
	private JLabel lblEuro;
	private JLabel lblPts;
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
		tFieldCantidad.addKeyListener(this);
		
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
		btnEP.setActionCommand("cambiarMoneda");
		btnEP.addActionListener(this);
		btnEP.addKeyListener(this);
		contentPane.add(btnEP);
		
		//Boton para hacer el cambio de moneda
		btnCambiar = new JButton("Cambiar");
		btnCambiar.setBounds(233, 135, 89, 23);
		btnCambiar.setActionCommand("hacerCambio");
		btnCambiar.addActionListener(this);
		contentPane.add(btnCambiar);
		
		btnDelete = new JButton("Borrar");
		btnDelete.setBounds(173, 179, 89, 23);
		btnDelete.setActionCommand("borrar");
		btnDelete.addActionListener(this);
		
		contentPane.add(btnDelete);
		
		lblEuro = new JLabel("€");
		lblEuro.setBounds(190, 75, 46, 14);
		contentPane.add(lblEuro);
		
		lblPts = new JLabel("Pts");
		lblPts.setBounds(339, 75, 46, 14);
		contentPane.add(lblPts);
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
		lblEuro.setText("Pts");
		lblPts.setText("€");
	}
	
	public void pesetas() {
		cambio = true;
		btnEP.setText("Euros a Ptas");
		lblEuro.setText("€");
		lblPts.setText("Pts");
	}

	//Metodos que controlan las actions del teclado
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		//Cuando se presiona ENTER hacer la funcion del boton de cambiar
		if (KeyEvent.VK_ENTER==e.getKeyCode()){
			if (cambio) {
				String resultado = cambiarPta(tFieldCantidad);
				tFieldResultado.setText(resultado);
			}else {
				String resultado = cambiarEuro(tFieldCantidad);
				tFieldResultado.setText(resultado);
			}
		}
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	//Metodo que controla la action de los botones
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ("hacerCambio".equals(e.getActionCommand())) {
			if (cambio) {
				String resultado = cambiarPta(tFieldCantidad);
				tFieldResultado.setText(resultado);
			}else {
				String resultado = cambiarEuro(tFieldCantidad);
				tFieldResultado.setText(resultado);
			}
		}else if ("cambiarMoneda".equals(e.getActionCommand())) {
			if (cambio) {
				euros();
			}else {
				pesetas();
			}
		}else if ("borrar".equals(e.getActionCommand())) {
			tFieldCantidad.setText("");
			tFieldResultado.setText("");
		}
	}
}
