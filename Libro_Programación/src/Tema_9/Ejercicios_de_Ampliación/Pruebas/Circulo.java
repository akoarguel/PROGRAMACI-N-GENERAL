package Tema_9.Ejercicios_de_Ampliación.Pruebas;

public class Circulo extends FiguraGeometrica{
    private int radio;

    public Circulo(int x, int y, int radio) {
        super(x, y);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return super.toString() + " Circulo [radio=" + radio + "]";
    }

    @Override
    public double area() {
        return  Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio; 
    }
    
}
