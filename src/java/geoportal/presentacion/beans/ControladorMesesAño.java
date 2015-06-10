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
public class ControladorMesesAño {

    /**
     * Creates a new instance of ControladorMesesAño
     */
    private ArrayList<Vif_2010> lstDatosEnero2010;
    private ArrayList<Vif_2010> lstDatosFebrero2010;
    private ArrayList<Vif_2010> lstDatosMarzo2010;
    private ArrayList<Vif_2010> lstDatosAbril2010;
    private ArrayList<Vif_2010> lstDatosMayo2010;
    private ArrayList<Vif_2010> lstDatosJunio2010;
    private ArrayList<Vif_2010> lstDatosJulio2010;
    private ArrayList<Vif_2010> lstDatosAgosto2010;
    private ArrayList<Vif_2010> lstDatosSeptiembre2010;
    private ArrayList<Vif_2010> lstDatosOctubre2010;
    private ArrayList<Vif_2010> lstDatosNoviembre2010;
    private ArrayList<Vif_2010> lstDatosDiciembre2010;
    private ArrayList<Vif_2011> lstDatosEnero2011;
    private ArrayList<Vif_2011> lstDatosFebrero2011;
    private ArrayList<Vif_2011> lstDatosMarzo2011;
    private ArrayList<Vif_2011> lstDatosAbril2011;
    private ArrayList<Vif_2011> lstDatosMayo2011;
    private ArrayList<Vif_2011> lstDatosJunio2011;
    private ArrayList<Vif_2011> lstDatosJulio2011;
    private ArrayList<Vif_2011> lstDatosAgosto2011;
    private ArrayList<Vif_2011> lstDatosSeptiembre2011;
    private ArrayList<Vif_2011> lstDatosOctubre2011;
    private ArrayList<Vif_2011> lstDatosNoviembre2011;
    private ArrayList<Vif_2011> lstDatosDiciembre2011;
    private ArrayList<Vif_2012> lstDatosEnero2012;
    private ArrayList<Vif_2012> lstDatosFebrero2012;
    private ArrayList<Vif_2012> lstDatosMarzo2012;
    private ArrayList<Vif_2012> lstDatosAbril2012;
    private ArrayList<Vif_2012> lstDatosMayo2012;
    private ArrayList<Vif_2012> lstDatosJunio2012;
    private ArrayList<Vif_2012> lstDatosJulio2012;
    private ArrayList<Vif_2012> lstDatosAgosto2012;
    private ArrayList<Vif_2012> lstDatosSeptiembre2012;
    private ArrayList<Vif_2012> lstDatosOctubre2012;
    private ArrayList<Vif_2012> lstDatosNoviembre2012;
    private ArrayList<Vif_2012> lstDatosDiciembre2012;
    private CartesianChartModel graficoContrastesMeses;
    private Vif_2010 datoSel2010;
    private ArrayList<Vif_2010> lstDatos2010;

    public Vif_2010 getDatoSel2010() {
        return datoSel2010;
    }

    public void setDatoSel2010(Vif_2010 datoSel2010) {
        this.datoSel2010 = datoSel2010;
    }

    public ArrayList<Vif_2010> getLstDatos2010() {
        return lstDatos2010;
    }

    public void setLstDatos2010(ArrayList<Vif_2010> lstDatos2010) {
        this.lstDatos2010 = lstDatos2010;
    }

    public CartesianChartModel getGraficoContrastesMeses() {
        return graficoContrastesMeses;
    }

    public void setGraficoContrastesMeses(CartesianChartModel graficoContrastesMeses) {
        this.graficoContrastesMeses = graficoContrastesMeses;
    }

    public ArrayList<Vif_2010> getLstDatosEnero2010() {
        return lstDatosEnero2010;
    }

    public void setLstDatosEnero2010(ArrayList<Vif_2010> lstDatosEnero2010) {
        this.lstDatosEnero2010 = lstDatosEnero2010;
    }

    public ArrayList<Vif_2010> getLstDatosFebrero2010() {
        return lstDatosFebrero2010;
    }

    public void setLstDatosFebrero2010(ArrayList<Vif_2010> lstDatosFebrero2010) {
        this.lstDatosFebrero2010 = lstDatosFebrero2010;
    }

    public ArrayList<Vif_2010> getLstDatosMarzo2010() {
        return lstDatosMarzo2010;
    }

    public void setLstDatosMarzo2010(ArrayList<Vif_2010> lstDatosMarzo2010) {
        this.lstDatosMarzo2010 = lstDatosMarzo2010;
    }

