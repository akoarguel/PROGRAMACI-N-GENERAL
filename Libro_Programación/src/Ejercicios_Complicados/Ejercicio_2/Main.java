/*
 * Ejercicio: Gestión de Inventario de una Tienda de Libros
Se necesita desarrollar un programa para la gestión del inventario de una tienda de libros. La aplicación debe permitir al usuario realizar las siguientes operaciones:

Agregar un libro: El usuario puede ingresar los datos de un nuevo libro, como título, autor, precio y cantidad en stock. Esta información debe almacenarse en 
un archivo de texto llamado "inventario.txt".
Modificar el stock de un libro: El usuario puede buscar un libro por su título y modificar la cantidad en stock. 
Si el libro existe, se debe actualizar su cantidad en stock en el archivo "inventario.txt".
Consultar el stock de un libro: El usuario puede buscar un libro por su título y consultar su cantidad en stock.
Listar todos los libros: Se debe mostrar una lista con todos los libros almacenados en el archivo "inventario.txt", incluyendo su título, autor, precio y cantidad en stock.
Salir del programa: El usuario puede salir del programa en cualquier momento.
Consideraciones adicionales:

Cada libro debe almacenarse en una línea del archivo "inventario.txt" en el formato "título,autor,precio,stock".
El programa debe manejar adecuadamente las excepciones y cerrar los recursos correctamente.
Utiliza flujos de entrada/salida para leer y escribir en el archivo "inventario.txt".
Puedes estructurar el código en clases como Libro para representar cada libro, 
Tienda para manejar las operaciones de gestión de libros y Main para la ejecución del programa
 */
