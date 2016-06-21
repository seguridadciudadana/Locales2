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
public class CParroquiaPermisoLt {
    
     private ArrayList<FichaLocales> lstParroquias;
   

    private ArrayList<FichaLocales> lstLocalesDadoParroquiaLtSi1;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaLtSi2;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaLtSi3;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaLtSi4;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaLtSi5;


    private ArrayList<FichaLocales> lstLocalesDadoParroquiaLtNo1;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaLtNo2;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaLtNo3;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaLtNo4;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaLtNo5;
    
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

    public CParroquiaPermisoLt() {
        this.reinit();
    }

    public ArrayList<FichaLocales> getLstParroquias() {
        return lstParroquias;
    }

    public void setLstParroquias(ArrayList<FichaLocales> lstParroquias) {
        this.lstParroquias = lstParroquias;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaLtSi1() {
        return lstLocalesDadoParroquiaLtSi1;
    }

    public void setLstLocalesDadoParroquiaLtSi1(ArrayList<FichaLocales> lstLocalesDadoParroquiaLtSi1) {
        this.lstLocalesDadoParroquiaLtSi1 = lstLocalesDadoParroquiaLtSi1;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaLtSi2() {
        return lstLocalesDadoParroquiaLtSi2;
    }

    public void setLstLocalesDadoParroquiaLtSi2(ArrayList<FichaLocales> lstLocalesDadoParroquiaLtSi2) {
        this.lstLocalesDadoParroquiaLtSi2 = lstLocalesDadoParroquiaLtSi2;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaLtSi3() {
        return lstLocalesDadoParroquiaLtSi3;
    }

    public void setLstLocalesDadoParroquiaLtSi3(ArrayList<FichaLocales> lstLocalesDadoParroquiaLtSi3) {
        this.lstLocalesDadoParroquiaLtSi3 = lstLocalesDadoParroquiaLtSi3;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaLtSi4() {
        return lstLocalesDadoParroquiaLtSi4;
    }

    public void setLstLocalesDadoParroquiaLtSi4(ArrayList<FichaLocales> lstLocalesDadoParroquiaLtSi4) {
        this.lstLocalesDadoParroquiaLtSi4 = lstLocalesDadoParroquiaLtSi4;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaLtSi5() {
        return lstLocalesDadoParroquiaLtSi5;
    }

    public void setLstLocalesDadoParroquiaLtSi5(ArrayList<FichaLocales> lstLocalesDadoParroquiaLtSi5) {
        this.lstLocalesDadoParroquiaLtSi5 = lstLocalesDadoParroquiaLtSi5;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaLtNo1() {
        return lstLocalesDadoParroquiaLtNo1;
    }

    public void setLstLocalesDadoParroquiaLtNo1(ArrayList<FichaLocales> lstLocalesDadoParroquiaLtNo1) {
        this.lstLocalesDadoParroquiaLtNo1 = lstLocalesDadoParroquiaLtNo1;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaLtNo2() {
        return lstLocalesDadoParroquiaLtNo2;
    }

    public void setLstLocalesDadoParroquiaLtNo2(ArrayList<FichaLocales> lstLocalesDadoParroquiaLtNo2) {
        this.lstLocalesDadoParroquiaLtNo2 = lstLocalesDadoParroquiaLtNo2;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaLtNo3() {
        return lstLocalesDadoParroquiaLtNo3;
    }

    public void setLstLocalesDadoParroquiaLtNo3(ArrayList<FichaLocales> lstLocalesDadoParroquiaLtNo3) {
        this.lstLocalesDadoParroquiaLtNo3 = lstLocalesDadoParroquiaLtNo3;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaLtNo4() {
        return lstLocalesDadoParroquiaLtNo4;
    }

    public void setLstLocalesDadoParroquiaLtNo4(ArrayList<FichaLocales> lstLocalesDadoParroquiaLtNo4) {
        this.lstLocalesDadoParroquiaLtNo4 = lstLocalesDadoParroquiaLtNo4;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaLtNo5() {
        return lstLocalesDadoParroquiaLtNo5;
    }

    public void setLstLocalesDadoParroquiaLtNo5(ArrayList<FichaLocales> lstLocalesDadoParroquiaLtNo5) {
        this.lstLocalesDadoParroquiaLtNo5 = lstLocalesDadoParroquiaLtNo5;
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
            lstLocalesDadoParroquiaLtSi1 = FFichaLocales.ObtenerDatosDadoPermisoLtParroquia("SI", 1);
            lstLocalesDadoParroquiaLtSi2 = FFichaLocales.ObtenerDatosDadoPermisoLtParroquia("SI", 2);
            lstLocalesDadoParroquiaLtSi3 = FFichaLocales.ObtenerDatosDadoPermisoLtParroquia("SI", 3);
            lstLocalesDadoParroquiaLtSi4 = FFichaLocales.ObtenerDatosDadoPermisoLtParroquia("SI", 4);
            lstLocalesDadoParroquiaLtSi5 = FFichaLocales.ObtenerDatosDadoPermisoLtParroquia("SI", 5);

            Si.set("VELASCO", lstLocalesDadoParroquiaLtSi1.size());
            Si.set("MALDONADO", lstLocalesDadoParroquiaLtSi2.size());
            Si.set("VELOZ", lstLocalesDadoParroquiaLtSi3.size());
            Si.set("YARUQUIES", lstLocalesDadoParroquiaLtSi4.size());
            Si.set("LIZARZABURU", lstLocalesDadoParroquiaLtSi5.size());

            ChartSeries No = new ChartSeries();
            No.setLabel("No cuenta con el permiso");
            lstLocalesDadoParroquiaLtNo1 = FFichaLocales.ObtenerDatosDadoPermisoLtParroquia("NO", 1);
            lstLocalesDadoParroquiaLtNo2 = FFichaLocales.ObtenerDatosDadoPermisoLtParroquia("NO", 2);
            lstLocalesDadoParroquiaLtNo3 = FFichaLocales.ObtenerDatosDadoPermisoLtParroquia("NO", 3);
            lstLocalesDadoParroquiaLtNo4 = FFichaLocales.ObtenerDatosDadoPermisoLtParroquia("NO", 4);
            lstLocalesDadoParroquiaLtNo5 = FFichaLocales.ObtenerDatosDadoPermisoLtParroquia("NO", 5);

            No.set("VELASCO", lstLocalesDadoParroquiaLtNo1.size());
            No.set("MALDONADO", lstLocalesDadoParroquiaLtNo2.size());
            No.set("VELOZ", lstLocalesDadoParroquiaLtNo3.size());
            No.set("YARUQUIES", lstLocalesDadoParroquiaLtNo4.size());
            No.set("LIZARZABURU", lstLocalesDadoParroquiaLtNo5.size());
            

            model.addSeries(No);
            model.addSeries(Si);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
}
