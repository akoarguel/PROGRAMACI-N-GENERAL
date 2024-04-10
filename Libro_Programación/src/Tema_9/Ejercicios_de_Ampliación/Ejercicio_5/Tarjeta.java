package Tema_9.Ejercicios_de_Ampliación.Ejercicio_5;

public class Tarjeta {
    private String numeroTarjeta;
    private String tipo;
    private String fechaVencimiento;
    private double limiteCredito;

    // Constructor
    public Tarjeta(String numeroTarjeta, String tipo, String fechaVencimiento, double limiteCredito) {
        this.numeroTarjeta = numeroTarjeta;
        this.tipo = tipo;
        this.fechaVencimiento = fechaVencimiento;
        this.limiteCredito = limiteCredito;
    }

    // Getters y setters
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String toString() {
        return "\n      ---TARJETA---     \nNÚMERO DE TARJETA: " + numeroTarjeta + "\nTIPO: " + tipo
                + "\nFECHA DE VENCIMIENTO: " + fechaVencimiento +
                "\nLÍMITE DE CRÉDITO: " + limiteCredito;
    }

}
