package modelo;

import javax.swing.JOptionPane;

import principal.Partida;

public final class Fiona extends Hijo implements hijosMayores {
	//atributos
	private int credibilidad;

	//contructor
	public Fiona() {
		super();
		credibilidad=10;

	}
	public Fiona(String nombre) {
		super(nombre);
		credibilidad=10;

	}

	//metodos
	public void pedirAyudaFamilia(Frank miFrank) {
		if(credibilidad>=50) {
			Partida.getMiEquipo().getMiembros()[0].empujar(miFrank);
			Partida.getMiEquipo().getMiembros()[1].empujar(miFrank);
			Partida.getMiEquipo().getMiembros()[2].empujar(miFrank);
		}else {
			JOptionPane.showMessageDialog(null, "Necesitas mas credibilidad, se gana recriminando a Frank");
		}
		Partida.siguienteTurno();
	} 
	
	public void recriminar(Frank miFrank) {
		miFrank.setCredibilidad(miFrank.getCredibilidad()-15);
		credibilidad+=15;
		Partida.siguienteTurno();
	} 
	@Override
	public void punietazo(Frank miFrank) {
		miFrank.setHp(miFrank.getHp()-(this.fuerza*3));
		Partida.siguienteTurno();
	}
}