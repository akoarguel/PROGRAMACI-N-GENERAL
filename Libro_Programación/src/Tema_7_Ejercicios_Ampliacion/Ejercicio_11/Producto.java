package Tema_7_Ejercicios_Ampliacion.Ejercicio_11;

public class Producto {
    private int referencia;
    private Tipo tipo;
    private String marca;
    private String modelo;
    private double pulgadas;
    private String procesador;
    private int herciosPantalla;

    public Producto(int referencia, Tipo tipo, String marca, String modelo, double pulgadas, String procesador,
            int herciosPantalla) {
        this.referencia = referencia;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
        this.procesador = procesador;
        this.herciosPantalla = herciosPantalla;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
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

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getHerciosPantalla() {
        return herciosPantalla;
    }

    public void setHerciosPantalla(int herciosPantalla) {
        this.herciosPantalla = herciosPantalla;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }
    
    public void mostrarContenido(){
        System.out.println("    -   " + tipo + "    -   ");
        System.out.println("MARCA -------> " + marca);
        System.out.println("MODELO ------> " + modelo);
        System.out.println("PULGADAS ----> " + pulgadas);
        System.out.println("PROCESADOR -->" + procesador);
        System.out.println("HZ PANTALLA -> " + herciosPantalla);

    }

    
}


