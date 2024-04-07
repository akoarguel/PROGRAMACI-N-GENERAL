/*
 * Realiza un programa tal que pida al usuario una fecha del año (día y mes) y muestre por pantalla
 * los días transcurridos desde el 1 de enero
 */

package Tema_3_Ejercicios_Ampliacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_19 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int mes;
        int dia = 0;
        int diasTrans;

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        

        do {
            System.out.println("Introduce el mes:  ");
            mes = Integer.parseInt(scanner.readLine());
        } while (mes == 0 || mes > 13);

        do {
            System.out.println("Introduce el día:  ");
            dia = Integer.parseInt(scanner.readLine());
        } while (dia == 0 || dia > 31);
        
        
        
        switch (mes) {
            case 1:
                diasTrans = dia;
                System.out.println("Han transcurrido " + diasTrans + " días desde el 1 de enero. ");
                break;
            case 2:
                diasTrans = 31 + dia;
                System.out.println("Han transcurrido " + diasTrans + " días desde el 1 de enero. ");
                break;
            case 3:
                diasTrans = 60 + dia;
                System.out.println("Han transcurrido " + diasTrans + " días desde el 1 de enero. ");
                break;
            case 4:
                diasTrans = 91 + dia;
                System.out.println("Han transcurrido " + diasTrans + " días desde el 1 de enero. ");
                break;
            case 5:
                diasTrans = 121 + dia;
                System.out.println("Han transcurrido " + diasTrans + " días desde el 1 de enero. ");
                break;
            case 6:
                diasTrans = 152 + dia;
                System.out.println("Han transcurrido " + diasTrans + " días desde el 1 de enero. ");
                break;
            case 7:
                diasTrans = 182 + dia;
                System.out.println("Han transcurrido " + diasTrans + " días desde el 1 de enero. ");
                break;
            case 8:
                diasTrans = 213 + dia;
                System.out.println("Han transcurrido " + diasTrans + " días desde el 1 de enero. ");
                break;
            case 9:
                diasTrans = 243 + dia;
                System.out.println("Han transcurrido " + diasTrans + " días desde el 1 de enero. ");
                break;
            case 10:
                diasTrans = 274 + dia;
                System.out.println("Han transcurrido " + diasTrans + " días desde el 1 de enero. ");
                break;
            case 11:
                diasTrans = 304 + dia;
                System.out.println("Han transcurrido " + diasTrans + " días desde el 1 de enero. ");
                break;
            case 12:
                diasTrans = 334 + dia;
                System.out.println("Han transcurrido " + diasTrans + " días desde el 1 de enero. ");
                break;
            
        
            default:
                break;
        }

    }
}
