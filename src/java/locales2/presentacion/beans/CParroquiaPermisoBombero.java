package locales2.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import locales2.logica.clases.FichaLocales;
import locales2.logica.funciones.FFichaLocales;

import vif.logica.clases.Circuito;
import vif.logica.funciones.FCircuito;

import vif.logica.clases.Subcircuito;
import vif.logica.funciones.FSubcircuito;

import locales.logica.funciones.FLocales;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

@ManagedBean
@RequestScoped
public class CParroquiaPermisoBombero {

    private ArrayList<FichaLocales> lstParroquias;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosSi;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosNo;

    private ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosSi1;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosSi2;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosSi3;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosSi4;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosSi5;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosSi6;

    private ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosNo1;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosNo2;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosNo3;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosNo4;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosNo5;

    private CartesianChartModel lineLocalesParroquias;

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

    public CParroquiaPermisoBombero() {
        this.reinit();
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaBomberosNo1() {
        return lstLocalesDadoParroquiaBomberosNo1;
    }

    public void setLstLocalesDadoParroquiaBomberosNo1(ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosNo1) {
        this.lstLocalesDadoParroquiaBomberosNo1 = lstLocalesDadoParroquiaBomberosNo1;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaBomberosNo2() {
        return lstLocalesDadoParroquiaBomberosNo2;
    }

    public void setLstLocalesDadoParroquiaBomberosNo2(ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosNo2) {
        this.lstLocalesDadoParroquiaBomberosNo2 = lstLocalesDadoParroquiaBomberosNo2;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaBomberosNo3() {
        return lstLocalesDadoParroquiaBomberosNo3;
    }

    public void setLstLocalesDadoParroquiaBomberosNo3(ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosNo3) {
        this.lstLocalesDadoParroquiaBomberosNo3 = lstLocalesDadoParroquiaBomberosNo3;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaBomberosNo4() {
        return lstLocalesDadoParroquiaBomberosNo4;
    }

    public void setLstLocalesDadoParroquiaBomberosNo4(ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosNo4) {
        this.lstLocalesDadoParroquiaBomberosNo4 = lstLocalesDadoParroquiaBomberosNo4;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaBomberosNo5() {
        return lstLocalesDadoParroquiaBomberosNo5;
    }

    public void setLstLocalesDadoParroquiaBomberosNo5(ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosNo5) {
        this.lstLocalesDadoParroquiaBomberosNo5 = lstLocalesDadoParroquiaBomberosNo5;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaBomberosSi1() {
        return lstLocalesDadoParroquiaBomberosSi1;
    }

    public void setLstLocalesDadoParroquiaBomberosSi1(ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosSi1) {
        this.lstLocalesDadoParroquiaBomberosSi1 = lstLocalesDadoParroquiaBomberosSi1;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaBomberosSi2() {
        return lstLocalesDadoParroquiaBomberosSi2;
    }

    public void setLstLocalesDadoParroquiaBomberosSi2(ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosSi2) {
        this.lstLocalesDadoParroquiaBomberosSi2 = lstLocalesDadoParroquiaBomberosSi2;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaBomberosSi3() {
        return lstLocalesDadoParroquiaBomberosSi3;
    }

    public void setLstLocalesDadoParroquiaBomberosSi3(ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosSi3) {
        this.lstLocalesDadoParroquiaBomberosSi3 = lstLocalesDadoParroquiaBomberosSi3;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaBomberosSi4() {
        return lstLocalesDadoParroquiaBomberosSi4;
    }

    public void setLstLocalesDadoParroquiaBomberosSi4(ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosSi4) {
        this.lstLocalesDadoParroquiaBomberosSi4 = lstLocalesDadoParroquiaBomberosSi4;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaBomberosSi5() {
        return lstLocalesDadoParroquiaBomberosSi5;
    }

    public void setLstLocalesDadoParroquiaBomberosSi5(ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosSi5) {
        this.lstLocalesDadoParroquiaBomberosSi5 = lstLocalesDadoParroquiaBomberosSi5;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaBomberosSi6() {
        return lstLocalesDadoParroquiaBomberosSi6;
    }

    public void setLstLocalesDadoParroquiaBomberosSi6(ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosSi6) {
        this.lstLocalesDadoParroquiaBomberosSi6 = lstLocalesDadoParroquiaBomberosSi6;
    }

    public ArrayList<FichaLocales> getLstParroquias() {
        return lstParroquias;
    }

    public void setLstParroquias(ArrayList<FichaLocales> lstParroquias) {
        this.lstParroquias = lstParroquias;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaBomberosSi() {
        return lstLocalesDadoParroquiaBomberosSi;
    }

    public void setLstLocalesDadoParroquiaBomberosSi(ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosSi) {
        this.lstLocalesDadoParroquiaBomberosSi = lstLocalesDadoParroquiaBomberosSi;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaBomberosNo() {
        return lstLocalesDadoParroquiaBomberosNo;
    }

    public void setLstLocalesDadoParroquiaBomberosNo(ArrayList<FichaLocales> lstLocalesDadoParroquiaBomberosNo) {
        this.lstLocalesDadoParroquiaBomberosNo = lstLocalesDadoParroquiaBomberosNo;
    }

    public CartesianChartModel getLineLocalesParroquias() {
        return lineLocalesParroquias;
    }

    public void setLineLocalesParroquias(CartesianChartModel lineLocalesParroquias) {
        this.lineLocalesParroquias = lineLocalesParroquias;
    }

    private CartesianChartModel graficaParroquias() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstParroquias = FFichaLocales.ObtenerDatosParroquia();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si presentan permiso");
            lstLocalesDadoParroquiaBomberosSi1 = FFichaLocales.ObtenerDatosDadoPermisoBomberosParroquia("SI", 1);
            lstLocalesDadoParroquiaBomberosSi2 = FFichaLocales.ObtenerDatosDadoPermisoBomberosParroquia("SI", 2);
            lstLocalesDadoParroquiaBomberosSi3 = FFichaLocales.ObtenerDatosDadoPermisoBomberosParroquia("SI", 3);
            lstLocalesDadoParroquiaBomberosSi4 = FFichaLocales.ObtenerDatosDadoPermisoBomberosParroquia("SI", 4);
            lstLocalesDadoParroquiaBomberosSi5 = FFichaLocales.ObtenerDatosDadoPermisoBomberosParroquia("SI", 5);

            Si.set("VELASCO", lstLocalesDadoParroquiaBomberosSi1.size());
            Si.set("MALDONADO", lstLocalesDadoParroquiaBomberosSi2.size());
            Si.set("VELOZ", lstLocalesDadoParroquiaBomberosSi3.size());
            Si.set("YARUQUIES", lstLocalesDadoParroquiaBomberosSi4.size());
            Si.set("LIZARZABURU", lstLocalesDadoParroquiaBomberosSi5.size());

            ChartSeries No = new ChartSeries();
            No.setLabel("No cuenta con el permiso");
            lstLocalesDadoParroquiaBomberosNo1 = FFichaLocales.ObtenerDatosDadoPermisoBomberosParroquia("NO", 1);
            lstLocalesDadoParroquiaBomberosNo2 = FFichaLocales.ObtenerDatosDadoPermisoBomberosParroquia("NO", 2);
            lstLocalesDadoParroquiaBomberosNo3 = FFichaLocales.ObtenerDatosDadoPermisoBomberosParroquia("NO", 3);
            lstLocalesDadoParroquiaBomberosNo4 = FFichaLocales.ObtenerDatosDadoPermisoBomberosParroquia("NO", 4);
            lstLocalesDadoParroquiaBomberosNo5 = FFichaLocales.ObtenerDatosDadoPermisoBomberosParroquia("NO", 5);

            No.set("VELASCO", lstLocalesDadoParroquiaBomberosNo1.size());
            No.set("MALDONADO", lstLocalesDadoParroquiaBomberosNo2.size());
            No.set("VELOZ", lstLocalesDadoParroquiaBomberosNo3.size());
            No.set("YARUQUIES", lstLocalesDadoParroquiaBomberosNo4.size());
            No.set("LIZARZABURU", lstLocalesDadoParroquiaBomberosNo5.size());
            

            model.addSeries(No);
            model.addSeries(Si);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }

}
