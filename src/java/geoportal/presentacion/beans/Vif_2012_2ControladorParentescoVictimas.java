/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.funciones.FVif_2012_2;
import geoportal.logica.clases.Vif_2012_2;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Vif_2012_2ControladorParentescoVictimas {

    /**
     * Creates a new instance of Vif_2012_2ControladorParentescoVictimas
     */
    private CartesianChartModel parentescoGrafico;
    private ArrayList<Vif_2012_2> lstDatosControl;
    private Vif_2012_2 datoSel;
    private ArrayList<Vif_2012_2> lstDatosP;
    private ArrayList<Vif_2012_2> lstDatosDadoP;

    public CartesianChartModel getParentescoGrafico() {
        return parentescoGrafico;
    }

    public void setParentescoGrafico(CartesianChartModel parentescoGrafico) {
        this.parentescoGrafico = parentescoGrafico;
    }

    
    public ArrayList<Vif_2012_2> getLstDatosControl() {
        return lstDatosControl;
    }

    public void setLstDatosControl(ArrayList<Vif_2012_2> lstDatosControl) {
        this.lstDatosControl = lstDatosControl;
    }

    public Vif_2012_2 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2012_2 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2012_2> getLstDatosP() {
        return lstDatosP;
    }

    public void setLstDatosP(ArrayList<Vif_2012_2> lstDatosP) {
        this.lstDatosP = lstDatosP;
    }

    public ArrayList<Vif_2012_2> getLstDatosDadoP() {
        return lstDatosDadoP;
    }

    public void setLstDatosDadoP(ArrayList<Vif_2012_2> lstDatosDadoP) {
        this.lstDatosDadoP = lstDatosDadoP;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public Vif_2012_2ControladorParentescoVictimas() {
        this.reinit();
    }
private void reinit() {
        
        this.lstDatosControl=new ArrayList<Vif_2012_2>();
        this.lstDatosP = new ArrayList<Vif_2012_2>();
        this.lstDatosDadoP = new ArrayList<Vif_2012_2>();
        this.datoSel = new Vif_2012_2();

        this.init();
        this.cargarDatos();

    }
    public void graficar() {
        parentescoGrafico = initCategoryParentesco();
    }

    private CartesianChartModel initCategoryParentesco() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosP = FVif_2012_2.ObtenerDatosParentesco();
            ChartSeries Parentesco = new ChartSeries();
            Parentesco.setLabel("Parentesco Victima - Agresor");
            for (Vif_2012_2 lstDatosP1 : lstDatosP) {
                lstDatosDadoP = FVif_2012_2.ObtenerDatosDadoParentesco(lstDatosP1.getPparentesco_victima_agresor());
                //TipoViolencia.set(lstDatosV.get(x).getPtipo_de_violencia(), lstDatosDadoV.size());
                Parentesco.set(lstDatosP1.getPparentesco_victima_agresor(), lstDatosDadoP.size());
            }
            model.addSeries(Parentesco);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    
   /* private CartesianChartModel initCategoryParentesco() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            
        } catch (Exception e) {
        }
        return model;
    }*/
            
     public void cargarDatos() {
        try {
            this.lstDatosControl = FVif_2012_2.ObtenerDatos();
            this.datoSel = lstDatosControl.get(0);
            System.out.println(lstDatosControl.get(0).getPid());
        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }
}
