/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Reincidencias2010;
import geoportal.logica.clases.Reincidencias2011;
import geoportal.logica.clases.Reincidencias2012;
import geoportal.logica.funciones.FReincidencias2010;
import geoportal.logica.funciones.FReincidencias2011;
import geoportal.logica.funciones.FReincidencias2012;
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
    private CartesianChartModel lineReincidencias_2011;
    private PieChartModel pieReincidencias;
    private ArrayList<Reincidencias2010> lstDatos;
    private ArrayList<Reincidencias2011> lstDatos2011;
    private ArrayList<Reincidencias2010> lstDatosDadoReincidencia;
    private ArrayList<Reincidencias2011> lstDatosDadoReincidencia_2011;
    private Reincidencias2010 datoSel;
    private Reincidencias2011 datoSel_20111;
    private Reincidencias2012 datoSel_2012;
    private ArrayList<Reincidencias2012> lstDatos12;
    private CartesianChartModel lineReincidencias_2012;
    private ArrayList<Reincidencias2012> lstDatosDadoReincidencia_2012;
    private ArrayList<Reincidencias2012> lstDatos2012;

    public ArrayList<Reincidencias2012> getLstDatos2012() {
        return lstDatos2012;
    }

    public void setLstDatos2012(ArrayList<Reincidencias2012> lstDatos2012) {
        this.lstDatos2012 = lstDatos2012;
    }

    public ArrayList<Reincidencias2012> getLstDatosDadoReincidencia_2012() {
        return lstDatosDadoReincidencia_2012;
    }

    public void setLstDatosDadoReincidencia_2012(ArrayList<Reincidencias2012> lstDatosDadoReincidencia_2012) {
        this.lstDatosDadoReincidencia_2012 = lstDatosDadoReincidencia_2012;
    }

    public Reincidencias2012 getDatoSel_2012() {
        return datoSel_2012;
    }

    public void setDatoSel_2012(Reincidencias2012 datoSel_2012) {
        this.datoSel_2012 = datoSel_2012;
    }

    public ArrayList<Reincidencias2012> getLstDatos12() {
        return lstDatos12;
    }

    public void setLstDatos12(ArrayList<Reincidencias2012> lstDatos12) {
        this.lstDatos12 = lstDatos12;
    }

    public CartesianChartModel getLineReincidencias_2012() {
        return lineReincidencias_2012;
    }

    public void setLineReincidencias_2012(CartesianChartModel lineReincidencias_2012) {
        this.lineReincidencias_2012 = lineReincidencias_2012;
    }

    public ArrayList<Reincidencias2010> getLstDatosDadoReincidencia() {
        return lstDatosDadoReincidencia;
    }

    public CartesianChartModel getLineReincidencias_2011() {
        return lineReincidencias_2011;
    }

    public void setLineReincidencias_2011(CartesianChartModel lineReincidencias_2011) {
        this.lineReincidencias_2011 = lineReincidencias_2011;
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
        this.datoSel = new Reincidencias2010();
        this.lstDatos = new ArrayList<Reincidencias2010>();
        this.init();
        this.cargarDatos();

    }

    public void graficar() {
        lineReincidencias = initReincidencias2010();
        lineReincidencias_2011 = initReincidencias2011();
        lineReincidencias_2012 = initReincidencias2012();
    }

    private CartesianChartModel initReincidencias2010() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos = FReincidencias2010.ObtenerDatos();
            ChartSeries Reincidencias = new ChartSeries();
            
            Reincidencias.setLabel("Reincidencias");
            for (Reincidencias2010 lstDato : lstDatos) {
                lstDatosDadoReincidencia = FReincidencias2010.ObtenerDatosDadoReincidencias(lstDato.getReincidencias());
                Reincidencias.set(lstDato.getReincidencias(), lstDatosDadoReincidencia.size());
            }
            model.addSeries(Reincidencias);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initReincidencias2011() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstDatos2011 = FReincidencias2011.ObtenerDatosReincidencias();
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

    private CartesianChartModel initReincidencias2012() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos12 = FReincidencias2012.ObtenerDatos();
            ChartSeries Reincidencias12 = new ChartSeries();
            Reincidencias12.setLabel("Reincidencias");
            for (int i = 0; i < lstDatos12.size(); i++) {
                lstDatosDadoReincidencia_2012 = FReincidencias2012.ObtenerDatosDadoReincidencias(lstDatos12.get(i).getReincidencias());
                Reincidencias12.set(lstDatos12.get(i).getReincidencias(), lstDatosDadoReincidencia_2012.size());
            }
            model.addSeries(Reincidencias12);
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

    public void cargarDatos2012() {
        try {

            this.lstDatos2012 = FReincidencias2012.ObtenerDatos();
            this.datoSel_2012 = lstDatos2012.get(0);
            System.out.println(lstDatos2012.get(0).getVictima());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
