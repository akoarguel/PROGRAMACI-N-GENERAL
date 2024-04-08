package Tema_7_Ejercicios_Ampliacion.Ejercicio_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        Producto[] productos = new Producto[50];

        productosDefault(productos);

        pricipal(scanner, productos);

    }

    // MÉTODOS BASICOS

    private static void productosDefault(Producto[] productos) {
        Producto p1 = new Producto(1, Tipo.TELEFONO, "Samsung", "S24 ULTRA", 6.8, "8 GEN 3", 120);
        Producto p2 = new Producto(2, Tipo.TABLETA, "Apple", "iPad Pro", 11.0, "A12Z Bionic", 120);
        Producto p3 = new Producto(3, Tipo.TELEFONO, "Google", "Pixel 5", 6.0, "Snapdragon 765G", 90);
        Producto p4 = new Producto(4, Tipo.TABLETA, "Microsoft", "Surface Pro 7", 12.3, "Intel Core i5", 60);
        Producto p5 = new Producto(5, Tipo.TELEFONO, "OnePlus", "9 Pro", 6.7, "Snapdragon 888", 120);
        Producto p6 = new Producto(6, Tipo.TABLETA, "Samsung", "Galaxy Tab S7", 11.0, "Snapdragon 865+", 120);
        Producto p7 = new Producto(7, Tipo.TELEFONO, "Xiaomi", "Mi 11", 6.81, "Snapdragon 888", 120);
        Producto p8 = new Producto(8, Tipo.TABLETA, "Huawei", "MatePad Pro", 10.8, "Kirin 990", 60);
        Producto p9 = new Producto(9, Tipo.TELEFONO, "Sony", "Xperia 1 III", 6.5, "Snapdragon 888", 120);
        Producto p10 = new Producto(10, Tipo.TABLETA, "Lenovo", "Tab P11 Pro", 11.5, "Snapdragon 730G", 60);
        Producto p11 = new Producto(11, Tipo.TELEFONO, "Asus", "ROG Phone 5", 6.78, "Snapdragon 888", 144);
        Producto p12 = new Producto(12, Tipo.TABLETA, "Amazon", "Fire HD 10", 10.1, "MediaTek MT8183", 60);
        Producto p13 = new Producto(13, Tipo.TELEFONO, "LG", "Wing", 6.8, "Snapdragon 765G", 60);
        Producto p14 = new Producto(14, Tipo.TABLETA, "Google", "Pixel Slate", 12.3, "Intel Core i7", 60);
        Producto p15 = new Producto(15, Tipo.TELEFONO, "Realme", "X50 Pro", 6.44, "Snapdragon 865", 90);
        Producto p16 = new Producto(16, Tipo.TABLETA, "Microsoft", "Surface Go 2", 10.5, "Intel Pentium Gold", 60);
        Producto p17 = new Producto(17, Tipo.TELEFONO, "Motorola", "Edge+", 6.7, "Snapdragon 865", 90);
        Producto p18 = new Producto(18, Tipo.TABLETA, "Samsung", "Galaxy Tab A7", 10.4, "Snapdragon 662", 60);
        Producto p19 = new Producto(19, Tipo.TELEFONO, "Honor", "30 Pro+", 6.57, "Kirin 990", 90);
        Producto p20 = new Producto(20, Tipo.TABLETA, "Apple", "iPad Air", 10.9, "A14 Bionic", 60);
        Producto p21 = new Producto(21, Tipo.TELEFONO, "Nokia", "8.3 5G", 6.81, "Snapdragon 765G", 60);
        Producto p22 = new Producto(22, Tipo.TABLETA, "Xiaomi", "Mi Pad 5", 11.0, "Snapdragon 860", 120);
        Producto p23 = new Producto(23, Tipo.TELEFONO, "OnePlus", "Nord", 6.44, "Snapdragon 765G", 90);
        Producto p24 = new Producto(24, Tipo.TABLETA, "Huawei", "MediaPad M6", 10.8, "Kirin 980", 60);
        Producto p25 = new Producto(25, Tipo.TELEFONO, "Sony", "Xperia 5 II", 6.1, "Snapdragon 865", 120);
        Producto p26 = new Producto(26, Tipo.TABLETA, "Lenovo", "Tab M10 Plus", 10.3, "MediaTek Helio P22T", 60);
        Producto p27 = new Producto(27, Tipo.TELEFONO, "Google", "Pixel 4a 5G", 6.2, "Snapdragon 765G", 60);
        Producto p28 = new Producto(28, Tipo.TABLETA, "Amazon", "Fire HD 8", 8.0, "MediaTek MT8168", 60);
        Producto p29 = new Producto(29, Tipo.TELEFONO, "Motorola", "Moto G Power", 6.4, "Snapdragon 665", 60);
        Producto p30 = new Producto(30, Tipo.TABLETA, "Samsung", "Galaxy Tab S6", 10.5, "Snapdragon 855", 60);

        productos[0] = p1;
        productos[1] = p2;
        productos[2] = p3;
        productos[3] = p4;
        productos[4] = p5;
        productos[5] = p6;
        productos[6] = p7;
        productos[7] = p8;
        productos[8] = p9;
        productos[9] = p10;
        productos[10] = p11;
        productos[11] = p12;
        productos[12] = p13;
        productos[13] = p14;
        productos[14] = p15;
        productos[15] = p16;
        productos[16] = p17;
        productos[17] = p18;
        productos[18] = p19;
        productos[19] = p20;
        productos[20] = p21;
        productos[21] = p22;
        productos[22] = p23;
        productos[23] = p24;
        productos[24] = p25;
        productos[25] = p26;
        productos[26] = p27;
        productos[27] = p28;
        productos[28] = p29;
        productos[29] = p30;

    }

    private static void pricipal(BufferedReader scanner, Producto[] productos)
            throws InterruptedException, NumberFormatException, IOException {
        int respuesta;
        do {
                    for (int i = 0; i < 20; i++) {
                        Thread.sleep(15);
                        System.out.print("-");
                    }
                    System.out.println();
            Thread.sleep(150);
            System.out.println("1   -   CLIENTE ");
            Thread.sleep(150);
            System.out.println("2   -   ADMIN ");
            Thread.sleep(150);
            System.out.println("0   -   SALIR");
            Thread.sleep(150);
                    for (int i = 0; i < 20; i++) {
                        Thread.sleep(15);
                        System.out.print("-");
                    }
            System.out.println("\nELIGE UNA OPCIÓN: ");
            respuesta = Integer.parseInt(scanner.readLine());
            switch (respuesta) {
                case 0:
                    System.out.println("\nVUELVA PRONTO");
                    break;
                case 1:
                    menuCliente(scanner, productos);
                    break;
                case 2:
                    menuAdmin(scanner, productos);
                    break;
                default:
                    break;
            }

        } while (respuesta != 0);
    }

    // MENUS CLIENTE Y ADMIN

    private static void menuAdmin(BufferedReader scanner, Producto[] productos)
            throws InterruptedException, NumberFormatException, IOException {
        System.out.println("INTRODUCE LA CONTASEÑA: ");
        int constraseña = Integer.parseInt(scanner.readLine());
        int respuesta;

        if (constraseña == 1234) {
            Thread.sleep(150);
            System.out.println(".");
            Thread.sleep(150);
            System.out.println(".");
            Thread.sleep(150);
            System.out.println(".");
            Thread.sleep(150);
            System.out.println(". . .ACCEDIENDO AL MENU. . .");

            Thread.sleep(150);
            System.out.println("\n1 - INSERTAR NUEVO PRODUCTO. ");
            Thread.sleep(150);
            System.out.println("2 - MODIFICAR NUEVO PRODCUTO. ");
            Thread.sleep(150);
            System.out.println("3 - ELIMINAR PRODUCTOS.");
            Thread.sleep(150);
            System.out.println("4 - CAMBIAR DESCUENTO SOCIOS. ");
            System.out.println("\nELIGE UNA OPCIÓN: ");
            respuesta = Integer.parseInt(scanner.readLine());

            switch (respuesta) {
                case 0:
                    System.out.println("VUELVA PRONTO");
                    break;
                case 1:
                    insertarProducto(scanner, productos);
                    break;
                case 2:
                    modificarProducto(scanner, productos);
                    break;
                case 3:
                    eliminarProducto(scanner, productos);
                    break;
                default:
                    break;
            }

        } else {
            System.out.println("ERROR");
        }
    }

    private static void menuCliente(BufferedReader scanner, Producto[] productos)
            throws InterruptedException, NumberFormatException, IOException {
        int respuesta;

        do {
            Thread.sleep(150);
            System.out.println("\n1 - BUSCAR POR MARCA. ");
            Thread.sleep(150);
            System.out.println("2 - BUSCAR POR PULGADAS");
            Thread.sleep(150);
            System.out.println("0 - SALIR");
            System.out.println("\nELIGE UNA OPCION: ");
            respuesta = Integer.parseInt(scanner.readLine());

            switch (respuesta) {
                case 0:
                    System.out.println("\nSALIENDO, VUELVA PRONTO. ");
                    System.exit(0);
                    break;
                case 1:
                    buscarMarca(scanner, productos);
                    break;
                case 2:
                    // buscarPulgadas(scanner, descuento, productos);
                    break;
                default:
                    break;
            }
        } while (respuesta != 0);

    }
    
    // MÉTODOS CLIENTE

    private static void buscarMarca(BufferedReader scanner, Producto[] productos) throws IOException {
        System.out.println("\nINTRODUCE LA MARCA DE DISPOSITIVOS QUE QUIERAS OJEAR: ");
        String marca = scanner.readLine();
        
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && productos[i].getMarca().equalsIgnoreCase(marca)) {
                productos[i].mostrarContenido();
                System.out.println();
            }
        }
    }

    // MÉTODOS ADMIN
    
    private static void eliminarProducto(BufferedReader scanner, Producto[] productos) throws NumberFormatException, IOException, InterruptedException {
        System.out.println("\nINTRODUZCA LA REFERENCIA DEL DISPOSITIVO QUE QUIERA ELIMINAR: ");
        int respuesta = Integer.parseInt(scanner.readLine());
        productos[respuesta].mostrarContenido();

        System.out.println("¿SEGURO QUE QUIERES CONTINUAR? ('y' o 'n')");
        String confir = scanner.readLine();
        if (confir.equalsIgnoreCase("y")) {
            productos[respuesta] = null;
        } else {
            System.out.println("VOLVIENDO AL MENU");
            Thread.sleep(150);
            System.out.println(".");
            Thread.sleep(150);
            System.out.println(".");
            Thread.sleep(150);
            System.out.println(".");
            System.out.println();
        }
    }

    private static void modificarProducto(BufferedReader scanner, Producto[] productos)
            throws NumberFormatException, IOException, InterruptedException {
        int eleccion;
        System.out.println("\nINTRODUZCA LA REFERENCIA DEL DISPOSITIVO QUE QUIERA CAMBIAR: ");
        int respuesta = Integer.parseInt(scanner.readLine());
        respuesta++;
        productos[respuesta].mostrarContenido();

        do {
            System.out.println("\n1 - CAMBIAR MARCA");
            System.out.println("2 - CAMBIAR MODELO");
            System.out.println("3 - CAMBIAR TIPO (TABLET/TELEFONO)");
            System.out.println("4 - CAMBIAR PULGADAS");
            System.out.println("5 - CAMBIAR PROCESADOR");
            System.out.println("6 - CAMBIAR HZ DE LA PANTALLA");
            System.out.println("0 - SALIR");
            eleccion = Integer.parseInt(scanner.readLine());

            switch (eleccion) {
                case 1:
                    System.out.println("NUEVA MARCA: ");
                    String marca = scanner.readLine();
                    productos[respuesta].setMarca(marca);
                    break;
                case 2:
                    System.out.println("NUEVO MODELO: ");
                    String modelo = scanner.readLine();
                    productos[respuesta].setModelo(modelo);
                    break;
                case 3:
                    System.out.println(" - TELEFONO (a) \n - TABLET (b)");
                    String tipo = scanner.readLine();
                    if (tipo.equalsIgnoreCase("a")) {
                    } else {
                        productos[respuesta].setTipo(Tipo.TABLETA);
                    }
                    break;
                case 4:
                    System.out.println("NUEVAS PULGADAS: ");
                    double pulgadas = Double.parseDouble(scanner.readLine());
                    productos[respuesta].setPulgadas(pulgadas);
                    break;
                case 5:
                    System.out.println("NUEVO PROCESADOR: ");
                    String procesador = scanner.readLine();
                    productos[respuesta].setProcesador(procesador);
                    break;
                case 6:
                    System.out.println("NUEVOS HZ DE PANTALLA: ");
                    int hz = Integer.parseInt(scanner.readLine());
                    productos[respuesta].setHerciosPantalla(hz);
                    break;
                case 0:
                    System.out.println("SALIENDO");
                    Thread.sleep(150);
                    System.out.println(".");
                    Thread.sleep(150);
                    System.out.println(".");
                    Thread.sleep(150);
                    System.out.println(".");
                default:
                    break;
            }
        } while (eleccion != 0);

    }

    private static void insertarProducto(BufferedReader scanner, Producto[] productos) throws IOException {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                // introducimos los datos del nuevo dispositivo
                int referencia = i + 1;
                System.out.println("INTRODUCE LA MARCA DEL DISPOSITIVO: ");
                String marca = scanner.readLine();
                System.out.println("INTRODUCE EL MODELO DEL DISPOSITIVO: ");
                String modelo = scanner.readLine();
                System.out.println("INTRODUCE LAS PULGADAS DEL DISPOSITIVO: ");
                double pulgadas = Double.parseDouble(scanner.readLine());
                System.out.println("INTRODUCE EL PROCESADOR DEL DISPOSITIVO: ");
                String procesador = scanner.readLine();
                System.out.println("INTRODUCE LOS HERCIOS DE LA PANTALLA: ");
                int hz = Integer.parseInt(scanner.readLine());
                // para hacerlo más fácil uso un switch para el caso de que sea tablet o
                // teléfono
                System.out.println(" - TELEFONO (a) \n - TABLET (b)");
                String dispositivo = scanner.readLine();
    
                switch (dispositivo) {
                    case "a":
                        Producto producto = new Producto(referencia, Tipo.TELEFONO, marca, modelo, pulgadas, procesador,
                                hz);
                        productos[i] = producto;
                        break;
                    case "b":
                        Producto producto2 = new Producto(referencia, Tipo.TABLETA, marca, modelo, pulgadas, procesador,
                                hz);
                        productos[i] = producto2;
                        break;
                    default:
                        System.out.println("JODER MIRA QUE TE DIJE A o B, ale a hacerlo otra vez");
                        break;
                }
    
                System.out.println("\nDATOS INTRODUCIDOS CON ÉXITO. \n");
                productos[i].mostrarContenido();
                System.out.println();
                // Salimos del bucle una vez que se ha insertado el producto
                break;
            }
        }
    }
    

}
