package modelo;

import principal.Partida;

public abstract class Hijo {

	protected String nombre;
	protected int hp;
	protected int fuerza;
	protected int piedad;

	//Constructores
	public Hijo() {
		this.hp=100;
		this.fuerza=10;
		//this.vel=10;
		this.piedad=50;

	}
	public Hijo(String nombre) {
		this.nombre=nombre;
		this.hp=100;
		this.fuerza=10;
		//this.vel=10;
		this.piedad=50;


	}

	//Métodos
	public void empujar(Frank miFrank){
		miFrank.setHp(miFrank.getHp()-this.fuerza);
		Partida.siguienteTurno();

	}

	//Getters y Setters

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getPiedad() {
		return piedad;
	}
	public void setPiedad(int piedad) {
		this.piedad = piedad;
	}

	public String getTipo() {
		if (this instanceof Carl) {
			return "Carl";
		}
		if (this instanceof Debbie) {
			return "Debbie";
		}
		if (this instanceof Fiona) {
			return "Fiona";
		}
		if (this instanceof Ian) {
			return "Ian";
		}
		if (this instanceof Liam) {
			return "Liam";
		}
		if (this instanceof Lip) {
			return "Lip";
		}
		return"";
	}
}
