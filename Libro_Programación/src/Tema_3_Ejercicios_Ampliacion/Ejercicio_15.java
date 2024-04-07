package Tema_3_Ejercicios_Ampliacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_15 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int lado = 0;

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce el lado del cuadrado (menor de 20): ");
        lado = Integer.parseInt(scanner.readLine());

        if (lado <= 20) {
            
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado; j++) {
                    System.out.print("□ ");
                }
                System.out.println();
            }
            

        } else {
            System.out.println("ERROR, FIN DEL PROGRAMA");
        }

    }
}
