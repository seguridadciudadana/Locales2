/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.clases.Vif_2011;
import geoportal.logica.clases.Vif_2012;
import geoportal.logica.funciones.FVif_2010;
import geoportal.logica.funciones.FVif_2011;
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
public class Vif_ContrastesCircuitos {

    /**
     * Creates a new instance of Vif_ContrastesCircuitos
     */
    private CartesianChartModel lineModel1;
    private ArrayList<Vif_2010> lstDatos2010Control1;
    private ArrayList<Vif_2011> lstDatos2011Control1;
    private ArrayList<Vif_2012> lstDatos2012Control1;
    private Vif_2010 dato2010Sel;
    private Vif_2011 dato2011Sel;
    private Vif_2012 dato2012Sel;
//listas 2010
    private ArrayList<Vif_2010> lstDatos24Mayo2010;
    private ArrayList<Vif_2010> lstDatosCamiloPonce2010;
    private ArrayList<Vif_2010> lstDatosCaminosAlSol2010;
    private ArrayList<Vif_2010> lstDatosLaCondamine2010;
    private ArrayList<Vif_2010> lstDatosLaEstacion2010;
    private ArrayList<Vif_2010> lstDatosLaPaz2010;
    private ArrayList<Vif_2010> lstDatosLaPrimavera2010;
    private ArrayList<Vif_2010> lstDatosPolitecnica2010;
    private ArrayList<Vif_2010> lstDatosPucara2010;
    private ArrayList<Vif_2010> lstDatosSanAlfonso2010;
    private ArrayList<Vif_2010> lstDatosShopping2010;
    private ArrayList<Vif_2010> lstDatosTerminalTerretre2010;
    private ArrayList<Vif_2010> lstDatosYaruquies2010;
//listas 2011
    private ArrayList<Vif_2011> lstDatos24Mayo2011;
    private ArrayList<Vif_2011> lstDatosCamiloPonce2011;
    private ArrayList<Vif_2011> lstDatosCaminosAlSol2011;
    private ArrayList<Vif_2011> lstDatosLaCondamine2011;
    private ArrayList<Vif_2011> lstDatosLaEstacion2011;
    private ArrayList<Vif_2011> lstDatosLaPaz2011;
    private ArrayList<Vif_2011> lstDatosLaPrimavera2011;
    private ArrayList<Vif_2011> lstDatosPolitecnica2011;
    private ArrayList<Vif_2011> lstDatosPucara2011;
    private ArrayList<Vif_2011> lstDatosSanAlfonso2011;
    private ArrayList<Vif_2011> lstDatosShopping2011;
    private ArrayList<Vif_2011> lstDatosTerminalTerretre2011;
    private ArrayList<Vif_2011> lstDatosYaruquies2011;
    //listas 2012
    private ArrayList<Vif_2012> lstDatos24Mayo2012;
    private ArrayList<Vif_2012> lstDatosCamiloPonce2012;
    private ArrayList<Vif_2012> lstDatosCaminosAlSol2012;
    private ArrayList<Vif_2012> lstDatosLaCondamine2012;
    private ArrayList<Vif_2012> lstDatosLaEstacion2012;
    private ArrayList<Vif_2012> lstDatosLaPaz2012;
    private ArrayList<Vif_2012> lstDatosLaPrimavera2012;
    private ArrayList<Vif_2012> lstDatosPolitecnica2012;
    private ArrayList<Vif_2012> lstDatosPucara2012;
    private ArrayList<Vif_2012> lstDatosSanAlfonso2012;
    private ArrayList<Vif_2012> lstDatosShopping2012;
    private ArrayList<Vif_2012> lstDatosTerminalTerretre2012;
    private ArrayList<Vif_2012> lstDatosYaruquies2012;

    public CartesianChartModel getLineModel1() {
        return lineModel1;
    }

    public void setLineModel1(CartesianChartModel lineModel1) {
        this.lineModel1 = lineModel1;
    }

    public ArrayList<Vif_2010> getLstDatos2010Control1() {
        return lstDatos2010Control1;
    }

