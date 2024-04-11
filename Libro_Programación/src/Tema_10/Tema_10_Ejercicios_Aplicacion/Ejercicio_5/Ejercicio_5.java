package Tema_10.Tema_10_Ejercicios_Aplicacion.Ejercicio_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_5 {
    public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
        File ralph = new File("C:\\Program Files (x86)\\Ubisoft\\Ubisoft Game Launcher\\cache\\achievements");
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String[] archivos = ralph.list();
        int respuesta;

        do {
            menu();
            System.out.println("\nELIGE UNA OPCÍON: ");
            respuesta = Integer.parseInt(scanner.readLine());
            switch (respuesta) {
                case 0:
                    Thread.sleep(150);
                    System.out.println("SALIENDO DEL PROGRAMA");
                    Thread.sleep(150);
                    System.out.println(".");
                    Thread.sleep(150);
                    System.out.println(".");
                    Thread.sleep(150);
                    System.out.println(".");
                    break;
                case 1:
                    Thread.sleep(150);
                    for (int i = 0; i < archivos.length; i++) {
                        File violeta = new File(ralph, archivos[i]);
                        System.out.printf("\nNOMBRE: %s   NÚMERO ARCHIVOS: %d", violeta.getName(), violeta.length());
                    }
                    break;
                default:
                    break;
            }
        } while (respuesta != 0);
    }

    private static void menu() throws InterruptedException {
        Thread.sleep(150);
        System.out.println("1- CUAL ES EL NÚMERO DE DIRECTORIOS QUE HAY: ");    
        Thread.sleep(150);
        System.out.println("2 - CUANTOS FICHERO ESTÁN DEFINIDOS COMO SOLO TEXTO: ");
        Thread.sleep(150);
        System.out.println("3- CUÁNTOS FICHEROS SON EJECUTABLES: ");
        Thread.sleep(150);
        System.out.println("4- QUE TAMAÑO OCUPA EL DIRECTORIO EN MEMORIA: ");
    }
}  
