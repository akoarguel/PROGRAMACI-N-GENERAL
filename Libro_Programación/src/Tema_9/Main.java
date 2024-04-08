/*
 * Crea un pequeño programa que use la jerarquía defnada en la activdad anterior de forma que mantenga un array de FigurasGeometricas
 * al que vayas asignand las diferentes dfiguras representadas por las clases Rectangulo, Circulo, Rombo y Cuadrado. Incluye una
 * funcion que se encargue de contar el número de figuras geométricas de cada tipo incluidas en el array. La salid a de este método podría ser:
 * 2 Circulos; 1 Cuadrados; 4 Rombos; 10 Rectangulos
 */
package Tema_9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo(0, 0, 15));
        figuras.add(new Cuadrado(0, 0, 15, 15));
        figuras.add(new Rectangulo(0, 0, 10, 5));
        figuras.add(new Rombo(0, 0, 5, 3, 3));

        contarFiguras(figuras);
        
        for (FiguraGeometrica figura : figuras) {
            
            System.out.println("\nPERÍMETRO " + figura.perimetro());
            System.out.println("AREA: " + figura.area());
            System.out.println(figura.toString());
            
        }

    }

    private static void contarFiguras(ArrayList<FiguraGeometrica> figuras) {
        int numCirculos = 0;
        int numCuadrados = 0;
        int numRectangulos = 0;
        int numRombos = 0;

        for (FiguraGeometrica figura : figuras) {
            if (figura instanceof Circulo) {
                numCirculos++;
            } else if (figura instanceof Cuadrado) {
                numCuadrados++;
            } else if (figura instanceof Rombo) {
                numRombos++;
            } else if (figura instanceof Rectangulo) {
                numRectangulos++;
            }
        }

        System.out.println("CIRCULOS - " + numCirculos);
        System.out.println("CUADRADOS - " + numCuadrados);
        System.out.println("ROMBOS - " + numRombos);
        System.out.println("RECTANGULOS - " + numRectangulos);
    }
}
