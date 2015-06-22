/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denunciasfiscalia.presentacion.beans;

import denunciasfiscalia.logica.clases.Fiscalia_2012;
import denunciasfiscalia.logica.funciones.FFiscalia_2012;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import recursos.Util;

/**
 *
 * @author Pc05
 */
@ManagedBean
@RequestScoped
public class ControladorFiscalia2012_Datos {

    /**
     * Creates a new instance of ControladorFiscalia2012_Datos
     */
    private ArrayList<Fiscalia_2012> lstDatos;
    private Fiscalia_2012 datoSel;
    private Fiscalia_2012 objFiscalia_2012;
    private boolean mostrarActualizar;

    public ArrayList<Fiscalia_2012> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Fiscalia_2012> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public Fiscalia_2012 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Fiscalia_2012 datoSel) {
        this.datoSel = datoSel;
    }

    public Fiscalia_2012 getObjFiscalia_2012() {
        return objFiscalia_2012;
    }

    public void setObjFiscalia_2012(Fiscalia_2012 objFiscalia_2012) {
        this.objFiscalia_2012 = objFiscalia_2012;
    }

    public boolean isMostrarActualizar() {
        return mostrarActualizar;
    }

    public void setMostrarActualizar(boolean mostrarActualizar) {
        this.mostrarActualizar = mostrarActualizar;
    }

    public ControladorFiscalia2012_Datos() {
        this.reinit();
    }

    private void reinit() {
        this.lstDatos = new ArrayList<Fiscalia_2012>();
        this.objFiscalia_2012 = new Fiscalia_2012();
        this.datoSel = new Fiscalia_2012();

        this.cargarDatos();
    }

    public void cargarDatos() {
        try {

            this.lstDatos = FFiscalia_2012.ObtenerDatos();
            this.datoSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }
}
