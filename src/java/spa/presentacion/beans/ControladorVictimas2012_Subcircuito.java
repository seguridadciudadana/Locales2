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
public class ControladorVictimas2012_Subcircuito {

    /**
     * Creates a new instance of ControladorVictimas2012_Subcircuito
     */
    private CartesianChartModel lineModel_Victima_Subcircuito;
    private CartesianChartModel lineModel_Total_Subcircuito;
    private PieChartModel pieModel;
    private Victimas_2012 objDatos;
    private Victimas_2012 datoSel;
    private ArrayList<Victimas_2012> lstDatos;
    private ArrayList<Victimas_2012> lstDatos24Mayo1M;
    private ArrayList<Victimas_2012> lstDatos24Mayo1F;
    private ArrayList<Victimas_2012> lstDatos24Mayo2M;
    private ArrayList<Victimas_2012> lstDatos24Mayo2F;
    private ArrayList<Victimas_2012> lstDatosCamiloPonce1M;
    private ArrayList<Victimas_2012> lstDatosCamiloPonce1F;
    private ArrayList<Victimas_2012> lstDatosCamiloPonce2M;
    private ArrayList<Victimas_2012> lstDatosCamiloPonce2F;
    private ArrayList<Victimas_2012> lstDatosCaminoSol1M;
    private ArrayList<Victimas_2012> lstDatosCaminoSol1F;
    private ArrayList<Victimas_2012> lstDatosLaCondamine1M;
    private ArrayList<Victimas_2012> lstDatosLaCondamine2M;
    private ArrayList<Victimas_2012> lstDatosLaCondamine1F;
    private ArrayList<Victimas_2012> lstDatosLaCondamine2F;
    private ArrayList<Victimas_2012> lstDatosLaEstacion1F;
    private ArrayList<Victimas_2012> lstDatosLaEstacion2F;
    private ArrayList<Victimas_2012> lstDatosLaEstacion1M;
    private ArrayList<Victimas_2012> lstDatosLaEstacion2M;
    private ArrayList<Victimas_2012> lstDatosLaPaz1M;
    private ArrayList<Victimas_2012> lstDatosLaPaz2M;
    private ArrayList<Victimas_2012> lstDatosLaPaz1F;
    private ArrayList<Victimas_2012> lstDatosLaPaz2F;
    private ArrayList<Victimas_2012> lstDatosLaPrimavera1M;
    private ArrayList<Victimas_2012> lstDatosLaPrimavera1F;
    private ArrayList<Victimas_2012> lstDatosPolitecnica1M;
    private ArrayList<Victimas_2012> lstDatosPolitecnica1F;
    private ArrayList<Victimas_2012> lstDatosPolitecnica2M;
    private ArrayList<Victimas_2012> lstDatosPolitecnica2F;
    private ArrayList<Victimas_2012> lstDatosPolitecnica3M;
    private ArrayList<Victimas_2012> lstDatosPolitecnica3F;
    private ArrayList<Victimas_2012> lstDatosPucara1M;
    private ArrayList<Victimas_2012> lstDatosPucara1F;
    private ArrayList<Victimas_2012> lstDatosPucara2M;
    private ArrayList<Victimas_2012> lstDatosPucara2F;
    private ArrayList<Victimas_2012> lstDatosSanAlfonso1M;
    private ArrayList<Victimas_2012> lstDatosSanAlfonso1F;
    private ArrayList<Victimas_2012> lstDatosSanAlfonso2M;
    private ArrayList<Victimas_2012> lstDatosSanAlfonso2F;
    private ArrayList<Victimas_2012> lstDatosShopping1M;
    private ArrayList<Victimas_2012> lstDatosShopping1F;
    private ArrayList<Victimas_2012> lstDatosTerminalTerrestre1M;
    private ArrayList<Victimas_2012> lstDatosTerminalTerrestre1F;
    private ArrayList<Victimas_2012> lstDatosYaruquies1M;
    private ArrayList<Victimas_2012> lstDatosYaruquies1F;
    private ArrayList<Victimas_2012> lstDatos24Mayo1;
    private ArrayList<Victimas_2012> lstDatos24Mayo2;
    private ArrayList<Victimas_2012> lstDatosCamiloPonce1;
    private ArrayList<Victimas_2012> lstDatosCamiloPonce2;
    private ArrayList<Victimas_2012> lstDatosCaminoSol1;
    private ArrayList<Victimas_2012> lstDatosLaCondamine1;
    private ArrayList<Victimas_2012> lstDatosLaCondamine2;
    private ArrayList<Victimas_2012> lstDatosLaEstacion1;
    private ArrayList<Victimas_2012> lstDatosLaEstacion2;
    private ArrayList<Victimas_2012> lstDatosLaPaz1;
    private ArrayList<Victimas_2012> lstDatosLaPaz2;
    private ArrayList<Victimas_2012> lstDatosLaPrimavera1;
    private ArrayList<Victimas_2012> lstDatosPolitecnica1;
    private ArrayList<Victimas_2012> lstDatosPolitecnica2;
    private ArrayList<Victimas_2012> lstDatosPolitecnica3;
    private ArrayList<Victimas_2012> lstDatosPucara1;
    private ArrayList<Victimas_2012> lstDatosPucara2;
    private ArrayList<Victimas_2012> lstDatosSanAlfonso1;
    private ArrayList<Victimas_2012> lstDatosSanAlfonso2;
    private ArrayList<Victimas_2012> lstDatosShopping1;
    private ArrayList<Victimas_2012> lstDatosTerminalTerrestre1;
    private ArrayList<Victimas_2012> lstDatosYaruquies1;

