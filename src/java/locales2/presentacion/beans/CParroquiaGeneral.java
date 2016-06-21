
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
public class CParroquiaGeneral {
    
    private CartesianChartModel lineLocalesParroquias;
    private ArrayList<FichaLocales> lstLocales;
    private ArrayList<FichaLocales> lstLocalesParroquia1;
    private ArrayList<FichaLocales> lstLocalesParroquia2;
    private ArrayList<FichaLocales> lstLocalesParroquia3;
    private ArrayList<FichaLocales> lstLocalesParroquia4;
    private ArrayList<FichaLocales> lstLocalesParroquia5;
    
    
    
    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesParroquias=graficaParroquias2();
    }

    private void reinit() {
        this.init();
    }

    public CParroquiaGeneral() {
        this.reinit();
    }

    public CartesianChartModel getLineLocalesParroquias() {
        return lineLocalesParroquias;
    }

    public void setLineLocalesParroquias(CartesianChartModel lineLocalesParroquias) {
        this.lineLocalesParroquias = lineLocalesParroquias;
    }

    public ArrayList<FichaLocales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<FichaLocales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public ArrayList<FichaLocales> getLstLocalesParroquia1() {
        return lstLocalesParroquia1;
    }

    public void setLstLocalesParroquia1(ArrayList<FichaLocales> lstLocalesParroquia1) {
        this.lstLocalesParroquia1 = lstLocalesParroquia1;
    }

    public ArrayList<FichaLocales> getLstLocalesParroquia2() {
        return lstLocalesParroquia2;
    }

    public void setLstLocalesParroquia2(ArrayList<FichaLocales> lstLocalesParroquia2) {
        this.lstLocalesParroquia2 = lstLocalesParroquia2;
    }

    public ArrayList<FichaLocales> getLstLocalesParroquia3() {
        return lstLocalesParroquia3;
    }

    public void setLstLocalesParroquia3(ArrayList<FichaLocales> lstLocalesParroquia3) {
        this.lstLocalesParroquia3 = lstLocalesParroquia3;
    }

    public ArrayList<FichaLocales> getLstLocalesParroquia4() {
        return lstLocalesParroquia4;
    }

    public void setLstLocalesParroquia4(ArrayList<FichaLocales> lstLocalesParroquia4) {
        this.lstLocalesParroquia4 = lstLocalesParroquia4;
    }

    public ArrayList<FichaLocales> getLstLocalesParroquia5() {
        return lstLocalesParroquia5;
    }

    public void setLstLocalesParroquia5(ArrayList<FichaLocales> lstLocalesParroquia5) {
        this.lstLocalesParroquia5 = lstLocalesParroquia5;
    }
    
    private CartesianChartModel graficaParroquias2() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstLocalesParroquia1 = FFichaLocales.ObtenerDatosDadoParroquia(1);
            lstLocalesParroquia2 = FFichaLocales.ObtenerDatosDadoParroquia(2);
            lstLocalesParroquia3 = FFichaLocales.ObtenerDatosDadoParroquia(3);
            lstLocalesParroquia4 = FFichaLocales.ObtenerDatosDadoParroquia(4);
            lstLocalesParroquia5 = FFichaLocales.ObtenerDatosDadoParroquia(5);
            

            ChartSeries parroquia = new ChartSeries();
            parroquia.setLabel("Parroquias");
            parroquia.set("VELASCO", lstLocalesParroquia1.size());
            parroquia.set("MALDONADO", lstLocalesParroquia2.size());
            parroquia.set("VELOZ", lstLocalesParroquia3.size());
            parroquia.set("YARUQUIES", lstLocalesParroquia4.size());
            parroquia.set("LIZARZABURU", lstLocalesParroquia5.size());

            model1.addSeries(parroquia);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }
    
}
