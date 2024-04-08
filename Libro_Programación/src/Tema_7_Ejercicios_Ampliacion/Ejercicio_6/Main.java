package Tema_7_Ejercicios_Ampliacion.Ejercicio_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("INTRODUCE EL ANCHO DEL RECTÁGULO:");
        int anchoPantalla = Integer.parseInt(scanner.readLine());
        System.out.println("INTRODUCE EL ANCHO DEL RECTÁGULO:");
        int altoPantalla = Integer.parseInt(scanner.readLine());

        Rectangulo rectangulo = new Rectangulo();

        

            if (rectangulo.esValido(anchoPantalla, altoPantalla)) {
                System.out.println("ES VÁLIDO");
            } else {
                System.out.println("ERROR. NO ES VÁLIDO"); 
            }  

        rectangulo.dibuja(anchoPantalla, altoPantalla);
        


        


    }
}   
