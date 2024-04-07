/*
 * Dada las vaibales enteras x=3, y=4 y z=2 indica que se asignará a la variable resultado en cada expresión:
 */

package Tema_3;

public class Actividad_3_5 {

	public static void main(String[] args) {
		int x=3, y=4, z=2;
		double resultado;
		
		resultado = x+y*z;
		System.out.println(resultado);
		resultado = (x+y)*z;
		System.out.println(resultado);
		resultado = ++x%y;;
		System.out.println(resultado);
		resultado = x+z/y;
		System.out.println(resultado);
		
		
	}

}
