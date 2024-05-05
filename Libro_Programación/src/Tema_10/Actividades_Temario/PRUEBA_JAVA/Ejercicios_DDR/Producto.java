/*
 * Escribe con RandomAccessFile un cichero con los siguientes datos
 * de 5 productos:
 * - id (int)
 * - nombre (String, 10 caracteres)
 * - precio (double)
 * - decuento (boolean)
 * - tipo (char)
 * 
 * lee el segundo registro
 */

package Tema_10.Actividades_Temario.PRUEBA_JAVA.Ejercicios_DDR;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private boolean descuento;
    private char tipo;
    public Producto(int id, String nombre, double precio, boolean descuento, char tipo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
        this.tipo = tipo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
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
    public boolean isDescuento() {
        return descuento;
    }
    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }
    public char getTipo() {
        return tipo;
    }
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    
}
