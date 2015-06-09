/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.clases.Vif_2011;
import geoportal.logica.clases.Vif_2012;
import geoportal.logica.funciones.FVif_2010;
import geoportal.logica.funciones.FVif_2011;
import geoportal.logica.funciones.FVif_2012;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author Geovanny Cudco
 */
@ManagedBean
@RequestScoped
public class ControladorContrastesCircuitos {

    /**
     * Creates a new instance of ControladorContrastesCircuitos
     */
    private CartesianChartModel lineModel1;
    private ArrayList<Vif_2010> lstDatosControl10;
    private Vif_2010 datoSel10;
    private ArrayList<Vif_2011> lstDatosControl11;
    private Vif_2011 datoSel11;
    private ArrayList<Vif_2012> lstDatosControl12;
    private Vif_2012 datoSel12;
    private ArrayList<Vif_2010> lstDatosC10;
    private ArrayList<Vif_2010> lstDatosDadoC10;
    private ArrayList<Vif_2011> lstDatosC11;
    private ArrayList<Vif_2011> lstDatosDadoC11;
    private ArrayList<Vif_2012> lstDatosC12;
    private ArrayList<Vif_2012> lstDatosDadoC12;
    private ArrayList<Vif_2010> lstDatos10;
    private ArrayList<Vif_2010> lstDatos10_1;
    private ArrayList<Vif_2011> lstDatos11;
    private ArrayList<Vif_2011> lstDatos11_1;
    private ArrayList<Vif_2012> lstDatos12;
    private ArrayList<Vif_2012> lstDatos12_1;

    public CartesianChartModel getLineModel1() {
        return lineModel1;
    }

    public void setLineModel1(CartesianChartModel lineModel1) {
        this.lineModel1 = lineModel1;
    }

    public ArrayList<Vif_2010> getLstDatosControl10() {
        return lstDatosControl10;
    }

    public void setLstDatosControl10(ArrayList<Vif_2010> lstDatosControl10) {
        this.lstDatosControl10 = lstDatosControl10;
    }

    public Vif_2010 getDatoSel10() {
        return datoSel10;
    }

    public void setDatoSel10(Vif_2010 datoSel10) {
        this.datoSel10 = datoSel10;
    }

    public ArrayList<Vif_2011> getLstDatosControl11() {
        return lstDatosControl11;
    }

    public void setLstDatosControl11(ArrayList<Vif_2011> lstDatosControl11) {
        this.lstDatosControl11 = lstDatosControl11;
    }

    public Vif_2011 getDatoSel11() {
        return datoSel11;
    }

    public void setDatoSel11(Vif_2011 datoSel11) {
        this.datoSel11 = datoSel11;
    }

    public ArrayList<Vif_2012> getLstDatosControl12() {
        return lstDatosControl12;
    }

    public void setLstDatosControl12(ArrayList<Vif_2012> lstDatosControl12) {
        this.lstDatosControl12 = lstDatosControl12;
    }

    public Vif_2012 getDatoSel12() {
        return datoSel12;
    }

    public void setDatoSel12(Vif_2012 datoSel12) {
        this.datoSel12 = datoSel12;
    }

    public ArrayList<Vif_2010> getLstDatosC10() {
        return lstDatosC10;
    }

    public void setLstDatosC10(ArrayList<Vif_2010> lstDatosC10) {
        this.lstDatosC10 = lstDatosC10;
    }

    public ArrayList<Vif_2010> getLstDatosDadoC10() {
        return lstDatosDadoC10;
    }

    public void setLstDatosDadoC10(ArrayList<Vif_2010> lstDatosDadoC10) {
        this.lstDatosDadoC10 = lstDatosDadoC10;
    }

    public ArrayList<Vif_2011> getLstDatosC11() {
        return lstDatosC11;
    }

    public void setLstDatosC11(ArrayList<Vif_2011> lstDatosC11) {
        this.lstDatosC11 = lstDatosC11;
    }

    public ArrayList<Vif_2011> getLstDatosDadoC11() {
        return lstDatosDadoC11;
    }

    public void setLstDatosDadoC11(ArrayList<Vif_2011> lstDatosDadoC11) {
        this.lstDatosDadoC11 = lstDatosDadoC11;
    }

    public ArrayList<Vif_2012> getLstDatosC12() {
        return lstDatosC12;
    }

    public void setLstDatosC12(ArrayList<Vif_2012> lstDatosC12) {
        this.lstDatosC12 = lstDatosC12;
    }

    public ArrayList<Vif_2012> getLstDatosDadoC12() {
        return lstDatosDadoC12;
    }

    public void setLstDatosDadoC12(ArrayList<Vif_2012> lstDatosDadoC12) {
        this.lstDatosDadoC12 = lstDatosDadoC12;
    }

