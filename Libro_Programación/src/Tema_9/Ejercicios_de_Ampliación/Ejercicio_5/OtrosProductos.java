package Tema_9.Ejercicios_de_Ampliación.Ejercicio_5;

public class OtrosProductos{
    private Banco banco;
    private String nombreProducto;
    private String descripcion;
    private double precio;

    public OtrosProductos(Banco banco, String nombreProducto, String descripcion, double precio) {
        this.banco = banco;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\n      ---OTROS PRODUCTOS---     \nDATOS DEL BANCO: " + banco + "\nNOMBRE DEL PRODUCTO: " + nombreProducto + "\nDESCRIPCIÓN: " + descripcion + "\nPRECIO: " + precio;
    }
}