    public void setLstDatos2010Control1(ArrayList<Vif_2010> lstDatos2010Control1) {
        this.lstDatos2010Control1 = lstDatos2010Control1;
    }

    public ArrayList<Vif_2011> getLstDatos2011Control1() {
        return lstDatos2011Control1;
    }

    public void setLstDatos2011Control1(ArrayList<Vif_2011> lstDatos2011Control1) {
        this.lstDatos2011Control1 = lstDatos2011Control1;
    }

    public ArrayList<Vif_2012> getLstDatos2012Control1() {
        return lstDatos2012Control1;
    }

    public void setLstDatos2012Control1(ArrayList<Vif_2012> lstDatos2012Control1) {
        this.lstDatos2012Control1 = lstDatos2012Control1;
    }

    public Vif_2010 getDato2010Sel() {
        return dato2010Sel;
    }

    public void setDato2010Sel(Vif_2010 dato2010Sel) {
        this.dato2010Sel = dato2010Sel;
    }

    public Vif_2011 getDato2011Sel() {
        return dato2011Sel;
    }

    public void setDato2011Sel(Vif_2011 dato2011Sel) {
        this.dato2011Sel = dato2011Sel;
    }

    public Vif_2012 getDato2012Sel() {
        return dato2012Sel;
    }

    public void setDato2012Sel(Vif_2012 dato2012Sel) {
        this.dato2012Sel = dato2012Sel;
    }

    public ArrayList<Vif_2010> getLstDatos24Mayo2010() {
        return lstDatos24Mayo2010;
    }

    public void setLstDatos24Mayo2010(ArrayList<Vif_2010> lstDatos24Mayo2010) {
        this.lstDatos24Mayo2010 = lstDatos24Mayo2010;
    }

    public ArrayList<Vif_2010> getLstDatosCamiloPonce2010() {
        return lstDatosCamiloPonce2010;
    }

    public void setLstDatosCamiloPonce2010(ArrayList<Vif_2010> lstDatosCamiloPonce2010) {
        this.lstDatosCamiloPonce2010 = lstDatosCamiloPonce2010;
    }

    public ArrayList<Vif_2010> getLstDatosCaminosAlSol2010() {
        return lstDatosCaminosAlSol2010;
    }

    public void setLstDatosCaminosAlSol2010(ArrayList<Vif_2010> lstDatosCaminosAlSol2010) {
        this.lstDatosCaminosAlSol2010 = lstDatosCaminosAlSol2010;
    }

    public ArrayList<Vif_2010> getLstDatosLaCondamine2010() {
        return lstDatosLaCondamine2010;
    }

    public void setLstDatosLaCondamine2010(ArrayList<Vif_2010> lstDatosLaCondamine2010) {
        this.lstDatosLaCondamine2010 = lstDatosLaCondamine2010;
    }

    public ArrayList<Vif_2010> getLstDatosLaEstacion2010() {
        return lstDatosLaEstacion2010;
    }

    public void setLstDatosLaEstacion2010(ArrayList<Vif_2010> lstDatosLaEstacion2010) {
        this.lstDatosLaEstacion2010 = lstDatosLaEstacion2010;
    }

    public ArrayList<Vif_2010> getLstDatosLaPaz2010() {
        return lstDatosLaPaz2010;
    }

    public void setLstDatosLaPaz2010(ArrayList<Vif_2010> lstDatosLaPaz2010) {
        this.lstDatosLaPaz2010 = lstDatosLaPaz2010;
    }

    public ArrayList<Vif_2010> getLstDatosLaPrimavera2010() {
        return lstDatosLaPrimavera2010;
    }

    public void setLstDatosLaPrimavera2010(ArrayList<Vif_2010> lstDatosLaPrimavera2010) {
        this.lstDatosLaPrimavera2010 = lstDatosLaPrimavera2010;
    }

    public ArrayList<Vif_2010> getLstDatosPolitecnica2010() {
        return lstDatosPolitecnica2010;
    }

