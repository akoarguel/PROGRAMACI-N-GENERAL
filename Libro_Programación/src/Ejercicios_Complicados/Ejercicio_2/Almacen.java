package Ejercicios_Complicados.Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Libro> libros;

    public Almacen() {
        this.libros = new ArrayList<>();
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void agregarProducto(Libro libro){
        libros.add(libro);
    }
    
    public Libro buscarProducto(String titulo){
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void mostrarLibros() throws InterruptedException{
        System.out.println("LIBROS EN EL ALMACÉN: ");
        for (Libro libro : libros) {
            Thread.sleep(50);
            System.out.println(libro.toString());
            System.out.println("        ------      ");
        }
    }
}
