package info;
import static info.colores.*;

public class inicio {

	public static void main(String[] args) {
		
        for (funcion estudiante : datos.estudiantes) {
            if (estudiante.aprobador) {
                System.out.println(VERDE + " Aprobo: " + "Nombre: " + estudiante.nombre + ", Cédula: " + estudiante.cedula + ", Nota: " + estudiante.nota + VERDE);
            }
        }
                
        for (funcion estudiante : datos.estudiantes) {
        	if (!estudiante.aprobador) {
                System.out.println(ROJO + " Desaprobo: " + "Nombre: " + estudiante.nombre + ", Cédula: " + estudiante.cedula + ", Nota: " + estudiante.nota + ROJO);
        	}
        }
		

	}

}

/**
 * @author Nicolay Chiazzaro
 *
 */
