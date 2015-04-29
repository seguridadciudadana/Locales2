/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.Vif_2010;
import geoportal.logica.funciones.FVif_2010;
import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class GraficoCircuitoControlador implements Serializable {
    private ArrayList<Vif_2010> lstDatosC;
    private ArrayList<Vif_2010> lstDatosDadoC;
    private CartesianChartModel lineModel2;
    
    
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
    
    public GraficoCircuitoControlador() {
        this.reinit();
    }

    private void reinit() {
        this.lstDatosC = new ArrayList<Vif_2010>();
        this.lstDatosDadoC = new ArrayList<Vif_2010>();
        this.graficarCircuito();

    }
    
    @PostConstruct
    public void graficarCircuito() {

        lineModel2 = new CartesianChartModel();
        //lineModel2 = new CartesianChartModel();

        try {
            //lstNodoB.clear();
            lstDatosC = FVif_2010.ObtenerDatosCircuito();
            //lstNodoBuscar = FNodo1.obtenerTodos();
            final ChartSeries Circuito = new ChartSeries("Circuito");
            for (int x = 0; x < lstDatosC.size(); x++) {
                lstDatosDadoC = FVif_2010.ObtenerDatosDadoCircuito(lstDatosC.get(x).getCircuito());
                Circuito.set(lstDatosC.get(x).getCircuito(), lstDatosDadoC.size());

            }
            /*final ChartSeries humedad2 = new ChartSeries("Humedad2");
             for (Nodo1 pr : lstNodoBuscar) {
             humedad2.set(pr.getFecha(), Double.parseDouble(pr.getHumedad2()));
             }*/
            lineModel2.addSeries(Circuito);
                       
            //lineModel1.addSeries(humedad2);
        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }

    }

    public CartesianChartModel getGraficarCircuito() {
        return lineModel2;
    }

    public void setLineModel2(CartesianChartModel lineModel2) {
        this.lineModel2 = lineModel2;
    }
}
