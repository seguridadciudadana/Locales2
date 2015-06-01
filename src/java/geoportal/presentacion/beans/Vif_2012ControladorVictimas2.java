/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2012;
import geoportal.logica.funciones.FVif_2012;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author Geovanny Cudco
 */
@ManagedBean
@RequestScoped
public class Vif_2012ControladorVictimas2 {

    /**
     * Creates a new instance of Vif_2012ControladorVictimas2
     */
    private CartesianChartModel lineModel_Victima_Circuito;
    private CartesianChartModel lineModel_Victima_Subcircuito;
    private CartesianChartModel lineModel8;
    private Vif_2012 objDatos;
    private Vif_2012 datoSel;
    private ArrayList<Vif_2012> lstDatos;
    private ArrayList<Vif_2012> lstDatos24MayoM;
    private ArrayList<Vif_2012> lstDatos24MayoF;
    private ArrayList<Vif_2012> lstDatosCamiloPonceM;
    private ArrayList<Vif_2012> lstDatosCamiloPonceF;
    private ArrayList<Vif_2012> lstDatosCaminoSolM;
    private ArrayList<Vif_2012> lstDatosLaCondamineM;
    private ArrayList<Vif_2012> lstDatosLaEstacionM;
    private ArrayList<Vif_2012> lstDatosLaPazM;
    private ArrayList<Vif_2012> lstDatosLaPrimaveraM;
    private ArrayList<Vif_2012> lstDatosPolitecnicaM;
    private ArrayList<Vif_2012> lstDatosPucaraM;
    private ArrayList<Vif_2012> lstDatosSanAlfonsoM;
    private ArrayList<Vif_2012> lstDatosShoppingM;
    private ArrayList<Vif_2012> lstDatosTerminalTerrestreM;
    private ArrayList<Vif_2012> lstDatosYaruquiesM;
    private ArrayList<Vif_2012> lstDatosCaminoSolF;
    private ArrayList<Vif_2012> lstDatosLaCondamineF;
    private ArrayList<Vif_2012> lstDatosLaEstacionF;
    private ArrayList<Vif_2012> lstDatosLaPazF;
    private ArrayList<Vif_2012> lstDatosLaPrimaveraF;
    private ArrayList<Vif_2012> lstDatosPolitecnicaF;
    private ArrayList<Vif_2012> lstDatosPucaraF;
    private ArrayList<Vif_2012> lstDatosSanAlfonsoF;
    private ArrayList<Vif_2012> lstDatosShoppingF;
    private ArrayList<Vif_2012> lstDatosTerminalTerrestreF;
    private ArrayList<Vif_2012> lstDatosYaruquiesF;
    private ArrayList<Vif_2012> lstDatos24Mayo1M;
    private ArrayList<Vif_2012> lstDatos24Mayo1F;
    private ArrayList<Vif_2012> lstDatos24Mayo2M;
    private ArrayList<Vif_2012> lstDatos24Mayo2F;
    private ArrayList<Vif_2012> lstDatosCamiloPonce1M;
    private ArrayList<Vif_2012> lstDatosCamiloPonce1F;
    private ArrayList<Vif_2012> lstDatosCamiloPonce2M;
    private ArrayList<Vif_2012> lstDatosCamiloPonce2F;
    private ArrayList<Vif_2012> lstDatosCaminoSol1M;
    private ArrayList<Vif_2012> lstDatosCaminoSol1F;
    private ArrayList<Vif_2012> lstDatosLaCondamine1M;
    private ArrayList<Vif_2012> lstDatosLaCondamine2M;
    private ArrayList<Vif_2012> lstDatosLaCondamine1F;
    private ArrayList<Vif_2012> lstDatosLaCondamine2F;
    private ArrayList<Vif_2012> lstDatosLaEstacion1F;
    private ArrayList<Vif_2012> lstDatosLaEstacion2F;
    private ArrayList<Vif_2012> lstDatosLaEstacion1M;
    private ArrayList<Vif_2012> lstDatosLaEstacion2M;
    private ArrayList<Vif_2012> lstDatosLaPaz1M;
    private ArrayList<Vif_2012> lstDatosLaPaz2M;
    private ArrayList<Vif_2012> lstDatosLaPaz1F;
    private ArrayList<Vif_2012> lstDatosLaPaz2F;
    private ArrayList<Vif_2012> lstDatosLaPrimavera1M;
    private ArrayList<Vif_2012> lstDatosLaPrimavera1F;
    private ArrayList<Vif_2012> lstDatosPolitecnica1M;
    private ArrayList<Vif_2012> lstDatosPolitecnica1F;
    private ArrayList<Vif_2012> lstDatosPolitecnica2M;
    private ArrayList<Vif_2012> lstDatosPolitecnica2F;
    private ArrayList<Vif_2012> lstDatosPolitecnica3M;
    private ArrayList<Vif_2012> lstDatosPolitecnica3F;
    private ArrayList<Vif_2012> lstDatosPucara1M;
    private ArrayList<Vif_2012> lstDatosPucara1F;
    private ArrayList<Vif_2012> lstDatosPucara2M;
    private ArrayList<Vif_2012> lstDatosPucara2F;
    private ArrayList<Vif_2012> lstDatosSanAlfonso1M;
    private ArrayList<Vif_2012> lstDatosSanAlfonso1F;
    private ArrayList<Vif_2012> lstDatosSanAlfonso2M;
    private ArrayList<Vif_2012> lstDatosSanAlfonso2F;
    private ArrayList<Vif_2012> lstDatosShopping1M;
    private ArrayList<Vif_2012> lstDatosShopping1F;
    private ArrayList<Vif_2012> lstDatosTerminalTerrestre1M;
    private ArrayList<Vif_2012> lstDatosTerminalTerrestre1F;
    private ArrayList<Vif_2012> lstDatosYaruquies1M;
    private ArrayList<Vif_2012> lstDatosYaruquies1F;