    public void setLstDatosPolitecnica2010(ArrayList<Vif_2010> lstDatosPolitecnica2010) {
        this.lstDatosPolitecnica2010 = lstDatosPolitecnica2010;
    }

    public ArrayList<Vif_2010> getLstDatosPucara2010() {
        return lstDatosPucara2010;
    }

    public void setLstDatosPucara2010(ArrayList<Vif_2010> lstDatosPucara2010) {
        this.lstDatosPucara2010 = lstDatosPucara2010;
    }

    public ArrayList<Vif_2010> getLstDatosSanAlfonso2010() {
        return lstDatosSanAlfonso2010;
    }

    public void setLstDatosSanAlfonso2010(ArrayList<Vif_2010> lstDatosSanAlfonso2010) {
        this.lstDatosSanAlfonso2010 = lstDatosSanAlfonso2010;
    }

    public ArrayList<Vif_2010> getLstDatosShopping2010() {
        return lstDatosShopping2010;
    }

    public void setLstDatosShopping2010(ArrayList<Vif_2010> lstDatosShopping2010) {
        this.lstDatosShopping2010 = lstDatosShopping2010;
    }

    public ArrayList<Vif_2010> getLstDatosTerminalTerretre2010() {
        return lstDatosTerminalTerretre2010;
    }

    public void setLstDatosTerminalTerretre2010(ArrayList<Vif_2010> lstDatosTerminalTerretre2010) {
        this.lstDatosTerminalTerretre2010 = lstDatosTerminalTerretre2010;
    }

    public ArrayList<Vif_2010> getLstDatosYaruquies2010() {
        return lstDatosYaruquies2010;
    }

    public void setLstDatosYaruquies2010(ArrayList<Vif_2010> lstDatosYaruquies2010) {
        this.lstDatosYaruquies2010 = lstDatosYaruquies2010;
    }

    public ArrayList<Vif_2011> getLstDatos24Mayo2011() {
        return lstDatos24Mayo2011;
    }

    public void setLstDatos24Mayo2011(ArrayList<Vif_2011> lstDatos24Mayo2011) {
        this.lstDatos24Mayo2011 = lstDatos24Mayo2011;
    }

    public ArrayList<Vif_2011> getLstDatosCamiloPonce2011() {
        return lstDatosCamiloPonce2011;
    }

    public void setLstDatosCamiloPonce2011(ArrayList<Vif_2011> lstDatosCamiloPonce2011) {
        this.lstDatosCamiloPonce2011 = lstDatosCamiloPonce2011;
    }

    public ArrayList<Vif_2011> getLstDatosCaminosAlSol2011() {
        return lstDatosCaminosAlSol2011;
    }

    public void setLstDatosCaminosAlSol2011(ArrayList<Vif_2011> lstDatosCaminosAlSol2011) {
        this.lstDatosCaminosAlSol2011 = lstDatosCaminosAlSol2011;
    }

    public ArrayList<Vif_2011> getLstDatosLaCondamine2011() {
        return lstDatosLaCondamine2011;
    }

    public void setLstDatosLaCondamine2011(ArrayList<Vif_2011> lstDatosLaCondamine2011) {
        this.lstDatosLaCondamine2011 = lstDatosLaCondamine2011;
    }

    public ArrayList<Vif_2011> getLstDatosLaEstacion2011() {
        return lstDatosLaEstacion2011;
    }

    public void setLstDatosLaEstacion2011(ArrayList<Vif_2011> lstDatosLaEstacion2011) {
        this.lstDatosLaEstacion2011 = lstDatosLaEstacion2011;
    }

    public ArrayList<Vif_2011> getLstDatosLaPaz2011() {
        return lstDatosLaPaz2011;
    }

    public void setLstDatosLaPaz2011(ArrayList<Vif_2011> lstDatosLaPaz2011) {
        this.lstDatosLaPaz2011 = lstDatosLaPaz2011;
    }

    public ArrayList<Vif_2011> getLstDatosLaPrimavera2011() {
        return lstDatosLaPrimavera2011;
    }

