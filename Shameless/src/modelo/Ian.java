package modelo;

import principal.Partida;

public final class Ian extends Hijo implements hijosMayores{

	private Boolean haSalidoDelArmario;
	
	//constructores
	public Ian() {
		super();
		haSalidoDelArmario=false;
	}
	public Ian(String nombre) {
		super(nombre);
		haSalidoDelArmario=false;
		

	}
	//metodos
	public void salirDelArmario(){//Baja credibilidad y sube enfado a Frank
		if (!haSalidoDelArmario) {
			haSalidoDelArmario=true;
			}else {
			System.out.println("Ya ha salido del armario");
		}
		Partida.siguienteTurno();

	}
	public void irseDeCasa(){//Baja mucho credibilidad de Frank, pero Ian se va del grupo
		//Frank.setEbriedad(Frank.getEbriedad()-10);	
		//falta esto,pero Ian se va del grupo
	}
	@Override
	public void punietazo(Frank miFrank) {
		miFrank.setHp(miFrank.getHp()-(this.fuerza*3));
		Partida.siguienteTurno();
	}
}