    public ArrayList<Vif_2010> getLstDatos10() {
        return lstDatos10;
    }

    public void setLstDatos10(ArrayList<Vif_2010> lstDatos10) {
        this.lstDatos10 = lstDatos10;
    }

    public ArrayList<Vif_2010> getLstDatos10_1() {
        return lstDatos10_1;
    }

    public void setLstDatos10_1(ArrayList<Vif_2010> lstDatos10_1) {
        this.lstDatos10_1 = lstDatos10_1;
    }

    public ArrayList<Vif_2011> getLstDatos11() {
        return lstDatos11;
    }

    public void setLstDatos11(ArrayList<Vif_2011> lstDatos11) {
        this.lstDatos11 = lstDatos11;
    }

    public ArrayList<Vif_2011> getLstDatos11_1() {
        return lstDatos11_1;
    }

    public void setLstDatos11_1(ArrayList<Vif_2011> lstDatos11_1) {
        this.lstDatos11_1 = lstDatos11_1;
    }

    public ArrayList<Vif_2012> getLstDatos12() {
        return lstDatos12;
    }

    public void setLstDatos12(ArrayList<Vif_2012> lstDatos12) {
        this.lstDatos12 = lstDatos12;
    }

    public ArrayList<Vif_2012> getLstDatos12_1() {
        return lstDatos12_1;
    }

    public void setLstDatos12_1(ArrayList<Vif_2012> lstDatos12_1) {
        this.lstDatos12_1 = lstDatos12_1;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        lineModel1 = initConstrastesCircuito();
    }

    public ControladorContrastesCircuitos() {
        this.reinit();
    }

    private void reinit() {

        this.datoSel10 = new Vif_2010();
        this.lstDatosControl10 = new ArrayList<Vif_2010>();
        this.lstDatosC10 = new ArrayList<Vif_2010>();
        this.lstDatosDadoC10 = new ArrayList<Vif_2010>();
        this.datoSel11 = new Vif_2011();
        this.lstDatosControl11 = new ArrayList<Vif_2011>();
        this.lstDatosC11 = new ArrayList<Vif_2011>();
        this.lstDatosDadoC11 = new ArrayList<Vif_2011>();
        this.datoSel12 = new Vif_2012();
        this.lstDatosControl12 = new ArrayList<Vif_2012>();
        this.lstDatosC12 = new ArrayList<Vif_2012>();
        this.lstDatosDadoC12 = new ArrayList<Vif_2012>();

        this.init();
        this.cargarDatos2010();
        this.cargarDatos2011();
        this.cargarDatos2012();
    }

    private CartesianChartModel initConstrastesCircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosC10 = FVif_2010.ObtenerDatosCircuito();
            ChartSeries Circuito10 = new ChartSeries();
            Circuito10.setLabel("2010");
            for (Vif_2010 lstDatosC1 : lstDatosC10) {
                lstDatosDadoC10 = FVif_2010.ObtenerDatosDadoCircuito(lstDatosC1.getCircuito());
                Circuito10.set(lstDatosC1.getCircuito(), lstDatosDadoC10.size());
            }

            lstDatosC11 = FVif_2011.ObtenerDatosCircuito();
            ChartSeries Circuito11 = new ChartSeries();
            Circuito11.setLabel("2011");
            for (Vif_2011 lstDatosC11 : lstDatosC11) {
                lstDatosDadoC11 = FVif_2011.ObtenerDatosDadoCircuito(lstDatosC11.getCircuito());
                Circuito11.set(lstDatosC11.getCircuito(), lstDatosDadoC11.size());
            }

            lstDatosC12 = FVif_2012.ObtenerDatosCircuito();
            ChartSeries Circuito12 = new ChartSeries();
            Circuito12.setLabel("2012");
            for (Vif_2012 lstDatosC12 : lstDatosC12) {
                lstDatosDadoC12 = FVif_2012.ObtenerDatosDadoCircuito(lstDatosC12.getPcircuito());
                Circuito12.set(lstDatosC12.getPcircuito(), lstDatosDadoC12.size());
            }

            model.addSeries(Circuito10);
            model.addSeries(Circuito11);
            model.addSeries(Circuito12);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    public void cargarDatos2010() {
        try {

            this.lstDatosControl10 = FVif_2010.ObtenerDatos();
            this.datoSel10 = lstDatosControl10.get(0);
            System.out.println(lstDatosControl10.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void cargarDatos2011() {
        try {

            this.lstDatosControl11 = FVif_2011.ObtenerDatos();
            this.datoSel11 = lstDatosControl11.get(0);
            System.out.println(lstDatosControl11.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void cargarDatos2012() {
        try {

            this.lstDatosControl12 = FVif_2012.ObtenerDatos();
            this.datoSel12 = lstDatosControl12.get(0);
            System.out.println(lstDatosControl12.get(0).getPid());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
