package Tema_9.Ejercicios_de_Ampliación.Ejercicio_10;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private String apellidos;
    
    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + "]";
    }

    @Override
    public int compareTo(Alumno otrAlumno) {
        int comparación = this.nombre.compareTo(otrAlumno.nombre);
        
        if (comparación != 0) {
            return comparación;
        }   else {
            return this.apellidos.compareTo(otrAlumno.apellidos);
        }

    }

    

}
