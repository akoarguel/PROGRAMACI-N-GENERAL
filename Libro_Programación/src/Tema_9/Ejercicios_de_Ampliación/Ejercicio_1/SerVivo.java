package Tema_9.Ejercicios_de_Ampliación.Ejercicio_1;

public abstract class SerVivo {
    private String nombreCientifico;
    private int edad;
    private String habitat;
    
    public SerVivo(String nombreCientifico, int edad, String habitat) {
        this.nombreCientifico = nombreCientifico;
        this.edad = edad;
        this.habitat = habitat;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "\n      ---SER VIVO---      \nNombreCientifico -----> " + nombreCientifico + "\nEdad -----> " + edad + "\nhabitat -----> " + habitat;
    }

    
}
 