package Tema_10.Actividades_Temario.PRUEBA_JAVA.FicheroPersona.EjercicioPersonaNotion;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.Scanner;

public class EscribirFichObject {
    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
        File FicheroPersonas = new File("C:\\Users\\manel\\Documents\\FICHEROS\\FicheroPersonasNotion.dat");
        Persona persona; 

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FicheroPersonas));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FicheroPersonas));
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
    
        String nombres[] = {"Ana", "Luis Miguel", "Alicia", "Pedro", "Manuel",
					             "Andrés", "Julio", "Antonio", "María Jesús"};
		int edades[] = {14, 15, 13, 16, 19, 13, 15, 21, 11}; 

        Thread.sleep(150);
        System.out.println("Introducir los datos de las personas por Default. ");
        Thread.sleep(150);
        System.out.println(".");
        Thread.sleep(150);
        System.out.println(".");
        Thread.sleep(150);
        System.out.println(".");

        try {
            for (int i = 0; i < edades.length; i++) {
                persona = new Persona(nombres[i], edades[i]);
                oos.writeObject(persona);
                System.out.println("Grabo los datos de la persona " + (i+1));
            }
            System.out.println("Introducidos con éxito. ");
        } catch (IOException e) {
            System.out.println("ERROR. HUBO UN ERROR CON LA ESCRITUTA EN EL FICHERO .dat");
            e.printStackTrace();
        }

        int respuesta;

        do {
            menu();
        System.out.println("\nELIGE UNA OPCIÓN: ");
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
                introducirPersona(FicheroPersonas, oos, scanner);
                break;
            case 2:
                visualizarArchivo(FicheroPersonas, ois, scanner);
                break;
            default:
                System.out.println("\nINTRODUCE UNA OPCIÓN VÁLIDA. ");
                break;
        }
        } while (respuesta != 0);
    }

    private static void visualizarArchivo(File ficheroPersonas, ObjectInputStream ois, BufferedReader scanner) {
        System.out.println();
        Persona persona;
        int i = 1;

        try {
            while (true) {
                persona = (Persona) ois.readObject();
                System.out.println(i + " --> "); 
                System.out.println("NOMBRE --> " + persona.getNombre() + "  |   EDAD --> " + persona.getEdad());     
            }
        } catch (EOFException e) {
            System.out.println();
        } catch (StreamCorruptedException es) {
            // TODO Auto-generated catch block
            es.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }

    private static void introducirPersona(File ficheroPersonas, ObjectOutputStream oos, BufferedReader scanner) throws IOException {
        String nombre;
        int edad;
        Persona persona;

        System.out.println("Introduce el nombre de la persona: ");
        nombre = scanner.readLine();
        System.out.println("Introduce la edad de la persona: ");
        edad = Integer.parseInt(scanner.readLine());

        persona = new Persona(nombre, edad);
        oos.writeObject(persona);
        System.out.println("DATOS INTRODUCIRDOS CORRECTAMENTE. ");
        System.out.println(persona.toString());
        

    }

    private static void menu() {
        System.out.println("\n1 - INTRODUCE UNA NUEVA PERSONA ");
        System.out.println("2 - VISUALIZA ELARCHIVO FicheroPersonasNotion.dat ");
        System.out.println("0 - SALIR DEL PROGRAMA");
        
    }
}
