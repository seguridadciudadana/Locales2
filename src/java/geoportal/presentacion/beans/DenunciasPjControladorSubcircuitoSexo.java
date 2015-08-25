/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.DenunciasPj;
import geoportal.logica.funciones.FDenunciasPj;
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
public class DenunciasPjControladorSubcircuitoSexo {

    /**
     * Creates a new instance of DenunciasPjControladorSubcircuitoSexo
     */
    private ArrayList<DenunciasPj> lstDatosSubcircuito;
    private ArrayList<DenunciasPj> lstDatosHombres;
    private ArrayList<DenunciasPj> lstDatosMujeres;
    private ArrayList<DenunciasPj> lstDatosDadoCircuitoSexoMasculino;
    private ArrayList<DenunciasPj> lstDatosDadoCircuitoSexoFemenino;
    private ArrayList<DenunciasPj> lstDatosDadoCircuitoSexoMasculino1;
    private ArrayList<DenunciasPj> lstDatosDadoCircuitoSexoFemenino1;

    private CartesianChartModel ModelCircuitoSexo2014;
    private CartesianChartModel ModelCircuitoSexo2015;

    public ArrayList<DenunciasPj> getLstDatosSubcircuito() {
        return lstDatosSubcircuito;
    }

    public void setLstDatosSubcircuito(ArrayList<DenunciasPj> lstDatosSubcircuito) {
        this.lstDatosSubcircuito = lstDatosSubcircuito;
    }

    public ArrayList<DenunciasPj> getLstDatosHombres() {
        return lstDatosHombres;
    }

    public void setLstDatosHombres(ArrayList<DenunciasPj> lstDatosHombres) {
        this.lstDatosHombres = lstDatosHombres;
    }

    public ArrayList<DenunciasPj> getLstDatosMujeres() {
        return lstDatosMujeres;
    }

    public void setLstDatosMujeres(ArrayList<DenunciasPj> lstDatosMujeres) {
        this.lstDatosMujeres = lstDatosMujeres;
    }

    public ArrayList<DenunciasPj> getLstDatosDadoCircuitoSexoMasculino() {
        return lstDatosDadoCircuitoSexoMasculino;
    }

    public void setLstDatosDadoCircuitoSexoMasculino(ArrayList<DenunciasPj> lstDatosDadoCircuitoSexoMasculino) {
        this.lstDatosDadoCircuitoSexoMasculino = lstDatosDadoCircuitoSexoMasculino;
    }

    public ArrayList<DenunciasPj> getLstDatosDadoCircuitoSexoFemenino() {
        return lstDatosDadoCircuitoSexoFemenino;
    }

    public void setLstDatosDadoCircuitoSexoFemenino(ArrayList<DenunciasPj> lstDatosDadoCircuitoSexoFemenino) {
        this.lstDatosDadoCircuitoSexoFemenino = lstDatosDadoCircuitoSexoFemenino;
    }

    public ArrayList<DenunciasPj> getLstDatosDadoCircuitoSexoMasculino1() {
        return lstDatosDadoCircuitoSexoMasculino1;
    }

    public void setLstDatosDadoCircuitoSexoMasculino1(ArrayList<DenunciasPj> lstDatosDadoCircuitoSexoMasculino1) {
        this.lstDatosDadoCircuitoSexoMasculino1 = lstDatosDadoCircuitoSexoMasculino1;
    }

    public ArrayList<DenunciasPj> getLstDatosDadoCircuitoSexoFemenino1() {
        return lstDatosDadoCircuitoSexoFemenino1;
    }

    public void setLstDatosDadoCircuitoSexoFemenino1(ArrayList<DenunciasPj> lstDatosDadoCircuitoSexoFemenino1) {
        this.lstDatosDadoCircuitoSexoFemenino1 = lstDatosDadoCircuitoSexoFemenino1;
    }

    public CartesianChartModel getModelCircuitoSexo2014() {
        return ModelCircuitoSexo2014;
    }

    public void setModelCircuitoSexo2014(CartesianChartModel ModelCircuitoSexo2014) {
        this.ModelCircuitoSexo2014 = ModelCircuitoSexo2014;
    }

    public CartesianChartModel getModelCircuitoSexo2015() {
        return ModelCircuitoSexo2015;
    }

    public void setModelCircuitoSexo2015(CartesianChartModel ModelCircuitoSexo2015) {
        this.ModelCircuitoSexo2015 = ModelCircuitoSexo2015;
    }

    public DenunciasPjControladorSubcircuitoSexo() {
    }
    
    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        ModelCircuitoSexo2014 = initGraficoCircuitoSexo2014();
        ModelCircuitoSexo2015 = initGraficoCircuitoSexo2015();

    }

    private void reinit() {
        this.lstDatosDadoCircuitoSexoFemenino = new ArrayList<DenunciasPj>();
        this.lstDatosDadoCircuitoSexoFemenino1 = new ArrayList<DenunciasPj>();
        this.lstDatosDadoCircuitoSexoMasculino = new ArrayList<DenunciasPj>();
        this.lstDatosDadoCircuitoSexoMasculino1 = new ArrayList<DenunciasPj>();

        this.init();

    }

    private CartesianChartModel initGraficoCircuitoSexo2014() {

        CartesianChartModel model = new CartesianChartModel();

        try {

            lstDatosSubcircuito = FDenunciasPj.ObtenerDatosSubcircuito();
            ChartSeries hombres = new ChartSeries();
            ChartSeries mujeres = new ChartSeries();
            hombres.setLabel("Masculino");
            mujeres.setLabel("Femenino");
            for (DenunciasPj lstDatosP1 : lstDatosSubcircuito) {
                lstDatosDadoCircuitoSexoMasculino = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioSubcircuitoSexo(2014, lstDatosP1.getSubcircuito(), "MASCULINO");
                hombres.set(lstDatosP1.getSubcircuito(), lstDatosDadoCircuitoSexoMasculino.size());

                lstDatosDadoCircuitoSexoFemenino = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioSubcircuitoSexo(2014, lstDatosP1.getSubcircuito(), "FEMENINO");
                mujeres.set(lstDatosP1.getSubcircuito(), lstDatosDadoCircuitoSexoFemenino.size());

            }
            model.addSeries(hombres);
            model.addSeries(mujeres);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

   private CartesianChartModel initGraficoCircuitoSexo2015() {

        CartesianChartModel model = new CartesianChartModel();

        try {

            lstDatosSubcircuito = FDenunciasPj.ObtenerDatosSubcircuito();
            ChartSeries hombres = new ChartSeries();
            ChartSeries mujeres = new ChartSeries();
            hombres.setLabel("Masculino");
            mujeres.setLabel("Femenino");
            for (DenunciasPj lstDatosP1 : lstDatosSubcircuito) {
                lstDatosDadoCircuitoSexoMasculino1 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioSubcircuitoSexo(2015, lstDatosP1.getSubcircuito(), "MASCULINO");
                hombres.set(lstDatosP1.getSubcircuito(), lstDatosDadoCircuitoSexoMasculino1.size());

                lstDatosDadoCircuitoSexoFemenino1 = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioSubcircuitoSexo(2015, lstDatosP1.getSubcircuito(), "FEMENINO");
                mujeres.set(lstDatosP1.getSubcircuito(), lstDatosDadoCircuitoSexoFemenino1.size());

            }
            model.addSeries(hombres);
            model.addSeries(mujeres);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
