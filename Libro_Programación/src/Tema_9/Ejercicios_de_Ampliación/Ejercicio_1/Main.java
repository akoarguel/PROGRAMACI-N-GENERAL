package Tema_9.Ejercicios_de_Ampliación.Ejercicio_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import Tema_9.Ejercicios_de_Ampliación.Ejercicio_1.Cosas_varias.Alimentacion;
import Tema_9.Ejercicios_de_Ampliación.Ejercicio_1.Cosas_varias.Energia;
import Tema_9.Ejercicios_de_Ampliación.Ejercicio_1.Cosas_varias.Tamaño;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<SerVivo> seresVivos = new ArrayList<>();
        int respuesta;

        animalesDefault(seresVivos);
        for (SerVivo serVivo : seresVivos) {
            System.out.println(serVivo.toString());
        }

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
                    insertar(scanner, seresVivos);
                    break;
            
                default:
                    break;
            }
        } while (respuesta != 0);
    }

    private static void insertar(BufferedReader scanner, ArrayList<SerVivo> seresVivos) throws IOException, InterruptedException {
        int tipo;

        System.out.println("¿QUE TIPO DE SER VIVO QUIERES INTRODUCIR?");
        System.out.println("1 - PLANTA");
        System.out.println("2 - PERRO");
        System.out.println("3 - HOMBRE");
        tipo = Integer.parseInt(scanner.readLine());

        switch (tipo) {
            case 1:
                planta(scanner, seresVivos);
                break;
            case 2:
                perro(scanner, seresVivos);
                break;
            case 3: 
                Thread.sleep(150);
                System.out.println("añadir hombres no disponible por el momento");
                Thread.sleep(150);
                System.out.println("SALIENDO");
                Thread.sleep(150);
                System.out.println(".");
                Thread.sleep(150);
                System.out.println(".");
                Thread.sleep(150);
                System.out.println(".");
                break;
            case 0:
                Thread.sleep(150);
                System.out.println("SALIENDO");
                Thread.sleep(150);
                System.out.println(".");
                Thread.sleep(150);
                System.out.println(".");
                Thread.sleep(150);
                System.out.println(".");
                break;
            default:
                break;
        }

    }

    // GENERADOR DE PERRO

    private static void perro(BufferedReader scanner, ArrayList<SerVivo> seresVivos) throws NumberFormatException, IOException {
        // Creas un array con los posibles valores de Alimentacion
        Alimentacion[] tiposAlimentacion = {Alimentacion.CARNIVORO, Alimentacion.HERVIVORO, Alimentacion.OMNIVORO};

        // Creas un objeto Random para generar números aleatorios
        Random random = new Random();

        // Generas un índice aleatorio para seleccionar un tipo de alimentación del array
        int indice = random.nextInt(tiposAlimentacion.length);

        System.out.println("INTRODUCE EL NOMBRE CIENTIFICO: ");
        String nombreCientifico = scanner.readLine();
        System.out.println("INTRODUCE LA EDAD: ");
        int edad = Integer.parseInt(scanner.readLine());
        System.out.println("INTRODUCE EL HABITAT");
        String habitat = scanner.readLine();
        System.out.println("INTRODUCE EL ANIMAL: ");
        String animal = scanner.readLine();
        System.out.println("INTRODUCE EL PESO: ");
        double peso = Double.parseDouble(scanner.readLine());
        System.out.println("INTRODUCE LA LONGEVIDAD");
        int longevidad = Integer.parseInt(scanner.readLine());
        System.out.println("INTRODUCE LA RAZA: ");
        String raza = scanner.readLine();

        SerVivo perro = new Perro(nombreCientifico, edad, habitat, animal, peso, tiposAlimentacion[indice], longevidad, raza, Tamaño.GRANDE, Energia.MEDIO);

        seresVivos.add(perro);

        System.out.println(perro.toString());
    }

    // GENERADOR DE PLANTA

    private static void planta(BufferedReader scanner, ArrayList<SerVivo> seresVivos) throws NumberFormatException, IOException {
        System.out.println("INTRODUCE EL NOMBRE CIENTIFICO: ");
        String nombreCientifico = scanner.readLine();
        System.out.println("INTRODUCE LA EDAD: ");
        int edad = Integer.parseInt(scanner.readLine());
        System.out.println("INTRODUCE EL HABITAT");
        String habitat = scanner.readLine();
        System.out.println("INTRODUCE EL TIPO DE PLANTA: ");
        String tipoPlanta = scanner.readLine();
        System.out.println("INTRODUCE LA ALTURA: ");
        String altura = scanner.readLine();
        System.out.println("INTRODUCE EL TIPO DE SUELO: ");
        String tipoSuelo = scanner.readLine();
        System.out.println("INTRODUCE LA FLORACIÓN: ");
        String floracion = scanner.readLine();

        SerVivo planta = new Planta(nombreCientifico, edad, habitat, tipoPlanta, altura, tipoSuelo, floracion);

        seresVivos.add(planta);
        System.out.println(planta.toString());
    }

    // METODO DEL MENÚ INICIAL

    private static void menu() {
        System.out.println("1 - INSERTAR");
        System.out.println("2 - MODIFICAR");
        System.out.println("3 - ELIMINAR");
        System.out.println("\n0 - SALIR");
    }

    // INSERTAMOS ANIMALES POR DEFECTO

    private static void animalesDefault(ArrayList<SerVivo> seresVivos) {
        SerVivo s1 = new Planta("Orquídea", 5, "Bosque tropical", "Ornamental", "Pequeña", "Tierra negra",
                "Todo el año");
        SerVivo s2 = new Planta("Rosales", 3, "Jardín", "Ornamental", "Mediana", "Tierra común", "Primavera");
        SerVivo s3 = new Planta("Cactus", 10, "Desierto", "Suculenta", "Pequeña", "Arena", "Todo el año");
        SerVivo s4 = new Planta("Helecho", 7, "Selva tropical", "Follaje", "Grande", "Suelo húmedo", "Verano");
        SerVivo s5 = new Planta("Girasol", 2, "Campo", "Ornamental", "Grande", "Tierra", "Verano");

        SerVivo s6 = new Perro("Canis lupus familiaris", 7, "Hogar", "Canino", 25.5, Alimentacion.CARNIVORO, 15,
                "Bulldog", Tamaño.MEDIANO, Energia.ALTO);
        SerVivo s7 = new Perro("Canis lupus familiaris", 10, "Hogar", "Canino", 15.5, Alimentacion.CARNIVORO, 12,
                "Poodle", Tamaño.PEQUEÑO, Energia.MEDIO);
        SerVivo s8 = new Perro("Canis lupus familiaris", 3, "Hogar", "Canino", 8.5, Alimentacion.CARNIVORO, 18,
                "Labrador", Tamaño.GRANDE, Energia.ALTO);
        SerVivo s9 = new Perro("Canis lupus familiaris", 5, "Hogar", "Canino", 12.0, Alimentacion.CARNIVORO, 10,
                "Chihuahua", Tamaño.PEQUEÑO, Energia.BAJO);

        SerVivo s10 = new Hombre("Homo sapiens", 30, "Tierra", "Humano", 70, Alimentacion.OMNIVORO, 80, "Juan", "Pérez",
                "Ingeniero", "Español");
        SerVivo s11 = new Hombre("Homo sapiens", 40, "Tierra", "Humano", 75, Alimentacion.OMNIVORO, 75, "Pedro",
                "Gómez", "Médico", "Mexicano");
        SerVivo s12 = new Hombre("Homo sapiens", 25, "Tierra", "Humano", 68, Alimentacion.OMNIVORO, 85, "Ana",
                "Martínez", "Estudiante", "Colombiana");
        SerVivo s13 = new Hombre("Homo sapiens", 35, "Tierra", "Humano", 80, Alimentacion.OMNIVORO, 90, "María",
                "García", "Profesor", "Argentino");

        seresVivos.add(s1);
        seresVivos.add(s2);
        seresVivos.add(s3);
        seresVivos.add(s4);
        seresVivos.add(s5);
        seresVivos.add(s6);
        seresVivos.add(s7);
        seresVivos.add(s8);
        seresVivos.add(s9);
        seresVivos.add(s10);
        seresVivos.add(s11);
        seresVivos.add(s12);
        seresVivos.add(s13);

    }
}
