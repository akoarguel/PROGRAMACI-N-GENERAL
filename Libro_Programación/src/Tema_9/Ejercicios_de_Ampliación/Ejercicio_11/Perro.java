package Tema_9.Ejercicios_de_Ampliación.Ejercicio_11;

public class Perro extends Animal implements Sonidos{
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + "Perro [raza=" + raza + "]";
    }

    @Override
    public String sonidoProducido() {
        return "guau guau";
    }

}
