package Tema_9.Ejercicio_Practica;

public class CartaEspecial implements Carta{
    private String palo;

    public CartaEspecial(String palo) {
        this.palo = palo;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "CartaEspecial [palo=" + palo + "]";
    }

    @Override
    public int obtenerValor() {
        return -1;
    }

    @Override
    public String obtenerPalo() {
        return palo;
    }
}
