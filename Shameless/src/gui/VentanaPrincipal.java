package gui;


import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import principal.Partida;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnNEquipoAleatorio,btnNCrearEquipo,btnNSalir;
	private JLabel lblTitulo,lblFoto;
	private static int contador;
	private JButton btnNInstrucciones;
	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 100, 900, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//botones
		btnNEquipoAleatorio = new JButton("Equipo Aleatorio");
		btnNEquipoAleatorio.addActionListener(this);
		btnNEquipoAleatorio.setBounds(12, 26, 189, 93);
		contentPane.add(btnNEquipoAleatorio);

		btnNCrearEquipo = new JButton("Crear equipo");
		btnNCrearEquipo.addActionListener(this);
		btnNCrearEquipo.setBounds(12, 163, 189, 85);
		contentPane.add(btnNCrearEquipo);

		btnNSalir = new JButton("Salir");
		btnNSalir.addActionListener(this);
		btnNSalir.setBounds(12, 436, 189, 99);
		contentPane.add(btnNSalir);

		btnNInstrucciones = new JButton("Aprender Como Jugar");
		btnNInstrucciones.addActionListener(this);
		btnNInstrucciones.setBounds(12, 297, 189, 85);
		contentPane.add(btnNInstrucciones);

		lblTitulo = new JLabel("Shameless");
		lblTitulo.setForeground(Color.RED);
		lblTitulo.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 32));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(570, 13, 262, 77);
		contentPane.add(lblTitulo);

		//musica
		sound();//la musica se escucha cuando le das a cualquier boton(excepto salir) de la pantalla principal
		//y vuelves a la pantalla principal


		//etiquetaa
		lblFoto = new JLabel("");
		lblFoto.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/ShamelessPortada.jpg")));
		lblFoto.setBounds(0, 0, 928, 600);
		contentPane.add(lblFoto);
		contador++;

	}
	//metodo
	public void sound() {
		try {
			if (contador==1) {
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File("src/gui/gta.wav").getAbsoluteFile());
				Clip sonido=AudioSystem.getClip();
				sonido.open(audio);
				sonido.start();	
				sonido.loop(Clip.LOOP_CONTINUOUSLY);//repetir siempre
			}
		}catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
			System.out.println("Error");
		}
	}

	//actioPerformed
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNEquipoAleatorio) {
			Partida miPartida=new Partida();
			Partida.siguienteTurno();
			this.dispose();
		}else if(e.getSource()==btnNCrearEquipo) {
			VenCrearEquipo window = new VenCrearEquipo();
			window.setVisible(true);
			this.dispose();
		}else if(e.getSource()==btnNSalir){
			System.exit(WIDTH);
		}else if(e.getSource()==btnNInstrucciones) {
			VentanaInstrucciones frame= new VentanaInstrucciones();
			frame.setVisible(true);
			this.dispose();
		}
	}
}
