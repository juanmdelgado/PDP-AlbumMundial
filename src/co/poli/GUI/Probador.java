package co.poli.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;

public class Probador extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtFldNroLam;
	private JTextField txtFldNombre;
	
	private String[] posicion = {"Seleccionar","Arquero","Defensa","Mediocampista","Delantero"};
	private JTextField txtFldEdad;
	private JTextField txtFldEstatura;
	private JTextField txtFldPrtdoIntnal;
	private JTextField txtFldFechaPartido;
	private JTextField txtFldDoB;
	private JTextField txtFldClub;
	private JTextField txtFldPaisClub;
	private JTextField txtFldImgPthJugador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Probador frame = new Probador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Probador() {
		setTitle("Probador");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JInternalFrame intFrmAddJugador = new JInternalFrame("Adicionar jugador");
		intFrmAddJugador.setBounds(10, 10, 610, 370);
		contentPane.add(intFrmAddJugador);
		intFrmAddJugador.getContentPane().setLayout(null);
		
		JLabel lblNroLamina = new JLabel("N\u00FAmero L\u00E1mina");
		lblNroLamina.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNroLamina.setBounds(10, 10, 90, 14);
		intFrmAddJugador.getContentPane().add(lblNroLamina);
		
		txtFldNroLam = new JTextField();
		txtFldNroLam.setBounds(115, 7, 46, 20);
		intFrmAddJugador.getContentPane().add(txtFldNroLam);
		txtFldNroLam.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 35, 46, 14);
		intFrmAddJugador.getContentPane().add(lblNombre);
		
		txtFldNombre = new JTextField();
		txtFldNombre.setBounds(115, 32, 223, 20);
		intFrmAddJugador.getContentPane().add(txtFldNombre);
		txtFldNombre.setColumns(10);
		
		JLabel lblPosicin = new JLabel("Posici\u00F3n");
		lblPosicin.setBounds(10, 60, 56, 14);
		intFrmAddJugador.getContentPane().add(lblPosicin);
		
		final JComboBox<String> cmbBoxPosicion = new JComboBox<String>();
		cmbBoxPosicion.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Arquero", "Defensa", "Mediocampista", "Delantero"}));
		cmbBoxPosicion.setSelectedIndex(0);
		// cmbBoxPosicion.setSelectedIndex(0);
		cmbBoxPosicion.setBounds(115, 57, 223, 20);
		intFrmAddJugador.getContentPane().add(cmbBoxPosicion);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 85, 46, 14);
		intFrmAddJugador.getContentPane().add(lblEdad);
		
		txtFldEdad = new JTextField();
		txtFldEdad.setBounds(115, 82, 86, 20);
		intFrmAddJugador.getContentPane().add(txtFldEdad);
		txtFldEdad.setColumns(10);
		
		JLabel lblAge = new JLabel("a\u00F1os");
		lblAge.setBounds(207, 85, 46, 14);
		intFrmAddJugador.getContentPane().add(lblAge);
		
		JLabel lblEstatura = new JLabel("Estatura");
		lblEstatura.setBounds(10, 110, 56, 14);
		intFrmAddJugador.getContentPane().add(lblEstatura);
		
		txtFldEstatura = new JTextField();
		txtFldEstatura.setBounds(115, 107, 86, 20);
		intFrmAddJugador.getContentPane().add(txtFldEstatura);
		txtFldEstatura.setColumns(10);
		
		JLabel lblCentimetros = new JLabel("cent\u00EDmetros");
		lblCentimetros.setBounds(207, 110, 72, 14);
		intFrmAddJugador.getContentPane().add(lblCentimetros);
		
		JLabel lblPrtdoIntnal = new JLabel("1er Partido Internacional");
		lblPrtdoIntnal.setBounds(10, 135, 150, 14);
		intFrmAddJugador.getContentPane().add(lblPrtdoIntnal);
		
		txtFldPrtdoIntnal = new JTextField();
		txtFldPrtdoIntnal.setBounds(188, 132, 150, 20);
		intFrmAddJugador.getContentPane().add(txtFldPrtdoIntnal);
		txtFldPrtdoIntnal.setColumns(10);
		
		JLabel lblFechaPartido = new JLabel("Fecha 1er Partido Internacional");
		lblFechaPartido.setBounds(10, 160, 180, 14);
		intFrmAddJugador.getContentPane().add(lblFechaPartido);
		
		txtFldFechaPartido = new JTextField();
		txtFldFechaPartido.setBounds(197, 157, 86, 20);
		intFrmAddJugador.getContentPane().add(txtFldFechaPartido);
		txtFldFechaPartido.setColumns(10);
		
		JLabel lblDoB = new JLabel("Fecha de nacimiento");
		lblDoB.setBounds(10, 185, 124, 14);
		intFrmAddJugador.getContentPane().add(lblDoB);
		
		txtFldDoB = new JTextField();
		txtFldDoB.setBounds(155, 182, 86, 20);
		intFrmAddJugador.getContentPane().add(txtFldDoB);
		txtFldDoB.setColumns(10);
		
		JLabel lblClub = new JLabel("Club actual");
		lblClub.setBounds(10, 210, 80, 14);
		intFrmAddJugador.getContentPane().add(lblClub);
		
		txtFldClub = new JTextField();
		txtFldClub.setBounds(115, 207, 223, 20);
		intFrmAddJugador.getContentPane().add(txtFldClub);
		txtFldClub.setColumns(10);
		
		JLabel lblPaisClub = new JLabel("Pa\u00EDs Club actual");
		lblPaisClub.setBounds(10, 235, 100, 14);
		intFrmAddJugador.getContentPane().add(lblPaisClub);
		
		txtFldPaisClub = new JTextField();
		txtFldPaisClub.setBounds(115, 232, 223, 20);
		intFrmAddJugador.getContentPane().add(txtFldPaisClub);
		txtFldPaisClub.setColumns(10);
		
		JLabel lblImgPthJugador = new JLabel("Ruta archivo imagen");
		lblImgPthJugador.setBounds(10, 260, 124, 14);
		intFrmAddJugador.getContentPane().add(lblImgPthJugador);
		
		txtFldImgPthJugador = new JTextField();
		txtFldImgPthJugador.setBounds(10, 276, 231, 20);
		intFrmAddJugador.getContentPane().add(txtFldImgPthJugador);
		txtFldImgPthJugador.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnBuscar.setBounds(249, 275, 89, 23);
		intFrmAddJugador.getContentPane().add(btnBuscar);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(10, 307, 89, 23);
		intFrmAddJugador.getContentPane().add(btnAgregar);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtFldNroLam.setText(null);
				txtFldNombre.setText(null);
				cmbBoxPosicion.setSelectedIndex(0);
				txtFldEdad.setText(null);
				txtFldEstatura.setText(null);
				txtFldPrtdoIntnal.setText(null);
				txtFldFechaPartido.setText(null);
				txtFldDoB.setText(null);
				txtFldClub.setText(null);
				txtFldPaisClub.setText(null);
				txtFldImgPthJugador.setText(null);
			}
		});
		btnReiniciar.setBounds(134, 307, 89, 23);
		intFrmAddJugador.getContentPane().add(btnReiniciar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					intFrmAddJugador.setClosed(true);
				} catch (PropertyVetoException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCancelar.setBounds(249, 307, 89, 23);
		intFrmAddJugador.getContentPane().add(btnCancelar);
		intFrmAddJugador.setVisible(true);
		
		JPanel imgCreaJug = new JPanel();
		imgCreaJug.setBounds(344, 11, 246, 315);
		intFrmAddJugador.getContentPane().add(imgCreaJug);
		intFrmAddJugador.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
