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
public class CPermisoBomberoSubCircuito {

    private CartesianChartModel lineLocalesSubCircuitos;
    private ArrayList<Subcircuito> lstSubCircuitos;
    private ArrayList<FichaLocales> lstLocales;
    private ArrayList<FichaLocales> lstLocalesDadoCircuito;
    private ArrayList<FichaLocales> lstLocalesCircuito;
    private ArrayList<FichaLocales> lstLocalesDadoSubCircuitoSi;
    private ArrayList<FichaLocales> lstLocalesDadoSubCircuitoNo;
    private ArrayList<FichaLocales> lstLocalesDadoSubCircuitoNoPresenta;

    
    
     @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesSubCircuitos= graficaSubCircuitos();

    }

    private void reinit() {
        this.init();
    }

    public CPermisoBomberoSubCircuito() {
        this.reinit();
    }

    public CartesianChartModel getLineLocalesSubCircuitos() {
        return lineLocalesSubCircuitos;
    }

    public void setLineLocalesSubCircuitos(CartesianChartModel lineLocalesSubCircuitos) {
        this.lineLocalesSubCircuitos = lineLocalesSubCircuitos;
    }

  
    public ArrayList<Subcircuito> getLstCircuitos() {
        return lstSubCircuitos;
    }

    public void setLstCircuitos(ArrayList<Subcircuito> lstCircuitos) {
        this.lstSubCircuitos = lstCircuitos;
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

    public ArrayList<Subcircuito> getLstSubCircuitos() {
        return lstSubCircuitos;
    }

    public void setLstSubCircuitos(ArrayList<Subcircuito> lstSubCircuitos) {
        this.lstSubCircuitos = lstSubCircuitos;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoSubCircuitoSi() {
        return lstLocalesDadoSubCircuitoSi;
    }

    public void setLstLocalesDadoSubCircuitoSi(ArrayList<FichaLocales> lstLocalesDadoSubCircuitoSi) {
        this.lstLocalesDadoSubCircuitoSi = lstLocalesDadoSubCircuitoSi;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoSubCircuitoNo() {
        return lstLocalesDadoSubCircuitoNo;
    }

    public void setLstLocalesDadoSubCircuitoNo(ArrayList<FichaLocales> lstLocalesDadoSubCircuitoNo) {
        this.lstLocalesDadoSubCircuitoNo = lstLocalesDadoSubCircuitoNo;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoSubCircuitoNoPresenta() {
        return lstLocalesDadoSubCircuitoNoPresenta;
    }

    public void setLstLocalesDadoSubCircuitoNoPresenta(ArrayList<FichaLocales> lstLocalesDadoSubCircuitoNoPresenta) {
        this.lstLocalesDadoSubCircuitoNoPresenta = lstLocalesDadoSubCircuitoNoPresenta;
    }

    
    
    private CartesianChartModel graficaSubCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstSubCircuitos = FSubcircuito.obtenerSubcircuito();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si");
            for (int i = 0; i < lstSubCircuitos.size(); i++) {
                lstLocalesDadoSubCircuitoSi = FFichaLocales.ObtenerDatosDadoPermisoBomberosSubcircuito("SI", lstSubCircuitos.get(i).getId_subcircuito());
                Si.set(lstSubCircuitos.get(i).getDescripcion(), lstLocalesDadoSubCircuitoSi.size());
            }

            ChartSeries No = new ChartSeries();
            No.setLabel("No");
            for (int i = 0; i < lstSubCircuitos.size(); i++) {
                lstLocalesDadoSubCircuitoNo = FFichaLocales.ObtenerDatosDadoPermisoBomberosSubcircuito("NO", lstSubCircuitos.get(i).getId_subcircuito());
                No.set(lstSubCircuitos.get(i).getDescripcion(), lstLocalesDadoSubCircuitoNo.size());
            }

           

            model.addSeries(Si);
            model.addSeries(No);
   

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }
    
}
