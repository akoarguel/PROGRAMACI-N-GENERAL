package Tema_7.Actividad_78;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        NodoRed ins1 = new NodoRed("AKO", "123", "tuki", "Avenida del Mar", "456", "3", "YUI");
        NodoRed ins2 = new NodoRed("ZETA", "456", "witi", "El Patillas", "399", "9", "NKS");
        NodoRed ins3 = new NodoRed("HD", "789", "chiki", "Virgen del manzano", "7734", "4", "HFI");

        NodoRed[] redes = new NodoRed[20];

        int numInstancias = NodoRed.getContadorInstacias();
        

        redes[0] = ins1;
        redes[1] = ins2;
        redes[2] = ins3;

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        int respuesta;

        do {
            numInstancias = NodoRed.getContadorInstacias();
            menu();
            System.out.println("Elige una opción");
            respuesta = Integer.parseInt(scanner.readLine());

            switch (respuesta) {
                case 0:

                    for (int i = 0; i < 30; i++) {
                        System.out.println("----------------");
                        System.out.println("FIN DEL PROGRAMA");
                        System.out.println("----------------");
                    }
                    break;
                case 1:
                    crear(redes, scanner);
                    break;
                case 2:
                    visualizar(redes, numInstancias);
                    break;
                case 3:
                    modificar(redes, scanner);
                    break;
                case 4:
                    System.out.println();
                    numInstancias = NodoRed.getContadorInstacias();
                    System.out.println("El número de instancias es de: " + numInstancias);
                    break;
                default:
                System.out.println("INTRODUCE UNA OPCIÓN VÁLIDA");
                    break;
            }
        } while (respuesta != 0);

    }

    private static void modificar(NodoRed[] redes, BufferedReader scanner) throws NumberFormatException, IOException {
        int respuesta = 0;
        int respuesta2 = 0;
        String respuesta3;


        System.out.println("Introduce el número de celda de la red que quieres modificar: ");
        respuesta = Integer.parseInt(scanner.readLine());
        System.out.println();
        System.out.println("Ha seleccionado ------------>");
        redes[respuesta].mostrarDatos();

        System.out.println();

        System.out.println("QUE DESEA MODIFICAR: ");
        System.out.println("1 --- Nombre del equipo");
        System.out.println("2 --- Direccion IP ");
        System.out.println("3 --- Máscara de red ");
        System.out.println("4 --- Dirección de Broadcast ");
        System.out.println("5 --- Puerta de enlace ");
        System.out.println("6 --- Direccion de red");
        System.out.println("7 --- Servidores DNS ");

        respuesta2 = Integer.parseInt(scanner.readLine());

        switch (respuesta2) {
            case 1:
                System.out.println("Introduce el nuevo Nombre del Equipo: ");
                respuesta3 = scanner.readLine();
                redes[respuesta].setNombreEquipo(respuesta3);
                break;
            case 2:
                System.out.println("Introduce la nueva Dirección IP: ");
                respuesta3 = scanner.readLine();
                redes[respuesta].setDireccionIp(respuesta3);
                break;
            case 3:
                System.out.println("Introduce la nueva Mascara de Red: ");
                respuesta3 = scanner.readLine();
                redes[respuesta].setMáscaraRed(respuesta3);
                break;
            case 4:
                System.out.println("Introduce la nueva Dirección de Bradcast: ");
                respuesta3 = scanner.readLine();
                redes[respuesta].setDireccionBroadcast(respuesta3);
                break;
            case 5:
                System.out.println("Introduce la nueva Puerta de Enlace: ");
                respuesta3 = scanner.readLine();
                redes[respuesta].setPuertaEnlace(respuesta3);
                break;
            case 6:
                System.out.println("Introduce la nueva Dirección de Red: ");
                respuesta3 = scanner.readLine();
                redes[respuesta].setDireccionRed(respuesta3);
                break;
            case 7:
                System.out.println("Introduce el nuevo Servidor DNS: ");
                respuesta3 = scanner.readLine();
                redes[respuesta].setServidoresDNS(respuesta3);
                break;
        
            default:
                System.out.println("ERROR. ");
                break;
        }

        System.out.println("DATOS ACTUALIZADOS: ");
        redes[respuesta].mostrarDatos();

    }

    private static void visualizar(NodoRed[] redes, int numInstancias) {
      for (int i = 0; i < redes.length; i++) {
        if (redes[i] != null) {
            System.out.println();
            redes[i].mostrarDatos();
        }
      }
    }

    private static void crear(NodoRed[] redes, BufferedReader scanner) throws IOException {
        String nombreEquipo, direccionIP, mascaraRed, direccionBroadcast, enlacePuerta, direccionRed, servidoresDNS;

        for (int i = 0; i < redes.length; i++) {
            if (redes[i] == null) {
                System.out.println("Nombre del equipo: ");
                nombreEquipo = scanner.readLine();
                System.out.println("Direccion IP: ");
                direccionIP = scanner.readLine();
                System.out.println("Máscara de red: ");
                mascaraRed = scanner.readLine();
                System.out.println("Dirección de Broadcast: ");
                direccionBroadcast = scanner.readLine();
                System.out.println("Puerta de enlace: ");
                enlacePuerta = scanner.readLine();
                System.out.println("Direccion de red:");
                direccionRed = scanner.readLine();
                System.out.println("Servidores DNS ");
                servidoresDNS = scanner.readLine();

                NodoRed instancia = new NodoRed(nombreEquipo, direccionIP, mascaraRed, direccionBroadcast, enlacePuerta, direccionRed, servidoresDNS);
                redes[i] = instancia;

                System.out.println("Añadido con éxito en la celda: " + i);

                i = redes.length;

            } else {
                System.out.println("ERROR. NO HAY MÁS ESPACIO EN DISCO. ");
            }
        }

    }

    private static void menu() {
        System.out.println();
        System.out.println("1 - CREAR NODORED. ");
        System.out.println("2 - VISUALIZAR NODORED. ");
        System.out.println("3 - MODIFICAR NODORED. ");
        System.out.println("4 - NÚMERO DE INSTANCIAS CREADAS. ");
        System.out.println();
        System.out.println("0 - SALIR");

    }
}
