/*
 * Realiza un pequeño progrma de colsula que pida al usuario el valor del lado de un cuadrado y muestre 
 * como resultado el área del mismo.
 */
package Tema_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad_3_6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double lado;
		
		System.out.println("Introduce el lado del cuadrado: ");
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		lado = Double.parseDouble(teclado.readLine());
		
		lado = lado*lado;
		
		System.out.println("El área del cuadrado es: " + lado);

	}

}
