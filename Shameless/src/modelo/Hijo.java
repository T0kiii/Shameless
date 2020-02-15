package modelo;

//import java.util.Random;

public abstract class Hijo {
	
	//Stats
	private int hp;
	private int fuerza;
	//int vel;
	private int piedad;
	private int paciencia;
	/* Esto seria meterlo en una interfaz para cuando luchen usar el dado para sacar el numero de fuerza,hp o lo que sea o sino dejarlo
	 aqui y cambiar en vez de darPunietazo +10 que sea un numero random y que pueda pegar 5 o 14 por ejemplo
	Random rnd = new Random();
	public int dado = rnd.nextInt(3)+1;
	//constructor dado

	public int posicion=0;
	public int posicionRival=0;


	public int getDado() {
		dado = rnd.nextInt(3)+1;

		posicionRival++;


		return dado;
	}
	*/
	
	//Constructor
	public Hijo() {
		this.hp=100;
		this.fuerza=10;
		//this.vel=10;
		this.piedad=10;
		this.paciencia=30;
	}
	
	//Métodos
	public void empujar() {
		
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

	public int getPaciencia() {
		return paciencia;
	}

	public void setPaciencia(int paciencia) {
		this.paciencia = paciencia;
	}
	
	
}
