
package locales2.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import locales2.logica.clases.FichaLocales;
import locales2.logica.funciones.FFichaLocales;
import vif.logica.clases.Circuito;
import vif.logica.funciones.FCircuito;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

@ManagedBean
@RequestScoped
public class CEstadoCircuito {
     private CartesianChartModel lineLocalesCircuitos;
    private ArrayList<FichaLocales> lstLocales;
    private ArrayList<FichaLocales> lstLocalesDadoCircuito;
    private ArrayList<FichaLocales> lstLocalesCircuito;
    private ArrayList<FichaLocales> lstLocalesDadoCircuitoAbierto;
    private ArrayList<FichaLocales> lstLocalesDadoCircuitoCerrado;
    private ArrayList<FichaLocales> lstLocalesDadoCircuitoSinEspecificar;
    
    private ArrayList<Circuito> lstCircuito; 

    public ArrayList<Circuito> getLstCircuito() {
        return lstCircuito;
    }

    public void setLstCircuito(ArrayList<Circuito> lstCircuito) {
        this.lstCircuito = lstCircuito;
    }
    
    

    
    public CartesianChartModel getLineLocalesCircuitos() {
        return lineLocalesCircuitos;
    }

    public void setLineLocalesCircuitos(CartesianChartModel lineLocalesCircuitos) {
        this.lineLocalesCircuitos = lineLocalesCircuitos;
    }

    public ArrayList<FichaLocales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<FichaLocales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuito() {
        return lstLocalesDadoCircuito;
    }

    public void setLstLocalesDadoCircuito(ArrayList<FichaLocales> lstLocalesDadoCircuito) {
        this.lstLocalesDadoCircuito = lstLocalesDadoCircuito;
    }

    public ArrayList<FichaLocales> getLstLocalesCircuito() {
        return lstLocalesCircuito;
    }

    public void setLstLocalesCircuito(ArrayList<FichaLocales> lstLocalesCircuito) {
        this.lstLocalesCircuito = lstLocalesCircuito;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuitoAbierto() {
        return lstLocalesDadoCircuitoAbierto;
    }

    public void setLstLocalesDadoCircuitoAbierto(ArrayList<FichaLocales> lstLocalesDadoCircuitoAbierto) {
        this.lstLocalesDadoCircuitoAbierto = lstLocalesDadoCircuitoAbierto;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuitoCerrado() {
        return lstLocalesDadoCircuitoCerrado;
    }

    public void setLstLocalesDadoCircuitoCerrado(ArrayList<FichaLocales> lstLocalesDadoCircuitoCerrado) {
        this.lstLocalesDadoCircuitoCerrado = lstLocalesDadoCircuitoCerrado;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuitoSinEspecificar() {
        return lstLocalesDadoCircuitoSinEspecificar;
    }

    public void setLstLocalesDadoCircuitoSinEspecificar(ArrayList<FichaLocales> lstLocalesDadoCircuitoSinEspecificar) {
        this.lstLocalesDadoCircuitoSinEspecificar = lstLocalesDadoCircuitoSinEspecificar;
    }

  
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

    public CEstadoCircuito() {
        this.reinit();
    }

   

    private CartesianChartModel graficaCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstCircuito =FCircuito.obtenerCircuito();
            ChartSeries Abiertos = new ChartSeries();
            Abiertos.setLabel("Abiertos");
            for (int i = 0; i < lstCircuito.size(); i++) {
                lstLocalesDadoCircuitoAbierto = FFichaLocales.ObtenerDatosDadoEstadoCircuito("ABIERTO", lstCircuito.get(i).getId_circuito());
                Abiertos.set(lstCircuito.get(i).getDescripcion(), lstLocalesDadoCircuitoAbierto.size());
            }

            ChartSeries Cerrados = new ChartSeries();
            Cerrados.setLabel("Cerrados");
            for (int i = 0; i < lstCircuito.size(); i++) {
                lstLocalesDadoCircuitoCerrado = FFichaLocales.ObtenerDatosDadoEstadoCircuito("CERRADO", lstCircuito.get(i).getId_circuito());
                Cerrados.set(lstCircuito.get(i).getDescripcion(), lstLocalesDadoCircuitoCerrado.size());
            }

            ChartSeries SinEspecificar = new ChartSeries();
            SinEspecificar.setLabel("Cerrados");
            for (int i = 0; i < lstCircuito.size(); i++) {
                lstLocalesDadoCircuitoSinEspecificar = FFichaLocales.ObtenerDatosDadoEstadoCircuito("SIN ESPECIFICAR", lstCircuito.get(i).getId_circuito());
                SinEspecificar.set(lstCircuito.get(i).getDescripcion(), lstLocalesDadoCircuitoSinEspecificar.size());
            }

            model.addSeries(Cerrados);
            model.addSeries(Abiertos);
            model.addSeries(SinEspecificar);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }
    
}