    public void setLstDatosLaPrimavera2011(ArrayList<Vif_2011> lstDatosLaPrimavera2011) {
        this.lstDatosLaPrimavera2011 = lstDatosLaPrimavera2011;
    }

    public ArrayList<Vif_2011> getLstDatosPolitecnica2011() {
        return lstDatosPolitecnica2011;
    }

    public void setLstDatosPolitecnica2011(ArrayList<Vif_2011> lstDatosPolitecnica2011) {
        this.lstDatosPolitecnica2011 = lstDatosPolitecnica2011;
    }

    public ArrayList<Vif_2011> getLstDatosPucara2011() {
        return lstDatosPucara2011;
    }

    public void setLstDatosPucara2011(ArrayList<Vif_2011> lstDatosPucara2011) {
        this.lstDatosPucara2011 = lstDatosPucara2011;
    }

    public ArrayList<Vif_2011> getLstDatosSanAlfonso2011() {
        return lstDatosSanAlfonso2011;
    }

    public void setLstDatosSanAlfonso2011(ArrayList<Vif_2011> lstDatosSanAlfonso2011) {
        this.lstDatosSanAlfonso2011 = lstDatosSanAlfonso2011;
    }

    public ArrayList<Vif_2011> getLstDatosShopping2011() {
        return lstDatosShopping2011;
    }

    public void setLstDatosShopping2011(ArrayList<Vif_2011> lstDatosShopping2011) {
        this.lstDatosShopping2011 = lstDatosShopping2011;
    }

    public ArrayList<Vif_2011> getLstDatosTerminalTerretre2011() {
        return lstDatosTerminalTerretre2011;
    }

    public void setLstDatosTerminalTerretre2011(ArrayList<Vif_2011> lstDatosTerminalTerretre2011) {
        this.lstDatosTerminalTerretre2011 = lstDatosTerminalTerretre2011;
    }

    public ArrayList<Vif_2011> getLstDatosYaruquies2011() {
        return lstDatosYaruquies2011;
    }

    public void setLstDatosYaruquies2011(ArrayList<Vif_2011> lstDatosYaruquies2011) {
        this.lstDatosYaruquies2011 = lstDatosYaruquies2011;
    }

    public ArrayList<Vif_2012> getLstDatos24Mayo2012() {
        return lstDatos24Mayo2012;
    }

    public void setLstDatos24Mayo2012(ArrayList<Vif_2012> lstDatos24Mayo2012) {
        this.lstDatos24Mayo2012 = lstDatos24Mayo2012;
    }

    public ArrayList<Vif_2012> getLstDatosCamiloPonce2012() {
        return lstDatosCamiloPonce2012;
    }

    public void setLstDatosCamiloPonce2012(ArrayList<Vif_2012> lstDatosCamiloPonce2012) {
        this.lstDatosCamiloPonce2012 = lstDatosCamiloPonce2012;
    }

    public ArrayList<Vif_2012> getLstDatosCaminosAlSol2012() {
        return lstDatosCaminosAlSol2012;
    }

    public void setLstDatosCaminosAlSol2012(ArrayList<Vif_2012> lstDatosCaminosAlSol2012) {
        this.lstDatosCaminosAlSol2012 = lstDatosCaminosAlSol2012;
    }

    public ArrayList<Vif_2012> getLstDatosLaCondamine2012() {
        return lstDatosLaCondamine2012;
    }

    public void setLstDatosLaCondamine2012(ArrayList<Vif_2012> lstDatosLaCondamine2012) {
        this.lstDatosLaCondamine2012 = lstDatosLaCondamine2012;
    }

    public ArrayList<Vif_2012> getLstDatosLaEstacion2012() {
        return lstDatosLaEstacion2012;
    }

    public void setLstDatosLaEstacion2012(ArrayList<Vif_2012> lstDatosLaEstacion2012) {
        this.lstDatosLaEstacion2012 = lstDatosLaEstacion2012;
    }

    public ArrayList<Vif_2012> getLstDatosLaPaz2012() {
        return lstDatosLaPaz2012;
    }

