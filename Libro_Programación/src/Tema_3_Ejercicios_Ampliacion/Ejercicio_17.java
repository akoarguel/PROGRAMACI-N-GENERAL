package Tema_3_Ejercicios_Ampliacion;

public class Ejercicio_17 { 
    
        public static void main(String[] args) {
            int inicio = 33, fin = 42;              // 126 entre 3 por columna
            int numColumna = 3, numAscii = 1;
            

            for (int i = 0; i <= fin; i++) {
                for (int j = 1; j <= numColumna; j++) {
                    System.out.print("              " + numAscii + " - " + (char)inicio);
                    inicio++;
                    numAscii++;
                }
                System.out.println();
            }

        }
    
    
}
