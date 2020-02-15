package interfazGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	//esta es la ventana principal del menu primero y cuando metamos mas interfaces tendran que ser a partir de esta con sus botones y unir las 
	//clases de herencia y demas para que funcione cuando se le de al boton


	//en una de las interfaces podemos poner una lista con un scrollbar para crear los personajes para luchar contra el padre y ver quienes 
	//tenemos ya y poner eliminar y cambiar nombres y personajes y poner excepciones en que si ya hay un bebe no se puede poner mas y 
	//podriamos crear una excepcion y que salte si se intenta crear mas bebes y asi que salga una ventana emergente que te de error
	//con un mensaje que te diga vuelve a intentarlo o cualquier cosa
	
	
	//Yo creo que podriamos tener de interfaces una que sea la principal para jugar o elegir equipo,otra para crear el equipo con listas como
	// el ultimo ejemplo que nos enseño en clase que se podria añadir y eliminar,otra que es donde juguemos y se luche y 2 o 3 mas para
	//cuando el padre Frank se vaya de casa o tu pierdas y podemos añadir 2 mas que una sea una imagen o un gif  de has ganado
	// y la otra con una imagen o un gif de has perdido y las dos con un boton que te mande a la pantalla principal que seria esta clase
}
