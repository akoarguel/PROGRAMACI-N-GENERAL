package Tema_9.Ejercicios_de_Ampliación.Ejercicio_1;

import Tema_9.Ejercicios_de_Ampliación.Ejercicio_1.Cosas_varias.Alimentacion;

public abstract class Animal extends SerVivo{
    private String animal;
    private double peso;
    private Alimentacion Alimentación;
    private double longevidad;
    
    public Animal(String nombreCientifico, int edad, String habitat, String animal, double peso,
            Tema_9.Ejercicios_de_Ampliación.Ejercicio_1.Cosas_varias.Alimentacion alimentación, double longevidad) {
        super(nombreCientifico, edad, habitat);
        this.animal = animal;
        this.peso = peso;
        Alimentación = alimentación;
        this.longevidad = longevidad;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Alimentacion getAlimentación() {
        return Alimentación;
    }

    public void setAlimentación(Alimentacion alimentación) {
        Alimentación = alimentación;
    }

    public double getLongevidad() {
        return longevidad;
    }

    public void setLongevidad(double longevidad) {
        this.longevidad = longevidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\n       ---ANIMAL---         \nNombre -----> " + animal + "\n Peso -----> " + peso + "\nAlimentación -----> " + Alimentación + "\nLongevidad -----> "
                + longevidad;
    }

    
}
