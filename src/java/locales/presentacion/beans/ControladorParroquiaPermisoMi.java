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
public class ControladorParroquiaPermisoMi {

    private CartesianChartModel lineLocalesParroquias;
    private ArrayList<Locales> lstLocales;
    private ArrayList<Locales> lstLocalesDadoParroquia;
    private ArrayList<Locales> lstLocalesParroquias;
    private ArrayList<Locales> lstLocalesDadoParroquiaSi;
    private ArrayList<Locales> lstLocalesDadoParroquia50Si;
    private ArrayList<Locales> lstLocalesDadoParroquia55Si;
    private ArrayList<Locales> lstLocalesDadoParroquia61Si;
    private ArrayList<Locales> lstLocalesDadoParroquiaNo;
    private ArrayList<Locales> lstLocalesDadoParroquia50No;
    private ArrayList<Locales> lstLocalesDadoParroquia55No;
    private ArrayList<Locales> lstLocalesDadoParroquia61No;
    private ArrayList<Locales> lstLocalesDadoParroquiaNoPresenta;
    private ArrayList<Locales> lstLocalesDadoParroquia50NoPresenta;
    private ArrayList<Locales> lstLocalesDadoParroquia55NoPresenta;
    private ArrayList<Locales> lstLocalesDadoParroquia61NoPresenta;

    public ArrayList<Locales> getLstLocalesDadoParroquia50Si() {
        return lstLocalesDadoParroquia50Si;
    }

    public void setLstLocalesDadoParroquia50Si(ArrayList<Locales> lstLocalesDadoParroquia50Si) {
        this.lstLocalesDadoParroquia50Si = lstLocalesDadoParroquia50Si;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia55Si() {
        return lstLocalesDadoParroquia55Si;
    }

    public void setLstLocalesDadoParroquia55Si(ArrayList<Locales> lstLocalesDadoParroquia55Si) {
        this.lstLocalesDadoParroquia55Si = lstLocalesDadoParroquia55Si;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia61Si() {
        return lstLocalesDadoParroquia61Si;
    }

    public void setLstLocalesDadoParroquia61Si(ArrayList<Locales> lstLocalesDadoParroquia61Si) {
        this.lstLocalesDadoParroquia61Si = lstLocalesDadoParroquia61Si;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia50No() {
        return lstLocalesDadoParroquia50No;
    }

    public void setLstLocalesDadoParroquia50No(ArrayList<Locales> lstLocalesDadoParroquia50No) {
        this.lstLocalesDadoParroquia50No = lstLocalesDadoParroquia50No;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia55No() {
        return lstLocalesDadoParroquia55No;
    }

    public void setLstLocalesDadoParroquia55No(ArrayList<Locales> lstLocalesDadoParroquia55No) {
        this.lstLocalesDadoParroquia55No = lstLocalesDadoParroquia55No;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia61No() {
        return lstLocalesDadoParroquia61No;
    }

    public void setLstLocalesDadoParroquia61No(ArrayList<Locales> lstLocalesDadoParroquia61No) {
        this.lstLocalesDadoParroquia61No = lstLocalesDadoParroquia61No;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia50NoPresenta() {
        return lstLocalesDadoParroquia50NoPresenta;
    }

    public void setLstLocalesDadoParroquia50NoPresenta(ArrayList<Locales> lstLocalesDadoParroquia50NoPresenta) {
        this.lstLocalesDadoParroquia50NoPresenta = lstLocalesDadoParroquia50NoPresenta;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia55NoPresenta() {
        return lstLocalesDadoParroquia55NoPresenta;
    }

    public void setLstLocalesDadoParroquia55NoPresenta(ArrayList<Locales> lstLocalesDadoParroquia55NoPresenta) {
        this.lstLocalesDadoParroquia55NoPresenta = lstLocalesDadoParroquia55NoPresenta;
    }

    public ArrayList<Locales> getLstLocalesDadoParroquia61NoPresenta() {
        return lstLocalesDadoParroquia61NoPresenta;
    }

    public void setLstLocalesDadoParroquia61NoPresenta(ArrayList<Locales> lstLocalesDadoParroquia61NoPresenta) {
        this.lstLocalesDadoParroquia61NoPresenta = lstLocalesDadoParroquia61NoPresenta;
    }

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

    public ControladorParroquiaPermisoMi() {
        this.reinit();
    }

    private CartesianChartModel graficaParroquias() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesParroquias = FLocales.ObtenerDatosParroquia();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si presentan permiso");
            lstLocalesDadoParroquia50Si = FLocales.ObtenerDatosDadoPermisoMiParroquia("Si", 50);
            lstLocalesDadoParroquia55Si = FLocales.ObtenerDatosDadoPermisoMiParroquia("Si", 55);
            lstLocalesDadoParroquia61Si = FLocales.ObtenerDatosDadoPermisoMiParroquia("Si", 61);

            Si.set("Parroquia 55", lstLocalesDadoParroquia55Si.size());
            Si.set("Parroquia 50", lstLocalesDadoParroquia50Si.size());
            Si.set("Parroquia 61", lstLocalesDadoParroquia61Si.size());

            ChartSeries No = new ChartSeries();
            No.setLabel("No cuenta con el permiso");
            lstLocalesDadoParroquia50No = FLocales.ObtenerDatosDadoPermisoMiParroquia("No", 50);
            lstLocalesDadoParroquia55No = FLocales.ObtenerDatosDadoPermisoMiParroquia("No", 55);
            lstLocalesDadoParroquia61No = FLocales.ObtenerDatosDadoPermisoMiParroquia("No", 61);
            No.set("Parroquia 55", lstLocalesDadoParroquia55No.size());
            No.set("Parroquia 50", lstLocalesDadoParroquia50No.size());
            No.set("Parroquia 61", lstLocalesDadoParroquia61No.size());

            ChartSeries NoPresenta = new ChartSeries();
            NoPresenta.setLabel("No Presentan permiso");
            lstLocalesDadoParroquia50NoPresenta = FLocales.ObtenerDatosDadoPermisoMiParroquia("No Presenta", 50);
            lstLocalesDadoParroquia55NoPresenta = FLocales.ObtenerDatosDadoPermisoMiParroquia("No Presenta", 55);
            lstLocalesDadoParroquia61NoPresenta = FLocales.ObtenerDatosDadoPermisoMiParroquia("No Presenta", 61);
            NoPresenta.set("Parroquia 55", lstLocalesDadoParroquia55NoPresenta.size());
            NoPresenta.set("Parroquia 50", lstLocalesDadoParroquia50NoPresenta.size());
            NoPresenta.set("Parroquia 61", lstLocalesDadoParroquia61NoPresenta.size());

            model.addSeries(No);
            model.addSeries(Si);
            model.addSeries(NoPresenta);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
