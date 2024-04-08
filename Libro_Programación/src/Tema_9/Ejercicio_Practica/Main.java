package Tema_9.Ejercicio_Practica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carta> cartas = new ArrayList<>();

        cartas.add(new CartaEspecial("OROS"));
        cartas.add(new CartaNormal(7, "BASTOS"));
        cartas.add(new CartaNormal(5, "ESPADAS"));

        for (Carta carta : cartas) {
            System.out.println("Valor "+ carta.obtenerValor()+ " Palo " + carta.obtenerPalo());
        }
    }
}
