package Tema_9.Ejercicios_de_Ampliación.Ejercicio_5;

public class Cuenta_Corriente extends Banco{
    private int numCuenta;
    private double saldo;
    private String titularCuenta;
    
    public Cuenta_Corriente(String nombreBanco, String direccion, int telefono, int numCuentasCorrientes, int numCuenta,
            double saldo, String titularCuenta) {
        super(nombreBanco, direccion, telefono, numCuentasCorrientes);
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.titularCuenta = titularCuenta;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    @Override
    public String toString() {
        return "\n      ---CUENTA CORRIENTE---     \nNÚMERO DE CUENTA: " + numCuenta + "\nSALDO: " + saldo + "\nTITULAR DE CUETNA: " + titularCuenta;
    }
}
