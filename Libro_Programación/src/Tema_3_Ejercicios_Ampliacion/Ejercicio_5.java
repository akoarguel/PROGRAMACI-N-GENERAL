package Tema_3_Ejercicios_Ampliacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double importe = 0;
		double importeFinal = 0;
		double descuento = 0;
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce el importe: ");
		importe = Double.parseDouble(teclado.readLine());
		
		if (importe < 200) {
			System.out.println("Sin descuento aplicado. Precio final: "+ importe);
		} else if(importe >= 200 && importe < 500){
			descuento = importe * 0.05;
			importeFinal = importe - descuento;
			System.out.println("Descuento del 5% aplicado. Precio final: "+ importeFinal);

		} else if (importe >= 500 && importe < 1000) {
			descuento = importe * 0.10;
			importeFinal = importe - descuento;
			System.out.println("Descuento del 10% aplicado. Precio final: "+ importeFinal);
		} else {
			descuento = importe * 0.15;
			importeFinal = importe - descuento;
			System.out.println("Descuento del 15% aplicado. Precio final: "+ importeFinal);
		}

	}

}
