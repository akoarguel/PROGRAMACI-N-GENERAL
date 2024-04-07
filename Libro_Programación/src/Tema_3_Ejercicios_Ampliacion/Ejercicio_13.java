package Tema_3_Ejercicios_Ampliacion;

public class Ejercicio_13 {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("\n" + i);
            } else {
                System.out.print("-");
            }
        }
    }
}
