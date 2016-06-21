
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
public class CParroquiaPermisoMds {
    
     private ArrayList<FichaLocales> lstParroquias;
   

    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsSi1;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsSi2;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsSi3;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsSi4;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsSi5;


    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsNo1;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsNo2;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsNo3;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsNo4;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsNo5;
    
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

    public CParroquiaPermisoMds() {
        this.reinit();
    }

    public ArrayList<FichaLocales> getLstParroquias() {
        return lstParroquias;
    }

    public void setLstParroquias(ArrayList<FichaLocales> lstParroquias) {
        this.lstParroquias = lstParroquias;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMdsSi1() {
        return lstLocalesDadoParroquiaMdsSi1;
    }

    public void setLstLocalesDadoParroquiaMdsSi1(ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsSi1) {
        this.lstLocalesDadoParroquiaMdsSi1 = lstLocalesDadoParroquiaMdsSi1;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMdsSi2() {
        return lstLocalesDadoParroquiaMdsSi2;
    }

    public void setLstLocalesDadoParroquiaMdsSi2(ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsSi2) {
        this.lstLocalesDadoParroquiaMdsSi2 = lstLocalesDadoParroquiaMdsSi2;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMdsSi3() {
        return lstLocalesDadoParroquiaMdsSi3;
    }

    public void setLstLocalesDadoParroquiaMdsSi3(ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsSi3) {
        this.lstLocalesDadoParroquiaMdsSi3 = lstLocalesDadoParroquiaMdsSi3;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMdsSi4() {
        return lstLocalesDadoParroquiaMdsSi4;
    }

    public void setLstLocalesDadoParroquiaMdsSi4(ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsSi4) {
        this.lstLocalesDadoParroquiaMdsSi4 = lstLocalesDadoParroquiaMdsSi4;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMdsSi5() {
        return lstLocalesDadoParroquiaMdsSi5;
    }

    public void setLstLocalesDadoParroquiaMdsSi5(ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsSi5) {
        this.lstLocalesDadoParroquiaMdsSi5 = lstLocalesDadoParroquiaMdsSi5;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMdsNo1() {
        return lstLocalesDadoParroquiaMdsNo1;
    }

    public void setLstLocalesDadoParroquiaMdsNo1(ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsNo1) {
        this.lstLocalesDadoParroquiaMdsNo1 = lstLocalesDadoParroquiaMdsNo1;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMdsNo2() {
        return lstLocalesDadoParroquiaMdsNo2;
    }

    public void setLstLocalesDadoParroquiaMdsNo2(ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsNo2) {
        this.lstLocalesDadoParroquiaMdsNo2 = lstLocalesDadoParroquiaMdsNo2;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMdsNo3() {
        return lstLocalesDadoParroquiaMdsNo3;
    }

    public void setLstLocalesDadoParroquiaMdsNo3(ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsNo3) {
        this.lstLocalesDadoParroquiaMdsNo3 = lstLocalesDadoParroquiaMdsNo3;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMdsNo4() {
        return lstLocalesDadoParroquiaMdsNo4;
    }

    public void setLstLocalesDadoParroquiaMdsNo4(ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsNo4) {
        this.lstLocalesDadoParroquiaMdsNo4 = lstLocalesDadoParroquiaMdsNo4;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMdsNo5() {
        return lstLocalesDadoParroquiaMdsNo5;
    }

    public void setLstLocalesDadoParroquiaMdsNo5(ArrayList<FichaLocales> lstLocalesDadoParroquiaMdsNo5) {
        this.lstLocalesDadoParroquiaMdsNo5 = lstLocalesDadoParroquiaMdsNo5;
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
            lstLocalesDadoParroquiaMdsSi1 = FFichaLocales.ObtenerDatosDadoPermisoMdsParroquia("SI", 1);
            lstLocalesDadoParroquiaMdsSi2 = FFichaLocales.ObtenerDatosDadoPermisoMdsParroquia("SI", 2);
            lstLocalesDadoParroquiaMdsSi3 = FFichaLocales.ObtenerDatosDadoPermisoMdsParroquia("SI", 3);
            lstLocalesDadoParroquiaMdsSi4 = FFichaLocales.ObtenerDatosDadoPermisoMdsParroquia("SI", 4);
            lstLocalesDadoParroquiaMdsSi5 = FFichaLocales.ObtenerDatosDadoPermisoMdsParroquia("SI", 5);

            Si.set("VELASCO", lstLocalesDadoParroquiaMdsSi1.size());
            Si.set("MALDONADO", lstLocalesDadoParroquiaMdsSi2.size());
            Si.set("VELOZ", lstLocalesDadoParroquiaMdsSi3.size());
            Si.set("YARUQUIES", lstLocalesDadoParroquiaMdsSi4.size());
            Si.set("LIZARZABURU", lstLocalesDadoParroquiaMdsSi5.size());

            ChartSeries No = new ChartSeries();
            No.setLabel("No cuenta con el permiso");
            lstLocalesDadoParroquiaMdsNo1 = FFichaLocales.ObtenerDatosDadoPermisoMdsParroquia("NO", 1);
            lstLocalesDadoParroquiaMdsNo2 = FFichaLocales.ObtenerDatosDadoPermisoMdsParroquia("NO", 2);
            lstLocalesDadoParroquiaMdsNo3 = FFichaLocales.ObtenerDatosDadoPermisoMdsParroquia("NO", 3);
            lstLocalesDadoParroquiaMdsNo4 = FFichaLocales.ObtenerDatosDadoPermisoMdsParroquia("NO", 4);
            lstLocalesDadoParroquiaMdsNo5 = FFichaLocales.ObtenerDatosDadoPermisoMdsParroquia("NO", 5);

            No.set("VELASCO", lstLocalesDadoParroquiaMdsNo1.size());
            No.set("MALDONADO", lstLocalesDadoParroquiaMdsNo2.size());
            No.set("VELOZ", lstLocalesDadoParroquiaMdsNo3.size());
            No.set("YARUQUIES", lstLocalesDadoParroquiaMdsNo4.size());
            No.set("LIZARZABURU", lstLocalesDadoParroquiaMdsNo5.size());
            

            model.addSeries(No);
            model.addSeries(Si);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    
}
