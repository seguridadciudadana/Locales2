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
public class Provincia {

    private int id_provincia;
    private String nombre;
    private String descripcion;
    private Zona id_zona;

    /*
     ** contructores
     */
    public Provincia() {
    }

    public Provincia(int id_provincia, String nombre, String descripcion, Zona id_zona) {
        this.id_provincia = id_provincia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id_zona = id_zona;
    }

    /*
     ** metodos get y set    
     */
    public int getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
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

    public Zona getId_zona() {
        return id_zona;
    }

    public void setId_zona(Zona id_zona) {
        this.id_zona = id_zona;
    }

}
