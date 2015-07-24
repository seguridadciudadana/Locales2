/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2011;
import geoportal.logica.funciones.FVif_2011;
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
public class Vif_2011ControladorParentesco {

    /**
     * Creates a new instance of Vif_2010Parentesco
     */
    private CartesianChartModel parentescoGrafico;    
    private ArrayList<Vif_2011> lstDatosParentesco;        
    private ArrayList<Vif_2011> lstDatosDadoParentesco;

    public CartesianChartModel getParentescoGrafico() {
        return parentescoGrafico;
    }

    public void setParentescoGrafico(CartesianChartModel parentescoGrafico) {
        this.parentescoGrafico = parentescoGrafico;
    }

    public ArrayList<Vif_2011> getLstDatosParentesco() {
        return lstDatosParentesco;
    }

    public void setLstDatosParentesco(ArrayList<Vif_2011> lstDatosParentesco) {
        this.lstDatosParentesco = lstDatosParentesco;
    }

    public ArrayList<Vif_2011> getLstDatosDadoParentesco() {
        return lstDatosDadoParentesco;
    }

    public void setLstDatosDadoParentesco(ArrayList<Vif_2011> lstDatosDadoParentesco) {
        this.lstDatosDadoParentesco = lstDatosDadoParentesco;
    }
    
    @PostConstruct
    public void init() {
        graficar();
    }
    
    public void graficar() {
        parentescoGrafico = initCategoryParentesco();        
    }

    private void reinit() {

        this.lstDatosParentesco = new ArrayList<Vif_2011>();
        this.lstDatosDadoParentesco=new ArrayList<Vif_2011>();
        
        this.init();        

    }
    private CartesianChartModel initCategoryParentesco() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosParentesco=FVif_2011.ObtenerDatosParentesco();
            ChartSeries Parentesco = new ChartSeries();
            Parentesco.setLabel("Parentesco Victima - Agresor");
            for (int i=0;i<lstDatosParentesco.size();i++){
                lstDatosDadoParentesco=FVif_2011.ObtenerDatosDadoParentesco(lstDatosParentesco.get(i).getParentesco_victima_agresor());
                Parentesco.set(lstDatosParentesco.get(i).getParentesco_victima_agresor(), lstDatosDadoParentesco.size());
            }
             model.addSeries(Parentesco);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    } 
        
    public Vif_2011ControladorParentesco() {
        this.reinit();
    }
    
    
    
}
