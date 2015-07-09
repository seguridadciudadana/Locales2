/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Reincidencias2010;
import geoportal.logica.clases.Reincidencias2011;
import geoportal.logica.funciones.FReincidencias2011;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class ControladorReiincidencias2011 {

    private CartesianChartModel lineReincidencias_2011;
    private PieChartModel pieReincidencias;
    private ArrayList<Reincidencias2011> lstDatos2011;
    private ArrayList<Reincidencias2011> lstDatosDadoReincidencia_2011;
    private Reincidencias2011 datoSel_20111;

    public CartesianChartModel getLineReincidencias_2011() {
        return lineReincidencias_2011;
    }

    public void setLineReincidencias_2011(CartesianChartModel lineReincidencias_2011) {
        this.lineReincidencias_2011 = lineReincidencias_2011;
    }

    public PieChartModel getPieReincidencias() {
        return pieReincidencias;
    }

    public void setPieReincidencias(PieChartModel pieReincidencias) {
        this.pieReincidencias = pieReincidencias;
    }

    public ArrayList<Reincidencias2011> getLstDatos2011() {
        return lstDatos2011;
    }

    public void setLstDatos2011(ArrayList<Reincidencias2011> lstDatos2011) {
        this.lstDatos2011 = lstDatos2011;
    }

    public ArrayList<Reincidencias2011> getLstDatosDadoReincidencia_2011() {
        return lstDatosDadoReincidencia_2011;
    }

    public void setLstDatosDadoReincidencia_2011(ArrayList<Reincidencias2011> lstDatosDadoReincidencia_2011) {
        this.lstDatosDadoReincidencia_2011 = lstDatosDadoReincidencia_2011;
    }

    public Reincidencias2011 getDatoSel_20111() {
        return datoSel_20111;
    }

    public void setDatoSel_20111(Reincidencias2011 datoSel_20111) {
        this.datoSel_20111 = datoSel_20111;
    }

    public ControladorReiincidencias2011() {
        reinit();
    }
    
    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {
        this.datoSel_20111 = new Reincidencias2011();
        this.lstDatos2011 = new ArrayList<Reincidencias2011>();
        this.lstDatosDadoReincidencia_2011 = new ArrayList<Reincidencias2011>();
        this.init();
        this.cargarDatos2011();

    }

    public void graficar() {
        
        lineReincidencias_2011 = initReincidencias2011();
        
    }
    
    private CartesianChartModel initReincidencias2011() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            //lstDatos2011 = FReincidencias2011.ObtenerDatosReincidencias();
            ChartSeries Reincidencias2011 = new ChartSeries();
            Reincidencias2011.setLabel("Reincidencias");
            for (Reincidencias2011 lstDatos20111 : lstDatos2011) {
                lstDatosDadoReincidencia_2011 = FReincidencias2011.ObtenerDatosDadoReincidencias(lstDatos20111.getReincidencias());
                Reincidencias2011.set(lstDatos20111.getReincidencias(), lstDatosDadoReincidencia_2011.size());
            }
            model1.addSeries(Reincidencias2011);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }
    
    public void cargarDatos2011() {
        try {

            this.lstDatos2011 = FReincidencias2011.ObtenerDatosReincidencias();
            this.datoSel_20111 = lstDatos2011.get(0);
            System.out.println(lstDatos2011.get(0).getVictima());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
