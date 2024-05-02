package Ejercicios_Complicados.Ejercicio_1;

public class Producto {
    // creamos los atributos de los productos
    private String nombre;
    private double precio;
    private int numStock;

    // el constructor para crearlo en la clase main
    public Producto(String nombre, double precio, int numStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.numStock = numStock;
    }
    
    // los getters y setters por si acaso
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getNumStock() {
        return numStock;
    }
    public void setNumStock(int numStock) {
        this.numStock = numStock;
    }

    // un metodo String para devolver la información del producto 
    public String mostrarDatos() {
        return "NOMBRE DEL PRODUCTO: " + nombre + "     |   PRECIO DEL PRODUCTO: " + precio + "     |   CANTIDAD EN STOCK: " + numStock;
        
    }

}
