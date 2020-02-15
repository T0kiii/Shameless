package modelo;

public final class Ian extends Hijo implements hijosMayores{

	private Boolean haSalidoDelArmario=false;
	
	public Ian(Boolean haSalidoDelArmario) {
		super();
		this.haSalidoDelArmario = haSalidoDelArmario;
	}
	public void salirDelArmario(){//Baja credibilidad y sube enfado a Frank
		if (!haSalidoDelArmario) {
			
			
			haSalidoDelArmario=true;
			}else {
			System.out.println("Ya ha salido del armario");
		}
	}
	public void irseDeCasa(){//Baja mucho credibilidad de Frank, pero Ian se va del grupo
		Frank.setEbriedad(Frank.getEbriedad()-10);	
		//falta esto,pero Ian se va del grupo
	}
	@Override
	public void punietazo() {
		// TODO Auto-generated method stub
		
	}
	public Boolean getHaSalidoDelArmario() {
		return haSalidoDelArmario;
	}
	public void setHaSalidoDelArmario(Boolean haSalidoDelArmario) {
		this.haSalidoDelArmario = haSalidoDelArmario;
	}
	
	
}
