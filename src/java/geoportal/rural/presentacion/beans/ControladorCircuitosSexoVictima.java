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
 * @author ICITS SALA5
 */
@ManagedBean
@RequestScoped
public class ControladorCircuitosSexoVictima {

    private ArrayList<VifRural2011> lstDatos;
    private ArrayList<VifRural2011> lstDatosCircuitos;
    private ArrayList<VifRural2011> lstDatosDadoCircuitos;
    private ArrayList<VifRural2011> lstDatosDadoCircuitosDadoSexo;
    private ArrayList<VifRural2011> lstDatosSubCircuitos;
    private ArrayList<VifRural2011> lstDatosDadoSubCircuitos;
    private ArrayList<VifRural2011> lstDatosDadoSubCircuitosDadoSexo;
    
    private CartesianChartModel lineCircuitos;
    private CartesianChartModel lineCircuitos2010;
    private CartesianChartModel lineCircuitos2011;
    private CartesianChartModel lineCircuitos2012;
    private CartesianChartModel lineSubCircuitos;
    private CartesianChartModel lineSubCircuitos2010;
    private CartesianChartModel lineSubCircuitos2011;
    private CartesianChartModel lineSubCircuitos2012;

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

    public ArrayList<VifRural2011> getLstDatosDadoCircuitos() {
        return lstDatosDadoCircuitos;
    }

    public void setLstDatosDadoCircuitos(ArrayList<VifRural2011> lstDatosDadoCircuitos) {
        this.lstDatosDadoCircuitos = lstDatosDadoCircuitos;
    }

    public ArrayList<VifRural2011> getLstDatosSubCircuitos() {
        return lstDatosSubCircuitos;
    }

    public void setLstDatosSubCircuitos(ArrayList<VifRural2011> lstDatosSubCircuitos) {
        this.lstDatosSubCircuitos = lstDatosSubCircuitos;
    }

    public ArrayList<VifRural2011> getLstDatosDadoSubCircuitos() {
        return lstDatosDadoSubCircuitos;
    }

    public void setLstDatosDadoSubCircuitos(ArrayList<VifRural2011> lstDatosDadoSubCircuitos) {
        this.lstDatosDadoSubCircuitos = lstDatosDadoSubCircuitos;
    }

    public ArrayList<VifRural2011> getLstDatosDadoCircuitosDadoSexo() {
        return lstDatosDadoCircuitosDadoSexo;
    }

    public void setLstDatosDadoCircuitosDadoSexo(ArrayList<VifRural2011> lstDatosDadoCircuitosDadoSexo) {
        this.lstDatosDadoCircuitosDadoSexo = lstDatosDadoCircuitosDadoSexo;
    }

    public ArrayList<VifRural2011> getLstDatosDadoSubCircuitosDadoSexo() {
        return lstDatosDadoSubCircuitosDadoSexo;
    }

    public void setLstDatosDadoSubCircuitosDadoSexo(ArrayList<VifRural2011> lstDatosDadoSubCircuitosDadoSexo) {
        this.lstDatosDadoSubCircuitosDadoSexo = lstDatosDadoSubCircuitosDadoSexo;
    }

    

    public CartesianChartModel getLineCircuitos() {
        return lineCircuitos;
    }

