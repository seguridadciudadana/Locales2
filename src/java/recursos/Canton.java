package recursos;

/**
 *
 * @author ICITS SALA5
 */
public class Canton {

    private int id_canton;
    private String nombre;
    private String descripcion;
    private Provincia id_provincia;
    
    /*
    contructores
    */

    public Canton() {
    }

    public Canton(int id_canton, String nombre, String descripcion) {
        this.id_canton = id_canton;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
     
    /*
    metodos get set
    */

    public int getId_canton() {
        return id_canton;
    }

    public void setId_canton(int id_canton) {
        this.id_canton = id_canton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Provincia getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(Provincia id_provincia) {
        this.id_provincia = id_provincia;
    }



}
