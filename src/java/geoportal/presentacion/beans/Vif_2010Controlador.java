/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.funciones.FVif_2010;
import java.io.Serializable;
//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.context.DefaultRequestContext;
//import org.primefaces.model.chart.Axis;
//import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CartesianChartModel;
//import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
//import org.primefaces.model.chart.LineChartModel;
//import org.primefaces.model.chart.PieChartModel;
import recursos.Util;
//import vif.logica.clases.subcircuito;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped

public class Vif_2010Controlador implements Serializable {

    /**
     * Creates a new instance of Vif_2010Controlador
     */
    private CartesianChartModel lineModel1;
    private CartesianChartModel lineModel2;
    private PieChartModel pieModel;
    private ArrayList<Vif_2010> lstDatosControl1;
    private Vif_2010 datoSel;
    private ArrayList<Vif_2010> lstDatosC;
    private ArrayList<Vif_2010> lstDatosDadoC;
    private ArrayList<Vif_2010> lstDatos7;
    private ArrayList<Vif_2010> lstDatos8;
    //listas de los circuitos
    private ArrayList<Vif_2010> lstDatos24Mayo;
    private ArrayList<Vif_2010> lstDatosCamiloPonce;
    private ArrayList<Vif_2010> lstDatosCaminosAlSol;
    private ArrayList<Vif_2010> lstDatosLaCondamine;
    private ArrayList<Vif_2010> lstDatosLaEstacion;
    private ArrayList<Vif_2010> lstDatosLaPaz;
    private ArrayList<Vif_2010> lstDatosLaPrimavera;
    private ArrayList<Vif_2010> lstDatosPolitecnica;
    private ArrayList<Vif_2010> lstDatosPucara;
    private ArrayList<Vif_2010> lstDatosSanAlfonso;
    private ArrayList<Vif_2010> lstDatosShopping;
    private ArrayList<Vif_2010> lstDatosTerminalTerretre;
    private ArrayList<Vif_2010> lstDatosYaruquies;

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }

    public ArrayList<Vif_2010> getLstDatos24Mayo() {
        return lstDatos24Mayo;
    }

    public void setLstDatos24Mayo(ArrayList<Vif_2010> lstDatos24Mayo) {
        this.lstDatos24Mayo = lstDatos24Mayo;
    }

    public ArrayList<Vif_2010> getLstDatosCamiloPonce() {
        return lstDatosCamiloPonce;
    }

    public void setLstDatosCamiloPonce(ArrayList<Vif_2010> lstDatosCamiloPonce) {
        this.lstDatosCamiloPonce = lstDatosCamiloPonce;
    }

    public ArrayList<Vif_2010> getLstDatosCaminosAlSol() {
        return lstDatosCaminosAlSol;
    }

    public void setLstDatosCaminosAlSol(ArrayList<Vif_2010> lstDatosCaminosAlSol) {
        this.lstDatosCaminosAlSol = lstDatosCaminosAlSol;
    }

    public ArrayList<Vif_2010> getLstDatosLaCondamine() {
        return lstDatosLaCondamine;
    }

    public void setLstDatosLaCondamine(ArrayList<Vif_2010> lstDatosLaCondamine) {
        this.lstDatosLaCondamine = lstDatosLaCondamine;
    }

    public ArrayList<Vif_2010> getLstDatosLaEstacion() {
        return lstDatosLaEstacion;
    }

    public void setLstDatosLaEstacion(ArrayList<Vif_2010> lstDatosLaEstacion) {
        this.lstDatosLaEstacion = lstDatosLaEstacion;
    }

    public ArrayList<Vif_2010> getLstDatosLaPaz() {
        return lstDatosLaPaz;
    }

    public void setLstDatosLaPaz(ArrayList<Vif_2010> lstDatosLaPaz) {
        this.lstDatosLaPaz = lstDatosLaPaz;
    }

    public ArrayList<Vif_2010> getLstDatosLaPrimavera() {
        return lstDatosLaPrimavera;
    }

    public void setLstDatosLaPrimavera(ArrayList<Vif_2010> lstDatosLaPrimavera) {
        this.lstDatosLaPrimavera = lstDatosLaPrimavera;
    }

    public ArrayList<Vif_2010> getLstDatosPolitecnica() {
        return lstDatosPolitecnica;
    }

    public void setLstDatosPolitecnica(ArrayList<Vif_2010> lstDatosPolitecnica) {
        this.lstDatosPolitecnica = lstDatosPolitecnica;
    }

    public ArrayList<Vif_2010> getLstDatosPucara() {
        return lstDatosPucara;
    }

    public void setLstDatosPucara(ArrayList<Vif_2010> lstDatosPucara) {
        this.lstDatosPucara = lstDatosPucara;
    }

    public ArrayList<Vif_2010> getLstDatosSanAlfonso() {
        return lstDatosSanAlfonso;
    }

    public void setLstDatosSanAlfonso(ArrayList<Vif_2010> lstDatosSanAlfonso) {
        this.lstDatosSanAlfonso = lstDatosSanAlfonso;
    }

    public ArrayList<Vif_2010> getLstDatosShopping() {
        return lstDatosShopping;
    }

    public void setLstDatosShopping(ArrayList<Vif_2010> lstDatosShopping) {
        this.lstDatosShopping = lstDatosShopping;
    }

    public ArrayList<Vif_2010> getLstDatosTerminalTerretre() {
        return lstDatosTerminalTerretre;
    }

    public void setLstDatosTerminalTerretre(ArrayList<Vif_2010> lstDatosTerminalTerretre) {
        this.lstDatosTerminalTerretre = lstDatosTerminalTerretre;
    }

    public ArrayList<Vif_2010> getLstDatosYaruquies() {
        return lstDatosYaruquies;
    }

    public void setLstDatosYaruquies(ArrayList<Vif_2010> lstDatosYaruquies) {
        this.lstDatosYaruquies = lstDatosYaruquies;
    }

    public CartesianChartModel getLineModel1() {
        return lineModel1;
    }

    public void setLineModel1(CartesianChartModel lineModel1) {
        this.lineModel1 = lineModel1;
    }

    public CartesianChartModel getLineModel2() {
        return lineModel2;
    }

    public void setLineModel2(CartesianChartModel lineModel2) {
        this.lineModel2 = lineModel2;
    }

    public ArrayList<Vif_2010> getLstDatosC() {
        return lstDatosC;
    }

    public void setLstDatosC(ArrayList<Vif_2010> lstDatosC) {
        this.lstDatosC = lstDatosC;
    }

    public ArrayList<Vif_2010> getLstDatosDadoC() {
        return lstDatosDadoC;
    }

    public void setLstDatosDadoC(ArrayList<Vif_2010> lstDatosDadoC) {
        this.lstDatosDadoC = lstDatosDadoC;
    }

    public ArrayList<Vif_2010> getLstDatos7() {
        return lstDatos7;
    }

    public void setLstDatos7(ArrayList<Vif_2010> lstDatos7) {
        this.lstDatos7 = lstDatos7;
    }

    public ArrayList<Vif_2010> getLstDatos8() {
        return lstDatos8;
    }

    public void setLstDatos8(ArrayList<Vif_2010> lstDatos8) {
        this.lstDatos8 = lstDatos8;
    }

    public ArrayList<Vif_2010> getLstDatosControl1() {
        return lstDatosControl1;
    }

    public void setLstDatos1(ArrayList<Vif_2010> lstDatosControl1) {
        this.lstDatosControl1 = lstDatosControl1;
    }

    public Vif_2010 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2010 datoSel) {
        this.datoSel = datoSel;
    }

    public Vif_2010Controlador() {
        this.reinit();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {
        //this.objDatos = new Vif_2010();
        this.datoSel = new Vif_2010();
        this.lstDatosControl1 = new ArrayList<Vif_2010>();
        this.lstDatos7 = new ArrayList<Vif_2010>();
        this.lstDatos8 = new ArrayList<Vif_2010>();
        this.lstDatosC = new ArrayList<Vif_2010>();
        this.lstDatosDadoC = new ArrayList<Vif_2010>();

        this.init();
        this.cargarDatos();

    }

    public void graficar() {
        lineModel1 = initCategorySubcircuito();
        lineModel2 = initCategoryCircuito();
        pieModel=graficaDenunciasCircuito();
    }

    /**
     *
     */
    private CartesianChartModel initCategorySubcircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatos8 = FVif_2010.ObtenerDatosSubCircuito();
            ChartSeries SubCircuito = new ChartSeries();
            SubCircuito.setLabel("SubCircuito");
            for (int x = 0; x < lstDatos8.size(); x++) {
                lstDatos7 = FVif_2010.ObtenerDatosDadoSubcircuito(lstDatos8.get(x).getSubcircuit());
                SubCircuito.set(lstDatos8.get(x).getSubcircuit(), lstDatos7.size());

            }

            model.addSeries(SubCircuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private CartesianChartModel initCategoryCircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosC = FVif_2010.ObtenerDatosCircuito();

            ChartSeries Circuito = new ChartSeries();
            Circuito.setLabel("Circuito");
            for (Vif_2010 lstDatosC1 : lstDatosC) {
                lstDatosDadoC = FVif_2010.ObtenerDatosDadoCircuito(lstDatosC1.getCircuito());
                Circuito.set(lstDatosC1.getCircuito(), lstDatosDadoC.size());
            }

            model.addSeries(Circuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    private PieChartModel graficaDenunciasCircuito() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();

            lstDatos24Mayo = FVif_2010.ObtenerDatosDadoCircuito("24 DE MAYO");
            lstDatosCamiloPonce = FVif_2010.ObtenerDatosDadoCircuito("CAMILO PONCE");
            lstDatosCaminosAlSol = FVif_2010.ObtenerDatosDadoCircuito("CAMINOS AL SOL");
            lstDatosLaCondamine = FVif_2010.ObtenerDatosDadoCircuito("LA CONDAMINE");
            lstDatosLaEstacion = FVif_2010.ObtenerDatosDadoCircuito("LA ESTACION");
            lstDatosLaPaz = FVif_2010.ObtenerDatosDadoCircuito("LA PAZ");
            lstDatosLaPrimavera = FVif_2010.ObtenerDatosDadoCircuito("LA PRIMAVERA");
            lstDatosPolitecnica = FVif_2010.ObtenerDatosDadoCircuito("POLITECNICA");
            lstDatosPucara = FVif_2010.ObtenerDatosDadoCircuito("PUCARA");
            lstDatosSanAlfonso = FVif_2010.ObtenerDatosDadoCircuito("SAN ALFONSO");
            lstDatosShopping = FVif_2010.ObtenerDatosDadoCircuito("SHOPPING");
            lstDatosTerminalTerretre = FVif_2010.ObtenerDatosDadoCircuito("TERMINAL TERRESTRE");
            lstDatosYaruquies = FVif_2010.ObtenerDatosDadoCircuito("YARUQUIES");

            pieModel.set("24 DE MAYO", lstDatos24Mayo.size());
            pieModel.set("CAMILO PONCE", lstDatosCamiloPonce.size());
            pieModel.set("CAMINOS AL SOL", lstDatosCaminosAlSol.size());
            pieModel.set("LA CONDAMINE", lstDatosLaCondamine.size());
            pieModel.set("LA ESTACION", lstDatosLaEstacion.size());
            pieModel.set("LA PAZ", lstDatosLaPaz.size());
            pieModel.set("LA PRIMAVERA", lstDatosLaPrimavera.size());
            pieModel.set("POLITECNICA", lstDatosPolitecnica.size());
            pieModel.set("PUCARA", lstDatosPucara.size());
            pieModel.set("SAN ALFONSO", lstDatosSanAlfonso.size());
            pieModel.set("SHOPPING", lstDatosShopping.size());
            pieModel.set("TERMINAL TERRESTRE", lstDatosTerminalTerretre.size());
            pieModel.set("YARUQUIES", lstDatosYaruquies.size());

        } catch (Exception e) {

        }
        return pieModel;
    }

    public void cargarDatos() {
        try {

            this.lstDatosControl1 = FVif_2010.ObtenerDatos();
            this.datoSel = lstDatosControl1.get(0);
            System.out.println(lstDatosControl1.get(0).getId());

        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
