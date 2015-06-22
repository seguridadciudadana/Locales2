/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2011;
import geoportal.logica.funciones.FVif_2011;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.context.DefaultRequestContext;
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
public final class Vif_2011ControladorDatosGeneral {

    /**
     * Creates a new instance of Vif_2011ControladorDatosGeneral
     */
    private CartesianChartModel lineModel1;
    private CartesianChartModel lineModel2;
    private PieChartModel pieModel;
    private PieChartModel pieModelSubCircuito;
    private ArrayList<Vif_2011> lstDatosControl1;
    private Vif_2011 datoSel;
    private ArrayList<Vif_2011> lstDatosC;
    private ArrayList<Vif_2011> lstDatosDadoC;
    private ArrayList<Vif_2011> lstDatosS; //lstDatos7
    private ArrayList<Vif_2011> lstDatosDadoS; //lstDatos8
    private ArrayList<Vif_2011> lstDatos24Mayo;
    private ArrayList<Vif_2011> lstDatosCamiloPonce;
    private ArrayList<Vif_2011> lstDatosCaminosAlSol;
    private ArrayList<Vif_2011> lstDatosLaCondamine;
    private ArrayList<Vif_2011> lstDatosLaEstacion;
    private ArrayList<Vif_2011> lstDatosLaPaz;
    private ArrayList<Vif_2011> lstDatosLaPrimavera;
    private ArrayList<Vif_2011> lstDatosPolitecnica;
    private ArrayList<Vif_2011> lstDatosPucara;
    private ArrayList<Vif_2011> lstDatosSanAlfonso;
    private ArrayList<Vif_2011> lstDatosShopping;
    private ArrayList<Vif_2011> lstDatosTerminalTerretre;
    private ArrayList<Vif_2011> lstDatosYaruquies;

    public PieChartModel getPieModelSubCircuito() {
        return pieModelSubCircuito;
    }

    public void setPieModelSubCircuito(PieChartModel pieModelSubCircuito) {
        this.pieModelSubCircuito = pieModelSubCircuito;
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }

    public ArrayList<Vif_2011> getLstDatos24Mayo() {
        return lstDatos24Mayo;
    }

    public void setLstDatos24Mayo(ArrayList<Vif_2011> lstDatos24Mayo) {
        this.lstDatos24Mayo = lstDatos24Mayo;
    }

    public ArrayList<Vif_2011> getLstDatosCamiloPonce() {
        return lstDatosCamiloPonce;
    }

    public void setLstDatosCamiloPonce(ArrayList<Vif_2011> lstDatosCamiloPonce) {
        this.lstDatosCamiloPonce = lstDatosCamiloPonce;
    }

    public ArrayList<Vif_2011> getLstDatosCaminosAlSol() {
        return lstDatosCaminosAlSol;
    }

    public void setLstDatosCaminosAlSol(ArrayList<Vif_2011> lstDatosCaminosAlSol) {
        this.lstDatosCaminosAlSol = lstDatosCaminosAlSol;
    }

    public ArrayList<Vif_2011> getLstDatosLaCondamine() {
        return lstDatosLaCondamine;
    }

    public void setLstDatosLaCondamine(ArrayList<Vif_2011> lstDatosLaCondamine) {
        this.lstDatosLaCondamine = lstDatosLaCondamine;
    }

    public ArrayList<Vif_2011> getLstDatosLaEstacion() {
        return lstDatosLaEstacion;
    }

    public void setLstDatosLaEstacion(ArrayList<Vif_2011> lstDatosLaEstacion) {
        this.lstDatosLaEstacion = lstDatosLaEstacion;
    }

    public ArrayList<Vif_2011> getLstDatosLaPaz() {
        return lstDatosLaPaz;
    }

    public void setLstDatosLaPaz(ArrayList<Vif_2011> lstDatosLaPaz) {
        this.lstDatosLaPaz = lstDatosLaPaz;
    }

    public ArrayList<Vif_2011> getLstDatosLaPrimavera() {
        return lstDatosLaPrimavera;
    }

    public void setLstDatosLaPrimavera(ArrayList<Vif_2011> lstDatosLaPrimavera) {
        this.lstDatosLaPrimavera = lstDatosLaPrimavera;
    }

    public ArrayList<Vif_2011> getLstDatosPolitecnica() {
        return lstDatosPolitecnica;
    }

    public void setLstDatosPolitecnica(ArrayList<Vif_2011> lstDatosPolitecnica) {
        this.lstDatosPolitecnica = lstDatosPolitecnica;
    }

    public ArrayList<Vif_2011> getLstDatosPucara() {
        return lstDatosPucara;
    }

    public void setLstDatosPucara(ArrayList<Vif_2011> lstDatosPucara) {
        this.lstDatosPucara = lstDatosPucara;
    }

    public ArrayList<Vif_2011> getLstDatosSanAlfonso() {
        return lstDatosSanAlfonso;
    }

    public void setLstDatosSanAlfonso(ArrayList<Vif_2011> lstDatosSanAlfonso) {
        this.lstDatosSanAlfonso = lstDatosSanAlfonso;
    }

    public ArrayList<Vif_2011> getLstDatosShopping() {
        return lstDatosShopping;
    }

    public void setLstDatosShopping(ArrayList<Vif_2011> lstDatosShopping) {
        this.lstDatosShopping = lstDatosShopping;
    }

    public ArrayList<Vif_2011> getLstDatosTerminalTerretre() {
        return lstDatosTerminalTerretre;
    }

    public void setLstDatosTerminalTerretre(ArrayList<Vif_2011> lstDatosTerminalTerretre) {
        this.lstDatosTerminalTerretre = lstDatosTerminalTerretre;
    }

