package Tema_3_Ejercicios_Ampliacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_10 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num = 0;

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el número:    ");


        num = Integer.parseInt(teclado.readLine());

        String numeroString = String.valueOf(num);

        System.out.print(numeroString.charAt(0));

        for (int i = 1; i < numeroString.length(); i++) {
            System.out.print(" - " + numeroString.charAt(i));
        }
    }
}