    public CartesianChartModel getLineModel_Total_Subcircuito() {
        return lineModel_Total_Subcircuito;
    }

    public void setLineModel_Total_Subcircuito(CartesianChartModel lineModel_Total_Subcircuito) {
        this.lineModel_Total_Subcircuito = lineModel_Total_Subcircuito;
    }

    public ArrayList<Victimas_2012> getLstDatos24Mayo1() {
        return lstDatos24Mayo1;
    }

    public void setLstDatos24Mayo1(ArrayList<Victimas_2012> lstDatos24Mayo1) {
        this.lstDatos24Mayo1 = lstDatos24Mayo1;
    }

    public ArrayList<Victimas_2012> getLstDatos24Mayo2() {
        return lstDatos24Mayo2;
    }

    public void setLstDatos24Mayo2(ArrayList<Victimas_2012> lstDatos24Mayo2) {
        this.lstDatos24Mayo2 = lstDatos24Mayo2;
    }

    public ArrayList<Victimas_2012> getLstDatosCamiloPonce1() {
        return lstDatosCamiloPonce1;
    }

    public void setLstDatosCamiloPonce1(ArrayList<Victimas_2012> lstDatosCamiloPonce1) {
        this.lstDatosCamiloPonce1 = lstDatosCamiloPonce1;
    }

    public ArrayList<Victimas_2012> getLstDatosCamiloPonce2() {
        return lstDatosCamiloPonce2;
    }

    public void setLstDatosCamiloPonce2(ArrayList<Victimas_2012> lstDatosCamiloPonce2) {
        this.lstDatosCamiloPonce2 = lstDatosCamiloPonce2;
    }

    public ArrayList<Victimas_2012> getLstDatosCaminoSol1() {
        return lstDatosCaminoSol1;
    }

    public void setLstDatosCaminoSol1(ArrayList<Victimas_2012> lstDatosCaminoSol1) {
        this.lstDatosCaminoSol1 = lstDatosCaminoSol1;
    }

    public ArrayList<Victimas_2012> getLstDatosLaCondamine1() {
        return lstDatosLaCondamine1;
    }

    public void setLstDatosLaCondamine1(ArrayList<Victimas_2012> lstDatosLaCondamine1) {
        this.lstDatosLaCondamine1 = lstDatosLaCondamine1;
    }

    public ArrayList<Victimas_2012> getLstDatosLaCondamine2() {
        return lstDatosLaCondamine2;
    }

    public void setLstDatosLaCondamine2(ArrayList<Victimas_2012> lstDatosLaCondamine2) {
        this.lstDatosLaCondamine2 = lstDatosLaCondamine2;
    }

    public ArrayList<Victimas_2012> getLstDatosLaEstacion1() {
        return lstDatosLaEstacion1;
    }

    public void setLstDatosLaEstacion1(ArrayList<Victimas_2012> lstDatosLaEstacion1) {
        this.lstDatosLaEstacion1 = lstDatosLaEstacion1;
    }

    public ArrayList<Victimas_2012> getLstDatosLaEstacion2() {
        return lstDatosLaEstacion2;
    }

    public void setLstDatosLaEstacion2(ArrayList<Victimas_2012> lstDatosLaEstacion2) {
        this.lstDatosLaEstacion2 = lstDatosLaEstacion2;
    }

    public ArrayList<Victimas_2012> getLstDatosLaPaz1() {
        return lstDatosLaPaz1;
    }

    public void setLstDatosLaPaz1(ArrayList<Victimas_2012> lstDatosLaPaz1) {
        this.lstDatosLaPaz1 = lstDatosLaPaz1;
    }

    public ArrayList<Victimas_2012> getLstDatosLaPaz2() {
        return lstDatosLaPaz2;
    }

    public void setLstDatosLaPaz2(ArrayList<Victimas_2012> lstDatosLaPaz2) {
        this.lstDatosLaPaz2 = lstDatosLaPaz2;
    }

    public ArrayList<Victimas_2012> getLstDatosLaPrimavera1() {
        return lstDatosLaPrimavera1;
    }

    public void setLstDatosLaPrimavera1(ArrayList<Victimas_2012> lstDatosLaPrimavera1) {
        this.lstDatosLaPrimavera1 = lstDatosLaPrimavera1;
    }

    public ArrayList<Victimas_2012> getLstDatosPolitecnica1() {
        return lstDatosPolitecnica1;
    }

    public void setLstDatosPolitecnica1(ArrayList<Victimas_2012> lstDatosPolitecnica1) {
        this.lstDatosPolitecnica1 = lstDatosPolitecnica1;
    }

