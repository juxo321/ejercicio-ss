//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.19 a las 03:04:37 PM CDT 
//


package https.t4is_uv_mx.tareas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.tareas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarTareasRequest_QNAME = new QName("https://t4is.uv.mx/tareas", "BuscarTareasRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.tareas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarTareasResponse }
     * 
     */
    public BuscarTareasResponse createBuscarTareasResponse() {
        return new BuscarTareasResponse();
    }

    /**
     * Create an instance of {@link CrearTareaRequest }
     * 
     */
    public CrearTareaRequest createCrearTareaRequest() {
        return new CrearTareaRequest();
    }

    /**
     * Create an instance of {@link CrearTareaResponse }
     * 
     */
    public CrearTareaResponse createCrearTareaResponse() {
        return new CrearTareaResponse();
    }

    /**
     * Create an instance of {@link BuscarTareasResponse.Tareas }
     * 
     */
    public BuscarTareasResponse.Tareas createBuscarTareasResponseTareas() {
        return new BuscarTareasResponse.Tareas();
    }

    /**
     * Create an instance of {@link EliminarTareaRequest }
     * 
     */
    public EliminarTareaRequest createEliminarTareaRequest() {
        return new EliminarTareaRequest();
    }

    /**
     * Create an instance of {@link EliminarTareaResponse }
     * 
     */
    public EliminarTareaResponse createEliminarTareaResponse() {
        return new EliminarTareaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/tareas", name = "BuscarTareasRequest")
    public JAXBElement<Object> createBuscarTareasRequest(Object value) {
        return new JAXBElement<Object>(_BuscarTareasRequest_QNAME, Object.class, null, value);
    }

}
