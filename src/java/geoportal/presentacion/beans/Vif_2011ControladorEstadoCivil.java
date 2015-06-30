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
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class Vif_2011ControladorEstadoCivil {
  private CartesianChartModel graficaEstadoCivilVictima;
    private ArrayList<Vif_2011> lstDatosDivorciado;
    private ArrayList<Vif_2011> lstDatosCasado;
    private ArrayList<Vif_2011> lstDatosViudo;
    private ArrayList<Vif_2011> lstDatosUnionLibre;
    private ArrayList<Vif_2011> lstDatosUnionHecho;
    private ArrayList<Vif_2011> lstDatosSoltero;
    private ArrayList<Vif_2011> lstDatosNa;  

    public CartesianChartModel getGraficaEstadoCivilVictima() {
        return graficaEstadoCivilVictima;
    }

    public void setGraficaEstadoCivilVictima(CartesianChartModel graficaEstadoCivilVictima) {
        this.graficaEstadoCivilVictima = graficaEstadoCivilVictima;
    }

    public ArrayList<Vif_2011> getLstDatosDivorciado() {
        return lstDatosDivorciado;
    }

    public void setLstDatosDivorciado(ArrayList<Vif_2011> lstDatosDivorciado) {
        this.lstDatosDivorciado = lstDatosDivorciado;
    }

    public ArrayList<Vif_2011> getLstDatosCasado() {
        return lstDatosCasado;
    }

    public void setLstDatosCasado(ArrayList<Vif_2011> lstDatosCasado) {
        this.lstDatosCasado = lstDatosCasado;
    }

    public ArrayList<Vif_2011> getLstDatosViudo() {
        return lstDatosViudo;
    }

    public void setLstDatosViudo(ArrayList<Vif_2011> lstDatosViudo) {
        this.lstDatosViudo = lstDatosViudo;
    }

    public ArrayList<Vif_2011> getLstDatosUnionLibre() {
        return lstDatosUnionLibre;
    }

    public void setLstDatosUnionLibre(ArrayList<Vif_2011> lstDatosUnionLibre) {
        this.lstDatosUnionLibre = lstDatosUnionLibre;
    }

    public ArrayList<Vif_2011> getLstDatosUnionHecho() {
        return lstDatosUnionHecho;
    }

    public void setLstDatosUnionHecho(ArrayList<Vif_2011> lstDatosUnionHecho) {
        this.lstDatosUnionHecho = lstDatosUnionHecho;
    }

    public ArrayList<Vif_2011> getLstDatosSoltero() {
        return lstDatosSoltero;
    }

    public void setLstDatosSoltero(ArrayList<Vif_2011> lstDatosSoltero) {
        this.lstDatosSoltero = lstDatosSoltero;
    }

    public ArrayList<Vif_2011> getLstDatosNa() {
        return lstDatosNa;
    }

    public void setLstDatosNa(ArrayList<Vif_2011> lstDatosNa) {
        this.lstDatosNa = lstDatosNa;
    }

    public Vif_2011ControladorEstadoCivil() {
        reinit();
    }
    
    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosCasado = new ArrayList<Vif_2011>();
        this.lstDatosDivorciado = new ArrayList<Vif_2011>();
        this.lstDatosNa = new ArrayList<Vif_2011>();
        this.lstDatosSoltero = new ArrayList<Vif_2011>();
        this.lstDatosUnionHecho = new ArrayList<Vif_2011>();
        this.lstDatosUnionLibre = new ArrayList<Vif_2011>();
        this.lstDatosViudo = new ArrayList<Vif_2011>();

        this.init();

    }

    public void graficar() {
        graficaEstadoCivilVictima = initCategoryEstadoVictima();
        // lineModel2 = initCategoryCircuito();
        //pieModel = graficaDenunciasCircuito();
    }

    /**
     *
     */
    private CartesianChartModel initCategoryEstadoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosCasado = FVif_2011.ObtenerDatosVictimaCasados();
            lstDatosDivorciado = FVif_2011.ObtenerDatosVictimaDivorciado();
            lstDatosNa = FVif_2011.ObtenerDatosVictimaNa();
            lstDatosSoltero = FVif_2011.ObtenerDatosVictimaSoltero();
            lstDatosUnionHecho = FVif_2011.ObtenerDatosVictimaUnionHecho();
            lstDatosUnionLibre = FVif_2011.ObtenerDatosVictimaUnionLibre();
            lstDatosViudo = FVif_2011.ObtenerDatosVictimaViudo();
            ChartSeries EstadoCivil = new ChartSeries();
            EstadoCivil.setLabel("Estado Civil");
            EstadoCivil.set("Casad@", lstDatosCasado.size());
            EstadoCivil.set("Divorciad@", lstDatosDivorciado.size());
            EstadoCivil.set("NA",lstDatosNa.size());
            EstadoCivil.set("Solter@",lstDatosSoltero.size());
            EstadoCivil.set("Union de Hecho",lstDatosUnionHecho.size());
            EstadoCivil.set("Union Libre",lstDatosUnionLibre.size());
            EstadoCivil.set("Viud@",lstDatosViudo.size());
            
            model.addSeries(EstadoCivil);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }
}