    public ArrayList<Victimas_2012> getLstDatosPolitecnica2() {
        return lstDatosPolitecnica2;
    }

    public void setLstDatosPolitecnica2(ArrayList<Victimas_2012> lstDatosPolitecnica2) {
        this.lstDatosPolitecnica2 = lstDatosPolitecnica2;
    }

    public ArrayList<Victimas_2012> getLstDatosPolitecnica3() {
        return lstDatosPolitecnica3;
    }

    public void setLstDatosPolitecnica3(ArrayList<Victimas_2012> lstDatosPolitecnica3) {
        this.lstDatosPolitecnica3 = lstDatosPolitecnica3;
    }

    public ArrayList<Victimas_2012> getLstDatosPucara1() {
        return lstDatosPucara1;
    }

    public void setLstDatosPucara1(ArrayList<Victimas_2012> lstDatosPucara1) {
        this.lstDatosPucara1 = lstDatosPucara1;
    }

    public ArrayList<Victimas_2012> getLstDatosPucara2() {
        return lstDatosPucara2;
    }

    public void setLstDatosPucara2(ArrayList<Victimas_2012> lstDatosPucara2) {
        this.lstDatosPucara2 = lstDatosPucara2;
    }

    public ArrayList<Victimas_2012> getLstDatosSanAlfonso1() {
        return lstDatosSanAlfonso1;
    }

    public void setLstDatosSanAlfonso1(ArrayList<Victimas_2012> lstDatosSanAlfonso1) {
        this.lstDatosSanAlfonso1 = lstDatosSanAlfonso1;
    }

    public ArrayList<Victimas_2012> getLstDatosSanAlfonso2() {
        return lstDatosSanAlfonso2;
    }

    public void setLstDatosSanAlfonso2(ArrayList<Victimas_2012> lstDatosSanAlfonso2) {
        this.lstDatosSanAlfonso2 = lstDatosSanAlfonso2;
    }

    public ArrayList<Victimas_2012> getLstDatosShopping1() {
        return lstDatosShopping1;
    }

    public void setLstDatosShopping1(ArrayList<Victimas_2012> lstDatosShopping1) {
        this.lstDatosShopping1 = lstDatosShopping1;
    }

    public ArrayList<Victimas_2012> getLstDatosTerminalTerrestre1() {
        return lstDatosTerminalTerrestre1;
    }

    public void setLstDatosTerminalTerrestre1(ArrayList<Victimas_2012> lstDatosTerminalTerrestre1) {
        this.lstDatosTerminalTerrestre1 = lstDatosTerminalTerrestre1;
    }

    public ArrayList<Victimas_2012> getLstDatosYaruquies1() {
        return lstDatosYaruquies1;
    }

    public void setLstDatosYaruquies1(ArrayList<Victimas_2012> lstDatosYaruquies1) {
        this.lstDatosYaruquies1 = lstDatosYaruquies1;
    }

    public CartesianChartModel getLineModel_Victima_Subcircuito() {
        return lineModel_Victima_Subcircuito;
    }

    public void setLineModel_Victima_Subcircuito(CartesianChartModel lineModel_Victima_Subcircuito) {
        this.lineModel_Victima_Subcircuito = lineModel_Victima_Subcircuito;
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }

    public Victimas_2012 getObjDatos() {
        return objDatos;
    }

