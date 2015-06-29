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
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ResumenTipoViolenciaSegunVolumen {

    /**
     * Creates a new instance of ResumenTipoViolenciaSegunVolumen
     */
    private ArrayList<Vif_2010> lstDatos2010;
    private ArrayList<Vif_2011> lstDatos2011;
    private ArrayList<Vif_2012> lstDatos2012;
    //listas del tipo violencia general
    private ArrayList<Vif_2010> lstViolencia2010;
    private ArrayList<Vif_2011> lstViolencia2011;
    private ArrayList<Vif_2012> lstViolencia2012;
    //listas dado el tipo violencia
    private ArrayList<Vif_2010> lstDadoViolencia2010;
    private ArrayList<Vif_2011> lstDadoViolencia2011;
    private ArrayList<Vif_2012> lstDadoViolencia2012;
    //graficos
    private CartesianChartModel lineResumenTipoViolencia;
    private CartesianChartModel lineTipoViolencia2010;
    private CartesianChartModel lineTipoViolencia2011;
    private CartesianChartModel lineTipoViolencia2012;
    // dato sel    
    private Vif_2010 datoSel10;
    private Vif_2011 datoSel11;
    private Vif_2012 datoSel12;

    public CartesianChartModel getLineTipoViolencia2010() {
        return lineTipoViolencia2010;
    }

    public void setLineTipoViolencia2010(CartesianChartModel lineTipoViolencia2010) {
        this.lineTipoViolencia2010 = lineTipoViolencia2010;
    }

    public CartesianChartModel getLineTipoViolencia2011() {
        return lineTipoViolencia2011;
    }

    public void setLineTipoViolencia2011(CartesianChartModel lineTipoViolencia2011) {
        this.lineTipoViolencia2011 = lineTipoViolencia2011;
    }

    public CartesianChartModel getLineTipoViolencia2012() {
        return lineTipoViolencia2012;
    }

    public void setLineTipoViolencia2012(CartesianChartModel lineTipoViolencia2012) {
        this.lineTipoViolencia2012 = lineTipoViolencia2012;
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

    public ArrayList<Vif_2010> getLstViolencia2010() {
        return lstViolencia2010;
    }

    public void setLstViolencia2010(ArrayList<Vif_2010> lstViolencia2010) {
        this.lstViolencia2010 = lstViolencia2010;
    }

    public ArrayList<Vif_2011> getLstViolencia2011() {
        return lstViolencia2011;
    }

    public void setLstViolencia2011(ArrayList<Vif_2011> lstViolencia2011) {
        this.lstViolencia2011 = lstViolencia2011;
    }

    public ArrayList<Vif_2012> getLstViolencia2012() {
        return lstViolencia2012;
    }

    public void setLstViolencia2012(ArrayList<Vif_2012> lstViolencia2012) {
        this.lstViolencia2012 = lstViolencia2012;
    }

    public ArrayList<Vif_2010> getLstDadoViolencia2010() {
        return lstDadoViolencia2010;
    }

    public void setLstDadoViolencia2010(ArrayList<Vif_2010> lstDadoViolencia2010) {
        this.lstDadoViolencia2010 = lstDadoViolencia2010;
    }

    public ArrayList<Vif_2011> getLstDadoViolencia2011() {
        return lstDadoViolencia2011;
    }

    public void setLstDadoViolencia2011(ArrayList<Vif_2011> lstDadoViolencia2011) {
        this.lstDadoViolencia2011 = lstDadoViolencia2011;
    }

    public ArrayList<Vif_2012> getLstDadoViolencia2012() {
        return lstDadoViolencia2012;
    }

    public void setLstDadoViolencia2012(ArrayList<Vif_2012> lstDadoViolencia2012) {
        this.lstDadoViolencia2012 = lstDadoViolencia2012;
    }

    public CartesianChartModel getLineResumenTipoViolencia() {
        return lineResumenTipoViolencia;
    }

    public void setLineResumenTipoViolencia(CartesianChartModel lineResumenTipoViolencia) {
        this.lineResumenTipoViolencia = lineResumenTipoViolencia;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        lineTipoViolencia2010 = lineTipoViolencia2010();
        lineTipoViolencia2011 = lineTipoViolencia2011();
    }

    public ResumenTipoViolenciaSegunVolumen() {
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

    private CartesianChartModel lineTipoViolencia2010() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos2010 = FVif_2010.ObtenerDatos();
            lstViolencia2010 = FVif_2010.ObtenerDatosTipoViolencia();
            ChartSeries TipoViolencia2010 = new ChartSeries();
            TipoViolencia2010.setLabel("Tipo de Violencia");
            for (int x = 0; x < lstViolencia2010.size(); x++) {
                lstDadoViolencia2010 = FVif_2010.ObtenerDatosDadoTipoViolencia(lstViolencia2010.get(x).getTipo_de_vi());
                TipoViolencia2010.set(lstViolencia2010.get(x).getTipo_de_vi(), ((lstViolencia2010.size() / lstDatos2010.size())*100));
            }

            model.addSeries(TipoViolencia2010);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel lineTipoViolencia2011() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstDatos2011 = FVif_2011.ObtenerDatos();
            lstViolencia2011 = FVif_2011.ObtenerDatosTipoViolencia();
            ChartSeries TipoViolencia2011 = new ChartSeries();
            TipoViolencia2011.setLabel("Tipo de Violencia");
            for (int i = 0; i < lstViolencia2011.size(); i++) {
                lstDadoViolencia2011 = FVif_2011.ObtenerDatosDadoTipoViolencia(lstViolencia2011.get(i).getTipo_de_violencia());
                TipoViolencia2011.set(lstViolencia2011.get(i).getTipo_de_violencia(), (lstViolencia2011.size()*100)/lstDatos2011.size());
            }
            model.addSeries(TipoViolencia2011);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

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
