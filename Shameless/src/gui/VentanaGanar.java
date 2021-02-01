package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class VentanaGanar extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnNVolver;
	private JLabel lblFoto;
	/**
	 * Create the frame.
	 */
	public VentanaGanar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 100, 900, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//botones
		btnNVolver = new JButton("Volver al menu principal");
		btnNVolver.addActionListener(this);
		btnNVolver.setBounds(332, 481, 246, 74);
		contentPane.add(btnNVolver);
		//etiquetas
		lblFoto = new JLabel("");
		lblFoto.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/ganar.jpg")));
		lblFoto.setBounds(0, 0, 928, 600);
		contentPane.add(lblFoto);
	}
	//actionPerformed
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNVolver) {
			VentanaPrincipal frame=new VentanaPrincipal();
			frame.setVisible(true);
			this.dispose();
		}
	}
}
