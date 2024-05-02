package Ejercicios_Complicados.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    // creamos un List de objetos Producto
    private List<Producto> productos;

    // IMPORTANTE. modificamos el constructor para que al usarlo cree un ArrayList.
    public Almacen() {
        this.productos = new ArrayList<>();
    }

    // metodo 'agregarProductos()' que recibe un objeto de tipo Producto e introduce este en el Array
    public void agregarProductos(Producto producto){
        productos.add(producto);
    }

    // método 'buscarProductos()' que recibe un String y lo compara con los nombres de los productos. Si no hay coincidencias devuelve 'null'
    public Producto buscarProductos(String nombre){
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    // método 'mostrarProductos()' que recorre todo el Array y va mostrando los datos de cada producto gracias al método 'mostrarDatos()' de la clase Producto
    public void mostrarProductos() {
        System.out.println("PRODUCTOS EN EL ALMACÉN: ");
        for (Producto producto : productos) {
            System.out.println(producto.mostrarDatos());
        }
    }
    
    // este método es importantísimo. basicamente devuelve el array completo, se usará mucho para los foreach en la clase Main
    public List<Producto> getProductos() {
        return productos;
    }

}
