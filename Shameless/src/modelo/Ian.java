package modelo;

public final class Ian extends Hijo {

	private Boolean haSalidoDelArmario=false;
	
	punietazo()
	salirDelArmario(){//Baja credibilidad y sube enfado a Frank
		if (!haSalidoDelArmario) {
			
			
			haSalidoDelArmario=true;
			}else {
			System.out.println("Ya ha salido del armario");
		}
	}
	irseDeCasa(){//Baja mucho credibilidad de Frank, pero Ian se va del grupo
		
	}
	
}
