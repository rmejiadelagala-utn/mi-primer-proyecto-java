package ar.edu.utn.frba.tadp.holamundo;

import ar.edu.utn.frba.tadp.entes.*;

public class Test {

	public static void main (String[] args) {
		Recepcionista recepcionista = makeRecepcionista();
		Nombrable nombrable = new Mundo();
		recepcionista.saludar(nombrable);
		System.out.println();
		nombrable = new Persona("José");
		recepcionista.saludar(nombrable);
	}

	private static Recepcionista  makeRecepcionista() {
		return new RecepcionistaClasico(); 
	}
}
