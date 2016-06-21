
package locales2.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import locales2.logica.clases.FichaLocales;
import locales2.logica.funciones.FFichaLocales;

import vif.logica.clases.Circuito;
import vif.logica.clases.Subcircuito;
import vif.logica.funciones.FCircuito;
import vif.logica.funciones.FSubcircuito;

import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;


@ManagedBean
@RequestScoped
public class CEstadoSubcircuito {
    
     private CartesianChartModel lineLocalesSubCircuitos;
    private ArrayList<FichaLocales> lstLocales;
    private ArrayList<FichaLocales> lstLocalesDadoSubCircuito;
    private ArrayList<FichaLocales> lstLocalesSubCircuito;
    private ArrayList<FichaLocales> lstLocalesDadoSubCircuitoAbierto;
    private ArrayList<FichaLocales> lstLocalesDadoSubCircuitoCerrado;
    private ArrayList<FichaLocales> lstLocalesDadoSubCircuitoSinEspecificar;
    
    private ArrayList<Subcircuito> lstSubCircuito;
    

    public ArrayList<Subcircuito> getLstSubCircuito() {
        return lstSubCircuito;
    }

    public void setLstSubCircuito(ArrayList<Subcircuito> lstSubCircuito) {
        this.lstSubCircuito = lstSubCircuito;
    }
    
    

    public CartesianChartModel getLineLocalesSubCircuitos() {
        return lineLocalesSubCircuitos;
    }

    public void setLineLocalesSubCircuitos(CartesianChartModel lineLocalesSubCircuitos) {
        this.lineLocalesSubCircuitos = lineLocalesSubCircuitos;
    }

    public ArrayList<FichaLocales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<FichaLocales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoSubCircuito() {
        return lstLocalesDadoSubCircuito;
    }

    public void setLstLocalesDadoSubCircuito(ArrayList<FichaLocales> lstLocalesDadoSubCircuito) {
        this.lstLocalesDadoSubCircuito = lstLocalesDadoSubCircuito;
    }

    public ArrayList<FichaLocales> getLstLocalesSubCircuito() {
        return lstLocalesSubCircuito;
    }

    public void setLstLocalesSubCircuito(ArrayList<FichaLocales> lstLocalesSubCircuito) {
        this.lstLocalesSubCircuito = lstLocalesSubCircuito;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoSubCircuitoAbierto() {
        return lstLocalesDadoSubCircuitoAbierto;
    }

    public void setLstLocalesDadoSubCircuitoAbierto(ArrayList<FichaLocales> lstLocalesDadoSubCircuitoAbierto) {
        this.lstLocalesDadoSubCircuitoAbierto = lstLocalesDadoSubCircuitoAbierto;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoSubCircuitoCerrado() {
        return lstLocalesDadoSubCircuitoCerrado;
    }

    public void setLstLocalesDadoSubCircuitoCerrado(ArrayList<FichaLocales> lstLocalesDadoSubCircuitoCerrado) {
        this.lstLocalesDadoSubCircuitoCerrado = lstLocalesDadoSubCircuitoCerrado;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoSubCircuitoSinEspecificar() {
        return lstLocalesDadoSubCircuitoSinEspecificar;
    }

    public void setLstLocalesDadoSubCircuitoSinEspecificar(ArrayList<FichaLocales> lstLocalesDadoSubCircuitoSinEspecificar) {
        this.lstLocalesDadoSubCircuitoSinEspecificar = lstLocalesDadoSubCircuitoSinEspecificar;
    }

   

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

    public CEstadoSubcircuito() {
        this.reinit();
    }

    

    private CartesianChartModel graficaSubCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstSubCircuito = FSubcircuito.obtenerSubcircuito();
            ChartSeries Abiertos = new ChartSeries();
            Abiertos.setLabel("Abiertos");
            for (int i = 0; i < lstSubCircuito.size(); i++) {
                lstLocalesDadoSubCircuitoAbierto = FFichaLocales.ObtenerLocalesDadoEstadoSubcircuito("ABIERTO", lstSubCircuito.get(i).getId_subcircuito());
                Abiertos.set(lstSubCircuito.get(i).getDescripcion(), lstLocalesDadoSubCircuitoAbierto.size());
            }

            ChartSeries Cerrados = new ChartSeries();
            Cerrados.setLabel("Cerrados");
            for (int i = 0; i < lstSubCircuito.size(); i++) {
                lstLocalesDadoSubCircuitoCerrado = FFichaLocales.ObtenerLocalesDadoEstadoSubcircuito("CERRADO", lstSubCircuito.get(i).getId_subcircuito());
                Cerrados.set(lstSubCircuito.get(i).getDescripcion(), lstLocalesDadoSubCircuitoCerrado.size());
            }

            ChartSeries SinEspecificar = new ChartSeries();
            SinEspecificar.setLabel("Sin Especificar");
            for (int i = 0; i < lstSubCircuito.size(); i++) {
                lstLocalesDadoSubCircuitoSinEspecificar = FFichaLocales.ObtenerLocalesDadoEstadoSubcircuito("SIN ESPECIFICAR",lstSubCircuito.get(i).getId_subcircuito());
                SinEspecificar.set(lstSubCircuito.get(i).getDescripcion(), lstLocalesDadoSubCircuitoSinEspecificar.size());
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
