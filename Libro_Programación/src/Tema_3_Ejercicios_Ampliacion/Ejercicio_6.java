package Tema_3_Ejercicios_Ampliacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int año = 0;
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce el año: ");
		año = Integer.parseInt(teclado.readLine());
		
		if (año%400 == 0) {
			System.out.println("Es bisiesto. " );
		} else if (año%4 == 0 && año%100 != 0) {
			System.out.println("Es bisiesto. " );
		} else {
			System.out.println("No es bisiesto. ");
		}

	}

}
