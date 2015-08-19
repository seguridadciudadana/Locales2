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
 * @author oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorPermisosMSPCircuito {

    /**
     * Creates a new instance of ControladorPermisosMSPCircuito
     */
    private CartesianChartModel lineLocalesCircuitos;
    private ArrayList<Locales> lstLocales;
    private ArrayList<Locales> lstLocalesDadoCircuito;
    private ArrayList<Locales> lstLocalesCircuito;
    private ArrayList<Locales> lstLocalesDadoCircuitoSi;
    private ArrayList<Locales> lstLocalesDadoCircuitoNo;
    private ArrayList<Locales> lstLocalesDadoCircuitoNoPresenta;

    public CartesianChartModel getLineLocalesCircuitos() {
        return lineLocalesCircuitos;
    }

    public void setLineLocalesCircuitos(CartesianChartModel lineLocalesCircuitos) {
        this.lineLocalesCircuitos = lineLocalesCircuitos;
    }

    public ArrayList<Locales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<Locales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public ArrayList<Locales> getLstLocalesDadoCircuito() {
        return lstLocalesDadoCircuito;
    }

    public void setLstLocalesDadoCircuito(ArrayList<Locales> lstLocalesDadoCircuito) {
        this.lstLocalesDadoCircuito = lstLocalesDadoCircuito;
    }

    public ArrayList<Locales> getLstLocalesCircuito() {
        return lstLocalesCircuito;
    }

    public void setLstLocalesCircuito(ArrayList<Locales> lstLocalesCircuito) {
        this.lstLocalesCircuito = lstLocalesCircuito;
    }

    public ArrayList<Locales> getLstLocalesDadoCircuitoSi() {
        return lstLocalesDadoCircuitoSi;
    }

    public void setLstLocalesDadoCircuitoSi(ArrayList<Locales> lstLocalesDadoCircuitoSi) {
        this.lstLocalesDadoCircuitoSi = lstLocalesDadoCircuitoSi;
    }

    public ArrayList<Locales> getLstLocalesDadoCircuitoNo() {
        return lstLocalesDadoCircuitoNo;
    }

    public void setLstLocalesDadoCircuitoNo(ArrayList<Locales> lstLocalesDadoCircuitoNo) {
        this.lstLocalesDadoCircuitoNo = lstLocalesDadoCircuitoNo;
    }

    public ArrayList<Locales> getLstLocalesDadoCircuitoNoPresenta() {
        return lstLocalesDadoCircuitoNoPresenta;
    }

    public void setLstLocalesDadoCircuitoNoPresenta(ArrayList<Locales> lstLocalesDadoCircuitoNoPresenta) {
        this.lstLocalesDadoCircuitoNoPresenta = lstLocalesDadoCircuitoNoPresenta;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesCircuitos = graficaCircuitos();

    }

    private void reinit() {
        this.init();
    }

    public ControladorPermisosMSPCircuito() {
        this.reinit();
    }
  
    private CartesianChartModel graficaCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstLocalesCircuito = FLocales.ObtenerDatosCircuito();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si");
            for (int i = 0; i < lstLocalesCircuito.size(); i++) {
                lstLocalesDadoCircuitoSi = FLocales.ObtenerDatosDadoPermisoMspCircuito("Si", lstLocalesCircuito.get(i).getCircuito());
                Si.set(lstLocalesCircuito.get(i).getCircuito(), lstLocalesDadoCircuitoSi.size());
            }

            ChartSeries No = new ChartSeries();
            No.setLabel("No");
            for (int i = 0; i < lstLocalesCircuito.size(); i++) {
                lstLocalesDadoCircuitoNo = FLocales.ObtenerDatosDadoPermisoMspCircuito("No", lstLocalesCircuito.get(i).getCircuito());
                No.set(lstLocalesCircuito.get(i).getCircuito(), lstLocalesDadoCircuitoNo.size());
            }

            ChartSeries NoPresenta = new ChartSeries();
            NoPresenta.setLabel("No Presenta");
            for (int i = 0; i < lstLocalesCircuito.size(); i++) {
                lstLocalesDadoCircuitoNoPresenta = FLocales.ObtenerDatosDadoPermisoMspCircuito("No Presenta", lstLocalesCircuito.get(i).getCircuito());
                NoPresenta.set(lstLocalesCircuito.get(i).getCircuito(), lstLocalesDadoCircuitoNoPresenta.size());
            }

            model.addSeries(Si);
            model.addSeries(No);
            model.addSeries(NoPresenta);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

}
