/*
 * Ejercicio: Gestión de Almacenamiento de Productos

Se requiere desarrollar una aplicación para la gestión de productos en un almacén. La aplicación debe permitir al usuario realizar las siguientes operaciones:

Añadir un producto: El usuario puede ingresar los datos de un nuevo producto, como nombre, precio y cantidad en stock. Esta información debe almacenarse en un archivo de texto llamado "productos.txt".
Modificar el stock de un producto: El usuario puede buscar un producto por su nombre y modificar la cantidad en stock. Si el producto existe, se debe actualizar su cantidad en stock en el archivo "productos.txt".
Consultar el stock de un producto: El usuario puede buscar un producto por su nombre y consultar su cantidad en stock.
Listar todos los productos: Se debe mostrar una lista con todos los productos almacenados en el archivo "productos.txt", incluyendo su nombre, precio y cantidad en stock.
Salir del programa: El usuario puede salir del programa en cualquier momento.
Consideraciones adicionales:

Cada producto debe almacenarse en una línea del archivo "productos.txt" en el formato "nombre,precio,stock".
El programa debe manejar adecuadamente las excepciones y cerrar los recursos correctamente.
Utiliza flujos de entrada/salida para leer y escribir en el archivo "productos.txt".
Puedes estructurar el código en clases como Producto para representar cada producto, Almacen para manejar las operaciones de gestión de productos y Main para la ejecución del programa.
 */

