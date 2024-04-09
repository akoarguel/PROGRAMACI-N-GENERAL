package Tema_9.Ejercicios_de_Ampliación.Ejercicio_11;

public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + "]";
    }
     
    
}
