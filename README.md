### IMPORTANTE

Hola! Lo que va el proyecto de **Aprobado-y-Desaprobado** es que, compartiré como hice un programa para ver la lista de alumnos que estan aprobados y desaprobados con el código **Java**. Aviso que el código tanto como el proyecto se van a ir avanzando con el tiempo, lo mismo, que encontrar formas mas optimizables e efectivas a la hora de crear un código. Espero que con el programa que estoy creando te sea de ayuda, cualquier duda/pregunta que tengas podes hacerlo en mi Instagram **@nicolay.metal**

![image](https://github.com/uyelnico/uyelnico/assets/145890121/1e54bd6e-cffc-4d45-af0c-8a23edf0b64e)

## Aprobado y Desaprobado

![image](https://github.com/uyelnico/Aprobado-y-Desaprobado/assets/145890121/b4c182de-002e-40f1-9dae-fee675ec8988)

![image](https://github.com/uyelnico/Aprobado-y-Desaprobado/assets/145890121/ee45a1ea-ad22-4a10-9367-ffc4fca7f80d)

## Package

```Java
package info;
```

## Import (opcional)

```java
import static info.colores.*;
```

## colores.java (opcional)

```Java
public class colores {

	public static final String ROJO = "\033[0;31m";
	public static final String VERDE = "\033[0;32m";
	
}
```

## funcion.java

Clase se utiliza para crear objetos que representan alumnos con un nombre, una cédula, un estado de aprobación y una nota. El constructor asegura que los datos proporcionados sean válidos y lanza excepciones en caso de problemas.

```
La clase funcion tiene cuatro atributos: nombre (una cadena de caracteres), cedula (un número entero), aprobador (un valor booleano) y nota (un número entero).
Se define un constructor para la clase funcion que toma cuatro parámetros: nombre, cedula, aprobador y nota.
El constructor realiza una serie de verificaciones y validaciones en los parámetros de entrada:
Verifica si nombre es nulo o está vacío. Si es así, lanza una excepción con un mensaje de error.
Verifica si cedula es un número de 8 dígitos. Si no cumple esta condición, lanza una excepción con un mensaje de error que incluye el nombre de la persona.
Si aprobador es false, verifica si nota es mayor que 6 y lanza una excepción en caso afirmativo. Si aprobador es true, verifica si nota es menor que 6 y lanza una excepción en ese caso.
Verifica que nota esté en el rango entre 1 y 12. Si no está en ese rango, lanza una excepción.
Si todas las validaciones son exitosas, se asignan los valores de los parámetros a los atributos de la instancia de la clase.
```

```Java
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
```

## datos.java

La clase se utiliza para almacenar una lista de estudiantes, donde cada estudiante está representado por un objeto de la clase funcion. Estos objetos tienen valores específicos para el nombre, la cédula, el estado de aprobación y la nota de cada estudiante.

```
La clase datos contiene un campo público llamado estudiantes, que es un arreglo (array) de objetos de la clase funcion.
El arreglo estudiantes se inicializa con tres objetos de la clase funcion, cada uno con sus propios valores:

El primer objeto representa al "Alumno 1" con una cédula de 12385678, no aprobado (false) y una nota de 6.
El segundo objeto representa al "Alumno 2" con una cédula de 23556789, aprobado (true) y una nota de 8.
El tercer objeto representa a un estudiante con nombre "rgr", cédula 34585690, aprobado (true) y una nota de 10.
```

```Java
public class datos {

    public static funcion[] estudiantes = {
        new funcion("Alumno 1", 12385678, false, 6),
        new funcion("Alumno 2", 23556789, true, 8),
        new funcion("Alumno 3", 34585690, true, 10)
    };
}
```

## inicio.java

Recorre la lista de estudiantes y muestra quiénes aprobaron en verde y quiénes desaprobaron en rojo, según el valor de la propiedad aprobador de cada estudiante.

```
En el método main, se realiza un bucle for-each que recorre el arreglo de estudiantes almacenado en la clase datos.
En el primer bucle for-each, se verifica si el estudiante tiene la propiedad aprobador establecida como true. Si es así, se imprime un mensaje en verde que indica que el estudiante aprobó, mostrando su nombre, cédula y nota.
Luego, en el segundo bucle for-each, se verifica si el estudiante tiene la propiedad aprobador establecida como false. Si es así, se imprime un mensaje en rojo que indica que el estudiante desaprobó, mostrando su nombre, cédula y nota.
```



```Java
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
```

`Author: Nicolay_Chiazzaro`
