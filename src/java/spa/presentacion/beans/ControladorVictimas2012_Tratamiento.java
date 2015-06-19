/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import recursos.Util;
import spa.logica.clases.Victimas_2012;
import spa.logica.funciones.FVictimas_2012;

/**
 *
 * @author Pc05
 */
@ManagedBean
@RequestScoped
public class ControladorVictimas2012_Tratamiento {

    /**
     * Creates a new instance of ControladorVictimas2012_Tratamiento
     */
    private ArrayList<Victimas_2012> lstDatos;
    private ArrayList<Victimas_2012> lstDatos1;
    private ArrayList<Victimas_2012> lstDatosNA;
    private ArrayList<Victimas_2012> lstDatosFisica;
    private ArrayList<Victimas_2012> lstDatosFisicaPsicologica;
    private ArrayList<Victimas_2012> lstDatosFisicaPsicologicaSexual;
    private ArrayList<Victimas_2012> lstDatosFisicaSexual;
    private ArrayList<Victimas_2012> lstDatosPsicologica;
    private ArrayList<Victimas_2012> lstDatosPsicologicaSexual;
    private ArrayList<Victimas_2012> lstDatosSexual;
    private PieChartModel pieViolencia;
    private ArrayList<Victimas_2012> lstDatosDadoViolencia;
    private CartesianChartModel lineTipoViolencia;
    private CartesianChartModel lineTipoViolencia2;
    private Victimas_2012 datoSel;

    public PieChartModel getPieViolencia() {
        return pieViolencia;
    }

    public void setPieViolencia(PieChartModel pieViolencia) {
        this.pieViolencia = pieViolencia;
    }

    public ArrayList<Victimas_2012> getLstDatosNA() {
        return lstDatosNA;
    }

    public void setLstDatosNA(ArrayList<Victimas_2012> lstDatosNA) {
        this.lstDatosNA = lstDatosNA;
    }

    public ArrayList<Victimas_2012> getLstDatosFisica() {
        return lstDatosFisica;
    }

    public void setLstDatosFisica(ArrayList<Victimas_2012> lstDatosFisica) {
        this.lstDatosFisica = lstDatosFisica;
    }

    public ArrayList<Victimas_2012> getLstDatosFisicaPsicologica() {
        return lstDatosFisicaPsicologica;
    }

    public void setLstDatosFisicaPsicologica(ArrayList<Victimas_2012> lstDatosFisicaPsicologica) {
        this.lstDatosFisicaPsicologica = lstDatosFisicaPsicologica;
    }

    public ArrayList<Victimas_2012> getLstDatosFisicaPsicologicaSexual() {
        return lstDatosFisicaPsicologicaSexual;
    }

    public void setLstDatosFisicaPsicologicaSexual(ArrayList<Victimas_2012> lstDatosFisicaPsicologicaSexual) {
        this.lstDatosFisicaPsicologicaSexual = lstDatosFisicaPsicologicaSexual;
    }

    public ArrayList<Victimas_2012> getLstDatosFisicaSexual() {
        return lstDatosFisicaSexual;
    }

    public void setLstDatosFisicaSexual(ArrayList<Victimas_2012> lstDatosFisicaSexual) {
        this.lstDatosFisicaSexual = lstDatosFisicaSexual;
    }

    public ArrayList<Victimas_2012> getLstDatosPsicologica() {
        return lstDatosPsicologica;
    }

    public void setLstDatosPsicologica(ArrayList<Victimas_2012> lstDatosPsicologica) {
        this.lstDatosPsicologica = lstDatosPsicologica;
    }

    public ArrayList<Victimas_2012> getLstDatosPsicologicaSexual() {
        return lstDatosPsicologicaSexual;
    }

    public void setLstDatosPsicologicaSexual(ArrayList<Victimas_2012> lstDatosPsicologicaSexual) {
        this.lstDatosPsicologicaSexual = lstDatosPsicologicaSexual;
    }

    public ArrayList<Victimas_2012> getLstDatosSexual() {
        return lstDatosSexual;
    }

    public void setLstDatosSexual(ArrayList<Victimas_2012> lstDatosSexual) {
        this.lstDatosSexual = lstDatosSexual;
    }

    public CartesianChartModel getLineTipoViolencia2() {
        return lineTipoViolencia2;
    }

    public void setLineTipoViolencia2(CartesianChartModel lineTipoViolencia2) {
        this.lineTipoViolencia2 = lineTipoViolencia2;
    }

    public Victimas_2012 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Victimas_2012 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Victimas_2012> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Victimas_2012> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<Victimas_2012> getLstDatos1() {
        return lstDatos1;
    }

    public void setLstDatos1(ArrayList<Victimas_2012> lstDatos1) {
        this.lstDatos1 = lstDatos1;
    }

    public ArrayList<Victimas_2012> getLstDatosDadoViolencia() {
        return lstDatosDadoViolencia;
    }

    public void setLstDatosDadoViolencia(ArrayList<Victimas_2012> lstDatosDadoViolencia) {
        this.lstDatosDadoViolencia = lstDatosDadoViolencia;
    }

