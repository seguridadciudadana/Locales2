
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

import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;


@ManagedBean
@RequestScoped
public class CPermisoBomberoDadoCircuito {
    
     private CartesianChartModel lineLocalesCircuitos;
     private ArrayList<Circuito> lstCircuitos;
    private ArrayList<FichaLocales> lstLocales;
    private ArrayList<FichaLocales> lstLocalesDadoCircuito;
    private ArrayList<FichaLocales> lstLocalesCircuito;
    private ArrayList<FichaLocales> lstLocalesDadoCircuitoSi;
    private ArrayList<FichaLocales> lstLocalesDadoCircuitoNo;
    private ArrayList<FichaLocales> lstLocalesDadoCircuitoNoPresenta;
    
    
    
    
     @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesCircuitos= graficaCircuitos();

    }

    private void reinit() {
        this.init();
    }

    public CPermisoBomberoDadoCircuito() {
        this.reinit();
    }

    public CartesianChartModel getLineLocalesCircuitos() {
        return lineLocalesCircuitos;
    }

    public void setLineLocalesCircuitos(CartesianChartModel lineLocalesCircuitos) {
        this.lineLocalesCircuitos = lineLocalesCircuitos;
    }

    public ArrayList<Circuito> getLstCircuitos() {
        return lstCircuitos;
    }

    public void setLstCircuitos(ArrayList<Circuito> lstCircuitos) {
        this.lstCircuitos = lstCircuitos;
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

    public ArrayList<FichaLocales> getLstLocalesDadoCircuitoSi() {
        return lstLocalesDadoCircuitoSi;
    }

    public void setLstLocalesDadoCircuitoSi(ArrayList<FichaLocales> lstLocalesDadoCircuitoSi) {
        this.lstLocalesDadoCircuitoSi = lstLocalesDadoCircuitoSi;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuitoNo() {
        return lstLocalesDadoCircuitoNo;
    }

    public void setLstLocalesDadoCircuitoNo(ArrayList<FichaLocales> lstLocalesDadoCircuitoNo) {
        this.lstLocalesDadoCircuitoNo = lstLocalesDadoCircuitoNo;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuitoNoPresenta() {
        return lstLocalesDadoCircuitoNoPresenta;
    }

    public void setLstLocalesDadoCircuitoNoPresenta(ArrayList<FichaLocales> lstLocalesDadoCircuitoNoPresenta) {
        this.lstLocalesDadoCircuitoNoPresenta = lstLocalesDadoCircuitoNoPresenta;
    }
    
    
    private CartesianChartModel graficaCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstCircuitos = FCircuito.obtenerCircuito();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstLocalesDadoCircuitoSi = FFichaLocales.ObtenerDatosDadoPermisoBomberosCircuito("SI", lstCircuitos.get(i).getId_circuito());
                Si.set(lstCircuitos.get(i).getDescripcion(), lstLocalesDadoCircuitoSi.size());
            }

            ChartSeries No = new ChartSeries();
            No.setLabel("No");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstLocalesDadoCircuitoNo = FFichaLocales.ObtenerDatosDadoPermisoBomberosCircuito("NO", lstCircuitos.get(i).getId_circuito());
                No.set(lstCircuitos.get(i).getDescripcion(), lstLocalesDadoCircuitoNo.size());
            }

           

            model.addSeries(Si);
            model.addSeries(No);
   

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }
}
