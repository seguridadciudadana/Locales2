/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorReincidencias_2010 {

    /**
     * Creates a new instance of ControladorReincidencias_2010
     */
    private CartesianChartModel lineReincidencias;
    private PieChartModel pieReincidencias;
    private ArrayList<Vif_2010> lstDatos;
    private Vif_2010 datoSel;

    public CartesianChartModel getLineReincidencias() {
        return lineReincidencias;
    }

    public void setLineReincidencias(CartesianChartModel lineReincidencias) {
        this.lineReincidencias = lineReincidencias;
    }

    public PieChartModel getPieReincidencias() {
        return pieReincidencias;
    }

    public void setPieReincidencias(PieChartModel pieReincidencias) {
        this.pieReincidencias = pieReincidencias;
    }

    public ArrayList<Vif_2010> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Vif_2010> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public Vif_2010 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2010 datoSel) {
        this.datoSel = datoSel;
    }

    public ControladorReincidencias_2010() {
    }


    
}
