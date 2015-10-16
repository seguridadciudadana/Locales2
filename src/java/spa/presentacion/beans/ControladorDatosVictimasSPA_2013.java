/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;
import spa.logica.clases.Global;
import spa.logica.funciones.FGlobal;

/**
 *
 * @author Cristhian Moreno
 */

@ManagedBean
@RequestScoped
public class ControladorDatosVictimasSPA_2013 {
    
    private ArrayList<Global> lstDatos;
 
    private Global datoSel;
    
    private Global objSPA2013;
    private int anioSel;

    public int getAnioSel() {
        return anioSel;
    }

    public void setAnioSel(int anioSel) {
        this.anioSel = anioSel;
    }
    

    public Global getObjSPA2013() {
        return objSPA2013;
    }

    public void setObjSPA2013(Global objSPA2013) {
        this.objSPA2013 = objSPA2013;
    }

    public ArrayList<Global> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Global> lstDatos) {
        this.lstDatos = lstDatos;
    }


    public Global getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Global datoSel) {
        this.datoSel = datoSel;
    }

  
    @PostConstruct
    public void init() {
      this.lstDatos = new ArrayList<Global>(anioSel);
      this.cargarDatos();
    }

    

    private void reinit() {
        
        this.init();
    }
    
    public ControladorDatosVictimasSPA_2013 () {
      this.reinit();
    }
    
    
     public void cargarDatos() {
        try {
            
            this.lstDatos = FGlobal.ObtenerDatosDadoAnio(anioSel);
            System.out.println(lstDatos.get(0).getCodigo());
        } catch (Exception e) {
            Util.addErrorMessage("public void cargarDatos dice: " + e.getMessage());
            System.out.println("public void cargarDatos dice: " + e.getMessage());
        }

    }

}
