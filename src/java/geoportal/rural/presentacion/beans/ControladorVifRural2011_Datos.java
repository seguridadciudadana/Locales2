/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.rural.presentacion.beans;

import geoportal.rural.logica.clases.VifRural2011;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;

/**
 *
 * @author Geovanny Cudco
 */
@ManagedBean
@RequestScoped
public class ControladorVifRural2011_Datos {

    
    private VifRural2011 objVifRural2011;
    private ArrayList<VifRural2011> lstVifRural2011;
    private ArrayList<VifRural2011> lstDatosCircuito;
    private ArrayList<VifRural2011> lstDatosDadoCircuito;
    private ArrayList<VifRural2011> lstDatosCircuitoSM;
    private ArrayList<VifRural2011> lstDatosCircuitoSF;
    private ArrayList<VifRural2011> lstDatosSubcircuito;
    private ArrayList<VifRural2011> lstDatosSubcircuitoSM;
    private ArrayList<VifRural2011> lstDatosSubcircuitoSF;
    private ArrayList<VifRural2011> lstDatosDadoSubcircuito;
    private CartesianChartModel lineModelCircuito;
    private CartesianChartModel lineModelSubcircuito;
    private CartesianChartModel lineModelCircuitoSV;
    private CartesianChartModel lineModelSubcircuitoSV;

    public VifRural2011 getObjVifRural2011() {
        return objVifRural2011;
    }

    public void setObjVifRural2011(VifRural2011 objVifRural2011) {
        this.objVifRural2011 = objVifRural2011;
    }

    public ArrayList<VifRural2011> getLstVifRural2011() {
        return lstVifRural2011;
    }

    public void setLstVifRural2011(ArrayList<VifRural2011> lstVifRural2011) {
        this.lstVifRural2011 = lstVifRural2011;
    }

    public ArrayList<VifRural2011> getLstDatosCircuito() {
        return lstDatosCircuito;
    }

    public void setLstDatosCircuito(ArrayList<VifRural2011> lstDatosCircuito) {
        this.lstDatosCircuito = lstDatosCircuito;
    }

    public ArrayList<VifRural2011> getLstDatosDadoCircuito() {
        return lstDatosDadoCircuito;
    }

    public void setLstDatosDadoCircuito(ArrayList<VifRural2011> lstDatosDadoCircuito) {
        this.lstDatosDadoCircuito = lstDatosDadoCircuito;
    }

    public ArrayList<VifRural2011> getLstDatosCircuitoSM() {
        return lstDatosCircuitoSM;
    }

    public void setLstDatosCircuitoSM(ArrayList<VifRural2011> lstDatosCircuitoSM) {
        this.lstDatosCircuitoSM = lstDatosCircuitoSM;
    }

    public ArrayList<VifRural2011> getLstDatosCircuitoSF() {
        return lstDatosCircuitoSF;
    }

    public void setLstDatosCircuitoSF(ArrayList<VifRural2011> lstDatosCircuitoSF) {
        this.lstDatosCircuitoSF = lstDatosCircuitoSF;
    }

    public ArrayList<VifRural2011> getLstDatosSubcircuito() {
        return lstDatosSubcircuito;
    }

    public void setLstDatosSubcircuito(ArrayList<VifRural2011> lstDatosSubcircuito) {
        this.lstDatosSubcircuito = lstDatosSubcircuito;
    }

    public ArrayList<VifRural2011> getLstDatosSubcircuitoSM() {
        return lstDatosSubcircuitoSM;
    }

    public void setLstDatosSubcircuitoSM(ArrayList<VifRural2011> lstDatosSubcircuitoSM) {
        this.lstDatosSubcircuitoSM = lstDatosSubcircuitoSM;
    }

    public ArrayList<VifRural2011> getLstDatosSubcircuitoSF() {
        return lstDatosSubcircuitoSF;
    }

    public void setLstDatosSubcircuitoSF(ArrayList<VifRural2011> lstDatosSubcircuitoSF) {
        this.lstDatosSubcircuitoSF = lstDatosSubcircuitoSF;
    }

    public ArrayList<VifRural2011> getLstDatosDadoSubcircuito() {
        return lstDatosDadoSubcircuito;
    }

    public void setLstDatosDadoSubcircuito(ArrayList<VifRural2011> lstDatosDadoSubcircuito) {
        this.lstDatosDadoSubcircuito = lstDatosDadoSubcircuito;
    }

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
    
    
    
    
    
    public ControladorVifRural2011_Datos() {
    }
    
}