    public void setLineCircuitos(CartesianChartModel lineCircuitos) {
        this.lineCircuitos = lineCircuitos;
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

    public CartesianChartModel getLineSubCircuitos() {
        return lineSubCircuitos;
    }

    public void setLineSubCircuitos(CartesianChartModel lineSubCircuitos) {
        this.lineSubCircuitos = lineSubCircuitos;
    }

    public CartesianChartModel getLineSubCircuitos2010() {
        return lineSubCircuitos2010;
    }

    public void setLineSubCircuitos2010(CartesianChartModel lineSubCircuitos2010) {
        this.lineSubCircuitos2010 = lineSubCircuitos2010;
    }

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

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {
        this.init();
    }

    public void graficar() {

        lineCircuitos2010 = graficoDetalleGeneralSexoCircuitos2010();
        lineCircuitos2011 = graficoDetalleGeneralSexoCircuitos2011();
        lineCircuitos2012 = graficoDetalleGeneralSexoCircuitos2012();
        lineSubCircuitos2010 = graficoDetalleGeneralSexoSubCircuitos2010();
        lineSubCircuitos2011 = graficoDetalleGeneralSexoSubCircuitos2011();
        lineSubCircuitos2012 = graficoDetalleGeneralSexoSubCircuitos2012();
    }

    public ControladorCircuitosSexoVictima() {
        this.reinit();
    }

    private CartesianChartModel graficoDetalleGeneralSexoCircuitos2010() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosCircuitos = FVifRural2011.ObtenerDatosDadoAnioCircuitos(2010);
            ChartSeries Circuitos2010 = new ChartSeries();
            Circuitos2010.setLabel("Detalle por Circuitos");
            for (int i = 0; i < lstDatosCircuitos.size(); i++) {
                lstDatosDadoCircuitosDadoSexo = FVifRural2011.ObtenerDatosDadoSexoDadoCircuitoDadoAnio("F", lstDatosCircuitos.get(i).getCircuito(), 2010);
                Circuitos2010.set(lstDatosCircuitos.get(i).getCircuito(), lstDatosDadoCircuitosDadoSexo.size());
            }

            model.addSeries(Circuitos2010);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    private CartesianChartModel graficoDetalleGeneralSexoCircuitos2011() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosCircuitos = FVifRural2011.ObtenerDatosDadoAnioCircuitos(2011);
            ChartSeries Circuitos2011 = new ChartSeries();
            Circuitos2011.setLabel("Detalle por Circuitos");
            for (int i = 0; i < lstDatosCircuitos.size(); i++) {
                lstDatosDadoCircuitosDadoSexo = FVifRural2011.ObtenerDatosDadoSexoDadoCircuitoDadoAnio("F", lstDatosCircuitos.get(i).getCircuito(), 2011);
                Circuitos2011.set(lstDatosCircuitos.get(i).getCircuito(), lstDatosDadoCircuitosDadoSexo.size());
            }

            model.addSeries(Circuitos2011);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    private CartesianChartModel graficoDetalleGeneralSexoCircuitos2012() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosCircuitos = FVifRural2011.ObtenerDatosDadoAnioCircuitos(2012);
            ChartSeries Circuitos2012 = new ChartSeries();
            Circuitos2012.setLabel("Detalle por Circuitos");
            for (int i = 0; i < lstDatosCircuitos.size(); i++) {
                lstDatosDadoCircuitosDadoSexo = FVifRural2011.ObtenerDatosDadoSexoDadoCircuitoDadoAnio("F", lstDatosCircuitos.get(i).getCircuito(), 2012);
                Circuitos2012.set(lstDatosCircuitos.get(i).getCircuito(), lstDatosDadoCircuitosDadoSexo.size());
            }

            model.addSeries(Circuitos2012);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    
    private CartesianChartModel graficoDetalleGeneralSexoSubCircuitos2010() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosSubCircuitos = FVifRural2011.ObtenerDatosDadoAnioSubcircuito(2010);
            ChartSeries SubCircuitos2010 = new ChartSeries();
            SubCircuitos2010.setLabel("Detalle por SubCircuitos");
            for (int i = 0; i < lstDatosSubCircuitos.size(); i++) {
                lstDatosDadoSubCircuitosDadoSexo = FVifRural2011.ObtenerDatosDadoSexoDadoSubcircuitoDadoAnio("F", lstDatosSubCircuitos.get(i).getSubcircuito(), 2010);
                SubCircuitos2010.set(lstDatosSubCircuitos.get(i).getSubcircuito(), lstDatosDadoSubCircuitosDadoSexo.size());
            }

            model.addSeries(SubCircuitos2010);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    
    private CartesianChartModel graficoDetalleGeneralSexoSubCircuitos2011() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosSubCircuitos = FVifRural2011.ObtenerDatosDadoAnioSubcircuito(2011);
            ChartSeries SubCircuitos2011 = new ChartSeries();
            SubCircuitos2011.setLabel("Detalle por SubCircuitos");
            for (int i = 0; i < lstDatosSubCircuitos.size(); i++) {
                lstDatosDadoSubCircuitosDadoSexo = FVifRural2011.ObtenerDatosDadoSexoDadoSubcircuitoDadoAnio("F", lstDatosSubCircuitos.get(i).getSubcircuito(), 2011);
                SubCircuitos2011.set(lstDatosSubCircuitos.get(i).getSubcircuito(), lstDatosDadoSubCircuitosDadoSexo.size());
            }

            model.addSeries(SubCircuitos2011);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    
    private CartesianChartModel graficoDetalleGeneralSexoSubCircuitos2012() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDatosSubCircuitos = FVifRural2011.ObtenerDatosDadoAnioSubcircuito(2012);
            ChartSeries SubCircuitos2012 = new ChartSeries();
            SubCircuitos2012.setLabel("Detalle por SubCircuitos");
            for (int i = 0; i < lstDatosSubCircuitos.size(); i++) {
                lstDatosDadoSubCircuitosDadoSexo = FVifRural2011.ObtenerDatosDadoSexoDadoSubcircuitoDadoAnio("F", lstDatosSubCircuitos.get(i).getSubcircuito(), 2012);
                SubCircuitos2012.set(lstDatosSubCircuitos.get(i).getSubcircuito(), lstDatosDadoSubCircuitosDadoSexo.size());
            }

            model.addSeries(SubCircuitos2012);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    
}
