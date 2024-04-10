package Tema_9.Tema_9_Ejercicios_Ampliacion.Ejercicio_1;

public abstract class Animal extends SerVivo{
    private String especie;
    private double peso;
    private Alimentacion alimentacion;
    private int longevidad;

    public Animal(String nombreCientifico, int edad, String habitat, String especie, double peso,
            Alimentacion alimentacion, int longevidad) {
        super(nombreCientifico, edad, habitat);
        this.especie = especie;
        this.peso = peso;
        this.alimentacion = alimentacion;
        this.longevidad = longevidad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Alimentacion getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(Alimentacion alimentacion) {
        this.alimentacion = alimentacion;
    }

    public int getLongevidad() {
        return longevidad;
    }

    public void setLongevidad(int longevidad) {
        this.longevidad = longevidad;
    }
    @Override
    public String toString() {
        return super.toString() + "ESPECIE: " + especie +
                 "PESO: " + peso + "ALIMENTACION: " + alimentacion + 
                 "LONGEVIDAD: " + longevidad;
    }
}
