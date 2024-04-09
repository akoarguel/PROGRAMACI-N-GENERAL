package Tema_9.Ejercicios_de_Ampliación.Ejercicio_11;

public class Gato extends Animal implements Sonidos{
    private String raza;

    public Gato(String nombre, String raza) {
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
        return super.toString() + "Gato [raza=" + raza;
    }

    @Override
    public String sonidoProducido() {
        return "miau miau";
    }

    
}
