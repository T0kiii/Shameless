package modelo;

public final class Lip extends Hijo implements hijosMayores{

	 private int ebriedad;
	 private double dinero;
	 
	public Lip(int ebriedad, double dinero) {
		super();
		this.ebriedad = ebriedad;
		this.dinero = dinero;
	}

	public void beberConFrank() {//aumenta ebriedad de Frank y Lip
		ebriedad+=10;
	}
	
	@Override
	public void punietazo() {
		// TODO Auto-generated method stub
		
	}
	public void ganarDinero(int horasTrabajo){//aqui faltaria crear un atributo que herede del padre o se cree aqui para ganar dinero y tendremos 
		//que pensar que con ese dinero que se hace en plan se puede mejorar los stats o sobornas a Frank para que se vaya y ganar
		//Yo lo creo en esta clase
		dinero=horasTrabajo*5;
	}

	public int getEbriedad() {
		return ebriedad;
	}

	public void setEbriedad(int ebriedad) {
		this.ebriedad = ebriedad;
	}
}
