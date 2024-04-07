package Tema_3_Ejercicios_Ampliacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_9 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int a = 0;
        int b = 0;
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce el primer número: ");
        a = Integer.parseInt(teclado.readLine());
        System.out.println("Introduce el segundo número: ");
        b = Integer.parseInt(teclado.readLine());

        String mensaje = (a % 2 == 0) ? "El número A es divisible por B" : "El número A no es divisible por B";

        System.out.println(mensaje);

        teclado.close();
        
    }
}
