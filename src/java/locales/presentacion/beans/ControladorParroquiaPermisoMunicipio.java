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
public class ControladorParroquiaPermisoMunicipio {
    private CartesianChartModel lineLocalesParroquias;
    private ArrayList<Locales> lstLocales;
    private ArrayList<Locales> lstLocalesDadoParroquia;
    private ArrayList<Locales> lstLocalesParroquias;
    private ArrayList<Locales> lstLocalesDadoParroquiaSi;
    private ArrayList<Locales> lstLocalesDadoParroquiaNo;
    private ArrayList<Locales> lstLocalesDadoParroquiaNoPresenta;

    public CartesianChartModel getLineLocalesParroquias() {
        return lineLocalesParroquias;
    }

    public void setLineLocalesParroquias(CartesianChartModel lineLocalesParroquias) {
        this.lineLocalesParroquias = lineLocalesParroquias;
    }

    public ArrayList<Locales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<Locales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia() {
        return lstLocalesDadoParroquia;
    }

    public void setLstLocalesDadoParroquia(ArrayList<Locales> lstLocalesDadoParroquia) {
        this.lstLocalesDadoParroquia = lstLocalesDadoParroquia;
    }

    public ArrayList<Locales> getLstLocalesParroquias() {
        return lstLocalesParroquias;
    }

    public void setLstLocalesParroquias(ArrayList<Locales> lstLocalesParroquias) {
        this.lstLocalesParroquias = lstLocalesParroquias;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquiaSi() {
        return lstLocalesDadoParroquiaSi;
    }

    public void setLstLocalesDadoParroquiaSi(ArrayList<Locales> lstLocalesDadoParroquiaSi) {
        this.lstLocalesDadoParroquiaSi = lstLocalesDadoParroquiaSi;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquiaNo() {
        return lstLocalesDadoParroquiaNo;
    }

    public void setLstLocalesDadoParroquiaNo(ArrayList<Locales> lstLocalesDadoParroquiaNo) {
        this.lstLocalesDadoParroquiaNo = lstLocalesDadoParroquiaNo;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquiaNoPresenta() {
        return lstLocalesDadoParroquiaNoPresenta;
    }

    public void setLstLocalesDadoParroquiaNoPresenta(ArrayList<Locales> lstLocalesDadoParroquiaNoPresenta) {
        this.lstLocalesDadoParroquiaNoPresenta = lstLocalesDadoParroquiaNoPresenta;
    }
    
    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesParroquias = graficaParroquias();

    }

    private void reinit() {
        this.init();
    }

    public ControladorParroquiaPermisoMunicipio() {
        this.reinit();
    }

    private CartesianChartModel graficaParroquias() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesParroquias = FLocales.ObtenerDatosParroquia();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si");
            for (Locales lstLocalesParroquia : lstLocalesParroquias) {
                lstLocalesDadoParroquiaSi = FLocales.ObtenerDatosDadoPermisoMunicipioParroquia("Si", lstLocalesParroquia.getParroquia());
                Si.set(lstLocalesParroquia.getParroquia(), lstLocalesDadoParroquiaSi.size());
            }
            ChartSeries No = new ChartSeries();
            No.setLabel("No");
            for (Locales lstLocalesParroquia : lstLocalesParroquias) {
                lstLocalesDadoParroquiaNo = FLocales.ObtenerDatosDadoPermisoMunicipioParroquia("No", lstLocalesParroquia.getParroquia());
                No.set(lstLocalesParroquia.getParroquia(), lstLocalesDadoParroquiaNo.size());
            }

            ChartSeries NoPresenta = new ChartSeries();
            NoPresenta.setLabel("No Presenta");
            for (Locales lstLocalesParroquia : lstLocalesParroquias) {
                lstLocalesDadoParroquiaNoPresenta = FLocales.ObtenerDatosDadoPermisoMunicipioParroquia("No Presenta", lstLocalesParroquia.getParroquia());
                NoPresenta.set(lstLocalesParroquia.getBarrio(), lstLocalesDadoParroquiaNoPresenta.size());
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
