package Ejercicios_Complicados.Ejercicio_2;

public class Libro {
    private String titulo;
    private String autor;
    private double Precio;
    private int numStock;

    public Libro(String titulo, String autor, double precio, int numStock) {
        this.titulo = titulo;
        this.autor = autor;
        Precio = precio;
        this.numStock = numStock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public int getNumStock() {
        return numStock;
    }

    public void setNumStock(int numStock) {
        this.numStock = numStock;
    }

    @Override
    public String toString() {
        return "Titulo --> " + titulo + "\nAutor  --> " + autor + "\nPrecio --> " + Precio + " $" + "\nNumero de Stock --> " + numStock;
    }
    
}