    public void setLstDatosLaPaz2012(ArrayList<Vif_2012> lstDatosLaPaz2012) {
        this.lstDatosLaPaz2012 = lstDatosLaPaz2012;
    }

    public ArrayList<Vif_2012> getLstDatosLaPrimavera2012() {
        return lstDatosLaPrimavera2012;
    }

    public void setLstDatosLaPrimavera2012(ArrayList<Vif_2012> lstDatosLaPrimavera2012) {
        this.lstDatosLaPrimavera2012 = lstDatosLaPrimavera2012;
    }

    public ArrayList<Vif_2012> getLstDatosPolitecnica2012() {
        return lstDatosPolitecnica2012;
    }

    public void setLstDatosPolitecnica2012(ArrayList<Vif_2012> lstDatosPolitecnica2012) {
        this.lstDatosPolitecnica2012 = lstDatosPolitecnica2012;
    }

    public ArrayList<Vif_2012> getLstDatosPucara2012() {
        return lstDatosPucara2012;
    }

    public void setLstDatosPucara2012(ArrayList<Vif_2012> lstDatosPucara2012) {
        this.lstDatosPucara2012 = lstDatosPucara2012;
    }

    public ArrayList<Vif_2012> getLstDatosSanAlfonso2012() {
        return lstDatosSanAlfonso2012;
    }

    public void setLstDatosSanAlfonso2012(ArrayList<Vif_2012> lstDatosSanAlfonso2012) {
        this.lstDatosSanAlfonso2012 = lstDatosSanAlfonso2012;
    }

    public ArrayList<Vif_2012> getLstDatosShopping2012() {
        return lstDatosShopping2012;
    }

    public void setLstDatosShopping2012(ArrayList<Vif_2012> lstDatosShopping2012) {
        this.lstDatosShopping2012 = lstDatosShopping2012;
    }

    public ArrayList<Vif_2012> getLstDatosTerminalTerretre2012() {
        return lstDatosTerminalTerretre2012;
    }

    public void setLstDatosTerminalTerretre2012(ArrayList<Vif_2012> lstDatosTerminalTerretre2012) {
        this.lstDatosTerminalTerretre2012 = lstDatosTerminalTerretre2012;
    }

    public ArrayList<Vif_2012> getLstDatosYaruquies2012() {
        return lstDatosYaruquies2012;
    }

    public void setLstDatosYaruquies2012(ArrayList<Vif_2012> lstDatosYaruquies2012) {
        this.lstDatosYaruquies2012 = lstDatosYaruquies2012;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        lineModel1 = contrasteCircuito();

    }

