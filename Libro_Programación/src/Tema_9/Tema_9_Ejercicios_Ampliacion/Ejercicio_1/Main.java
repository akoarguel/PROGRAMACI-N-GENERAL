package Tema_9.Tema_9_Ejercicios_Ampliacion.Ejercicio_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SerVivo> seresVivos = new ArrayList<>();
        int contador;

        SerVivo s2 = new Planta("Rosales", 3, "Jardín", "Ornamental", "Mediana", "Tierra común", "Primavera");
        SerVivo s3 = new Planta("Cactus", 10, "Desierto", "Suculenta", "Pequeña", "Arena", "Todo el año");
        SerVivo s4 = new Planta("Helecho", 7, "Selva tropical", "Follaje", "Grande", "Suelo húmedo", "Verano");
        SerVivo s5 = new Planta("Girasol", 2, "Campo", "Ornamental", "Grande", "Tierra", "Verano");

        SerVivo s6 = new Perro("Canis lupus familiaris", 7, "Hogar", "Canino", 25.5, Alimentacion.CARNIVORO, 15, "Bulldog", Tamaño.MEDIANO, Energia.ALTO);
        SerVivo s7 = new Perro("Canis lupus familiaris", 10, "Hogar", "Canino", 15.5, Alimentacion.CARNIVORO, 12, "Poodle", Tamaño.PEQUEÑO, Energia.MEDIO);
        SerVivo s8 = new Perro("Canis lupus familiaris", 3, "Hogar", "Canino", 8.5, Alimentacion.CARNIVORO, 18, "Labrador", Tamaño.GRANDE, Energia.ALTO);
        SerVivo s9 = new Perro("Canis lupus familiaris", 5, "Hogar", "Canino", 12.0, Alimentacion.CARNIVORO, 10, "Chihuahua", Tamaño.PEQUEÑO, Energia.BAJO);

        SerVivo s10 = new Hombre("Homo sapiens", 30, "Tierra", "Humano", 70, Alimentacion.OMNIVORO, 80, "Juan", "Pérez", "Ingeniero", "Español");
        SerVivo s11 = new Hombre("Homo sapiens", 40, "Tierra", "Humano", 75, Alimentacion.OMNIVORO, 75, "Pedro", "Gómez", "Médico", "Mexicano");
        SerVivo s12 = new Hombre("Homo sapiens", 25, "Tierra", "Humano", 68, Alimentacion.OMNIVORO, 85, "Ana", "Martínez", "Estudiante", "Colombiana");
        SerVivo s13 = new Hombre("Homo sapiens", 35, "Tierra", "Humano", 80, Alimentacion.OMNIVORO, 90, "María", "García", "Profesor", "Argentino");

        seresVivos.add(s2);
        seresVivos.add(s3);
        seresVivos.add(s4);
        seresVivos.add(s5);
        seresVivos.add(s6);
        seresVivos.add(s7);
        seresVivos.add(s8);
        seresVivos.add(s9);
        seresVivos.add(s10);
        seresVivos.add(s11);
        seresVivos.add(s12);
        seresVivos.add(s13);

    }
}
