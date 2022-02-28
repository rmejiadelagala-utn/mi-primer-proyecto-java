package ar.edu.utn.frba.tadp.entes;

@Articulo("una")
public class Persona implements Nombrable{
		
	private String nombre;
	private Direccion direccion;
	
	@Override
	public String toString() {
		return this.getNombre();
	}
	
	
	public Persona() {
		super();
	}
	
	public Persona(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public Persona (String nombre , Direccion direccion) {
		this();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Direccion getDireccion() {
		return this.direccion;
	}
	
	public void setDireccion(Direccion direccion) {
		this.direccion= direccion;
	}
	
	public boolean viveEn(Direccion direccion) {
		return this.direccion == direccion;		
	}

}
