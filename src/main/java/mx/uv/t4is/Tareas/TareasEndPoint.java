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
    //int contadorId = 1 ;
    //List<BuscarSaludosResponse.Saludos> saludos = new ArrayList<>();

    @Autowired
    Itareadao itareadao;

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


    @PayloadRoot(localPart = "EliminarTareaRequest", namespace = "https://t4is.uv.mx/tareas")
    @ResponsePayload
    public EliminarTareaResponse eliminarTarea(@RequestPayload EliminarTareaRequest peticion){
        EliminarTareaResponse respuesta = new EliminarTareaResponse();
        itareadao.deleteById(peticion.getId());
        respuesta.setRespuesta("Tarea eliminada");
        return respuesta;
    }


}

