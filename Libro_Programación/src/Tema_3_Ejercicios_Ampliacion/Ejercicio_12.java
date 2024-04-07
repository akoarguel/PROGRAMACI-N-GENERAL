package Tema_3_Ejercicios_Ampliacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_12 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int respuesta = 0;
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1 - PIRÁMIDE INVERTIDA");
        System.out.println("2 - PIRÁMIDE NORMAL");
        System.out.println("3 - CUADRADO");
        System.out.println("\nSeleccióna una opción: ");
        respuesta = Integer.parseInt(scanner.readLine());

        switch (respuesta) {
            case 1:
                System.out.println("@@@@@@@@@");
                System.out.println(" @@@@@@@");
                System.out.println("  @@@@@");
                System.out.println("   @@@");
                System.out.println("    @");
                break;
        
            case 2:
                System.out.println("    @");
                System.out.println("   @@@");
                System.out.println("  @@@@@");
                System.out.println(" @@@@@@@");
                System.out.println("@@@@@@@@@");
                break;
        
            case 3:
                System.out.println("@@@@@");
                System.out.println("@@@@@");
                System.out.println("@@@@@");
                System.out.println("@@@@@");
                System.out.println("@@@@@");
                break;
        
            default:
                break;
        }

    }

    
}