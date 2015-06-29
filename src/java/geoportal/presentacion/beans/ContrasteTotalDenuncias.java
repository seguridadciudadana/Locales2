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
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ContrasteTotalDenuncias {

    /**
     * Creates a new instance of ContrasteTotalDenuncias
     */
    private ArrayList<Vif_2010> lstDatos2010;
    private ArrayList<Vif_2011> lstDatos2011;
    private ArrayList<Vif_2012> lstDatos2012;
    private CartesianChartModel lineTotalDenuncias;
    private CartesianChartModel lineProyeccion;
    private Vif_2010 datoSel10;
    private Vif_2011 datoSel11;
    private Vif_2012 datoSel12;
    private PieChartModel pieTotalDenuncias;

    public PieChartModel getPieTotalDenuncias() {
        return pieTotalDenuncias;
    }

    public void setPieTotalDenuncias(PieChartModel pieTotalDenuncias) {
        this.pieTotalDenuncias = pieTotalDenuncias;
    }

    public Vif_2010 getDatoSel10() {
        return datoSel10;
    }

    public void setDatoSel10(Vif_2010 datoSel10) {
        this.datoSel10 = datoSel10;
    }

    public Vif_2011 getDatoSel11() {
        return datoSel11;
    }

    public void setDatoSel11(Vif_2011 datoSel11) {
        this.datoSel11 = datoSel11;
    }

    public Vif_2012 getDatoSel12() {
        return datoSel12;
    }

    public void setDatoSel12(Vif_2012 datoSel12) {
        this.datoSel12 = datoSel12;
    }

    public CartesianChartModel getLineTotalDenuncias() {
        return lineTotalDenuncias;
    }

    public void setLineTotalDenuncias(CartesianChartModel lineTotalDenuncias) {
        this.lineTotalDenuncias = lineTotalDenuncias;
    }

    public CartesianChartModel getLineProyeccion() {
        return lineProyeccion;
    }

    public void setLineProyeccion(CartesianChartModel lineProyeccion) {
        this.lineProyeccion = lineProyeccion;
    }

    public ArrayList<Vif_2010> getLstDatos2010() {
        return lstDatos2010;
    }

    public void setLstDatos2010(ArrayList<Vif_2010> lstDatos2010) {
        this.lstDatos2010 = lstDatos2010;
    }

    public ArrayList<Vif_2011> getLstDatos2011() {
        return lstDatos2011;
    }

    public void setLstDatos2011(ArrayList<Vif_2011> lstDatos2011) {
        this.lstDatos2011 = lstDatos2011;
    }

    public ArrayList<Vif_2012> getLstDatos2012() {
        return lstDatos2012;
    }

    public void setLstDatos2012(ArrayList<Vif_2012> lstDatos2012) {
        this.lstDatos2012 = lstDatos2012;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        lineTotalDenuncias = lineTotalDenuncias();
        pieTotalDenuncias=pieTotalDenuncias();
    }

    public ContrasteTotalDenuncias() {
        this.reinit();
    }

    private void reinit() {

        this.datoSel10 = new Vif_2010();
        this.lstDatos2010 = new ArrayList<Vif_2010>();
        this.lstDatos2010 = new ArrayList<Vif_2010>();
        this.datoSel11 = new Vif_2011();
        this.lstDatos2011 = new ArrayList<Vif_2011>();
        this.datoSel12 = new Vif_2012();
        this.lstDatos2012 = new ArrayList<Vif_2012>();

        this.cargarDatos2010();
        this.cargarDatos2011();
        this.cargarDatos2012();
        this.init();
    }

    private CartesianChartModel lineTotalDenuncias() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos2010 = FVif_2010.ObtenerDatos();
            lstDatos2011 = FVif_2011.ObtenerDatos();
            lstDatos2012 = FVif_2012.ObtenerDatos();
            ChartSeries total = new ChartSeries();
            total.setLabel("Total de Denuncias");
            total.set("2010", lstDatos2010.size());
            total.set("2011", lstDatos2011.size());
            total.set("2012", lstDatos2012.size());

            model.addSeries(total);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private PieChartModel pieTotalDenuncias() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            lstDatos2010 = FVif_2010.ObtenerDatos();
            lstDatos2011 = FVif_2011.ObtenerDatos();
            lstDatos2012 = FVif_2012.ObtenerDatos();

            pieModel.set("2010", lstDatos2010.size());
            pieModel.set("2011", lstDatos2011.size());
            pieModel.set("2012", lstDatos2012.size());
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    public void cargarDatos2010() {
        try {

            this.lstDatos2010 = FVif_2010.ObtenerDatos();
            this.datoSel10 = lstDatos2010.get(0);
            System.out.println(lstDatos2010.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void cargarDatos2011() {
        try {

            this.lstDatos2011 = FVif_2011.ObtenerDatos();
            this.datoSel11 = lstDatos2011.get(0);
            System.out.println(lstDatos2011.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void cargarDatos2012() {
        try {

            this.lstDatos2012 = FVif_2012.ObtenerDatos();
            this.datoSel12 = lstDatos2012.get(0);
            System.out.println(lstDatos2012.get(0).getPid());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
