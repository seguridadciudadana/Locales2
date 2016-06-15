
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
public class CLocalesCircuitos {
    private ArrayList<Circuito> lstCircuitos;
    private ArrayList<Subcircuito> lstSubCircuitos;
    private ArrayList<FichaLocales> lstDadoCircuitos;
    private ArrayList<FichaLocales> lstDadoSubCircuitos;
    
    private CartesianChartModel  modelCircuito;
    private CartesianChartModel  modelSubCircuito;
    
    private ArrayList<FichaLocales> lstLocales;
    private FichaLocales LocalesSel;

    public ArrayList<Subcircuito> getLstSubCircuitos() {
        return lstSubCircuitos;
    }

    public void setLstSubCircuitos(ArrayList<Subcircuito> lstSubCircuitos) {
        this.lstSubCircuitos = lstSubCircuitos;
    }

    
    public ArrayList<FichaLocales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<FichaLocales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public FichaLocales getLocalesSel() {
        return LocalesSel;
    }

    public void setLocalesSel(FichaLocales LocalesSel) {
        this.LocalesSel = LocalesSel;
    }
    

    public ArrayList<Circuito> getLstCircuitos() {
        return lstCircuitos;
    }

    public void setLstCircuitos(ArrayList<Circuito> lstCircuitos) {
        this.lstCircuitos = lstCircuitos;
    }

   

   

    public ArrayList<FichaLocales> getLstDadoCircuitos() {
        return lstDadoCircuitos;
    }

    public void setLstDadoCircuitos(ArrayList<FichaLocales> lstDadoCircuitos) {
        this.lstDadoCircuitos = lstDadoCircuitos;
    }

    public ArrayList<FichaLocales> getLstDadoSubCircuitos() {
        return lstDadoSubCircuitos;
    }

    public void setLstDadoSubCircuitos(ArrayList<FichaLocales> lstDadoSubCircuitos) {
        this.lstDadoSubCircuitos = lstDadoSubCircuitos;
    }

    public CartesianChartModel getModelCircuito() {
        return modelCircuito;
    }

    public void setModelCircuito(CartesianChartModel modelCircuito) {
        this.modelCircuito = modelCircuito;
    }

    public CartesianChartModel getModelSubCircuito() {
        return modelSubCircuito;
    }

    public void setModelSubCircuito(CartesianChartModel modelSubCircuito) {
        this.modelSubCircuito = modelSubCircuito;
    }
    
    
    @PostConstruct
    public void init() {
        graficar();
    }
    public void graficar(){
    modelCircuito=graficarCircuito();
    modelSubCircuito=graficarSubCircuito();
    }
    
    private void reinit() {
        this.obtenerDatosLocales();
        this.init();
    }

    public CLocalesCircuitos() {
        this.reinit();

    }

    
    private CartesianChartModel graficarCircuito(){
        CartesianChartModel circuitoModel=new CartesianChartModel();
        try {
            lstCircuitos=FCircuito.obtenerCircuito();
            ChartSeries circuitoSeries=new ChartSeries();
            circuitoSeries.setLabel("Circuitos");
            for (int i = 0; i <lstCircuitos.size(); i++) {
                lstDadoCircuitos=FFichaLocales.ObtenerLocalesDadoCircuito(lstCircuitos.get(i).getId_circuito());
                circuitoSeries.set(lstCircuitos.get(i).getDescripcion(),lstDadoCircuitos.size());
                
            }
            circuitoModel.addSeries(circuitoSeries);
        } catch (Exception e) {
              Util.addErrorMessage(e, "Error");
        }
    
    return circuitoModel;
    }
    
    
    
    
    private CartesianChartModel graficarSubCircuito(){
        CartesianChartModel subCircuitoModel=new CartesianChartModel();
        try {
            lstSubCircuitos=FSubcircuito.obtenerSubcircuito();
            ChartSeries subCircuitoSeries=new ChartSeries();
            subCircuitoSeries.setLabel("SubCircuitos");
            for (int i = 0; i < lstSubCircuitos.size(); i++) {
                lstDadoSubCircuitos=FFichaLocales.ObtenerLocalesDadoSubcircuito(lstSubCircuitos.get(i).getId_subcircuito());
                subCircuitoSeries.set(lstSubCircuitos.get(i).getDescripcion(), lstDadoSubCircuitos.size());
                
            }
            subCircuitoModel.addSeries(subCircuitoSeries);
        } catch (Exception e) {
           Util.addErrorMessage(e, "Error");  
        }
        return subCircuitoModel;
    }
    
    
    public void obtenerDatosLocales() {
        try {

            this.lstLocales = FFichaLocales.ObtenerDatos();
            this.LocalesSel = lstLocales.get(0);
            System.out.println(lstLocales.get(0).getId_ficha_locales());
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerDatosLocales dice: " + e.getMessage());
            System.out.println("public void obtenerDatosLocales dice: " + e.getMessage());
        }

    }

    
    
}