    public ArrayList<Vif_2010> getLstDatosAbril2010() {
        return lstDatosAbril2010;
    }

    public void setLstDatosAbril2010(ArrayList<Vif_2010> lstDatosAbril2010) {
        this.lstDatosAbril2010 = lstDatosAbril2010;
    }

    public ArrayList<Vif_2010> getLstDatosMayo2010() {
        return lstDatosMayo2010;
    }

    public void setLstDatosMayo2010(ArrayList<Vif_2010> lstDatosMayo2010) {
        this.lstDatosMayo2010 = lstDatosMayo2010;
    }

    public ArrayList<Vif_2010> getLstDatosJunio2010() {
        return lstDatosJunio2010;
    }

    public void setLstDatosJunio2010(ArrayList<Vif_2010> lstDatosJunio2010) {
        this.lstDatosJunio2010 = lstDatosJunio2010;
    }

    public ArrayList<Vif_2010> getLstDatosJulio2010() {
        return lstDatosJulio2010;
    }

    public void setLstDatosJulio2010(ArrayList<Vif_2010> lstDatosJulio2010) {
        this.lstDatosJulio2010 = lstDatosJulio2010;
    }

    public ArrayList<Vif_2010> getLstDatosAgosto2010() {
        return lstDatosAgosto2010;
    }

    public void setLstDatosAgosto2010(ArrayList<Vif_2010> lstDatosAgosto2010) {
        this.lstDatosAgosto2010 = lstDatosAgosto2010;
    }

    public ArrayList<Vif_2010> getLstDatosSeptiembre2010() {
        return lstDatosSeptiembre2010;
    }

    public void setLstDatosSeptiembre2010(ArrayList<Vif_2010> lstDatosSeptiembre2010) {
        this.lstDatosSeptiembre2010 = lstDatosSeptiembre2010;
    }

    public ArrayList<Vif_2010> getLstDatosOctubre2010() {
        return lstDatosOctubre2010;
    }

    public void setLstDatosOctubre2010(ArrayList<Vif_2010> lstDatosOctubre2010) {
        this.lstDatosOctubre2010 = lstDatosOctubre2010;
    }

    public ArrayList<Vif_2010> getLstDatosNoviembre2010() {
        return lstDatosNoviembre2010;
    }

    public void setLstDatosNoviembre2010(ArrayList<Vif_2010> lstDatosNoviembre2010) {
        this.lstDatosNoviembre2010 = lstDatosNoviembre2010;
    }

    public ArrayList<Vif_2010> getLstDatosDiciembre2010() {
        return lstDatosDiciembre2010;
    }

    public void setLstDatosDiciembre2010(ArrayList<Vif_2010> lstDatosDiciembre2010) {
        this.lstDatosDiciembre2010 = lstDatosDiciembre2010;
    }

    public ArrayList<Vif_2011> getLstDatosEnero2011() {
        return lstDatosEnero2011;
    }

    public void setLstDatosEnero2011(ArrayList<Vif_2011> lstDatosEnero2011) {
        this.lstDatosEnero2011 = lstDatosEnero2011;
    }

    public ArrayList<Vif_2011> getLstDatosFebrero2011() {
        return lstDatosFebrero2011;
    }

    public void setLstDatosFebrero2011(ArrayList<Vif_2011> lstDatosFebrero2011) {
        this.lstDatosFebrero2011 = lstDatosFebrero2011;
    }

    public ArrayList<Vif_2011> getLstDatosMarzo2011() {
        return lstDatosMarzo2011;
    }

    public void setLstDatosMarzo2011(ArrayList<Vif_2011> lstDatosMarzo2011) {
        this.lstDatosMarzo2011 = lstDatosMarzo2011;
    }

    public ArrayList<Vif_2011> getLstDatosAbril2011() {
        return lstDatosAbril2011;
    }

    public void setLstDatosAbril2011(ArrayList<Vif_2011> lstDatosAbril2011) {
        this.lstDatosAbril2011 = lstDatosAbril2011;
    }

    public ArrayList<Vif_2011> getLstDatosMayo2011() {
        return lstDatosMayo2011;
    }

    public void setLstDatosMayo2011(ArrayList<Vif_2011> lstDatosMayo2011) {
        this.lstDatosMayo2011 = lstDatosMayo2011;
    }

    public ArrayList<Vif_2011> getLstDatosJunio2011() {
        return lstDatosJunio2011;
    }

