/*
 * Usa el operador ?: para realizar un programa que dados dos números muestre un mensaje indicando cuál es el mayor de los dos
 */

package Tema_3_Ejercicios_Ampliacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_8 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        int a=0, b=0;

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce el número a: ");
        a = Integer.parseInt(teclado.readLine());
        System.out.println("Introduce el número b: ");
        b = Integer.parseInt(teclado.readLine());
        

        String mensaje = (a < b) ? "El primer número es menor" : "El primer número es mayor";

        System.out.println(mensaje);

    }
}
