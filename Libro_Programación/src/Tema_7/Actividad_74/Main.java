package Tema_7.Actividad_74;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Tema_7.Actividad_74.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {


        Fecha f1 = new Fecha(15, 7, 1990);
        Persona p1 = new Persona("Juan", "Martínez Pérez", "12345678A", "Hombre", f1, 1.75, 70);

        Fecha f2 = new Fecha(10, 3, 1985);
        Persona p2 = new Persona("Sandra", "Alvarez García", "7849124G", "Mujer", f2, 1.55, 54);

        Fecha f3 = new Fecha(20, 9, 2000);
        Persona p3 = new Persona("Pedro", "López Martín", "98765432B", "Hombre", f3, 1.80, 80);

        Fecha f4 = new Fecha(5, 11, 1995);
        Persona p4 = new Persona("María", "González Rodríguez", "65432178C", "Mujer", f4, 1.60, 60);

        Fecha f5 = new Fecha(15, 7, 1990);
        Persona p5 = new Persona("María", "González", "12345678A", "Mujer", f5, 1.65, 60);

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        Persona[] personas = new Persona[5];
        int respuesta;

        

        do {
            menu();
            System.out.println("Introduce una opción. ");
            respuesta = Integer.parseInt(scanner.readLine());
            switch (respuesta) {
                case 1:

                    insertar(personas, scanner);
                    break;
                case 2:
                    eliminar(personas, scanner);
                    break;
                case 3:
                    modificar(personas, scanner);
                    break;
                case 4:
                    System.out.println("FIN DEL PROGRAMA. ");
                    break;
            
                default:
                System.out.println("Elige una opción válida. ");
                    break;
            }
        } while (respuesta != 4);


    }

    

    private static void eliminar(Persona[] personas, BufferedReader scanner) throws IOException {
        String nombre;
        System.out.println("Introduce el nombre de la persona que quieres eliminar: ");
        nombre = scanner.readLine();
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null && personas[i].getNombre().equalsIgnoreCase(nombre)) {
                personas[i] = null;
                System.out.println("Persona eliminada correctamente.");
                return; // Salir del método después de eliminar la persona
            }
        }
        System.out.println("ERROR. EL NOMBRE QUE HAS INTRODUCIDO NO EXISTE O YA HA SIDO ELIMINADO.");
    }
    



    private static void modificar(Persona[] personas, BufferedReader scanner) throws IOException {
        String nombre, apellido, dni, sexo;
        int dia, mes, año;
        Fecha fecha;
        double peso, altura;
        String respuesta;
        System.out.println("Introduce el nombre de la persona que quieres eliminar: ");
        respuesta = scanner.readLine();

        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getNombre().equalsIgnoreCase(respuesta)) {
                System.out.println("Introduce el nombre de la persona: ");
                nombre = scanner.readLine();
                System.out.println("Introduce los apellidos de la persona: ");
                apellido = scanner.readLine();
                System.out.println("Introduce el DNI de la persona: ");
                dni = scanner.readLine();
                System.out.println("Introduce el sexo de la persona (Hombre, Mujer, Otro): ");
                sexo = scanner.readLine();
                System.out.println("Introduce el día de nacimiento: ");
                dia = Integer.parseInt(scanner.readLine());
                System.out.println("Introduce el mes de nacimiento: ");
                mes = Integer.parseInt(scanner.readLine());
                System.out.println("Introduce el año de nacimiento: ");
                año = Integer.parseInt(scanner.readLine());
                fecha = new Fecha(dia, mes, año);
                System.out.println("Introduce la altura: ");
                altura = Double.parseDouble(scanner.readLine());
                System.out.println("Introduce la peso: ");
                peso = Double.parseDouble(scanner.readLine());
                
                personas[i] = new Persona(nombre, apellido, dni, sexo, fecha, peso, altura);
                System.out.println("Persona insertada correctamente en la posición " + i);
                return; // Salir del método después de insertar la persona
            } else {
                System.out.println("ERROR. EL NOMBRE QUE HAS INTRODUCIDO NO EXISTE. ");
            }
        }
    }



    private static void insertar(Persona[] personas, BufferedReader scanner) throws IOException {
        String nombre, apellido, dni, sexo;
        int dia, mes, año;
        Fecha fecha;
        double peso, altura;

        for (int i = 0; i < personas.length; i++) {
            if (personas[i] == null) {
                System.out.println("Introduce el nombre de la persona: ");
                nombre = scanner.readLine();
                System.out.println("Introduce los apellidos de la persona: ");
                apellido = scanner.readLine();
                System.out.println("Introduce el DNI de la persona: ");
                dni = scanner.readLine();
                System.out.println("Introduce el sexo de la persona (Hombre, Mujer, Otro): ");
                sexo = scanner.readLine();
                System.out.println("Introduce el día de nacimiento: ");
                dia = Integer.parseInt(scanner.readLine());
                System.out.println("Introduce el mes de nacimiento: ");
                mes = Integer.parseInt(scanner.readLine());
                System.out.println("Introduce el año de nacimiento: ");
                año = Integer.parseInt(scanner.readLine());
                fecha = new Fecha(dia, mes, año);
                System.out.println("Introduce la altura: ");
                altura = Double.parseDouble(scanner.readLine());
                System.out.println("Introduce la peso: ");
                peso = Double.parseDouble(scanner.readLine());
                
                personas[i] = new Persona(nombre, apellido, dni, sexo, fecha, peso, altura);
                System.out.println("Persona insertada correctamente en la posición " + i);
                return; // Salir del método después de insertar la persona
            } else {
                System.out.println("NO HAY ESPACIO EN EL ARRAY PARA METER OTRA PERSONA. ");
            }
        }
    }

    public static void menu(){
        System.out.println("1 - Insertar persona");
        System.out.println("2 - Eliminar persona");
        System.out.println("3 - Modificar personas");
        System.out.println("4 - Salir");
        
    }
}