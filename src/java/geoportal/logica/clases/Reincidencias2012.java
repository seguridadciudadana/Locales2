/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.logica.clases;

/**
 *
 * @author Oscunach
 */
public class Reincidencias2012 {

    private int reincidencias;
    private String victima;

    public Reincidencias2012() {
    }

    public Reincidencias2012(int reincidencias, String victima) {
        this.reincidencias = reincidencias;
        this.victima = victima;
    }

    public int getReincidencias() {
        return reincidencias;
    }

    public void setReincidencias(int reincidencias) {
        this.reincidencias = reincidencias;
    }

    public String getVictima() {
        return victima;
    }

    public void setVictima(String victima) {
        this.victima = victima;
    }

}
