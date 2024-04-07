package Tema_3_Ejercicios_Ampliacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;

public class Ejercicio_14 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int x = 0;
        int y = 0;
        long result = 0;

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce X: ");
        x = Integer.parseInt(scanner.readLine());
        System.out.println("Introduce Y: ");
        y = Integer.parseInt(scanner.readLine());

        for (int i = 0; i <= y; i++) {
            result = x*x;   
        }

        System.out.println("El resultado de la potencia es: " + result);
    }
}
