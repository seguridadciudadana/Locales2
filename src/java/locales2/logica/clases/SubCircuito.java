
package locales2.logica.clases;
import locales2.logica.clases.Circuito;


public class SubCircuito {
     private int id_subcircuito;
    private String codigo_subcircuito;
    private String descripcion;
    private Circuito id_circuito;

    public SubCircuito() {
    }

    public SubCircuito(int id_subcircuito, String codigo_subcircuito, String descripcion, Circuito id_circuito) {
        this.id_subcircuito = id_subcircuito;
        this.codigo_subcircuito = codigo_subcircuito;
        this.descripcion = descripcion;
        this.id_circuito = id_circuito;
    }

    public int getId_subcircuito() {
        return id_subcircuito;
    }

    public void setId_subcircuito(int id_subcircuito) {
        this.id_subcircuito = id_subcircuito;
    }

    public String getCodigo_subcircuito() {
        return codigo_subcircuito;
    }

    public void setCodigo_subcircuito(String codigo_subcircuito) {
        this.codigo_subcircuito = codigo_subcircuito;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Circuito getId_circuito() {
        return id_circuito;
    }

    public void setId_circuito(Circuito id_circuito) {
        this.id_circuito = id_circuito;
    }
    
    
}
