package ar.edu.utn.frba.tadp.entes;

public class Direccion {
	
	private String calle;
	private int numero;

	@Override
	public String toString() {
		return this.calle + " " + this.numero;
	}
	public Direccion(String calle, int numero) {
		this.calle = calle;
		this.numero = numero;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Direccion)) {
		return false;
		}
		Direccion otraDireccion = (Direccion) obj;
		return this.calle.equals(otraDireccion.calle) && this.numero == otraDireccion.numero;
	}

}
