package modelo;

import principal.Partida;

public final class Carl extends Hijo {
	
	//constructores
	public Carl() {
		super();
	}
	
	public Carl(String nombre) {
		super(nombre);
	}
	
	//metodos
	public void usarBate(Frank miFrank) {//hace mucho daño
		miFrank.setHp(miFrank.getHp()-this.fuerza*5);
		Partida.siguienteTurno();
	} 
	
	public void drogarFrank(Frank miFrank) {
		miFrank.setEbriedad(miFrank.getEbriedad()+20);
		Partida.siguienteTurno();
	}
}