    public ArrayList<Vif_2011> getLstDatosYaruquies() {
        return lstDatosYaruquies;
    }

    public void setLstDatosYaruquies(ArrayList<Vif_2011> lstDatosYaruquies) {
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

    public ArrayList<Vif_2011> getLstDatosControl1() {
        return lstDatosControl1;
    }

    public void setLstDatosControl1(ArrayList<Vif_2011> lstDatosControl1) {
        this.lstDatosControl1 = lstDatosControl1;
    }

    public Vif_2011 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2011 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2011> getLstDatosC() {
        return lstDatosC;
    }

    public void setLstDatosC(ArrayList<Vif_2011> lstDatosC) {
        this.lstDatosC = lstDatosC;
    }

    public ArrayList<Vif_2011> getLstDatosDadoC() {
        return lstDatosDadoC;
    }

    public void setLstDatosDadoC(ArrayList<Vif_2011> lstDatosDadoC) {
        this.lstDatosDadoC = lstDatosDadoC;
    }

    public ArrayList<Vif_2011> getLstDatosS() {
        return lstDatosS;
    }

    public void setLstDatosS(ArrayList<Vif_2011> lstDatosS) {
        this.lstDatosS = lstDatosS;
    }

    public ArrayList<Vif_2011> getLstDatosDadoS() {
        return lstDatosDadoS;
    }

    public void setLstDatosDadoS(ArrayList<Vif_2011> lstDatosDadoS) {
        this.lstDatosDadoS = lstDatosDadoS;
    }

    public Vif_2011ControladorDatosGeneral() {
        this.reinit();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {
        this.datoSel = new Vif_2011();
        this.lstDatosControl1 = new ArrayList<Vif_2011>();
        this.lstDatosS = new ArrayList<Vif_2011>();
        this.lstDatosDadoS = new ArrayList<Vif_2011>();
        this.lstDatosC = new ArrayList<Vif_2011>();
        this.lstDatosDadoC = new ArrayList<Vif_2011>();

        this.init();
        this.cargarDatos();

    }

    public void graficar() {
        lineModel1 = initCategorySubcircuito();
        lineModel2 = initCategoryCircuito();
        pieModel = graficaDenunciasCircuito();
        pieModelSubCircuito = pieDenunciasSubCircuito();
    }

    private CartesianChartModel initCategorySubcircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
//            lstDatosDadoS = FVif_2011.ObtenerDatosSubcircuito();
            lstDatosS = FVif_2011.ObtenerDatosSubcircuito();
            ChartSeries SubCircuito = new ChartSeries();
            SubCircuito.setLabel("SubCircuito");
            for (int x = 0; x < lstDatosS.size(); x++) {
                lstDatosDadoS = FVif_2011.ObtenerDatosDadoSubcircuito(lstDatosS.get(x).getSubcircuito());
                SubCircuito.set(lstDatosS.get(x).getSubcircuito(), lstDatosDadoS.size());
            }
            model.addSeries(SubCircuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private PieChartModel pieDenunciasSubCircuito() {
        PieChartModel pieModel = new PieChartModel();
        try {
//            lstDatosDadoS = FVif_2011.ObtenerDatosSubcircuito();
            lstDatosS = FVif_2011.ObtenerDatosSubcircuito();
            for (int x = 0; x < lstDatosS.size(); x++) {
                lstDatosDadoS = FVif_2011.ObtenerDatosDadoSubcircuito(lstDatosS.get(x).getSubcircuito());
                pieModel.set(lstDatosS.get(x).getSubcircuito(), lstDatosDadoS.size());
            }

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    private CartesianChartModel initCategoryCircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosC = FVif_2011.ObtenerDatosCircuito();
            ChartSeries Circuito = new ChartSeries();
            Circuito.setLabel("Circuito");
            for (int x = 0; x < lstDatosC.size(); x++) {
                lstDatosDadoC = FVif_2011.ObtenerDatosDadoCircuito(lstDatosC.get(x).getCircuito());
                Circuito.set(lstDatosC.get(x).getCircuito(), lstDatosDadoC.size());
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

            lstDatos24Mayo = FVif_2011.ObtenerDatosDadoCircuito("24 DE MAYO");
            lstDatosCamiloPonce = FVif_2011.ObtenerDatosDadoCircuito("CAMILO PONCE");
            lstDatosCaminosAlSol = FVif_2011.ObtenerDatosDadoCircuito("CAMINOS AL SOL");
            lstDatosLaCondamine = FVif_2011.ObtenerDatosDadoCircuito("LA CONDAMINE");
            lstDatosLaEstacion = FVif_2011.ObtenerDatosDadoCircuito("LA ESTACION");
            lstDatosLaPaz = FVif_2011.ObtenerDatosDadoCircuito("LA PAZ");
            lstDatosLaPrimavera = FVif_2011.ObtenerDatosDadoCircuito("LA PRIMAVERA");
            lstDatosPolitecnica = FVif_2011.ObtenerDatosDadoCircuito("POLITECNICA");
            lstDatosPucara = FVif_2011.ObtenerDatosDadoCircuito("PUCARA");
            lstDatosSanAlfonso = FVif_2011.ObtenerDatosDadoCircuito("SAN ALFONSO");
            lstDatosShopping = FVif_2011.ObtenerDatosDadoCircuito("SHOPPING");
            lstDatosTerminalTerretre = FVif_2011.ObtenerDatosDadoCircuito("TERMINAL TERRESTRE");
            lstDatosYaruquies = FVif_2011.ObtenerDatosDadoCircuito("YARUQUIES");

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
            this.lstDatosControl1 = FVif_2011.ObtenerDatos();
            this.datoSel = lstDatosControl1.get(0);
            System.out.println(lstDatosControl1.get(0).getId());
        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }
}
