package Tema_7_Ejercicios_Ampliacion.Ejercicio_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Tema_7_Ejercicios_Ampliacion.Ejercicio_3.Peliculas.Formato;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {

        Peliculas[] peliculas = new Peliculas[20];
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int respuesta;

        String[] actoresP1 = { "MANEL ARGUELLES", "LUS MANUEL ARGÜELLES", "CLAUDIA LOPEZ DE SANTACIRILA" };
        String[] directoresP1 = { "HADA ARGUELLES" };
        Peliculas p1 = new Peliculas("EL SILENCION DE LOS CORDEROS", actoresP1, directoresP1, "01/05/1990", Formato.DVD,
                192);
        String[] actoresP2 = { "NAIARA QUEMADA", "ALEJANDO DA SILVA", "CLAUDIA LOPEZ DE SANTACIRILA" };
        String[] directoresP2 = { "SANDRA ÁLVAREZ" };
        Peliculas p2 = new Peliculas("INTELESTELAR", actoresP2, directoresP2, "07/15/2014", Formato.BLUERAY, 180);

        peliculas[0] = p1;
        peliculas[1] = p2;

        do {
            menu();
            System.out.println("\nELIGE UNA OPCIÓN");
            respuesta = Integer.parseInt(scanner.readLine());

            switch (respuesta) {
                case 0:
                    for (int i = 0; i < 10; i++) {
                        Thread.sleep(300);
                        System.out.println("----------------");
                        Thread.sleep(300);
                        System.out.println("FIN DEL PROGRAMA");
                        Thread.sleep(300);
                        System.out.println("----------------");
                    }
                    break;
                case 1:
                    insertar(peliculas, scanner);
                    break;
                case 2:
                    modificar(peliculas, scanner);
                    break;
                case 3:
                    eliminar(peliculas, scanner);
                    break;
                case 4:
                    visualizar(peliculas, scanner);
                    break;
                default:
                    break;
            }
        } while (respuesta != 0);

    }

    private static void visualizar(Peliculas[] peliculas, BufferedReader scanner) throws IOException {
        System.out.println("INTRODUCE EL TÍTULO DE LA PELICULA QUE QUIERAS VER: ");
        String respuesta = scanner.readLine();
        for (int i = 0; i < peliculas.length; i++) {
            if (respuesta.equalsIgnoreCase(peliculas[i].getTitulo())) {
                peliculas[i].mostrarContenido();
            } else {
                System.out.println("ERROR. NO EXISTE NINGUNA PELICULA CON ESE NOMBRE");
            }
        }
    }

    private static void eliminar(Peliculas[] peliculas, BufferedReader scanner) throws IOException {
        System.out.println("INTRODUCE EL TÍTULO DE LA PELICULA QUE QUIERES ELIMINAR:");
        String respuesta = scanner.readLine();
        for (int i = 0; i < peliculas.length; i++) {
            if (respuesta.equalsIgnoreCase(peliculas[i].getTitulo())) {
                peliculas[i] = null;
            } else {
                System.out.println("ERROR. NO EXISTE NIGUNA PELICULA CON ESE NOMBRE");
            }
        }
    }

    private static void modificar(Peliculas[] peliculas, BufferedReader scanner)
            throws IOException, InterruptedException {
        System.out.println("INTRODUCE EL TÍTULO DE LA PELÍCULA QUE QUIERE MODIFICAR: ");
        String respuesta = scanner.readLine();
        int eleccion;
        int cont = 0;
        int respuesta2;
        String[] actores = new String[10];
        String[] directores = new String[10];

        for (int i = 0; i < peliculas.length; i++) {
            if (respuesta.equalsIgnoreCase(peliculas[i].getTitulo())) {
                System.out.println("1 - TITULO");
                Thread.sleep(300);
                System.out.println("2 - ACTORES");
                Thread.sleep(300);
                System.out.println("3 - DIRECTORES");
                Thread.sleep(300);
                System.out.println("4 - FECHA DE ESTRENO");
                Thread.sleep(300);
                System.out.println("5 - DURACIÓN");
                Thread.sleep(300);
                System.out.println("6 - FORMATO");
                Thread.sleep(300);
                System.out.println("¿QUE QUIERES MODIFICAR?");
                eleccion = Integer.parseInt(scanner.readLine());

                switch (eleccion) {
                    case 1:
                        System.out.println("ESCRIBE EL NUEVO TÍTULO");
                        String titulo = scanner.readLine();
                        peliculas[i].setTitulo(titulo);
                        peliculas[i].mostrarContenido();
                        break;
                    case 2:
                        cont = 0;
                        do {
                            System.out.println(" 1 - INTRODUCIR ACTORES");
                            System.out.println(" 0 - FINALIZAR");
                            respuesta2 = Integer.parseInt(scanner.readLine());
                            switch (respuesta2) {
                                case 1:
                                    System.out.println("INTRODUCIR ACTOR: ");
                                    String act = scanner.readLine();
                                    actores[cont] = act;
                                    cont++;
                                    break;
                                default:
                                    break;
                            }
                        } while (respuesta2 != 0);
                        peliculas[i].setActores(actores);
                        peliculas[i].mostrarContenido();
                        break;
                    case 3:
                        cont = 0;
                        do {
                            System.out.println(" 1 - INTRODUCIR DIRECTORES");
                            System.out.println(" 0 - FINALIZAR");
                            respuesta2 = Integer.parseInt(scanner.readLine());
                            switch (respuesta2) {
                                case 1:
                                    System.out.println("INTRODUCIR DIRECTOR: ");
                                    String dic = scanner.readLine();
                                    directores[cont] = dic;
                                    cont++;
                                    break;
                                default:
                                    break;
                            }
                        } while (respuesta2 != 0);
                        peliculas[i].setDirectores(directores);
                        peliculas[i].mostrarContenido();
                        break;
                    case 4:
                        System.out.println("INTRODUCE LA NUEVA FECHA DE ESTRENO:");
                        String fecha = scanner.readLine();
                        peliculas[i].setFecha_de_salida(fecha);
                        peliculas[i].mostrarContenido();
                        break;
                    case 5:
                        System.out.println("INTRODUCE LA NUEVA DURACIÓN");
                        double duracion = Double.parseDouble(scanner.readLine());
                        peliculas[i].setDuracion(duracion);
                        peliculas[i].mostrarContenido();
                        break;
                    case 6:
                        System.out.println("TIPO DE FORMATO: ");
                        Thread.sleep(300);
                        System.out.println("    1 - DVD");
                        Thread.sleep(300);
                        System.out.println("    2 - BLUERAY");
                        Thread.sleep(300);
                        System.out.println("    3 - DIGITAR");
                        Thread.sleep(300);
                        System.out.println("    4 - CASETE");
                        int respuesta3 = Integer.parseInt(scanner.readLine());
                        switch (respuesta3) {
                            case 1:
                                peliculas[i].setFormato(Formato.DVD);
                                peliculas[i].mostrarContenido();
                                break;
                            case 2:
                                peliculas[i].setFormato(Formato.BLUERAY);
                                peliculas[i].mostrarContenido();
                                break;
                            case 3:
                                peliculas[i].setFormato(Formato.DIGITAL);
                                peliculas[i].mostrarContenido();
                                break;
                            case 4:
                                peliculas[i].setFormato(Formato.CASETE);
                                peliculas[i].mostrarContenido();
                                break;
                            default:
                                System.out.println("ERROR. NO HAS INTRODUCE UNA OPCIÓN VÁLIDA");
                                Thread.sleep(300);
                                System.out.println("\nVOLVIENDO AL MENÚ");
                                Thread.sleep(300);
                                System.out.println(".");
                                Thread.sleep(300);
                                System.out.println(".");
                                Thread.sleep(300);
                                System.out.println(".");
                                break;
                        }
                        break;
                    default:
                        break;
                }

            }
        }
    }

    private static void insertar(Peliculas[] peliculas, BufferedReader scanner) throws IOException {
        String[] actores = new String[3];
        String[] directores = new String[1];
        int respuesta;
        int cont = 0;

        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] == null) {
                System.out.println("TITULO: ");
                String titulo = scanner.readLine();
                do {
                    System.out.println(" 1 - INTRODUCIR ACTORES");
                    System.out.println(" 0 - FINALIZAR");
                    respuesta = Integer.parseInt(scanner.readLine());
                    switch (respuesta) {
                        case 1:
                            System.out.println("INTRODUCIR ACTOR: ");
                            String act = scanner.readLine();
                            actores[cont] = act;
                            cont++;
                            break;
                        default:
                            break;
                    }

                } while (respuesta != 0);
                cont = 0;
                do {
                    System.out.println(" 1 - INTRODUCIR DIRECTORES");
                    System.out.println(" 0 - FINALIZAR");
                    respuesta = Integer.parseInt(scanner.readLine());
                    switch (respuesta) {
                        case 1:
                            System.out.println("INTRODUCIR DIRECTOR: ");
                            String dic = scanner.readLine();
                            directores[cont] = dic;
                            cont++;
                            break;
                        default:
                            break;
                    }

                } while (respuesta != 0);
                System.out.println("INTRODUCIR FECHA DE ESTRENO: ");
                String fecha = scanner.readLine();
                System.out.println("INTRODUCIR DURACIÓN; ");
                double duracion = Double.parseDouble(scanner.readLine());
                System.out.println("TIPO DE FORMATO: ");
                System.out.println("    1 - DVD");
                System.out.println("    2 - BLUERAY");
                System.out.println("    3 - DIGITAR");
                System.out.println("    4 - CASETE");
                int respuesta2 = Integer.parseInt(scanner.readLine());

                
                    switch (respuesta2) {
                        case 1:
                            Peliculas p1 = new Peliculas(titulo, actores, directores, fecha, Formato.BLUERAY, duracion);
                            p1.mostrarContenido();
                            peliculas[i] = p1;
                            break;
                        case 2:
                            Peliculas p2 = new Peliculas(titulo, actores, directores, fecha, Formato.BLUERAY, duracion);
                            p2.mostrarContenido();
                            peliculas[i] = p2;
                            break;
                        case 3:
                            Peliculas p3 = new Peliculas(titulo, actores, directores, fecha, Formato.DIGITAL, duracion);
                            p3.mostrarContenido();
                            peliculas[i] = p3;
                            break;
                        case 4:
                            Peliculas p4 = new Peliculas(titulo, actores, directores, fecha, Formato.CASETE, duracion);
                            p4.mostrarContenido();
                            peliculas[i] = p4;
                            break;
                        default:
                            System.out.println("SELECCIONE UNA OPCIÓN VÁLIDA");
                            break;
                    }
            }
        }
    }

    private static void menu() {
        System.out.println("\n1 - INSERTAR");
        System.out.println("2 - MODIFICAR");
        System.out.println("3 - ELIMINAR");
        System.out.println("4 - VISUALIZAR");
    }
}
