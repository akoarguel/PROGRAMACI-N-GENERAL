package Tema_7_Ejercicios_Ampliacion.Ejercicio_4;

public class ListaCoches {
    private Coche[] coches;

    public ListaCoches(Coche[] coches) {
        this.coches = coches;
    }

    public Coche obtenerCoche(int pos) {
        if (pos >= 0 && pos < coches.length) {
            return coches[pos];
        } else {
            return null;
        }
    }

    public int obtenerCoche(String matricula){
        for (int i = 0; i < coches.length; i++) {
            if (coches[i] != null && coches[i].getMatricula().equalsIgnoreCase(matricula)) {
                return i;
            } 
        }
        return -1;
    }

    public Coche[] obtener(String marca) {
        // Contador para determinar cuántos coches hay de la marca especificada
        int contador = 0;
        // Recorremos el array de coches para contar cuántos tienen la marca especificada
        for (Coche coche : coches) {
            // Verificamos que el coche no sea nulo y que su marca coincida con la especificada
            if (coche != null && coche.getMarca().equals(marca)) {
                contador++;
            }
        }
        // Creamos un nuevo array para almacenar los coches de la marca especificada
        Coche[] cochesMarca = new Coche[contador];
        contador = 0; // Reiniciamos el contador para usarlo como índice en el nuevo array
        // Volvemos a recorrer el array de coches para almacenar los coches de la marca especificada
        for (Coche coche : coches) {
            // Verificamos que el coche no sea nulo y que su marca coincida con la especificada
            if (coche != null && coche.getMarca().equals(marca)) {
                cochesMarca[contador] = coche; // Almacenamos el coche en el nuevo array
                contador++; // Incrementamos el contador para pasar a la siguiente posición del nuevo array
            }
        }
        // Devolvemos el array que contiene los coches de la marca especificada
        return cochesMarca;
    }


}