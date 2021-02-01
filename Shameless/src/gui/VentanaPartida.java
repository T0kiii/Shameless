package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import modelo.Carl;
import modelo.Debbie;
import modelo.Fiona;
import modelo.Hijo;
import modelo.Ian;
import modelo.Liam;
import modelo.Lip;
import principal.Partida;

public class VentanaPartida extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton accion1,accion2,accion3,accion4;
	private JLabel lblFoto;
	private JLabel lblFoto2;
	private JButton btnNVolver;
	private JLabel lblVidaEquipo,lblVidaFrank;

	/**
	 * Create the frame.
	 */
	public VentanaPartida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setBounds(700, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//botones
		accion1 = new JButton("Accion 1");
		accion1.setBounds(10, 204, 125, 43);
		accion1.addActionListener(this);
		contentPane.setLayout(null);
		contentPane.add(accion1);

		accion2 = new JButton("Accion 2");
		accion2.setBounds(10, 258, 125, 43);
		accion2.addActionListener(this);
		contentPane.add(accion2);

		accion3 = new JButton("Accion 3");
		accion3.setBounds(143, 204, 125, 43);
		accion3.addActionListener(this);
		contentPane.add(accion3);

		accion4 = new JButton("Accion 4");
		accion4.setBounds(143, 258, 125, 43);
		accion4.addActionListener(this);
		contentPane.add(accion4);

		btnNVolver = new JButton("Volver al menu principal");
		btnNVolver.setActionCommand("volver");
		btnNVolver.addActionListener(this);
		btnNVolver.setBounds(332, 458, 246, 71);
		contentPane.add(btnNVolver);

		//etiquetas
		lblVidaEquipo = new JLabel("VIDA: " + Partida.getMiEquipo().getMiembros()[0].getHp()
				+"VIDA: " + Partida.getMiEquipo().getMiembros()[1].getHp()+
				"VIDA: " + Partida.getMiEquipo().getMiembros()[2].getHp());
		lblVidaEquipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblVidaEquipo.setForeground(Color.YELLOW);
		lblVidaEquipo.setBounds(30, 13, 353, 16);
		contentPane.add(lblVidaEquipo);

		lblVidaFrank = new JLabel("VIDA: " + Partida.getMiFrank().getHp());
		lblVidaFrank.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblVidaFrank.setForeground(Color.YELLOW);
		lblVidaFrank.setBounds(469, 13, 385, 16);
		contentPane.add(lblVidaFrank);

		lblFoto2 = new JLabel("");
		lblFoto2.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/frankGana.jpg")));
		lblFoto2.setBounds(438, 0, 456, 555);
		contentPane.add(lblFoto2);
		//fotos
		lblFoto = new JLabel("");
	}
	//actionPerformed
	public void actionPerformed(ActionEvent e) {

		switch(e.getActionCommand()) {
		case "Empujar":
			Partida.getPersonajeEnTurno().empujar(Partida.getMiFrank());
			break;
		case "EmpujarLiam":
			((Liam)Partida.getPersonajeEnTurno()).empujar();

			break;
		case "PuñetazoFiona":
			((Fiona) Partida.getPersonajeEnTurno()).punietazo(Partida.getMiFrank());

			break;
		case "PuñetazoLip":
			((Lip) Partida.getPersonajeEnTurno()).punietazo(Partida.getMiFrank());

			break;
		case "PuñetazoIan":
			((Ian) Partida.getPersonajeEnTurno()).punietazo(Partida.getMiFrank());

			break;
		case "Recriminar":
			((Fiona) Partida.getPersonajeEnTurno()).recriminar(Partida.getMiFrank());

			break;
		case "Pedir Ayuda":
			((Fiona) Partida.getPersonajeEnTurno()).pedirAyudaFamilia(Partida.getMiFrank());

			break;
		case "Beber con Frank":
			((Lip)Partida.getPersonajeEnTurno()).beberConFrank(Partida.getMiFrank());

			break;
		case "Salir del armario":
			((Ian)Partida.getPersonajeEnTurno()).salirDelArmario();

			break;
		case "Irse de casa":
			((Ian)Partida.getPersonajeEnTurno()).irseDeCasa();

			break;
		case "Drogar a Frank":
			((Carl)Partida.getPersonajeEnTurno()).drogarFrank(Partida.getMiFrank());

			break;
		case "Usar bate":
			((Carl)Partida.getPersonajeEnTurno()).usarBate(Partida.getMiFrank());

			break;
		case "Gritar":
			((Debbie)Partida.getPersonajeEnTurno()).gritar(Partida.getMiFrank());

			break;
		case "Ayudar a Frank":
			((Debbie)Partida.getPersonajeEnTurno()).ayudarFrank(Partida.getMiFrank(),Partida.getMiEquipo());

			break;
		case "Llorar":
			((Liam)Partida.getPersonajeEnTurno()).llorar();

			break;
		case "":
			JOptionPane.showMessageDialog(null,"Escoge una accion valida", "Error",JOptionPane.ERROR_MESSAGE);
			break;
		case "volver":
			VentanaPrincipal window=new VentanaPrincipal();
			window.setVisible(true);
			this.dispose();
			break;
		}

	}
	//metodos
	public void actualizarFiona() {

		lblFoto.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/fiona4.jpg")));
		lblFoto.setBounds(0, -10, 437, 565);
		contentPane.add(lblFoto);

		accion1.setText("Empujar");
		accion1.setActionCommand("Empujar");

		accion2.setText("Puñetazo");
		accion2.setActionCommand("PuñetazoFiona");

		accion3.setText("Recriminar");
		accion3.setActionCommand("Recriminar");

		accion4.setText("Pedir ayuda");
		accion4.setActionCommand("Pedir Ayuda");


	}
	public void actualizarLip() {

		lblFoto.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/lip.jpg")));
		lblFoto.setBounds(0, -10, 437, 565);
		contentPane.add(lblFoto);
		accion1.setText("Empujar");
		accion1.setActionCommand("Empujar");

		accion2.setText("Beber con Frank");
		accion2.setActionCommand("Beber con Frank");

		accion3.setText("Puñetazo");
		accion3.setActionCommand("PuñetazoLip");

		accion4.setText("");
		accion4.setActionCommand("");
	}
	public void actualizarIan() {
		lblFoto.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/ian2.jpg")));
		lblFoto.setBounds(0, -10, 437, 565);
		contentPane.add(lblFoto);

		accion1.setText("Empujar");
		accion1.setActionCommand("Empujar");

		accion2.setText("Salir del armario");
		accion2.setActionCommand("Salir del armario");

		accion3.setText("Irse de casa");
		accion3.setActionCommand("Irse de casa");

		accion4.setText("Puñetazo");
		accion4.setActionCommand("PuñetazoIan");
	}
	public void actualizarCarl() {
		lblFoto.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/carl.jpg")));
		lblFoto.setBounds(0, -10, 437, 565);
		contentPane.add(lblFoto);

		accion1.setText("Empujar");
		accion1.setActionCommand("Empujar");

		accion2.setText("Drogar a Frank");
		accion2.setActionCommand("Drogar a Frank");

		accion3.setText("Usar bate");
		accion3.setActionCommand("Usar bate");

		accion4.setText("");
		accion4.setActionCommand("");

	}
	public void actualizarDebbie() {
		lblFoto.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/debbie.jpg")));
		lblFoto.setBounds(0, -10, 437, 565);
		contentPane.add(lblFoto);

		accion1.setText("Empujar");
		accion1.setActionCommand("Empujar");

		accion2.setText("Gritar");
		accion2.setActionCommand("Gritar");

		accion3.setText("Ayudar a Frank");
		accion3.setActionCommand("Ayudar a Frank");

		accion4.setText("");
		accion4.setActionCommand("");

	}
	public void actualizarLiam() {
		lblFoto.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/liam.jpg")));
		lblFoto.setBounds(0, -10, 437, 565);
		contentPane.add(lblFoto);

		accion1.setText("Empujar");
		accion1.setActionCommand("EmpujarLiam");

		accion2.setText("Llorar");
		accion2.setActionCommand("Llorar");

		accion3.setText("");
		accion3.setActionCommand("");


		accion4.setText("");
		accion4.setActionCommand("");

	}
	public void actualizarVida() {
		lblVidaFrank.setText(Integer.toString(Partida.getMiFrank().getHp()));
		lblVidaEquipo.setText("VIDA: " + Partida.getMiEquipo().getMiembros()[0].getHp()
				+"VIDA: " + Partida.getMiEquipo().getMiembros()[1].getHp()+
				"VIDA: " + Partida.getMiEquipo().getMiembros()[2].getHp());
	}
}
