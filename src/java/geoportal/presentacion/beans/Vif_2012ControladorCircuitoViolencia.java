/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import geoportal.logica.clases.Vif_2012;
import geoportal.logica.funciones.FVif_2012;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;
import java.util.ArrayList;
import javax.annotation.PostConstruct;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Vif_2012ControladorCircuitoViolencia {

    /**
     * Creates a new instance of Vif_2012ControladorCircuitoViolencia
     */
    private CartesianChartModel lineModelCircuitoViolencia;
    private Vif_2012 objDatos;
    private Vif_2012 datoSel;
    private ArrayList<Vif_2012> lstDatos;
    private ArrayList<Vif_2012> lstDatos24MayoFisica;
    private ArrayList<Vif_2012> lstDatos24MayoPsicologica;
    private ArrayList<Vif_2012> lstDatos24MayoSexual;
    private ArrayList<Vif_2012> lstDatos24MayoFisicaSexual;
    private ArrayList<Vif_2012> lstDatos24MayoFisicaPsicologica;
    private ArrayList<Vif_2012> lstDatos24MayoFisicaPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatos24MayoPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosCamiloPonceFisica;
    private ArrayList<Vif_2012> lstDatosCamiloPoncePsicologica;
    private ArrayList<Vif_2012> lstDatosCamiloPonceSexual;
    private ArrayList<Vif_2012> lstDatosCamiloPonceFisicaSexual;
    private ArrayList<Vif_2012> lstDatosCamiloPonceFisicaPsicologica;
    private ArrayList<Vif_2012> lstDatosCamiloPonceFisicaPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosCamiloPoncePsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosCaminoSolFisica;
    private ArrayList<Vif_2012> lstDatosCaminoSolPsicologica;
    private ArrayList<Vif_2012> lstDatosCaminoSolSexual;
    private ArrayList<Vif_2012> lstDatosCaminoSolFisicaSexual;
    private ArrayList<Vif_2012> lstDatosCaminoSolFisicaPsicologica;
    private ArrayList<Vif_2012> lstDatosCaminoSolFisicaPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosCaminoSolPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosCondamineFisica;
    private ArrayList<Vif_2012> lstDatosCondaminePsicologica;
    private ArrayList<Vif_2012> lstDatosCondamineSexual;
    private ArrayList<Vif_2012> lstDatosCondamineFisicaSexual;
    private ArrayList<Vif_2012> lstDatosCondamineFisicaPsicologica;
    private ArrayList<Vif_2012> lstDatosCondamineFisicaPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosCondaminePsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosLaEstacionFisica;
    private ArrayList<Vif_2012> lstDatosLaEstacionPsicologica;
    private ArrayList<Vif_2012> lstDatosLaEstacionSexual;
    private ArrayList<Vif_2012> lstDatosLaEstacionFisicaSexual;
    private ArrayList<Vif_2012> lstDatosLaEstacionFisicaPsicologica;
    private ArrayList<Vif_2012> lstDatosLaEstacionFisicaPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosLaEstacionPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosLaPazFisica;
    private ArrayList<Vif_2012> lstDatosLaPazPsicologica;
    private ArrayList<Vif_2012> lstDatosLaPazSexual;
    private ArrayList<Vif_2012> lstDatosLaPazFisicaSexual;
    private ArrayList<Vif_2012> lstDatosLaPazFisicaPsicologica;
    private ArrayList<Vif_2012> lstDatosLaPazFisicaPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosLaPazPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosLaPrimaveraFisica;
    private ArrayList<Vif_2012> lstDatosLaPrimaveraPsicologica;
    private ArrayList<Vif_2012> lstDatosLaPrimaveraSexual;
    private ArrayList<Vif_2012> lstDatosLaPrimaveraFisicaSexual;
    private ArrayList<Vif_2012> lstDatosLaPrimaveraFisicaPsicologica;
    private ArrayList<Vif_2012> lstDatosLaPrimaveraFisicaPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosLaPrimaveraPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosPolitecnicaFisica;
    private ArrayList<Vif_2012> lstDatosPolitecnicaPsicologica;
    private ArrayList<Vif_2012> lstDatosPolitecnicaSexual;
    private ArrayList<Vif_2012> lstDatosPolitecnicaFisicaSexual;
    private ArrayList<Vif_2012> lstDatosPolitecnicaFisicaPsicologica;
    private ArrayList<Vif_2012> lstDatosPolitecnicaFisicaPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosPolitecnicaPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosPucaraFisica;
    private ArrayList<Vif_2012> lstDatosPucaraPsicologica;
    private ArrayList<Vif_2012> lstDatosPucaraSexual;
    private ArrayList<Vif_2012> lstDatosPucaraFisicaSexual;
    private ArrayList<Vif_2012> lstDatosPucaraFisicaPsicologica;
    private ArrayList<Vif_2012> lstDatosPucaraFisicaPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosPucaraPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosSanAlfonsoFisica;
    private ArrayList<Vif_2012> lstDatosSanAlfonsoPsicologica;
    private ArrayList<Vif_2012> lstDatosSanAlfonsoSexual;
    private ArrayList<Vif_2012> lstDatosSanAlfonsoFisicaSexual;
    private ArrayList<Vif_2012> lstDatosSanAlfonsoFisicaPsicologica;
    private ArrayList<Vif_2012> lstDatosSanAlfonsoFisicaPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosSanAlfonsoPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosShoppingFisica;
    private ArrayList<Vif_2012> lstDatosShoppingPsicologica;
    private ArrayList<Vif_2012> lstDatosShoppingSexual;
    private ArrayList<Vif_2012> lstDatosShoppingFisicaSexual;
    private ArrayList<Vif_2012> lstDatosShoppingFisicaPsicologica;
    private ArrayList<Vif_2012> lstDatosShoppingFisicaPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosShoppingPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosTerminalTerrestreFisica;
    private ArrayList<Vif_2012> lstDatosTerminalTerrestrePsicologica;
    private ArrayList<Vif_2012> lstDatosTerminalTerrestreSexual;
    private ArrayList<Vif_2012> lstDatosTerminalTerrestreFisicaSexual;
    private ArrayList<Vif_2012> lstDatosTerminalTerrestreFisicaPsicologica;
    private ArrayList<Vif_2012> lstDatosTerminalTerrestreFisicaPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosTerminalTerrestrePsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosYaruquiesFisica;
    private ArrayList<Vif_2012> lstDatosYaruquiesPsicologica;
    private ArrayList<Vif_2012> lstDatosYaruquiesSexual;
    private ArrayList<Vif_2012> lstDatosYaruquiesFisicaSexual;
    private ArrayList<Vif_2012> lstDatosYaruquiesFisicaPsicologica;
    private ArrayList<Vif_2012> lstDatosYaruquiesFisicaPsicologicaSexual;
    private ArrayList<Vif_2012> lstDatosYaruquiesPsicologicaSexual;

    public CartesianChartModel getLineModelCircuitoViolencia() {
        return lineModelCircuitoViolencia;
    }

    public void setLineModelCircuitoViolencia(CartesianChartModel lineModelCircuitoViolencia) {
        this.lineModelCircuitoViolencia = lineModelCircuitoViolencia;
    }

    public Vif_2012 getObjDatos() {
        return objDatos;
    }

    public void setObjDatos(Vif_2012 objDatos) {
        this.objDatos = objDatos;
    }

    public Vif_2012 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2012 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2012> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<Vif_2012> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<Vif_2012> getLstDatos24MayoFisica() {
        return lstDatos24MayoFisica;
    }

    public void setLstDatos24MayoFisica(ArrayList<Vif_2012> lstDatos24MayoFisica) {
        this.lstDatos24MayoFisica = lstDatos24MayoFisica;
    }

    public ArrayList<Vif_2012> getLstDatos24MayoPsicologica() {
        return lstDatos24MayoPsicologica;
    }

    public void setLstDatos24MayoPsicologica(ArrayList<Vif_2012> lstDatos24MayoPsicologica) {
        this.lstDatos24MayoPsicologica = lstDatos24MayoPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatos24MayoSexual() {
        return lstDatos24MayoSexual;
    }

    public void setLstDatos24MayoSexual(ArrayList<Vif_2012> lstDatos24MayoSexual) {
        this.lstDatos24MayoSexual = lstDatos24MayoSexual;
    }

    public ArrayList<Vif_2012> getLstDatos24MayoFisicaSexual() {
        return lstDatos24MayoFisicaSexual;
    }

    public void setLstDatos24MayoFisicaSexual(ArrayList<Vif_2012> lstDatos24MayoFisicaSexual) {
        this.lstDatos24MayoFisicaSexual = lstDatos24MayoFisicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatos24MayoFisicaPsicologica() {
        return lstDatos24MayoFisicaPsicologica;
    }

    public void setLstDatos24MayoFisicaPsicologica(ArrayList<Vif_2012> lstDatos24MayoFisicaPsicologica) {
        this.lstDatos24MayoFisicaPsicologica = lstDatos24MayoFisicaPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatos24MayoFisicaPsicologicaSexual() {
        return lstDatos24MayoFisicaPsicologicaSexual;
    }

    public void setLstDatos24MayoFisicaPsicologicaSexual(ArrayList<Vif_2012> lstDatos24MayoFisicaPsicologicaSexual) {
        this.lstDatos24MayoFisicaPsicologicaSexual = lstDatos24MayoFisicaPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatos24MayoPsicologicaSexual() {
        return lstDatos24MayoPsicologicaSexual;
    }

    public void setLstDatos24MayoPsicologicaSexual(ArrayList<Vif_2012> lstDatos24MayoPsicologicaSexual) {
        this.lstDatos24MayoPsicologicaSexual = lstDatos24MayoPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosCamiloPonceFisica() {
        return lstDatosCamiloPonceFisica;
    }

    public void setLstDatosCamiloPonceFisica(ArrayList<Vif_2012> lstDatosCamiloPonceFisica) {
        this.lstDatosCamiloPonceFisica = lstDatosCamiloPonceFisica;
    }

    public ArrayList<Vif_2012> getLstDatosCamiloPoncePsicologica() {
        return lstDatosCamiloPoncePsicologica;
    }

    public void setLstDatosCamiloPoncePsicologica(ArrayList<Vif_2012> lstDatosCamiloPoncePsicologica) {
        this.lstDatosCamiloPoncePsicologica = lstDatosCamiloPoncePsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosCamiloPonceSexual() {
        return lstDatosCamiloPonceSexual;
    }

    public void setLstDatosCamiloPonceSexual(ArrayList<Vif_2012> lstDatosCamiloPonceSexual) {
        this.lstDatosCamiloPonceSexual = lstDatosCamiloPonceSexual;
    }

    public ArrayList<Vif_2012> getLstDatosCamiloPonceFisicaSexual() {
        return lstDatosCamiloPonceFisicaSexual;
    }

    public void setLstDatosCamiloPonceFisicaSexual(ArrayList<Vif_2012> lstDatosCamiloPonceFisicaSexual) {
        this.lstDatosCamiloPonceFisicaSexual = lstDatosCamiloPonceFisicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosCamiloPonceFisicaPsicologica() {
        return lstDatosCamiloPonceFisicaPsicologica;
    }

    public void setLstDatosCamiloPonceFisicaPsicologica(ArrayList<Vif_2012> lstDatosCamiloPonceFisicaPsicologica) {
        this.lstDatosCamiloPonceFisicaPsicologica = lstDatosCamiloPonceFisicaPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosCamiloPonceFisicaPsicologicaSexual() {
        return lstDatosCamiloPonceFisicaPsicologicaSexual;
    }

    public void setLstDatosCamiloPonceFisicaPsicologicaSexual(ArrayList<Vif_2012> lstDatosCamiloPonceFisicaPsicologicaSexual) {
        this.lstDatosCamiloPonceFisicaPsicologicaSexual = lstDatosCamiloPonceFisicaPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosCamiloPoncePsicologicaSexual() {
        return lstDatosCamiloPoncePsicologicaSexual;
    }

    public void setLstDatosCamiloPoncePsicologicaSexual(ArrayList<Vif_2012> lstDatosCamiloPoncePsicologicaSexual) {
        this.lstDatosCamiloPoncePsicologicaSexual = lstDatosCamiloPoncePsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosCaminoSolFisica() {
        return lstDatosCaminoSolFisica;
    }

    public void setLstDatosCaminoSolFisica(ArrayList<Vif_2012> lstDatosCaminoSolFisica) {
        this.lstDatosCaminoSolFisica = lstDatosCaminoSolFisica;
    }

    public ArrayList<Vif_2012> getLstDatosCaminoSolPsicologica() {
        return lstDatosCaminoSolPsicologica;
    }

    public void setLstDatosCaminoSolPsicologica(ArrayList<Vif_2012> lstDatosCaminoSolPsicologica) {
        this.lstDatosCaminoSolPsicologica = lstDatosCaminoSolPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosCaminoSolSexual() {
        return lstDatosCaminoSolSexual;
    }

    public void setLstDatosCaminoSolSexual(ArrayList<Vif_2012> lstDatosCaminoSolSexual) {
        this.lstDatosCaminoSolSexual = lstDatosCaminoSolSexual;
    }

    public ArrayList<Vif_2012> getLstDatosCaminoSolFisicaSexual() {
        return lstDatosCaminoSolFisicaSexual;
    }

    public void setLstDatosCaminoSolFisicaSexual(ArrayList<Vif_2012> lstDatosCaminoSolFisicaSexual) {
        this.lstDatosCaminoSolFisicaSexual = lstDatosCaminoSolFisicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosCaminoSolFisicaPsicologica() {
        return lstDatosCaminoSolFisicaPsicologica;
    }

    public void setLstDatosCaminoSolFisicaPsicologica(ArrayList<Vif_2012> lstDatosCaminoSolFisicaPsicologica) {
        this.lstDatosCaminoSolFisicaPsicologica = lstDatosCaminoSolFisicaPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosCaminoSolFisicaPsicologicaSexual() {
        return lstDatosCaminoSolFisicaPsicologicaSexual;
    }

    public void setLstDatosCaminoSolFisicaPsicologicaSexual(ArrayList<Vif_2012> lstDatosCaminoSolFisicaPsicologicaSexual) {
        this.lstDatosCaminoSolFisicaPsicologicaSexual = lstDatosCaminoSolFisicaPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosCaminoSolPsicologicaSexual() {
        return lstDatosCaminoSolPsicologicaSexual;
    }

    public void setLstDatosCaminoSolPsicologicaSexual(ArrayList<Vif_2012> lstDatosCaminoSolPsicologicaSexual) {
        this.lstDatosCaminoSolPsicologicaSexual = lstDatosCaminoSolPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosCondamineFisica() {
        return lstDatosCondamineFisica;
    }

    public void setLstDatosCondamineFisica(ArrayList<Vif_2012> lstDatosCondamineFisica) {
        this.lstDatosCondamineFisica = lstDatosCondamineFisica;
    }

    public ArrayList<Vif_2012> getLstDatosCondaminePsicologica() {
        return lstDatosCondaminePsicologica;
    }

    public void setLstDatosCondaminePsicologica(ArrayList<Vif_2012> lstDatosCondaminePsicologica) {
        this.lstDatosCondaminePsicologica = lstDatosCondaminePsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosCondamineSexual() {
        return lstDatosCondamineSexual;
    }

    public void setLstDatosCondamineSexual(ArrayList<Vif_2012> lstDatosCondamineSexual) {
        this.lstDatosCondamineSexual = lstDatosCondamineSexual;
    }

    public ArrayList<Vif_2012> getLstDatosCondamineFisicaSexual() {
        return lstDatosCondamineFisicaSexual;
    }

    public void setLstDatosCondamineFisicaSexual(ArrayList<Vif_2012> lstDatosCondamineFisicaSexual) {
        this.lstDatosCondamineFisicaSexual = lstDatosCondamineFisicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosCondamineFisicaPsicologica() {
        return lstDatosCondamineFisicaPsicologica;
    }

    public void setLstDatosCondamineFisicaPsicologica(ArrayList<Vif_2012> lstDatosCondamineFisicaPsicologica) {
        this.lstDatosCondamineFisicaPsicologica = lstDatosCondamineFisicaPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosCondamineFisicaPsicologicaSexual() {
        return lstDatosCondamineFisicaPsicologicaSexual;
    }

    public void setLstDatosCondamineFisicaPsicologicaSexual(ArrayList<Vif_2012> lstDatosCondamineFisicaPsicologicaSexual) {
        this.lstDatosCondamineFisicaPsicologicaSexual = lstDatosCondamineFisicaPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosCondaminePsicologicaSexual() {
        return lstDatosCondaminePsicologicaSexual;
    }

    public void setLstDatosCondaminePsicologicaSexual(ArrayList<Vif_2012> lstDatosCondaminePsicologicaSexual) {
        this.lstDatosCondaminePsicologicaSexual = lstDatosCondaminePsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosLaEstacionFisica() {
        return lstDatosLaEstacionFisica;
    }

    public void setLstDatosLaEstacionFisica(ArrayList<Vif_2012> lstDatosLaEstacionFisica) {
        this.lstDatosLaEstacionFisica = lstDatosLaEstacionFisica;
    }

    public ArrayList<Vif_2012> getLstDatosLaEstacionPsicologica() {
        return lstDatosLaEstacionPsicologica;
    }

    public void setLstDatosLaEstacionPsicologica(ArrayList<Vif_2012> lstDatosLaEstacionPsicologica) {
        this.lstDatosLaEstacionPsicologica = lstDatosLaEstacionPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosLaEstacionSexual() {
        return lstDatosLaEstacionSexual;
    }

    public void setLstDatosLaEstacionSexual(ArrayList<Vif_2012> lstDatosLaEstacionSexual) {
        this.lstDatosLaEstacionSexual = lstDatosLaEstacionSexual;
    }

    public ArrayList<Vif_2012> getLstDatosLaEstacionFisicaSexual() {
        return lstDatosLaEstacionFisicaSexual;
    }

    public void setLstDatosLaEstacionFisicaSexual(ArrayList<Vif_2012> lstDatosLaEstacionFisicaSexual) {
        this.lstDatosLaEstacionFisicaSexual = lstDatosLaEstacionFisicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosLaEstacionFisicaPsicologica() {
        return lstDatosLaEstacionFisicaPsicologica;
    }

    public void setLstDatosLaEstacionFisicaPsicologica(ArrayList<Vif_2012> lstDatosLaEstacionFisicaPsicologica) {
        this.lstDatosLaEstacionFisicaPsicologica = lstDatosLaEstacionFisicaPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosLaEstacionFisicaPsicologicaSexual() {
        return lstDatosLaEstacionFisicaPsicologicaSexual;
    }

    public void setLstDatosLaEstacionFisicaPsicologicaSexual(ArrayList<Vif_2012> lstDatosLaEstacionFisicaPsicologicaSexual) {
        this.lstDatosLaEstacionFisicaPsicologicaSexual = lstDatosLaEstacionFisicaPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosLaEstacionPsicologicaSexual() {
        return lstDatosLaEstacionPsicologicaSexual;
    }

    public void setLstDatosLaEstacionPsicologicaSexual(ArrayList<Vif_2012> lstDatosLaEstacionPsicologicaSexual) {
        this.lstDatosLaEstacionPsicologicaSexual = lstDatosLaEstacionPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosLaPazFisica() {
        return lstDatosLaPazFisica;
    }

    public void setLstDatosLaPazFisica(ArrayList<Vif_2012> lstDatosLaPazFisica) {
        this.lstDatosLaPazFisica = lstDatosLaPazFisica;
    }

    public ArrayList<Vif_2012> getLstDatosLaPazPsicologica() {
        return lstDatosLaPazPsicologica;
    }

    public void setLstDatosLaPazPsicologica(ArrayList<Vif_2012> lstDatosLaPazPsicologica) {
        this.lstDatosLaPazPsicologica = lstDatosLaPazPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosLaPazSexual() {
        return lstDatosLaPazSexual;
    }

    public void setLstDatosLaPazSexual(ArrayList<Vif_2012> lstDatosLaPazSexual) {
        this.lstDatosLaPazSexual = lstDatosLaPazSexual;
    }

    public ArrayList<Vif_2012> getLstDatosLaPazFisicaSexual() {
        return lstDatosLaPazFisicaSexual;
    }

    public void setLstDatosLaPazFisicaSexual(ArrayList<Vif_2012> lstDatosLaPazFisicaSexual) {
        this.lstDatosLaPazFisicaSexual = lstDatosLaPazFisicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosLaPazFisicaPsicologica() {
        return lstDatosLaPazFisicaPsicologica;
    }

    public void setLstDatosLaPazFisicaPsicologica(ArrayList<Vif_2012> lstDatosLaPazFisicaPsicologica) {
        this.lstDatosLaPazFisicaPsicologica = lstDatosLaPazFisicaPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosLaPazFisicaPsicologicaSexual() {
        return lstDatosLaPazFisicaPsicologicaSexual;
    }

    public void setLstDatosLaPazFisicaPsicologicaSexual(ArrayList<Vif_2012> lstDatosLaPazFisicaPsicologicaSexual) {
        this.lstDatosLaPazFisicaPsicologicaSexual = lstDatosLaPazFisicaPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosLaPazPsicologicaSexual() {
        return lstDatosLaPazPsicologicaSexual;
    }

    public void setLstDatosLaPazPsicologicaSexual(ArrayList<Vif_2012> lstDatosLaPazPsicologicaSexual) {
        this.lstDatosLaPazPsicologicaSexual = lstDatosLaPazPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosLaPrimaveraFisica() {
        return lstDatosLaPrimaveraFisica;
    }

    public void setLstDatosLaPrimaveraFisica(ArrayList<Vif_2012> lstDatosLaPrimaveraFisica) {
        this.lstDatosLaPrimaveraFisica = lstDatosLaPrimaveraFisica;
    }

    public ArrayList<Vif_2012> getLstDatosLaPrimaveraPsicologica() {
        return lstDatosLaPrimaveraPsicologica;
    }

    public void setLstDatosLaPrimaveraPsicologica(ArrayList<Vif_2012> lstDatosLaPrimaveraPsicologica) {
        this.lstDatosLaPrimaveraPsicologica = lstDatosLaPrimaveraPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosLaPrimaveraSexual() {
        return lstDatosLaPrimaveraSexual;
    }

    public void setLstDatosLaPrimaveraSexual(ArrayList<Vif_2012> lstDatosLaPrimaveraSexual) {
        this.lstDatosLaPrimaveraSexual = lstDatosLaPrimaveraSexual;
    }

    public ArrayList<Vif_2012> getLstDatosLaPrimaveraFisicaSexual() {
        return lstDatosLaPrimaveraFisicaSexual;
    }

    public void setLstDatosLaPrimaveraFisicaSexual(ArrayList<Vif_2012> lstDatosLaPrimaveraFisicaSexual) {
        this.lstDatosLaPrimaveraFisicaSexual = lstDatosLaPrimaveraFisicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosLaPrimaveraFisicaPsicologica() {
        return lstDatosLaPrimaveraFisicaPsicologica;
    }

    public void setLstDatosLaPrimaveraFisicaPsicologica(ArrayList<Vif_2012> lstDatosLaPrimaveraFisicaPsicologica) {
        this.lstDatosLaPrimaveraFisicaPsicologica = lstDatosLaPrimaveraFisicaPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosLaPrimaveraFisicaPsicologicaSexual() {
        return lstDatosLaPrimaveraFisicaPsicologicaSexual;
    }

    public void setLstDatosLaPrimaveraFisicaPsicologicaSexual(ArrayList<Vif_2012> lstDatosLaPrimaveraFisicaPsicologicaSexual) {
        this.lstDatosLaPrimaveraFisicaPsicologicaSexual = lstDatosLaPrimaveraFisicaPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosLaPrimaveraPsicologicaSexual() {
        return lstDatosLaPrimaveraPsicologicaSexual;
    }

    public void setLstDatosLaPrimaveraPsicologicaSexual(ArrayList<Vif_2012> lstDatosLaPrimaveraPsicologicaSexual) {
        this.lstDatosLaPrimaveraPsicologicaSexual = lstDatosLaPrimaveraPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosPolitecnicaFisica() {
        return lstDatosPolitecnicaFisica;
    }

    public void setLstDatosPolitecnicaFisica(ArrayList<Vif_2012> lstDatosPolitecnicaFisica) {
        this.lstDatosPolitecnicaFisica = lstDatosPolitecnicaFisica;
    }

    public ArrayList<Vif_2012> getLstDatosPolitecnicaPsicologica() {
        return lstDatosPolitecnicaPsicologica;
    }

    public void setLstDatosPolitecnicaPsicologica(ArrayList<Vif_2012> lstDatosPolitecnicaPsicologica) {
        this.lstDatosPolitecnicaPsicologica = lstDatosPolitecnicaPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosPolitecnicaSexual() {
        return lstDatosPolitecnicaSexual;
    }

    public void setLstDatosPolitecnicaSexual(ArrayList<Vif_2012> lstDatosPolitecnicaSexual) {
        this.lstDatosPolitecnicaSexual = lstDatosPolitecnicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosPolitecnicaFisicaSexual() {
        return lstDatosPolitecnicaFisicaSexual;
    }

    public void setLstDatosPolitecnicaFisicaSexual(ArrayList<Vif_2012> lstDatosPolitecnicaFisicaSexual) {
        this.lstDatosPolitecnicaFisicaSexual = lstDatosPolitecnicaFisicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosPolitecnicaFisicaPsicologica() {
        return lstDatosPolitecnicaFisicaPsicologica;
    }

    public void setLstDatosPolitecnicaFisicaPsicologica(ArrayList<Vif_2012> lstDatosPolitecnicaFisicaPsicologica) {
        this.lstDatosPolitecnicaFisicaPsicologica = lstDatosPolitecnicaFisicaPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosPolitecnicaFisicaPsicologicaSexual() {
        return lstDatosPolitecnicaFisicaPsicologicaSexual;
    }

    public void setLstDatosPolitecnicaFisicaPsicologicaSexual(ArrayList<Vif_2012> lstDatosPolitecnicaFisicaPsicologicaSexual) {
        this.lstDatosPolitecnicaFisicaPsicologicaSexual = lstDatosPolitecnicaFisicaPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosPolitecnicaPsicologicaSexual() {
        return lstDatosPolitecnicaPsicologicaSexual;
    }

    public void setLstDatosPolitecnicaPsicologicaSexual(ArrayList<Vif_2012> lstDatosPolitecnicaPsicologicaSexual) {
        this.lstDatosPolitecnicaPsicologicaSexual = lstDatosPolitecnicaPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosPucaraFisica() {
        return lstDatosPucaraFisica;
    }

    public void setLstDatosPucaraFisica(ArrayList<Vif_2012> lstDatosPucaraFisica) {
        this.lstDatosPucaraFisica = lstDatosPucaraFisica;
    }

    public ArrayList<Vif_2012> getLstDatosPucaraPsicologica() {
        return lstDatosPucaraPsicologica;
    }

    public void setLstDatosPucaraPsicologica(ArrayList<Vif_2012> lstDatosPucaraPsicologica) {
        this.lstDatosPucaraPsicologica = lstDatosPucaraPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosPucaraSexual() {
        return lstDatosPucaraSexual;
    }

    public void setLstDatosPucaraSexual(ArrayList<Vif_2012> lstDatosPucaraSexual) {
        this.lstDatosPucaraSexual = lstDatosPucaraSexual;
    }

    public ArrayList<Vif_2012> getLstDatosPucaraFisicaSexual() {
        return lstDatosPucaraFisicaSexual;
    }

    public void setLstDatosPucaraFisicaSexual(ArrayList<Vif_2012> lstDatosPucaraFisicaSexual) {
        this.lstDatosPucaraFisicaSexual = lstDatosPucaraFisicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosPucaraFisicaPsicologica() {
        return lstDatosPucaraFisicaPsicologica;
    }

    public void setLstDatosPucaraFisicaPsicologica(ArrayList<Vif_2012> lstDatosPucaraFisicaPsicologica) {
        this.lstDatosPucaraFisicaPsicologica = lstDatosPucaraFisicaPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosPucaraFisicaPsicologicaSexual() {
        return lstDatosPucaraFisicaPsicologicaSexual;
    }

    public void setLstDatosPucaraFisicaPsicologicaSexual(ArrayList<Vif_2012> lstDatosPucaraFisicaPsicologicaSexual) {
        this.lstDatosPucaraFisicaPsicologicaSexual = lstDatosPucaraFisicaPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosPucaraPsicologicaSexual() {
        return lstDatosPucaraPsicologicaSexual;
    }

    public void setLstDatosPucaraPsicologicaSexual(ArrayList<Vif_2012> lstDatosPucaraPsicologicaSexual) {
        this.lstDatosPucaraPsicologicaSexual = lstDatosPucaraPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosSanAlfonsoFisica() {
        return lstDatosSanAlfonsoFisica;
    }

    public void setLstDatosSanAlfonsoFisica(ArrayList<Vif_2012> lstDatosSanAlfonsoFisica) {
        this.lstDatosSanAlfonsoFisica = lstDatosSanAlfonsoFisica;
    }

    public ArrayList<Vif_2012> getLstDatosSanAlfonsoPsicologica() {
        return lstDatosSanAlfonsoPsicologica;
    }

    public void setLstDatosSanAlfonsoPsicologica(ArrayList<Vif_2012> lstDatosSanAlfonsoPsicologica) {
        this.lstDatosSanAlfonsoPsicologica = lstDatosSanAlfonsoPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosSanAlfonsoSexual() {
        return lstDatosSanAlfonsoSexual;
    }

    public void setLstDatosSanAlfonsoSexual(ArrayList<Vif_2012> lstDatosSanAlfonsoSexual) {
        this.lstDatosSanAlfonsoSexual = lstDatosSanAlfonsoSexual;
    }

    public ArrayList<Vif_2012> getLstDatosSanAlfonsoFisicaSexual() {
        return lstDatosSanAlfonsoFisicaSexual;
    }

    public void setLstDatosSanAlfonsoFisicaSexual(ArrayList<Vif_2012> lstDatosSanAlfonsoFisicaSexual) {
        this.lstDatosSanAlfonsoFisicaSexual = lstDatosSanAlfonsoFisicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosSanAlfonsoFisicaPsicologica() {
        return lstDatosSanAlfonsoFisicaPsicologica;
    }

    public void setLstDatosSanAlfonsoFisicaPsicologica(ArrayList<Vif_2012> lstDatosSanAlfonsoFisicaPsicologica) {
        this.lstDatosSanAlfonsoFisicaPsicologica = lstDatosSanAlfonsoFisicaPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosSanAlfonsoFisicaPsicologicaSexual() {
        return lstDatosSanAlfonsoFisicaPsicologicaSexual;
    }

    public void setLstDatosSanAlfonsoFisicaPsicologicaSexual(ArrayList<Vif_2012> lstDatosSanAlfonsoFisicaPsicologicaSexual) {
        this.lstDatosSanAlfonsoFisicaPsicologicaSexual = lstDatosSanAlfonsoFisicaPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosSanAlfonsoPsicologicaSexual() {
        return lstDatosSanAlfonsoPsicologicaSexual;
    }

    public void setLstDatosSanAlfonsoPsicologicaSexual(ArrayList<Vif_2012> lstDatosSanAlfonsoPsicologicaSexual) {
        this.lstDatosSanAlfonsoPsicologicaSexual = lstDatosSanAlfonsoPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosShoppingFisica() {
        return lstDatosShoppingFisica;
    }

    public void setLstDatosShoppingFisica(ArrayList<Vif_2012> lstDatosShoppingFisica) {
        this.lstDatosShoppingFisica = lstDatosShoppingFisica;
    }

    public ArrayList<Vif_2012> getLstDatosShoppingPsicologica() {
        return lstDatosShoppingPsicologica;
    }

    public void setLstDatosShoppingPsicologica(ArrayList<Vif_2012> lstDatosShoppingPsicologica) {
        this.lstDatosShoppingPsicologica = lstDatosShoppingPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosShoppingSexual() {
        return lstDatosShoppingSexual;
    }

    public void setLstDatosShoppingSexual(ArrayList<Vif_2012> lstDatosShoppingSexual) {
        this.lstDatosShoppingSexual = lstDatosShoppingSexual;
    }

    public ArrayList<Vif_2012> getLstDatosShoppingFisicaSexual() {
        return lstDatosShoppingFisicaSexual;
    }

    public void setLstDatosShoppingFisicaSexual(ArrayList<Vif_2012> lstDatosShoppingFisicaSexual) {
        this.lstDatosShoppingFisicaSexual = lstDatosShoppingFisicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosShoppingFisicaPsicologica() {
        return lstDatosShoppingFisicaPsicologica;
    }

    public void setLstDatosShoppingFisicaPsicologica(ArrayList<Vif_2012> lstDatosShoppingFisicaPsicologica) {
        this.lstDatosShoppingFisicaPsicologica = lstDatosShoppingFisicaPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosShoppingFisicaPsicologicaSexual() {
        return lstDatosShoppingFisicaPsicologicaSexual;
    }

    public void setLstDatosShoppingFisicaPsicologicaSexual(ArrayList<Vif_2012> lstDatosShoppingFisicaPsicologicaSexual) {
        this.lstDatosShoppingFisicaPsicologicaSexual = lstDatosShoppingFisicaPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosShoppingPsicologicaSexual() {
        return lstDatosShoppingPsicologicaSexual;
    }

    public void setLstDatosShoppingPsicologicaSexual(ArrayList<Vif_2012> lstDatosShoppingPsicologicaSexual) {
        this.lstDatosShoppingPsicologicaSexual = lstDatosShoppingPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosTerminalTerrestreFisica() {
        return lstDatosTerminalTerrestreFisica;
    }

    public void setLstDatosTerminalTerrestreFisica(ArrayList<Vif_2012> lstDatosTerminalTerrestreFisica) {
        this.lstDatosTerminalTerrestreFisica = lstDatosTerminalTerrestreFisica;
    }

    public ArrayList<Vif_2012> getLstDatosTerminalTerrestrePsicologica() {
        return lstDatosTerminalTerrestrePsicologica;
    }

    public void setLstDatosTerminalTerrestrePsicologica(ArrayList<Vif_2012> lstDatosTerminalTerrestrePsicologica) {
        this.lstDatosTerminalTerrestrePsicologica = lstDatosTerminalTerrestrePsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosTerminalTerrestreSexual() {
        return lstDatosTerminalTerrestreSexual;
    }

    public void setLstDatosTerminalTerrestreSexual(ArrayList<Vif_2012> lstDatosTerminalTerrestreSexual) {
        this.lstDatosTerminalTerrestreSexual = lstDatosTerminalTerrestreSexual;
    }

    public ArrayList<Vif_2012> getLstDatosTerminalTerrestreFisicaSexual() {
        return lstDatosTerminalTerrestreFisicaSexual;
    }

    public void setLstDatosTerminalTerrestreFisicaSexual(ArrayList<Vif_2012> lstDatosTerminalTerrestreFisicaSexual) {
        this.lstDatosTerminalTerrestreFisicaSexual = lstDatosTerminalTerrestreFisicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosTerminalTerrestreFisicaPsicologica() {
        return lstDatosTerminalTerrestreFisicaPsicologica;
    }

    public void setLstDatosTerminalTerrestreFisicaPsicologica(ArrayList<Vif_2012> lstDatosTerminalTerrestreFisicaPsicologica) {
        this.lstDatosTerminalTerrestreFisicaPsicologica = lstDatosTerminalTerrestreFisicaPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosTerminalTerrestreFisicaPsicologicaSexual() {
        return lstDatosTerminalTerrestreFisicaPsicologicaSexual;
    }

    public void setLstDatosTerminalTerrestreFisicaPsicologicaSexual(ArrayList<Vif_2012> lstDatosTerminalTerrestreFisicaPsicologicaSexual) {
        this.lstDatosTerminalTerrestreFisicaPsicologicaSexual = lstDatosTerminalTerrestreFisicaPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosTerminalTerrestrePsicologicaSexual() {
        return lstDatosTerminalTerrestrePsicologicaSexual;
    }

    public void setLstDatosTerminalTerrestrePsicologicaSexual(ArrayList<Vif_2012> lstDatosTerminalTerrestrePsicologicaSexual) {
        this.lstDatosTerminalTerrestrePsicologicaSexual = lstDatosTerminalTerrestrePsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosYaruquiesFisica() {
        return lstDatosYaruquiesFisica;
    }

    public void setLstDatosYaruquiesFisica(ArrayList<Vif_2012> lstDatosYaruquiesFisica) {
        this.lstDatosYaruquiesFisica = lstDatosYaruquiesFisica;
    }

    public ArrayList<Vif_2012> getLstDatosYaruquiesPsicologica() {
        return lstDatosYaruquiesPsicologica;
    }

    public void setLstDatosYaruquiesPsicologica(ArrayList<Vif_2012> lstDatosYaruquiesPsicologica) {
        this.lstDatosYaruquiesPsicologica = lstDatosYaruquiesPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosYaruquiesSexual() {
        return lstDatosYaruquiesSexual;
    }

    public void setLstDatosYaruquiesSexual(ArrayList<Vif_2012> lstDatosYaruquiesSexual) {
        this.lstDatosYaruquiesSexual = lstDatosYaruquiesSexual;
    }

    public ArrayList<Vif_2012> getLstDatosYaruquiesFisicaSexual() {
        return lstDatosYaruquiesFisicaSexual;
    }

    public void setLstDatosYaruquiesFisicaSexual(ArrayList<Vif_2012> lstDatosYaruquiesFisicaSexual) {
        this.lstDatosYaruquiesFisicaSexual = lstDatosYaruquiesFisicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosYaruquiesFisicaPsicologica() {
        return lstDatosYaruquiesFisicaPsicologica;
    }

    public void setLstDatosYaruquiesFisicaPsicologica(ArrayList<Vif_2012> lstDatosYaruquiesFisicaPsicologica) {
        this.lstDatosYaruquiesFisicaPsicologica = lstDatosYaruquiesFisicaPsicologica;
    }

    public ArrayList<Vif_2012> getLstDatosYaruquiesFisicaPsicologicaSexual() {
        return lstDatosYaruquiesFisicaPsicologicaSexual;
    }

    public void setLstDatosYaruquiesFisicaPsicologicaSexual(ArrayList<Vif_2012> lstDatosYaruquiesFisicaPsicologicaSexual) {
        this.lstDatosYaruquiesFisicaPsicologicaSexual = lstDatosYaruquiesFisicaPsicologicaSexual;
    }

    public ArrayList<Vif_2012> getLstDatosYaruquiesPsicologicaSexual() {
        return lstDatosYaruquiesPsicologicaSexual;
    }

    public void setLstDatosYaruquiesPsicologicaSexual(ArrayList<Vif_2012> lstDatosYaruquiesPsicologicaSexual) {
        this.lstDatosYaruquiesPsicologicaSexual = lstDatosYaruquiesPsicologicaSexual;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        lineModelCircuitoViolencia = graficaCircuitoViolencia();
    }

    private void reinit() {
        this.datoSel = new Vif_2012();
        this.lstDatos = new ArrayList<Vif_2012>();
        this.lstDatos24MayoFisica = new ArrayList<Vif_2012>();
        this.lstDatos24MayoPsicologica = new ArrayList<Vif_2012>();
        this.lstDatos24MayoSexual = new ArrayList<Vif_2012>();
        this.lstDatos24MayoFisicaSexual = new ArrayList<Vif_2012>();
        this.lstDatos24MayoFisicaPsicologica = new ArrayList<Vif_2012>();
        this.lstDatos24MayoFisicaPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatos24MayoPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosCamiloPonceFisica = new ArrayList<Vif_2012>();
        this.lstDatosCamiloPoncePsicologica = new ArrayList<Vif_2012>();
        this.lstDatosCamiloPonceSexual = new ArrayList<Vif_2012>();
        this.lstDatosCamiloPonceFisicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosCamiloPonceFisicaPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosCamiloPonceFisicaPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosCamiloPoncePsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosCaminoSolFisica = new ArrayList<Vif_2012>();
        this.lstDatosCaminoSolPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosCaminoSolSexual = new ArrayList<Vif_2012>();
        this.lstDatosCaminoSolFisicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosCaminoSolFisicaPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosCaminoSolFisicaPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosCaminoSolPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosCondamineFisica = new ArrayList<Vif_2012>();
        this.lstDatosCondaminePsicologica = new ArrayList<Vif_2012>();
        this.lstDatosCondamineSexual = new ArrayList<Vif_2012>();
        this.lstDatosCondamineFisicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosCondamineFisicaPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosCondamineFisicaPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosCondaminePsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosLaEstacionFisica = new ArrayList<Vif_2012>();
        this.lstDatosLaEstacionPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosLaEstacionSexual = new ArrayList<Vif_2012>();
        this.lstDatosLaEstacionFisicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosLaEstacionFisicaPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosLaEstacionFisicaPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosLaEstacionPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosLaPazFisica = new ArrayList<Vif_2012>();
        this.lstDatosLaPazPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosLaPazSexual = new ArrayList<Vif_2012>();
        this.lstDatosLaPazFisicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosLaPazFisicaPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosLaPazFisicaPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosLaPazPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosLaPrimaveraFisica = new ArrayList<Vif_2012>();
        this.lstDatosLaPrimaveraPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosLaPrimaveraSexual = new ArrayList<Vif_2012>();
        this.lstDatosLaPrimaveraFisicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosLaPrimaveraFisicaPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosLaPrimaveraFisicaPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosLaPrimaveraPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosPolitecnicaFisica = new ArrayList<Vif_2012>();
        this.lstDatosPolitecnicaPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosPolitecnicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosPolitecnicaFisicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosPolitecnicaFisicaPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosPolitecnicaFisicaPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosPolitecnicaPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosPucaraFisica = new ArrayList<Vif_2012>();
        this.lstDatosPucaraPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosPucaraSexual = new ArrayList<Vif_2012>();
        this.lstDatosPucaraFisicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosPucaraFisicaPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosPucaraFisicaPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosPucaraPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosSanAlfonsoFisica = new ArrayList<Vif_2012>();
        this.lstDatosSanAlfonsoPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosSanAlfonsoSexual = new ArrayList<Vif_2012>();
        this.lstDatosSanAlfonsoFisicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosSanAlfonsoFisicaPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosSanAlfonsoFisicaPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosSanAlfonsoPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosShoppingFisica = new ArrayList<Vif_2012>();
        this.lstDatosShoppingPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosShoppingSexual = new ArrayList<Vif_2012>();
        this.lstDatosShoppingFisicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosShoppingFisicaPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosShoppingFisicaPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosShoppingPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosTerminalTerrestreFisica = new ArrayList<Vif_2012>();
        this.lstDatosTerminalTerrestrePsicologica = new ArrayList<Vif_2012>();
        this.lstDatosTerminalTerrestreSexual = new ArrayList<Vif_2012>();
        this.lstDatosTerminalTerrestreFisicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosTerminalTerrestreFisicaPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosTerminalTerrestreFisicaPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosTerminalTerrestrePsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosYaruquiesFisica = new ArrayList<Vif_2012>();
        this.lstDatosYaruquiesPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosYaruquiesSexual = new ArrayList<Vif_2012>();
        this.lstDatosYaruquiesFisicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosYaruquiesFisicaPsicologica = new ArrayList<Vif_2012>();
        this.lstDatosYaruquiesFisicaPsicologicaSexual = new ArrayList<Vif_2012>();
        this.lstDatosYaruquiesPsicologicaSexual = new ArrayList<Vif_2012>();

        this.cargarDatos();
        this.init();
    }

    public Vif_2012ControladorCircuitoViolencia() {
        this.reinit();
    }

    private CartesianChartModel graficaCircuitoViolencia() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos24MayoFisica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("24 DE MAYO", "FISICA");
            lstDatos24MayoPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("24 DE MAYO", "PSICOLOGICA");
            lstDatos24MayoSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("24 DE MAYO", "SEXUAL");
            lstDatos24MayoFisicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("24 DE MAYO", "FISICA Y SEXUAL");
            lstDatos24MayoFisicaPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("24 DE MAYO", "FISICA Y PSICOLOGICA");
            lstDatos24MayoFisicaPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("24 DE MAYO", "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatos24MayoPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("24 DE MAYO", "PSICOLOGICA Y SEXUAL");
            lstDatosCamiloPonceFisica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("CAMILO PONCE", "FISICA");
            lstDatosCamiloPoncePsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("CAMILO PONCE", "PSICOLOGICA");
            lstDatosCamiloPonceSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("CAMILO PONCE", "SEXUAL");
            lstDatosCamiloPonceFisicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("CAMILO PONCE", "FISICA Y SEXUAL");
            lstDatosCamiloPonceFisicaPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("CAMILO PONCE", "FISICA Y PSICOLOGICA");
            lstDatosCamiloPonceFisicaPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("CAMILO PONCE", "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosCamiloPoncePsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("CAMILO PONCE", "PSICOLOGICA Y SEXUAL");
            lstDatosCaminoSolFisica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("CAMINO AL SOL", "FISICA");
            lstDatosCaminoSolPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("CAMINO AL SOL", "PSICOLOGICA");
            lstDatosCaminoSolSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("CAMINO AL SOL", "SEXUAL");
            lstDatosCaminoSolFisicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("CAMINO AL SOL", "FISICA Y SEXUAL");
            lstDatosCaminoSolFisicaPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("CAMINO AL SOL", "FISICA Y PSICOLOGICA");
            lstDatosCaminoSolFisicaPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("CAMINO AL SOL", "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosCaminoSolPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("CAMINO AL SOL", "PSICOLOGICA Y SEXUAL");
            lstDatosCondamineFisica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA CONDAMINE", "FISICA");
            lstDatosCondaminePsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA CONDAMINE", "PSICOLOGICA");
            lstDatosCondamineSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA CONDAMINE", "SEXUAL");
            lstDatosCondamineFisicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA CONDAMINE", "FISICA Y SEXUAL");
            lstDatosCondamineFisicaPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA CONDAMINE", "FISICA Y PSICOLOGICA");
            lstDatosCondamineFisicaPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA CONDAMINE", "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosCondaminePsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA CONDAMINE", "PSICOLOGICA Y SEXUAL");
            lstDatosLaEstacionFisica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA ESTACION", "FISICA");
            lstDatosLaEstacionPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA ESTACION", "PSICOLOGICA");
            lstDatosLaEstacionSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA ESTACION", "SEXUAL");
            lstDatosLaEstacionFisicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA ESTACION", "FISICA Y SEXUAL");
            lstDatosLaEstacionFisicaPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA ESTACION", "FISICA Y PSICOLOGICA");
            lstDatosLaEstacionFisicaPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA ESTACION", "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosLaEstacionPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA ESTACION", "PSICOLOGICA Y SEXUAL");
            lstDatosLaPazFisica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA PAZ", "FISICA");
            lstDatosLaPazPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA PAZ", "PSICOLOGICA");
            lstDatosLaPazSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA PAZ", "SEXUAL");
            lstDatosLaPazFisicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA PAZ", "FISICA Y SEXUAL");
            lstDatosLaPazFisicaPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA PAZ", "FISICA Y PSICOLOGICA");
            lstDatosLaPazFisicaPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA PAZ", "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosLaPazPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA PAZ", "PSICOLOGICA Y SEXUAL");
            lstDatosLaPrimaveraFisica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA PRIMAVERA", "FISICA");
            lstDatosLaPrimaveraPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA PRIMAVERA", "PSICOLOGICA");
            lstDatosLaPrimaveraSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA PRIMAVERA", "SEXUAL");
            lstDatosLaPrimaveraFisicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA PRIMAVERA", "FISICA Y SEXUAL");
            lstDatosLaPrimaveraFisicaPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA PRIMAVERA", "FISICA Y PSICOLOGICA");
            lstDatosLaPrimaveraFisicaPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA PRIMAVERA", "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosLaPrimaveraPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("LA PRIMAVERA", "PSICOLOGICA Y SEXUAL");
            lstDatosPolitecnicaFisica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("POLITECNICA", "FISICA");
            lstDatosPolitecnicaPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("POLITECNICA", "PSICOLOGICA");
            lstDatosPolitecnicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("POLITECNICA", "SEXUAL");
            lstDatosPolitecnicaFisicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("POLITECNICA", "FISICA Y SEXUAL");
            lstDatosPolitecnicaFisicaPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("POLITECNICA", "FISICA Y PSICOLOGICA");
            lstDatosPolitecnicaFisicaPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("POLITECNICA", "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosPolitecnicaPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("POLITECNICA", "PSICOLOGICA Y SEXUAL");
            lstDatosPucaraFisica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("PUCARA", "FISICA");
            lstDatosPucaraPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("PUCARA", "PSICOLOGICA");
            lstDatosPucaraSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("PUCARA", "SEXUAL");
            lstDatosPucaraFisicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("PUCARA", "FISICA Y SEXUAL");
            lstDatosPucaraFisicaPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("PUCARA", "FISICA Y PSICOLOGICA");
            lstDatosPucaraFisicaPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("PUCARA", "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosPucaraPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("PUCARA", "PSICOLOGICA Y SEXUAL");
            lstDatosSanAlfonsoFisica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("SAN ALFONSO", "FISICA");
            lstDatosSanAlfonsoPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("SAN ALFONSO", "PSICOLOGICA");
            lstDatosSanAlfonsoSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("SAN ALFONSO", "SEXUAL");
            lstDatosSanAlfonsoFisicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("SAN ALFONSO", "FISICA Y SEXUAL");
            lstDatosSanAlfonsoFisicaPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("SAN ALFONSO", "FISICA Y PSICOLOGICA");
            lstDatosSanAlfonsoFisicaPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("SAN ALFONSO", "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosSanAlfonsoPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("SAN ALFONSO", "PSICOLOGICA Y SEXUAL");
            lstDatosShoppingFisica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("SHOPPING", "FISICA");
            lstDatosShoppingPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("SHOPPING", "PSICOLOGICA");
            lstDatosShoppingSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("SHOPPING", "SEXUAL");
            lstDatosShoppingFisicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("SHOPPING", "FISICA Y SEXUAL");
            lstDatosShoppingFisicaPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("SHOPPING", "FISICA Y PSICOLOGICA");
            lstDatosShoppingFisicaPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("SHOPPING", "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosShoppingPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("SHOPPING", "PSICOLOGICA Y SEXUAL");
            lstDatosTerminalTerrestreFisica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("TERMINAL TERRESTRE", "FISICA");
            lstDatosTerminalTerrestrePsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("TERMINAL TERRESTRE", "PSICOLOGICA");
            lstDatosTerminalTerrestreSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("TERMINAL TERRESTRE", "SEXUAL");
            lstDatosTerminalTerrestreFisicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("TERMINAL TERRESTRE", "FISICA Y SEXUAL");
            lstDatosTerminalTerrestreFisicaPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("TERMINAL TERRESTRE", "FISICA Y PSICOLOGICA");
            lstDatosTerminalTerrestreFisicaPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("TERMINAL TERRESTRE", "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosTerminalTerrestrePsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("TERMINAL TERRESTRE", "PSICOLOGICA Y SEXUAL");
            lstDatosYaruquiesFisica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("YARUQUIES", "FISICA");
            lstDatosYaruquiesPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("YARUQUIES", "PSICOLOGICA");
            lstDatosYaruquiesSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("YARUQUIES", "SEXUAL");
            lstDatosYaruquiesFisicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("YARUQUIES", "FISICA Y SEXUAL");
            lstDatosYaruquiesFisicaPsicologica = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("YARUQUIES", "FISICA Y PSICOLOGICA");
            lstDatosYaruquiesFisicaPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("YARUQUIES", "FISICA, PSICOLOGICA Y SEXUAL");
            lstDatosYaruquiesPsicologicaSexual = FVif_2012.ObtenerDatosDadoCircuitoTipoViolencia("YARUQUIES", "PSICOLOGICA Y SEXUAL");

//            ChartSeries Mayo = new ChartSeries();
//            Mayo.setLabel("24 de Mayo");
//            Mayo.set("FISICA", lstDatos24MayoFisica.size());
//            Mayo.set("PSICOLOGICA", lstDatos24MayoPsicologica.size());
//            Mayo.set("SEXUAL", lstDatos24MayoSexual.size());
//            Mayo.set("FISICA Y SEXUAL", lstDatos24MayoFisicaSexual.size());
//            Mayo.set("FISICA Y PSICOLOGICA", lstDatos24MayoFisicaPsicologica.size());
//            Mayo.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatos24MayoFisicaPsicologicaSexual.size());
//            Mayo.set("PSICOLOGICA Y SEXUAL", lstDatos24MayoPsicologicaSexual.size());
//
//            ChartSeries CamiloPonce = new ChartSeries();
//            CamiloPonce.setLabel("Camilo Ponce");
//            CamiloPonce.set("FISICA", lstDatosCamiloPonceFisica.size());
//            CamiloPonce.set("PSICOLOGICA", lstDatosCamiloPoncePsicologica.size());
//            CamiloPonce.set("SEXUAL", lstDatosCamiloPonceSexual.size());
//            CamiloPonce.set("FISICA Y SEXUAL", lstDatosCamiloPonceFisicaSexual.size());
//            CamiloPonce.set("FISICA Y PSICOLOGICA", lstDatosCamiloPonceFisicaPsicologica.size());
//            CamiloPonce.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosCamiloPonceFisicaPsicologicaSexual.size());
//            CamiloPonce.set("PSICOLOGICA Y SEXUAL", lstDatosCamiloPoncePsicologicaSexual.size());
//
//            ChartSeries CaminoSol = new ChartSeries();
//            CaminoSol.setLabel("CAMINO AL SOL");
//            CaminoSol.set("FISICA", lstDatosCaminoSolFisica.size());
//            CaminoSol.set("PSICOLOGICA", lstDatosCaminoSolPsicologica.size());
//            CaminoSol.set("SEXUAL", lstDatosCaminoSolSexual.size());
//            CaminoSol.set("FISICA Y SEXUAL", lstDatosCaminoSolFisicaSexual.size());
//            CaminoSol.set("FISICA Y PSICOLOGICA", lstDatosCaminoSolFisicaPsicologica.size());
//            CaminoSol.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosCaminoSolFisicaPsicologicaSexual.size());
//            CaminoSol.set("PSICOLOGICA Y SEXUAL", lstDatosCaminoSolPsicologicaSexual.size());
//
//            ChartSeries Condamine = new ChartSeries();
//            Condamine.setLabel("LA CONDAMINE");
//            Condamine.set("FISICA", lstDatosCondamineFisica.size());
//            Condamine.set("PSICOLOGICA", lstDatosCondaminePsicologica.size());
//            Condamine.set("SEXUAL", lstDatosCondamineSexual.size());
//            Condamine.set("FISICA Y SEXUAL", lstDatosCondamineFisicaSexual.size());
//            Condamine.set("FISICA Y PSICOLOGICA", lstDatosCondamineFisicaPsicologica.size());
//            Condamine.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosCondamineFisicaPsicologicaSexual.size());
//            Condamine.set("PSICOLOGICA Y SEXUAL", lstDatosCondaminePsicologicaSexual.size());
//
//            ChartSeries LaEstacion = new ChartSeries();
//            LaEstacion.setLabel("LA ESTACION");
//            LaEstacion.set("FISICA", lstDatosLaEstacionFisica.size());
//            LaEstacion.set("PSICOLOGICA", lstDatosLaEstacionPsicologica.size());
//            LaEstacion.set("SEXUAL", lstDatosLaEstacionSexual.size());
//            LaEstacion.set("FISICA Y SEXUAL", lstDatosLaEstacionFisicaSexual.size());
//            LaEstacion.set("FISICA Y PSICOLOGICA", lstDatosLaEstacionFisicaPsicologica.size());
//            LaEstacion.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosLaEstacionFisicaPsicologicaSexual.size());
//            LaEstacion.set("PSICOLOGICA Y SEXUAL", lstDatosLaEstacionPsicologicaSexual.size());
//
//            ChartSeries LaPaz = new ChartSeries();
//            LaPaz.setLabel("LA PAZ");
//            LaPaz.set("FISICA", lstDatosLaPazFisica.size());
//            LaPaz.set("PSICOLOGICA", lstDatosLaPazPsicologica.size());
//            LaPaz.set("SEXUAL", lstDatosLaPazSexual.size());
//            LaPaz.set("FISICA Y SEXUAL", lstDatosLaPazFisicaSexual.size());
//            LaPaz.set("FISICA Y PSICOLOGICA", lstDatosLaPazFisicaPsicologica.size());
//            LaPaz.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosLaPazFisicaPsicologicaSexual.size());
//            LaPaz.set("PSICOLOGICA Y SEXUAL", lstDatosLaPazPsicologicaSexual.size());
//
//            ChartSeries LaPrimavera = new ChartSeries();
//            LaPrimavera.setLabel("LA PRIMAVERA");
//            LaPrimavera.set("FISICA", lstDatosLaPrimaveraFisica.size());
//            LaPrimavera.set("PSICOLOGICA", lstDatosLaPrimaveraPsicologica.size());
//            LaPrimavera.set("SEXUAL", lstDatosLaPrimaveraSexual.size());
//            LaPrimavera.set("FISICA Y SEXUAL", lstDatosLaPrimaveraFisicaSexual.size());
//            LaPrimavera.set("FISICA Y PSICOLOGICA", lstDatosLaPrimaveraFisicaPsicologica.size());
//            LaPrimavera.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosLaPrimaveraFisicaPsicologicaSexual.size());
//            LaPrimavera.set("PSICOLOGICA Y SEXUAL", lstDatosLaPrimaveraPsicologicaSexual.size());
//
//            ChartSeries Politecnica = new ChartSeries();
//            Politecnica.setLabel("POLITECNICA");
//            Politecnica.set("FISICA", lstDatosPolitecnicaFisica.size());
//            Politecnica.set("PSICOLOGICA", lstDatosPolitecnicaPsicologica.size());
//            Politecnica.set("SEXUAL", lstDatosPolitecnicaSexual.size());
//            Politecnica.set("FISICA Y SEXUAL", lstDatosPolitecnicaFisicaSexual.size());
//            Politecnica.set("FISICA Y PSICOLOGICA", lstDatosPolitecnicaFisicaPsicologica.size());
//            Politecnica.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosPolitecnicaFisicaPsicologicaSexual.size());
//            Politecnica.set("PSICOLOGICA Y SEXUAL", lstDatosPolitecnicaPsicologicaSexual.size());
//
//            ChartSeries Pucara = new ChartSeries();
//            Pucara.setLabel("Pucara");
//            Pucara.set("FISICA", lstDatosPucaraFisica.size());
//            Pucara.set("PSICOLOGICA", lstDatosPucaraPsicologica.size());
//            Pucara.set("SEXUAL", lstDatosPucaraSexual.size());
//            Pucara.set("FISICA Y SEXUAL", lstDatosPucaraFisicaSexual.size());
//            Pucara.set("FISICA Y PSICOLOGICA", lstDatosPucaraFisicaPsicologica.size());
//            Pucara.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosPucaraFisicaPsicologicaSexual.size());
//            Pucara.set("PSICOLOGICA Y SEXUAL", lstDatosPucaraPsicologicaSexual.size());
//
//            ChartSeries SanAlfonso = new ChartSeries();
//            SanAlfonso.setLabel("SAN ALFONSO");
//            SanAlfonso.set("FISICA", lstDatosSanAlfonsoFisica.size());
//            SanAlfonso.set("PSICOLOGICA", lstDatosSanAlfonsoPsicologica.size());
//            SanAlfonso.set("SEXUAL", lstDatosSanAlfonsoSexual.size());
//            SanAlfonso.set("FISICA Y SEXUAL", lstDatosSanAlfonsoFisicaSexual.size());
//            SanAlfonso.set("FISICA Y PSICOLOGICA", lstDatosSanAlfonsoFisicaPsicologica.size());
//            SanAlfonso.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosSanAlfonsoFisicaPsicologicaSexual.size());
//            SanAlfonso.set("PSICOLOGICA Y SEXUAL", lstDatosSanAlfonsoPsicologicaSexual.size());
//
//            ChartSeries Shopping = new ChartSeries();
//            Shopping.setLabel("SHOPPING");
//            Shopping.set("FISICA", lstDatosShoppingFisica.size());
//            Shopping.set("PSICOLOGICA", lstDatosShoppingPsicologica.size());
//            Shopping.set("SEXUAL", lstDatosShoppingSexual.size());
//            Shopping.set("FISICA Y SEXUAL", lstDatosShoppingFisicaSexual.size());
//            Shopping.set("FISICA Y PSICOLOGICA", lstDatosShoppingFisicaPsicologica.size());
//            Shopping.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosShoppingFisicaPsicologicaSexual.size());
//            Shopping.set("PSICOLOGICA Y SEXUAL", lstDatosShoppingPsicologicaSexual.size());
//
//            ChartSeries TerminalTerrestre = new ChartSeries();
//            TerminalTerrestre.setLabel("TERMINAL TERRESTRE");
//            TerminalTerrestre.set("FISICA", lstDatosTerminalTerrestreFisica.size());
//            TerminalTerrestre.set("PSICOLOGICA", lstDatosTerminalTerrestrePsicologica.size());
//            TerminalTerrestre.set("SEXUAL", lstDatosTerminalTerrestreSexual.size());
//            TerminalTerrestre.set("FISICA Y SEXUAL", lstDatosTerminalTerrestreFisicaSexual.size());
//            TerminalTerrestre.set("FISICA Y PSICOLOGICA", lstDatosTerminalTerrestreFisicaPsicologica.size());
//            TerminalTerrestre.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosTerminalTerrestreFisicaPsicologicaSexual.size());
//            TerminalTerrestre.set("PSICOLOGICA Y SEXUAL", lstDatosTerminalTerrestrePsicologicaSexual.size());
//
//            ChartSeries Yaruquies = new ChartSeries();
//            Yaruquies.setLabel("YARUQUIES");
//            Yaruquies.set("FISICA", lstDatosYaruquiesFisica.size());
//            Yaruquies.set("PSICOLOGICA", lstDatosYaruquiesPsicologica.size());
//            Yaruquies.set("SEXUAL", lstDatosYaruquiesSexual.size());
//            Yaruquies.set("FISICA Y SEXUAL", lstDatosYaruquiesFisicaSexual.size());
//            Yaruquies.set("FISICA Y PSICOLOGICA", lstDatosYaruquiesFisicaPsicologica.size());
//            Yaruquies.set("FISICA, PSICOLOGICA Y SEXUAL", lstDatosYaruquiesFisicaPsicologicaSexual.size());
//            Yaruquies.set("PSICOLOGICA Y SEXUAL", lstDatosYaruquiesPsicologicaSexual.size());
//
//            model.addSeries(Mayo);
//            model.addSeries(CamiloPonce);
//            model.addSeries(CaminoSol);
//            model.addSeries(Condamine);
//            model.addSeries(LaEstacion);
//            model.addSeries(LaPaz);
//            model.addSeries(LaPrimavera);
//            model.addSeries(Politecnica);
//            model.addSeries(Pucara);
//            model.addSeries(SanAlfonso);
//            model.addSeries(Shopping);
//            model.addSeries(TerminalTerrestre);
//            model.addSeries(Yaruquies);
            ChartSeries Fisica = new ChartSeries();
            Fisica.setLabel("FISICA");
            Fisica.set("24 DE MAYO", lstDatos24MayoFisica.size());
            Fisica.set("CAMILO PONCE", lstDatosCamiloPonceFisica.size());
            Fisica.set("CAMINOS AL SOL", lstDatosCaminoSolFisica.size());
            Fisica.set("LA CONDAMINE", lstDatosCondamineFisica.size());
            Fisica.set("LA ESTACION", lstDatosLaEstacionFisica.size());
            Fisica.set("LA PAZ", lstDatosLaPazFisica.size());
            Fisica.set("LA PRIMAVERA", lstDatosLaPrimaveraFisica.size());
            Fisica.set("POLITECNICA", lstDatosPolitecnicaFisica.size());
            Fisica.set("PUCARA", lstDatosPucaraFisica.size());
            Fisica.set("SAN ALFONSO", lstDatosSanAlfonsoFisica.size());
            Fisica.set("SHOPPING", lstDatosShoppingFisica.size());
            Fisica.set("TERMINAL TERRESTRE", lstDatosTerminalTerrestreFisica.size());
            Fisica.set("YARUQUIES", lstDatosYaruquiesFisica.size());

            ChartSeries Psicologica = new ChartSeries();
            Psicologica.setLabel("Psicologica");
            Psicologica.set("24 DE MAYO", lstDatos24MayoPsicologica.size());
            Psicologica.set("CAMILO PONCE", lstDatosCamiloPoncePsicologica.size());
            Psicologica.set("CAMINOS AL SOL", lstDatosCaminoSolPsicologica.size());
            Psicologica.set("LA CONDAMINE", lstDatosCondaminePsicologica.size());
            Psicologica.set("LA ESTACION", lstDatosLaEstacionPsicologica.size());
            Psicologica.set("LA PAZ", lstDatosLaPazPsicologica.size());
            Psicologica.set("LA PRIMAVERA", lstDatosLaPrimaveraPsicologica.size());
            Psicologica.set("POLITECNICA", lstDatosPolitecnicaPsicologica.size());
            Psicologica.set("PUCARA", lstDatosPucaraPsicologica.size());
            Psicologica.set("SAN ALFONSO", lstDatosSanAlfonsoPsicologica.size());
            Psicologica.set("SHOPPING", lstDatosShoppingPsicologica.size());
            Psicologica.set("TERMINAL TERRESTRE", lstDatosTerminalTerrestrePsicologica.size());
            Psicologica.set("YARUQUIES", lstDatosYaruquiesPsicologica.size());

            ChartSeries Sexual = new ChartSeries();
            Sexual.setLabel("Sexual");
            Sexual.set("24 DE MAYO", lstDatos24MayoSexual.size());
            Sexual.set("CAMILO PONCE", lstDatosCamiloPonceSexual.size());
            Sexual.set("CAMINOS AL SOL", lstDatosCaminoSolSexual.size());
            Sexual.set("LA CONDAMINE", lstDatosCondamineSexual.size());
            Sexual.set("LA ESTACION", lstDatosLaEstacionSexual.size());
            Sexual.set("LA PAZ", lstDatosLaPazSexual.size());
            Sexual.set("LA PRIMAVERA", lstDatosLaPrimaveraSexual.size());
            Sexual.set("POLITECNICA", lstDatosPolitecnicaSexual.size());
            Sexual.set("PUCARA", lstDatosPucaraSexual.size());
            Sexual.set("SAN ALFONSO", lstDatosSanAlfonsoSexual.size());
            Sexual.set("SHOPPING", lstDatosShoppingSexual.size());
            Sexual.set("TERMINAL TERRESTRE", lstDatosTerminalTerrestreSexual.size());
            Sexual.set("YARUQUIES", lstDatosYaruquiesSexual.size());

            ChartSeries FisicaSexual = new ChartSeries();
            FisicaSexual.setLabel("Fisica y Sexual");
            FisicaSexual.set("24 DE MAYO", lstDatos24MayoFisicaSexual.size());
            FisicaSexual.set("CAMILO PONCE", lstDatosCamiloPonceFisicaSexual.size());
            FisicaSexual.set("CAMINOS AL SOL", lstDatosCaminoSolFisicaSexual.size());
            FisicaSexual.set("LA CONDAMINE", lstDatosCondamineFisicaSexual.size());
            FisicaSexual.set("LA ESTACION", lstDatosLaEstacionFisicaSexual.size());
            FisicaSexual.set("LA PAZ", lstDatosLaPazFisicaSexual.size());
            FisicaSexual.set("LA PRIMAVERA", lstDatosLaPrimaveraFisicaSexual.size());
            FisicaSexual.set("POLITECNICA", lstDatosPolitecnicaFisicaSexual.size());
            FisicaSexual.set("PUCARA", lstDatosPucaraFisicaSexual.size());
            FisicaSexual.set("SAN ALFONSO", lstDatosSanAlfonsoFisicaSexual.size());
            FisicaSexual.set("SHOPPING", lstDatosShoppingFisicaSexual.size());
            FisicaSexual.set("TERMINAL TERRESTRE", lstDatosTerminalTerrestreFisicaSexual.size());
            FisicaSexual.set("YARUQUIES", lstDatosYaruquiesFisicaSexual.size());

            ChartSeries FisicaPsicologica = new ChartSeries();
            FisicaPsicologica.setLabel("Fisica y Psicologica");
            FisicaPsicologica.set("24 DE MAYO", lstDatos24MayoFisicaPsicologica.size());
            FisicaPsicologica.set("CAMILO PONCE", lstDatosCamiloPonceFisicaPsicologica.size());
            FisicaPsicologica.set("CAMINOS AL SOL", lstDatosCaminoSolFisicaPsicologica.size());
            FisicaPsicologica.set("LA CONDAMINE", lstDatosCondamineFisicaPsicologica.size());
            FisicaPsicologica.set("LA ESTACION", lstDatosLaEstacionFisicaPsicologica.size());
            FisicaPsicologica.set("LA PAZ", lstDatosLaPazFisicaPsicologica.size());
            FisicaPsicologica.set("LA PRIMAVERA", lstDatosLaPrimaveraFisicaPsicologica.size());
            FisicaPsicologica.set("POLITECNICA", lstDatosPolitecnicaFisicaPsicologica.size());
            FisicaPsicologica.set("PUCARA", lstDatosPucaraFisicaPsicologica.size());
            FisicaPsicologica.set("SAN ALFONSO", lstDatosSanAlfonsoFisicaPsicologica.size());
            FisicaPsicologica.set("SHOPPING", lstDatosShoppingFisicaPsicologica.size());
            FisicaPsicologica.set("TERMINAL TERRESTRE", lstDatosTerminalTerrestreFisicaPsicologica.size());
            FisicaPsicologica.set("YARUQUIES", lstDatosYaruquiesFisicaPsicologica.size());

            ChartSeries FisicaPsicologicaSexual = new ChartSeries();
            FisicaPsicologicaSexual.setLabel("Fisica, Psicologica y Sexual");
            FisicaPsicologicaSexual.set("24 DE MAYO", lstDatos24MayoFisicaPsicologicaSexual.size());
            FisicaPsicologicaSexual.set("CAMILO PONCE", lstDatosCamiloPonceFisicaPsicologicaSexual.size());
            FisicaPsicologicaSexual.set("CAMINOS AL SOL", lstDatosCaminoSolFisicaPsicologicaSexual.size());
            FisicaPsicologicaSexual.set("LA CONDAMINE", lstDatosCondamineFisicaPsicologicaSexual.size());
            FisicaPsicologicaSexual.set("LA ESTACION", lstDatosLaEstacionFisicaPsicologicaSexual.size());
            FisicaPsicologicaSexual.set("LA PAZ", lstDatosLaPazFisicaPsicologicaSexual.size());
            FisicaPsicologicaSexual.set("LA PRIMAVERA", lstDatosLaPrimaveraFisicaPsicologicaSexual.size());
            FisicaPsicologicaSexual.set("POLITECNICA", lstDatosPolitecnicaFisicaPsicologicaSexual.size());
            FisicaPsicologicaSexual.set("PUCARA", lstDatosPucaraFisicaPsicologicaSexual.size());
            FisicaPsicologicaSexual.set("SAN ALFONSO", lstDatosSanAlfonsoFisicaPsicologicaSexual.size());
            FisicaPsicologicaSexual.set("SHOPPING", lstDatosShoppingFisicaPsicologicaSexual.size());
            FisicaPsicologicaSexual.set("TERMINAL TERRESTRE", lstDatosTerminalTerrestreFisicaPsicologicaSexual.size());
            FisicaPsicologicaSexual.set("YARUQUIES", lstDatosYaruquiesFisicaPsicologicaSexual.size());

            ChartSeries PsicologicaSexual = new ChartSeries();
            PsicologicaSexual.setLabel("Psicologica y Sexual");
            PsicologicaSexual.set("24 DE MAYO", lstDatos24MayoPsicologicaSexual.size());
            PsicologicaSexual.set("CAMILO PONCE", lstDatosCamiloPoncePsicologicaSexual.size());
            PsicologicaSexual.set("CAMINOS AL SOL", lstDatosCaminoSolPsicologicaSexual.size());
            PsicologicaSexual.set("LA CONDAMINE", lstDatosCondaminePsicologicaSexual.size());
            PsicologicaSexual.set("LA ESTACION", lstDatosLaEstacionPsicologicaSexual.size());
            PsicologicaSexual.set("LA PAZ", lstDatosLaPazPsicologicaSexual.size());
            PsicologicaSexual.set("LA PRIMAVERA", lstDatosLaPrimaveraPsicologicaSexual.size());
            PsicologicaSexual.set("POLITECNICA", lstDatosPolitecnicaPsicologicaSexual.size());
            PsicologicaSexual.set("PUCARA", lstDatosPucaraPsicologicaSexual.size());
            PsicologicaSexual.set("SAN ALFONSO", lstDatosSanAlfonsoPsicologicaSexual.size());
            PsicologicaSexual.set("SHOPPING", lstDatosShoppingPsicologicaSexual.size());
            PsicologicaSexual.set("TERMINAL TERRESTRE", lstDatosTerminalTerrestrePsicologicaSexual.size());
            PsicologicaSexual.set("YARUQUIES", lstDatosYaruquiesPsicologicaSexual.size());

            model.addSeries(Fisica);
            model.addSeries(FisicaPsicologica);
            model.addSeries(Psicologica);
            model.addSeries(Sexual);
            model.addSeries(FisicaSexual);
            model.addSeries(FisicaPsicologicaSexual);
            model.addSeries(PsicologicaSexual);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    public void cargarDatos() {
        try {

            this.lstDatos = FVif_2012.ObtenerDatos();
            this.datoSel = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getPid());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
