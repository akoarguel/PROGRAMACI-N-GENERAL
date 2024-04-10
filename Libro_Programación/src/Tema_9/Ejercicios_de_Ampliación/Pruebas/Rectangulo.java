package Tema_9.Ejercicios_de_Ampliación.Pruebas;

public class Rectangulo extends FiguraGeometrica{
    private int base;
    private int altura;
    
    public Rectangulo(int x, int y, int base, int altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + " Rectangulo [base=" + base + ", altura=" + altura + "]";
    }

    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public double perimetro() {
        return base + base + altura + altura;
    }

}
