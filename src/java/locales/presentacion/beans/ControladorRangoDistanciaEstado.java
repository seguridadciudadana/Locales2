/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locales.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import locales.logica.clases.Locales;
import locales.logica.funciones.FLocales;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Distancia;
import recursos.Especificar;

/**
 *
 * @author oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorRangoDistanciaEstado {
    
    private ArrayList<String> lstDistancias;
    private ArrayList<String> lstEstados;
    private ArrayList<Locales> lstLocales;
    private ArrayList<Locales> lstDadoRango;
    private ArrayList<Locales> lstDadoEstado;
    private CartesianChartModel lineLOcales;
    
    public ArrayList<String> getLstEstados() {
        return lstEstados;
    }
    
    public void setLstEstados(ArrayList<String> lstEstados) {
        this.lstEstados = lstEstados;
    }
    
    public ArrayList<String> getLstDistancias() {
        return lstDistancias;
    }
    
    public void setLstDistancias(ArrayList<String> lstDistancias) {
        this.lstDistancias = lstDistancias;
    }
    
    public ArrayList<Locales> getLstLocales() {
        return lstLocales;
    }
    
    public void setLstLocales(ArrayList<Locales> lstLocales) {
        this.lstLocales = lstLocales;
    }
    
    public ArrayList<Locales> getLstDadoRango() {
        return lstDadoRango;
    }
    
    public void setLstDadoRango(ArrayList<Locales> lstDadoRango) {
        this.lstDadoRango = lstDadoRango;
    }
    
    public ArrayList<Locales> getLstDadoEstado() {
        return lstDadoEstado;
    }
    
    public void setLstDadoEstado(ArrayList<Locales> lstDadoEstado) {
        this.lstDadoEstado = lstDadoEstado;
    }
    
    public CartesianChartModel getLineLOcales() {
        return lineLOcales;
    }
    
    public void setLineLOcales(CartesianChartModel lineLOcales) {
        this.lineLOcales = lineLOcales;
    }
    
    @PostConstruct
    private void graficar() {
        this.lineLOcales = graficaDistancias();
        
    }
    
    public ControladorRangoDistanciaEstado() {
        
        this.graficar();
    }
    
    private CartesianChartModel graficaDistancias() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDistancias = Distancia.obtenerDistancias();
            lstEstados = Especificar.obtenerEstado();

//            lstLocales = FLocales.ObtenerDatos();
            ChartSeries localesAbiertos = new ChartSeries();
            localesAbiertos.setLabel("Abiertos");
            localesAbiertos.set(lstDistancias.get(0), FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(0), lstEstados.get(0)).size());
            localesAbiertos.set(lstDistancias.get(1), FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(1), lstEstados.get(0)).size());
            localesAbiertos.set(lstDistancias.get(2), FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(2), lstEstados.get(0)).size());
            localesAbiertos.set(lstDistancias.get(3), FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(3), lstEstados.get(0)).size());
            localesAbiertos.set(lstDistancias.get(4), FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(4), lstEstados.get(0)).size());
            localesAbiertos.set(lstDistancias.get(5), FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(5), lstEstados.get(0)).size());
            localesAbiertos.set(lstDistancias.get(6), FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(6), lstEstados.get(0)).size());
            localesAbiertos.set(lstDistancias.get(7), FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(7), lstEstados.get(0)).size());
            localesAbiertos.set(lstDistancias.get(8), FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(8), lstEstados.get(0)).size());
            
            
            ChartSeries localesCerrados = new ChartSeries();
            localesCerrados.setLabel("Cerrados");
            localesCerrados.set(lstDistancias.get(0),FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(0), lstEstados.get(1)).size());
            localesCerrados.set(lstDistancias.get(1),FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(1), lstEstados.get(1)).size());
            localesCerrados.set(lstDistancias.get(2),FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(2), lstEstados.get(1)).size());
            localesCerrados.set(lstDistancias.get(3),FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(3), lstEstados.get(1)).size());
            localesCerrados.set(lstDistancias.get(4),FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(4), lstEstados.get(1)).size());
            localesCerrados.set(lstDistancias.get(5),FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(5), lstEstados.get(1)).size());
            localesCerrados.set(lstDistancias.get(6),FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(6), lstEstados.get(1)).size());
            localesCerrados.set(lstDistancias.get(7),FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(7), lstEstados.get(1)).size());
            localesCerrados.set(lstDistancias.get(8),FLocales.obtenerDatosDadoRangoDistaciaEstado(lstDistancias.get(8), lstEstados.get(1)).size());
            
            model.addSeries(localesCerrados);
            model.addSeries(localesAbiertos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }
    
}
