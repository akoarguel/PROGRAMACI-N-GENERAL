package Tema_7.Actividad_77;

public class Persona{
    private String nombre;
    private String apellidos;
    private String dni;
    private String sexo;
    private Fecha fecha;
    private double peso;
    private double altura;
    
    public Persona(String nombre, String apellidos, String dni, String sexo, Fecha fecha, double peso, double altura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.sexo = sexo;
        this.fecha = fecha;
        this.peso = peso;
        this.altura = altura;
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
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Fecha getFecha() {
        return fecha;
    }
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("DNI: " + dni);
        System.out.println("Sexo: " + sexo);
        System.out.println("Fecha: " + fecha.toString());
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura + " m");

    }
    public void mostrarApellidos(){
        System.out.println(apellidos + ", " + nombre);
    }
    

}