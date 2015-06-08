/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2011;
import geoportal.logica.funciones.FVif_2011;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import geoportal.logica.clases.Vif_2011;
import geoportal.logica.funciones.FVif_2011;
import javax.annotation.PostConstruct;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Vif_2011ControladorTipoViolencia {

    /**
     * Creates a new instance of Vif_2011ControladorTipoViolencia
     */
    private CartesianChartModel lineModel;
    private CartesianChartModel lineModel2;
    private PieChartModel pieModel;
    private ArrayList<Vif_2011> lstDatosControl;
    private Vif_2011 datoSel;
    private ArrayList<Vif_2011> lstDatosV;
    private ArrayList<Vif_2011> lstDatosDadoV;
    private ArrayList<Vif_2011> lstDatosFisicaM;
    private ArrayList<Vif_2011> lstDatosFisicaF;
    private ArrayList<Vif_2011> lstDatosFisicaPsicologicaSexualM;
    private ArrayList<Vif_2011> lstDatosFisicaPsicologicaSexualF;
    private ArrayList<Vif_2011> lstDatosFisicaPsicologiaF;
    private ArrayList<Vif_2011> lstDatosFisicaPsicologiaM;
    private ArrayList<Vif_2011> lstDatosPsicologiaM;
    private ArrayList<Vif_2011> lstDatosPsicologiaF;
    private ArrayList<Vif_2011> lstDatosPsicologicaSexualF;
    private ArrayList<Vif_2011> lstDatosPsicologicaSexualM;
    private ArrayList<Vif_2011> lstDatosFisicaSexualM;
    private ArrayList<Vif_2011> lstDatosFisicaSexualF;
    private ArrayList<Vif_2011> lstDatosSexualM;
    private ArrayList<Vif_2011> lstDatosSexualF;

    private ArrayList<Vif_2011> lstDatosFisica;
    private ArrayList<Vif_2011> lstDatosFisicaPsicologicaSexual;
    private ArrayList<Vif_2011> lstDatosFisicaPsicologia;
    private ArrayList<Vif_2011> lstDatosPsicologia;
    private ArrayList<Vif_2011> lstDatosPsicologicaSexual;
    private ArrayList<Vif_2011> lstDatosFisicaSexual;
    private ArrayList<Vif_2011> lstDatosSexual;

    public ArrayList<Vif_2011> getLstDatosFisica() {
        return lstDatosFisica;
    }

    public void setLstDatosFisica(ArrayList<Vif_2011> lstDatosFisica) {
        this.lstDatosFisica = lstDatosFisica;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaPsicologicaSexual() {
        return lstDatosFisicaPsicologicaSexual;
    }

    public void setLstDatosFisicaPsicologicaSexual(ArrayList<Vif_2011> lstDatosFisicaPsicologicaSexual) {
        this.lstDatosFisicaPsicologicaSexual = lstDatosFisicaPsicologicaSexual;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaPsicologia() {
        return lstDatosFisicaPsicologia;
    }

    public void setLstDatosFisicaPsicologia(ArrayList<Vif_2011> lstDatosFisicaPsicologia) {
        this.lstDatosFisicaPsicologia = lstDatosFisicaPsicologia;
    }

    public ArrayList<Vif_2011> getLstDatosPsicologia() {
        return lstDatosPsicologia;
    }

    public void setLstDatosPsicologia(ArrayList<Vif_2011> lstDatosPsicologia) {
        this.lstDatosPsicologia = lstDatosPsicologia;
    }

    public ArrayList<Vif_2011> getLstDatosPsicologicaSexual() {
        return lstDatosPsicologicaSexual;
    }

    public void setLstDatosPsicologicaSexual(ArrayList<Vif_2011> lstDatosPsicologicaSexual) {
        this.lstDatosPsicologicaSexual = lstDatosPsicologicaSexual;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaSexual() {
        return lstDatosFisicaSexual;
    }

    public void setLstDatosFisicaSexual(ArrayList<Vif_2011> lstDatosFisicaSexual) {
        this.lstDatosFisicaSexual = lstDatosFisicaSexual;
    }

    public ArrayList<Vif_2011> getLstDatosSexual() {
        return lstDatosSexual;
    }

    public void setLstDatosSexual(ArrayList<Vif_2011> lstDatosSexual) {
        this.lstDatosSexual = lstDatosSexual;
    }

    public CartesianChartModel getLineModel2() {
        return lineModel2;
    }

    public void setLineModel2(CartesianChartModel lineModel2) {
        this.lineModel2 = lineModel2;
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaM() {
        return lstDatosFisicaM;
    }

    public void setLstDatosFisicaM(ArrayList<Vif_2011> lstDatosFisicaM) {
        this.lstDatosFisicaM = lstDatosFisicaM;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaF() {
        return lstDatosFisicaF;
    }

    public void setLstDatosFisicaF(ArrayList<Vif_2011> lstDatosFisicaF) {
        this.lstDatosFisicaF = lstDatosFisicaF;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaPsicologicaSexualM() {
        return lstDatosFisicaPsicologicaSexualM;
    }

    public void setLstDatosFisicaPsicologicaSexualM(ArrayList<Vif_2011> lstDatosFisicaPsicologicaSexualM) {
        this.lstDatosFisicaPsicologicaSexualM = lstDatosFisicaPsicologicaSexualM;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaPsicologicaSexualF() {
        return lstDatosFisicaPsicologicaSexualF;
    }

    public void setLstDatosFisicaPsicologicaSexualF(ArrayList<Vif_2011> lstDatosFisicaPsicologicaSexualF) {
        this.lstDatosFisicaPsicologicaSexualF = lstDatosFisicaPsicologicaSexualF;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaPsicologiaF() {
        return lstDatosFisicaPsicologiaF;
    }

    public void setLstDatosFisicaPsicologiaF(ArrayList<Vif_2011> lstDatosFisicaPsicologiaF) {
        this.lstDatosFisicaPsicologiaF = lstDatosFisicaPsicologiaF;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaPsicologiaM() {
        return lstDatosFisicaPsicologiaM;
    }

    public void setLstDatosFisicaPsicologiaM(ArrayList<Vif_2011> lstDatosFisicaPsicologiaM) {
        this.lstDatosFisicaPsicologiaM = lstDatosFisicaPsicologiaM;
    }

    public ArrayList<Vif_2011> getLstDatosPsicologiaM() {
        return lstDatosPsicologiaM;
    }

    public void setLstDatosPsicologiaM(ArrayList<Vif_2011> lstDatosPsicologiaM) {
        this.lstDatosPsicologiaM = lstDatosPsicologiaM;
    }

    public ArrayList<Vif_2011> getLstDatosPsicologiaF() {
        return lstDatosPsicologiaF;
    }

    public void setLstDatosPsicologiaF(ArrayList<Vif_2011> lstDatosPsicologiaF) {
        this.lstDatosPsicologiaF = lstDatosPsicologiaF;
    }

    public ArrayList<Vif_2011> getLstDatosPsicologicaSexualF() {
        return lstDatosPsicologicaSexualF;
    }

    public void setLstDatosPsicologicaSexualF(ArrayList<Vif_2011> lstDatosPsicologicaSexualF) {
        this.lstDatosPsicologicaSexualF = lstDatosPsicologicaSexualF;
    }

    public ArrayList<Vif_2011> getLstDatosPsicologicaSexualM() {
        return lstDatosPsicologicaSexualM;
    }

    public void setLstDatosPsicologicaSexualM(ArrayList<Vif_2011> lstDatosPsicologicaSexualM) {
        this.lstDatosPsicologicaSexualM = lstDatosPsicologicaSexualM;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaSexualM() {
        return lstDatosFisicaSexualM;
    }

    public void setLstDatosFisicaSexualM(ArrayList<Vif_2011> lstDatosFisicaSexualM) {
        this.lstDatosFisicaSexualM = lstDatosFisicaSexualM;
    }

    public ArrayList<Vif_2011> getLstDatosFisicaSexualF() {
        return lstDatosFisicaSexualF;
    }

    public void setLstDatosFisicaSexualF(ArrayList<Vif_2011> lstDatosFisicaSexualF) {
        this.lstDatosFisicaSexualF = lstDatosFisicaSexualF;
    }

    public ArrayList<Vif_2011> getLstDatosSexualM() {
        return lstDatosSexualM;
    }

    public void setLstDatosSexualM(ArrayList<Vif_2011> lstDatosSexualM) {
        this.lstDatosSexualM = lstDatosSexualM;
    }

    public ArrayList<Vif_2011> getLstDatosSexualF() {
        return lstDatosSexualF;
    }

    public void setLstDatosSexualF(ArrayList<Vif_2011> lstDatosSexualF) {
        this.lstDatosSexualF = lstDatosSexualF;
    }

    public CartesianChartModel getLineModel() {
        return lineModel;
    }

    public void setLineModel(CartesianChartModel lineModel) {
        this.lineModel = lineModel;
    }

    public ArrayList<Vif_2011> getLstDatosControl() {
        return lstDatosControl;
    }

    public void setLstDatosControl(ArrayList<Vif_2011> lstDatosControl) {
        this.lstDatosControl = lstDatosControl;
    }

    public Vif_2011 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2011 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2011> getLstDatosV() {
        return lstDatosV;
    }

    public void setLstDatosV(ArrayList<Vif_2011> lstDatosV) {
        this.lstDatosV = lstDatosV;
    }

    public ArrayList<Vif_2011> getLstDatosDadoV() {
        return lstDatosDadoV;
    }

    public void setLstDatosDadoV(ArrayList<Vif_2011> lstDatosDadoV) {
        this.lstDatosDadoV = lstDatosDadoV;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        lineModel = initCategoryTipoViolencia();
        lineModel2 = initCategoryTipoViolenciaSexo();
        pieModel=pieTipoViolencia();
    }

    public Vif_2011ControladorTipoViolencia() {
        this.reinit();
    }

    private void reinit() {

        this.lstDatosControl = new ArrayList<Vif_2011>();
        this.lstDatosV = new ArrayList<Vif_2011>();
        this.lstDatosDadoV = new ArrayList<Vif_2011>();
        this.datoSel = new Vif_2011();

        this.init();
        this.cargarDatos();

    }

    private CartesianChartModel initCategoryTipoViolencia() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstDatosV = FVif_2011.ObtenerDatosTipoViolencia();
            ChartSeries TipoViolencia = new ChartSeries();
            TipoViolencia.setLabel("Tipo de Violencia");
            for (int x = 0; x < lstDatosV.size(); x++) {
                lstDatosDadoV = FVif_2011.ObtenerDatosDadoTipoViolencia(lstDatosV.get(x).getTipo_de_violencia());
                TipoViolencia.set(lstDatosV.get(x).getTipo_de_violencia(), lstDatosDadoV.size());
            }
            model.addSeries(TipoViolencia);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel initCategoryTipoViolenciaSexo() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosFisicaM = FVif_2011.ObtenerDatosDadoTipoViolenciaSexoVictima("M", "FISICA");
            lstDatosFisicaPsicologiaM = FVif_2011.ObtenerDatosDadoTipoViolenciaSexoVictima("M", "FISICA Y PSICOLOGICA");
            lstDatosFisicaPsicologicaSexualM = FVif_2011.ObtenerDatosDadoTipoViolenciaSexoVictima("M", "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosFisicaSexualM = FVif_2011.ObtenerDatosDadoTipoViolenciaSexoVictima("M", "FISICA Y SEXUAL");
            lstDatosPsicologiaM = FVif_2011.ObtenerDatosDadoTipoViolenciaSexoVictima("M", "PSICOLOGICA");
            lstDatosPsicologicaSexualM = FVif_2011.ObtenerDatosDadoTipoViolenciaSexoVictima("M", "PSICOLOGICA Y SEXUAL");
            lstDatosSexualM = FVif_2011.ObtenerDatosDadoTipoViolenciaSexoVictima("M", "SEXUAL");

            lstDatosFisicaF = FVif_2011.ObtenerDatosDadoTipoViolenciaSexoVictima("F", "FISICA");
            lstDatosFisicaPsicologiaF = FVif_2011.ObtenerDatosDadoTipoViolenciaSexoVictima("F", "FISICA Y PSICOLOGICA");
            lstDatosFisicaPsicologicaSexualF = FVif_2011.ObtenerDatosDadoTipoViolenciaSexoVictima("F", "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosFisicaSexualF = FVif_2011.ObtenerDatosDadoTipoViolenciaSexoVictima("F", "FISICA Y SEXUAL");
            lstDatosPsicologiaF = FVif_2011.ObtenerDatosDadoTipoViolenciaSexoVictima("F", "PSICOLOGICA");
            lstDatosPsicologicaSexualF = FVif_2011.ObtenerDatosDadoTipoViolenciaSexoVictima("F", "PSICOLOGICA Y SEXUAL");
            lstDatosSexualF = FVif_2011.ObtenerDatosDadoTipoViolenciaSexoVictima("F", "SEXUAL");

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

            model.addSeries(Masculino);
            model.addSeries(Femenino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private PieChartModel pieTipoViolencia() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            lstDatosFisica = FVif_2011.ObtenerDatosDadoTipoViolencia("FISICA");
            lstDatosFisicaPsicologia = FVif_2011.ObtenerDatosDadoTipoViolencia("FISICA Y PSICOLOGICA");
            lstDatosFisicaPsicologicaSexual = FVif_2011.ObtenerDatosDadoTipoViolencia("FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosFisicaSexual = FVif_2011.ObtenerDatosDadoTipoViolencia("FISICA Y SEXUAL");
            lstDatosPsicologia = FVif_2011.ObtenerDatosDadoTipoViolencia("PSICOLOGICA");
            lstDatosPsicologicaSexual = FVif_2011.ObtenerDatosDadoTipoViolencia("PSICOLOGICA Y SEXUAL");
            lstDatosSexual = FVif_2011.ObtenerDatosDadoTipoViolencia("SEXUAL");
            
            
            pieModel.set("FISICA", lstDatosFisica.size());
            pieModel.set("FISICA Y PSICOLOGICA", lstDatosFisicaPsicologia.size());
            pieModel.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosFisicaPsicologicaSexual.size());
            pieModel.set("FISICA Y SEXUAL", lstDatosFisicaSexual.size());
            pieModel.set("PSICOLOGICA", lstDatosPsicologia.size());
            pieModel.set("PSICOLOGICA Y SEXUAL", lstDatosPsicologicaSexual.size());
            pieModel.set("SEXUAL", lstDatosSexual.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    public void cargarDatos() {
        try {
            this.lstDatosControl = FVif_2011.ObtenerDatos();
            this.datoSel = lstDatosControl.get(0);
            System.out.println(lstDatosControl.get(0).getId());
        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
