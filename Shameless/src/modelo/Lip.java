package modelo;

import principal.Partida;

public final class Lip extends Hijo implements hijosMayores{

	 private int ebriedad;
	 
	 //constructores
	 public Lip() {
		 super();
		 ebriedad=0;
	 }
	 public Lip(String nombre) {
			super(nombre);
			 ebriedad=0;
	 }
	//METODOS
	public void beberConFrank(Frank miFrank) {//aumenta ebriedad de Frank y Lip
		ebriedad+=10;
		miFrank.setEbriedad(miFrank.getEbriedad()+15);
		Partida.siguienteTurno();

	}
	
	public void punietazo(Frank miFrank) {
		
		miFrank.setHp(miFrank.getHp()-(this.fuerza*3));
		Partida.siguienteTurno();

	}
}
