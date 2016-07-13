
package locales2.presentacion.beans;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import locales2.logica.clases.FichaLocales;
import locales2.logica.funciones.DistanciaLocalInstitucionEducativa;
import locales2.logica.funciones.FFichaLocales;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;


@ManagedBean
@RequestScoped
public class CRangoDistancias {
    
    private ArrayList<String> lstDistancias;
    private ArrayList<FichaLocales> lstLocales;
    private ArrayList<FichaLocales> lstDadoRango;
    private CartesianChartModel lineLOcales;
    
    
    @PostConstruct
    private void graficar() {
        this.lineLOcales = graficaDistancias();

    }

    public CRangoDistancias() {
        this.graficar();
    }

    public ArrayList<String> getLstDistancias() {
        return lstDistancias;
    }

    public void setLstDistancias(ArrayList<String> lstDistancias) {
        this.lstDistancias = lstDistancias;
    }

    public ArrayList<FichaLocales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<FichaLocales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public ArrayList<FichaLocales> getLstDadoRango() {
        return lstDadoRango;
    }

    public void setLstDadoRango(ArrayList<FichaLocales> lstDadoRango) {
        this.lstDadoRango = lstDadoRango;
    }

    public CartesianChartModel getLineLOcales() {
        return lineLOcales;
    }

    public void setLineLOcales(CartesianChartModel lineLOcales) {
        this.lineLOcales = lineLOcales;
    }

    private CartesianChartModel graficaDistancias() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDistancias = DistanciaLocalInstitucionEducativa.obtenerDistancias();
            ChartSeries distancias = new ChartSeries();
            distancias.setLabel("Distancias");
            distancias.set(lstDistancias.get(0), FFichaLocales.obtenerDatosDadoRangoDistancia(lstDistancias.get(0)).size());
            distancias.set(lstDistancias.get(1), FFichaLocales.obtenerDatosDadoRangoDistancia(lstDistancias.get(1)).size());
            distancias.set(lstDistancias.get(2), FFichaLocales.obtenerDatosDadoRangoDistancia(lstDistancias.get(2)).size());
            distancias.set(lstDistancias.get(3), FFichaLocales.obtenerDatosDadoRangoDistancia(lstDistancias.get(3)).size());
            distancias.set(lstDistancias.get(4), FFichaLocales.obtenerDatosDadoRangoDistancia(lstDistancias.get(4)).size());
            distancias.set(lstDistancias.get(5), FFichaLocales.obtenerDatosDadoRangoDistancia(lstDistancias.get(5)).size());
            distancias.set(lstDistancias.get(6), FFichaLocales.obtenerDatosDadoRangoDistancia(lstDistancias.get(6)).size());
            distancias.set(lstDistancias.get(7), FFichaLocales.obtenerDatosDadoRangoDistancia(lstDistancias.get(7)).size());
            distancias.set(lstDistancias.get(8), FFichaLocales.obtenerDatosDadoRangoDistancia(lstDistancias.get(8)).size());
            distancias.set(lstDistancias.get(8), FFichaLocales.obtenerDatosDadoRangoDistancia(lstDistancias.get(9)).size());
            model.addSeries(distancias);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    
    
}
