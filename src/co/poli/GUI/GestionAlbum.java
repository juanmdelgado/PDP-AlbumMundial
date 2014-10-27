package co.poli.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class GestionAlbum extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtFldNombre;
	private JTextField txtFldNroLam;
	private JTextField txtFldEdad;
	private JTextField txtFldEstatura;
	private JTextField txtFldPrtdoIntnal;
	private JTextField txtFldFechaPartido;
	private JTextField txtFldDoB;
	private JTextField txtFldClub;
	private JTextField txtFldPaisClub;
	private JTextField txtFldImgPthJugador;
	private JTextField txtFldNroEquipo;
	private JTextField txtFldNomEquipo;
	private JTextField txtFldPthImgEquipo;
	private JTextField txtFldNroEscudo;
	private JTextField txtFldNomEscudo;
	private JTextField txtFldPthImgEscudo;
	private JTextField txtFldNroEstadio;
	private JTextField txtFldNomEstadio;
	private JTextField txtFldPathImgStdm;
	private JTextField txtFldCiudad;
	private JTextField txtFldCapacidad;
	private JTextField txtFldFechaConstr;
	private JTextField txtFldNroBorrar;
	private JTextField txtFldNomBorrar;
	private JTextField txtFldClaseLamina;
	private JTextField txtFldNomModJug;
	private JTextField txtFldNroModJug;
	private JTextField txtFldEdadModJug;
	private JTextField txtFldHghtModJug;
	private JTextField txtFldFGModJug;
	private JTextField txtFldDateFGModJug;
	private JTextField txtFldDoBModJug;
	private JTextField txtFldClubModJug;
	private JTextField txtFldPCModJug;
	private JTextField txtFldImgPthModJug;
	private JTextField txtFldNroEqpMod;
	private JTextField txtFldNomEqpMod;
	private JTextField txtFldImgPthEqpMod;
	private JTextField txtFldNroModEscudo;
	private JTextField txtFldNomModEscudo;
	private JTextField txtFldImgPthModEscudo;
	private JTextField txtFldModEstadio;
	private JTextField txtFldNomModEstadio;
	private JTextField txtFldImgPthModEstadio;
	private JTextField txtFldCiuModEstadio;
	private JTextField txtFldCapModEstadio;
	private JTextField txtFldDateModEstadio;
	private String[] posicion = {"Seleccionar","Arquero","Defensa","Mediocampista","Delantero"};
	
	

	public GestionAlbum() {
		super("Gesti\u00F3n de datos del Album FIFA 2014");
		this.initialize();
	}
	
	public void initialize(){
		// setTitle("Gesti\u00F3n de datos del Album FIFA 2014");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		setJMenuBar(crearMenuBar());
	}
	
	protected JMenuBar crearMenuBar(){
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAdicionar = new JMenu("Adicionar");
		menuBar.add(mnAdicionar);
		
		JMenuItem itmAddJugador = new JMenuItem("Jugador");
		itmAddJugador.setActionCommand("AddJugador");
		itmAddJugador.addActionListener(this);
		mnAdicionar.add(itmAddJugador);
		
		JMenuItem itmAddEquipo = new JMenuItem("Equipo");
		itmAddEquipo.setActionCommand("AddEquipo");
		itmAddEquipo.addActionListener(this);
		mnAdicionar.add(itmAddEquipo);
		
		JMenuItem itmAddEscudo = new JMenuItem("Escudo");
		itmAddEscudo.setActionCommand("AddEscudo");
		itmAddEscudo.addActionListener(this);
		mnAdicionar.add(itmAddEscudo);
		
		JMenuItem itmAddEstadio = new JMenuItem("Estadio");
		itmAddEstadio.setActionCommand("AddEstadio");
		itmAddEstadio.addActionListener(this);
		mnAdicionar.add(itmAddEstadio);
		
		JMenu mnModificar = new JMenu("Modificar");
		menuBar.add(mnModificar);
		
		JMenuItem itmModJugador = new JMenuItem("Jugador");
		itmModJugador.setActionCommand("ModJugador");
		itmModJugador.addActionListener(this);
		mnModificar.add(itmModJugador);
		
		JMenuItem itmModEquipo = new JMenuItem("Equipo");
		itmModEquipo.setActionCommand("ModEquipo");
		itmModEquipo.addActionListener(this);
		mnModificar.add(itmModEquipo);
		
		JMenuItem itmModEscudo = new JMenuItem("Escudo");
		itmModEscudo.setActionCommand("ModEscudo");
		itmModEscudo.addActionListener(this);
		mnModificar.add(itmModEscudo);
		
		JMenuItem itmModEstadio = new JMenuItem("Estadio");
		itmModEstadio.setActionCommand("ModEstadio");
		itmModEstadio.addActionListener(this);
		mnModificar.add(itmModEstadio);
		
		JMenu mnEliminar = new JMenu("Eliminar");
		menuBar.add(mnEliminar);
		
		JMenuItem itmBorraLamina = new JMenuItem("Eliminar Lamina");
		itmBorraLamina.setActionCommand("Borrar");
		itmBorraLamina.addActionListener(this);
		mnEliminar.add(itmBorraLamina);
		
		JMenu mnSalir = new JMenu("Salir");
		menuBar.add(mnSalir);
		
		JMenuItem itmSalir = new JMenuItem("Salir Gestionador");
		itmSalir.setActionCommand("Salir");
		itmSalir.addActionListener(this);
		mnSalir.add(itmSalir);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		return menuBar;		
	}
	
	protected void crearAdicionaJugador(){
		
		final JInternalFrame intFrmAddJugador = new JInternalFrame("Adicionar jugador");
		intFrmAddJugador.setBounds(10, 10, 610, 370);
		contentPane.add(intFrmAddJugador);
		intFrmAddJugador.getContentPane().setLayout(null);
		
		JLabel lblNroLamina = new JLabel("N\u00FAmero L\u00E1mina");
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
		
		final JComboBox<String> cmbBoxPosicion = new JComboBox<String>(posicion);
		cmbBoxPosicion.setSelectedIndex(0);
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
		
		JButton btnVisualizar = new JButton("Visualizar");
		btnVisualizar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnVisualizar.setBounds(249, 275, 89, 23);
		intFrmAddJugador.getContentPane().add(btnVisualizar);
		intFrmAddJugador.setVisible(true);

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
		imgCreaJug.setBounds(348, 11, 246, 315);
		intFrmAddJugador.getContentPane().add(imgCreaJug);
		intFrmAddJugador.setVisible(true);
	}
		
	protected void crearModificarJugador(){
		final JInternalFrame intFrmModJugador = new JInternalFrame("Modificar Jugador");
		intFrmModJugador.setBounds(10, 10, 515, 409);
		contentPane.add(intFrmModJugador);
		intFrmModJugador.getContentPane().setLayout(null);
		
		JLabel lblNroModJug = new JLabel("N\u00FAmero L\u00E1mina");
		lblNroModJug.setBounds(10, 11, 85, 14);
		intFrmModJugador.getContentPane().add(lblNroModJug);
		
		txtFldNroModJug = new JTextField();
		txtFldNroModJug.setColumns(10);
		txtFldNroModJug.setBounds(92, 8, 46, 20);
		intFrmModJugador.getContentPane().add(txtFldNroModJug);
		
		JButton btnSrchModJug = new JButton("Consultar");
		btnSrchModJug.setBounds(148, 7, 78, 23);
		intFrmModJugador.getContentPane().add(btnSrchModJug);
		
		JLabel lblNomModJug = new JLabel("Nombre");
		lblNomModJug.setBounds(10, 24, 46, 14);
		intFrmModJugador.getContentPane().add(lblNomModJug);
		
		txtFldNomModJug = new JTextField();
		txtFldNomModJug.setColumns(10);
		txtFldNomModJug.setBounds(10, 38, 223, 20);
		intFrmModJugador.getContentPane().add(txtFldNomModJug);
		
		JLabel lblPosModJug = new JLabel("Posici\u00F3n");
		lblPosModJug.setBounds(10, 60, 46, 14);
		intFrmModJugador.getContentPane().add(lblPosModJug);
		
		final JComboBox<String> cmbBoxPosModJug = new JComboBox<String>(posicion);
		cmbBoxPosModJug.setSelectedIndex(0);
		cmbBoxPosModJug.setBounds(10, 74, 223, 20);
		intFrmModJugador.getContentPane().add(cmbBoxPosModJug);
		
		JLabel lblEdadModJug = new JLabel("Edad");
		lblEdadModJug.setBounds(10, 101, 46, 14);
		intFrmModJugador.getContentPane().add(lblEdadModJug);
		
		txtFldEdadModJug = new JTextField();
		txtFldEdadModJug.setColumns(10);
		txtFldEdadModJug.setBounds(62, 98, 86, 20);
		intFrmModJugador.getContentPane().add(txtFldEdadModJug);
		
		JLabel lblAgeModJug = new JLabel("a\u00F1os");
		lblAgeModJug.setBounds(158, 101, 46, 14);
		intFrmModJugador.getContentPane().add(lblAgeModJug);
		
		JLabel lblHghtModJug = new JLabel("Estatura");
		lblHghtModJug.setBounds(10, 129, 46, 14);
		intFrmModJugador.getContentPane().add(lblHghtModJug);
		
		txtFldHghtModJug = new JTextField();
		txtFldHghtModJug.setColumns(10);
		txtFldHghtModJug.setBounds(62, 126, 86, 20);
		intFrmModJugador.getContentPane().add(txtFldHghtModJug);
		
		JLabel lblCmModJug = new JLabel("cent\u00EDmetros");
		lblCmModJug.setBounds(158, 129, 72, 14);
		intFrmModJugador.getContentPane().add(lblCmModJug);
		
		JLabel lblFGModJug = new JLabel("1er Partido Internacional");
		lblFGModJug.setBounds(10, 151, 130, 14);
		intFrmModJugador.getContentPane().add(lblFGModJug);
		
		txtFldFGModJug = new JTextField();
		txtFldFGModJug.setText("");
		txtFldFGModJug.setColumns(10);
		txtFldFGModJug.setBounds(10, 164, 150, 20);
		intFrmModJugador.getContentPane().add(txtFldFGModJug);
		
		JLabel lblDateFGModJug = new JLabel("Fecha 1er Partido Internacional");
		lblDateFGModJug.setBounds(10, 186, 161, 14);
		intFrmModJugador.getContentPane().add(lblDateFGModJug);
		
		txtFldDateFGModJug = new JTextField();
		txtFldDateFGModJug.setText("");
		txtFldDateFGModJug.setColumns(10);
		txtFldDateFGModJug.setBounds(10, 200, 86, 20);
		intFrmModJugador.getContentPane().add(txtFldDateFGModJug);
		
		JLabel llbDoBModJug = new JLabel("Fecha de nacimiento");
		llbDoBModJug.setBounds(10, 222, 104, 14);
		intFrmModJugador.getContentPane().add(llbDoBModJug);
		
		txtFldDoBModJug = new JTextField();
		txtFldDoBModJug.setColumns(10);
		txtFldDoBModJug.setBounds(10, 236, 86, 20);
		intFrmModJugador.getContentPane().add(txtFldDoBModJug);
		
		JLabel lblClubModJug = new JLabel("Club actual");
		lblClubModJug.setBounds(10, 258, 60, 14);
		intFrmModJugador.getContentPane().add(lblClubModJug);
		
		txtFldClubModJug = new JTextField();
		txtFldClubModJug.setColumns(10);
		txtFldClubModJug.setBounds(10, 272, 223, 20);
		intFrmModJugador.getContentPane().add(txtFldClubModJug);
		
		JLabel lblPaisClubModJug = new JLabel("Pa\u00EDs Club actual");
		lblPaisClubModJug.setBounds(10, 293, 85, 14);
		intFrmModJugador.getContentPane().add(lblPaisClubModJug);
		
		txtFldPCModJug = new JTextField();
		txtFldPCModJug.setColumns(10);
		txtFldPCModJug.setBounds(10, 307, 223, 20);
		intFrmModJugador.getContentPane().add(txtFldPCModJug);
		
		JLabel lblImgPthModJug = new JLabel("Ruta archivo imagen");
		lblImgPthModJug.setBounds(10, 329, 104, 14);
		intFrmModJugador.getContentPane().add(lblImgPthModJug);
		
		txtFldImgPthModJug = new JTextField();
		txtFldImgPthModJug.setColumns(10);
		txtFldImgPthModJug.setBounds(10, 344, 223, 20);
		intFrmModJugador.getContentPane().add(txtFldImgPthModJug);
		
		JButton btnAcptModJug = new JButton("Aceptar");
		btnAcptModJug.setBounds(243, 343, 72, 23);
		intFrmModJugador.getContentPane().add(btnAcptModJug);
		
		JButton btnClrModJug = new JButton("Reiniciar");
		btnClrModJug.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtFldNomModJug.setText(null);
				cmbBoxPosModJug.setSelectedIndex(0);
				txtFldEdadModJug.setText(null);
				txtFldHghtModJug.setText(null);
				txtFldFGModJug.setText(null);
				txtFldDateFGModJug.setText(null);
				txtFldDoBModJug.setText(null);
				txtFldClubModJug.setText(null);
				txtFldPCModJug.setText(null);
				txtFldImgPthModJug.setText(null);
			}
		});
		btnClrModJug.setBounds(328, 343, 72, 23);
		intFrmModJugador.getContentPane().add(btnClrModJug);
		
		JButton btnCnclModJug = new JButton("Cancelar");
		btnCnclModJug.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					intFrmModJugador.setClosed(true);
				} catch (PropertyVetoException e1) {
					e1.printStackTrace();
				}				
			}
		});
		btnCnclModJug.setBounds(410, 343, 79, 23);
		intFrmModJugador.getContentPane().add(btnCnclModJug);
		
		JPanel imgModJug = new JPanel();
		imgModJug.setBounds(243, 11, 246, 315);
		intFrmModJugador.getContentPane().add(imgModJug);
		intFrmModJugador.setVisible(true);
	}
	
	protected void crearAdicionarEquipo(){	
		final JInternalFrame intFrmAddEquipo = new JInternalFrame("Adicionar Equipo");
		intFrmAddEquipo.setBounds(10, 10, 365, 150);
		contentPane.add(intFrmAddEquipo);
		intFrmAddEquipo.getContentPane().setLayout(null);
		
		JLabel lblNroEquipo = new JLabel("N\u00FAmero L\u00E1mina");
		lblNroEquipo.setBounds(10, 14, 85, 14);
		intFrmAddEquipo.getContentPane().add(lblNroEquipo);
		
		txtFldNroEquipo = new JTextField();
		txtFldNroEquipo.setColumns(10);
		txtFldNroEquipo.setBounds(115, 11, 46, 20);
		intFrmAddEquipo.getContentPane().add(txtFldNroEquipo);
		
		JLabel lblNomEquipo = new JLabel("Nombre");
		lblNomEquipo.setBounds(10, 39, 46, 14);
		intFrmAddEquipo.getContentPane().add(lblNomEquipo);
		
		txtFldNomEquipo = new JTextField();
		txtFldNomEquipo.setColumns(10);
		txtFldNomEquipo.setBounds(115, 36, 223, 20);
		intFrmAddEquipo.getContentPane().add(txtFldNomEquipo);
		
		JLabel lblPthImgEquipo = new JLabel("Ruta archivo imagen");
		lblPthImgEquipo.setBounds(10, 64, 104, 14);
		intFrmAddEquipo.getContentPane().add(lblPthImgEquipo);
		
		txtFldPthImgEquipo = new JTextField();
		txtFldPthImgEquipo.setColumns(10);
		txtFldPthImgEquipo.setBounds(115, 61, 223, 20);
		intFrmAddEquipo.getContentPane().add(txtFldPthImgEquipo);
		
		JButton btnAddEquipo = new JButton("Agregar");
		btnAddEquipo.setBounds(10, 92, 89, 23);
		intFrmAddEquipo.getContentPane().add(btnAddEquipo);
		
		JButton btnClearEquipo = new JButton("Reiniciar");
		btnClearEquipo.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtFldNroEquipo.setText(null);
				txtFldNomEquipo.setText(null);
				txtFldPthImgEquipo.setText(null);
			}
		});
		btnClearEquipo.setBounds(134, 92, 89, 23);
		intFrmAddEquipo.getContentPane().add(btnClearEquipo);
		
		JButton btnCancelEquipo = new JButton("Cancelar");
		btnCancelEquipo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					intFrmAddEquipo.setClosed(true);
				} catch (PropertyVetoException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCancelEquipo.setBounds(249, 92, 89, 23);
		intFrmAddEquipo.getContentPane().add(btnCancelEquipo);
		intFrmAddEquipo.setVisible(true);
	}
	
	protected void crearModificarEquipo(){
		final JInternalFrame intFrmModEquipo = new JInternalFrame("Modificar Equipo");
		intFrmModEquipo.setBounds(10, 10, 515, 379);
		contentPane.add(intFrmModEquipo);
		intFrmModEquipo.getContentPane().setLayout(null);
		
		JLabel lblNroEqpMod = new JLabel("N\u00FAmero");
		lblNroEqpMod.setBounds(10, 11, 46, 14);
		intFrmModEquipo.getContentPane().add(lblNroEqpMod);
		
		txtFldNroEqpMod = new JTextField();
		txtFldNroEqpMod.setColumns(10);
		txtFldNroEqpMod.setBounds(10, 29, 51, 20);
		intFrmModEquipo.getContentPane().add(txtFldNroEqpMod);
		
		JButton btnConsEqpMod = new JButton("Consultar");
		btnConsEqpMod.setBounds(74, 28, 89, 23);
		intFrmModEquipo.getContentPane().add(btnConsEqpMod);
		
		JLabel lblNomEqpMod = new JLabel("Nombre");
		lblNomEqpMod.setBounds(10, 60, 46, 14);
		intFrmModEquipo.getContentPane().add(lblNomEqpMod);
		
		txtFldNomEqpMod = new JTextField();
		txtFldNomEqpMod.setColumns(10);
		txtFldNomEqpMod.setBounds(10, 82, 165, 20);
		intFrmModEquipo.getContentPane().add(txtFldNomEqpMod);
		
		JLabel lblImgPthEqpMod = new JLabel("Ruta Archivo Imagen");
		lblImgPthEqpMod.setBounds(10, 113, 116, 14);
		intFrmModEquipo.getContentPane().add(lblImgPthEqpMod);
		
		txtFldImgPthEqpMod = new JTextField();
		txtFldImgPthEqpMod.setColumns(10);
		txtFldImgPthEqpMod.setBounds(10, 138, 165, 20);
		intFrmModEquipo.getContentPane().add(txtFldImgPthEqpMod);
		
		JButton btnAcpEqpMod = new JButton("Aceptar");
		btnAcpEqpMod.setBounds(46, 184, 89, 23);
		intFrmModEquipo.getContentPane().add(btnAcpEqpMod);
		
		JButton btnClrEqpMod = new JButton("Reiniciar");
		btnClrEqpMod.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtFldNroEqpMod.setText(null);
				txtFldNomEqpMod.setText(null);
				txtFldImgPthEqpMod.setText(null);
			}
		});
		btnClrEqpMod.setBounds(46, 229, 89, 23);
		intFrmModEquipo.getContentPane().add(btnClrEqpMod);
		
		JButton btnCnlEqpMod = new JButton("Cancelar");
		btnCnlEqpMod.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					intFrmModEquipo.setClosed(true);
				} catch (PropertyVetoException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCnlEqpMod.setBounds(46, 278, 89, 23);
		intFrmModEquipo.getContentPane().add(btnCnlEqpMod);
		
		JPanel imgModEquipo = new JPanel();
		imgModEquipo.setBounds(190, 11, 300, 330);
		intFrmModEquipo.getContentPane().add(imgModEquipo);
		imgModEquipo.setLayout(new BorderLayout(0, 0));
		intFrmModEquipo.setVisible(true);
	}
	
	protected void crearAdicionarEscudo(){
		final JInternalFrame intFrmAddEscudo = new JInternalFrame("Adicionar Escudo");
		intFrmAddEscudo.setBounds(10, 10, 365, 150);
		contentPane.add(intFrmAddEscudo);
		intFrmAddEscudo.getContentPane().setLayout(null);
		
		JLabel lblNroEscudo = new JLabel("N\u00FAmero L\u00E1mina");
		lblNroEscudo.setBounds(10, 14, 85, 14);
		intFrmAddEscudo.getContentPane().add(lblNroEscudo);
		
		txtFldNroEscudo = new JTextField();
		txtFldNroEscudo.setColumns(10);
		txtFldNroEscudo.setBounds(115, 11, 46, 20);
		intFrmAddEscudo.getContentPane().add(txtFldNroEscudo);
		
		JLabel lblNomEscudo = new JLabel("Nombre");
		lblNomEscudo.setBounds(10, 39, 46, 14);
		intFrmAddEscudo.getContentPane().add(lblNomEscudo);
		
		txtFldNomEscudo = new JTextField();
		txtFldNomEscudo.setColumns(10);
		txtFldNomEscudo.setBounds(115, 36, 223, 20);
		intFrmAddEscudo.getContentPane().add(txtFldNomEscudo);
		
		JLabel lblPthImgEscudo = new JLabel("Ruta archivo imagen");
		lblPthImgEscudo.setBounds(10, 64, 104, 14);
		intFrmAddEscudo.getContentPane().add(lblPthImgEscudo);
		
		txtFldPthImgEscudo = new JTextField();
		txtFldPthImgEscudo.setColumns(10);
		txtFldPthImgEscudo.setBounds(115, 61, 223, 20);
		intFrmAddEscudo.getContentPane().add(txtFldPthImgEscudo);
		
		JButton btnAddEscudo = new JButton("Agregar");
		btnAddEscudo.setBounds(10, 92, 89, 23);
		intFrmAddEscudo.getContentPane().add(btnAddEscudo);
		
		JButton btnClearEscudo = new JButton("Reiniciar");
		btnClearEscudo.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtFldNroEscudo.setText(null);
				txtFldNomEscudo.setText(null);
				txtFldPthImgEscudo.setText(null);
			}
		});
		btnClearEscudo.setBounds(134, 92, 89, 23);
		intFrmAddEscudo.getContentPane().add(btnClearEscudo);
		
		JButton btnCancelEscudo = new JButton("Cancelar");
		btnCancelEscudo.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					intFrmAddEscudo.setClosed(true);
				} catch (PropertyVetoException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCancelEscudo.setBounds(249, 92, 89, 23);
		intFrmAddEscudo.getContentPane().add(btnCancelEscudo);
		intFrmAddEscudo.setVisible(true);
	}
	
	protected void crearModificarEscudo(){	
		final JInternalFrame intFrmModEscudo = new JInternalFrame("Modificar Escudo");
		intFrmModEscudo.setBounds(10, 10, 515, 386);
		contentPane.add(intFrmModEscudo);
		intFrmModEscudo.getContentPane().setLayout(null);
		
		JLabel lblNroModEscudo = new JLabel("N\u00FAmero");
		lblNroModEscudo.setBounds(10, 11, 46, 14);
		intFrmModEscudo.getContentPane().add(lblNroModEscudo);
		
		txtFldNroModEscudo = new JTextField();
		txtFldNroModEscudo.setColumns(10);
		txtFldNroModEscudo.setBounds(10, 29, 51, 20);
		intFrmModEscudo.getContentPane().add(txtFldNroModEscudo);
		
		JButton btnSchModEscudo = new JButton("Consultar");
		btnSchModEscudo.setBounds(74, 28, 89, 23);
		intFrmModEscudo.getContentPane().add(btnSchModEscudo);
		
		JLabel lblNomModEscudo = new JLabel("Nombre");
		lblNomModEscudo.setBounds(10, 60, 46, 14);
		intFrmModEscudo.getContentPane().add(lblNomModEscudo);
		
		txtFldNomModEscudo = new JTextField();
		txtFldNomModEscudo.setColumns(10);
		txtFldNomModEscudo.setBounds(10, 82, 165, 20);
		intFrmModEscudo.getContentPane().add(txtFldNomModEscudo);
		
		JLabel lblImgPthModEscudo = new JLabel("Ruta Archivo Imagen");
		lblImgPthModEscudo.setBounds(10, 113, 116, 14);
		intFrmModEscudo.getContentPane().add(lblImgPthModEscudo);
		
		txtFldImgPthModEscudo = new JTextField();
		txtFldImgPthModEscudo.setColumns(10);
		txtFldImgPthModEscudo.setBounds(10, 138, 165, 20);
		intFrmModEscudo.getContentPane().add(txtFldImgPthModEscudo);
		
		JButton btnAcpModEscudo = new JButton("Aceptar");
		btnAcpModEscudo.setBounds(46, 184, 89, 23);
		intFrmModEscudo.getContentPane().add(btnAcpModEscudo);
		
		JButton btnClrModEscudo = new JButton("Reiniciar");
		btnClrModEscudo.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtFldNroModEscudo.setText(null);
				txtFldNomModEscudo.setText(null);
				txtFldImgPthModEscudo.setText(null);
			}
		});
		btnClrModEscudo.setBounds(46, 229, 89, 23);
		intFrmModEscudo.getContentPane().add(btnClrModEscudo);
		
		JButton btnCnlModEscudo = new JButton("Cancelar");
		btnCnlModEscudo.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					intFrmModEscudo.setClosed(true);
				} catch (PropertyVetoException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCnlModEscudo.setBounds(46, 278, 89, 23);
		intFrmModEscudo.getContentPane().add(btnCnlModEscudo);
		
		JPanel imgModEscudo = new JPanel();
		imgModEscudo.setBounds(190, 11, 300, 330);
		intFrmModEscudo.getContentPane().add(imgModEscudo);
		imgModEscudo.setLayout(new BorderLayout(0, 0));
		intFrmModEscudo.setVisible(true);
	}
		
	protected void crearAdicionarEstadio(){	
		final JInternalFrame intFrmAddEstadio = new JInternalFrame("Adicionar Estadio");
		intFrmAddEstadio.setBounds(10, 10, 365, 230);
		contentPane.add(intFrmAddEstadio);
		intFrmAddEstadio.getContentPane().setLayout(null);
		
		JLabel lblNroEstadio = new JLabel("N\u00FAmero L\u00E1mina");
		lblNroEstadio.setBounds(10, 14, 85, 14);
		intFrmAddEstadio.getContentPane().add(lblNroEstadio);
		
		txtFldNroEstadio = new JTextField();
		txtFldNroEstadio.setColumns(10);
		txtFldNroEstadio.setBounds(115, 11, 46, 20);
		intFrmAddEstadio.getContentPane().add(txtFldNroEstadio);
		
		JLabel lblNomEstadio = new JLabel("Nombre");
		lblNomEstadio.setBounds(10, 39, 46, 14);
		intFrmAddEstadio.getContentPane().add(lblNomEstadio);
		
		txtFldNomEstadio = new JTextField();
		txtFldNomEstadio.setColumns(10);
		txtFldNomEstadio.setBounds(115, 36, 223, 20);
		intFrmAddEstadio.getContentPane().add(txtFldNomEstadio);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(10, 64, 46, 14);
		intFrmAddEstadio.getContentPane().add(lblCiudad);
		
		txtFldCiudad = new JTextField();
		txtFldCiudad.setBounds(115, 61, 223, 20);
		intFrmAddEstadio.getContentPane().add(txtFldCiudad);
		txtFldCiudad.setColumns(10);
		
		JLabel lblCapacidad = new JLabel("Capacidad");
		lblCapacidad.setBounds(10, 89, 66, 14);
		intFrmAddEstadio.getContentPane().add(lblCapacidad);
		
		txtFldCapacidad = new JTextField();
		txtFldCapacidad.setBounds(115, 86, 66, 20);
		intFrmAddEstadio.getContentPane().add(txtFldCapacidad);
		txtFldCapacidad.setColumns(10);
		
		JLabel lblEspectadores = new JLabel("espectadores");
		lblEspectadores.setBounds(191, 89, 71, 14);
		intFrmAddEstadio.getContentPane().add(lblEspectadores);
		
		JLabel lblFechaConstruccion = new JLabel("Fecha Construcci\u00F3n");
		lblFechaConstruccion.setBounds(10, 114, 104, 14);
		intFrmAddEstadio.getContentPane().add(lblFechaConstruccion);
		
		txtFldFechaConstr = new JTextField();
		txtFldFechaConstr.setBounds(115, 111, 108, 20);
		intFrmAddEstadio.getContentPane().add(txtFldFechaConstr);
		txtFldFechaConstr.setColumns(10);
		
		JLabel lblPathImgStdm = new JLabel("Ruta archivo imagen");
		lblPathImgStdm.setBounds(10, 142, 104, 14);
		intFrmAddEstadio.getContentPane().add(lblPathImgStdm);
		
		txtFldPathImgStdm = new JTextField();
		txtFldPathImgStdm.setColumns(10);
		txtFldPathImgStdm.setBounds(115, 139, 223, 20);
		intFrmAddEstadio.getContentPane().add(txtFldPathImgStdm);
		
		JButton btnAddStdm = new JButton("Agregar");
		btnAddStdm.setBounds(10, 170, 89, 23);
		intFrmAddEstadio.getContentPane().add(btnAddStdm);
		
		JButton btnClearStdm = new JButton("Reiniciar");
		btnClearStdm.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtFldNroEstadio.setText(null);
				txtFldNomEstadio.setText(null);
				txtFldCiudad.setText(null);
				txtFldCapacidad.setText(null);
				txtFldFechaConstr.setText(null);
				txtFldPathImgStdm.setText(null);
			}
		});
		btnClearStdm.setBounds(134, 170, 89, 23);
		intFrmAddEstadio.getContentPane().add(btnClearStdm);
		
		JButton btnCancelStdm = new JButton("Cancelar");
		btnCancelStdm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					intFrmAddEstadio.setClosed(true);
				} catch (PropertyVetoException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCancelStdm.setBounds(249, 170, 89, 23);
		intFrmAddEstadio.getContentPane().add(btnCancelStdm);		
		intFrmAddEstadio.setVisible(true);
	}
	
	protected void crearModificarEstadio(){	
		final JInternalFrame intFrmModEstadio = new JInternalFrame("Modificar Estadio");
		intFrmModEstadio.setBounds(10, 10, 515, 386);
		contentPane.add(intFrmModEstadio);
		intFrmModEstadio.getContentPane().setLayout(null);
		
		JLabel lblNroModEstadio = new JLabel("N\u00FAmero L\u00E1mina");
		lblNroModEstadio.setBounds(10, 14, 85, 14);
		intFrmModEstadio.getContentPane().add(lblNroModEstadio);
		
		txtFldModEstadio = new JTextField();
		txtFldModEstadio.setColumns(10);
		txtFldModEstadio.setBounds(94, 11, 46, 20);
		intFrmModEstadio.getContentPane().add(txtFldModEstadio);
		
		JButton btnSchModEstadio = new JButton("Consultar");
		btnSchModEstadio.setBounds(150, 10, 89, 23);
		intFrmModEstadio.getContentPane().add(btnSchModEstadio);
		
		JLabel lblNomModEstadio = new JLabel("Nombre");
		lblNomModEstadio.setBounds(10, 43, 46, 14);
		intFrmModEstadio.getContentPane().add(lblNomModEstadio);
		
		txtFldNomModEstadio = new JTextField();
		txtFldNomModEstadio.setColumns(10);
		txtFldNomModEstadio.setBounds(10, 68, 223, 20);
		intFrmModEstadio.getContentPane().add(txtFldNomModEstadio);
		
		JLabel lblCiuModEstadio = new JLabel("Ciudad");
		lblCiuModEstadio.setBounds(10, 99, 46, 14);
		intFrmModEstadio.getContentPane().add(lblCiuModEstadio);
		
		txtFldCiuModEstadio = new JTextField();
		txtFldCiuModEstadio.setColumns(10);
		txtFldCiuModEstadio.setBounds(10, 124, 223, 20);
		intFrmModEstadio.getContentPane().add(txtFldCiuModEstadio);
		
		JLabel lblCapModEstadio = new JLabel("Capacidad");
		lblCapModEstadio.setBounds(10, 155, 66, 14);
		intFrmModEstadio.getContentPane().add(lblCapModEstadio);
		
		txtFldCapModEstadio = new JTextField();
		txtFldCapModEstadio.setColumns(10);
		txtFldCapModEstadio.setBounds(10, 180, 66, 20);
		intFrmModEstadio.getContentPane().add(txtFldCapModEstadio);
		
		JLabel lblEspModEstadio = new JLabel("espectadores");
		lblEspModEstadio.setBounds(86, 183, 71, 14);
		intFrmModEstadio.getContentPane().add(lblEspModEstadio);
		
		JLabel lblDateModEstadio = new JLabel("Fecha Construcci\u00F3n");
		lblDateModEstadio.setBounds(10, 211, 104, 14);
		intFrmModEstadio.getContentPane().add(lblDateModEstadio);
		
		txtFldDateModEstadio = new JTextField();
		txtFldDateModEstadio.setColumns(10);
		txtFldDateModEstadio.setBounds(10, 236, 108, 20);
		intFrmModEstadio.getContentPane().add(txtFldDateModEstadio);
		
		JLabel lblImgPthModEstadio = new JLabel("Ruta archivo imagen");
		lblImgPthModEstadio.setBounds(10, 267, 104, 14);
		intFrmModEstadio.getContentPane().add(lblImgPthModEstadio);
		
		txtFldImgPthModEstadio = new JTextField();
		txtFldImgPthModEstadio.setColumns(10);
		txtFldImgPthModEstadio.setBounds(10, 292, 223, 20);
		intFrmModEstadio.getContentPane().add(txtFldImgPthModEstadio);
		
		JButton btnAcpModEstadio = new JButton("Aceptar");
		btnAcpModEstadio.setBounds(10, 323, 89, 23);
		intFrmModEstadio.getContentPane().add(btnAcpModEstadio);
		
		JButton btnClrModEstadio = new JButton("Reiniciar");
		btnClrModEstadio.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtFldModEstadio.setText(null);
				txtFldNomModEstadio.setText(null);
				txtFldCiuModEstadio.setText(null);
				txtFldCapModEstadio.setText(null);
				txtFldDateModEstadio.setText(null);
				txtFldImgPthModEstadio.setText(null);
			}
		});
		btnClrModEstadio.setBounds(115, 323, 89, 23);
		intFrmModEstadio.getContentPane().add(btnClrModEstadio);
		
		JButton btnCnlModEstadio = new JButton("Cancelar");
		btnCnlModEstadio.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					intFrmModEstadio.setClosed(true);
				} catch (PropertyVetoException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCnlModEstadio.setBounds(223, 323, 89, 23);
		intFrmModEstadio.getContentPane().add(btnCnlModEstadio);
		
		JPanel imgModEstadio = new JPanel();
		imgModEstadio.setBounds(249, 18, 240, 294);
		intFrmModEstadio.getContentPane().add(imgModEstadio);
		intFrmModEstadio.setVisible(true);
	}
	
	protected void crearBorrarLamina(){	
		final JInternalFrame intFrmBorrarLamina = new JInternalFrame("Borrar L\u00E1mina");
		intFrmBorrarLamina.setBounds(10, 10, 515, 380);
		contentPane.add(intFrmBorrarLamina);
		intFrmBorrarLamina.getContentPane().setLayout(null);
		
		JLabel lblNroBorrar = new JLabel("N\u00FAmero");
		lblNroBorrar.setBounds(10, 11, 46, 14);
		intFrmBorrarLamina.getContentPane().add(lblNroBorrar);
		
		txtFldNroBorrar = new JTextField();
		txtFldNroBorrar.setBounds(10, 29, 51, 20);
		intFrmBorrarLamina.getContentPane().add(txtFldNroBorrar);
		txtFldNroBorrar.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(86, 28, 89, 23);
		intFrmBorrarLamina.getContentPane().add(btnConsultar);

		JLabel lblNomBorrar = new JLabel("Nombre");
		lblNomBorrar.setBounds(10, 60, 46, 14);
		intFrmBorrarLamina.getContentPane().add(lblNomBorrar);
		
		txtFldNomBorrar = new JTextField();
		txtFldNomBorrar.setEditable(false);
		txtFldNomBorrar.setBounds(10, 82, 165, 20);
		intFrmBorrarLamina.getContentPane().add(txtFldNomBorrar);
		txtFldNomBorrar.setColumns(10);
		
		JLabel lblClaseLamina = new JLabel("Clase de l\u00E1mina");
		lblClaseLamina.setBounds(10, 113, 116, 14);
		intFrmBorrarLamina.getContentPane().add(lblClaseLamina);
		
		txtFldClaseLamina = new JTextField();
		txtFldClaseLamina.setEditable(false);
		txtFldClaseLamina.setBounds(10, 138, 116, 20);
		intFrmBorrarLamina.getContentPane().add(txtFldClaseLamina);
		txtFldClaseLamina.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(46, 184, 89, 23);
		intFrmBorrarLamina.getContentPane().add(btnAceptar);
		
		JButton btnClrBorrar = new JButton("Reiniciar");
		btnClrBorrar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtFldNroBorrar.setText(null);
				txtFldNomBorrar.setText(null);
				txtFldClaseLamina.setText(null);
			}
		});
		btnClrBorrar.setBounds(46, 229, 89, 23);
		intFrmBorrarLamina.getContentPane().add(btnClrBorrar);
		
		JButton btnCancelBorrar = new JButton("Cancelar");
		btnCancelBorrar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					intFrmBorrarLamina.setClosed(true);
				} catch (PropertyVetoException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCancelBorrar.setBounds(46, 278, 89, 23);
		intFrmBorrarLamina.getContentPane().add(btnCancelBorrar);
		
		JPanel imgBorrar = new JPanel();
		imgBorrar.setBounds(190, 11, 300, 330);
		intFrmBorrarLamina.getContentPane().add(imgBorrar);
		imgBorrar.setLayout(new BorderLayout(0, 0));
		intFrmBorrarLamina.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ("AddJugador".equals(e.getActionCommand())){
			crearAdicionaJugador();
		}else
			if ("AddEquipo".equals(e.getActionCommand())){
				crearAdicionarEquipo();
			}else
				if ("AddEscudo".equals(e.getActionCommand())){
					crearAdicionarEscudo();
				}else
					if ("AddEstadio".equals(e.getActionCommand())){
						crearAdicionarEstadio();
					}else
						if ("ModJugador".equals(e.getActionCommand())){
							crearModificarJugador();
						}else
							if ("ModEquipo".equals(e.getActionCommand())){
								crearModificarEquipo();
							}else
								if ("ModEscudo".equals(e.getActionCommand())){
									crearModificarEscudo();
								}else
									if ("ModEstadio".equals(e.getActionCommand())){
										crearModificarEstadio();
									}else
										if ("Borrar".equals(e.getActionCommand())){
											crearBorrarLamina();
										}if ("Salir".equals(e.getActionCommand())){
											System.exit(0);
										}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionAlbum frame = new GestionAlbum();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
