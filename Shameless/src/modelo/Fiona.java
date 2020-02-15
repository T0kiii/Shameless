package modelo;

public final class Fiona extends Hijo implements hijosMayores {
	private int credibilidad;

	public Fiona(int credibilidad) {
		super();
		this.credibilidad = credibilidad;
	}

	public void tirarZapato() {
		
	}

	public void pedirAyudaFamilia() {/*En vez de actuar Frank, actuará el resto del equipo antes que él*/
		
	}
	public void recriminar() {//baja credibilidad a Frank y se la suma a Fiona
		
	}

	@Override
	public void punietazo() {
		// TODO Auto-generated method stub
		
	}

	public int getCredibilidad() {
		return credibilidad;
	}

	public void setCredibilidad(int credibilidad) {
		this.credibilidad = credibilidad;
	}
		
}