package Tema_10.Actividades_Temario.PRUEBA_JAVA.Java_XML_solo;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class CrearXML {
    public static void main(String[] args) throws ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();

            Document documento = implementation.createDocument(null, "EmpleadosExplotados", null);
            documento.setXmlVersion("1.0");

            Element trabajadores = documento.createElement("trabajadores");

            Element trabajador = documento.createElement("trabajador");

            Element nombre = documento.createElement("nombre");
            Text textNombre = documento.createTextNode("Violeta");
            nombre.appendChild(textNombre);
            trabajador.appendChild(nombre); 
            
            Element puesto = documento.createElement("puesto");
            Text textPuesto = documento.createTextNode("Diseñadora de arte o algo así");
            puesto.appendChild(textPuesto);
            trabajador.appendChild(puesto);

            Element salario = documento.createElement("salario");
            Text textSalario = documento.createTextNode("5 peniques");
            salario.appendChild(textSalario);
            trabajador.appendChild(salario);

            trabajadores.appendChild(trabajador);

            Element trabajador2 = documento.createElement("trabajador");

            Element nombre2 = documento.createElement("nombre");
            Text textNombre2 = documento.createTextNode("Ralph");
            nombre2.appendChild(textNombre2);
            trabajador2.appendChild(nombre2); 
            
            Element puesto2 = documento.createElement("puesto");
            Text textPuesto2 = documento.createTextNode("Noseque de sex");
            puesto2.appendChild(textPuesto2);
            trabajador2.appendChild(puesto2);

            Element salario2 = documento.createElement("salario");
            Text textSalario2 = documento.createTextNode("La mitad del minimo de media jornada");
            salario2.appendChild(textSalario2);
            trabajador2.appendChild(salario2);

            trabajadores.appendChild(trabajador2);

            documento.getDocumentElement().appendChild(trabajadores);

            DOMSource source = new DOMSource(documento);
            StreamResult result = new StreamResult(new File("trabajadoresexplotados.xml"));

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
        } catch (DOMException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TransformerFactoryConfigurationError e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TransformerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
