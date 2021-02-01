package modelo;

import java.util.Random;

import javax.swing.JOptionPane;

import gui.VentanaGanar;
import gui.VentanaPerder;
import principal.Partida;

public final class Liam extends Hijo {

	//contructores
	public Liam() {
		super();
	}

	public Liam(String nombre) {
		super(nombre);
	}

	//metodos
	public void empujar() {
		JOptionPane.showMessageDialog(null, "Eres un bebe, ¿que vas a empujar tu?");
	}

	public void llorar() {//segun el numero aleatorio que salga puedes ganar, quitar vida o perder

		Random rnd=new Random();
		int numAleatorio=rnd.nextInt(10);

		if (numAleatorio==0) {
			VentanaGanar victoria=new VentanaGanar();
			victoria.setVisible(true);
			Partida.getVentanaPartida().dispose();
		}else if(numAleatorio>=1&&numAleatorio<5){

			this.setHp(this.getHp()-10);

		}else if(numAleatorio>=5&&numAleatorio<9){

			Partida.getMiFrank().setHp(Partida.getMiFrank().getHp()-20);

		}else {
			VentanaPerder derrota=new VentanaPerder();
			derrota.setVisible(true);
			Partida.getVentanaPartida().dispose();
		}
		Partida.siguienteTurno();
	}
}
