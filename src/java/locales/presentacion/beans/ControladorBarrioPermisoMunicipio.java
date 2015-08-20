/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locales.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import locales.logica.clases.Locales;
import locales.logica.funciones.FLocales;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;





/**
 *
 * @author ICITS SALA5
 */
@ManagedBean
@RequestScoped
public class ControladorBarrioPermisoMunicipio {

    private CartesianChartModel lineLocalesBarrios;
    private ArrayList<Locales> lstLocales;
    private ArrayList<Locales> lstLocalesDadoBarrio;
    private ArrayList<Locales> lstLocalesBarrios;
    private ArrayList<Locales> lstLocalesDadoBarrioSi;
    private ArrayList<Locales> lstLocalesDadoBarrioNo;
    private ArrayList<Locales> lstLocalesDadoBarrioNoPresenta;

    public CartesianChartModel getLineLocalesBarrios() {
        return lineLocalesBarrios;
    }

    public void setLineLocalesBarrios(CartesianChartModel lineLocalesBarrios) {
        this.lineLocalesBarrios = lineLocalesBarrios;
    }

    public ArrayList<Locales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<Locales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public ArrayList<Locales> getLstLocalesDadoBarrio() {
        return lstLocalesDadoBarrio;
    }

    public void setLstLocalesDadoBarrio(ArrayList<Locales> lstLocalesDadoBarrio) {
        this.lstLocalesDadoBarrio = lstLocalesDadoBarrio;
    }

    public ArrayList<Locales> getLstLocalesBarrio() {
        return lstLocalesBarrios;
    }

    public void setLstLocalesBarrio(ArrayList<Locales> lstLocalesBarrio) {
        this.lstLocalesBarrios = lstLocalesBarrio;
    }

    public ArrayList<Locales> getLstLocalesDadoBarrioSi() {
        return lstLocalesDadoBarrioSi;
    }

    public void setLstLocalesDadoBarrioSi(ArrayList<Locales> lstLocalesDadoBarrioSi) {
        this.lstLocalesDadoBarrioSi = lstLocalesDadoBarrioSi;
    }

    public ArrayList<Locales> getLstLocalesDadoBarrioNo() {
        return lstLocalesDadoBarrioNo;
    }

    public void setLstLocalesDadoBarrioNo(ArrayList<Locales> lstLocalesDadoBarrioNo) {
        this.lstLocalesDadoBarrioNo = lstLocalesDadoBarrioNo;
    }

    public ArrayList<Locales> getLstLocalesDadoBarrioNoPresenta() {
        return lstLocalesDadoBarrioNoPresenta;
    }

    public void setLstLocalesDadoBarrioNoPresenta(ArrayList<Locales> lstLocalesDadoBarrioNoPresenta) {
        this.lstLocalesDadoBarrioNoPresenta = lstLocalesDadoBarrioNoPresenta;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesBarrios = graficaBarrios();

    }

    private void reinit() {
        this.init();
    }

    public ControladorBarrioPermisoMunicipio() {
        this.reinit();
    }

    private CartesianChartModel graficaBarrios() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesBarrios = FLocales.ObtenerDatosBarrios();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si");
            for (Locales lstLocalesBarrio : lstLocalesBarrios) {
                lstLocalesDadoBarrioSi = FLocales.ObtenerDatosDadoPermisoMunicipioBarrio("SI", lstLocalesBarrio.getBarrio());
                Si.set(lstLocalesBarrio.getBarrio(), lstLocalesDadoBarrioSi.size());
            }
            ChartSeries No = new ChartSeries();
            No.setLabel("No");
            for (Locales lstLocalesBarrio : lstLocalesBarrios) {
                lstLocalesDadoBarrioNo = FLocales.ObtenerDatosDadoPermisoMunicipioBarrio("NO", lstLocalesBarrio.getBarrio());
                No.set(lstLocalesBarrio.getBarrio(), lstLocalesDadoBarrioNo.size());
            }

            ChartSeries NoPresenta = new ChartSeries();
            NoPresenta.setLabel("No Presenta");
            for (Locales lstLocalesBarrio : lstLocalesBarrios) {
                lstLocalesDadoBarrioNoPresenta = FLocales.ObtenerDatosDadoPermisoMunicipioBarrio("NO PRESENTA", lstLocalesBarrio.getBarrio());
                NoPresenta.set(lstLocalesBarrio.getBarrio(), lstLocalesDadoBarrioNoPresenta.size());
            }

            model.addSeries(No);
            model.addSeries(Si);
            model.addSeries(NoPresenta);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
}
