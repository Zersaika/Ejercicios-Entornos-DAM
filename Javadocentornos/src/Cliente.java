/**
 * <h2>La clase Cliente se utiliza para crear, mostrar los datos de un cliente, tambien para ve cuantas ventas llevas,y finalmente cambiar los nuemeros de telefono</h2>
 * @author Óscar
 * @version 1.0
 * @since 12/01/2020
 *
 */
public class Cliente extends Object {
	/**
	 * Atributo Codigo del cliente
	 */
public int codigo;
/**
 * Atributo Nombre del cliente
 */
public String nombre;
/**
 * Atributo Apellido del cliente
 */
public String apellido;
/**
 * Atributo Email del cliente
 */
public String email;
/**
 * Atributo Telefono del cliente
 */
public long telefono;
/**
 * Atributo de nuevo cliente
 */
public boolean nuevo;
/**
 * Atributo ventas del cliente
 */
public double cifraVentas;
/**
 * Constructor sin parametros
 */
public Cliente() {
	// TODO Auto-generated constructor stub
}
/**
 * Constructor con 3 parametros
 * Crea objetos de tipo clente, con codigo, nombre y email
 * 
 * @param codigo codigo del cliente
 * @param nombre nombre del cliente
 * @param email email del cliente
 * 
 */
public Cliente(int codigo, String nombre, String email) {
	super(); // Object()
	this.codigo = codigo;
	this.nombre = nombre;
	this.email = email;
}
/**
 * Constructor con 6 parametros
 * Crea objetos de tipo clente, con codigo, nombre, email, telefono, nuevo y cifraVentas
 * 
 * @param codigo codigo del cliente
 * @param nombre nombre del cliente
 * @param email email del cliente
 * @param telefono telefono del cliente
 * @param nuevo Si el cliente es nuevo
 * @param cifraVentas Ventas del cliente
 */
public Cliente(int codigo, String nombre, String email, long telefono, boolean nuevo, double cifraVentas) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
	this.email = email;
	this.telefono = telefono;
	this.nuevo = nuevo;
	this.cifraVentas = cifraVentas;
}
// acciones -> metodos
/**
 * Muestra los datos del cliente
 */
public void mostrarDatos() {
	System.out.println("Codigo: "+codigo+" Nombre: "+nombre+" ... ");
}
/**
 * @return Devuelve las ventas del cliente
 */
public double verCifraVentas() {
	return cifraVentas;
}
/**
 * Cambia el numero de telefono
 * @param nuevoTelefono Es el nuevo telefono del cliente
 */
public void cambiarTelefono(long nuevoTelefono) {
	telefono=nuevoTelefono;
}
}
