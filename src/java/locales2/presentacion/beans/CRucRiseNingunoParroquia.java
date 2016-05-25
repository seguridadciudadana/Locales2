
package locales2.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import locales2.logica.clases.FichaLocales;
import locales2.logica.funciones.FFichaLocales;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;


@ManagedBean
@RequestScoped

public class CRucRiseNingunoParroquia {
    
     private CartesianChartModel lineLocalesParroquias;
     private ArrayList<FichaLocales> lstLocalesParroquias;
     
    private ArrayList<FichaLocales>  lstLocalesDadoParroquia1RUC;
    private ArrayList<FichaLocales>  lstLocalesDadoParroquia1RISE;
    private ArrayList<FichaLocales>  lstLocalesDadoParroquia1NINGUNO;
    
    private ArrayList<FichaLocales>  lstLocalesDadoParroquia2RUC;
    private ArrayList<FichaLocales>  lstLocalesDadoParroquia2RISE;
    private ArrayList<FichaLocales>  lstLocalesDadoParroquia2NINGUNO;
    
    private ArrayList<FichaLocales>  lstLocalesDadoParroquia3RUC;
    private ArrayList<FichaLocales>  lstLocalesDadoParroquia3RISE;
    private ArrayList<FichaLocales>  lstLocalesDadoParroquia3NINGUNO;
    
    private ArrayList<FichaLocales>  lstLocalesDadoParroquia4RUC;
    private ArrayList<FichaLocales>  lstLocalesDadoParroquia4RISE;
    private ArrayList<FichaLocales>  lstLocalesDadoParroquia4NINGUNO;
    
    private ArrayList<FichaLocales>  lstLocalesDadoParroquia5RUC;
    private ArrayList<FichaLocales>  lstLocalesDadoParroquia5RISE;
    private ArrayList<FichaLocales>  lstLocalesDadoParroquia5NINGUNO;

    public CartesianChartModel getLineLocalesParroquias() {
        return lineLocalesParroquias;
    }

    public void setLineLocalesParroquias(CartesianChartModel lineLocalesParroquias) {
        this.lineLocalesParroquias = lineLocalesParroquias;
    }

    public ArrayList<FichaLocales> getLstLocalesParroquias() {
        return lstLocalesParroquias;
    }

