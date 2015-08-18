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
public class VictimasReincidentes2010 {

   private int reincidencia;
   private String victima;
   private String sexo;

    public VictimasReincidentes2010() {
    }

    public VictimasReincidentes2010(int reincidencia, String victima, String sexo) {
        this.reincidencia = reincidencia;
        this.victima = victima;
        this.sexo = sexo;
    }

    public int getReincidencia() {
        return reincidencia;
    }

    public void setReincidencia(int reincidencia) {
        this.reincidencia = reincidencia;
    }

    public String getVictima() {
        return victima;
    }

    public void setVictima(String victima) {
        this.victima = victima;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
   
   

}
