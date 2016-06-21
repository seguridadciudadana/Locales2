
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
public class CParroquiaPermisoMI {
    
     private ArrayList<FichaLocales> lstParroquias;
   

    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMiSi1;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMiSi2;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMiSi3;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMiSi4;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMiSi5;


    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMiNo1;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMiNo2;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMiNo3;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMiNo4;
    private ArrayList<FichaLocales> lstLocalesDadoParroquiaMiNo5;
    
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

    public CParroquiaPermisoMI() {
        this.reinit();
    }

    
    
        

    public CartesianChartModel getLineLocalesParroquias() {
        return lineLocalesParroquias;
    }

    public void setLineLocalesParroquias(CartesianChartModel lineLocalesParroquias) {
        this.lineLocalesParroquias = lineLocalesParroquias;
    }
    
    

    public ArrayList<FichaLocales> getLstParroquias() {
        return lstParroquias;
    }

    public void setLstParroquias(ArrayList<FichaLocales> lstParroquias) {
        this.lstParroquias = lstParroquias;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMiSi1() {
        return lstLocalesDadoParroquiaMiSi1;
    }

    public void setLstLocalesDadoParroquiaMiSi1(ArrayList<FichaLocales> lstLocalesDadoParroquiaMiSi1) {
        this.lstLocalesDadoParroquiaMiSi1 = lstLocalesDadoParroquiaMiSi1;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMiSi2() {
        return lstLocalesDadoParroquiaMiSi2;
    }

    public void setLstLocalesDadoParroquiaMiSi2(ArrayList<FichaLocales> lstLocalesDadoParroquiaMiSi2) {
        this.lstLocalesDadoParroquiaMiSi2 = lstLocalesDadoParroquiaMiSi2;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMiSi3() {
        return lstLocalesDadoParroquiaMiSi3;
    }

    public void setLstLocalesDadoParroquiaMiSi3(ArrayList<FichaLocales> lstLocalesDadoParroquiaMiSi3) {
        this.lstLocalesDadoParroquiaMiSi3 = lstLocalesDadoParroquiaMiSi3;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMiSi4() {
        return lstLocalesDadoParroquiaMiSi4;
    }

    public void setLstLocalesDadoParroquiaMiSi4(ArrayList<FichaLocales> lstLocalesDadoParroquiaMiSi4) {
        this.lstLocalesDadoParroquiaMiSi4 = lstLocalesDadoParroquiaMiSi4;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMiSi5() {
        return lstLocalesDadoParroquiaMiSi5;
    }

    public void setLstLocalesDadoParroquiaMiSi5(ArrayList<FichaLocales> lstLocalesDadoParroquiaMiSi5) {
        this.lstLocalesDadoParroquiaMiSi5 = lstLocalesDadoParroquiaMiSi5;
    }

   
    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMiNo1() {
        return lstLocalesDadoParroquiaMiNo1;
    }

    public void setLstLocalesDadoParroquiaMiNo1(ArrayList<FichaLocales> lstLocalesDadoParroquiaMiNo1) {
        this.lstLocalesDadoParroquiaMiNo1 = lstLocalesDadoParroquiaMiNo1;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMiNo2() {
        return lstLocalesDadoParroquiaMiNo2;
    }

    public void setLstLocalesDadoParroquiaMiNo2(ArrayList<FichaLocales> lstLocalesDadoParroquiaMiNo2) {
        this.lstLocalesDadoParroquiaMiNo2 = lstLocalesDadoParroquiaMiNo2;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMiNo3() {
        return lstLocalesDadoParroquiaMiNo3;
    }

    public void setLstLocalesDadoParroquiaMiNo3(ArrayList<FichaLocales> lstLocalesDadoParroquiaMiNo3) {
        this.lstLocalesDadoParroquiaMiNo3 = lstLocalesDadoParroquiaMiNo3;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMiNo4() {
        return lstLocalesDadoParroquiaMiNo4;
    }

    public void setLstLocalesDadoParroquiaMiNo4(ArrayList<FichaLocales> lstLocalesDadoParroquiaMiNo4) {
        this.lstLocalesDadoParroquiaMiNo4 = lstLocalesDadoParroquiaMiNo4;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquiaMiNo5() {
        return lstLocalesDadoParroquiaMiNo5;
    }

    public void setLstLocalesDadoParroquiaMiNo5(ArrayList<FichaLocales> lstLocalesDadoParroquiaMiNo5) {
        this.lstLocalesDadoParroquiaMiNo5 = lstLocalesDadoParroquiaMiNo5;
    }
    
    private CartesianChartModel graficaParroquias() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstParroquias = FFichaLocales.ObtenerDatosParroquia();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si presentan permiso");
            lstLocalesDadoParroquiaMiSi1 = FFichaLocales.ObtenerDatosDadoPermisoMiParroquia("SI", 1);
            lstLocalesDadoParroquiaMiSi2 = FFichaLocales.ObtenerDatosDadoPermisoMiParroquia("SI", 2);
            lstLocalesDadoParroquiaMiSi3 = FFichaLocales.ObtenerDatosDadoPermisoMiParroquia("SI", 3);
            lstLocalesDadoParroquiaMiSi4 = FFichaLocales.ObtenerDatosDadoPermisoMiParroquia("SI", 4);
            lstLocalesDadoParroquiaMiSi5 = FFichaLocales.ObtenerDatosDadoPermisoMiParroquia("SI", 5);

            Si.set("VELASCO", lstLocalesDadoParroquiaMiSi1.size());
            Si.set("MALDONADO", lstLocalesDadoParroquiaMiSi2.size());
            Si.set("VELOZ", lstLocalesDadoParroquiaMiSi3.size());
            Si.set("YARUQUIES", lstLocalesDadoParroquiaMiSi4.size());
            Si.set("LIZARZABURU", lstLocalesDadoParroquiaMiSi5.size());

            ChartSeries No = new ChartSeries();
            No.setLabel("No cuenta con el permiso");
            lstLocalesDadoParroquiaMiNo1 = FFichaLocales.ObtenerDatosDadoPermisoMiParroquia("NO", 1);
            lstLocalesDadoParroquiaMiNo2 = FFichaLocales.ObtenerDatosDadoPermisoMiParroquia("NO", 2);
            lstLocalesDadoParroquiaMiNo3 = FFichaLocales.ObtenerDatosDadoPermisoMiParroquia("NO", 3);
            lstLocalesDadoParroquiaMiNo4 = FFichaLocales.ObtenerDatosDadoPermisoMiParroquia("NO", 4);
            lstLocalesDadoParroquiaMiNo5 = FFichaLocales.ObtenerDatosDadoPermisoMiParroquia("NO", 5);

            No.set("VELASCO", lstLocalesDadoParroquiaMiNo1.size());
            No.set("MALDONADO", lstLocalesDadoParroquiaMiNo2.size());
            No.set("VELOZ", lstLocalesDadoParroquiaMiNo3.size());
            No.set("YARUQUIES", lstLocalesDadoParroquiaMiNo4.size());
            No.set("LIZARZABURU", lstLocalesDadoParroquiaMiNo5.size());
            

            model.addSeries(No);
            model.addSeries(Si);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
    
}
