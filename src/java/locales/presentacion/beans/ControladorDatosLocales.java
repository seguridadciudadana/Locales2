/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locales.presentacion.beans;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import locales.logica.clases.Locales;
import locales.logica.funciones.FLocales;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorDatosLocales {

    /**
     * Creates a new instance of ControladorDatosLocales
     */
    private Locales objLocales;
    private Locales LocalesSel;
    private ArrayList<Locales> lstLocales;
    private boolean mostrarActualizar;

    public Locales getObjLocales() {
        return objLocales;
    }

    public void setObjLocales(Locales objLocales) {
        this.objLocales = objLocales;
    }

    public Locales getLocalesSel() {
        return LocalesSel;
    }

    public void setLocalesSel(Locales LocalesSel) {
        this.LocalesSel = LocalesSel;
    }

    public ArrayList<Locales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<Locales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public boolean isMostrarActualizar() {
        return mostrarActualizar;
    }

    public void setMostrarActualizar(boolean mostrarActualizar) {
        this.mostrarActualizar = mostrarActualizar;
    }
    
    
    public ControladorDatosLocales() {
        this.reinit();
    }
    
    private void reinit() {
        this.obtenerDatosLocales();
    }
    public void obtenerDatosLocales() {
        try {

            this.lstLocales = FLocales.ObtenerDatos();
            this.LocalesSel = lstLocales.get(0);
            System.out.println(lstLocales.get(0).getId());
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerDatosVif2011 dice: " + e.getMessage());
            System.out.println("public void obtenerDatosVif2011 dice: " + e.getMessage());
        }

    }
}
