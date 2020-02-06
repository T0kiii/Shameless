package modelo;

public final class Frank {
	
	//Stats
	private static int hp;
	private static int ebriedad;
	private static int enfado;
	private static int credibilidad;
	/*velocidad
	 * ego
	 * */
	
	//Constructor
	public Frank() {
		//this.vel=10;
		this.hp=100;
		this.ebriedad=10;
		this.enfado=10;/* prueba*/
		this.credibilidad=10;
	}
	
	//métodos
	public static int getHp() {
		return hp;
	}

	public static void setHp(int hp) {
		Frank.hp = hp;
	}

	public static int getEbriedad() {
		return ebriedad;
	}

	public static void setEbriedad(int ebriedad) {
		Frank.ebriedad = ebriedad;
	}

	public static int getEnfado() {
		return enfado;
	}

	public static void setEnfado(int enfado) {
		Frank.enfado = enfado;
	}

	public static int getCredibilidad() {
		return credibilidad;
	}

	public static void setCredibilidad(int credibilidad) {
		Frank.credibilidad = credibilidad;
	}



	public void enfadarse() {
		enfado+=15;
	}
	darDiscurso()
	empujar()
	cobrarPension()
	punietazo() //Más fuerte que empujar, pero necesita enfado

	
}


