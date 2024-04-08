package Tema_9;

public class Cuadrado extends FiguraGeometrica{

    private int ancho;
    private int alto;
    
    public Cuadrado(int x, int y, int ancho, int alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return super.toString() + " Cuadrado [ancho=" + ancho + ", alto=" + alto + "]";
    }

    @Override
    public double area() {
        return ancho * alto;
    }

    @Override
    public double perimetro() {
        return (ancho + alto)*2;
    }

}
