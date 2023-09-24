package info;
import static info.colores.*;

	public class funcion {
	    String nombre; 
	    int cedula;
	    boolean aprobador;
	    int nota;

	    public funcion(String nombre, int cedula, boolean aprobador, int nota) {
	    	
	        if (nombre == null || nombre.isEmpty()) {
	            throw new IllegalArgumentException(ROJO + "El nombre no puede estar vacío" + ROJO);
	        }

	        if (cedula < 10000000 || cedula > 99999999) {
	            throw new IllegalArgumentException(ROJO + "La cédula de " + nombre + " debe tener 8 dígitos numéricos" + ROJO);
	        }
	        
	        if (!aprobador) {
	            if (nota > 6) {
	                throw new IllegalArgumentException(ROJO + "La nota de " + nombre + " se considera no aprobada siendo mayor que 6, cambie el 'false' por 'true'" + ROJO);
	            }
	        } else {
	            if (nota < 6) {
	                throw new IllegalArgumentException(ROJO + "La nota de " + nombre + " se considera aprobada siendo menor que 6, cambie el 'true' por 'false'" + ROJO);
	            }
	        }
	        
	        if (nota < 1 || nota > 12) {
                throw new IllegalArgumentException(ROJO + "La nota de " + nombre + " tiene que ser entre el 1 y el 12 " + ROJO);
	        }
	    	
	        this.nombre = nombre;
	        this.cedula = cedula;
	        this.aprobador = aprobador;
	        this.nota = nota;
	    }
	}

/**
 * @author Nicolay Chiazzaro
 *
 */
