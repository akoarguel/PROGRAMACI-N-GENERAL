package Tema_9.Ejercicio_Practica;

public class CartaNormal implements Carta{
    private int valor;
    private String palo;
    public CartaNormal(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public String getPalo() {
        return palo;
    }
    public void setPalo(String palo) {
        this.palo = palo;
    }
    @Override
    public String toString() {
        return "CartaNormal [valor=" + valor + ", palo=" + palo + "]";
    }
    @Override
    public int obtenerValor() {
        return valor;
    }
    @Override
    public String obtenerPalo() {
        return palo;
    }
    
}
