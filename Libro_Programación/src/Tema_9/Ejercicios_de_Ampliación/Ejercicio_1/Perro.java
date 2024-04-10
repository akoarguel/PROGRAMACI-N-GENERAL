package Tema_9.Ejercicios_de_Ampliación.Ejercicio_1;

import Tema_9.Ejercicios_de_Ampliación.Ejercicio_1.Cosas_varias.Energia;
import Tema_9.Ejercicios_de_Ampliación.Ejercicio_1.Cosas_varias.Tamaño;

public class Perro extends Animal{
    private String raza;
    private Tamaño tamaño;
    private Energia energia;
    
    public Perro(String nombreCientifico, int edad, String habitat, String animal, double peso,
            Tema_9.Ejercicios_de_Ampliación.Ejercicio_1.Cosas_varias.Alimentacion alimentación, double longevidad, String raza,
            Tamaño tamaño, Energia energia) {
        super(nombreCientifico, edad, habitat, animal, peso, alimentación, longevidad);
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
        return super.toString() + "\n       ---PERRO---      \nRaza -----> " + raza + "\nTamaño -----> " + tamaño + "\nEnergia -----> " + energia;
    }

    

}
