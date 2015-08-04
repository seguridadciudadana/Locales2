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
public class AuxtblFechas2010 {

    private String victima;
    private String sexo;
    private String fecha;

    public AuxtblFechas2010() {
    }

    public AuxtblFechas2010(String victima, String sexo, String fecha) {
        this.victima = victima;
        this.sexo = sexo;
        this.fecha = fecha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getVictima() {
        return victima;
    }

    public void setVictima(String victima) {
        this.victima = victima;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
