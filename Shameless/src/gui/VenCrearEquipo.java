package gui;

import modelo.*;
import principal.Partida;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class VenCrearEquipo extends JFrame implements ActionListener{

	private JPanel contenedor;
	private JLabel lblTitulo, lblNombre, lblTipo;
	private JTextField txtNombre;
	private JComboBox elecTipo;
	private String[] tipos;
	private JTable tablaEquipo;
	private DefaultTableModel modelo;
	private JScrollPane scrollLista;
	private JButton btnMenu, btnBorrarEquipo, btnEliminar, btnAgregar, btnPartida;
	private Hijo[] equipoElegido;
	private int clicksAgregar; // se usa para meter hijos en la posiciï¿½n de EquipoElegido y en eliminarFila()

	public VenCrearEquipo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 100, 900, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		contenedor= new JPanel();
		contenedor.setBackground(Color.LIGHT_GRAY);
		contenedor.setLayout(null);
		setContentPane(contenedor);

		initComponents();	
	}
	private void initComponents() {
		// Etiquetas
		lblTitulo = new JLabel("Crea tu equipo");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTitulo.setLocation(350, 49);
		lblTitulo.setSize(164, 26);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		contenedor.add(lblTitulo);
		lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(217, 202, 102, 38);
		contenedor.add(lblNombre);
		// ---------------------

		// Campo de texto nombre
		txtNombre= new JTextField(); 
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtNombre.setBounds(350, 214, 164, 26);
		contenedor.add(txtNombre);
		txtNombre.setColumns(10); 
		// ---------------------	

		// Lista desplegable
		tipos = new String[] {"Carl","Debbie","Fiona","Ian","Liam","Lip"};
		lblTipo = new JLabel("Tipo de personaje");
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setBounds(217, 271, 119, 20);
		contenedor.add(lblTipo);

		elecTipo = new JComboBox(tipos);
		elecTipo.addActionListener(this);
		elecTipo.setBounds(350, 271, 90, 20);
		contenedor.add(elecTipo);
		// ---------------------

		// Tabla de equipo
		equipoElegido = new Hijo[3];
		tablaEquipo = new JTable();

		Object[][] data = new Object[][] {};
		String[] columnas = new String[] {"Nombre","tipo"};

		modelo = new DefaultTableModel(data, columnas);

		tablaEquipo.setModel(modelo);
		tablaEquipo.setBounds(0, 0, 130, 95);

		scrollLista = new JScrollPane();
		contenedor.add(scrollLista);
		scrollLista.setBounds(603, 207,220, 80);
		scrollLista.setViewportView(tablaEquipo);
		// ---------------------

		// Botones
		btnMenu = new JButton("Menú");
		btnMenu.addActionListener(this);
		btnMenu.setBounds(10, 537, 119, 23);
		contenedor.add(btnMenu);

		btnPartida = new JButton("Ir a partida");
		btnPartida.addActionListener(this);
		btnPartida.setBounds(765, 537, 119, 23);
		contenedor.add(btnPartida);

		btnBorrarEquipo = new JButton("Borrar todo el equipo");
		btnBorrarEquipo.addActionListener(this);
		btnBorrarEquipo.setBounds(603, 387, 180, 43);
		contenedor.add(btnBorrarEquipo);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(603, 328, 110, 23);
		contenedor.add(btnEliminar);

		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(350, 328, 119, 23);
		contenedor.add(btnAgregar);
		clicksAgregar=0; //contador para btnAgregar
	}
	//ActionPerformed
	public void actionPerformed(ActionEvent e) {
		accionBotones(e);
	}

	//Métodos
	private void accionBotones(ActionEvent e) {
		if(e.getSource().equals(btnMenu)) {
			VentanaPrincipal principal = new VentanaPrincipal();
			principal.setVisible(true);
			this.dispose();
		}else if(e.getSource().equals(btnBorrarEquipo)) {
			modelo.setRowCount(0); // borra la lista
			equipoElegido = new Hijo[equipoElegido.length]; //resetea array del equipo
			clicksAgregar=0; // contador de btnAgregar

		}else if(e.getSource().equals(btnEliminar)) { //Elimina al personaje seleccionado de la lista
			try {
				if(clicksAgregar>0 && equipoElegido[tablaEquipo.getSelectedRow()]!= null) { //si no se ha agregado nada y no hay nada que borrar seleccionado no hará nada
					eliminarFila();
					clicksAgregar--; //no poner clicksAgregar antes de eliminarFila
				}
			}catch(ArrayIndexOutOfBoundsException arrayE) {
				JOptionPane.showMessageDialog(null, "Selecciona al personaje que quieres eliminar");
			}			
			System.out.println(clicksAgregar); //pruebas

		}else if(e.getSource().equals(btnAgregar)) {
			if(clicksAgregar<3) { // agregar max 3, sino advertencia
				equipoElegido[clicksAgregar] = crearMiembro();
				anyadirFila(equipoElegido);
				clicksAgregar++;
				System.out.println(clicksAgregar); //pruebas
			}else {
				JOptionPane.showMessageDialog(null, "Solo puedes formar un equipo de 3");
			}
			txtNombre.setText(null);
		}else if(e.getSource().equals(btnPartida)) {
			Partida partida = new Partida(equipoElegido);
			Partida.siguienteTurno();
		}
	}
	private Hijo crearMiembro() {
		try {
			NombreNulo(txtNombre.getText());
			if(tipos[0].equals(elecTipo.getSelectedItem())) {
				Carl Carl = new Carl(txtNombre.getText());
				return Carl;
			}else if(tipos[1].equals(elecTipo.getSelectedItem())) {
				Debbie Debbie = new Debbie(txtNombre.getText());
				return Debbie;
			}else if(tipos[2].equals(elecTipo.getSelectedItem())){
				Fiona Fiona = new Fiona(txtNombre.getText());
				return Fiona;
			}else if(tipos[3].equals(elecTipo.getSelectedItem())){
				Ian Ian = new Ian(txtNombre.getText());
				return Ian;
			}else if(tipos[4].equals(elecTipo.getSelectedItem())){
				Liam Liam = new Liam(txtNombre.getText());
				return Liam;
			}else if(tipos[5].equals(elecTipo.getSelectedItem())){
				Lip Lip = new Lip(txtNombre.getText());
				return Lip;
			}	
		}catch(TextoVacio e) {
			System.out.println("salta texto vacio");
		}catch(Exception e) {
			System.out.println("salta excepcion");
		}
		return null;
	}


	private void anyadirFila(Hijo[] equipoElegido) {
		modelo.addRow(new String[] {equipoElegido[clicksAgregar].getNombre(), equipoElegido[clicksAgregar].getClass().getSimpleName()});		
	}

	private void eliminarFila() { // solo borra el último sin importar cual quieres borrar
		Hijo[] copiaEquipo = Arrays.copyOf(equipoElegido, equipoElegido.length);// copia del equipo para sobrescribir apartir de determinada posición
		switch (tablaEquipo.getSelectedRow()) {
			case (0):
				System.arraycopy(copiaEquipo, 1, equipoElegido, 0, equipoElegido.length-2); //sobrescribo desde la posición 1 de copiaEquipo a equipoElegido desde la posición 0 hasta la penultima posición, que es la que eliminamos después
				equipoElegido[tablaEquipo.getSelectedRow()+2]= null; //ponemos a null la última posición y la borramos de la tabla
				modelo.removeRow(clicksAgregar-1); // clicksAgregar-1 para ajustar la posición al array
				break;
			case (1):
				System.arraycopy(copiaEquipo, 2, equipoElegido, 1, equipoElegido.length-2);
				equipoElegido[tablaEquipo.getSelectedRow()]= null;
				modelo.removeRow(clicksAgregar-1);
				break;
			case (2):
				equipoElegido[tablaEquipo.getSelectedRow()]= null;
				modelo.removeRow(clicksAgregar-1);
				break;

		//basura
		/*equipoElegido[tablaEquipo.getSelectedRow()]= equipoElegido[tablaEquipo.getSelectedRow()+1]; //Desplazamos los hijos hacia el inicio del array
				equipoElegido[tablaEquipo.getSelectedRow()+1]= equipoElegido[tablaEquipo.getSelectedRow()+2];*/
		//equipoElegido[tablaEquipo.getSelectedRow()]= equipoElegido[tablaEquipo.getSelectedRow()+1];
		}
	}
	
	private boolean NombreNulo(String nombre) throws TextoVacio{
		if(nombre == null) {
			JOptionPane.showMessageDialog(null, "Debes darle un nombre al personaje");
			throw new TextoVacio();
		}else {
			return true;
		}
	}
}
