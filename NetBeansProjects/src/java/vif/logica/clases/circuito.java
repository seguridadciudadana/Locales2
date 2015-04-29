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
public class circuito {

    private int Id_circuito;
    private String Codigo_circuito;
    private String Descripcion;

    public circuito() {
    }

    public circuito(int Id_circuito, String Codigo_circuito, String Descripcion) {
        this.Id_circuito = Id_circuito;
        this.Codigo_circuito = Codigo_circuito;
        this.Descripcion = Descripcion;
    }

    public int getId_circuito() {
        return Id_circuito;
    }

    public void setId_circuito(int Id_circuito) {
        this.Id_circuito = Id_circuito;
    }

    public String getCodigo_circuito() {
        return Codigo_circuito;
    }

    public void setCodigo_circuito(String Codigo_circuito) {
        this.Codigo_circuito = Codigo_circuito;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

}
