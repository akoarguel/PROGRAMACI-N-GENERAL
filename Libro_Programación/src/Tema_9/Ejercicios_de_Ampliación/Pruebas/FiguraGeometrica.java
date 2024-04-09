/*
 * Realiza un nuevo proyecto en el que inlcuyas las clases: FiguraGeometrica, Rectangulo, Cuadrado, Circulo y Rombo, tal que
 * las cuatro últimas clases deriven de FiguraGeométrica. En FiguraGeometrica incluiremos los atribytos X e Y relacionados
 * con la posicion del objeto. Las demás clases deben incluir las propiedades necesarias en funcion del tipo de figura, por
 * ejemplo, la clase Circulo incluirá atributos del tipo coordenada x e y del centro y radio. Agregar los métodos área y perímetro
 */
package Tema_9.Ejercicios_de_Ampliación.Pruebas;

public abstract class FiguraGeometrica {
    private int x;
    private int y;

    public FiguraGeometrica(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica [x=" + x + ", y=" + y + "]";
    }

    public abstract double area();

    public abstract double perimetro();

}
