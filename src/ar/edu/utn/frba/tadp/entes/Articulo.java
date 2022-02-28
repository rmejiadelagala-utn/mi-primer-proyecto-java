package ar.edu.utn.frba.tadp.entes;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target (ElementType.TYPE)
public @interface Articulo {
	String value();
}
