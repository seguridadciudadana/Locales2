/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vif.logica.clases;

/**
 *
 * @author servidor
 */
public class subcircuito {
        private int Id_subcircuito;
    private String Codigo_subcircuito;
    private String Descripcion;
    private int Id_circuito;

    public subcircuito() {
    }

    public subcircuito(int Id_subcircuito, String Codigo_subcircuito, String Descripcion, int Id_circuito) {
        this.Id_subcircuito = Id_subcircuito;
        this.Codigo_subcircuito = Codigo_subcircuito;
        this.Descripcion = Descripcion;
        this.Id_circuito = Id_circuito;
    }

    public int getId_subcircuito() {
        return Id_subcircuito;
    }

    public void setId_subcircuito(int Id_subcircuito) {
        this.Id_subcircuito = Id_subcircuito;
    }

    public String getCodigo_subcircuito() {
        return Codigo_subcircuito;
    }

    public void setCodigo_subcircuito(String Codigo_subcircuito) {
        this.Codigo_subcircuito = Codigo_subcircuito;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getId_circuito() {
        return Id_circuito;
    }

    public void setId_circuito(int Id_circuito) {
        this.Id_circuito = Id_circuito;
    }
    
    
}
