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
 *      DOMSource source = new DOMSource(documento);
 *       StreamResult result = new StreamResult(new File("xxx.xml"));
 * 
 * 6 - Transformer transformer = TransformerFactory.newDefaultInstance().newTransformer();
 *      transformer.transform(source, result);
 *
 */
package Ejercicios_XML;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

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

public class primerDOM {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException, IOException {

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        System.err.println("\n");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();


        DOMImplementation implementation = builder.getDOMImplementation();
        Document documento = implementation.createDocument(null, "ordenadores", null);
        documento.setXmlVersion("1.0");


        Element ordenadores = documento.createElement("ordenadores");


        Element ordenador = documento.createElement("ordenador");
        crearElemento("MARCA", "MSI", documento, ordenador);
        crearElemento("MODELO", "14 prestige", documento, ordenador);
        crearElemento("PROCESADOR", "i5-12450H", documento, ordenador);
        crearElemento("STOCK", "40", documento, ordenador);
        ordenadores.appendChild(ordenador);

        for (int i = 0; i < 2; i++) {
            System.out.println("Introduce la marca: ");
            String marca = scanner.readLine();
            crearElemento("MARCA", marca, documento, ordenador);
            System.out.println("Introduce la modelo: ");
            String modelo = scanner.readLine();
            crearElemento("MODELO", modelo, documento, ordenador);
            System.out.println("Introduce la procesador: ");
            String procesador = scanner.readLine();
            crearElemento("PROCESADOR", procesador, documento, ordenador);
            System.out.println("Introduce el stock: ");
            String stock = scanner.readLine();
            crearElemento("STOCK", stock, documento, ordenador);
            
        }

        documento.getDocumentElement().appendChild(ordenador);

        DOMSource source = new DOMSource(documento);
        StreamResult result = new StreamResult(new File("ordenadores.xml"));

        Transformer transformer = TransformerFactory.newDefaultInstance().newTransformer();
        transformer.transform(source, result);

        
    }

    private static void crearElemento(String dato, String valor, Document documento, Element raiz) {
        Element elemento = documento.createElement(dato);
        Text texto = documento.createTextNode(valor);
        elemento.appendChild(texto);
        raiz.appendChild(elemento);
    }
}
