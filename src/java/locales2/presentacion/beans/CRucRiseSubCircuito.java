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
public class CRucRiseSubCircuito {
     private CartesianChartModel lineLocalesSubCircuitos;
    public ArrayList<Subcircuito> lstSubCircuito;
    public  ArrayList<FichaLocales> lstLocales;
    public  ArrayList<FichaLocales> lstLocalesDadoRuc;
    public  ArrayList<FichaLocales> lstLocalesDadoRise;
    public  ArrayList<FichaLocales> lstLocalesDadoNinguno;

    
    
     @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesSubCircuitos = graficaSubCircuitos();

    }

    private void reinit() {
        this.init();
    }

    public CRucRiseSubCircuito() {
        this.reinit();
    }

    
    
    public CartesianChartModel getLineLocalesSubCircuitos() {
        return lineLocalesSubCircuitos;
    }

    public void setLineLocalesSubCircuitos(CartesianChartModel lineLocalesSubCircuitos) {
        this.lineLocalesSubCircuitos = lineLocalesSubCircuitos;
    }

    public ArrayList<Subcircuito> getLstSubCircuito() {
        return lstSubCircuito;
    }

    public void setLstSubCircuito(ArrayList<Subcircuito> lstSubCircuito) {
        this.lstSubCircuito = lstSubCircuito;
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
    
    
    private CartesianChartModel graficaSubCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstSubCircuito = FSubcircuito.obtenerSubcircuito();
            ChartSeries Ruc = new ChartSeries();
            Ruc.setLabel("RUC");
            for (int i = 0; i < lstSubCircuito.size(); i++) {
                lstLocalesDadoRuc = FFichaLocales.ObtenerDatosDadoRucoRiseSubcircuito("RUC", lstSubCircuito.get(i).getId_subcircuito());
                Ruc.set(lstSubCircuito.get(i).getDescripcion(), lstLocalesDadoRuc.size());
            }

            ChartSeries Rise = new ChartSeries();
            Rise.setLabel("RISE");
            for (int i = 0; i < lstSubCircuito.size(); i++) {
                lstLocalesDadoRise = FFichaLocales.ObtenerDatosDadoRucoRiseSubcircuito("RISE", lstSubCircuito.get(i).getId_subcircuito());
                Rise.set(lstSubCircuito.get(i).getDescripcion(), lstLocalesDadoRise.size());
            }

            ChartSeries Ninguno = new ChartSeries();
            Ninguno.setLabel("Ninguno");
            for (int i = 0; i < lstSubCircuito.size(); i++) {
                lstLocalesDadoNinguno = FFichaLocales.ObtenerDatosDadoRucoRiseSubcircuito("NINGUNO", lstSubCircuito.get(i).getId_subcircuito());
                Ninguno.set(lstSubCircuito.get(i).getDescripcion(), lstLocalesDadoNinguno.size());
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
