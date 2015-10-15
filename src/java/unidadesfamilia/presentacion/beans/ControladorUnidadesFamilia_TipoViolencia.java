/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidadesfamilia.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;
import unidadesfamilia.logica.clases.UnidadesFamilia;
import unidadesfamilia.logica.funciones.FUnidadesFamilia;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorUnidadesFamilia_TipoViolencia {

    /**
     * Creates a new instance of ControladorUnidadesFamilia_TipoViolencia
     */
    private ArrayList<UnidadesFamilia> lstTipoViolencia;
    private ArrayList<UnidadesFamilia> lstDatos;
    private ArrayList<UnidadesFamilia> lstDadoTipoViolencia;
    private ArrayList<UnidadesFamilia> lstDadoTipoViolenciaSexoM;
    private ArrayList<UnidadesFamilia> lstDadoTipoViolenciaSexoF;
    private CartesianChartModel lineTipoViolencia;
    private CartesianChartModel lineTipoViolencia2015;
    private CartesianChartModel lineTipoViolenciaSexoVictima;
    private CartesianChartModel lineTipoViolenciaSexoVictima2015;
    private CartesianChartModel lineTipoViolencia2016;
    private CartesianChartModel lineTipoViolenciaSexoVictima2016;
    private int anioSel;

    public int getAnioSel() {
        return anioSel;
    }

    public void setAnioSel(int anioSel) {
        this.anioSel = anioSel;
    }
     
    public ArrayList<UnidadesFamilia> getLstTipoViolencia() {
        return lstTipoViolencia;
    }

    public CartesianChartModel getLineTipoViolencia2016() {
        return lineTipoViolencia2016;
    }

    public void setLineTipoViolencia2016(CartesianChartModel lineTipoViolencia2016) {
        this.lineTipoViolencia2016 = lineTipoViolencia2016;
    }

    public CartesianChartModel getLineTipoViolenciaSexoVictima2016() {
        return lineTipoViolenciaSexoVictima2016;
    }

    public void setLineTipoViolenciaSexoVictima2016(CartesianChartModel lineTipoViolenciaSexoVictima2016) {
        this.lineTipoViolenciaSexoVictima2016 = lineTipoViolenciaSexoVictima2016;
    }

    
    
    public void setLstTipoViolencia(ArrayList<UnidadesFamilia> lstTipoViolencia) {
        this.lstTipoViolencia = lstTipoViolencia;
    }

    public ArrayList<UnidadesFamilia> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<UnidadesFamilia> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<UnidadesFamilia> getLstDadoTipoViolencia() {
        return lstDadoTipoViolencia;
    }

    public void setLstDadoTipoViolencia(ArrayList<UnidadesFamilia> lstDadoTipoViolencia) {
        this.lstDadoTipoViolencia = lstDadoTipoViolencia;
    }

    public ArrayList<UnidadesFamilia> getLstDadoTipoViolenciaSexoM() {
        return lstDadoTipoViolenciaSexoM;
    }

    public void setLstDadoTipoViolenciaSexoM(ArrayList<UnidadesFamilia> lstDadoTipoViolenciaSexoM) {
        this.lstDadoTipoViolenciaSexoM = lstDadoTipoViolenciaSexoM;
    }

    public ArrayList<UnidadesFamilia> getLstDadoTipoViolenciaSexoF() {
        return lstDadoTipoViolenciaSexoF;
    }

    public void setLstDadoTipoViolenciaSexoF(ArrayList<UnidadesFamilia> lstDadoTipoViolenciaSexoF) {
        this.lstDadoTipoViolenciaSexoF = lstDadoTipoViolenciaSexoF;
    }

    public CartesianChartModel getLineTipoViolencia() {
        return lineTipoViolencia;
    }

    public void setLineTipoViolencia(CartesianChartModel lineTipoViolencia) {
        this.lineTipoViolencia = lineTipoViolencia;
    }

    public CartesianChartModel getLineTipoViolencia2015() {
        return lineTipoViolencia2015;
    }

    public void setLineTipoViolencia2015(CartesianChartModel lineTipoViolencia2015) {
        this.lineTipoViolencia2015 = lineTipoViolencia2015;
    }

    public CartesianChartModel getLineTipoViolenciaSexoVictima() {
        return lineTipoViolenciaSexoVictima;
    }

    public void setLineTipoViolenciaSexoVictima(CartesianChartModel lineTipoViolenciaSexoVictima) {
        this.lineTipoViolenciaSexoVictima = lineTipoViolenciaSexoVictima;
    }

    public CartesianChartModel getLineTipoViolenciaSexoVictima2015() {
        return lineTipoViolenciaSexoVictima2015;
    }

    public void setLineTipoViolenciaSexoVictima2015(CartesianChartModel lineTipoViolenciaSexoVictima2015) {
        this.lineTipoViolenciaSexoVictima2015 = lineTipoViolenciaSexoVictima2015;
    }

    
    @PostConstruct
    public void init() {
        this.lineTipoViolencia = graficaTipoViolencia(anioSel);
        this.lineTipoViolenciaSexoVictima = graficoTipoViolenciaSexoVictima(anioSel);
        
    }

    /*private void graficar() {
        this.lineTipoViolencia = graficaTipoViolencia();
        this.lineTipoViolenciaSexoVictima = graficoTipoViolenciaSexoVictima();
        this.lineTipoViolencia2015 = graficaTipoViolencia2015();
        this.lineTipoViolenciaSexoVictima2015 = graficoTipoViolenciaSexoVictima2015();
        this.lineTipoViolencia2016 = graficaTipoViolencia2016();
        this.lineTipoViolenciaSexoVictima2016 = graficoTipoViolenciaSexoVictima2016();
    }*/

    private void reinit() {
        this.init();
    }
    
    public ControladorUnidadesFamilia_TipoViolencia() {
        this.reinit();
    }

   
    
     private CartesianChartModel graficaTipoViolencia(int anio) {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos =FUnidadesFamilia.obtenerDatosTipoViolencia(anioSel);
            ChartSeries anio13 = new ChartSeries();

            for (int i = 0; i < lstDatos.size(); i++) {
                lstDadoTipoViolencia = FUnidadesFamilia.obtenerDatosDadoTipoViolencia(anio, lstDatos.get(i).getTipo_de_violencia());
                anio13.set(lstDatos.get(i).getTipo_de_violencia(), lstDadoTipoViolencia.size());
            }
            model.addSeries(anio13);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    
   private CartesianChartModel graficoTipoViolenciaSexoVictima(int anio){
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos = FUnidadesFamilia.obtenerDatosTipoViolencia(anioSel);
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");
            for (int j = 0; j < lstDatos.size(); j++) {
                lstDadoTipoViolenciaSexoM = FUnidadesFamilia.obtenerDatosDadoTipoViolenciaSexoVictima(anio, lstDatos.get(j).getTipo_de_violencia(), "M");
                masculino.set(lstDatos.get(j).getTipo_de_violencia(), lstDadoTipoViolenciaSexoM.size());
            }
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            for (int j = 0; j < lstDatos.size(); j++) {
                lstDadoTipoViolenciaSexoF = FUnidadesFamilia.obtenerDatosDadoTipoViolenciaSexoVictima(anio, lstDatos.get(j).getTipo_de_violencia(), "F");
                femenino.set(lstDatos.get(j).getTipo_de_violencia(), lstDadoTipoViolenciaSexoF.size());
            }
            model.addSeries(femenino);
            model.addSeries(masculino);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
                return model;
    }
    
    

}
