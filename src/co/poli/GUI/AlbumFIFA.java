package co.poli.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlbumFIFA {

	private JFrame frmAlbumFifa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlbumFIFA window = new AlbumFIFA();
					window.frmAlbumFifa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AlbumFIFA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAlbumFifa = new JFrame();
		frmAlbumFifa.setTitle("Album FIFA 2014");
		frmAlbumFifa.setResizable(false);
		frmAlbumFifa.setBounds(100, 100, 210, 300);
		frmAlbumFifa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAlbumFifa.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnUsar = new JButton("Usar");
		frmAlbumFifa.getContentPane().add(btnUsar);
		
		JButton btnGestionar = new JButton("Gestionar");
		frmAlbumFifa.getContentPane().add(btnGestionar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAlbumFifa.dispose();
			}
		});
		frmAlbumFifa.getContentPane().add(btnSalir);
	}

}