    public void setObjDatos(Victimas_2012 objDatos) {
        this.objDatos = objDatos;
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

    public ArrayList<Victimas_2012> getLstDatos24Mayo1M() {
        return lstDatos24Mayo1M;
    }

    public void setLstDatos24Mayo1M(ArrayList<Victimas_2012> lstDatos24Mayo1M) {
        this.lstDatos24Mayo1M = lstDatos24Mayo1M;
    }

    public ArrayList<Victimas_2012> getLstDatos24Mayo1F() {
        return lstDatos24Mayo1F;
    }

    public void setLstDatos24Mayo1F(ArrayList<Victimas_2012> lstDatos24Mayo1F) {
        this.lstDatos24Mayo1F = lstDatos24Mayo1F;
    }

    public ArrayList<Victimas_2012> getLstDatos24Mayo2M() {
        return lstDatos24Mayo2M;
    }

    public void setLstDatos24Mayo2M(ArrayList<Victimas_2012> lstDatos24Mayo2M) {
        this.lstDatos24Mayo2M = lstDatos24Mayo2M;
    }

    public ArrayList<Victimas_2012> getLstDatos24Mayo2F() {
        return lstDatos24Mayo2F;
    }

    public void setLstDatos24Mayo2F(ArrayList<Victimas_2012> lstDatos24Mayo2F) {
        this.lstDatos24Mayo2F = lstDatos24Mayo2F;
    }

    public ArrayList<Victimas_2012> getLstDatosCamiloPonce1M() {
        return lstDatosCamiloPonce1M;
    }

    public void setLstDatosCamiloPonce1M(ArrayList<Victimas_2012> lstDatosCamiloPonce1M) {
        this.lstDatosCamiloPonce1M = lstDatosCamiloPonce1M;
    }

    public ArrayList<Victimas_2012> getLstDatosCamiloPonce1F() {
        return lstDatosCamiloPonce1F;
    }

    public void setLstDatosCamiloPonce1F(ArrayList<Victimas_2012> lstDatosCamiloPonce1F) {
        this.lstDatosCamiloPonce1F = lstDatosCamiloPonce1F;
    }

    public ArrayList<Victimas_2012> getLstDatosCamiloPonce2M() {
        return lstDatosCamiloPonce2M;
    }

    public void setLstDatosCamiloPonce2M(ArrayList<Victimas_2012> lstDatosCamiloPonce2M) {
        this.lstDatosCamiloPonce2M = lstDatosCamiloPonce2M;
    }

    public ArrayList<Victimas_2012> getLstDatosCamiloPonce2F() {
        return lstDatosCamiloPonce2F;
    }

    public void setLstDatosCamiloPonce2F(ArrayList<Victimas_2012> lstDatosCamiloPonce2F) {
        this.lstDatosCamiloPonce2F = lstDatosCamiloPonce2F;
    }

    public ArrayList<Victimas_2012> getLstDatosCaminoSol1M() {
        return lstDatosCaminoSol1M;
    }

    public void setLstDatosCaminoSol1M(ArrayList<Victimas_2012> lstDatosCaminoSol1M) {
        this.lstDatosCaminoSol1M = lstDatosCaminoSol1M;
    }

    public ArrayList<Victimas_2012> getLstDatosCaminoSol1F() {
        return lstDatosCaminoSol1F;
    }

    public void setLstDatosCaminoSol1F(ArrayList<Victimas_2012> lstDatosCaminoSol1F) {
        this.lstDatosCaminoSol1F = lstDatosCaminoSol1F;
    }

    public ArrayList<Victimas_2012> getLstDatosLaCondamine1M() {
        return lstDatosLaCondamine1M;
    }

    public void setLstDatosLaCondamine1M(ArrayList<Victimas_2012> lstDatosLaCondamine1M) {
        this.lstDatosLaCondamine1M = lstDatosLaCondamine1M;
    }

    public ArrayList<Victimas_2012> getLstDatosLaCondamine2M() {
        return lstDatosLaCondamine2M;
    }

    public void setLstDatosLaCondamine2M(ArrayList<Victimas_2012> lstDatosLaCondamine2M) {
        this.lstDatosLaCondamine2M = lstDatosLaCondamine2M;
    }

    public ArrayList<Victimas_2012> getLstDatosLaCondamine1F() {
        return lstDatosLaCondamine1F;
    }

    public void setLstDatosLaCondamine1F(ArrayList<Victimas_2012> lstDatosLaCondamine1F) {
        this.lstDatosLaCondamine1F = lstDatosLaCondamine1F;
    }

    public ArrayList<Victimas_2012> getLstDatosLaCondamine2F() {
        return lstDatosLaCondamine2F;
    }

    public void setLstDatosLaCondamine2F(ArrayList<Victimas_2012> lstDatosLaCondamine2F) {
        this.lstDatosLaCondamine2F = lstDatosLaCondamine2F;
    }

    public ArrayList<Victimas_2012> getLstDatosLaEstacion1F() {
        return lstDatosLaEstacion1F;
    }

    public void setLstDatosLaEstacion1F(ArrayList<Victimas_2012> lstDatosLaEstacion1F) {
        this.lstDatosLaEstacion1F = lstDatosLaEstacion1F;
    }

    public ArrayList<Victimas_2012> getLstDatosLaEstacion2F() {
        return lstDatosLaEstacion2F;
    }

    public void setLstDatosLaEstacion2F(ArrayList<Victimas_2012> lstDatosLaEstacion2F) {
        this.lstDatosLaEstacion2F = lstDatosLaEstacion2F;
    }

    public ArrayList<Victimas_2012> getLstDatosLaEstacion1M() {
        return lstDatosLaEstacion1M;
    }

    public void setLstDatosLaEstacion1M(ArrayList<Victimas_2012> lstDatosLaEstacion1M) {
        this.lstDatosLaEstacion1M = lstDatosLaEstacion1M;
    }

    public ArrayList<Victimas_2012> getLstDatosLaEstacion2M() {
        return lstDatosLaEstacion2M;
    }

    public void setLstDatosLaEstacion2M(ArrayList<Victimas_2012> lstDatosLaEstacion2M) {
        this.lstDatosLaEstacion2M = lstDatosLaEstacion2M;
    }

    public ArrayList<Victimas_2012> getLstDatosLaPaz1M() {
        return lstDatosLaPaz1M;
    }

    public void setLstDatosLaPaz1M(ArrayList<Victimas_2012> lstDatosLaPaz1M) {
        this.lstDatosLaPaz1M = lstDatosLaPaz1M;
    }

    public ArrayList<Victimas_2012> getLstDatosLaPaz2M() {
        return lstDatosLaPaz2M;
    }

    public void setLstDatosLaPaz2M(ArrayList<Victimas_2012> lstDatosLaPaz2M) {
        this.lstDatosLaPaz2M = lstDatosLaPaz2M;
    }

    public ArrayList<Victimas_2012> getLstDatosLaPaz1F() {
        return lstDatosLaPaz1F;
    }

    public void setLstDatosLaPaz1F(ArrayList<Victimas_2012> lstDatosLaPaz1F) {
        this.lstDatosLaPaz1F = lstDatosLaPaz1F;
    }

    public ArrayList<Victimas_2012> getLstDatosLaPaz2F() {
        return lstDatosLaPaz2F;
    }

    public void setLstDatosLaPaz2F(ArrayList<Victimas_2012> lstDatosLaPaz2F) {
        this.lstDatosLaPaz2F = lstDatosLaPaz2F;
    }

    public ArrayList<Victimas_2012> getLstDatosLaPrimavera1M() {
        return lstDatosLaPrimavera1M;
    }

    public void setLstDatosLaPrimavera1M(ArrayList<Victimas_2012> lstDatosLaPrimavera1M) {
        this.lstDatosLaPrimavera1M = lstDatosLaPrimavera1M;
    }

    public ArrayList<Victimas_2012> getLstDatosLaPrimavera1F() {
        return lstDatosLaPrimavera1F;
    }

    public void setLstDatosLaPrimavera1F(ArrayList<Victimas_2012> lstDatosLaPrimavera1F) {
        this.lstDatosLaPrimavera1F = lstDatosLaPrimavera1F;
    }

    public ArrayList<Victimas_2012> getLstDatosPolitecnica1M() {
        return lstDatosPolitecnica1M;
    }

    public void setLstDatosPolitecnica1M(ArrayList<Victimas_2012> lstDatosPolitecnica1M) {
        this.lstDatosPolitecnica1M = lstDatosPolitecnica1M;
    }

    public ArrayList<Victimas_2012> getLstDatosPolitecnica1F() {
        return lstDatosPolitecnica1F;
    }

    public void setLstDatosPolitecnica1F(ArrayList<Victimas_2012> lstDatosPolitecnica1F) {
        this.lstDatosPolitecnica1F = lstDatosPolitecnica1F;
    }

    public ArrayList<Victimas_2012> getLstDatosPolitecnica2M() {
        return lstDatosPolitecnica2M;
    }

    public void setLstDatosPolitecnica2M(ArrayList<Victimas_2012> lstDatosPolitecnica2M) {
        this.lstDatosPolitecnica2M = lstDatosPolitecnica2M;
    }

    public ArrayList<Victimas_2012> getLstDatosPolitecnica2F() {
        return lstDatosPolitecnica2F;
    }

    public void setLstDatosPolitecnica2F(ArrayList<Victimas_2012> lstDatosPolitecnica2F) {
        this.lstDatosPolitecnica2F = lstDatosPolitecnica2F;
    }

    public ArrayList<Victimas_2012> getLstDatosPolitecnica3M() {
        return lstDatosPolitecnica3M;
    }

    public void setLstDatosPolitecnica3M(ArrayList<Victimas_2012> lstDatosPolitecnica3M) {
        this.lstDatosPolitecnica3M = lstDatosPolitecnica3M;
    }

    public ArrayList<Victimas_2012> getLstDatosPolitecnica3F() {
        return lstDatosPolitecnica3F;
    }

    public void setLstDatosPolitecnica3F(ArrayList<Victimas_2012> lstDatosPolitecnica3F) {
        this.lstDatosPolitecnica3F = lstDatosPolitecnica3F;
    }

    public ArrayList<Victimas_2012> getLstDatosPucara1M() {
        return lstDatosPucara1M;
    }

    public void setLstDatosPucara1M(ArrayList<Victimas_2012> lstDatosPucara1M) {
        this.lstDatosPucara1M = lstDatosPucara1M;
    }

    public ArrayList<Victimas_2012> getLstDatosPucara1F() {
        return lstDatosPucara1F;
    }

    public void setLstDatosPucara1F(ArrayList<Victimas_2012> lstDatosPucara1F) {
        this.lstDatosPucara1F = lstDatosPucara1F;
    }

    public ArrayList<Victimas_2012> getLstDatosPucara2M() {
        return lstDatosPucara2M;
    }

    public void setLstDatosPucara2M(ArrayList<Victimas_2012> lstDatosPucara2M) {
        this.lstDatosPucara2M = lstDatosPucara2M;
    }

    public ArrayList<Victimas_2012> getLstDatosPucara2F() {
        return lstDatosPucara2F;
    }

    public void setLstDatosPucara2F(ArrayList<Victimas_2012> lstDatosPucara2F) {
        this.lstDatosPucara2F = lstDatosPucara2F;
    }

    public ArrayList<Victimas_2012> getLstDatosSanAlfonso1M() {
        return lstDatosSanAlfonso1M;
    }

    public void setLstDatosSanAlfonso1M(ArrayList<Victimas_2012> lstDatosSanAlfonso1M) {
        this.lstDatosSanAlfonso1M = lstDatosSanAlfonso1M;
    }

    public ArrayList<Victimas_2012> getLstDatosSanAlfonso1F() {
        return lstDatosSanAlfonso1F;
    }

    public void setLstDatosSanAlfonso1F(ArrayList<Victimas_2012> lstDatosSanAlfonso1F) {
        this.lstDatosSanAlfonso1F = lstDatosSanAlfonso1F;
    }

    public ArrayList<Victimas_2012> getLstDatosSanAlfonso2M() {
        return lstDatosSanAlfonso2M;
    }

    public void setLstDatosSanAlfonso2M(ArrayList<Victimas_2012> lstDatosSanAlfonso2M) {
        this.lstDatosSanAlfonso2M = lstDatosSanAlfonso2M;
    }

    public ArrayList<Victimas_2012> getLstDatosSanAlfonso2F() {
        return lstDatosSanAlfonso2F;
    }

    public void setLstDatosSanAlfonso2F(ArrayList<Victimas_2012> lstDatosSanAlfonso2F) {
        this.lstDatosSanAlfonso2F = lstDatosSanAlfonso2F;
    }

    public ArrayList<Victimas_2012> getLstDatosShopping1M() {
        return lstDatosShopping1M;
    }

    public void setLstDatosShopping1M(ArrayList<Victimas_2012> lstDatosShopping1M) {
        this.lstDatosShopping1M = lstDatosShopping1M;
    }

    public ArrayList<Victimas_2012> getLstDatosShopping1F() {
        return lstDatosShopping1F;
    }

    public void setLstDatosShopping1F(ArrayList<Victimas_2012> lstDatosShopping1F) {
        this.lstDatosShopping1F = lstDatosShopping1F;
    }

    public ArrayList<Victimas_2012> getLstDatosTerminalTerrestre1M() {
        return lstDatosTerminalTerrestre1M;
    }

    public void setLstDatosTerminalTerrestre1M(ArrayList<Victimas_2012> lstDatosTerminalTerrestre1M) {
        this.lstDatosTerminalTerrestre1M = lstDatosTerminalTerrestre1M;
    }

    public ArrayList<Victimas_2012> getLstDatosTerminalTerrestre1F() {
        return lstDatosTerminalTerrestre1F;
    }

    public void setLstDatosTerminalTerrestre1F(ArrayList<Victimas_2012> lstDatosTerminalTerrestre1F) {
        this.lstDatosTerminalTerrestre1F = lstDatosTerminalTerrestre1F;
    }

    public ArrayList<Victimas_2012> getLstDatosYaruquies1M() {
        return lstDatosYaruquies1M;
    }

    public void setLstDatosYaruquies1M(ArrayList<Victimas_2012> lstDatosYaruquies1M) {
        this.lstDatosYaruquies1M = lstDatosYaruquies1M;
    }

    public ArrayList<Victimas_2012> getLstDatosYaruquies1F() {
        return lstDatosYaruquies1F;
    }

    public void setLstDatosYaruquies1F(ArrayList<Victimas_2012> lstDatosYaruquies1F) {
        this.lstDatosYaruquies1F = lstDatosYaruquies1F;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {

        lineModel_Victima_Subcircuito = initCategoryModelSexoSubV();
        lineModel_Total_Subcircuito = TotalSubcircuito();
    }

    private void reinit() {
        this.datoSel = new Victimas_2012();
        this.lstDatos = new ArrayList<Victimas_2012>();

        this.cargarDatos();
        this.init();
    }

    public ControladorVictimas2012_Subcircuito() {
        this.reinit();
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

    private CartesianChartModel initCategoryModelSexoSubV() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos24Mayo1F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "24 DE MAYO 1");
            lstDatos24Mayo1M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "24 DE MAYO 1");
            lstDatos24Mayo2F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "24 DE MAYO 2");
            lstDatos24Mayo2M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "24 DE MAYO 2");
            lstDatosCamiloPonce1M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "CAMILO PONCE 1");
            lstDatosCamiloPonce1F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "CAMILO PONCE 1");
            lstDatosCamiloPonce2M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "CAMILO PONCE 2");
            lstDatosCamiloPonce2F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "CAMILO PONCE 2");
            lstDatosCaminoSol1F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "CAMINO AL SOL 1");
            lstDatosCaminoSol1M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "CAMINO AL SOL 1");
            lstDatosLaCondamine1F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "LA CONDAMINE 1");
            lstDatosLaCondamine1M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "LA CONDAMINE 1");
            lstDatosLaCondamine2F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "LA CONDAMINE 2");
            lstDatosLaCondamine2M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "LA CONDAMINE 2");
            lstDatosLaEstacion1F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "LA ESTACION 1");
            lstDatosLaEstacion1M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "LA ESTACION 1");
            lstDatosLaEstacion2F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "LA ESTACION 2");
            lstDatosLaEstacion2M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "LA ESTACION 2");
            lstDatosLaPaz1F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "LA PAZ 1");
            lstDatosLaPaz1M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "LA PAZ 1");
            lstDatosLaPaz2F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "LA PAZ 2");
            lstDatosLaPaz2M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "LA PAZ 2");
            lstDatosLaPrimavera1F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "LA PRIMAVERA 1");
            lstDatosLaPrimavera1M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "LA PRIMAVERA 1");
            lstDatosPolitecnica1F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "POLITECNICA 1");
            lstDatosPolitecnica1M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "POLITECNICA 1");
            lstDatosPolitecnica2F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "POLITECNICA 2");
            lstDatosPolitecnica2M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "POLITECNICA 2");
            lstDatosPolitecnica3F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "POLITECNICA 3");
            lstDatosPolitecnica3M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "POLITECNICA 3");
            lstDatosPucara1M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "PUCARA 1");
            lstDatosPucara1F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "PUCARA 1");
            lstDatosPucara2M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "PUCARA 2");
            lstDatosPucara2F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "PUCARA 2");
            lstDatosSanAlfonso1F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "SAN ALFONSO 1");
            lstDatosSanAlfonso1M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "SAN ALFONSO 1");
            lstDatosSanAlfonso2F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "SAN ALFONSO 2");
            lstDatosSanAlfonso2M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "SAN ALFONSO 2");
            lstDatosShopping1F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "SHOPPING 1");
            lstDatosShopping1M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "SHOPPING 1");
            lstDatosTerminalTerrestre1F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "TERMINAL TERRESTRE 1");
            lstDatosTerminalTerrestre1M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "TERMINAL TERRESTRE 1");
            lstDatosYaruquies1F = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Femenino", "YARUQUIES 1");
            lstDatosYaruquies1M = FVictimas_2012.ObtenerDatosDadoSexoVictimaSubcircuito("Masculino", "YARUQUIES 1");

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            Masculino.set("24 DE MAYO 1", lstDatos24Mayo1M.size());
            Masculino.set("24 DE MAYO 2", lstDatos24Mayo2M.size());
            Masculino.set("CAMILO PONCE 1", lstDatosCamiloPonce1M.size());
            Masculino.set("CAMILO PONCE 2", lstDatosCamiloPonce2M.size());
            Masculino.set("CAMINO AL SOL 1", lstDatosCaminoSol1M.size());
            Masculino.set("LA CONDAMINE 1", lstDatosLaCondamine1M.size());
            Masculino.set("LA CONDAMINE 2", lstDatosLaCondamine2M.size());
            Masculino.set("LA ESTACION 1", lstDatosLaEstacion1M.size());
            Masculino.set("LA ESTACION 2", lstDatosLaEstacion2M.size());
            Masculino.set("LA PAZ 1", lstDatosLaPaz1M.size());
            Masculino.set("LA PAZ 2", lstDatosLaPaz2M.size());
            Masculino.set("LA PRIMAVERA 1", lstDatosLaPrimavera1M.size());
            Masculino.set("POLITECNICA 1", lstDatosPolitecnica1M.size());
            Masculino.set("POLITECNICA 2", lstDatosPolitecnica2M.size());
            Masculino.set("POLITECNICA 3", lstDatosPolitecnica3M.size());
            Masculino.set("PUCARA 1", lstDatosPucara1M.size());
            Masculino.set("PUCARA 2", lstDatosPucara2M.size());
            Masculino.set("SAN ALFONSO 1", lstDatosSanAlfonso1M.size());
            Masculino.set("SAN ALFONSO 2", lstDatosSanAlfonso2M.size());
            Masculino.set("SHOPPING 1", lstDatosShopping1M.size());
            Masculino.set("TERMINAL TERRESTRE 1", lstDatosTerminalTerrestre1M.size());
            Masculino.set("YARUQUIES 1", lstDatosYaruquies1M.size());

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            Femenino.set("24 DE MAYO 1", lstDatos24Mayo1F.size());
            Femenino.set("24 DE MAYO 2", lstDatos24Mayo2F.size());
            Femenino.set("CAMILO PONCE 1", lstDatosCamiloPonce1F.size());
            Femenino.set("CAMILO PONCE 2", lstDatosCamiloPonce2F.size());
            Femenino.set("CAMINO AL SOL 1", lstDatosCaminoSol1F.size());
            Femenino.set("LA CONDAMINE 1", lstDatosLaCondamine1F.size());
            Femenino.set("LA CONDAMINE 2", lstDatosLaCondamine2F.size());
            Femenino.set("LA ESTACION 1", lstDatosLaEstacion1F.size());
            Femenino.set("LA ESTACION 2", lstDatosLaEstacion2F.size());
            Femenino.set("LA PAZ 1", lstDatosLaPaz1F.size());
            Femenino.set("LA PAZ 2", lstDatosLaPaz2F.size());
            Femenino.set("LA PRIMAVERA 1", lstDatosLaPrimavera1F.size());
            Femenino.set("POLITECNICA 1", lstDatosPolitecnica1F.size());
            Femenino.set("POLITECNICA 2", lstDatosPolitecnica2F.size());
            Femenino.set("POLITECNICA 3", lstDatosPolitecnica3F.size());
            Femenino.set("PUCARA 1", lstDatosPucara1F.size());
            Femenino.set("PUCARA 2", lstDatosPucara2F.size());
            Femenino.set("SAN ALFONSO 1", lstDatosSanAlfonso1F.size());
            Femenino.set("SAN ALFONSO 2", lstDatosSanAlfonso2F.size());
            Femenino.set("SHOPPING 1", lstDatosShopping1F.size());
            Femenino.set("TERMINAL TERRESTRE 1", lstDatosTerminalTerrestre1F.size());
            Femenino.set("YARUQUIES 1", lstDatosYaruquies1F.size());

            model.addSeries(Masculino);
            model.addSeries(Femenino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel TotalSubcircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos24Mayo1 = FVictimas_2012.ObtenerDatosDadoSubCircuito("24 DE MAYO 1");
            lstDatos24Mayo2 = FVictimas_2012.ObtenerDatosDadoSubCircuito("24 DE MAYO 2");
            lstDatosCamiloPonce1 = FVictimas_2012.ObtenerDatosDadoSubCircuito("CAMILO PONCE 1");
            lstDatosCamiloPonce2 = FVictimas_2012.ObtenerDatosDadoSubCircuito("CAMILO PONCE 2");
            lstDatosCaminoSol1 = FVictimas_2012.ObtenerDatosDadoSubCircuito("CAMINO AL SOL 1");
            lstDatosLaCondamine1 = FVictimas_2012.ObtenerDatosDadoSubCircuito("LA CONDAMINE 1");
            lstDatosLaCondamine2 = FVictimas_2012.ObtenerDatosDadoSubCircuito("LA CONDAMINE 2");
            lstDatosLaEstacion1 = FVictimas_2012.ObtenerDatosDadoSubCircuito("LA ESTACION 1");
            lstDatosLaEstacion2 = FVictimas_2012.ObtenerDatosDadoSubCircuito("LA ESTACION 2");
            lstDatosLaPaz1 = FVictimas_2012.ObtenerDatosDadoSubCircuito("LA PAZ 1");
            lstDatosLaPaz2 = FVictimas_2012.ObtenerDatosDadoSubCircuito("LA PAZ 2");
            lstDatosLaPrimavera1 = FVictimas_2012.ObtenerDatosDadoSubCircuito("LA PRIMAVERA 1");
            lstDatosPolitecnica1 = FVictimas_2012.ObtenerDatosDadoSubCircuito("POLITECNICA 1");
            lstDatosPolitecnica2 = FVictimas_2012.ObtenerDatosDadoSubCircuito("POLITECNICA 2");
            lstDatosPolitecnica3 = FVictimas_2012.ObtenerDatosDadoSubCircuito("POLITECNICA 3");
            lstDatosPucara1 = FVictimas_2012.ObtenerDatosDadoSubCircuito("PUCARA 1");
            lstDatosPucara2 = FVictimas_2012.ObtenerDatosDadoSubCircuito("PUCARA 2");
            lstDatosSanAlfonso1 = FVictimas_2012.ObtenerDatosDadoSubCircuito("SAN ALFONSO 1");
            lstDatosSanAlfonso2 = FVictimas_2012.ObtenerDatosDadoSubCircuito("SAN ALFONSO 2");
            lstDatosShopping1 = FVictimas_2012.ObtenerDatosDadoSubCircuito("SHOPPING 1");
            lstDatosTerminalTerrestre1 = FVictimas_2012.ObtenerDatosDadoSubCircuito("TERMINAL TERRESTRE 1");
            lstDatosYaruquies1 = FVictimas_2012.ObtenerDatosDadoSubCircuito("YARUQUIES 1");

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Casos");
            Masculino.set("24 DE MAYO 1", lstDatos24Mayo1.size());
            Masculino.set("24 DE MAYO 2", lstDatos24Mayo2.size());
            Masculino.set("CAMILO PONCE 1", lstDatosCamiloPonce1.size());
            Masculino.set("CAMILO PONCE 2", lstDatosCamiloPonce2.size());
            Masculino.set("CAMINO AL SOL 1", lstDatosCaminoSol1.size());
            Masculino.set("LA CONDAMINE 1", lstDatosLaCondamine1.size());
            Masculino.set("LA CONDAMINE 2", lstDatosLaCondamine2.size());
            Masculino.set("LA ESTACION 1", lstDatosLaEstacion1.size());
            Masculino.set("LA ESTACION 2", lstDatosLaEstacion2.size());
            Masculino.set("LA PAZ 1", lstDatosLaPaz1.size());
            Masculino.set("LA PAZ 2", lstDatosLaPaz2.size());
            Masculino.set("LA PRIMAVERA 1", lstDatosLaPrimavera1.size());
            Masculino.set("POLITECNICA 1", lstDatosPolitecnica1.size());
            Masculino.set("POLITECNICA 2", lstDatosPolitecnica2.size());
            Masculino.set("POLITECNICA 3", lstDatosPolitecnica3.size());
            Masculino.set("PUCARA 1", lstDatosPucara1.size());
            Masculino.set("PUCARA 2", lstDatosPucara2.size());
            Masculino.set("SAN ALFONSO 1", lstDatosSanAlfonso1.size());
            Masculino.set("SAN ALFONSO 2", lstDatosSanAlfonso2.size());
            Masculino.set("SHOPPING 1", lstDatosShopping1.size());
            Masculino.set("TERMINAL TERRESTRE 1", lstDatosTerminalTerrestre1.size());
            Masculino.set("YARUQUIES 1", lstDatosYaruquies1.size());

            model.addSeries(Masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
