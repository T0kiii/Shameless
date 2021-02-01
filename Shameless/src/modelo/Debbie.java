package modelo;

import principal.Partida;

public final class Debbie extends Hijo {	
	//contructores
	public Debbie() {
		super();
	}

	public Debbie(String nombre) {
		super(nombre);
	}

	//metodos
	public void gritar(Frank miFrank) {//sube enfado de Frank
		miFrank.setEnfado(miFrank.getEnfado()+20);
		Partida.siguienteTurno();
	}

	public void ayudarFrank(Frank miFrank,Equipo miEquipo) {//baja mucho la pieda por Frank,el enfado y la ebriedad
		miFrank.setEbriedad(miFrank.getEbriedad()-10);
		for (int i = 0; i < miEquipo.getTAMANGO_EQUIPO(); i++) {
			miEquipo.getMiembros()[i].setPiedad(miEquipo.getMiembros()[i].getPiedad()-15);
		}
		Partida.siguienteTurno();
	}
}
