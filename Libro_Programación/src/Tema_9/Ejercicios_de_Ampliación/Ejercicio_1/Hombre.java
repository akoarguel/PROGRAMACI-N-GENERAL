package Tema_9.Ejercicios_de_Ampliación.Ejercicio_1;

public class Hombre extends Animal{
    private String nombre;
    private String apellido;
    private String profesion;
    private String nacionalidad;

    public Hombre(String nombreCientifico, int edad, String habitat, String animal, double peso,
            Tema_9.Ejercicios_de_Ampliación.Ejercicio_1.Cosas_varias.Alimentacion alimentación, double longevidad, String nombre,
            String apellido, String profesion, String nacionalidad) {
        super(nombreCientifico, edad, habitat, animal, peso, alimentación, longevidad);
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    @Override
    public String toString() {
        return super.toString() + "     ---HOMBRE---         \nNombre -----> " + nombre + "\nApellido -----> " + apellido + "\nProfesion -----> " + profesion + "\nNacionalidad -----> "
                + nacionalidad;
    }

    
}
