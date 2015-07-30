/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.rural.presentacion.beans;

import geoportal.rural.logica.clases.VifRural2010;
import geoportal.rural.logica.funciones.FVifRural2010;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Controlador_VifRural2010_Datos {

    /**
     * Creates a new instance of Controlador_VifRural2010_Datos
     */
    private VifRural2010 objVifRural2010;
    private ArrayList<VifRural2010> lstVifRural2010;
    private ArrayList<VifRural2010> lstDatosCircuito;
    private ArrayList<VifRural2010> lstDatosDadoCircuito;
    private ArrayList<VifRural2010> lstDatosCircuitoSM;
    private ArrayList<VifRural2010> lstDatosCircuitoSF;
    private ArrayList<VifRural2010> lstDatosSubcircuito;
    private ArrayList<VifRural2010> lstDatosSubcircuitoSM;
    private ArrayList<VifRural2010> lstDatosSubcircuitoSF;
    private ArrayList<VifRural2010> lstDatosDadoSubcircuito;
    private CartesianChartModel lineModelCircuito;
    private CartesianChartModel lineModelSubcircuito;
    private CartesianChartModel lineModelCircuitoSV;
    private CartesianChartModel lineModelSubcircuitoSV;

    public CartesianChartModel getLineModelCircuito() {
        return lineModelCircuito;
    }

    public void setLineModelCircuito(CartesianChartModel lineModelCircuito) {
        this.lineModelCircuito = lineModelCircuito;
    }

    public CartesianChartModel getLineModelSubcircuito() {
        return lineModelSubcircuito;
    }

    public void setLineModelSubcircuito(CartesianChartModel lineModelSubcircuito) {
        this.lineModelSubcircuito = lineModelSubcircuito;
    }

    public CartesianChartModel getLineModelCircuitoSV() {
        return lineModelCircuitoSV;
    }

    public void setLineModelCircuitoSV(CartesianChartModel lineModelCircuitoSV) {
        this.lineModelCircuitoSV = lineModelCircuitoSV;
    }

    public CartesianChartModel getLineModelSubcircuitoSV() {
        return lineModelSubcircuitoSV;
    }

    public void setLineModelSubcircuitoSV(CartesianChartModel lineModelSubcircuitoSV) {
        this.lineModelSubcircuitoSV = lineModelSubcircuitoSV;
    }

    public ArrayList<VifRural2010> getLstDatosCircuitoSM() {
        return lstDatosCircuitoSM;
    }

    public void setLstDatosCircuitoSM(ArrayList<VifRural2010> lstDatosCircuitoSM) {
        this.lstDatosCircuitoSM = lstDatosCircuitoSM;
    }

    public ArrayList<VifRural2010> getLstDatosCircuitoSF() {
        return lstDatosCircuitoSF;
    }

    public void setLstDatosCircuitoSF(ArrayList<VifRural2010> lstDatosCircuitoSF) {
        this.lstDatosCircuitoSF = lstDatosCircuitoSF;
    }

    public ArrayList<VifRural2010> getLstDatosSubcircuitoSM() {
        return lstDatosSubcircuitoSM;
    }

    public void setLstDatosSubcircuitoSM(ArrayList<VifRural2010> lstDatosSubcircuitoSM) {
        this.lstDatosSubcircuitoSM = lstDatosSubcircuitoSM;
    }

    public ArrayList<VifRural2010> getLstDatosSubcircuitoSF() {
        return lstDatosSubcircuitoSF;
    }

    public void setLstDatosSubcircuitoSF(ArrayList<VifRural2010> lstDatosSubcircuitoSF) {
        this.lstDatosSubcircuitoSF = lstDatosSubcircuitoSF;
    }

    public ArrayList<VifRural2010> getLstDatosCircuito() {
        return lstDatosCircuito;
    }

    public void setLstDatosCircuito(ArrayList<VifRural2010> lstDatosCircuito) {
        this.lstDatosCircuito = lstDatosCircuito;
    }

    public ArrayList<VifRural2010> getLstDatosDadoCircuito() {
        return lstDatosDadoCircuito;
    }

    public void setLstDatosDadoCircuito(ArrayList<VifRural2010> lstDatosDadoCircuito) {
        this.lstDatosDadoCircuito = lstDatosDadoCircuito;
    }

    public ArrayList<VifRural2010> getLstDatosSubcircuito() {
        return lstDatosSubcircuito;
    }

    public void setLstDatosSubcircuito(ArrayList<VifRural2010> lstDatosSubcircuito) {
        this.lstDatosSubcircuito = lstDatosSubcircuito;
    }

    public ArrayList<VifRural2010> getLstDatosDadoSubcircuito() {
        return lstDatosDadoSubcircuito;
    }

    public void setLstDatosDadoSubcircuito(ArrayList<VifRural2010> lstDatosDadoSubcircuito) {
        this.lstDatosDadoSubcircuito = lstDatosDadoSubcircuito;
    }

    public VifRural2010 getObjVifRural2010() {
        return objVifRural2010;
    }

    public void setObjVifRural2010(VifRural2010 objVifRural2010) {
        this.objVifRural2010 = objVifRural2010;
    }

    public ArrayList<VifRural2010> getLstVifRural2010() {
        return lstVifRural2010;
    }

    public void setLstVifRural2010(ArrayList<VifRural2010> lstVifRural2010) {
        this.lstVifRural2010 = lstVifRural2010;
    }

    public Controlador_VifRural2010_Datos() {
        this.reinit();        
    }

    public void reinit() {
        this.obtenerDatosVif_2010();
        this.init();
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineModelCircuito = initCategoryCircuito();
        this.lineModelSubcircuito = initCategorySubcircuito();
        this.lineModelCircuitoSV = initCategoryCircuitoSV();
        this.lineModelSubcircuitoSV = initCategorySubcircuitoSV();
    }

//DETALLE GENERAL CIRCUITO Y SUBCIRCUITO
    private CartesianChartModel initCategoryCircuito() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            this.lstDatosCircuito = FVifRural2010.ObtenerDatosCircuitos();
            ChartSeries Circuito = new ChartSeries();
            Circuito.setLabel("Circuito");
            for (int x = 0; x < lstDatosCircuito.size(); x++) {
                this.lstDatosDadoCircuito = FVifRural2010.ObtenerDatosDadoCircuito(this.lstDatosCircuito.get(x).getCircuito());
                Circuito.set(lstDatosCircuito.get(x).getCircuito(), lstDatosDadoCircuito.size());
            }
            model.addSeries(Circuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel initCategorySubcircuito() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {                      
            this.lstDatosSubcircuito=FVifRural2010.ObtenerDatosSubCircuitos();
            ChartSeries Subcircuito = new ChartSeries();
            Subcircuito.setLabel("Subcircuito");
            for (int x = 0; x < lstDatosSubcircuito.size(); x++) {
                this.lstDatosDadoSubcircuito = FVifRural2010.ObtenerDatosDadoSubCircuito(this.lstDatosSubcircuito.get(x).getSubcircuito());
                Subcircuito.set(lstDatosSubcircuito.get(x).getSubcircuito(), lstDatosDadoSubcircuito.size());
            }
            model1.addSeries(Subcircuito);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    //DETALE CIRCUITO Y SUBCIRCUITO DE ACUERDO AL SEXO DE LA VICTIMA
    private CartesianChartModel initCategoryCircuitoSV() {
        CartesianChartModel model2 = new CartesianChartModel();
        try {
            this.lstVifRural2010 = FVifRural2010.ObtenerDatos();
            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            for (int x = 0; x < lstVifRural2010.size(); x++) {
                this.lstDatosCircuitoSM = FVifRural2010.ObtenerDatosDadoCircuitoSexo("M", this.lstVifRural2010.get(x).getCircuito());
                Masculino.set(this.lstVifRural2010.get(x).getCircuito(), lstDatosCircuitoSM.size());
            }

            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            for (int x = 0; x < lstVifRural2010.size(); x++) {
                this.lstDatosCircuitoSF = FVifRural2010.ObtenerDatosDadoCircuitoSexo("F", this.lstVifRural2010.get(x).getCircuito());
                Femenino.set(this.lstVifRural2010.get(x).getCircuito(), lstDatosCircuitoSF.size());
            }

            model2.addSeries(Masculino);
            model2.addSeries(Femenino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model2;
    }

    private CartesianChartModel initCategorySubcircuitoSV() {
        CartesianChartModel model3 = new CartesianChartModel();
        try {
            this.lstVifRural2010 = FVifRural2010.ObtenerDatos();
            ChartSeries Masculino = new ChartSeries();
            Masculino.setLabel("Masculino");
            for (int x = 0; x < lstVifRural2010.size(); x++) {
                this.lstDatosSubcircuitoSM = FVifRural2010.ObtenerDatosDadoSubCircuitoSexo("M", this.lstVifRural2010.get(x).getSubcircuito());
                Masculino.set(this.lstVifRural2010.get(x).getSubcircuito(), this.lstDatosSubcircuitoSM.size());
            }

            this.lstVifRural2010 = FVifRural2010.ObtenerDatos();
            ChartSeries Femenino = new ChartSeries();
            Femenino.setLabel("Femenino");
            for (int x = 0; x < lstVifRural2010.size(); x++) {
                this.lstDatosSubcircuitoSF = FVifRural2010.ObtenerDatosDadoSubCircuitoSexo("F", this.lstVifRural2010.get(x).getSubcircuito());
                Femenino.set(this.lstVifRural2010.get(x).getSubcircuito(), this.lstDatosSubcircuitoSF.size());
            }

            model3.addSeries(Masculino);
            model3.addSeries(Femenino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model3;
    }

    //meses del año
    
    
    public void obtenerDatosVif_2010() {
        try {
            this.lstVifRural2010 = FVifRural2010.ObtenerDatos();
            this.objVifRural2010 = lstVifRural2010.get(0);
            System.out.println(lstVifRural2010.get(0).getId());
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerDatosVif2012 dice: " + e.getMessage());
            System.out.println("public void obtenerDatosVif2012 dice: " + e.getMessage());
        }

    }
}