    public CartesianChartModel getLineTipoViolencia() {
        return lineTipoViolencia;
    }

    public void setLineTipoViolencia(CartesianChartModel lineTipoViolencia) {
        this.lineTipoViolencia = lineTipoViolencia;
    }

    public ControladorVictimas2012_Tratamiento() {
        this.reinit();
    }

    public void grficar() {
        lineTipoViolencia = initTipoViolencia();
        lineTipoViolencia2 = initTipoViolencia2();
        pieViolencia = pieViolencia();

    }

    @PostConstruct
    public void init() {
        grficar();
    }

    private void reinit() {
        this.lstDatos = new ArrayList<Victimas_2012>();
        this.lstDatos1 = new ArrayList<Victimas_2012>();
        this.lstDatosDadoViolencia = new ArrayList<Victimas_2012>();

        this.cargarDatos();
        this.init();

    }

    public void cargarDatos() {
        try {

            this.lstDatos = FVictimas_2012.ObtenerDatos();
            this.datoSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getN_denuncia());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    private CartesianChartModel initTipoViolencia() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos1 = FVictimas_2012.ObtenerDatos();
            ChartSeries Violencia = new ChartSeries();
            Violencia.setLabel("Tipos de Violencia");
            for (int i = 0; i < lstDatos1.size(); i++) {
                lstDatosDadoViolencia = FVictimas_2012.ObtenerDatosDadoCircuito(lstDatos1.get(i).getTipos_agre());
                Violencia.set(lstDatos1.get(i).getTipos_agre(), lstDatosDadoViolencia.size());
            }
            model.addSeries(Violencia);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel initTipoViolencia2() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosFisica = FVictimas_2012.ObtenerDatosDadoViolencia("Fisica");
            lstDatosFisicaPsicologica = FVictimas_2012.ObtenerDatosDadoViolencia("Fisica y Psicologica");
            lstDatosFisicaPsicologicaSexual = FVictimas_2012.ObtenerDatosDadoViolencia("Fisica, Psicologica y Sexual");
            lstDatosFisicaSexual = FVictimas_2012.ObtenerDatosDadoViolencia("Fisica y Sexual");
            lstDatosPsicologica = FVictimas_2012.ObtenerDatosDadoViolencia("Psicologica");
            lstDatosPsicologicaSexual = FVictimas_2012.ObtenerDatosDadoViolencia("Psicologica y Sexual");
            lstDatosSexual = FVictimas_2012.ObtenerDatosDadoViolencia("Sexual");
            lstDatosNA = FVictimas_2012.ObtenerDatosDadoViolencia("N/A");

            ChartSeries Violencia = new ChartSeries();
            Violencia.setLabel("Tipos de Violencia");
            Violencia.set("Fisica", lstDatosFisica.size());
            Violencia.set("Fisica y Psicologica", lstDatosFisicaPsicologica.size());
            Violencia.set("Fisica, Psicologica y Sexual", lstDatosFisicaPsicologicaSexual.size());
            Violencia.set("Fisica y Sexual", lstDatosFisicaSexual.size());
            Violencia.set("Psicologica", lstDatosPsicologica.size());
            Violencia.set("Psicologica y Sexual", lstDatosPsicologicaSexual.size());
            Violencia.set("Sexual", lstDatosSexual.size());
            Violencia.set("Sin datos", lstDatosNA.size());

            model.addSeries(Violencia);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private PieChartModel pieViolencia() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            lstDatosFisica = FVictimas_2012.ObtenerDatosDadoViolencia("Fisica");
            lstDatosFisicaPsicologica = FVictimas_2012.ObtenerDatosDadoViolencia("Fisica y Psicologica");
            lstDatosFisicaPsicologicaSexual = FVictimas_2012.ObtenerDatosDadoViolencia("Fisica, Psicologica y Sexual");
            lstDatosFisicaSexual = FVictimas_2012.ObtenerDatosDadoViolencia("Fisica y Sexual");
            lstDatosPsicologica = FVictimas_2012.ObtenerDatosDadoViolencia("Psicologica");
            lstDatosPsicologicaSexual = FVictimas_2012.ObtenerDatosDadoViolencia("Psicologica y Sexual");
            lstDatosSexual = FVictimas_2012.ObtenerDatosDadoViolencia("Sexual");
            lstDatosNA = FVictimas_2012.ObtenerDatosDadoViolencia("N/A");

            pieModel.set("Fisica", lstDatosFisica.size());
            pieModel.set("Fisica y Psicologica", lstDatosFisicaPsicologica.size());
            pieModel.set("Fisica, Psicologica y Sexual", lstDatosFisicaPsicologicaSexual.size());
            pieModel.set("Fisica y Sexual", lstDatosFisicaSexual.size());
            pieModel.set("Psicologica", lstDatosPsicologica.size());
            pieModel.set("Psicologica y Sexual", lstDatosPsicologicaSexual.size());
            pieModel.set("Sexual", lstDatosSexual.size());
            pieModel.set("Sin datos", lstDatosNA.size());

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }
}