    public void setLstDatosJunio2011(ArrayList<Vif_2011> lstDatosJunio2011) {
        this.lstDatosJunio2011 = lstDatosJunio2011;
    }

    public ArrayList<Vif_2011> getLstDatosJulio2011() {
        return lstDatosJulio2011;
    }

    public void setLstDatosJulio2011(ArrayList<Vif_2011> lstDatosJulio2011) {
        this.lstDatosJulio2011 = lstDatosJulio2011;
    }

    public ArrayList<Vif_2011> getLstDatosAgosto2011() {
        return lstDatosAgosto2011;
    }

    public void setLstDatosAgosto2011(ArrayList<Vif_2011> lstDatosAgosto2011) {
        this.lstDatosAgosto2011 = lstDatosAgosto2011;
    }

    public ArrayList<Vif_2011> getLstDatosSeptiembre2011() {
        return lstDatosSeptiembre2011;
    }

    public void setLstDatosSeptiembre2011(ArrayList<Vif_2011> lstDatosSeptiembre2011) {
        this.lstDatosSeptiembre2011 = lstDatosSeptiembre2011;
    }

    public ArrayList<Vif_2011> getLstDatosOctubre2011() {
        return lstDatosOctubre2011;
    }

    public void setLstDatosOctubre2011(ArrayList<Vif_2011> lstDatosOctubre2011) {
        this.lstDatosOctubre2011 = lstDatosOctubre2011;
    }

    public ArrayList<Vif_2011> getLstDatosNoviembre2011() {
        return lstDatosNoviembre2011;
    }

    public void setLstDatosNoviembre2011(ArrayList<Vif_2011> lstDatosNoviembre2011) {
        this.lstDatosNoviembre2011 = lstDatosNoviembre2011;
    }

    public ArrayList<Vif_2011> getLstDatosDiciembre2011() {
        return lstDatosDiciembre2011;
    }

    public void setLstDatosDiciembre2011(ArrayList<Vif_2011> lstDatosDiciembre2011) {
        this.lstDatosDiciembre2011 = lstDatosDiciembre2011;
    }

    public ArrayList<Vif_2012> getLstDatosEnero2012() {
        return lstDatosEnero2012;
    }

    public void setLstDatosEnero2012(ArrayList<Vif_2012> lstDatosEnero2012) {
        this.lstDatosEnero2012 = lstDatosEnero2012;
    }

    public ArrayList<Vif_2012> getLstDatosFebrero2012() {
        return lstDatosFebrero2012;
    }

    public void setLstDatosFebrero2012(ArrayList<Vif_2012> lstDatosFebrero2012) {
        this.lstDatosFebrero2012 = lstDatosFebrero2012;
    }

    public ArrayList<Vif_2012> getLstDatosMarzo2012() {
        return lstDatosMarzo2012;
    }

    public void setLstDatosMarzo2012(ArrayList<Vif_2012> lstDatosMarzo2012) {
        this.lstDatosMarzo2012 = lstDatosMarzo2012;
    }

    public ArrayList<Vif_2012> getLstDatosAbril2012() {
        return lstDatosAbril2012;
    }

    public void setLstDatosAbril2012(ArrayList<Vif_2012> lstDatosAbril2012) {
        this.lstDatosAbril2012 = lstDatosAbril2012;
    }

    public ArrayList<Vif_2012> getLstDatosMayo2012() {
        return lstDatosMayo2012;
    }

    public void setLstDatosMayo2012(ArrayList<Vif_2012> lstDatosMayo2012) {
        this.lstDatosMayo2012 = lstDatosMayo2012;
    }

    public ArrayList<Vif_2012> getLstDatosJunio2012() {
        return lstDatosJunio2012;
    }

    public void setLstDatosJunio2012(ArrayList<Vif_2012> lstDatosJunio2012) {
        this.lstDatosJunio2012 = lstDatosJunio2012;
    }

    public ArrayList<Vif_2012> getLstDatosJulio2012() {
        return lstDatosJulio2012;
    }

    public void setLstDatosJulio2012(ArrayList<Vif_2012> lstDatosJulio2012) {
        this.lstDatosJulio2012 = lstDatosJulio2012;
    }

    public ArrayList<Vif_2012> getLstDatosAgosto2012() {
        return lstDatosAgosto2012;
    }

    public void setLstDatosAgosto2012(ArrayList<Vif_2012> lstDatosAgosto2012) {
        this.lstDatosAgosto2012 = lstDatosAgosto2012;
    }

