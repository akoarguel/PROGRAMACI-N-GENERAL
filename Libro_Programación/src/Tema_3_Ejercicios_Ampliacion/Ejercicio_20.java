/*
 * es primo?
 */

package Tema_3_Ejercicios_Ampliacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_20 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num;

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("INTRODUCE UN NÚMERO Y DIRÉ SI ES PRIMO O NO:    ");
        num = Integer.parseInt(scanner.readLine());

        boolean esPrimo = esPrimo(num);

        if (esPrimo) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número NO es primo: ");
        }
    }

    private static boolean esPrimo(int num) {

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }
}