    public void setLstLocalesParroquias(ArrayList<FichaLocales> lstLocalesParroquias) {
        this.lstLocalesParroquias = lstLocalesParroquias;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquia1RUC() {
        return lstLocalesDadoParroquia1RUC;
    }

    public void setLstLocalesDadoParroquia1RUC(ArrayList<FichaLocales> lstLocalesDadoParroquia1RUC) {
        this.lstLocalesDadoParroquia1RUC = lstLocalesDadoParroquia1RUC;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquia1RISE() {
        return lstLocalesDadoParroquia1RISE;
    }

    public void setLstLocalesDadoParroquia1RISE(ArrayList<FichaLocales> lstLocalesDadoParroquia1RISE) {
        this.lstLocalesDadoParroquia1RISE = lstLocalesDadoParroquia1RISE;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquia1NINGUNO() {
        return lstLocalesDadoParroquia1NINGUNO;
    }

    public void setLstLocalesDadoParroquia1NINGUNO(ArrayList<FichaLocales> lstLocalesDadoParroquia1NINGUNO) {
        this.lstLocalesDadoParroquia1NINGUNO = lstLocalesDadoParroquia1NINGUNO;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquia2RUC() {
        return lstLocalesDadoParroquia2RUC;
    }

    public void setLstLocalesDadoParroquia2RUC(ArrayList<FichaLocales> lstLocalesDadoParroquia2RUC) {
        this.lstLocalesDadoParroquia2RUC = lstLocalesDadoParroquia2RUC;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquia2RISE() {
        return lstLocalesDadoParroquia2RISE;
    }

    public void setLstLocalesDadoParroquia2RISE(ArrayList<FichaLocales> lstLocalesDadoParroquia2RISE) {
        this.lstLocalesDadoParroquia2RISE = lstLocalesDadoParroquia2RISE;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquia2NINGUNO() {
        return lstLocalesDadoParroquia2NINGUNO;
    }

    public void setLstLocalesDadoParroquia2NINGUNO(ArrayList<FichaLocales> lstLocalesDadoParroquia2NINGUNO) {
        this.lstLocalesDadoParroquia2NINGUNO = lstLocalesDadoParroquia2NINGUNO;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquia3RUC() {
        return lstLocalesDadoParroquia3RUC;
    }

    public void setLstLocalesDadoParroquia3RUC(ArrayList<FichaLocales> lstLocalesDadoParroquia3RUC) {
        this.lstLocalesDadoParroquia3RUC = lstLocalesDadoParroquia3RUC;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquia3RISE() {
        return lstLocalesDadoParroquia3RISE;
    }

    public void setLstLocalesDadoParroquia3RISE(ArrayList<FichaLocales> lstLocalesDadoParroquia3RISE) {
        this.lstLocalesDadoParroquia3RISE = lstLocalesDadoParroquia3RISE;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquia3NINGUNO() {
        return lstLocalesDadoParroquia3NINGUNO;
    }

    public void setLstLocalesDadoParroquia3NINGUNO(ArrayList<FichaLocales> lstLocalesDadoParroquia3NINGUNO) {
        this.lstLocalesDadoParroquia3NINGUNO = lstLocalesDadoParroquia3NINGUNO;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquia4RUC() {
        return lstLocalesDadoParroquia4RUC;
    }

    public void setLstLocalesDadoParroquia4RUC(ArrayList<FichaLocales> lstLocalesDadoParroquia4RUC) {
        this.lstLocalesDadoParroquia4RUC = lstLocalesDadoParroquia4RUC;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquia4RISE() {
        return lstLocalesDadoParroquia4RISE;
    }

    public void setLstLocalesDadoParroquia4RISE(ArrayList<FichaLocales> lstLocalesDadoParroquia4RISE) {
        this.lstLocalesDadoParroquia4RISE = lstLocalesDadoParroquia4RISE;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquia4NINGUNO() {
        return lstLocalesDadoParroquia4NINGUNO;
    }

    public void setLstLocalesDadoParroquia4NINGUNO(ArrayList<FichaLocales> lstLocalesDadoParroquia4NINGUNO) {
        this.lstLocalesDadoParroquia4NINGUNO = lstLocalesDadoParroquia4NINGUNO;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquia5RUC() {
        return lstLocalesDadoParroquia5RUC;
    }

    public void setLstLocalesDadoParroquia5RUC(ArrayList<FichaLocales> lstLocalesDadoParroquia5RUC) {
        this.lstLocalesDadoParroquia5RUC = lstLocalesDadoParroquia5RUC;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquia5RISE() {
        return lstLocalesDadoParroquia5RISE;
    }

    public void setLstLocalesDadoParroquia5RISE(ArrayList<FichaLocales> lstLocalesDadoParroquia5RISE) {
        this.lstLocalesDadoParroquia5RISE = lstLocalesDadoParroquia5RISE;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoParroquia5NINGUNO() {
        return lstLocalesDadoParroquia5NINGUNO;
    }

    public void setLstLocalesDadoParroquia5NINGUNO(ArrayList<FichaLocales> lstLocalesDadoParroquia5NINGUNO) {
        this.lstLocalesDadoParroquia5NINGUNO = lstLocalesDadoParroquia5NINGUNO;
    }

    public CRucRiseNingunoParroquia() {
        this.reinit();
    }
    
    private void reinit() {
        this.init();
    }
    
    @PostConstruct
    public void init() {
        graficar();
    }
 public void graficar() {
        this.lineLocalesParroquias = graficaParroquias();

    }

  private CartesianChartModel graficaParroquias() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesParroquias = FFichaLocales.ObtenerDatosParroquia();
            ChartSeries Ruc = new ChartSeries();
            Ruc.setLabel("Presentan RUC");
            lstLocalesDadoParroquia1RUC = FFichaLocales.ObtenerDatosDadoRucoRiseParroquias("RUC", 1);
            lstLocalesDadoParroquia2RUC = FFichaLocales.ObtenerDatosDadoRucoRiseParroquias("RUC", 2);
            lstLocalesDadoParroquia3RUC = FFichaLocales.ObtenerDatosDadoRucoRiseParroquias("RUC", 3);
            lstLocalesDadoParroquia4RUC = FFichaLocales.ObtenerDatosDadoRucoRiseParroquias("RUC", 4);
            lstLocalesDadoParroquia5RUC = FFichaLocales.ObtenerDatosDadoRucoRiseParroquias("RUC", 5);

            Ruc.set("VELASCO 1", lstLocalesDadoParroquia1RUC.size());
            Ruc.set("MALDONADO 2", lstLocalesDadoParroquia2RUC.size());
            Ruc.set("VELOZ 3", lstLocalesDadoParroquia3RUC.size());
            Ruc.set("YARUQUIES 4", lstLocalesDadoParroquia4RUC.size());
            Ruc.set("LIZARZABURU 5", lstLocalesDadoParroquia5RUC.size());

            ChartSeries Rise = new ChartSeries();
            Rise.setLabel("Presentan RISE");
            lstLocalesDadoParroquia1RISE = FFichaLocales.ObtenerDatosDadoRucoRiseParroquias("RISE", 1);
            lstLocalesDadoParroquia2RISE = FFichaLocales.ObtenerDatosDadoRucoRiseParroquias("RISE", 2);
            lstLocalesDadoParroquia3RISE = FFichaLocales.ObtenerDatosDadoRucoRiseParroquias("RISE", 3);
            lstLocalesDadoParroquia4RISE = FFichaLocales.ObtenerDatosDadoRucoRiseParroquias("RISE", 4);
            lstLocalesDadoParroquia5RISE = FFichaLocales.ObtenerDatosDadoRucoRiseParroquias("RISE", 5);
            Rise.set("ELASCO 1", lstLocalesDadoParroquia1RISE.size());
            Rise.set("MALDONADO 2", lstLocalesDadoParroquia2RISE.size());
            Rise.set("VELOZ 3", lstLocalesDadoParroquia3RISE.size());
            Rise.set("YARUQUIES 4", lstLocalesDadoParroquia4RISE.size());
            Rise.set("LIZARZABURU 5", lstLocalesDadoParroquia5RISE.size());

            ChartSeries Ninguno = new ChartSeries();
            Ninguno.setLabel("Ninguno");
            lstLocalesDadoParroquia1NINGUNO = FFichaLocales.ObtenerDatosDadoRucoRiseParroquias("NINGUNO", 1);
            lstLocalesDadoParroquia2NINGUNO = FFichaLocales.ObtenerDatosDadoRucoRiseParroquias("NINGUNO", 2);
            lstLocalesDadoParroquia3NINGUNO = FFichaLocales.ObtenerDatosDadoRucoRiseParroquias("NINGUNO", 3);
            lstLocalesDadoParroquia4NINGUNO = FFichaLocales.ObtenerDatosDadoRucoRiseParroquias("NINGUNO", 4);
            lstLocalesDadoParroquia5NINGUNO = FFichaLocales.ObtenerDatosDadoRucoRiseParroquias("NINGUNO", 5);
            Ninguno.set("ELASCO 1", lstLocalesDadoParroquia1NINGUNO.size());
            Ninguno.set("MALDONADO 2", lstLocalesDadoParroquia2NINGUNO.size());
            Ninguno.set("VELOZ 3", lstLocalesDadoParroquia3NINGUNO.size());
            Ninguno.set("YARUQUIES 2", lstLocalesDadoParroquia4NINGUNO.size());
            Ninguno.set("LIZARZABURU 3", lstLocalesDadoParroquia5NINGUNO.size());

            model.addSeries(Ruc);
            model.addSeries(Rise);
            model.addSeries(Ninguno);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
    
}
