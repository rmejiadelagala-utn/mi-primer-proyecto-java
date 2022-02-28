package ar.edu.utn.frba.tadp.holamundo;

import java.util.HashSet;
import java.util.Collection;
import ar.edu.utn.frba.tadp.entes.*;

public class Test1 {
	
	public static void main(String[] args) {
		Direccion direccion = new Direccion("Estebaan de Luca",1322);
		Direccion otraInstancia = new Direccion("Estebaan de Luca",1322);
		System.out.println("direccion.equals(otraInstancia): "+ direccion.equals(otraInstancia));
		Collection<Direccion> coleccion = new HashSet<Direccion>();
		coleccion.add(direccion);
		System.out.println("coleccion.contains(otraInstancia): " + coleccion.contains(otraInstancia));
	}
	
}