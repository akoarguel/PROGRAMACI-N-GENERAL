/*
 * PASOS PARA CREAR UN XML CON DOM:
 * 
 * 1 - DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
 *      DocumentBuilder builder = factory.newDocumentBuilder();
 * 
 * 2 - DOMImplememtation implementation = builder.getDOMImplementation();
 *      Document documento = implementation.createDocument(null, "xxx", null);
 *       documento.setXmlVersion("1.0");
 * 
 * 3 - Element nombreRaiz = documento.createElement(nombreRaiz);
 *      
 * 4 - Elemento nombreHijo = document.createElement(nombreHijo);
 *      crearElemento("atributo", "valor", documento, nombreHijo);
 *                  {
 *                      Element elemento void crearElemento(String dato, String valor, Document documento, Element raiz){
 *                          Element elemento = documento.createElement(dato);
 *                          Text texto = documento.createTextNode(valor);
 *                          elemento.appendChild(texto);
 *                          raiz.appednChild(elemento);
 *                      }
 *                  }
 * 
 * 5 - documento.getDocumetElement().appendChild(nombreHijo);
 *      DOMSource source = new DOMSource();
 *       StreamResult result = new StreamResult(new File("xxx.xml"));
 * 
 * 6 - Transformer transformer = TransformerFactory.newDefaultInstance().newTransformer();
 *      transformer.transform(source, result);
 *
 */
package Ejercicios_XML;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class DOM {
    public static void main(String[] args) {

        try {

            //  1

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            //  2

            DOMImplementation implementation = builder.getDOMImplementation();
            Document documento = implementation.createDocument(null, "empleados", null);
            documento.setXmlVersion("1.0");

            //  3

            Element empleados = documento.createElement("empleados");

            //  4

            Element empleado = documento.createElement("empleado");
            crearElemento("id", "1", documento, empleado);
            crearElemento("nombre", "Manel Arguelles", documento, empleado);
            crearElemento("departamento", "mantenimiento", documento, empleado);
            crearElemento("telefono", "717718448", documento, empleado);
            empleados.appendChild(empleado);

            //  5

            documento.getDocumentElement().appendChild(empleado);

            DOMSource source = new DOMSource(documento);
            StreamResult result = new StreamResult(new File("empleados.xml"));

            //  6

            Transformer transformer = TransformerFactory.newDefaultInstance().newTransformer();
            transformer.transform(source, result);

        } catch (DOMException e) {
            System.out.println("ERROR. DOMException \n" + e.getMessage());
        } catch (TransformerConfigurationException e) {
            System.out.println("ERROR. TransformerConfigurationException \n" + e.getMessage());
        } catch (ParserConfigurationException e) {
            System.out.println("ERROR. ParserConfigurationException \n" + e.getMessage());
        } catch (TransformerException e) {
            System.out.println("ERROR. TransformerException \n" + e.getMessage());
        }

        
    }

    private static void crearElemento(String datoEmple, String valor, Document documento, Element raiz) {
        Element elemento = documento.createElement(datoEmple);
        Text texto = documento.createTextNode(valor);
        documento.appendChild(texto);
        raiz.appendChild(elemento);
    }

    
}
