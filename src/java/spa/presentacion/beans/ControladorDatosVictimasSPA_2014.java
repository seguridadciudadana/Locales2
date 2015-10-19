/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa.presentacion.beans;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import recursos.Util;
import spa.logica.clases.Global;
import spa.logica.funciones.FGlobal;

/**
 *
 * @author Cristhian Moreno
 */
@ManagedBean
@RequestScoped
public class ControladorDatosVictimasSPA_2014 {

    private ArrayList<Global> lstDatos;
    private int anioSel;

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

    private void reinit() {
        this.lstDatos = new ArrayList<Global>();
        this.cargarDatos();
    }

    public ControladorDatosVictimasSPA_2014() {
        this.reinit();
    }

    public void cargarDatos() {
        try {
            this.lstDatos = FGlobal.ObtenerDatos();
            System.out.println(lstDatos.get(0).getCodigo());
        } catch (Exception e) {
            Util.addErrorMessage("public void cargarDatos dice: " + e.getMessage());
            System.out.println("public void cargarDatos dice: " + e.getMessage());
        }
    }

    public void cargarDatosDadoAnio() {
        try {
            this.lstDatos = FGlobal.ObtenerDatosDadoAnio(anioSel);
            System.out.println(lstDatos.get(0).getCodigo());
        } catch (Exception e) {
            Util.addErrorMessage("public void cargarDatosDadoAnio() dice: " + e.getMessage());
            System.out.println("public void cargarDatosDadoAnio() dice: " + e.getMessage());
        }

    }

}
