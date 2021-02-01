package modelo;

import java.util.Random;

import principal.Partida;

public final class Frank {

	//atributos
	private int hp;
	private int ebriedad;
	private int enfado;
	private int credibilidad;

	//Constructor
	public Frank() {
		this.hp=200;
		this.ebriedad=10;
		this.enfado=10;
		this.credibilidad=10;
	}

	//GETTERS Y SETTERS
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getEbriedad() {
		return ebriedad;
	}

	public void setEbriedad(int ebriedad) {
		this.ebriedad = ebriedad;
	}

	public int getEnfado() {
		return enfado;
	}

	public void setEnfado(int enfado) {
		this.enfado = enfado;
	}

	public int getCredibilidad() {
		return credibilidad;
	}

	public void setCredibilidad(int credibilidad) {
		this.credibilidad = credibilidad;
	}

	//METODOS
	public void enfadarse() {
		enfado+=15;
		System.out.println("enfadarse");
	}
	public void darDiscurso() {
		credibilidad+=15;
		System.out.println("discurso");

	}
	public void empujar(Hijo hijo) {
		hijo.setHp(hijo.getHp()-20);
		System.out.println("empujar");
	}

	public void cobrarPension() {
		credibilidad+=50;
		System.out.println("cobrapension");
	}

	public void punietazo(Hijo hijo) {//Más fuerte que empujar, pero necesita enfado
		hijo.setHp(hijo.getHp()-40);
		System.out.println("puñetazo");
	} 

	public void ataqueFrank(Hijo hijo) {
		Random rnd= new Random();
		int numRandom=rnd.nextInt(10);
		if(enfado<50 || credibilidad<50) {
			if(numRandom<3) {
				this.enfadarse();
			}else if (numRandom<6) {
				this.empujar(hijo);	
			}else if(numRandom<9) {
				this.darDiscurso();
			}else {
				this.cobrarPension();
			}	
		}
		else {
			this.punietazo(hijo);
		}
		Partida.siguienteTurno();
	}
}