    private void reinit() {
        this.dato2010Sel = new Vif_2010();
        this.dato2011Sel = new Vif_2011();
        this.dato2012Sel = new Vif_2012();
        this.lstDatos2010Control1 = new ArrayList<Vif_2010>();
        this.lstDatos2011Control1 = new ArrayList<Vif_2011>();
        this.lstDatos2012Control1 = new ArrayList<Vif_2012>();
        this.lstDatos24Mayo2010 = new ArrayList<Vif_2010>();
        this.lstDatosCamiloPonce2010 = new ArrayList<Vif_2010>();
        this.lstDatosCaminosAlSol2010 = new ArrayList<Vif_2010>();
        this.lstDatosLaCondamine2010 = new ArrayList<Vif_2010>();
        this.lstDatosLaEstacion2010 = new ArrayList<Vif_2010>();
        this.lstDatosLaPaz2010 = new ArrayList<Vif_2010>();
        this.lstDatosLaPrimavera2010 = new ArrayList<Vif_2010>();
        this.lstDatosPolitecnica2010 = new ArrayList<Vif_2010>();
        this.lstDatosPucara2010 = new ArrayList<Vif_2010>();
        this.lstDatosSanAlfonso2010 = new ArrayList<Vif_2010>();
        this.lstDatosShopping2010 = new ArrayList<Vif_2010>();
        this.lstDatosTerminalTerretre2010 = new ArrayList<Vif_2010>();
        this.lstDatosYaruquies2010 = new ArrayList<Vif_2010>();
        this.lstDatos24Mayo2011 = new ArrayList<Vif_2011>();
        this.lstDatosCamiloPonce2011 = new ArrayList<Vif_2011>();
        this.lstDatosCaminosAlSol2011 = new ArrayList<Vif_2011>();
        this.lstDatosLaCondamine2011 = new ArrayList<Vif_2011>();
        this.lstDatosLaEstacion2011 = new ArrayList<Vif_2011>();
        this.lstDatosLaPaz2011 = new ArrayList<Vif_2011>();
        this.lstDatosLaPrimavera2011 = new ArrayList<Vif_2011>();
        this.lstDatosPolitecnica2011 = new ArrayList<Vif_2011>();
        this.lstDatosPucara2011 = new ArrayList<Vif_2011>();
        this.lstDatosSanAlfonso2011 = new ArrayList<Vif_2011>();
        this.lstDatosShopping2011 = new ArrayList<Vif_2011>();
        this.lstDatosTerminalTerretre2011 = new ArrayList<Vif_2011>();
        this.lstDatosYaruquies2011 = new ArrayList<Vif_2011>();
        this.lstDatos24Mayo2012 = new ArrayList<Vif_2012>();
        this.lstDatosCamiloPonce2012 = new ArrayList<Vif_2012>();
        this.lstDatosCaminosAlSol2012 = new ArrayList<Vif_2012>();
        this.lstDatosLaCondamine2012 = new ArrayList<Vif_2012>();
        this.lstDatosLaEstacion2012 = new ArrayList<Vif_2012>();
        this.lstDatosLaPaz2012 = new ArrayList<Vif_2012>();
        this.lstDatosLaPrimavera2012 = new ArrayList<Vif_2012>();
        this.lstDatosPolitecnica2012 = new ArrayList<Vif_2012>();
        this.lstDatosPucara2012 = new ArrayList<Vif_2012>();
        this.lstDatosSanAlfonso2012 = new ArrayList<Vif_2012>();
        this.lstDatosShopping2012 = new ArrayList<Vif_2012>();
        this.lstDatosTerminalTerretre2012 = new ArrayList<Vif_2012>();
        this.lstDatosYaruquies2012 = new ArrayList<Vif_2012>();
        this.cargarDatos2010();
        this.cargarDatos2011();
        this.cargarDatos2012();
        this.init();
    }

    public Vif_ContrastesCircuitos() {
        this.reinit();
    }

    private CartesianChartModel contrasteCircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstDatos24Mayo2010 = FVif_2010.ObtenerDatosDadoCircuito("24 DE MAYO");
            lstDatosCamiloPonce2010 = FVif_2010.ObtenerDatosDadoCircuito("CAMILO PONCE");
            lstDatosCaminosAlSol2010 = FVif_2010.ObtenerDatosDadoCircuito("CAMINOS AL SOL");
            lstDatosLaCondamine2010 = FVif_2010.ObtenerDatosDadoCircuito("LA CONDAMINE");
            lstDatosLaEstacion2010 = FVif_2010.ObtenerDatosDadoCircuito("LA ESTACION");
            lstDatosLaPaz2010 = FVif_2010.ObtenerDatosDadoCircuito("LA PAZ");
            lstDatosLaPrimavera2010 = FVif_2010.ObtenerDatosDadoCircuito("LA PRIMAVERA");
            lstDatosPolitecnica2010 = FVif_2010.ObtenerDatosDadoCircuito("POLITECNICA");
            lstDatosPucara2010 = FVif_2010.ObtenerDatosDadoCircuito("PUCARA");
            lstDatosSanAlfonso2010 = FVif_2010.ObtenerDatosDadoCircuito("SAN ALFONSO");
            lstDatosShopping2010 = FVif_2010.ObtenerDatosDadoCircuito("SHOPPING");
            lstDatosTerminalTerretre2010 = FVif_2010.ObtenerDatosDadoCircuito("TERMINAL TERRESTRE");
            lstDatosYaruquies2010 = FVif_2010.ObtenerDatosDadoCircuito("YARUQUIES");

