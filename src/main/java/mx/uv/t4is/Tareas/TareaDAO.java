package mx.uv.t4is.Tareas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//DTO
@Entity
public class TareaDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tarea;

    

    public TareaDAO() {
    }


    public TareaDAO(int id, String tarea) {
        this.id = id;
        this.tarea = tarea;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarea() {
        return this.tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
    

}
