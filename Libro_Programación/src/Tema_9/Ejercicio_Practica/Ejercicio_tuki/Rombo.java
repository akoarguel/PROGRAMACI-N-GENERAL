package Tema_9.Ejercicio_Practica.Ejercicio_tuki;

public class Rombo extends FiguraGeometrica{
    private int diagonalMayor;
    private int diagonalMenor;
    private int lado;

    public Rombo(int x, int y, int diagonalMayor, int diagonalMenor, int lado) {
        super(x, y);
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(int diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public int getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(int diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    

    @Override
    public String toString() {
        return "Rombo [diagonalMayor=" + diagonalMayor + ", diagonalMenor=" + diagonalMenor + ", lado=" + lado + "]";
    }

    @Override
    public double area() {
        return (diagonalMayor*diagonalMenor)/2;
    }

    @Override
    public double perimetro() {
        return (lado*4);
    }

    

}
