package Tema_9.Ejercicios_de_Ampliación.Ejercicio_5;

public class Banco {
    private String nombreBanco;
    private String direccion;
    private int telefono;
    private int numCuentasCorrientes;

    public Banco(String nombreBanco, String direccion, int telefono, int numCuentasCorrientes) {
        this.nombreBanco = nombreBanco;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numCuentasCorrientes = numCuentasCorrientes;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNumCuentasCorrientes() {
        return numCuentasCorrientes;
    }

    public void setNumCuentasCorrientes(int numCuentasCorrientes) {
        this.numCuentasCorrientes = numCuentasCorrientes;
    }

    @Override
    public String toString() {
        return "\n      ---BANCO---     \nNOMBRE EL BANCO: " + nombreBanco + "\nDIRECCION: " + direccion + "\nTELEFONO: " + telefono
                + "\nNÚMERO DE CUENTAS CORRIENTES: " + numCuentasCorrientes;
    }

    
}
