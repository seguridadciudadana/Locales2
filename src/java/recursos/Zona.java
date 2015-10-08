/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

/**
 *
 * @author ICITS SALA5
 */
public class Zona {

    private int id_zona;
    private String descripcion;

    /*
     ** CONSTRUCTORES.
     */
    public Zona() {
    }

    public Zona(int id_zona, String descripcion) {
        this.id_zona = id_zona;
        this.descripcion = descripcion;
    }

    /*
     ** METODOS GET SET
     */
    public int getId_zona() {
        return id_zona;
    }

    public void setId_zona(int id_zona) {
        this.id_zona = id_zona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
