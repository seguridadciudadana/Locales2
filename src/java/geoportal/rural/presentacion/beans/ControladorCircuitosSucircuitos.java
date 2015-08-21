/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.rural.presentacion.beans;

import geoportal.rural.logica.clases.VifRural2011;
import geoportal.rural.logica.funciones.FVifRural2011;
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
public class ControladorCircuitosSucircuitos {

    /**
     * Creates a new instance of ControladorCircuitosSucircuitos
     */
    private ArrayList<VifRural2011> lstDatos;
    private ArrayList<VifRural2011> lstDatosCircuitos;
    private ArrayList<VifRural2011> lstDatosSubCircuitos;
    private ArrayList<VifRural2011> lstDatosDadoCircuitos;
    private ArrayList<VifRural2011> lstDatosDadoSubCircuitos;
    private CartesianChartModel lineCircuitos;
    private CartesianChartModel lineCircuitos2010;
    private CartesianChartModel lineCircuitos2011;
    private CartesianChartModel lineCircuitos2012;
    private CartesianChartModel lineSubCircuitos;
    private CartesianChartModel lineSubCircuitos2011;
    private CartesianChartModel lineSubCircuitos2012;

    public CartesianChartModel getLineSubCircuitos2011() {
        return lineSubCircuitos2011;
    }

    public void setLineSubCircuitos2011(CartesianChartModel lineSubCircuitos2011) {
        this.lineSubCircuitos2011 = lineSubCircuitos2011;
    }

    public CartesianChartModel getLineSubCircuitos2012() {
        return lineSubCircuitos2012;
    }

    public void setLineSubCircuitos2012(CartesianChartModel lineSubCircuitos2012) {
        this.lineSubCircuitos2012 = lineSubCircuitos2012;
    }
    
    
    

    public CartesianChartModel getLineCircuitos2010() {
        return lineCircuitos2010;
    }

    public void setLineCircuitos2010(CartesianChartModel lineCircuitos2010) {
        this.lineCircuitos2010 = lineCircuitos2010;
    }

    public CartesianChartModel getLineCircuitos2011() {
        return lineCircuitos2011;
    }

    public void setLineCircuitos2011(CartesianChartModel lineCircuitos2011) {
        this.lineCircuitos2011 = lineCircuitos2011;
    }

    public CartesianChartModel getLineCircuitos2012() {
        return lineCircuitos2012;
    }

    public void setLineCircuitos2012(CartesianChartModel lineCircuitos2012) {
        this.lineCircuitos2012 = lineCircuitos2012;
    }

    public ArrayList<VifRural2011> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<VifRural2011> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<VifRural2011> getLstDatosCircuitos() {
        return lstDatosCircuitos;
    }

    public void setLstDatosCircuitos(ArrayList<VifRural2011> lstDatosCircuitos) {
        this.lstDatosCircuitos = lstDatosCircuitos;
    }

    public ArrayList<VifRural2011> getLstDatosSubCircuitos() {
        return lstDatosSubCircuitos;
    }

    public void setLstDatosSubCircuitos(ArrayList<VifRural2011> lstDatosSubCircuitos) {
        this.lstDatosSubCircuitos = lstDatosSubCircuitos;
    }

    public ArrayList<VifRural2011> getLstDatosDadoCircuitos() {
        return lstDatosDadoCircuitos;
    }

    public void setLstDatosDadoCircuitos(ArrayList<VifRural2011> lstDatosDadoCircuitos) {
        this.lstDatosDadoCircuitos = lstDatosDadoCircuitos;
    }

    public ArrayList<VifRural2011> getLstDatosDadoSubCircuitos() {
        return lstDatosDadoSubCircuitos;
    }

    public void setLstDatosDadoSubCircuitos(ArrayList<VifRural2011> lstDatosDadoSubCircuitos) {
        this.lstDatosDadoSubCircuitos = lstDatosDadoSubCircuitos;
    }

    public CartesianChartModel getLineCircuitos() {
        return lineCircuitos;
    }

    public void setLineCircuitos(CartesianChartModel lineCircuitos) {
        this.lineCircuitos = lineCircuitos;
    }

    public CartesianChartModel getLineSubCircuitos() {
        return lineSubCircuitos;
    }

    public void setLineSubCircuitos(CartesianChartModel lineSubCircuitos) {
        this.lineSubCircuitos = lineSubCircuitos;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {
        this.init();
    }

    public void graficar() {
        
        lineCircuitos2011 = graficoDetalleGeneralCircuitos2011();
        lineCircuitos2012 = graficoDetalleGeneralCircuitos2012();
         lineSubCircuitos2011=graficoDetalleGeneralSubCircuitos2011();
    }

    public ControladorCircuitosSucircuitos() {
        this.reinit();
    }

    private CartesianChartModel graficoDetalleGeneralCircuitos2011() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries Circuitos2011 = new ChartSeries();
            Circuitos2011.setLabel("Detalle por Circuitos");
            lstDatosCircuitos = FVifRural2011.ObtenerDatosDadoAnioCircuitos(2011);
            for (int i = 0; i < lstDatosCircuitos.size(); i++) {
                lstDatosDadoCircuitos = FVifRural2011.ObtenerDatosDadoAnioDadoCircuitos(2011, lstDatosCircuitos.get(i).getCircuito());
                Circuitos2011.set(lstDatosCircuitos.get(i).getCircuito(), lstDatosDadoCircuitos.size());
            }

            model.addSeries(Circuitos2011);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

    private CartesianChartModel graficoDetalleGeneralCircuitos2012() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries Circuitos2012 = new ChartSeries();
            Circuitos2012.setLabel("Detalle por Circuitos");
            lstDatosCircuitos = FVifRural2011.ObtenerDatosDadoAnioCircuitos(2012);
            for (int i = 0; i < lstDatosCircuitos.size(); i++) {
                lstDatosDadoCircuitos = FVifRural2011.ObtenerDatosDadoAnioDadoCircuitos(2012, lstDatosCircuitos.get(i).getCircuito());
                Circuitos2012.set(lstDatosCircuitos.get(i).getCircuito(), lstDatosDadoCircuitos.size());
            }

            model.addSeries(Circuitos2012);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    private CartesianChartModel graficoDetalleGeneralSubCircuitos2011() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries SubCircuitos2011 = new ChartSeries();
            SubCircuitos2011.setLabel("Detalle por Circuitos");
            lstDatosSubCircuitos = FVifRural2011.ObtenerDatosDadoAnioSubcircuito(2011);
            for (int i = 0; i < lstDatosCircuitos.size(); i++) {
                lstDatosDadoSubCircuitos = FVifRural2011.ObtenerDatosDadoSubcircuitoDadoAnio(lstDatosSubCircuitos.get(i).getSubcircuito(),2011);
                SubCircuitos2011.set(lstDatosSubCircuitos.get(i).getSubcircuito(), lstDatosDadoSubCircuitos.size());
            }

            model.addSeries(SubCircuitos2011);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    

}