package Ejercicios_Complicados.Ejercicio_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("\n"); // salto de línea puramente estético

        try {
            File inventario = new File("inventario.txt"); // creamos un objeto File en la ubicación del proyecto

            BufferedWriter bw = new BufferedWriter(new FileWriter(inventario)); // creamos un BufferedWriter para
                                                                                // escribir
                                                                                // en el archivo

            BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in)); // el scanner para leer por
                                                                                           // teclado
            Almacen almacen = new Almacen(); // objeto almacen para introducir aqui los libros

            librosDefault(almacen);

            for (Libro libro : almacen.getLibros()) {
                // 'bw.write' para escribir en el archivo .txt
                Thread.sleep(150); // un hilo que dura 150 milesimas de segundo
                bw.write("Titulo --> " + libro.getTitulo() + "  |   Autor  --> " + libro.getAutor() +
                        "   |   Precio --> " + libro.getPrecio() + "    |   Numero de Stock --> "
                        + libro.getNumStock());

                bw.newLine(); // salto de línea en el .txt
                System.out.println("INSCRIBIENDO LIBRO --> " + libro.getTitulo());
            }

            int respuesta;

            do {
                // el bucle se repite hasta que se marque '0'
                menu();
                System.out.println("ELIGE UNA OPCIÓN: ");
                respuesta = Integer.parseInt(scanner.readLine());

                switch (respuesta) {
                    case 0:
                        System.out.println("SALIENDO DEL PROGRAMA");
                        carga();
                        break;
                    case 1:
                        agregarLibro(bw, scanner, almacen, inventario);
                        break;
                    case 2:
                        modificarStock(bw, scanner, almacen, inventario);
                        break;
                    case 3:
                        consultarStock(scanner, almacen, inventario);
                        break;
                    case 4:
                        listadoLibros(almacen, inventario);
                        break;
                    default:
                        System.out.println("ERROR. SELECCIONE UNA OPCIÓN VÁLIDA.");
                        break;
                }
            } while (respuesta != 0);

            bw.flush();
            bw.close();
            scanner.close();

        } catch (NumberFormatException e) {
            System.out.println(
                    "ERROR de formato numérico, ocurre al intentar convertir una cadena en un tipo numérico, como un entero o un decimal, "
                            +
                            "pero el formato de la cadena no es válido para la conversión."
                            +
                            e.getMessage());
        } catch (IOException e) {
            System.out.println(
                    "ERROR de E/S (entrada/salida) que puede ocurrir durante la ejecución de un programa"
                            +
                            e.getMessage());
        } catch (InterruptedException e) {
            System.out.println(
                    "ERROR. Se lanza cuando un hilo está en un estado de espera, de sueño o en estado de espera bloqueada"
                            +
                            e.getMessage());
        }
    }

    private static void agregarLibro(BufferedWriter bw, BufferedReader scanner, Almacen almacen, File inventario) {
        try {
            System.out.println("INTRODUCE EL TITULO DEL NUEVO LIBRO: ");
            String titulo = scanner.readLine();

            if (almacen.buscarProducto(titulo) != null) {
                System.out.println("ERROR.. ESTE LIBRO YA ESTA EN LA BASE DE DATOS");
                System.out.println("VOLVIENDO AL MENU. ");
                carga();
                return;
            }

            System.out.println("INTRODUCE EL AUTOR DEL LIBRO: ");
            String autor = scanner.readLine();
            System.out.println("INTRODUCE EL PRECIO DEL LIBRO: ");
            double precio = Double.parseDouble(scanner.readLine());
            System.out.println("INTRODUCE LA CANTIDAD EN STOCK: ");
            int numStock = Integer.parseInt(scanner.readLine());

            Libro libro = new Libro(titulo, autor, precio, numStock);
            almacen.agregarProducto(libro);

            bw.write("Titulo --> " + libro.getTitulo() + "  |   Autor  --> " + libro.getAutor() +
                    "   |   Precio --> " + libro.getPrecio() + "    |   Numero de Stock --> "
                    + libro.getNumStock());

            bw.newLine(); // salto de línea en el .txt
        } catch (NumberFormatException e) {
            System.out.println(
                    "ERROR de formato numérico, ocurre al intentar convertir una cadena en un tipo numérico, como un entero o un decimal, "
                            +
                            "pero el formato de la cadena no es válido para la conversión."
                            +
                            e.getMessage());
        } catch (IOException e) {
            System.out.println(
                    "ERROR de E/S (entrada/salida) que puede ocurrir durante la ejecución de un programa"
                            +
                            e.getMessage());
        } catch (InterruptedException e) {
            System.out.println(
                    "ERROR. Se lanza cuando un hilo está en un estado de espera, de sueño o en estado de espera bloqueada"
                            +
                            e.getMessage());
        }
    }

    private static void modificarStock(BufferedWriter bw, BufferedReader scanner, Almacen almacen, File inventario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarStock'");
    }

    private static void consultarStock(BufferedReader scanner, Almacen almacen, File inventario) {
        try {
            System.out.println("\nINTRODUCE EL TITULO DEL LIBRO QUE QUIERES CONSULTAR: ");
            String titulo = scanner.readLine();

            boolean encontrado = false; // creamos esta varíable para comprobar más adelante si se encuentra el libro

            System.out.println("Buscando ...");
            carga();

            for (Libro libro : almacen.getLibros()) {
                if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                    if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                        encontrado = true; // true, porque hemos encontrado el libro
                        System.out
                                .println("EL STOCK ACTUAL DE " + libro.getTitulo() + " es --> " + libro.getNumStock());
                    }
                }
            }

            if (encontrado == false) {
                System.out.println("ERROR. NO SE HA ENCONTRADO NINGUN LIBRO CON ESAS CARACTERÍSTICAS. ");
                System.out.println("VOLVIENDO AL MENÚ ... ");
                carga();
            }
        } catch (IOException e) {
            System.out.println(
                    "ERROR de E/S (entrada/salida) que puede ocurrir durante la ejecución de un programa"
                            +
                            e.getMessage());
        } catch (InterruptedException e) {
            System.out.println(
                    "ERROR. Se lanza cuando un hilo está en un estado de espera, de sueño o en estado de espera bloqueada"
                            +
                            e.getMessage());
        }
    }

    private static void listadoLibros(Almacen almacen, File inventario) throws InterruptedException {
        almacen.mostrarLibros();
    }

    private static void librosDefault(Almacen almacen) throws InterruptedException {

        System.out.println("INSCRIBIENDO LOS LIBROS EN EL ALMACÉN ... ");
        carga(); // añadimos 'throws InterruptedException'

        Libro l1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 15.50, 30);
        Libro l2 = new Libro("1984", "George Orwell", 12.99, 25);
        Libro l3 = new Libro("El principito", "Antoine de Saint-Exupéry", 10.99, 35);
        Libro l4 = new Libro("Matar a un ruiseñor", "Harper Lee", 11.75, 28);
        Libro l5 = new Libro("Orgullo y prejuicio", "Jane Austen", 9.99, 40);
        Libro l6 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 17.99, 22);
        Libro l7 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 19.99, 18);
        Libro l8 = new Libro("Crimen y castigo", "Fyodor Dostoevsky", 14.25, 27);
        Libro l9 = new Libro("Los miserables", "Victor Hugo", 18.50, 33);
        Libro l10 = new Libro("Rayuela", "Julio Cortázar", 16.75, 29);
        Libro l11 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", 13.25, 31);
        Libro l12 = new Libro("La sombra del viento", "Carlos Ruiz Zafón", 14.99, 24);
        Libro l13 = new Libro("Crónica de una muerte anunciada", "Gabriel García Márquez", 11.50, 26);
        Libro l14 = new Libro("El alquimista", "Paulo Coelho", 12.99, 37);
        Libro l15 = new Libro("Anna Karenina", "Leo Tolstoy", 16.50, 32);
        Libro l16 = new Libro("La Odisea", "Homer", 10.99, 23);
        Libro l17 = new Libro("Drácula", "Bram Stoker", 13.75, 34);
        Libro l18 = new Libro("Las aventuras de Tom Sawyer", "Mark Twain", 9.75, 36);
        Libro l19 = new Libro("Frankenstein", "Mary Shelley", 11.99, 21);
        Libro l20 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 13.99, 20);

        almacen.agregarProducto(l1);
        almacen.agregarProducto(l2);
        almacen.agregarProducto(l3);
        almacen.agregarProducto(l4);
        almacen.agregarProducto(l5);
        almacen.agregarProducto(l6);
        almacen.agregarProducto(l7);
        almacen.agregarProducto(l8);
        almacen.agregarProducto(l9);
        almacen.agregarProducto(l10);
        almacen.agregarProducto(l11);
        almacen.agregarProducto(l12);
        almacen.agregarProducto(l13);
        almacen.agregarProducto(l14);
        almacen.agregarProducto(l15);
        almacen.agregarProducto(l16);
        almacen.agregarProducto(l17);
        almacen.agregarProducto(l18);
        almacen.agregarProducto(l19);
        almacen.agregarProducto(l20);

    }

    private static void carga() throws InterruptedException {
        // este método muestra una pequeña carga (puramente estético)

        try {
            Thread.sleep(150); // un hilo que dura 150 milesimas de segundo
            System.out.println(" . ");
            Thread.sleep(150);
            System.out.println(" . ");
            Thread.sleep(150);
            System.out.println(" . ");
            Thread.sleep(150);
        } catch (InterruptedException e) {
            // manejamos la excepción por si falla
            System.out.println("ERROR CON LA EJECUCIÓN DE LOS HILOS... ");
        }
    }

    private static void menu() {
        // método con la información que va a tener el menú
        System.out.println("\n======= MENU =======");
        System.out.println("1 - AGREGAR LIBRO");
        System.out.println("2 - MODIFICAR STOCK");
        System.out.println("3 - CONSULTAR STOCK");
        System.out.println("4 - LISTADO DE LIBROS");
        System.out.println("\n0 - SALIR");
        System.out.println("=======|=|=|=|=======");
        System.out.println();
    }
}
