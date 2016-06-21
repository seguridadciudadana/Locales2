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
public class CParroquiaPermisoMp {
    
     private ArrayList<FichaLocales> lstParroquias;
   

    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMpSi1;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMpSi2;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMpSi3;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMpSi4;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMpSi5;


    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMpNo1;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMpNo2;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMpNo3;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMpNo4;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMpNo5;
    
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

    public CParroquiaPermisoMp() {
        this.reinit();
    }

    public ArrayList<FichaLocales> getLstParroquias() {
        return lstParroquias;
    }

    public void setLstParroquias(ArrayList<FichaLocales> lstParroquias) {
        this.lstParroquias = lstParroquias;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMpSi1() {
        return lstLocalesDadoParroquiaMpSi1;
    }

    public void setLstLocalesDadoParroquiaMpSi1(ArrayList<FichaLocales> lstLocalesDadoParroquiaMpSi1) {
        this.lstLocalesDadoParroquiaMpSi1 = lstLocalesDadoParroquiaMpSi1;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMpSi2() {
        return lstLocalesDadoParroquiaMpSi2;
    }

    public void setLstLocalesDadoParroquiaMpSi2(ArrayList<FichaLocales> lstLocalesDadoParroquiaMpSi2) {
        this.lstLocalesDadoParroquiaMpSi2 = lstLocalesDadoParroquiaMpSi2;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMpSi3() {
        return lstLocalesDadoParroquiaMpSi3;
    }

    public void setLstLocalesDadoParroquiaMpSi3(ArrayList<FichaLocales> lstLocalesDadoParroquiaMpSi3) {
        this.lstLocalesDadoParroquiaMpSi3 = lstLocalesDadoParroquiaMpSi3;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMpSi4() {
        return lstLocalesDadoParroquiaMpSi4;
    }

    public void setLstLocalesDadoParroquiaMpSi4(ArrayList<FichaLocales> lstLocalesDadoParroquiaMpSi4) {
        this.lstLocalesDadoParroquiaMpSi4 = lstLocalesDadoParroquiaMpSi4;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMpSi5() {
        return lstLocalesDadoParroquiaMpSi5;
    }

    public void setLstLocalesDadoParroquiaMpSi5(ArrayList<FichaLocales> lstLocalesDadoParroquiaMpSi5) {
        this.lstLocalesDadoParroquiaMpSi5 = lstLocalesDadoParroquiaMpSi5;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMpNo1() {
        return lstLocalesDadoParroquiaMpNo1;
    }

    public void setLstLocalesDadoParroquiaMpNo1(ArrayList<FichaLocales> lstLocalesDadoParroquiaMpNo1) {
        this.lstLocalesDadoParroquiaMpNo1 = lstLocalesDadoParroquiaMpNo1;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMpNo2() {
        return lstLocalesDadoParroquiaMpNo2;
    }

    public void setLstLocalesDadoParroquiaMpNo2(ArrayList<FichaLocales> lstLocalesDadoParroquiaMpNo2) {
        this.lstLocalesDadoParroquiaMpNo2 = lstLocalesDadoParroquiaMpNo2;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMpNo3() {
        return lstLocalesDadoParroquiaMpNo3;
    }

    public void setLstLocalesDadoParroquiaMpNo3(ArrayList<FichaLocales> lstLocalesDadoParroquiaMpNo3) {
        this.lstLocalesDadoParroquiaMpNo3 = lstLocalesDadoParroquiaMpNo3;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMpNo4() {
        return lstLocalesDadoParroquiaMpNo4;
    }

    public void setLstLocalesDadoParroquiaMpNo4(ArrayList<FichaLocales> lstLocalesDadoParroquiaMpNo4) {
        this.lstLocalesDadoParroquiaMpNo4 = lstLocalesDadoParroquiaMpNo4;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMPNo5() {
        return lstLocalesDadoParroquiaMpNo5;
    }

    public void setLstLocalesDadoParroquiaMPNo5(ArrayList<FichaLocales> lstLocalesDadoParroquiaMPNo5) {
        this.lstLocalesDadoParroquiaMpNo5 = lstLocalesDadoParroquiaMPNo5;
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
            lstLocalesDadoParroquiaMpSi1 = FFichaLocales.ObtenerDatosDadoPermisoMunicipioParroquia("SI", 1);
            lstLocalesDadoParroquiaMpSi2 = FFichaLocales.ObtenerDatosDadoPermisoMunicipioParroquia("SI", 2);
            lstLocalesDadoParroquiaMpSi3 = FFichaLocales.ObtenerDatosDadoPermisoMunicipioParroquia("SI", 3);
            lstLocalesDadoParroquiaMpSi4 = FFichaLocales.ObtenerDatosDadoPermisoMunicipioParroquia("SI", 4);
            lstLocalesDadoParroquiaMpSi5 = FFichaLocales.ObtenerDatosDadoPermisoMunicipioParroquia("SI", 5);

            Si.set("VELASCO", lstLocalesDadoParroquiaMpSi1.size());
            Si.set("MALDONADO", lstLocalesDadoParroquiaMpSi2.size());
            Si.set("VELOZ", lstLocalesDadoParroquiaMpSi3.size());
            Si.set("YARUQUIES", lstLocalesDadoParroquiaMpSi4.size());
            Si.set("LIZARZABURU", lstLocalesDadoParroquiaMpSi5.size());

            ChartSeries No = new ChartSeries();
            No.setLabel("No cuenta con el permiso");
            lstLocalesDadoParroquiaMpNo1 = FFichaLocales.ObtenerDatosDadoPermisoMunicipioParroquia("NO", 1);
            lstLocalesDadoParroquiaMpNo2 = FFichaLocales.ObtenerDatosDadoPermisoMunicipioParroquia("NO", 2);
            lstLocalesDadoParroquiaMpNo3 = FFichaLocales.ObtenerDatosDadoPermisoMunicipioParroquia("NO", 3);
            lstLocalesDadoParroquiaMpNo4 = FFichaLocales.ObtenerDatosDadoPermisoMunicipioParroquia("NO", 4);
            lstLocalesDadoParroquiaMpNo5 = FFichaLocales.ObtenerDatosDadoPermisoMunicipioParroquia("NO", 5);

            No.set("VELASCO", lstLocalesDadoParroquiaMpNo1.size());
            No.set("MALDONADO", lstLocalesDadoParroquiaMpNo2.size());
            No.set("VELOZ", lstLocalesDadoParroquiaMpNo3.size());
            No.set("YARUQUIES", lstLocalesDadoParroquiaMpNo4.size());
            No.set("LIZARZABURU", lstLocalesDadoParroquiaMpNo5.size());
            

            model.addSeries(No);
            model.addSeries(Si);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
}
