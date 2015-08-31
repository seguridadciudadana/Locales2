/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import geoportal.logica.clases.DenunciasPj;
import geoportal.logica.funciones.FDenunciasPj;
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
public class DenunciasPjControladorRangoHoras {

    /**
     * Creates a new instance of DenunciasPjControladorRangoHoras
     */
    private CartesianChartModel horasGrafico2014;
    private CartesianChartModel horasGrafico2015;
    private ArrayList<DenunciasPj> lstDatosRangoHoras;
    private ArrayList<DenunciasPj> lstDatosDadoAnioRangoHoras;

    public CartesianChartModel getHorasGrafico2014() {
        return horasGrafico2014;
    }

    public void setHorasGrafico2014(CartesianChartModel horasGrafico2014) {
        this.horasGrafico2014 = horasGrafico2014;
    }

    public CartesianChartModel getHorasGrafico2015() {
        return horasGrafico2015;
    }

    public void setHorasGrafico2015(CartesianChartModel horasGrafico2015) {
        this.horasGrafico2015 = horasGrafico2015;
    }

    public ArrayList<DenunciasPj> getLstDatosRangoHoras() {
        return lstDatosRangoHoras;
    }

    public void setLstDatosRangoHoras(ArrayList<DenunciasPj> lstDatosRangoHoras) {
        this.lstDatosRangoHoras = lstDatosRangoHoras;
    }

    public ArrayList<DenunciasPj> getLstDatosDadoAnioRangoHoras() {
        return lstDatosDadoAnioRangoHoras;
    }

    public void setLstDatosDadoAnioRangoHoras(ArrayList<DenunciasPj> lstDatosDadoAnioRangoHoras) {
        this.lstDatosDadoAnioRangoHoras = lstDatosDadoAnioRangoHoras;
    }
    
    
    public DenunciasPjControladorRangoHoras() {
        reinit();
    }
    
    public void graficar() {
        horasGrafico2014 = initCategoryHoras2014();
        horasGrafico2015 = initCategoryHoras2015();

    }

    @PostConstruct
    public void init() {
        graficar();
    }

    private void reinit() {

        this.lstDatosRangoHoras = new ArrayList<DenunciasPj>();
        this.init();

    }

    private CartesianChartModel initCategoryHoras2014() {

        CartesianChartModel model = new CartesianChartModel();

        try {

            lstDatosRangoHoras = FDenunciasPj.ObtenerDatosRangoHora();
            ChartSeries horas = new ChartSeries();
           horas.setLabel("Hora");
            for (DenunciasPj lstDatosP1 : lstDatosRangoHoras) {
                lstDatosDadoAnioRangoHoras = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioRangoHora(2014, lstDatosP1.getRango_hora());
                horas.set(lstDatosP1.getRango_hora(), lstDatosDadoAnioRangoHoras.size());
            }
            model.addSeries(horas);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
     private CartesianChartModel initCategoryHoras2015() {

        CartesianChartModel model = new CartesianChartModel();

        try {

            lstDatosRangoHoras = FDenunciasPj.ObtenerDatosRangoHora();
            ChartSeries horas = new ChartSeries();
           horas.setLabel("Hora");
            for (DenunciasPj lstDatosP1 : lstDatosRangoHoras) {
                lstDatosDadoAnioRangoHoras = FDenunciasPj.ObtenerDatosDenunciasPjDadoAnioRangoHora(2015, lstDatosP1.getRango_hora());
                horas.set(lstDatosP1.getRango_hora(), lstDatosDadoAnioRangoHoras.size());
            }
            model.addSeries(horas);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
}
