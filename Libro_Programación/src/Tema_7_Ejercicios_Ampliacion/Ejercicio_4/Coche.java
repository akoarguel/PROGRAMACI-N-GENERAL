package Tema_7_Ejercicios_Ampliacion.Ejercicio_4;

public class Coche {
    private String marca;
    private String modelo;
    private String matricula;
    private String color;
    
    public Coche(String marca, String modelo, String matricula, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarDatos(){
        System.out.println("");
        System.out.println("    MARCA -------> " + marca);
        System.out.println("    MODELO ------> " + modelo);
        System.out.println("    MATRICULA ---> " + matricula);
        System.out.println("    COLOR -------> " + color);
    }

}   
