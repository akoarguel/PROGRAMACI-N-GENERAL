package Tema_7_Ejercicios_Ampliacion.Ejercicio_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
        
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        Coche c1 = new Coche("Mercedes", "Clase C", "7123 JDK", "AZUL");
        Coche c2 = new Coche("Audi", "A3", "7124 JDL", "GRIS");
        Coche c3 = new Coche("BMW", "Serie 3", "7125 JDM", "NEGRO");
        Coche c4 = new Coche("Ford", "Focus", "7126 JDN", "ROJO");
        Coche c5 = new Coche("Volkswagen", "Golf", "7127 JDO", "BLANCO");
        Coche c6 = new Coche("Renault", "Clio", "7128 JDP", "VERDE");
        Coche c7 = new Coche("Peugeot", "208", "7129 JDQ", "PLATA");
        Coche c8 = new Coche("Toyota", "Corolla", "7130 JDR", "AZUL");
        Coche c9 = new Coche("Honda", "Civic", "7131 JDS", "AMARILLO");
        Coche c10 = new Coche("Nissan", "Qashqai", "7132 JDT", "GRIS");
        Coche c11 = new Coche("Hyundai", "i30", "7133 JDU", "NEGRO");
        Coche c12 = new Coche("Kia", "Ceed", "7134 JDV", "ROJO");
        Coche c13 = new Coche("Seat", "León", "7135 JDW", "BLANCO");
        Coche c14 = new Coche("Skoda", "Octavia", "7136 JDX", "VERDE");
        Coche c15 = new Coche("Mazda", "3", "7137 JDY", "PLATA");
        Coche c16 = new Coche("Mercedes", "Clase A", "7138 JDZ", "AZUL");
        Coche c17 = new Coche("Audi", "A4", "7139 JEA", "AMARILLO");
        Coche c18 = new Coche("BMW", "Serie 1", "7140 JEB", "GRIS");
        Coche c19 = new Coche("Ford", "Fiesta", "7141 JEC", "NEGRO");
        Coche c20 = new Coche("Volkswagen", "Polo", "7142 JED", "ROJO");
        Coche c21 = new Coche("Toyota", "Yaris", "7143 JEE", "AZUL");
        Coche c22 = new Coche("Honda", "HR-V", "7144 JEF", "GRIS");
        Coche c23 = new Coche("Nissan", "Micra", "7145 JEG", "BLANCO");
        Coche c24 = new Coche("Hyundai", "Tucson", "7146 JEH", "ROJO");
        Coche c25 = new Coche("Kia", "Sportage", "7147 JEI", "VERDE");
        Coche c26 = new Coche("Seat", "Ibiza", "7148 JEJ", "PLATA");
        Coche c27 = new Coche("Skoda", "Kodiaq", "7149 JEK", "AZUL");
        Coche c28 = new Coche("Mazda", "CX-5", "7150 JEL", "GRIS");
        Coche c29 = new Coche("Ford", "Mustang", "7151 JEM", "ROJO");
        Coche c30 = new Coche("Mercedes", "GLA", "7152 JEN", "NEGRO");
        Coche c31 = new Coche("Audi", "Q7", "7153 JEO", "BLANCO");
        Coche c32 = new Coche("BMW", "X5", "7154 JEP", "AZUL");
        Coche c33 = new Coche("Volkswagen", "Tiguan", "7155 JEQ", "GRIS");
        Coche c34 = new Coche("Renault", "Megane", "7156 JER", "ROJO");
        Coche c35 = new Coche("Peugeot", "3008", "7157 JES", "NEGRO");
        Coche c36 = new Coche("Toyota", "C-HR", "7158 JET", "BLANCO");
        Coche c37 = new Coche("Honda", "Civic", "7159 JEU", "AZUL");
        Coche c38 = new Coche("Nissan", "Qashqai", "7160 JEV", "GRIS");
        Coche c39 = new Coche("Hyundai", "i20", "7161 JEW", "ROJO");
        Coche c40 = new Coche("Kia", "Rio", "7162 JEX", "VERDE");
        Coche c41 = new Coche("Seat", "Arona", "7163 JEY", "PLATA");
        Coche c42 = new Coche("Skoda", "Fabia", "7164 JEZ", "AZUL");
        Coche c43 = new Coche("Mazda", "CX-3", "7165 JFA", "GRIS");
        Coche c44 = new Coche("Ford", "Focus", "7166 JFB", "ROJO");
        Coche c45 = new Coche("Mercedes", "Clase B", "7167 JFC", "NEGRO");
        Coche c46 = new Coche("Audi", "A1", "7168 JFD", "BLANCO");
        Coche c47 = new Coche("BMW", "Serie 2", "7169 JFE", "AZUL");
        Coche c48 = new Coche("Volkswagen", "Polo", "7170 JFF", "GRIS");
        Coche c49 = new Coche("Renault", "Captur", "7171 JFG", "ROJO");
        Coche c50 = new Coche("Peugeot", "208", "7172 JFH", "VERDE");
        Coche c51 = new Coche("Toyota", "Auris", "7173 JFI", "PLATA");
        Coche c52 = new Coche("Honda", "Jazz", "7174 JFJ", "AZUL");
        Coche c53 = new Coche("Nissan", "Leaf", "7175 JFK", "GRIS");
        Coche c54 = new Coche("Hyundai", "Kona", "7176 JFL", "ROJO");
        Coche c55 = new Coche("Kia", "Niro", "7177 JFM", "NEGRO");
        Coche c56 = new Coche("Seat", "Toledo", "7178 JFN", "BLANCO");
        Coche c57 = new Coche("Skoda", "Scala", "7179 JFO", "AZUL");
        Coche c58 = new Coche("Mazda", "MX-5", "7180 JFP", "GRIS");
        Coche c59 = new Coche("Ford", "Ka", "7181 JFQ", "ROJO");
        Coche c60 = new Coche("Mercedes", "Clase A", "7182 JFR", "NEGRO");
        Coche c61 = new Coche("Audi", "A3", "7183 JFS", "BLANCO");
        Coche c62 = new Coche("BMW", "Serie 1", "7184 JFT", "AZUL");
        Coche c63 = new Coche("Volkswagen", "Golf", "7185 JFU", "VERDE");


        int respuesta;
        Coche[] coche = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, 
            c11, c12, c13, c14, c15, c16, c17, c18, c19, c20,
            c21, c22, c23, c24, c25, c26, c27, c28, c29, c30,
            c31, c32, c33, c34, c35, c36, c37, c38, c39, c40,
            c41, c42, c43, c44, c45, c46, c47, c48, c49, c50,
            c51, c52, c53, c54, c55, c56, c57, c58, c59, c60,
            c61, c62, c63};


        ListaCoches listaCoche = new ListaCoches(coche);

        do {
            System.out.println();
            menu();
            System.out.println("\nELIGE UNA OPCIÓN");
            respuesta = Integer.parseInt(scanner.readLine());

            switch (respuesta) {
                case 0:
                for (int i = 0; i < 70; i++) {
                    Thread.sleep(5);
                    System.out.println("    ----------------    ");
                    Thread.sleep(5);
                    System.out.println("    FIN DEL PROGRAMA    ");
                    Thread.sleep(5);
                    System.out.println("    ----------------    ");
                }
                    break;
                case 1:
                    System.out.println("INTRODUCE LA POSICIÓN DEL COCHE: ");
                    int posicion = Integer.parseInt(scanner.readLine());
                    listaCoche.obtenerCoche(posicion).mostrarDatos();;
                    break;
                case 2:
                    System.out.println("INTRODUCE LA MATRICULA DEL COCHE: ");
                    String matricula = scanner.readLine();
                    int i = listaCoche.obtenerCoche(matricula);
                    coche[i].mostrarDatos();
                case 3:
                    System.out.println("INTRODUCE LA MARCA: ");
                    String marca = scanner.readLine();
                    
                    for (Coche coche2 : listaCoche.obtener(marca)) {
                        coche2.mostrarDatos();
                        Thread.sleep(200);
                    }

                default:
                    break;
            }

        } while (respuesta != 0);


        listaCoche.obtenerCoche(1).mostrarDatos();

    }

    private static void menu() {
        System.out.println("\n1 - OBTENER COCHE POR LA POSICIÓN. ");
        System.out.println("2 - OBTENER COCHE POR MATRICULA. ");
        System.out.println("3 - OBTENER COCHES POR MARCA");
    }

}
