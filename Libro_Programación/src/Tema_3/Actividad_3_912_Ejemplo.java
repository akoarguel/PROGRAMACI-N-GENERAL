package Tema_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad_3_912_Ejemplo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int numero = 0;
		int totalDivisores = 0;
		int contador = 1;
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un número. ");
		numero = Integer.parseInt(teclado.readLine());
		
		while (contador <= numero) {
			
			if (numero % contador == 0) {
				totalDivisores++;
			}
			System.out.println(totalDivisores);
			contador++;
		}

	}

}
