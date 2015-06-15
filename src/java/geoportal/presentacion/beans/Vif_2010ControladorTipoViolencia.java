/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.funciones.FVif_2010;
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
public class Vif_2010ControladorTipoViolencia {

    /**
     * Creates a new instance of Vif_2010ControladorTipoViolencia
     */
    private CartesianChartModel lineModel;
    private CartesianChartModel lineModel2;
    private PieChartModel pieModel;    
    private ArrayList<Vif_2010> lstDatosFisica_2010;
    private ArrayList<Vif_2010> lstDatosFisicaPsicologica_2010;
    private ArrayList<Vif_2010> lstDatosFisicaPsicologicaSexual_2010;
    private ArrayList<Vif_2010> lstDatosFisicaSexual_2010;
    private ArrayList<Vif_2010> lstDatosPsicologica_2010;
    private ArrayList<Vif_2010> lstDatosPsicologicaSexual_2010;
    private ArrayList<Vif_2010> lstDatosSexual_2010;
    private ArrayList<Vif_2010> lstDatosFisicaM;
    private ArrayList<Vif_2010> lstDatosFisicaF;
    private ArrayList<Vif_2010> lstDatosFisicaPsicologicaSexualM;
    private ArrayList<Vif_2010> lstDatosFisicaPsicologicaSexualF;
    private ArrayList<Vif_2010> lstDatosFisicaPsicologiaF;
    private ArrayList<Vif_2010> lstDatosFisicaPsicologiaM;
    private ArrayList<Vif_2010> lstDatosPsicologiaM;
    private ArrayList<Vif_2010> lstDatosPsicologiaF;
    private ArrayList<Vif_2010> lstDatosPsicologicaSexualF;
    private ArrayList<Vif_2010> lstDatosPsicologicaSexualM;
    private ArrayList<Vif_2010> lstDatosFisicaSexualM;
    private ArrayList<Vif_2010> lstDatosFisicaSexualF;
    private ArrayList<Vif_2010> lstDatosSexualM;
    private ArrayList<Vif_2010> lstDatosSexualF;

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }

    public CartesianChartModel getLineModel2() {
        return lineModel2;
    }

    public void setLineModel2(CartesianChartModel lineModel2) {
        this.lineModel2 = lineModel2;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaM() {
        return lstDatosFisicaM;
    }

    public void setLstDatosFisicaM(ArrayList<Vif_2010> lstDatosFisicaM) {
        this.lstDatosFisicaM = lstDatosFisicaM;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaF() {
        return lstDatosFisicaF;
    }

    public void setLstDatosFisicaF(ArrayList<Vif_2010> lstDatosFisicaF) {
        this.lstDatosFisicaF = lstDatosFisicaF;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaPsicologicaSexualM() {
        return lstDatosFisicaPsicologicaSexualM;
    }

    public void setLstDatosFisicaPsicologicaSexualM(ArrayList<Vif_2010> lstDatosFisicaPsicologicaSexualM) {
        this.lstDatosFisicaPsicologicaSexualM = lstDatosFisicaPsicologicaSexualM;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaPsicologicaSexualF() {
        return lstDatosFisicaPsicologicaSexualF;
    }

    public void setLstDatosFisicaPsicologicaSexualF(ArrayList<Vif_2010> lstDatosFisicaPsicologicaSexualF) {
        this.lstDatosFisicaPsicologicaSexualF = lstDatosFisicaPsicologicaSexualF;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaPsicologiaF() {
        return lstDatosFisicaPsicologiaF;
    }

    public void setLstDatosFisicaPsicologiaF(ArrayList<Vif_2010> lstDatosFisicaPsicologiaF) {
        this.lstDatosFisicaPsicologiaF = lstDatosFisicaPsicologiaF;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaPsicologiaM() {
        return lstDatosFisicaPsicologiaM;
    }

    public void setLstDatosFisicaPsicologiaM(ArrayList<Vif_2010> lstDatosFisicaPsicologiaM) {
        this.lstDatosFisicaPsicologiaM = lstDatosFisicaPsicologiaM;
    }

    public ArrayList<Vif_2010> getLstDatosPsicologiaM() {
        return lstDatosPsicologiaM;
    }

    public void setLstDatosPsicologiaM(ArrayList<Vif_2010> lstDatosPsicologiaM) {
        this.lstDatosPsicologiaM = lstDatosPsicologiaM;
    }

    public ArrayList<Vif_2010> getLstDatosPsicologiaF() {
        return lstDatosPsicologiaF;
    }

    public void setLstDatosPsicologiaF(ArrayList<Vif_2010> lstDatosPsicologiaF) {
        this.lstDatosPsicologiaF = lstDatosPsicologiaF;
    }

    public ArrayList<Vif_2010> getLstDatosPsicologicaSexualF() {
        return lstDatosPsicologicaSexualF;
    }

    public void setLstDatosPsicologicaSexualF(ArrayList<Vif_2010> lstDatosPsicologicaSexualF) {
        this.lstDatosPsicologicaSexualF = lstDatosPsicologicaSexualF;
    }

    public ArrayList<Vif_2010> getLstDatosPsicologicaSexualM() {
        return lstDatosPsicologicaSexualM;
    }

    public void setLstDatosPsicologicaSexualM(ArrayList<Vif_2010> lstDatosPsicologicaSexualM) {
        this.lstDatosPsicologicaSexualM = lstDatosPsicologicaSexualM;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaSexualM() {
        return lstDatosFisicaSexualM;
    }

    public void setLstDatosFisicaSexualM(ArrayList<Vif_2010> lstDatosFisicaSexualM) {
        this.lstDatosFisicaSexualM = lstDatosFisicaSexualM;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaSexualF() {
        return lstDatosFisicaSexualF;
    }

    public void setLstDatosFisicaSexualF(ArrayList<Vif_2010> lstDatosFisicaSexualF) {
        this.lstDatosFisicaSexualF = lstDatosFisicaSexualF;
    }

    public ArrayList<Vif_2010> getLstDatosSexualM() {
        return lstDatosSexualM;
    }

    public void setLstDatosSexualM(ArrayList<Vif_2010> lstDatosSexualM) {
        this.lstDatosSexualM = lstDatosSexualM;
    }

    public ArrayList<Vif_2010> getLstDatosSexualF() {
        return lstDatosSexualF;
    }

    public void setLstDatosSexualF(ArrayList<Vif_2010> lstDatosSexualF) {
        this.lstDatosSexualF = lstDatosSexualF;
    }        

    public CartesianChartModel getLineModel() {
        return lineModel;
    }

    public void setLineModel(CartesianChartModel lineModel) {
        this.lineModel = lineModel;
    }

    public ArrayList<Vif_2010> getLstDatosFisica_2010() {
        return lstDatosFisica_2010;
    }

    public void setLstDatosFisica_2010(ArrayList<Vif_2010> lstDatosFisica_2010) {
        this.lstDatosFisica_2010 = lstDatosFisica_2010;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaPsicologica_2010() {
        return lstDatosFisicaPsicologica_2010;
    }

    public void setLstDatosFisicaPsicologica_2010(ArrayList<Vif_2010> lstDatosFisicaPsicologica_2010) {
        this.lstDatosFisicaPsicologica_2010 = lstDatosFisicaPsicologica_2010;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaPsicologicaSexual_2010() {
        return lstDatosFisicaPsicologicaSexual_2010;
    }

    public void setLstDatosFisicaPsicologicaSexual_2010(ArrayList<Vif_2010> lstDatosFisicaPsicologicaSexual_2010) {
        this.lstDatosFisicaPsicologicaSexual_2010 = lstDatosFisicaPsicologicaSexual_2010;
    }

    public ArrayList<Vif_2010> getLstDatosFisicaSexual_2010() {
        return lstDatosFisicaSexual_2010;
    }

    public void setLstDatosFisicaSexual_2010(ArrayList<Vif_2010> lstDatosFisicaSexual_2010) {
        this.lstDatosFisicaSexual_2010 = lstDatosFisicaSexual_2010;
    }

    public ArrayList<Vif_2010> getLstDatosPsicologica_2010() {
        return lstDatosPsicologica_2010;
    }

    public void setLstDatosPsicologica_2010(ArrayList<Vif_2010> lstDatosPsicologica_2010) {
        this.lstDatosPsicologica_2010 = lstDatosPsicologica_2010;
    }

    public ArrayList<Vif_2010> getLstDatosPsicologicaSexual_2010() {
        return lstDatosPsicologicaSexual_2010;
    }

    public void setLstDatosPsicologicaSexual_2010(ArrayList<Vif_2010> lstDatosPsicologicaSexual_2010) {
        this.lstDatosPsicologicaSexual_2010 = lstDatosPsicologicaSexual_2010;
    }

    public ArrayList<Vif_2010> getLstDatosSexual_2010() {
        return lstDatosSexual_2010;
    }

    public void setLstDatosSexual_2010(ArrayList<Vif_2010> lstDatosSexual_2010) {
        this.lstDatosSexual_2010 = lstDatosSexual_2010;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        lineModel = initContrasteTipoViolencia();
        lineModel2=initCategoryTipoViolenciaSexo();
        pieModel=pieTipoViolencia();
    }

    public Vif_2010ControladorTipoViolencia() {
        this.reinit();
    }

    private void reinit() {
        this.init();
    }

    private CartesianChartModel initContrasteTipoViolencia() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosFisica_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("FISICA");
            lstDatosFisicaPsicologica_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("FISICA Y PSICOLOGICA");
            lstDatosFisicaPsicologicaSexual_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosFisicaSexual_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("FISICA Y SEXUAL");
            lstDatosPsicologica_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("PSICOLOGICA");
            lstDatosPsicologicaSexual_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("PSICOLOGICA Y SEXUAL");
            lstDatosSexual_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("SEXUAL");

            ChartSeries Vif_2010 = new ChartSeries();
            Vif_2010.setLabel("Casos 2010");
            Vif_2010.set("FISICA", lstDatosFisica_2010.size());
            Vif_2010.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologica_2010.size());
            Vif_2010.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexual_2010.size());
            Vif_2010.set("FISICA Y SEXUAL", lstDatosFisicaSexual_2010.size());
            Vif_2010.set("PSICOLOGICA", lstDatosPsicologica_2010.size());
            Vif_2010.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexual_2010.size());
            Vif_2010.set("SEXUAL", lstDatosSexual_2010.size());

            model.addSeries(Vif_2010);

        } catch (Exception e) {
             Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    
    private CartesianChartModel initCategoryTipoViolenciaSexo() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosFisicaM = FVif_2010.ObtenerDatosDadoTipoViolenciaSexoVictima("M", "FISICA");
            lstDatosFisicaPsicologiaM = FVif_2010.ObtenerDatosDadoTipoViolenciaSexoVictima("M", "FISICA Y PSICOLOGICA");
            lstDatosFisicaPsicologicaSexualM = FVif_2010.ObtenerDatosDadoTipoViolenciaSexoVictima("M", "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosFisicaSexualM = FVif_2010.ObtenerDatosDadoTipoViolenciaSexoVictima("M", "FISICA Y SEXUAL");
            lstDatosPsicologiaM = FVif_2010.ObtenerDatosDadoTipoViolenciaSexoVictima("M", "PSICOLOGICA");
            lstDatosPsicologicaSexualM = FVif_2010.ObtenerDatosDadoTipoViolenciaSexoVictima("M", "PSICOLOGICA Y SEXUAL");
            lstDatosSexualM = FVif_2010.ObtenerDatosDadoTipoViolenciaSexoVictima("M", "SEXUAL");

            lstDatosFisicaF = FVif_2010.ObtenerDatosDadoTipoViolenciaSexoVictima("F", "FISICA");
            lstDatosFisicaPsicologiaF = FVif_2010.ObtenerDatosDadoTipoViolenciaSexoVictima("F", "FISICA Y PSICOLOGICA");
            lstDatosFisicaPsicologicaSexualF = FVif_2010.ObtenerDatosDadoTipoViolenciaSexoVictima("F", "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosFisicaSexualF = FVif_2010.ObtenerDatosDadoTipoViolenciaSexoVictima("F", "FISICA Y SEXUAL");
            lstDatosPsicologiaF = FVif_2010.ObtenerDatosDadoTipoViolenciaSexoVictima("F", "PSICOLOGICA");
            lstDatosPsicologicaSexualF = FVif_2010.ObtenerDatosDadoTipoViolenciaSexoVictima("F", "PSICOLOGICA Y SEXUAL");
            lstDatosSexualF = FVif_2010.ObtenerDatosDadoTipoViolenciaSexoVictima("F", "SEXUAL");

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            Masculino.set("FISICA", lstDatosFisicaM.size());
            Masculino.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologiaM.size());
            Masculino.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexualM.size());
            Masculino.set("FISICA Y SEXUAL", lstDatosFisicaSexualM.size());
            Masculino.set("PSICOLOGICA", lstDatosPsicologiaM.size());
            Masculino.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexualM.size());
            Masculino.set("SEXUAL", lstDatosSexualM.size());

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            Femenino.set("FISICA", lstDatosFisicaF.size());
            Femenino.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologiaF.size());
            Femenino.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexualF.size());
            Femenino.set("FISICA Y SEXUAL", lstDatosFisicaSexualF.size());
            Femenino.set("PSICOLOGICA", lstDatosPsicologiaF.size());
            Femenino.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexualF.size());
            Femenino.set("SEXUAL", lstDatosSexualF.size());

            model.addSeries(Femenino);
            model.addSeries(Masculino);
            

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
     private PieChartModel pieTipoViolencia() {
        PieChartModel pieModel = new PieChartModel();
         try {
              pieModel = new PieChartModel();
            lstDatosFisica_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("FISICA");
            lstDatosFisicaPsicologica_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("FISICA Y PSICOLOGICA");
            lstDatosFisicaPsicologicaSexual_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosFisicaSexual_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("FISICA Y SEXUAL");
            lstDatosPsicologica_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("PSICOLOGICA");
            lstDatosPsicologicaSexual_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("PSICOLOGICA Y SEXUAL");
            lstDatosSexual_2010 = FVif_2010.ObtenerDatosDadoTipoViolencia("SEXUAL");
            
            
            pieModel.set("FISICA", lstDatosFisica_2010.size());
            pieModel.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologica_2010.size());
            pieModel.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexual_2010.size());
            pieModel.set("FISICA Y SEXUAL", lstDatosFisicaSexual_2010.size());
            pieModel.set("PSICOLOGICA", lstDatosPsicologica_2010.size());
            pieModel.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexual_2010.size());
            pieModel.set("SEXUAL", lstDatosSexual_2010.size());
         } catch (Exception e) {
             Util.addErrorMessage(e,"Error");
         }
        return pieModel;
     }

}
