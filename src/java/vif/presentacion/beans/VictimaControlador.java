/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vif.presentacion.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import org.primefaces.context.DefaultRequestContext;
import recursos.Util;
import vif.logica.clases.Victima;
import vif.logica.funciones.FVictima;

/**
 *
 * @author Virt-ICITS-2
 */
@ManagedBean
@RequestScoped
public class VictimaControlador {

    /**
     * Creates a new instance of VictimaControlador
     */
    private Victima objVictima;
    private Victima victimaSel;
    private ArrayList<Victima> lstVictimas;
    private boolean mostrarActualizar;

    public Victima getObjVictima() {
        return objVictima;
    }

    public void setObjVictima(Victima objVictima) {
        this.objVictima = objVictima;
    }

    public Victima getVictimaSel() {
        return victimaSel;
    }

    public void setVictimaSel(Victima victimaSel) {
        this.victimaSel = victimaSel;
    }

    public ArrayList<Victima> getLstVictimas() {
        return lstVictimas;
    }

    public void setLstVictimas(ArrayList<Victima> lstVictimas) {
        this.lstVictimas = lstVictimas;
    }

    public boolean isMostrarActualizar() {
        return mostrarActualizar;
    }

    public void setMostrarActualizar(boolean mostrarActualizar) {
        this.mostrarActualizar = mostrarActualizar;
    }

    public VictimaControlador() {
        this.reinit();
    }

    public void reinit() {
        this.objVictima = new Victima();
        this.victimaSel = new Victima();
        this.lstVictimas = new ArrayList<Victima>();
        this.obtnerVictimas();
    }

    public void obtnerVictimas() {
        try {
            this.lstVictimas = FVictima.ObtenerVictimas();
            this.victimaSel = lstVictimas.get(0);
            System.out.println(lstVictimas.get(0).getId_victima());
        } catch (Exception e) {
            Util.addErrorMessage("private void obtnerVictimas  dice: " + e.getMessage());
            System.out.println("private void obtnerVictimas dice: " + e.getMessage());
        }
    }


    public void insertarVictima() {
        try {
            if (FVictima.Insertar(objVictima)) {
                this.reinit();
                DefaultRequestContext.getCurrentInstance().execute("wdlgNuevaVictima.hide()");
                Util.addSuccessMessage("Información guardada con éxito");
                System.out.println("public void insertarVictima dice: Error al guardar la información");
            }
        } catch (Exception e) {
            Util.addErrorMessage("private void insertarVictima dice: " + e.getMessage());
            System.out.println("private void insertarVictima dice: " + e.getMessage());
        }
    }
     
    public void editarVictima(){
        try{
            //estudianteSel.setCodigo_nivel(FNivel.ObtenerNivelDadoCodigo(estudianteSel.getCodigo_nivel().getCodigo()));
            victimaSel.setId_victima(victimaSel.getId_victima());
            if(FVictima.editarVictima(victimaSel)){
                victimaSel = new Victima();
                mostrarActualizar = false;
                this.reinit();
                 DefaultRequestContext.getCurrentInstance().execute("wdlgEditarVictima.hide()");
                Util.addSuccessMessage("Información guardada con éxito");
                System.out.println("public void editarVictima dice: Información guardada con éxito!!");
            }else{
                Util.addErrorMessage("Error al guardar la información");
                System.out.println("public void editarVictima dice: Error al guardar la información");
            }
        }catch (Exception e) {
            Util.addErrorMessage("private void editarVictima dice: " + e.getMessage());
            System.out.println("private void editarVictima dice: " + e.getMessage());
        }
    }
    
    
    public void eliminarVictima(){
        try{
            if(FVictima.eliminarVictima((int)victimaSel.getId_victima())){
                this.reinit();
                DefaultRequestContext.getCurrentInstance().execute("wdlgEliminarVictima.hide()");
                Util.addSuccessMessage("Información eliminada.");
                System.out.println("public void eliminarVictima dice: Información eliminada.");
            }else {
                Util.addErrorMessage("Error al eliminar la información.");
                System.out.println("public void eliminarVictima dice: Error al eliminar la información");
            }
        }catch(Exception e) {
            Util.addErrorMessage("private void eliminarVictima dice: " + e.getMessage());
            System.out.println("private void eliminarVictima dice: " + e.getMessage());
        }
    }

    
}
