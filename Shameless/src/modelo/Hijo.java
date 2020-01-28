package modelo;

public abstract class Hijo {
	
	//Stats
	int atk;
	int def;
	int vel;
	int piedad;
	int enfado;
	int paciencia;
	
	//Constructor
	public Hijo() {
		this.atk=10;
		this.def=10;
		this.vel=10;
		this.piedad=10;
		this.enfado=10;
		this.paciencia=10;
	}
	
	//Métodos
	public int ataque() { //solo es un ejemplo
		return;
	}
}
