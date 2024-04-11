package FicheroPersona;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;

public class FicheroPersonaLeer {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        File FicheroPersonas = new File("C:\\Users\\manel\\Documents\\FICHEROS\\FichPersonas.dat");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FicheroPersonas));
    
        Persona persona;

        int i = 1;

        try {
            while (true) {
                persona = (Persona) ois.readObject();
                System.out.print(i + "=>");
                i++;
                System.out.printf("Nombre: %s, edad: %d%n", persona.getNombre(), persona.getEdad());

            }
        } catch (EOFException eo) {
            System.out.println("FIN DE LECTURA DE FICHERO.");
        } catch (StreamCorruptedException e) {
            e.printStackTrace();
        } finally {
            ois.close(); // Cerrar el flujo en el bloque finally
        }
    }
}