package Ejercicios_Complicados.Ejercicio_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("\n"); // salto de línea puramente por estético

        try { // todo en un try/catch para manejar bien las excepciones que vayan saliendo a
              // lo largo del programa

            File productos = new File("productos.txt"); // creamos productos.txt en la ruta del proyecto
            BufferedWriter bw = new BufferedWriter(new FileWriter(productos)); // BufferedWriter para poder escribir
                                                                               // dentro del .txt

            BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in)); // un scanner para poder leer
                                                                                           // el teclado
            Almacen almacen = new Almacen(); // creamos un objeto de tipo almacen para crear un ArrayList con los
                                             // productos que vayamos a ir introduciendo

            int respuesta;

            productosDefault(almacen); // este método crea 10 productos diferentes y los introduce en el array de la
                                       // clase Almacen
            System.out.println("Ejecutando 'productosDefault'");
            carga(); // este método es básicamente una pantalla de carga

            System.out.println("\nCreando archivo 'productos .txt'");
            carga();

            System.out.println("\nAñadiendo produtos default en el txt");
            carga();

            for (Producto producto : almacen.getProductos()) { // este foreach basicamente recorre los productos detro
                                                               // del almacen y guarda la información en el .txt
                Thread.sleep(150);
                bw.write("NOMBRE: " + producto.getNombre() + "  |   PRECIO: " + producto.getPrecio()
                        + "    |   NUMERO EN STOCK: " + producto.getNumStock()); // bw.write para escribir en el .txt

                bw.newLine(); // crea una salto de línea
                System.out.println("Escribiendo en el archivo productos de tipo:  " + producto.getNombre());
            }

            do {
                menu(); // un menú con las diferentes opciones
                System.out.println("\nELIGE UNA OPCIÓN: ");
                respuesta = Integer.parseInt(scanner.readLine());

                switch (respuesta) {
                    case 0:
                        System.out.println("SALIENDO DEL PROGRAMA");
                        carga();
                        break;
                    case 1:
                        añadirProducto(productos, bw, almacen, scanner);
                        break;
                    case 2:
                        modificarStock(productos, bw, almacen, scanner);
                        break;
                    case 3:
                        consultarStock(productos, bw, almacen, scanner);
                        break;
                    case 4:
                        listaProductos(productos, almacen);
                        break;
                    default:
                        System.out.println("OPCIÓN NO VÁLIDA. POR FAVOR SELECCIONE UNA OPCIÓN DEL MENÚ. ");
                        break;
                }
            } while (respuesta != 0);

            bw.close();
        } catch (NumberFormatException e) {
            System.out.println("ERROR. " + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR. " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("ERROR. " + e.getMessage());
        }

    }

    private static void listaProductos(File productos, Almacen almacen) {
        almacen.mostrarProductos(); // utiliza el método mostrarProductos() de la clase almacen
    }

    private static void consultarStock(File productos, BufferedWriter bw, Almacen almacen, BufferedReader scanner)
            throws IOException, InterruptedException {
        System.out.println("INTRODUCE EL NOMBRE DEL PRODUCTO QUE QUIERES CONSULTAR: "); // introducimos el producto que
                                                                                        // queremos consultar
        String nombre = scanner.readLine();
        System.out.println("BUSCANDO ... ");
        carga();

        boolean encontrado = false; // Variable para indicar si se encontró el producto

        // Buscar el producto por nombre
        for (Producto producto : almacen.getProductos()) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("HAY UN TOTAL DE " + producto.getNumStock() + " EN STOCK");
                encontrado = true; // Marcar el producto como encontrado
                break; // Salir del bucle una vez que se encuentre el producto
            }
        }

        // Si el producto no se encontró, mostrar un mensaje y volver al menú
        if (!encontrado) {
            System.out.println("NO SE HA ENCONTRADO UN PRODUCTO CON ESAS CARACTERÍSTICAS: ");
        }
        System.out.println("Volviendo al menu: ");
        carga();
    }

    private static void modificarStock(File productos, BufferedWriter bw, Almacen almacen, BufferedReader scanner)
            throws IOException, InterruptedException {
        System.out.println("INTRODUCE EL NOMBRE DEL PRODUCTO: ");
        String nombre = scanner.readLine();

        // Buscar el producto por nombre
        try {
            for (Producto producto : almacen.getProductos()) {
                if (producto.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("EL STOCK ACTUAL ES DE " + producto.getNumStock());

                    // Solicitar la cantidad de stock actualizada
                    System.out.println("\nINTRODUCE LA CANTIDAD DE STOCK ACTUALIZADA: ");
                    int stock = Integer.parseInt(scanner.readLine());
                    System.out.println("Modificando cantidad ...");
                    carga();

                    // Actualizar el stock del producto
                    producto.setNumStock(stock);

                    // Escribir los productos en un archivo temporal
                    File productos_temp = new File("productosTemporal.txt");
                    BufferedWriter escritorTemporal = new BufferedWriter(new FileWriter(productos_temp));
                    for (Producto p : almacen.getProductos()) {
                        escritorTemporal.write("NOMBRE: " + p.getNombre() + "  |   PRECIO: " + p.getPrecio()
                                + "    |   NUMERO EN STOCK: " + p.getNumStock());
                        escritorTemporal.newLine();
                    }
                    escritorTemporal.close();

                    // Eliminar el archivo original y renombrar el archivo temporal
                    productos.delete();
                    productos_temp.renameTo(productos);

                    System.out.println("EL STOCK HA SIDO MODIFICADO CORRECTAMENTE. ");
                    System.out.println("Volviendo al menu: ");
                    carga();
                    return; // Salir del método después de modificar el producto
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("ERROR. " + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR. " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("ERROR. " + e.getMessage());
        }

        // Si el producto no se encuentra, mostrar un mensaje y volver al menú
        System.out.println("NO SE HA ENCONTRADO UN PRODUCTO CON ESAS CARACTERÍTICAS: ");
        System.out.println("Volviendo al menu: ");
        carga();
    }

    private static void añadirProducto(File productos, BufferedWriter bw, Almacen almacen, BufferedReader scanner)
            throws IOException, InterruptedException {
        System.out.println("INTRODUCE EL NOMBRE DEL PRODUCTO:");
        String nombre = scanner.readLine();

        // Verificar si el producto ya existe
        try {
            for (Producto producto : almacen.getProductos()) {
                if (producto.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("ESE PRODUCTO YA EXISTE: ");
                    System.out.println("Volviendo al menú: ");
                    carga();
                    return;
                }
            }

            // Si el producto no existe, agregarlo
            System.out.println("INTRODUCE EL PRECIO DEL PRODUCTO: ");
            Double precio = Double.parseDouble(scanner.readLine());
            System.out.println("INTRODUCE LA CANTIDAD DE STOCK EN EL ALMACÉN: ");
            int stock = Integer.parseInt(scanner.readLine());

            Producto p = new Producto(nombre, precio, stock);
            almacen.agregarProductos(p);

            // Escribir en el archivo
            bw.write("NOMBRE: " + p.getNombre() + "  |   PRECIO: " + p.getPrecio()
                    + "    |   NUMERO EN STOCK: " + p.getNumStock());
            bw.newLine();
            System.out.println("Escribiendo en el archivo productos de tipo:  " + p.getNombre());
        } catch (NumberFormatException e) {
            System.out.println("ERROR. " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("ERROR. " + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR. " + e.getMessage());
        }
        System.out.println("VOLVIENDO AL MENU");
        carga();
    }

    private static void menu() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("\n1 - AÑADIR UN PRODUCTO: ");
        Thread.sleep(100);
        System.out.println("2 - MODIFICAR STOCK EL STOCK DE UN PRODUCTO: ");
        Thread.sleep(100);
        System.out.println("3 - CONSULTAR EL STOCK DE UN PRODUCTO: ");
        Thread.sleep(100);
        System.out.println("4 - LISTA DE TODOS LOS PRODUCTOS: ");
        Thread.sleep(100);
        System.out.println("0 - SALIR DEL PROGRAMA");
        Thread.sleep(100);
    }

    private static void carga() throws InterruptedException {
        Thread.sleep(300);
        System.out.println(".");
        Thread.sleep(300);
        System.out.println(".");
        Thread.sleep(300);
        System.out.println(".");
        Thread.sleep(300);
    }

    private static void productosDefault(Almacen almacen) {
        Producto p1 = new Producto("MSI Prestige", 1099, 10);
        Producto p2 = new Producto("Lenovo ThinkPad X1 Carbon", 1299, 8);
        Producto p3 = new Producto("Dell XPS 15", 1499, 15);
        Producto p4 = new Producto("Apple MacBook Air", 999, 12);
        Producto p5 = new Producto("HP Spectre x360", 1199, 7);
        Producto p6 = new Producto("Asus ZenBook Duo", 1299, 9);
        Producto p7 = new Producto("Acer Swift 5", 899, 6);
        Producto p8 = new Producto("Microsoft Surface Laptop 4", 1299, 11);
        Producto p9 = new Producto("Google Pixelbook Go", 849, 8);
        Producto p10 = new Producto("Razer Blade 15", 1799, 5);

        almacen.agregarProductos(p1);
        almacen.agregarProductos(p2);
        almacen.agregarProductos(p3);
        almacen.agregarProductos(p4);
        almacen.agregarProductos(p5);
        almacen.agregarProductos(p6);
        almacen.agregarProductos(p7);
        almacen.agregarProductos(p8);
        almacen.agregarProductos(p9);
        almacen.agregarProductos(p10);
    }

}
