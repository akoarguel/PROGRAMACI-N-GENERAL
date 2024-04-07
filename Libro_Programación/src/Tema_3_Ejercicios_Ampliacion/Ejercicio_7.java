package Tema_3_Ejercicios_Ampliacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_7 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese un número entero positivo: ");
        int numero = Integer.parseInt(teclado.readLine());

        long factorial = 1; 
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        // Mostrar el factorial por pantalla
        System.out.println("El factorial de " + numero + " es: " + factorial);

        teclado.close();
    }
}