            lstDatos24Mayo2011 = FVif_2011.ObtenerDatosDadoCircuito("24 DE MAYO");
            lstDatosCamiloPonce2011 = FVif_2011.ObtenerDatosDadoCircuito("CAMILO PONCE");
            lstDatosCaminosAlSol2011 = FVif_2011.ObtenerDatosDadoCircuito("CAMINO AL SOL");
            lstDatosLaCondamine2011 = FVif_2011.ObtenerDatosDadoCircuito("LA CONDAMINE");
            lstDatosLaEstacion2011 = FVif_2011.ObtenerDatosDadoCircuito("LA ESTACION");
            lstDatosLaPaz2011 = FVif_2011.ObtenerDatosDadoCircuito("LA PAZ");
            lstDatosLaPrimavera2011 = FVif_2011.ObtenerDatosDadoCircuito("LA PRIMAVERA");
            lstDatosPolitecnica2011 = FVif_2011.ObtenerDatosDadoCircuito("POLITECNICA");
            lstDatosPucara2011 = FVif_2011.ObtenerDatosDadoCircuito("PUCARA");
            lstDatosSanAlfonso2011 = FVif_2011.ObtenerDatosDadoCircuito("SAN ALFONSO");
            lstDatosShopping2011 = FVif_2011.ObtenerDatosDadoCircuito("SHOPPING");
            lstDatosTerminalTerretre2011 = FVif_2011.ObtenerDatosDadoCircuito("TERMINAL TERRESTRE");
            lstDatosYaruquies2011 = FVif_2011.ObtenerDatosDadoCircuito("YARUQUIES");

            lstDatos24Mayo2012 = FVif_2012.ObtenerDatosDadoCircuito("24 DE MAYO");
            lstDatosCamiloPonce2012 = FVif_2012.ObtenerDatosDadoCircuito("CAMILO PONCE");
            lstDatosCaminosAlSol2012 = FVif_2012.ObtenerDatosDadoCircuito("CAMINO AL SOL");
            lstDatosLaCondamine2012 = FVif_2012.ObtenerDatosDadoCircuito("LA CONDAMINE");
            lstDatosLaEstacion2012 = FVif_2012.ObtenerDatosDadoCircuito("LA ESTACION");
            lstDatosLaPaz2012 = FVif_2012.ObtenerDatosDadoCircuito("LA PAZ");
            lstDatosLaPrimavera2012 = FVif_2012.ObtenerDatosDadoCircuito("LA PRIMAVERA");
            lstDatosPolitecnica2012 = FVif_2012.ObtenerDatosDadoCircuito("POLITECNICA");
            lstDatosPucara2012 = FVif_2012.ObtenerDatosDadoCircuito("PUCARA");
            lstDatosSanAlfonso2012 = FVif_2012.ObtenerDatosDadoCircuito("SAN ALFONSO");
            lstDatosShopping2012 = FVif_2012.ObtenerDatosDadoCircuito("SHOPPING");
            lstDatosTerminalTerretre2012 = FVif_2012.ObtenerDatosDadoCircuito("TERMINAL TERRESTRE");
            lstDatosYaruquies2012 = FVif_2012.ObtenerDatosDadoCircuito("YARUQUIES");

            ChartSeries Vif_2010 = new ChartSeries();
            Vif_2010.setLabel("Víctimas 2010 por circuitos");
            Vif_2010.set("24 DE MAYO", lstDatos24Mayo2010.size());
            Vif_2010.set("CAMILO PONCE", lstDatosCamiloPonce2010.size());
            Vif_2010.set("CAMINO AL SOL", lstDatosCaminosAlSol2010.size());
            Vif_2010.set("LA CONDAMINE", lstDatosLaCondamine2010.size());
            Vif_2010.set("LA ESTACION", lstDatosLaEstacion2010.size());
            Vif_2010.set("LA PAZ", lstDatosLaPaz2010.size());
            Vif_2010.set("LA PRIMAVERA", lstDatosLaPrimavera2010.size());
            Vif_2010.set("POLITECNICA", lstDatosPolitecnica2010.size());
            Vif_2010.set("PUCARA", lstDatosPucara2010.size());
            Vif_2010.set("SAN ALFONSO", lstDatosSanAlfonso2010.size());
            Vif_2010.set("SHOPPING", lstDatosShopping2010.size());
            Vif_2010.set("TERMINAL TERRESTRE", lstDatosTerminalTerretre2010.size());
            Vif_2010.set("YARUQUIES", lstDatosYaruquies2010.size());

