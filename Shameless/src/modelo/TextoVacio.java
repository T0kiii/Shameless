package modelo;

public class TextoVacio extends Exception{//esta es la clase que creamos para hacer nuestra propia excepcion
	public TextoVacio(){
		super("campo de texto vacío");
	}
}