    public ArrayList<Vif_2012> getLstDatosSeptiembre2012() {
        return lstDatosSeptiembre2012;
    }

    public void setLstDatosSeptiembre2012(ArrayList<Vif_2012> lstDatosSeptiembre2012) {
        this.lstDatosSeptiembre2012 = lstDatosSeptiembre2012;
    }

    public ArrayList<Vif_2012> getLstDatosOctubre2012() {
        return lstDatosOctubre2012;
    }

    public void setLstDatosOctubre2012(ArrayList<Vif_2012> lstDatosOctubre2012) {
        this.lstDatosOctubre2012 = lstDatosOctubre2012;
    }

    public ArrayList<Vif_2012> getLstDatosNoviembre2012() {
        return lstDatosNoviembre2012;
    }

    public void setLstDatosNoviembre2012(ArrayList<Vif_2012> lstDatosNoviembre2012) {
        this.lstDatosNoviembre2012 = lstDatosNoviembre2012;
    }

    public ArrayList<Vif_2012> getLstDatosDiciembre2012() {
        return lstDatosDiciembre2012;
    }

    public void setLstDatosDiciembre2012(ArrayList<Vif_2012> lstDatosDiciembre2012) {
        this.lstDatosDiciembre2012 = lstDatosDiciembre2012;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        graficoContrastesMeses = contrastesMeses();
    }

    public ControladorMesesAño() {
        this.reinit();
    }

    private void reinit() {
        this.lstDatosEnero2010 = new ArrayList<Vif_2010>();
        this.lstDatosFebrero2010 = new ArrayList<Vif_2010>();
        this.lstDatosMarzo2010 = new ArrayList<Vif_2010>();
        this.lstDatosAbril2010 = new ArrayList<Vif_2010>();
        this.lstDatosMayo2010 = new ArrayList<Vif_2010>();
        this.lstDatosJunio2010 = new ArrayList<Vif_2010>();
        this.lstDatosJulio2010 = new ArrayList<Vif_2010>();
        this.lstDatosAgosto2010 = new ArrayList<Vif_2010>();
        this.lstDatosSeptiembre2010 = new ArrayList<Vif_2010>();
        this.lstDatosOctubre2010 = new ArrayList<Vif_2010>();
        this.lstDatosNoviembre2010 = new ArrayList<Vif_2010>();
        this.lstDatosDiciembre2010 = new ArrayList<Vif_2010>();
        this.cargarDatos2010();
        this.init();
    }

    private CartesianChartModel contrastesMeses() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstDatosEnero2010 = FVif_2010.ObtenerDatosEnero();
            lstDatosFebrero2010 = FVif_2010.ObtenerDatosFebrero();
            lstDatosMarzo2010 = FVif_2010.ObtenerDatosMarzo();
            lstDatosAbril2010 = FVif_2010.ObtenerDatosAbril();
            lstDatosMayo2010 = FVif_2010.ObtenerDatosMayo();
            lstDatosJunio2010 = FVif_2010.ObtenerDatosJunio();
            lstDatosJulio2010 = FVif_2010.ObtenerDatosJulio();
            lstDatosAgosto2010 = FVif_2010.ObtenerDatosAgosto();
            lstDatosSeptiembre2010 = FVif_2010.ObtenerDatosSeptiembre();
            lstDatosOctubre2010 = FVif_2010.ObtenerDatosOctubre();
            lstDatosNoviembre2010 = FVif_2010.ObtenerDatosNoviembre();
            lstDatosDiciembre2010 = FVif_2010.ObtenerDatosDiciembre();

            lstDatosEnero2011 = FVif_2011.ObtenerDatosEnero();
            lstDatosFebrero2011 = FVif_2011.ObtenerDatosFebrero();
            lstDatosMarzo2011 = FVif_2011.ObtenerDatosMarzo();
            lstDatosAbril2011 = FVif_2011.ObtenerDatosAbril();
            lstDatosMayo2011 = FVif_2011.ObtenerDatosMayo();
            lstDatosJunio2011 = FVif_2011.ObtenerDatosJunio();
            lstDatosJulio2011 = FVif_2011.ObtenerDatosJulio();
            lstDatosAgosto2011 = FVif_2011.ObtenerDatosAgosto();
            lstDatosSeptiembre2011 = FVif_2011.ObtenerDatosSeptiembre();
            lstDatosOctubre2011 = FVif_2011.ObtenerDatosOctubre();
            lstDatosNoviembre2011 = FVif_2011.ObtenerDatosNoviembre();
            lstDatosDiciembre2011 = FVif_2011.ObtenerDatosDiciembre();

