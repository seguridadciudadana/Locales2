/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.rural.presentacion.beans;

import geoportal.rural.logica.clases.VifRural2011;
import geoportal.rural.logica.funciones.FVifRural2011;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.MesesDias;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Controlador_VifRuralTipoViolencia {

    /**
     * Creates a new instance of Controlador_VifRuralTipoViolencia
     */
    private ArrayList<VifRural2011> lstTiposViolencia;
    private ArrayList<VifRural2011> lstDatos;
    private ArrayList<VifRural2011> lstDadoTiposViolencia;
    private ArrayList<VifRural2011> lstDadoTiposViolenciaM;
    private ArrayList<VifRural2011> lstDadoTiposViolenciaF;
    private CartesianChartModel lineTipoViolencia;
    private CartesianChartModel lineTipoViolencia2010;
    private CartesianChartModel lineTipoViolenciaSexoVictima;
    private CartesianChartModel lineTipoViolencia2012;
    private CartesianChartModel lineTipoViolenciaSexoVictima2012;
    private CartesianChartModel lineTipoViolenciaSexoVictima2010;

    public CartesianChartModel getLineTipoViolencia2010() {
        return lineTipoViolencia2010;
    }

    public void setLineTipoViolencia2010(CartesianChartModel lineTipoViolencia2010) {
        this.lineTipoViolencia2010 = lineTipoViolencia2010;
    }

    public CartesianChartModel getLineTipoViolencia2012() {
        return lineTipoViolencia2012;
    }

    public void setLineTipoViolencia2012(CartesianChartModel lineTipoViolencia2012) {
        this.lineTipoViolencia2012 = lineTipoViolencia2012;
    }

    public CartesianChartModel getLineTipoViolenciaSexoVictima2012() {
        return lineTipoViolenciaSexoVictima2012;
    }

    public void setLineTipoViolenciaSexoVictima2012(CartesianChartModel lineTipoViolenciaSexoVictima2012) {
        this.lineTipoViolenciaSexoVictima2012 = lineTipoViolenciaSexoVictima2012;
    }

    public CartesianChartModel getLineTipoViolenciaSexoVictima2010() {
        return lineTipoViolenciaSexoVictima2010;
    }

    public void setLineTipoViolenciaSexoVictima2010(CartesianChartModel lineTipoViolenciaSexoVictima2010) {
        this.lineTipoViolenciaSexoVictima2010 = lineTipoViolenciaSexoVictima2010;
    }

    public ArrayList<VifRural2011> getLstDadoTiposViolenciaM() {
        return lstDadoTiposViolenciaM;
    }

    public void setLstDadoTiposViolenciaM(ArrayList<VifRural2011> lstDadoTiposViolenciaM) {
        this.lstDadoTiposViolenciaM = lstDadoTiposViolenciaM;
    }

    public ArrayList<VifRural2011> getLstDadoTiposViolenciaF() {
        return lstDadoTiposViolenciaF;
    }

    public void setLstDadoTiposViolenciaF(ArrayList<VifRural2011> lstDadoTiposViolenciaF) {
        this.lstDadoTiposViolenciaF = lstDadoTiposViolenciaF;
    }

    public ArrayList<VifRural2011> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<VifRural2011> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<VifRural2011> getLstTiposViolencia() {
        return lstTiposViolencia;
    }

    public void setLstTiposViolencia(ArrayList<VifRural2011> lstTiposViolencia) {
        this.lstTiposViolencia = lstTiposViolencia;
    }

    public ArrayList<VifRural2011> getLstDadoTiposViolencia() {
        return lstDadoTiposViolencia;
    }

    public void setLstDadoTiposViolencia(ArrayList<VifRural2011> lstDadoTiposViolencia) {
        this.lstDadoTiposViolencia = lstDadoTiposViolencia;
    }

    public CartesianChartModel getLineTipoViolencia() {
        return lineTipoViolencia;
    }

    public void setLineTipoViolencia(CartesianChartModel lineTipoViolencia) {
        this.lineTipoViolencia = lineTipoViolencia;
    }

    public CartesianChartModel getLineTipoViolenciaSexoVictima() {
        return lineTipoViolenciaSexoVictima;
    }

    public void setLineTipoViolenciaSexoVictima(CartesianChartModel lineTipoViolenciaSexoVictima) {
        this.lineTipoViolenciaSexoVictima = lineTipoViolenciaSexoVictima;
    }

    @PostConstruct
    private void graficar() {
        this.lineTipoViolencia = graficoTipoViolencia2011();
        this.lineTipoViolenciaSexoVictima = graficoTipoViolenciaSexoVictima2011();
        this.lineTipoViolencia2012 = graficoTipoViolencia2012();
        this.lineTipoViolenciaSexoVictima2012 = graficoTipoViolenciaSexoVictima2012();
        this.lineTipoViolenciaSexoVictima2010 = graficoTipoViolenciaSexoVictima2010();
        this.lineTipoViolencia2010 = graficoTipoViolencia2010();
    }

    private void reinit() {
        this.graficar();
    }

    public Controlador_VifRuralTipoViolencia() {
        this.reinit();
    }

    private CartesianChartModel graficoTipoViolencia2011() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstDatos = FVifRural2011.ObtenerDatosTipoDeViolencia();
            ChartSeries tipoViolencia = new ChartSeries();
            tipoViolencia.setLabel("Tipos de Violencia");
            for (int j = 0; j < lstDatos.size(); j++) {
                lstDadoTiposViolencia = FVifRural2011.ObtenerDatosDadoTipoViolenciaDadoAnio(lstDatos.get(j).getTipo_de_violencia(), 2011);
                tipoViolencia.set(lstDatos.get(j).getTipo_de_violencia(), lstDadoTiposViolencia.size());
            }
            model1.addSeries(tipoViolencia);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    private CartesianChartModel graficoTipoViolencia2010() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstDatos = FVifRural2011.ObtenerDatosTipoDeViolencia();
            ChartSeries tipoViolencia = new ChartSeries();
            tipoViolencia.setLabel("Tipos de Violencia");
            for (int j = 0; j < lstDatos.size(); j++) {
                lstDadoTiposViolencia = FVifRural2011.ObtenerDatosDadoTipoViolenciaDadoAnio(lstDatos.get(j).getTipo_de_violencia(), 2010);
                tipoViolencia.set(lstDatos.get(j).getTipo_de_violencia(), lstDadoTiposViolencia.size());
            }
            model1.addSeries(tipoViolencia);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    private CartesianChartModel graficoTipoViolencia2012() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstDatos = FVifRural2011.ObtenerDatosTipoDeViolencia();
            ChartSeries tipoViolencia = new ChartSeries();
            tipoViolencia.setLabel("Tipos de Violencia");
            for (int j = 0; j < lstDatos.size(); j++) {
                lstDadoTiposViolencia = FVifRural2011.ObtenerDatosDadoTipoViolenciaDadoAnio(lstDatos.get(j).getTipo_de_violencia(), 2012);
                tipoViolencia.set(lstDatos.get(j).getTipo_de_violencia(), lstDadoTiposViolencia.size());
            }
            model1.addSeries(tipoViolencia);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    private CartesianChartModel graficoTipoViolenciaSexoVictima2010() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstDatos = FVifRural2011.ObtenerDatosTipoDeViolencia();
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");
            for (int j = 0; j < lstDatos.size(); j++) {
                lstDadoTiposViolenciaM = FVifRural2011.ObtenerDatosDadoAnioTipoDeViolenciaSexoVictima(lstDatos.get(j).getTipo_de_violencia(), "M", 2010);
                masculino.set(lstDatos.get(j).getTipo_de_violencia(), lstDadoTiposViolenciaM.size());
            }

            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            for (int j = 0; j < lstDatos.size(); j++) {
                lstDadoTiposViolenciaF = FVifRural2011.ObtenerDatosDadoAnioTipoDeViolenciaSexoVictima(lstDatos.get(j).getTipo_de_violencia(), "F", 2010);
                femenino.set(lstDatos.get(j).getTipo_de_violencia(), lstDadoTiposViolenciaF.size());
            }

            model1.addSeries(femenino);
            model1.addSeries(masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    private CartesianChartModel graficoTipoViolenciaSexoVictima2011() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstDatos = FVifRural2011.ObtenerDatosTipoDeViolencia();
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");
            for (int j = 0; j < lstDatos.size(); j++) {
                lstDadoTiposViolenciaM = FVifRural2011.ObtenerDatosDadoAnioTipoDeViolenciaSexoVictima(lstDatos.get(j).getTipo_de_violencia(), "M", 2011);
                masculino.set(lstDatos.get(j).getTipo_de_violencia(), lstDadoTiposViolenciaM.size());
            }

            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            for (int j = 0; j < lstDatos.size(); j++) {
                lstDadoTiposViolenciaF = FVifRural2011.ObtenerDatosDadoAnioTipoDeViolenciaSexoVictima(lstDatos.get(j).getTipo_de_violencia(), "F", 2011);
                femenino.set(lstDatos.get(j).getTipo_de_violencia(), lstDadoTiposViolenciaF.size());
            }

            model1.addSeries(femenino);
            model1.addSeries(masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    private CartesianChartModel graficoTipoViolenciaSexoVictima2012() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstDatos = FVifRural2011.ObtenerDatosTipoDeViolencia();
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");
            for (int j = 0; j < lstDatos.size(); j++) {
                lstDadoTiposViolenciaM = FVifRural2011.ObtenerDatosDadoAnioTipoDeViolenciaSexoVictima(lstDatos.get(j).getTipo_de_violencia(), "M", 2012);
                masculino.set(lstDatos.get(j).getTipo_de_violencia(), lstDadoTiposViolenciaM.size());
            }

            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            for (int j = 0; j < lstDatos.size(); j++) {
                lstDadoTiposViolenciaF = FVifRural2011.ObtenerDatosDadoAnioTipoDeViolenciaSexoVictima(lstDatos.get(j).getTipo_de_violencia(), "F", 2012);
                femenino.set(lstDatos.get(j).getTipo_de_violencia(), lstDadoTiposViolenciaF.size());
            }

            model1.addSeries(femenino);
            model1.addSeries(masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

}
