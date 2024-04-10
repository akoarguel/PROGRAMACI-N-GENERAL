package Tema_9.Tema_9_Ejercicios_Ampliacion.Ejercicio_1;

public class Perro extends Animal{
    private String raza;
    private Tamaño tamaño;
    private Energia energia;
    
    public Perro(String nombreCientifico, int edad, String habitat, String especie, double peso,
            Alimentacion alimentacion, int longevidad, String raza, Tamaño tamaño, Energia energia) {
        super(nombreCientifico, edad, habitat, especie, peso, alimentacion, longevidad);
        this.raza = raza;
        this.tamaño = tamaño;
        this.energia = energia;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Tamaño getTamaño() {
        return tamaño;
    }

    public void setTamaño(Tamaño tamaño) {
        this.tamaño = tamaño;
    }

    public Energia getEnergia() {
        return energia;
    }

    public void setEnergia(Energia energia) {
        this.energia = energia;
    }

    @Override
    public String toString() {
        return super.toString() + "RAZA: " + raza +
                 "TAMAÑO: " + tamaño + "ENERGIA: " + energia;
    }

} 

