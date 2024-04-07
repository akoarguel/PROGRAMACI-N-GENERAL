package Tema_7_Ejercicios_Ampliacion.Ejercicio_3;

public class Peliculas {

    public enum Formato{
        DVD, BLUERAY, DIGITAL, CASETE
    }

    private String titulo;
    private String[] actores;
    private String[] directores;
    private String fecha_de_salida;
    private Formato formato;
    private double duracion;


    public Peliculas(String titulo, String[] actores, String[] directores, String fecha_de_salida, Formato formato,
            double duracion) {
        this.titulo = titulo;
        this.actores = actores;
        this.directores = directores;
        this.fecha_de_salida = fecha_de_salida;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String[] getActores() {
        return actores;
    }

    public void setActores(String[] actores) {
        this.actores = actores;
    }

    public String[] getDirectores() {
        return directores;
    }

    public void setDirectores(String[] directores) {
        this.directores = directores;
    }

    public String getFecha_de_salida() {
        return fecha_de_salida;
    }

    public void setFecha_de_salida(String fecha_de_salida) {
        this.fecha_de_salida = fecha_de_salida;
    }
    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }
    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void mostrarContenido() {
        System.out.println("TITULO: " + titulo);
        System.out.print("ACTORES: ");
        for (String actor : actores) {
            System.out.print(actor + ", ");
        }
        System.out.println();
        System.out.print("DIRECTORES: ");
        for (String director : directores) {
            System.out.print(director + ", ");
        }
        System.out.println();
        System.out.println("FECHA DE SALIDA: " + fecha_de_salida);
        System.out.println("FORMATO: " + formato);
        System.out.println("DURACIÓN (minutos): " + duracion);
    }
    
}
