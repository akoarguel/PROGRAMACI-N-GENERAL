package Tema_10.Actividades_Temario.PRUEBA_JAVA.Ejercicios_DDR.YoSolo;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class XML {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();

            Document documento = implementation.createDocument(null, "Trabajadores", null);
            documento.setXmlVersion("1.0");

            Element trabajadores = documento.createElement("trabajadores");
            Element trabajador = documento.createElement("trabajador");

            Element nombre = documento.createElement("nombre");
            Text textNombre = documento.createTextNode("Zeta");
            nombre.appendChild(textNombre);
            trabajador.appendChild(nombre);

            Element dni = documento.createElement("dni");
            Text textDNI = documento.createTextNode("12341234S");
            dni.appendChild(textDNI);
            trabajador.appendChild(dni);

            Element puesto = documento.createElement("Puesto");
            Text textPuesto = documento.createTextNode("Camarera");
            puesto.appendChild(textPuesto);
            trabajador.appendChild(puesto);

            trabajadores.appendChild(trabajador);

            documento.getDocumentElement().appendChild(trabajadores);

            DOMSource source = new DOMSource(documento);
            StreamResult result = new StreamResult(new File("trabajadores.xml"));

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);


        } catch (ParserConfigurationException | TransformerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
