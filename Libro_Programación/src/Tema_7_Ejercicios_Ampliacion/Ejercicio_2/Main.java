package Tema_7_Ejercicios_Ampliacion.Ejercicio_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Tema_7_Ejercicios_Ampliacion.Ejercicio_2.Fecha.DiaSemana;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {

        Fecha f1 = new Fecha(DiaSemana.Lunes, 05, 04, 2024);
        Fecha f2 = new Fecha(DiaSemana.Martes, 06, 6, 2015);
        Fecha f3 = new Fecha(DiaSemana.Miercoles, 1, 6, 2009);
        Fecha f4 = new Fecha(DiaSemana.Lunes, 31, 12, 2008);

        Fecha[] fechas = new Fecha[100];

        fechas[0] = f1;
        fechas[1] = f2;
        fechas[2] = f3;
        fechas[3] = f4;

        int respuesta;
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        do {
            menu();
            System.out.println("INTRODUCE UNA OPCIÓN: ");
            respuesta = Integer.parseInt(scanner.readLine());

            switch (respuesta) {
                case 0:
                    for (int i = 0; i < 30; i++) {
                        Thread.sleep(300);
                        System.out.println("----------------");
                        Thread.sleep(300);
                        System.out.println("FIN DEL PROGRAMA");
                        Thread.sleep(300);
                        System.out.println("----------------");
                    }
                    break;
                case 1:
                    mostrarFechas(fechas, scanner);
                    break;
                case 2:
                    fechaSiguiente(fechas, scanner);
                    break;
                case 3:
                    diaDeLaSemana(fechas, scanner);
                    break;
                case 4:
                    correcta(fechas, scanner);
                    break;
                case 5:
                    comparar(fechas, scanner);
                    break;
                default:
                    break;
            }

        } while (respuesta != 0);

    }

    private static void comparar(Fecha[] fechas, BufferedReader scanner)
            throws NumberFormatException, IOException, InterruptedException {
        int respuesta;
        int f1, f2;

        do {
            System.out.println();
            System.out.println("0 - SALIR");
            System.out.println("1 - FECHA > otraFECHA");
            System.out.println("2 - FECHA < otraFECHA");
            System.out.println("3 - FECHA = otraFECHA");
            System.out.println();
            System.out.println("ELIGE UNA OPCIÓN: ");
            respuesta = Integer.parseInt(scanner.readLine());

            switch (respuesta) {
                case 1:
                    System.out.println("TE MOSTRARÉ SI LA FECHA ES MAYOR. ");
                    System.out.println("¿EN QUE CÉLDA SE ENCUENTRA LA FECHA QUE QUIERES CONSULTAR?");
                    f1 = Integer.parseInt(scanner.readLine());
                    System.out.println("¿CON QUE OTRA FECHA QUERES COMPARARLA?");
                    f2 = Integer.parseInt(scanner.readLine());

                    fechas[f1].mayor(fechas[f2]);

                    if (fechas[f1].mayor(fechas[f2]) == true) {
                        System.out.println();
                        System.out.println("ES MAYOR");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("ES MAYOR");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("TE MOSTRARÉ SI LA FECHA ES MENOR. ");
                    System.out.println("¿EN QUE CÉLDA SE ENCUENTRA LA FECHA QUE QUIERES CONSULTAR?");
                    f1 = Integer.parseInt(scanner.readLine());
                    System.out.println("¿CON QUE OTRA FECHA QUERES COMPARARLA?");
                    f2 = Integer.parseInt(scanner.readLine());

                    fechas[f1].menor(fechas[f2]);

                    if (fechas[f1].menor(fechas[f2]) == true) {
                        System.out.println();
                        System.out.println("ES MENOR");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("NO ES MENOR");
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("TE MOSTRARÉ SI LA FECHA ES IGUAL. ");
                    System.out.println("¿EN QUE CÉLDA SE ENCUENTRA LA FECHA QUE QUIERES CONSULTAR?");
                    f1 = Integer.parseInt(scanner.readLine());
                    System.out.println("¿CON QUE OTRA FECHA QUERES COMPARARLA?");
                    f2 = Integer.parseInt(scanner.readLine());

                    fechas[f1].igual(fechas[f2]);

                    if (fechas[f1].igual(fechas[f2]) == true) {
                        System.out.println();
                        System.out.println("SON IGUALES");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("SON IGUALES");
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("VOLVIENDO AL MENÚ");
                    Thread.sleep(300);
                    System.out.println(".");
                    Thread.sleep(300);
                    System.out.println(".");
                    Thread.sleep(300);
                    System.out.println(".");
                    break;
                default:
                    System.out.println("ERROR. NO EXISTE NINGUNA FECHA EN ESA CELDA");
                    System.out.println("VOLVIENDO AL MENÚ");
                    Thread.sleep(300);
                    System.out.println(".");
                    Thread.sleep(300);
                    System.out.println(".");
                    Thread.sleep(300);
                    System.out.println(".");
                    break;
            }

        } while (respuesta != 0);

    }

    private static void correcta(Fecha[] fechas, BufferedReader scanner)
            throws NumberFormatException, IOException, InterruptedException {
        int respuesta;
        System.out.println("TE MOSTRARÉ SI LA FECHA EXISTE. ");
        System.out.println("¿EN QUE CÉLDA SE ENCUENTRA LA FECHA QUE QUIERES CONSULTAR?");
        respuesta = Integer.parseInt(scanner.readLine());

        if (fechas[respuesta] != null) {
            if (fechas[respuesta].fechaCorrecta() == false) {
                System.out.println("ESA FECHA NO ES CORRECTA");
                System.out.println("VOLVIENDO AL MENÚ");
                Thread.sleep(300);
                System.out.println(".");
                Thread.sleep(300);
                System.out.println(".");
                Thread.sleep(300);
                System.out.println(".");
            } else {
                System.out.println("ESA FECHA ES CORRECTA");
                System.out.println("VOLVIENDO AL MENÚ");
                Thread.sleep(300);
                System.out.println(".");
                Thread.sleep(300);
                System.out.println(".");
                Thread.sleep(300);
                System.out.println(".");
            }
        } else {
            System.out.println("ERROR. NO EXISTE NINGUNA FECHA EN ESA CELDA");
            System.out.println("VOLVIENDO AL MENÚ");
            Thread.sleep(300);
            System.out.println(".");
            Thread.sleep(300);
            System.out.println(".");
            Thread.sleep(300);
            System.out.println(".");
        }
    }

    private static void diaDeLaSemana(Fecha[] fechas, BufferedReader scanner)
            throws NumberFormatException, IOException, InterruptedException {
        int respuesta;
        System.out.println("TE MOSTRARÉ EL DÍA DE LA SEMANA DE UNA FECHA. ");
        System.out.println("¿EN QUE CÉLDA SE ENCUENTRA LA FECHA QUE QUIERES CONSULTAR?");
        respuesta = Integer.parseInt(scanner.readLine());

        if (fechas[respuesta] != null) {
            System.out.println();
            fechas[respuesta].diaSiguiente();
            System.out.println();

            switch (fechas[respuesta].getDias()) {
                case Lunes:
                    System.out.println("Lunes");
                    break;
                case Martes:
                    System.out.println("Martes");
                    break;
                case Miercoles:
                    System.out.println("Miercoles");
                    break;
                case Jueves:
                    System.out.println("Jueves");
                    break;
                case Viernes:
                    System.out.println("Viernes");
                    break;
                case Sabado:
                    System.out.println("Sabado");
                    break;
                case Domingo:
                    System.out.println("Domingo");
                    break;
            
                default:
                    break;
            }

        } else {
            System.out.println("ERROR. NO EXISTE NINGUNA FECHA EN ESA CELDA");
            System.out.println("VOLVIENDO AL MENÚ");
            Thread.sleep(300);
            System.out.println(".");
            Thread.sleep(300);
            System.out.println(".");
            Thread.sleep(300);
            System.out.println(".");
        }
    }

    private static void fechaSiguiente(Fecha[] fechas, BufferedReader scanner)
            throws NumberFormatException, IOException, InterruptedException {
        int respuesta;
        System.out.println("TE MOSTRARÉ EL DÍA SIGUIENTE DE UNA FECHA. ");
        System.out.println("¿EN QUE CÉLDA SE ENCUENTRA LA FECHA QUE QUIERES CONSULTAR?");
        respuesta = Integer.parseInt(scanner.readLine());

        if (fechas[respuesta] != null) {
            System.out.println();
            fechas[respuesta].mostrarFecha();
            Thread.sleep(300);
                    System.out.println(".");
                    Thread.sleep(300);
                    System.out.println(".");
                    Thread.sleep(300);
                    System.out.println(".");
            fechas[respuesta].diaSiguiente().mostrarFecha();
            System.out.println();
        } else {
            System.out.println("ERROR. NO EXISTE NINGUNA FECHA EN ESA CELDA");
            System.out.println("VOLVIENDO AL MENÚ");
            Thread.sleep(300);
            System.out.println(".");
            Thread.sleep(300);
            System.out.println(".");
            Thread.sleep(300);
            System.out.println(".");
        }

    }

    private static void mostrarFechas(Fecha[] fechas, BufferedReader scanner)
            throws NumberFormatException, IOException, InterruptedException {
        int respuesta;
        int respuesta2;

        do {
            System.out.println();
            System.out.println("1 - MOSTRAR SOLO UNA FECHA");
            System.out.println("2 - MOSTRAR TODAS LAS FECHAS");
            System.out.println("0 - SALIR");
            System.out.println("\nINTRODUCE UNA OPCION: ");
            respuesta = Integer.parseInt(scanner.readLine());

            switch (respuesta) {
                case 0:
                    System.out.println("VOLVIENDO AL MENÚ");
                    Thread.sleep(300);
                    System.out.println(".");
                    Thread.sleep(300);
                    System.out.println(".");
                    Thread.sleep(300);
                    System.out.println(".");
                    break;
                case 1:
                    System.out.println("¿EN QUE CELDA SE ENCUENTRA LA FECHA QUE QUIERES MOSTRAR?");
                    respuesta2 = Integer.parseInt(scanner.readLine());
                    if (fechas[respuesta] != null) {
                        fechas[respuesta2].mostrarFecha();
                    } else {
                        System.out.println("ERROR. NO EXISTE NINGUNA FECHA EN ESA CELDA");
                        System.out.println("VOLVIENDO AL MENÚ");
                        Thread.sleep(300);
                        System.out.println(".");
                        Thread.sleep(300);
                        System.out.println(".");
                        Thread.sleep(300);
                        System.out.println(".");
                    }
                    break;
                case 2:
                    for (int i = 0; i < fechas.length; i++) {
                        if (fechas[i] != null) {
                            fechas[i].mostrarFecha();
                            System.out.println();
                        }
                    }
                    break;

                default:
                    System.out.println("ERROR. TECLEA UNA OPCIÓN VÁLIDA");
                    break;
            }

        } while (respuesta != 0);

    }

    private static void menu() {
        System.out.println();
        System.out.println("1 - MOSTRAR FECHAS. ");
        System.out.println("2 - SIGIUENTE FECHA. ");
        System.out.println("3 - DÍA DE LA SEMANA");
        System.out.println("4 - CORRECTA LA FECHA");
        System.out.println("5 - COMPARAR FECHAS");
        System.out.println("0 - SALIR");
    }
}
