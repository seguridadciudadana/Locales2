/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa.presentacion.beans;

import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import recursos.Util;
import spa.logica.clases.Global;
import spa.logica.funciones.FGlobal;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class DatosSpaCtrl {

    /**
     * Creates a new instance of DatosSpaCtrl
     */
    private ArrayList<Global> lstDatos;
    private Global objGlobal;
    private Global globalSel;
    private int anioSel;
    private Date fechaAtencion;

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public Global getObjGlobal() {
        return objGlobal;
    }

    public void setObjGlobal(Global objGlobal) {
        this.objGlobal = objGlobal;
    }

    public Global getGlobalSel() {
        return globalSel;
    }

    public void setGlobalSel(Global globalSel) {
        this.globalSel = globalSel;
    }

    public ArrayList<Global> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Global> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public int getAnioSel() {
        return anioSel;
    }

    public void setAnioSel(int anioSel) {
        this.anioSel = anioSel;
    }

    public DatosSpaCtrl() {
        this.reinit();
    }

    public void reinit() {
        this.lstDatos = new ArrayList<Global>();
        this.cargarDatos();
    }

    public void cargarDatos() {
        try {

            this.lstDatos = FGlobal.ObtenerDatos();
            this.globalSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getApellidos_victima());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void obtenerDatosDadoAnio() {
        try {

            this.lstDatos = FGlobal.ObtenerDatosDadoAnio(anioSel);
            this.globalSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getApellidos_victima());

        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerDatosDadoAnio() dice: " + e.getMessage());
            System.out.println("public void obtenerDatosDadoAnio() dice: " + e.getMessage());
        }
    }

}
