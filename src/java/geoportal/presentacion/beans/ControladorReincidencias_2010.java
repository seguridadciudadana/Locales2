/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Reincidencias2010;
import geoportal.logica.funciones.FReincidencias2010;
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
    private ArrayList<Reincidencias2010> lstDatos;
    private ArrayList<Reincidencias2010> lstDatosDadoReincidencia;
    private Reincidencias2010 datoSel;

    public ArrayList<Reincidencias2010> getLstDatosDadoReincidencia() {
        return lstDatosDadoReincidencia;
    }

    public void setLstDatosDadoReincidencia(ArrayList<Reincidencias2010> lstDatosDadoReincidencia) {
        this.lstDatosDadoReincidencia = lstDatosDadoReincidencia;
    }

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

    public ArrayList<Reincidencias2010> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Reincidencias2010> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public Reincidencias2010 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Reincidencias2010 datoSel) {
        this.datoSel = datoSel;
    }

    public ControladorReincidencias_2010() {
        this.reinit();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {
        //this.objDatos = new Vif_2010();
        this.datoSel = new Reincidencias2010();
        this.lstDatos = new ArrayList<Reincidencias2010>();       

        this.init();
        this.cargarDatos();

    }

    public void graficar() {
        lineReincidencias = initReincidencias2010();
    }

    private CartesianChartModel initReincidencias2010() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos = FReincidencias2010.ObtenerDatos();
            ChartSeries Reincidencias = new ChartSeries();
            Reincidencias.setLabel("Reincidencias");
            for (int x = 0; x < lstDatos.size(); x++) {
                lstDatosDadoReincidencia = FReincidencias2010.ObtenerDatosDadoReincidencias(lstDatos.get(x).getReincidencias());
                Reincidencias.set(lstDatos.get(x).getReincidencias(), lstDatosDadoReincidencia.size());
            }
            model.addSeries(Reincidencias);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    public void cargarDatos() {
        try {

            this.lstDatos = FReincidencias2010.ObtenerDatos();
            this.datoSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getVictima());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
