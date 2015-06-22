/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denunciasfiscalia.presentacion.beans;

import denunciasfiscalia.logica.clases.Fiscalia_2011;
import denunciasfiscalia.logica.funciones.FFiscalia_2011;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorFiscalia2011_Datos {

    /**
     * Creates a new instance of ControladorFiscalia2011_Datos
     */
    private ArrayList<Fiscalia_2011> lstDatos;
    private Fiscalia_2011 datoSel;
    private Fiscalia_2011 objFiscalia_2011;
    private boolean mostrarActualizar;

    public Fiscalia_2011 getObjFiscalia_2011() {
        return objFiscalia_2011;
    }

    public void setObjFiscalia_2011(Fiscalia_2011 objFiscalia_2011) {
        this.objFiscalia_2011 = objFiscalia_2011;
    }

    public boolean isMostrarActualizar() {
        return mostrarActualizar;
    }

    public void setMostrarActualizar(boolean mostrarActualizar) {
        this.mostrarActualizar = mostrarActualizar;
    }

    public ArrayList<Fiscalia_2011> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Fiscalia_2011> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public Fiscalia_2011 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Fiscalia_2011 datoSel) {
        this.datoSel = datoSel;
    }

    public ControladorFiscalia2011_Datos() {
        this.reinit();
    }

    
     private void reinit() {
        this.lstDatos = new ArrayList<Fiscalia_2011>();
        this.objFiscalia_2011 = new Fiscalia_2011();
        this.datoSel = new Fiscalia_2011();

        this.cargarDatos();
    }

    
    public void cargarDatos() {
        try {

            this.lstDatos = FFiscalia_2011.ObtenerDatos();
            this.datoSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
