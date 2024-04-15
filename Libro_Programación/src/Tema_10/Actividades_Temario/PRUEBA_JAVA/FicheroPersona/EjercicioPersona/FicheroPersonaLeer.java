package Tema_10.Actividades_Temario.PRUEBA_JAVA.FicheroPersona.EjercicioPersona;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;

public class FicheroPersonaLeer {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Persona persona; // Defino la variable persona
        File fic = new File("C:\\Users\\manel\\Documents\\FICHEROS\\FichPersonas.dat");
        ObjectInputStream objectIS = new ObjectInputStream(new FileInputStream(fic));

        int i = 1;

        try {
            while (true) {
                persona = (Persona) objectIS.readObject();
                System.out.print(i + "=>");
                i++;
                System.out.printf("Nombre: %s, edad: %d%n", persona.getNombre(), persona.getEdad());

            }
        } catch (EOFException eo) {
            System.out.println("FIN DE LECTURA DE FICHERO.");
        } catch (StreamCorruptedException e) {
            e.printStackTrace();
        } finally {
            objectIS.close(); // Cerrar el flujo en el bloque finally
        }
    }
}