package locales2.presentacion.beans;
import vif.logica.clases.Circuito;
import vif.logica.funciones.FCircuito;
import locales2.logica.clases.FichaLocales;
import vif.logica.clases.Subcircuito;
import locales2.logica.funciones.FFichaLocales;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;
import java.util.ArrayList;
import vif.logica.funciones.FSubcircuito;



@ManagedBean
@RequestScoped
public class CRucRiseCircuito {
    
    private CartesianChartModel lineLocalesCircuitos;
    public ArrayList<Circuito> lstCircuito;
    public  ArrayList<FichaLocales> lstLocales;
    public  ArrayList<FichaLocales> lstLocalesDadoRuc;
    public  ArrayList<FichaLocales> lstLocalesDadoRise;
    public  ArrayList<FichaLocales> lstLocalesDadoNinguno;
    
    
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

    public CRucRiseCircuito() {
        this.reinit();
    }

    public CartesianChartModel getLineLocalesCircuitos() {
        return lineLocalesCircuitos;
    }

    public void setLineLocalesCircuitos(CartesianChartModel lineLocalesCircuitos) {
        this.lineLocalesCircuitos = lineLocalesCircuitos;
    }

    public ArrayList<Circuito> getLstCircuito() {
        return lstCircuito;
    }

    public void setLstCircuito(ArrayList<Circuito> lstCircuito) {
        this.lstCircuito = lstCircuito;
    }

    public ArrayList<FichaLocales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<FichaLocales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoRuc() {
        return lstLocalesDadoRuc;
    }

    public void setLstLocalesDadoRuc(ArrayList<FichaLocales> lstLocalesDadoRuc) {
        this.lstLocalesDadoRuc = lstLocalesDadoRuc;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoRise() {
        return lstLocalesDadoRise;
    }

    public void setLstLocalesDadoRise(ArrayList<FichaLocales> lstLocalesDadoRise) {
        this.lstLocalesDadoRise = lstLocalesDadoRise;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoNinguno() {
        return lstLocalesDadoNinguno;
    }

    public void setLstLocalesDadoNinguno(ArrayList<FichaLocales> lstLocalesDadoNinguno) {
        this.lstLocalesDadoNinguno = lstLocalesDadoNinguno;
    }
    
    private CartesianChartModel graficaCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstCircuito = FCircuito.obtenerCircuito();
            ChartSeries Ruc = new ChartSeries();
            Ruc.setLabel("RUC");
            for (int i = 0; i < lstCircuito.size(); i++) {
                lstLocalesDadoRuc = FFichaLocales.ObtenerDatosDadoRucoRiseCircuito("RUC", lstCircuito.get(i).getId_circuito());
                Ruc.set(lstCircuito.get(i).getDescripcion(), lstLocalesDadoRuc.size());
            }

            ChartSeries Rise = new ChartSeries();
            Rise.setLabel("RISE");
            for (int i = 0; i < lstCircuito.size(); i++) {
                lstLocalesDadoRise = FFichaLocales.ObtenerDatosDadoRucoRiseCircuito("RISE", lstCircuito.get(i).getId_circuito());
                Rise.set(lstCircuito.get(i).getDescripcion(), lstLocalesDadoRise.size());
            }

            ChartSeries Ninguno = new ChartSeries();
            Ninguno.setLabel("Ninguno");
            for (int i = 0; i < lstCircuito.size(); i++) {
                lstLocalesDadoNinguno = FFichaLocales.ObtenerDatosDadoRucoRiseCircuito("NINGUNO", lstCircuito.get(i).getId_circuito());
                Ninguno.set(lstCircuito.get(i).getDescripcion(), lstLocalesDadoNinguno.size());
            }

            model.addSeries(Ruc);
            model.addSeries(Rise);
            model.addSeries(Ninguno);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }

    
    
}
