package Tema_3_Ejercicios_Ampliacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_11 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num = 0;
        char a, b, c, d, e;

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduce el número por teclado:  ");
        num = Integer.parseInt(scanner.readLine());

        String numString = String.valueOf(num);

        a = numString.charAt(0);
        b = numString.charAt(1);
        c = numString.charAt(2);
        d = numString.charAt(3);
        e = numString.charAt(4);

        if (a == e && b == d) {
            System.out.println("El número " + num + " es un palíncromo");
        } else {
            System.out.println("No es un palíncromo");
        }

    }
}
