package Tema_10.Actividades_Temario.PRUEBA_JAVA.Java_XML;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class CrearXML {
    public static void main(String[] args) throws TransformerFactoryConfigurationError, TransformerException {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();

            Document documento = implementation.createDocument(null, "concesionario", null);
            documento.setXmlVersion("1.0");

            Element coches = documento.createElement("coches");

            Element coche = documento.createElement("coche");

            Element matricula = documento.createElement("matricula");
            Text textMatricula = documento.createTextNode("1111AAA");
            matricula.appendChild(textMatricula);
            coche.appendChild(matricula);

            Element marca = documento.createElement("marca");
            Text textMarca = documento.createTextNode("BMW");
            marca.appendChild(textMarca);
            coche.appendChild(marca);

            Element precio = documento.createElement("precio");
            Text textPrecio = documento.createTextNode("30000");
            precio.appendChild(textPrecio);
            coche.appendChild(precio);

            coches.appendChild(coche);

            Element coche2 = documento.createElement("coche");

            Element matricula2 = documento.createElement("matricula");
            Text textMatricula2 = documento.createTextNode("2222BBB");
            matricula2.appendChild(textMatricula2);
            coche2.appendChild(matricula2);

            Element marca2 = documento.createElement("marca");
            Text textMarca2 = documento.createTextNode("AUDI");
            marca2.appendChild(textMarca2);
            coche2.appendChild(marca2);

            Element precio2 = documento.createElement("precio");
            Text textPrecio2 = documento.createTextNode("50000");
            precio2.appendChild(textPrecio2);
            coche2.appendChild(precio2);

            coches.appendChild(coche2);

            Element coche3 = documento.createElement("coche");

            Element matricuala3 = documento.createElement("matricula");
            Text textMatricula3 = documento.createTextNode("3333CCC");
            matricuala3.appendChild(textMatricula3);
            coche3.appendChild(matricuala3);

            Element marca3 = documento.createElement("marca");
            Text textMarca3 = documento.createTextNode("SEAT");
            marca3.appendChild(textMarca3);
            coche3.appendChild(marca3);

            Element precio3 = documento.createElement("precio");
            Text textPrecio3 = documento.createTextNode("14000");
            precio3.appendChild(textPrecio3);
            coche3.appendChild(precio3);

            coches.appendChild(coche3);


            documento.getDocumentElement().appendChild(coches);

            DOMSource source = new DOMSource(documento);
            StreamResult result = new StreamResult(new File("concesionario.xml"));

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);

        } catch (ParserConfigurationException | TransformerException e) {
            System.out.println(e.getMessage());
        }
    }
}
