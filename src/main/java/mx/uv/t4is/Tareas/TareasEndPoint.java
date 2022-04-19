package mx.uv.t4is.Tareas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.tareas.BuscarTareasResponse;
import https.t4is_uv_mx.tareas.CrearTareaRequest;
import https.t4is_uv_mx.tareas.CrearTareaResponse;
import https.t4is_uv_mx.tareas.EliminarTareaRequest;
import https.t4is_uv_mx.tareas.EliminarTareaResponse;



@Endpoint
public class TareasEndPoint {

    //Creo mi instancia de la interfaz para poder hacer uso de sus metodos e insertar nuevos objetos
    @Autowired
    Itareadao itareadao;


    //A partir de la peticion se lanza crearTarea y se crea una nueva tarea a partir de los datos que trae la peticion  con la instancia se guarda en la base de datos y finalmente se retrna la respuesta.
    @PayloadRoot(localPart = "CrearTareaRequest", namespace = "https://t4is.uv.mx/tareas")
    @ResponsePayload
    public CrearTareaResponse crearTarea(@RequestPayload CrearTareaRequest peticion) {
        CrearTareaResponse respuesta = new CrearTareaResponse();
        respuesta.setRespuesta("Tarea creada exitosamente");
        TareaDAO tarea = new TareaDAO();
        tarea.setTarea(peticion.getTarea());
        itareadao.save(tarea);
        return respuesta;
    }

    //Para buscar los saludos, se recuperan y se guardan en una lista de tipo tarea y despues se recorre para poder asiganrle los valores a un objeto y mandarlo como respuesta.
    @PayloadRoot(localPart = "BuscarTareasRequest", namespace = "https://t4is.uv.mx/tareas")
    @ResponsePayload
    public BuscarTareasResponse buscarTareas(){
        BuscarTareasResponse respuesta = new BuscarTareasResponse();
        Iterable<TareaDAO> lista = itareadao.findAll();
        for (TareaDAO o : lista) {
            BuscarTareasResponse.Tareas e = new BuscarTareasResponse.Tareas();
             e.setTarea(o.getTarea());
             e.setId(o.getId());
             respuesta.getTareas().add(e);
         }
        return respuesta;
    }

    //En esta parte se pide el id de la tarea que se desee eliminar y a partir de una funcion se elimina por id y se regresa la respuesta.
    @PayloadRoot(localPart = "EliminarTareaRequest", namespace = "https://t4is.uv.mx/tareas")
    @ResponsePayload
    public EliminarTareaResponse eliminarTarea(@RequestPayload EliminarTareaRequest peticion){
        EliminarTareaResponse respuesta = new EliminarTareaResponse();
        itareadao.deleteById(peticion.getId());
        respuesta.setRespuesta("Tarea eliminada");
        return respuesta;
    }


}

