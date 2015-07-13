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
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class Vif_2010ControladorParentesco {
     private CartesianChartModel parentescoGrafico;
    private CartesianChartModel lineEstadoCivil;
    private ArrayList<Vif_2010> lstDatosControl;
    private Vif_2010 datoSel;
    private ArrayList<Vif_2010> lstDatosP;
    private ArrayList<Vif_2010> lstDatosEC;
    private ArrayList<Vif_2010> lstDatosDadoP;
    private ArrayList<Vif_2010> lstDatosDadoEC;
    private PieChartModel pieEstadoCivil;

    public CartesianChartModel getParentescoGrafico() {
        return parentescoGrafico;
    }

    public void setParentescoGrafico(CartesianChartModel parentescoGrafico) {
        this.parentescoGrafico = parentescoGrafico;
    }

    public CartesianChartModel getLineEstadoCivil() {
        return lineEstadoCivil;
    }

    public void setLineEstadoCivil(CartesianChartModel lineEstadoCivil) {
        this.lineEstadoCivil = lineEstadoCivil;
    }

    public ArrayList<Vif_2010> getLstDatosControl() {
        return lstDatosControl;
    }

    public void setLstDatosControl(ArrayList<Vif_2010> lstDatosControl) {
        this.lstDatosControl = lstDatosControl;
    }

    public Vif_2010 getDatoSel() {
        return datoSel;
    }

    public void setDatoSel(Vif_2010 datoSel) {
        this.datoSel = datoSel;
    }

    public ArrayList<Vif_2010> getLstDatosP() {
        return lstDatosP;
    }

    public void setLstDatosP(ArrayList<Vif_2010> lstDatosP) {
        this.lstDatosP = lstDatosP;
    }

    public ArrayList<Vif_2010> getLstDatosEC() {
        return lstDatosEC;
    }

    public void setLstDatosEC(ArrayList<Vif_2010> lstDatosEC) {
        this.lstDatosEC = lstDatosEC;
    }

    public ArrayList<Vif_2010> getLstDatosDadoP() {
        return lstDatosDadoP;
    }

    public void setLstDatosDadoP(ArrayList<Vif_2010> lstDatosDadoP) {
        this.lstDatosDadoP = lstDatosDadoP;
    }

    public ArrayList<Vif_2010> getLstDatosDadoEC() {
        return lstDatosDadoEC;
    }

    public void setLstDatosDadoEC(ArrayList<Vif_2010> lstDatosDadoEC) {
        this.lstDatosDadoEC = lstDatosDadoEC;
    }

    public PieChartModel getPieEstadoCivil() {
        return pieEstadoCivil;
    }

    public void setPieEstadoCivil(PieChartModel pieEstadoCivil) {
        this.pieEstadoCivil = pieEstadoCivil;
    }

    public Vif_2010ControladorParentesco() {
        reinit();
    }
    
    public void graficar() {
        parentescoGrafico = initCategoryParentesco();
        lineEstadoCivil = initEstadoCivil();
        pieEstadoCivil=pieEstadoCivil();
    }
    @PostConstruct
    public void init() {
        graficar();
    }
    
    private void reinit() {

        this.lstDatosControl = new ArrayList<Vif_2010>();
        this.lstDatosP = new ArrayList<Vif_2010>();
        this.lstDatosDadoP = new ArrayList<Vif_2010>();
        this.datoSel = new Vif_2010();

        this.init();
        this.cargarDatos();

    }

    private CartesianChartModel initCategoryParentesco() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosP = FVif_2010.ObtenerDatosParentesco();
            ChartSeries Parentesco = new ChartSeries();
            Parentesco.setLabel("Parentesco Victima - Agresor");
            for (Vif_2010 lstDatosP1 : lstDatosP) {
                lstDatosDadoP = FVif_2010.ObtenerDatosDadoParentesco(lstDatosP1.getParentesco());
                Parentesco.set(lstDatosP1.getParentesco(), lstDatosDadoP.size());
            }
            model.addSeries(Parentesco);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initEstadoCivil() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosEC = FVif_2010.ObtenerDatosEstadoCivil();
            ChartSeries EstadoCivil = new ChartSeries();
            EstadoCivil.setLabel("Estado Civil de las Víctimas");
            for (int i = 0; i < lstDatosEC.size(); i++) {
                lstDatosDadoEC = FVif_2010.ObtenerDatosDadoEstadoCivilVictima(lstDatosEC.get(i).getEstado_civ());
                EstadoCivil.set(lstDatosEC.get(i).getEstado_civ(), lstDatosDadoEC.size());
            }
            model.addSeries(EstadoCivil);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private PieChartModel pieEstadoCivil() {
        PieChartModel pieModel = new PieChartModel();
        try {
            pieModel = new PieChartModel();
            for (int j = 0; j < lstDatosEC.size(); j++) {
                lstDatosDadoEC = FVif_2010.ObtenerDatosDadoEstadoCivilVictima(lstDatosEC.get(j).getEstado_civ());
                pieModel.set(lstDatosEC.get(j).getEstado_civ(), lstDatosDadoEC.size());
            }
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return pieModel;
    }

    public void cargarDatos() {
        try {
            this.lstDatosControl = FVif_2010.ObtenerDatos();
            this.datoSel = lstDatosControl.get(0);
            System.out.println(lstDatosControl.get(0).getId());
        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatos dice: " + e.getMessage());
            System.out.println("private void cargarDatos dice: " + e.getMessage());
        }
    }

}
