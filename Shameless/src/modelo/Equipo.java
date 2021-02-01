package modelo;
import java.util.Random;

import modelo.Hijo;

public class Equipo {

	Random rnd=new Random();
	public final int TAMANGO_EQUIPO=3;
	public Hijo[] miembros=new Hijo[TAMANGO_EQUIPO];

	//constructor Equipo por defecto
	public Equipo() {
		for (int i = 0; i < TAMANGO_EQUIPO; i++) {
			switch(rnd.nextInt(6)) {
			case 0:
				miembros[i]= new Carl();
				break;
			case 1:
				miembros[i]= new Debbie();
				break;
			case 2:
				miembros[i]= new Fiona();
				break;
			case 3:
				miembros[i]= new Ian();
				break;
			case 4:
				miembros[i]= new Liam();
				break;
			case 5:
				miembros[i]= new Lip();
				break;
			}
			for (int j = 0; j < i; j++) {//comprobacion para que no se repitan los miembros
				if (miembros[i].getTipo().equals((miembros[j]).getTipo())) {
					i--;
				}
			}
		}
	}
	
	public Equipo(Hijo[] miembros) {
		this.miembros=miembros;
	}
	//GETTERS
	public Hijo[] getMiembros() {
		return miembros;
	}
	public int getTAMANGO_EQUIPO() {
		return TAMANGO_EQUIPO;
	}
}
