package Tema_9.Ejercicios_de_Ampliación.Ejercicio_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException, NumberFormatException, IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Banco> datosBanco = new ArrayList<>();
        int respuesta;

        cuentasDefault(datosBanco);

        for (Banco banco : datosBanco) {
            System.out.println(banco.toString());
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
                    break;

                default:
                    break;
            }
        } while (respuesta != 0);
    }

    private static void menu() {
        System.out.println("ABRIR CUENTA CORRIENTE");
        System.out.println();
    }

    private static void cuentasDefault(ArrayList<Banco> datosBanco) {
        Cuenta_Corriente cc1 = new Cuenta_Corriente("Banco Santander", "Calle Mayor, 1", 123456789, 10, 1, 1500.0,
                "Juan Pérez");
        Cuenta_Corriente cc2 = new Cuenta_Corriente("BBVA", "Avenida Libertad, 20", 987654321, 8, 1, 3000.0,
                "María García");
        Cuenta_Corriente cc3 = new Cuenta_Corriente("CaixaBank", "Plaza España, 5", 111222333, 12, 1, 3500.0,
                "Carlos Martínez");
        Cuenta_Corriente cc4 = new Cuenta_Corriente("Bankia", "Calle Gran Vía, 50", 555666777, 15, 1, 2800.0,
                "Ana López");
        Cuenta_Corriente cc5 = new Cuenta_Corriente("Sabadell", "Paseo de la Castellana, 100", 888999000, 20, 1, 4000.0,
                "Laura Rodríguez");
        Cuenta_Corriente cc6 = new Cuenta_Corriente("ING", "Calle Alcalá, 200", 222333444, 10, 1, 3200.0,
                "Pedro Sánchez");
        Cuenta_Corriente cc7 = new Cuenta_Corriente("Bankinter", "Calle Serrano, 30", 777888999, 18, 1, 2700.0,
                "Elena Martín");
        Cuenta_Corriente cc8 = new Cuenta_Corriente("Unicaja", "Avenida Andalucía, 15", 666555444, 22, 1, 3900.0,
                "Pablo Ruiz");
        Cuenta_Corriente cc9 = new Cuenta_Corriente("Kutxabank", "Plaza Cataluña, 10", 444333222, 14, 1, 4100.0,
                "Sara López");
        Cuenta_Corriente cc10 = new Cuenta_Corriente("Abanca", "Rúa da Vía, 25", 999888777, 25, 1, 2300.0,
                "David González");
        Cuenta_Corriente cc11 = new Cuenta_Corriente("Ibercaja", "Calle Pintor Sorolla, 8", 111444777, 30, 1, 3400.0,
                "Carmen Fernández");
        Cuenta_Corriente cc12 = new Cuenta_Corriente("Deutsche Bank", "Potsdamer Platz, 1", 333222111, 9, 1, 2900.0,
                "Javier Pérez");
        Cuenta_Corriente cc13 = new Cuenta_Corriente("Banco Popular", "Calle Alfonso X, 7", 777111333, 17, 1, 2600.0,
                "Paula Sánchez");
        Cuenta_Corriente cc14 = new Cuenta_Corriente("Cajamar", "Paseo de la Farola, 12", 888333222, 21, 1, 3800.0,
                "Adrián Martínez");
        Cuenta_Corriente cc15 = new Cuenta_Corriente("Santander", "Plaza Mayor, 3", 666999444, 12, 1, 3300.0,
                "Nerea Gómez");

        datosBanco.add(cc1);
        datosBanco.add(cc2);
        datosBanco.add(cc3);
        datosBanco.add(cc4);
        datosBanco.add(cc5);
        datosBanco.add(cc6);
        datosBanco.add(cc7);
        datosBanco.add(cc8);
        datosBanco.add(cc9);
        datosBanco.add(cc10);
        datosBanco.add(cc11);
        datosBanco.add(cc12);
        datosBanco.add(cc13);
        datosBanco.add(cc14);
        datosBanco.add(cc15);

    }
}
