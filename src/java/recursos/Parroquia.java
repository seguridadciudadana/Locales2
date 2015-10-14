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
public class Parroquia {

    private int id_parroquia;
    private String nombre_parroquia;
    private String descripcion_parroquia;
    private Canton id_canton;
    /*
    coantructores
    */

    public Parroquia() {
    }

    public Parroquia(int id_parroquia, String nombre_parroquia, String descripcion_parroquia, Canton id_canton) {
        this.id_parroquia = id_parroquia;
        this.nombre_parroquia = nombre_parroquia;
        this.descripcion_parroquia = descripcion_parroquia;
        this.id_canton = id_canton;
    }

   
    /*
    metodos get y set
    */

    public int getId_parroquia() {
        return id_parroquia;
    }

    public void setId_parroquia(int id_parroquia) {
        this.id_parroquia = id_parroquia;
    }

    public String getNombre_parroquia() {
        return nombre_parroquia;
    }

    public void setNombre_parroquia(String nombre_parroquia) {
        this.nombre_parroquia = nombre_parroquia;
    }

    public String getDescripcion_parroquia() {
        return descripcion_parroquia;
    }

    public void setDescripcion_parroquia(String descripcion_parroquia) {
        this.descripcion_parroquia = descripcion_parroquia;
    }

    public Canton getId_canton() {
        return id_canton;
    }

    public void setId_canton(Canton id_canton) {
        this.id_canton = id_canton;
    }
    
    
    
}
