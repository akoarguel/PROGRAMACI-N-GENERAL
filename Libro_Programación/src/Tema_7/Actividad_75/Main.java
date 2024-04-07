package Tema_7.Actividad_75;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {


        Fecha f1 = new Fecha(15, 7, 1990);
        Persona p1 = new Persona("Juan", "Martínez Pérez", "12345678A", "Hombre", f1, 70, 1.70);

        Fecha f2 = new Fecha(10, 3, 1985);
        Persona p2 = new Persona("Sandra", "Alvarez García", "7849124G", "Mujer", f2, 54, 1.58);

        Fecha f3 = new Fecha(20, 9, 2000);
        Persona p3 = new Persona("Pedro", "López Martín", "98765432B", "Hombre", f3, 80, 1.86);

        Fecha f4 = new Fecha(5, 11, 1995);
        Persona p4 = new Persona("María", "González Rodríguez", "65432178C", "Mujer", f4, 60, 1.60);

        Fecha f5 = new Fecha(15, 7, 1990);
        Persona p5 = new Persona("Claudia", "Lopez de Santa", "12345678A", "Mujer", f5, 60, 1.67);

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        Persona[] personas = new Persona[5];

        personas[0] = p1;
        personas[1] = p2;
        personas[2] = p3;
        personas[3] = p4;
        personas[4] = p5;

        int respuesta;

        do {
            menu();
            System.out.println("Introduce una opción. ");
            respuesta = Integer.parseInt(scanner.readLine());
            System.out.println("\n");
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
                    ordenarApell(personas);
                    mostrarPersonasApell(personas);
                    break;
                case 5:
                    ordenarFechaNacimiento(personas);
                    mostrarPersonasFecha(personas);
                    break;
                case 6:
                    pesoMedio(personas);
                    break;
                case 7:
                    alturaEdadMedia(personas);
                case 8:

                    for (int i = 0; i < 100; i++) {
                        System.out.println("-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");    
                        System.out.println("FIN DEL PROGRAMA. ");
                        System.out.println("-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");    
                    }

                    break;
            
                default:
                System.out.println("Elige una opción válida. ");
                    break;
            }
        } while (respuesta != 8);
    }

    private static void alturaEdadMedia(Persona[] personas) {
        double alturaMedia=0, totalAltura=0;

        for (int i = 0; i < personas.length; i++) {
            totalAltura = totalAltura + personas[i].getAltura();
        }

        int edadMedia=0, edadTotal=0;

        for (int i = 0; i < personas.length; i++) {
            edadTotal = edadTotal + (2024 - personas[i].getFecha().getAño());
        }

        edadMedia = edadTotal/personas.length;
        alturaMedia = totalAltura/personas.length;

        System.out.println("La edad media de las personas es de: " + edadMedia + " años. ");
        System.out.println("La altura media de las personas es de: " + alturaMedia + " metros");

    }

    private static void pesoMedio(Persona[] personas) {
        int numPersonas = personas.length;
        double totalPeso=0, pesoMedio;

        for (int i = 0; i < numPersonas; i++) {
            totalPeso = totalPeso + personas[i].getPeso();
        }
        pesoMedio = totalPeso/numPersonas;
        System.out.println("El peso medio es de: " + pesoMedio);
    }

    private static void mostrarPersonasFecha(Persona[] personas) {
        System.out.println("Personas ordenadas por fecha de nacimiento:");
        for (Persona persona : personas) {
            if (persona != null) {
                System.out.println(persona.getNombre() + "      " + persona.getFecha());
                System.out.println();
            }
        }
    }

    private static void ordenarFechaNacimiento(Persona[] personas) {
        Arrays.sort(personas, (p1, p2) -> {
            if (p1 != null && p2 != null) {
                return p1.getFecha().compareTo(p2.getFecha());
            } else if (p1 == null && p2 == null) {
                return 0;
            } else if (p1 == null) {
                return 1;
            } else {
                return -1;
            }
        });
    }

    private static void ordenarApell(Persona[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Verificar si los elementos no son null antes de comparar
                if (personas[j] != null && personas[j + 1] != null &&
                    personas[j].getApellidos() != null && personas[j + 1].getApellidos() != null &&
                    personas[j].getApellidos().compareTo(personas[j + 1].getApellidos()) > 0) {
                    // Intercambiar las personas si el apellido es mayor
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }
    
    private static void mostrarPersonasApell(Persona[] personas) {
        System.out.println("Personas ordenadas por apellido:");
        System.out.println();
        for (Persona persona : personas) {
            if (persona != null) {
                persona.mostrarApellidos();
                System.out.println(); // Salto de línea para separar personas
            }
        }
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
        System.out.println("\n");
        System.out.println("1 - Insertar persona");
        System.out.println("2 - Eliminar persona");
        System.out.println("3 - Modificar personas");
        System.out.println("4 - Ordenar por apellido");
        System.out.println("5 - Ordenar por fecha de nacimiento");
        System.out.println("6 - Peso medio de las personas");
        System.out.println("7 - Altura y edad media");
        System.out.println("8 - Salir");
    }
}