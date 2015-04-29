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
import vif.logica.clases.Agresor;
import vif.logica.funciones.FAgresor;

/**
 *
 * @author Virt-ICITS-2
 */
@ManagedBean
@RequestScoped
public class AgresorControlador {

    /**
     * Creates a new instance of AgresorControlador
     */
    private Agresor objAgresor;
    private Agresor agresorSel;
    private ArrayList<Agresor> lstAgresor;
    private boolean mostrarActualizar;

    //getter y setter
    public Agresor getObjAgresor() {
        return objAgresor;
    }

    public void setObjAgresor(Agresor objAgresor) {
        this.objAgresor = objAgresor;
    }

    public Agresor getAgresorSel() {
        return agresorSel;
    }

    public void setAgresorSel(Agresor agresorSel) {
        this.agresorSel = agresorSel;
    }

    public ArrayList<Agresor> getLstAgresor() {
        return lstAgresor;
    }

    public void setLstAgresor(ArrayList<Agresor> lstAgresor) {
        this.lstAgresor = lstAgresor;
    }

    public boolean isMostrarActualizar() {
        return mostrarActualizar;
    }

    public void setMostrarActualizar(boolean mostrarActualizar) {
        this.mostrarActualizar = mostrarActualizar;
    }

    //constructor e instanciador de variables
    public AgresorControlador() {
        this.reinit();
    }

    public void reinit() {
        this.objAgresor = new Agresor();
        this.agresorSel = new Agresor();
        this.lstAgresor = new ArrayList<Agresor>();
        this.obtnerAgresor();
    }

    public void obtnerAgresor() {
        try {
            this.lstAgresor = FAgresor.ObtenerAgresor();
            this.agresorSel = lstAgresor.get(0);
            System.out.println(lstAgresor.get(0).getId_agresor());
        } catch (Exception e) {
            Util.addErrorMessage("private void obtnerAgresor  dice: " + e.getMessage());
            System.out.println("private void obtnerAgresor dice: " + e.getMessage());
        }
    }

    public void insertarAgresor() {
        try {
            if (FAgresor.Insertar(objAgresor)) {
                this.reinit();
                DefaultRequestContext.getCurrentInstance().execute("wdlgNuevoAgresor.hide()");
                Util.addSuccessMessage("Información guardada con éxito");
                System.out.println("public void insertarAgresor dice: Error al guardar la información");
            }
        } catch (Exception e) {
            Util.addErrorMessage("private void insertarAgresor dice: " + e.getMessage());
            System.out.println("private void insertarAgresor dice: " + e.getMessage());
        }
    }

}
