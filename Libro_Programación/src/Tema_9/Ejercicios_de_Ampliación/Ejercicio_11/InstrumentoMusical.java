package Tema_9.Ejercicios_de_Ampliación.Ejercicio_11;

public abstract class InstrumentoMusical {
    private String nombre;
    private Tipo tipo;
    
    public InstrumentoMusical(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "InstrumentoMusical [nombre=" + nombre + ", tipo=" + tipo + "]";
    }
    
}
