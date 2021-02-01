package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaInstrucciones extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel lblAyuda1,lblAyuda2,lblAyuda3,lblDesarrollado,lblNombreAlvaro,lblNombreSergio,lblNombreAlberto;
	private JLabel lblNewLabel;
	/**
	 * Create the frame.
	 */
	public VentanaInstrucciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//etiquetas
		lblNewLabel = new JLabel("Manejas tres personajes, cada tipo de personaje tiene distintos ataques.\r\n");
		lblNewLabel.setBounds(12, 13, 441, 26);
		contentPane.add(lblNewLabel);

		lblAyuda1 = new JLabel("Cuando un personaje muere has perdido y tienes que conseguir derrotar a Frank.");
		lblAyuda1.setBounds(12, 52, 480, 16);
		contentPane.add(lblAyuda1);

		lblAyuda2 = new JLabel("Crear equipo puedes decidir como se llaman los personajes y de que tipos son .");
		lblAyuda2.setBounds(12, 81, 467, 26);
		contentPane.add(lblAyuda2);

		lblAyuda3 = new JLabel("Los botones del personajes son los ataques que puede hacer cada personaje.\r\n");
		lblAyuda3.setBounds(12, 120, 441, 16);
		contentPane.add(lblAyuda3);

		lblDesarrollado = new JLabel("Desarrollado por:");
		lblDesarrollado.setBounds(12, 149, 162, 16);
		contentPane.add(lblDesarrollado);

		lblNombreAlvaro = new JLabel("Alvaro Ferrer");
		lblNombreAlvaro.setBounds(12, 178, 86, 16);
		contentPane.add(lblNombreAlvaro);

		lblNombreSergio = new JLabel("Sergio Barcelona");
		lblNombreSergio.setBounds(12, 207, 110, 16);
		contentPane.add(lblNombreSergio);

		lblNombreAlberto = new JLabel("Alberto Gonzalez");
		lblNombreAlberto.setBounds(12, 236, 110, 16);
		contentPane.add(lblNombreAlberto);
		//-------------------
		//boton
		btnNewButton = new JButton("Volver al Menu");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(268, 178, 125, 63);
		contentPane.add(btnNewButton);
	}
	//actionPerformed
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnNewButton) {
			VentanaPrincipal window=new VentanaPrincipal();
			window.setVisible(true);
			this.dispose();
		}

	}
}