            ChartSeries Vif_2011 = new ChartSeries();
            Vif_2011.setLabel("Víctimas 2011 por circuitos");
            Vif_2011.set("24 DE MAYO", lstDatos24Mayo2011.size());
            Vif_2011.set("CAMILO PONCE", lstDatosCamiloPonce2011.size());
            Vif_2011.set("CAMINO AL SOL", lstDatosCaminosAlSol2011.size());
            Vif_2011.set("LA CONDAMINE", lstDatosLaCondamine2011.size());
            Vif_2011.set("LA ESTACION", lstDatosLaEstacion2011.size());
            Vif_2011.set("LA PAZ", lstDatosLaPaz2011.size());
            Vif_2011.set("LA PRIMAVERA", lstDatosLaPrimavera2011.size());
            Vif_2011.set("POLITECNICA", lstDatosPolitecnica2011.size());
            Vif_2011.set("PUCARA", lstDatosPucara2011.size());
            Vif_2011.set("SAN ALFONSO", lstDatosSanAlfonso2011.size());
            Vif_2011.set("SHOPPING", lstDatosShopping2011.size());
            Vif_2011.set("TERMINAL TERRESTRE", lstDatosTerminalTerretre2011.size());
            Vif_2011.set("YARUQUIES", lstDatosYaruquies2011.size());

            ChartSeries Vif_2012 = new ChartSeries();
            Vif_2012.setLabel("Víctimas 2012 por circuitos");
            Vif_2012.set("24 DE MAYO", lstDatos24Mayo2012.size());
            Vif_2012.set("CAMILO PONCE", lstDatosCamiloPonce2012.size());
            Vif_2012.set("CAMINO AL SOL", lstDatosCaminosAlSol2012.size());
            Vif_2012.set("LA CONDAMINE", lstDatosLaCondamine2012.size());
            Vif_2012.set("LA ESTACION", lstDatosLaEstacion2012.size());
            Vif_2012.set("LA PAZ", lstDatosLaPaz2012.size());
            Vif_2012.set("LA PRIMAVERA", lstDatosLaPrimavera2012.size());
            Vif_2012.set("POLITECNICA", lstDatosPolitecnica2012.size());
            Vif_2012.set("PUCARA", lstDatosPucara2012.size());
            Vif_2012.set("SAN ALFONSO", lstDatosSanAlfonso2012.size());
            Vif_2012.set("SHOPPING", lstDatosShopping2012.size());
            Vif_2012.set("TERMINAL TERRESTRE", lstDatosTerminalTerretre2012.size());
            Vif_2012.set("YARUQUIES", lstDatosYaruquies2012.size());

            model.addSeries(Vif_2010);
            model.addSeries(Vif_2011);
            model.addSeries(Vif_2012);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    public void cargarDatos2010() {
        try {

            this.lstDatos2010Control1 = FVif_2010.ObtenerDatos();
            this.dato2010Sel = lstDatos2010Control1.get(0);
            System.out.println(lstDatos2010Control1.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void cargarDatos2011() {
        try {

            this.lstDatos2011Control1 = FVif_2011.ObtenerDatos();
            this.dato2011Sel = lstDatos2011Control1.get(0);
            System.out.println(lstDatos2011Control1.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

    public void cargarDatos2012() {
        try {

            this.lstDatos2012Control1 = FVif_2012.ObtenerDatos();
            this.dato2012Sel = lstDatos2012Control1.get(0);
            System.out.println(lstDatos2012Control1.get(0).getPid());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }
}