    public CartesianChartModel getLineModel_Victima_Circuito() {
        return lineModel_Victima_Circuito;
    }

    public void setLineModel_Victima_Circuito(CartesianChartModel lineModel_Victima_Circuito) {
        this.lineModel_Victima_Circuito = lineModel_Victima_Circuito;
    }

    public CartesianChartModel getLineModel_Victima_Subcircuito() {
        return lineModel_Victima_Subcircuito;
    }

    public void setLineModel_Victima_Subcircuito(CartesianChartModel lineModel_Victima_Subcircuito) {
        this.lineModel_Victima_Subcircuito = lineModel_Victima_Subcircuito;
    }

    public CartesianChartModel getLineModel8() {
        return lineModel8;
    }

    public void setLineModel8(CartesianChartModel lineModel8) {
        this.lineModel8 = lineModel8;
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

    public ArrayList<Vif_2012> getLstDatos24MayoM() {
        return lstDatos24MayoM;
    }

    public void setLstDatos24MayoM(ArrayList<Vif_2012> lstDatos24MayoM) {
        this.lstDatos24MayoM = lstDatos24MayoM;
    }

    public ArrayList<Vif_2012> getLstDatos24MayoF() {
        return lstDatos24MayoF;
    }

    public void setLstDatos24MayoF(ArrayList<Vif_2012> lstDatos24MayoF) {
        this.lstDatos24MayoF = lstDatos24MayoF;
    }

    public ArrayList<Vif_2012> getLstDatosCamiloPonceM() {
        return lstDatosCamiloPonceM;
    }

    public void setLstDatosCamiloPonceM(ArrayList<Vif_2012> lstDatosCamiloPonceM) {
        this.lstDatosCamiloPonceM = lstDatosCamiloPonceM;
    }

    public ArrayList<Vif_2012> getLstDatosCamiloPonceF() {
        return lstDatosCamiloPonceF;
    }

    public void setLstDatosCamiloPonceF(ArrayList<Vif_2012> lstDatosCamiloPonceF) {
        this.lstDatosCamiloPonceF = lstDatosCamiloPonceF;
    }

    public ArrayList<Vif_2012> getLstDatosCaminoSolM() {
        return lstDatosCaminoSolM;
    }

    public void setLstDatosCaminoSolM(ArrayList<Vif_2012> lstDatosCaminoSolM) {
        this.lstDatosCaminoSolM = lstDatosCaminoSolM;
    }

    public ArrayList<Vif_2012> getLstDatosLaCondamineM() {
        return lstDatosLaCondamineM;
    }

    public void setLstDatosLaCondamineM(ArrayList<Vif_2012> lstDatosLaCondamineM) {
        this.lstDatosLaCondamineM = lstDatosLaCondamineM;
    }

    public ArrayList<Vif_2012> getLstDatosLaEstacionM() {
        return lstDatosLaEstacionM;
    }

    public void setLstDatosLaEstacionM(ArrayList<Vif_2012> lstDatosLaEstacionM) {
        this.lstDatosLaEstacionM = lstDatosLaEstacionM;
    }

    public ArrayList<Vif_2012> getLstDatosLaPazM() {
        return lstDatosLaPazM;
    }

    public void setLstDatosLaPazM(ArrayList<Vif_2012> lstDatosLaPazM) {
        this.lstDatosLaPazM = lstDatosLaPazM;
    }

    public ArrayList<Vif_2012> getLstDatosLaPrimaveraM() {
        return lstDatosLaPrimaveraM;
    }

    public void setLstDatosLaPrimaveraM(ArrayList<Vif_2012> lstDatosLaPrimaveraM) {
        this.lstDatosLaPrimaveraM = lstDatosLaPrimaveraM;
    }

    public ArrayList<Vif_2012> getLstDatosPolitecnicaM() {
        return lstDatosPolitecnicaM;
    }

    public void setLstDatosPolitecnicaM(ArrayList<Vif_2012> lstDatosPolitecnicaM) {
        this.lstDatosPolitecnicaM = lstDatosPolitecnicaM;
    }

    public ArrayList<Vif_2012> getLstDatosPucaraM() {
        return lstDatosPucaraM;
    }

    public void setLstDatosPucaraM(ArrayList<Vif_2012> lstDatosPucaraM) {
        this.lstDatosPucaraM = lstDatosPucaraM;
    }

    public ArrayList<Vif_2012> getLstDatosSanAlfonsoM() {
        return lstDatosSanAlfonsoM;
    }

    public void setLstDatosSanAlfonsoM(ArrayList<Vif_2012> lstDatosSanAlfonsoM) {
        this.lstDatosSanAlfonsoM = lstDatosSanAlfonsoM;
    }

    public ArrayList<Vif_2012> getLstDatosShoppingM() {
        return lstDatosShoppingM;
    }

    public void setLstDatosShoppingM(ArrayList<Vif_2012> lstDatosShoppingM) {
        this.lstDatosShoppingM = lstDatosShoppingM;
    }

    public ArrayList<Vif_2012> getLstDatosTerminalTerrestreM() {
        return lstDatosTerminalTerrestreM;
    }

    public void setLstDatosTerminalTerrestreM(ArrayList<Vif_2012> lstDatosTerminalTerrestreM) {
        this.lstDatosTerminalTerrestreM = lstDatosTerminalTerrestreM;
    }

    public ArrayList<Vif_2012> getLstDatosYaruquiesM() {
        return lstDatosYaruquiesM;
    }

    public void setLstDatosYaruquiesM(ArrayList<Vif_2012> lstDatosYaruquiesM) {
        this.lstDatosYaruquiesM = lstDatosYaruquiesM;
    }

    public ArrayList<Vif_2012> getLstDatosCaminoSolF() {
        return lstDatosCaminoSolF;
    }

    public void setLstDatosCaminoSolF(ArrayList<Vif_2012> lstDatosCaminoSolF) {
        this.lstDatosCaminoSolF = lstDatosCaminoSolF;
    }

    public ArrayList<Vif_2012> getLstDatosLaCondamineF() {
        return lstDatosLaCondamineF;
    }

    public void setLstDatosLaCondamineF(ArrayList<Vif_2012> lstDatosLaCondamineF) {
        this.lstDatosLaCondamineF = lstDatosLaCondamineF;
    }

    public ArrayList<Vif_2012> getLstDatosLaEstacionF() {
        return lstDatosLaEstacionF;
    }

    public void setLstDatosLaEstacionF(ArrayList<Vif_2012> lstDatosLaEstacionF) {
        this.lstDatosLaEstacionF = lstDatosLaEstacionF;
    }

    public ArrayList<Vif_2012> getLstDatosLaPazF() {
        return lstDatosLaPazF;
    }

    public void setLstDatosLaPazF(ArrayList<Vif_2012> lstDatosLaPazF) {
        this.lstDatosLaPazF = lstDatosLaPazF;
    }

    public ArrayList<Vif_2012> getLstDatosLaPrimaveraF() {
        return lstDatosLaPrimaveraF;
    }

    public void setLstDatosLaPrimaveraF(ArrayList<Vif_2012> lstDatosLaPrimaveraF) {
        this.lstDatosLaPrimaveraF = lstDatosLaPrimaveraF;
    }

    public ArrayList<Vif_2012> getLstDatosPolitecnicaF() {
        return lstDatosPolitecnicaF;
    }

    public void setLstDatosPolitecnicaF(ArrayList<Vif_2012> lstDatosPolitecnicaF) {
        this.lstDatosPolitecnicaF = lstDatosPolitecnicaF;
    }

    public ArrayList<Vif_2012> getLstDatosPucaraF() {
        return lstDatosPucaraF;
    }

    public void setLstDatosPucaraF(ArrayList<Vif_2012> lstDatosPucaraF) {
        this.lstDatosPucaraF = lstDatosPucaraF;
    }

    public ArrayList<Vif_2012> getLstDatosSanAlfonsoF() {
        return lstDatosSanAlfonsoF;
    }

    public void setLstDatosSanAlfonsoF(ArrayList<Vif_2012> lstDatosSanAlfonsoF) {
        this.lstDatosSanAlfonsoF = lstDatosSanAlfonsoF;
    }

    public ArrayList<Vif_2012> getLstDatosShoppingF() {
        return lstDatosShoppingF;
    }

    public void setLstDatosShoppingF(ArrayList<Vif_2012> lstDatosShoppingF) {
        this.lstDatosShoppingF = lstDatosShoppingF;
    }

    public ArrayList<Vif_2012> getLstDatosTerminalTerrestreF() {
        return lstDatosTerminalTerrestreF;
    }

    public void setLstDatosTerminalTerrestreF(ArrayList<Vif_2012> lstDatosTerminalTerrestreF) {
        this.lstDatosTerminalTerrestreF = lstDatosTerminalTerrestreF;
    }

    public ArrayList<Vif_2012> getLstDatosYaruquiesF() {
        return lstDatosYaruquiesF;
    }

    public void setLstDatosYaruquiesF(ArrayList<Vif_2012> lstDatosYaruquiesF) {
        this.lstDatosYaruquiesF = lstDatosYaruquiesF;
    }

    public ArrayList<Vif_2012> getLstDatos24Mayo1M() {
        return lstDatos24Mayo1M;
    }

    public void setLstDatos24Mayo1M(ArrayList<Vif_2012> lstDatos24Mayo1M) {
        this.lstDatos24Mayo1M = lstDatos24Mayo1M;
    }

    public ArrayList<Vif_2012> getLstDatos24Mayo1F() {
        return lstDatos24Mayo1F;
    }

    public void setLstDatos24Mayo1F(ArrayList<Vif_2012> lstDatos24Mayo1F) {
        this.lstDatos24Mayo1F = lstDatos24Mayo1F;
    }

    public ArrayList<Vif_2012> getLstDatos24Mayo2M() {
        return lstDatos24Mayo2M;
    }

    public void setLstDatos24Mayo2M(ArrayList<Vif_2012> lstDatos24Mayo2M) {
        this.lstDatos24Mayo2M = lstDatos24Mayo2M;
    }

    public ArrayList<Vif_2012> getLstDatos24Mayo2F() {
        return lstDatos24Mayo2F;
    }

    public void setLstDatos24Mayo2F(ArrayList<Vif_2012> lstDatos24Mayo2F) {
        this.lstDatos24Mayo2F = lstDatos24Mayo2F;
    }

    public ArrayList<Vif_2012> getLstDatosCamiloPonce1M() {
        return lstDatosCamiloPonce1M;
    }

    public void setLstDatosCamiloPonce1M(ArrayList<Vif_2012> lstDatosCamiloPonce1M) {
        this.lstDatosCamiloPonce1M = lstDatosCamiloPonce1M;
    }

    public ArrayList<Vif_2012> getLstDatosCamiloPonce1F() {
        return lstDatosCamiloPonce1F;
    }

    public void setLstDatosCamiloPonce1F(ArrayList<Vif_2012> lstDatosCamiloPonce1F) {
        this.lstDatosCamiloPonce1F = lstDatosCamiloPonce1F;
    }

    public ArrayList<Vif_2012> getLstDatosCamiloPonce2M() {
        return lstDatosCamiloPonce2M;
    }

    public void setLstDatosCamiloPonce2M(ArrayList<Vif_2012> lstDatosCamiloPonce2M) {
        this.lstDatosCamiloPonce2M = lstDatosCamiloPonce2M;
    }

    public ArrayList<Vif_2012> getLstDatosCamiloPonce2F() {
        return lstDatosCamiloPonce2F;
    }

    public void setLstDatosCamiloPonce2F(ArrayList<Vif_2012> lstDatosCamiloPonce2F) {
        this.lstDatosCamiloPonce2F = lstDatosCamiloPonce2F;
    }

    public ArrayList<Vif_2012> getLstDatosCaminoSol1M() {
        return lstDatosCaminoSol1M;
    }

    public void setLstDatosCaminoSol1M(ArrayList<Vif_2012> lstDatosCaminoSol1M) {
        this.lstDatosCaminoSol1M = lstDatosCaminoSol1M;
    }

    public ArrayList<Vif_2012> getLstDatosCaminoSol1F() {
        return lstDatosCaminoSol1F;
    }

    public void setLstDatosCaminoSol1F(ArrayList<Vif_2012> lstDatosCaminoSol1F) {
        this.lstDatosCaminoSol1F = lstDatosCaminoSol1F;
    }

    public ArrayList<Vif_2012> getLstDatosLaCondamine1M() {
        return lstDatosLaCondamine1M;
    }

    public void setLstDatosLaCondamine1M(ArrayList<Vif_2012> lstDatosLaCondamine1M) {
        this.lstDatosLaCondamine1M = lstDatosLaCondamine1M;
    }

    public ArrayList<Vif_2012> getLstDatosLaCondamine2M() {
        return lstDatosLaCondamine2M;
    }

    public void setLstDatosLaCondamine2M(ArrayList<Vif_2012> lstDatosLaCondamine2M) {
        this.lstDatosLaCondamine2M = lstDatosLaCondamine2M;
    }

    public ArrayList<Vif_2012> getLstDatosLaCondamine1F() {
        return lstDatosLaCondamine1F;
    }

    public void setLstDatosLaCondamine1F(ArrayList<Vif_2012> lstDatosLaCondamine1F) {
        this.lstDatosLaCondamine1F = lstDatosLaCondamine1F;
    }

    public ArrayList<Vif_2012> getLstDatosLaCondamine2F() {
        return lstDatosLaCondamine2F;
    }

    public void setLstDatosLaCondamine2F(ArrayList<Vif_2012> lstDatosLaCondamine2F) {
        this.lstDatosLaCondamine2F = lstDatosLaCondamine2F;
    }

    public ArrayList<Vif_2012> getLstDatosLaEstacion1F() {
        return lstDatosLaEstacion1F;
    }

    public void setLstDatosLaEstacion1F(ArrayList<Vif_2012> lstDatosLaEstacion1F) {
        this.lstDatosLaEstacion1F = lstDatosLaEstacion1F;
    }

    public ArrayList<Vif_2012> getLstDatosLaEstacion2F() {
        return lstDatosLaEstacion2F;
    }

    public void setLstDatosLaEstacion2F(ArrayList<Vif_2012> lstDatosLaEstacion2F) {
        this.lstDatosLaEstacion2F = lstDatosLaEstacion2F;
    }

    public ArrayList<Vif_2012> getLstDatosLaEstacion1M() {
        return lstDatosLaEstacion1M;
    }

    public void setLstDatosLaEstacion1M(ArrayList<Vif_2012> lstDatosLaEstacion1M) {
        this.lstDatosLaEstacion1M = lstDatosLaEstacion1M;
    }

    public ArrayList<Vif_2012> getLstDatosLaEstacion2M() {
        return lstDatosLaEstacion2M;
    }

    public void setLstDatosLaEstacion2M(ArrayList<Vif_2012> lstDatosLaEstacion2M) {
        this.lstDatosLaEstacion2M = lstDatosLaEstacion2M;
    }

    public ArrayList<Vif_2012> getLstDatosLaPaz1M() {
        return lstDatosLaPaz1M;
    }

    public void setLstDatosLaPaz1M(ArrayList<Vif_2012> lstDatosLaPaz1M) {
        this.lstDatosLaPaz1M = lstDatosLaPaz1M;
    }

    public ArrayList<Vif_2012> getLstDatosLaPaz2M() {
        return lstDatosLaPaz2M;
    }

    public void setLstDatosLaPaz2M(ArrayList<Vif_2012> lstDatosLaPaz2M) {
        this.lstDatosLaPaz2M = lstDatosLaPaz2M;
    }

    public ArrayList<Vif_2012> getLstDatosLaPaz1F() {
        return lstDatosLaPaz1F;
    }

    public void setLstDatosLaPaz1F(ArrayList<Vif_2012> lstDatosLaPaz1F) {
        this.lstDatosLaPaz1F = lstDatosLaPaz1F;
    }

    public ArrayList<Vif_2012> getLstDatosLaPaz2F() {
        return lstDatosLaPaz2F;
    }

    public void setLstDatosLaPaz2F(ArrayList<Vif_2012> lstDatosLaPaz2F) {
        this.lstDatosLaPaz2F = lstDatosLaPaz2F;
    }

    public ArrayList<Vif_2012> getLstDatosLaPrimavera1M() {
        return lstDatosLaPrimavera1M;
    }

    public void setLstDatosLaPrimavera1M(ArrayList<Vif_2012> lstDatosLaPrimavera1M) {
        this.lstDatosLaPrimavera1M = lstDatosLaPrimavera1M;
    }

    public ArrayList<Vif_2012> getLstDatosLaPrimavera1F() {
        return lstDatosLaPrimavera1F;
    }

    public void setLstDatosLaPrimavera1F(ArrayList<Vif_2012> lstDatosLaPrimavera1F) {
        this.lstDatosLaPrimavera1F = lstDatosLaPrimavera1F;
    }

    public ArrayList<Vif_2012> getLstDatosPolitecnica1M() {
        return lstDatosPolitecnica1M;
    }

    public void setLstDatosPolitecnica1M(ArrayList<Vif_2012> lstDatosPolitecnica1M) {
        this.lstDatosPolitecnica1M = lstDatosPolitecnica1M;
    }

    public ArrayList<Vif_2012> getLstDatosPolitecnica1F() {
        return lstDatosPolitecnica1F;
    }

    public void setLstDatosPolitecnica1F(ArrayList<Vif_2012> lstDatosPolitecnica1F) {
        this.lstDatosPolitecnica1F = lstDatosPolitecnica1F;
    }

    public ArrayList<Vif_2012> getLstDatosPolitecnica2M() {
        return lstDatosPolitecnica2M;
    }

    public void setLstDatosPolitecnica2M(ArrayList<Vif_2012> lstDatosPolitecnica2M) {
        this.lstDatosPolitecnica2M = lstDatosPolitecnica2M;
    }

    public ArrayList<Vif_2012> getLstDatosPolitecnica2F() {
        return lstDatosPolitecnica2F;
    }

    public void setLstDatosPolitecnica2F(ArrayList<Vif_2012> lstDatosPolitecnica2F) {
        this.lstDatosPolitecnica2F = lstDatosPolitecnica2F;
    }

    public ArrayList<Vif_2012> getLstDatosPolitecnica3M() {
        return lstDatosPolitecnica3M;
    }

    public void setLstDatosPolitecnica3M(ArrayList<Vif_2012> lstDatosPolitecnica3M) {
        this.lstDatosPolitecnica3M = lstDatosPolitecnica3M;
    }

    public ArrayList<Vif_2012> getLstDatosPolitecnica3F() {
        return lstDatosPolitecnica3F;
    }

    public void setLstDatosPolitecnica3F(ArrayList<Vif_2012> lstDatosPolitecnica3F) {
        this.lstDatosPolitecnica3F = lstDatosPolitecnica3F;
    }

    public ArrayList<Vif_2012> getLstDatosPucara1M() {
        return lstDatosPucara1M;
    }

    public void setLstDatosPucara1M(ArrayList<Vif_2012> lstDatosPucara1M) {
        this.lstDatosPucara1M = lstDatosPucara1M;
    }

    public ArrayList<Vif_2012> getLstDatosPucara1F() {
        return lstDatosPucara1F;
    }

    public void setLstDatosPucara1F(ArrayList<Vif_2012> lstDatosPucara1F) {
        this.lstDatosPucara1F = lstDatosPucara1F;
    }

    public ArrayList<Vif_2012> getLstDatosPucara2M() {
        return lstDatosPucara2M;
    }

    public void setLstDatosPucara2M(ArrayList<Vif_2012> lstDatosPucara2M) {
        this.lstDatosPucara2M = lstDatosPucara2M;
    }

    public ArrayList<Vif_2012> getLstDatosPucara2F() {
        return lstDatosPucara2F;
    }

    public void setLstDatosPucara2F(ArrayList<Vif_2012> lstDatosPucara2F) {
        this.lstDatosPucara2F = lstDatosPucara2F;
    }

    public ArrayList<Vif_2012> getLstDatosSanAlfonso1M() {
        return lstDatosSanAlfonso1M;
    }

    public void setLstDatosSanAlfonso1M(ArrayList<Vif_2012> lstDatosSanAlfonso1M) {
        this.lstDatosSanAlfonso1M = lstDatosSanAlfonso1M;
    }

    public ArrayList<Vif_2012> getLstDatosSanAlfonso1F() {
        return lstDatosSanAlfonso1F;
    }

    public void setLstDatosSanAlfonso1F(ArrayList<Vif_2012> lstDatosSanAlfonso1F) {
        this.lstDatosSanAlfonso1F = lstDatosSanAlfonso1F;
    }

    public ArrayList<Vif_2012> getLstDatosSanAlfonso2M() {
        return lstDatosSanAlfonso2M;
    }

    public void setLstDatosSanAlfonso2M(ArrayList<Vif_2012> lstDatosSanAlfonso2M) {
        this.lstDatosSanAlfonso2M = lstDatosSanAlfonso2M;
    }

    public ArrayList<Vif_2012> getLstDatosSanAlfonso2F() {
        return lstDatosSanAlfonso2F;
    }

    public void setLstDatosSanAlfonso2F(ArrayList<Vif_2012> lstDatosSanAlfonso2F) {
        this.lstDatosSanAlfonso2F = lstDatosSanAlfonso2F;
    }

    public ArrayList<Vif_2012> getLstDatosShopping1M() {
        return lstDatosShopping1M;
    }

    public void setLstDatosShopping1M(ArrayList<Vif_2012> lstDatosShopping1M) {
        this.lstDatosShopping1M = lstDatosShopping1M;
    }

    public ArrayList<Vif_2012> getLstDatosShopping1F() {
        return lstDatosShopping1F;
    }

    public void setLstDatosShopping1F(ArrayList<Vif_2012> lstDatosShopping1F) {
        this.lstDatosShopping1F = lstDatosShopping1F;
    }

    public ArrayList<Vif_2012> getLstDatosTerminalTerrestre1M() {
        return lstDatosTerminalTerrestre1M;
    }

    public void setLstDatosTerminalTerrestre1M(ArrayList<Vif_2012> lstDatosTerminalTerrestre1M) {
        this.lstDatosTerminalTerrestre1M = lstDatosTerminalTerrestre1M;
    }

    public ArrayList<Vif_2012> getLstDatosTerminalTerrestre1F() {
        return lstDatosTerminalTerrestre1F;
    }

    public void setLstDatosTerminalTerrestre1F(ArrayList<Vif_2012> lstDatosTerminalTerrestre1F) {
        this.lstDatosTerminalTerrestre1F = lstDatosTerminalTerrestre1F;
    }

    public ArrayList<Vif_2012> getLstDatosYaruquies1M() {
        return lstDatosYaruquies1M;
    }

    public void setLstDatosYaruquies1M(ArrayList<Vif_2012> lstDatosYaruquies1M) {
        this.lstDatosYaruquies1M = lstDatosYaruquies1M;
    }

    public ArrayList<Vif_2012> getLstDatosYaruquies1F() {
        return lstDatosYaruquies1F;
    }

    public void setLstDatosYaruquies1F(ArrayList<Vif_2012> lstDatosYaruquies1F) {
        this.lstDatosYaruquies1F = lstDatosYaruquies1F;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        lineModel_Victima_Circuito = graficaCircuitoSexoVictima();
        lineModel_Victima_Subcircuito = initCategoryModelSexoSubV();
    }

    private void reinit() {
        this.datoSel = new Vif_2012();
        this.lstDatos24MayoF = new ArrayList<Vif_2012>();
        this.lstDatos24MayoM = new ArrayList<Vif_2012>();

        this.cargarDatos();
        this.init();
    }

    public Vif_2012ControladorVictimas2() {
        this.reinit();
    }

    private CartesianChartModel graficaCircuitoSexoVictima() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos24MayoF = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("F", "24 DE MAYO");
            lstDatos24MayoM = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("M", "24 DE MAYO");
            lstDatosCamiloPonceM = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("M", "CAMILO PONCE");
            lstDatosCamiloPonceF = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("F", "CAMILO PONCE");
            lstDatosCaminoSolF = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("F", "CAMINO AL SOL");
            lstDatosCaminoSolM = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("M", "CAMINO AL SOL");
            lstDatosLaCondamineF = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("F", "LA CONDAMINE");
            lstDatosLaCondamineM = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("M", "LA CONDAMINE");
            lstDatosLaEstacionF = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("F", "LA ESTACION");
            lstDatosLaEstacionM = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("M", "LA ESTACION");
            lstDatosLaPazF = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("F", "LA PAZ");
            lstDatosLaPazM = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("M", "LA PAZ");
            lstDatosLaPrimaveraF = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("F", "LA PRIMAVERA");
            lstDatosLaPrimaveraM = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("M", "LA PRIMAVERA");
            lstDatosPolitecnicaF = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("F", "POLITECNICA");
            lstDatosPolitecnicaM = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("M", "POLITECNICA");
            lstDatosPucaraM = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("M", "PUCARA");
            lstDatosPucaraF = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("F", "PUCARA");
            lstDatosSanAlfonsoF = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("F", "SAN ALFONSO");
            lstDatosSanAlfonsoM = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("M", "SAN ALFONSO");
            lstDatosShoppingF = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("F", "SHOPPING");
            lstDatosShoppingM = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("M", "SHOPPING");
            lstDatosTerminalTerrestreF = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("F", "TERMINAL TERRESTRE");
            lstDatosTerminalTerrestreM = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("M", "TERMINAL TERRESTRE");
            lstDatosYaruquiesF = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("F", "YARUQUIES");
            lstDatosYaruquiesM = FVif_2012.ObtenerDatosDadoCircuitoSexoVictima("M", "YARUQUIES");

            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            Masculino.set("24 DE MAYO", lstDatos24MayoM.size());
            Masculino.set("CAMILO PONCE", lstDatosCamiloPonceM.size());
            Masculino.set("CAMINO AL SOL", lstDatosCaminoSolM.size());
            Masculino.set("LA CONDAMINE", lstDatosLaCondamineM.size());
            Masculino.set("LA ESTACION", lstDatosLaEstacionM.size());
            Masculino.set("LA PAZ", lstDatosLaPazM.size());
            Masculino.set("LA PRIMAVERA", lstDatosLaPrimaveraM.size());
            Masculino.set("POLITECNICA", lstDatosPolitecnicaM.size());
            Masculino.set("PUCARA", lstDatosPucaraM.size());
            Masculino.set("SAN ALFONSO", lstDatosSanAlfonsoM.size());
            Masculino.set("SHOPPING", lstDatosShoppingM.size());
            Masculino.set("TERMINAL TERRESTRE", lstDatosTerminalTerrestreM.size());
            Masculino.set("YARUQUIES", lstDatosYaruquiesM.size());

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            Femenino.set("24 DE MAYO", lstDatos24MayoF.size());
            Femenino.set("CAMILO PONCE", lstDatosCamiloPonceF.size());
            Femenino.set("CAMINO AL SOL", lstDatosCaminoSolF.size());
            Femenino.set("LA CONDAMINE", lstDatosLaCondamineF.size());
            Femenino.set("LA ESTACION", lstDatosLaEstacionF.size());
            Femenino.set("LA PAZ", lstDatosLaPazF.size());
            Femenino.set("LA PRIMAVERA", lstDatosLaPrimaveraF.size());
            Femenino.set("POLITECNICA", lstDatosPolitecnicaF.size());
            Femenino.set("PUCARA", lstDatosPucaraF.size());
            Femenino.set("SAN ALFONSO", lstDatosSanAlfonsoF.size());
            Femenino.set("SHOPPING", lstDatosShoppingF.size());
            Femenino.set("TERMINAL TERRESTRE", lstDatosTerminalTerrestreF.size());
            Femenino.set("YARUQUIES", lstDatosYaruquiesF.size());

            model.addSeries(Masculino);
            model.addSeries(Femenino);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initCategoryModelSexoSubV() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos24Mayo1F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "24 DE MAYO 1");
            lstDatos24Mayo1M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "24 DE MAYO 1");
            lstDatos24Mayo2F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "24 DE MAYO 2");
            lstDatos24Mayo2M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "24 DE MAYO 2");
            lstDatosCamiloPonce1M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "CAMILO PONCE 1");
            lstDatosCamiloPonce1F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "CAMILO PONCE 1");
            lstDatosCamiloPonce2M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "CAMILO PONCE 2");
            lstDatosCamiloPonce2F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "CAMILO PONCE 2");
            lstDatosCaminoSol1F = FVif_2012.ObtenerDatosDadoCodigoSubCircuitoSexoVictima("F", "06D01C05S01");
            lstDatosCaminoSol1M = FVif_2012.ObtenerDatosDadoCodigoSubCircuitoSexoVictima("M", "06D01C05S01");
            lstDatosLaCondamine1F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "LA CONDAMINE 1");
            lstDatosLaCondamine1M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "LA CONDAMINE 1");
            lstDatosLaCondamine2F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "LA CONDAMINE 2");
            lstDatosLaCondamine2M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "LA CONDAMINE 2");
            lstDatosLaEstacion1F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "LA ESTACION 1");
            lstDatosLaEstacion1M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "LA ESTACION 1");
            lstDatosLaEstacion2F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "LA ESTACION 2");
            lstDatosLaEstacion2M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "LA ESTACION 2");
            lstDatosLaPaz1F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "LA PAZ 1");
            lstDatosLaPaz1M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "LA PAZ 1");
            lstDatosLaPaz2F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "LA PAZ 2");
            lstDatosLaPaz2M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "LA PAZ 2");
            lstDatosLaPrimavera1F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "LA PRIMAVERA 1");
            lstDatosLaPrimavera1M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "LA PRIMAVERA 1");
            lstDatosPolitecnica1F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "POLITECNICA 1");
            lstDatosPolitecnica1M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "POLITECNICA 1");
            lstDatosPolitecnica2F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "POLITECNICA 2");
            lstDatosPolitecnica2M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "POLITECNICA 2");
            lstDatosPolitecnica3F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "POLITECNICA 3");
            lstDatosPolitecnica3M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "POLITECNICA 3");
            lstDatosPucara1M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "PUCARA 1");
            lstDatosPucara1F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "PUCARA 1");
            lstDatosPucara2M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "PUCARA 2");
            lstDatosPucara2F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "PUCARA 2");
            lstDatosSanAlfonso1F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "SAN ALFONSO 1");
            lstDatosSanAlfonso1M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "SAN ALFONSO 1");
            lstDatosSanAlfonso2F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "SAN ALFONSO 2");
            lstDatosSanAlfonso2M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "SAN ALFONSO 2");
            lstDatosShopping1F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "SHOPPING 1");
            lstDatosShopping1M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "SHOPPING 1");
            lstDatosTerminalTerrestre1F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "TERMINAL TERRESTRE 1");
            lstDatosTerminalTerrestre1M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "TERMINAL TERRESTRE 1");
            lstDatosYaruquies1F = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("F", "YARUQUIES 1");
            lstDatosYaruquies1M = FVif_2012.ObtenerDatosDadoSubCircuitoSexoVictima("M", "YARUQUIES 1");

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