            lstDatosEnero2012 = FVif_2012.ObtenerDatosEnero();
            lstDatosFebrero2012 = FVif_2012.ObtenerDatosFebrero();
            lstDatosMarzo2012 = FVif_2012.ObtenerDatosMarzo();
            lstDatosAbril2012 = FVif_2012.ObtenerDatosAbril();
            lstDatosMayo2012 = FVif_2012.ObtenerDatosMayo();
            lstDatosJunio2012 = FVif_2012.ObtenerDatosJunio();
            lstDatosJulio2012 = FVif_2012.ObtenerDatosJulio();
            lstDatosAgosto2012 = FVif_2012.ObtenerDatosAgosto();
            lstDatosSeptiembre2012 = FVif_2012.ObtenerDatosSeptiembre();
            lstDatosOctubre2012 = FVif_2012.ObtenerDatosOctubre();
            lstDatosNoviembre2012 = FVif_2012.ObtenerDatosNoviembre();
            lstDatosDiciembre2012 = FVif_2012.ObtenerDatosDiciembre();

            ChartSeries Vif_2010 = new ChartSeries();
            Vif_2010.setLabel("Casos 2010");
            Vif_2010.set("Enero", lstDatosEnero2010.size());
            Vif_2010.set("Febrero", lstDatosFebrero2010.size());
            Vif_2010.set("Marzo", lstDatosMarzo2010.size());
            Vif_2010.set("Abril", lstDatosAbril2010.size());
            Vif_2010.set("Mayo", lstDatosMayo2010.size());
            Vif_2010.set("Junio", lstDatosJunio2010.size());
            Vif_2010.set("Julio", lstDatosJulio2010.size());
            Vif_2010.set("Agosto", lstDatosAgosto2010.size());
            Vif_2010.set("Septiembre", lstDatosSeptiembre2010.size());
            Vif_2010.set("Octubre", lstDatosOctubre2010.size());
            Vif_2010.set("Noviembre", lstDatosNoviembre2010.size());
            Vif_2010.set("Diciembre", lstDatosDiciembre2010.size());

            ChartSeries Vif_2011 = new ChartSeries();
            Vif_2011.setLabel("Casos 2011");
            Vif_2011.set("Enero", lstDatosEnero2011.size());
            Vif_2011.set("Febrero", lstDatosFebrero2011.size());
            Vif_2011.set("Marzo", lstDatosMarzo2011.size());
            Vif_2011.set("Abril", lstDatosAbril2011.size());
            Vif_2011.set("Mayo", lstDatosMayo2011.size());
            Vif_2011.set("Junio", lstDatosJunio2011.size());
            Vif_2011.set("Julio", lstDatosJulio2011.size());
            Vif_2011.set("Agosto", lstDatosAgosto2011.size());
            Vif_2011.set("Septiembre", lstDatosSeptiembre2011.size());
            Vif_2011.set("Octubre", lstDatosOctubre2011.size());
            Vif_2011.set("Noviembre", lstDatosNoviembre2011.size());
            Vif_2011.set("Diciembre", lstDatosDiciembre2011.size());

            ChartSeries Vif_2012 = new ChartSeries();
            Vif_2012.setLabel("Casos 2012");
            Vif_2012.set("Enero", lstDatosEnero2012.size());
            Vif_2012.set("Febrero", lstDatosFebrero2012.size());
            Vif_2012.set("Marzo", lstDatosMarzo2012.size());
            Vif_2012.set("Abril", lstDatosAbril2012.size());
            Vif_2012.set("Mayo", lstDatosMayo2012.size());
            Vif_2012.set("Junio", lstDatosJunio2012.size());
            Vif_2012.set("Julio", lstDatosJulio2012.size());
            Vif_2012.set("Agosto", lstDatosAgosto2012.size());
            Vif_2012.set("Septiembre", lstDatosSeptiembre2012.size());
            Vif_2012.set("Octubre", lstDatosOctubre2012.size());
            Vif_2012.set("Noviembre", lstDatosNoviembre2012.size());
            Vif_2012.set("Diciembre", lstDatosDiciembre2012.size());

            model.addSeries(Vif_2010);
            model.addSeries(Vif_2011);
             model.addSeries(Vif_2012);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    public void cargarDatos2010() {
        try {

            this.lstDatos2010 = FVif_2010.ObtenerDatos();
            this.datoSel2010 = lstDatos2010.get(0);
            System.out.println(lstDatos2010.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }
}
