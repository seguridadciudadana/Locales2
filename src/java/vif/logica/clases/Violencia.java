/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vif.logica.clases;

/**
 *
 * @author Oscunach
 */
public class Violencia {
    private int id_violencia;
    private String tipo;
    private String descripcion;

    public Violencia() {
    }

    public Violencia(int id_violencia, String tipo, String descripcion) {
        this.id_violencia = id_violencia;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public int getId_violencia() {
        return id_violencia;
    }

    public void setId_violencia(int id_violencia) {
        this.id_violencia = id_violencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }        
    
}
