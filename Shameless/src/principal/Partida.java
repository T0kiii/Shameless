package principal;

import modelo.*;

import gui.*;

public class Partida {

	static Frank miFrank;
	static Equipo miEquipo;
	static private int turno;
	static Hijo personajeEnTurno;

	static VentanaPartida ventanaPartida;

//constructores
	public Partida() {

		miFrank=new Frank();
		miEquipo=new Equipo();
		turno=0;
		ventanaPartida=new VentanaPartida();
		ventanaPartida.setVisible(true);

	}
	public Partida(Hijo[] miembros) {
		miFrank=new Frank();
		miEquipo=new Equipo(miembros);
		turno=0;
		ventanaPartida=new VentanaPartida();
		ventanaPartida.setVisible(true);
	}
//metodos
	public static void siguienteTurno() {//se usa para ir cambiando el turno y poder luchar con cada personaje

		if (turno%2==0) {
			turno++;

			if((turno+miEquipo.getTAMANGO_EQUIPO())%3==0) {
				Partida.actualizarPantalla(miEquipo.getMiembros()[0]);
				personajeEnTurno=miEquipo.getMiembros()[0];
			}else if(((turno+miEquipo.getTAMANGO_EQUIPO())-2)%3==0) {

				Partida.actualizarPantalla(miEquipo.getMiembros()[1]);
				personajeEnTurno=miEquipo.getMiembros()[1];

			}else if(((turno+miEquipo.getTAMANGO_EQUIPO())-4)%3==0){

				Partida.actualizarPantalla(miEquipo.getMiembros()[2]);
				personajeEnTurno=miEquipo.getMiembros()[2];
			}
		}else {
			turno++;

			miFrank.ataqueFrank(personajeEnTurno);
		}
		ventanaPartida.actualizarVida();
		Partida.comprobarVidaFrank();
		Partida.hijosVivos();
		
	}

	public static void actualizarPantalla(Hijo hijo) {//se usa para cambiar los botones y la imagen y saber con quien hijo luchas
		if (hijo instanceof Carl) {
			ventanaPartida.actualizarCarl();
		}
		if (hijo instanceof Debbie) {
			ventanaPartida.actualizarDebbie();
		}
		if (hijo instanceof Fiona) {
			ventanaPartida.actualizarFiona();
		}
		if (hijo instanceof Ian) {
			ventanaPartida.actualizarIan();

		}
		if (hijo instanceof Liam) {
			ventanaPartida.actualizarLiam();
		}
		if (hijo instanceof Lip) {
			ventanaPartida.actualizarLip();
		}
	}

	public static void comprobarVidaFrank() {//cada turno comprueba si la vida es distinto de 0 porque si es 0 has ganado
		
		if (Partida.getMiFrank().getHp()<=0) {
			VentanaGanar victoria=new VentanaGanar();
			victoria.setVisible(true);
			ventanaPartida.dispose();

		}
		
	}

	public static void hijosVivos() {//ver si cuantos hijos vivos hay porque si hay alguno que ha muerto has perdido

		for (int i = 0; i < Partida.getMiEquipo().getTAMANGO_EQUIPO(); i++) {

			if (Partida.getMiEquipo().getMiembros()[i].getHp()<0) {
				System.out.println("Entra");
				VentanaPerder derrota= new VentanaPerder();
				derrota.setVisible(true);
				ventanaPartida.dispose();
			}
		}
		
	}

	//GETTERS Y SETTERS


	public static Frank getMiFrank() {
		return miFrank;
	}

	public static int getTurno() {
		return turno;
	}
	public static void setTurno(int turno) {
		Partida.turno = turno;
	}
	public static Hijo getPersonajeEnTurno() {
		return personajeEnTurno;
	}
	public static void setPersonajeEnTurno(Hijo personajeEnTurno) {
		Partida.personajeEnTurno = personajeEnTurno;

	}
	public static void setMiFrank(Frank miFrank) {
		Partida.miFrank = miFrank;
	}

	public static Equipo getMiEquipo() {
		return miEquipo;
	}

	public static void setMiEquipo(Equipo miEquipo) {
		Partida.miEquipo = miEquipo;
	}
	public static VentanaPartida getVentanaPartida() {
		return ventanaPartida;
	}
	public static void setVentanaPartida(VentanaPartida ventanaPartida) {
		Partida.ventanaPartida = ventanaPartida;
	}

}
