
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
public class CPermisoMiCircuito {
    private CartesianChartModel lineLocalesMiCircuitos;
    private ArrayList<Circuito> lstCircuitos;
    private ArrayList<FichaLocales> lstLocalesCircuito;
    private ArrayList<FichaLocales> lstLocalesDadoCircuitoMiSi;
    private ArrayList<FichaLocales> lstLocalesDadoCircuitoMiNo;
    
    
     @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesMiCircuitos= graficaMiCircuitos();

    }

    private void reinit() {
        this.init();
    }

    public CPermisoMiCircuito() {
        this.reinit();
    }

    public CartesianChartModel getLineLocalesMiCircuitos() {
        return lineLocalesMiCircuitos;
    }

    public void setLineLocalesMiCircuitos(CartesianChartModel lineLocalesMiCircuitos) {
        this.lineLocalesMiCircuitos = lineLocalesMiCircuitos;
    }

    public ArrayList<Circuito> getLstCircuitos() {
        return lstCircuitos;
    }

    public void setLstCircuitos(ArrayList<Circuito> lstCircuitos) {
        this.lstCircuitos = lstCircuitos;
    }

    public ArrayList<FichaLocales> getLstLocalesCircuito() {
        return lstLocalesCircuito;
    }

    public void setLstLocalesCircuito(ArrayList<FichaLocales> lstLocalesCircuito) {
        this.lstLocalesCircuito = lstLocalesCircuito;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuitoMiSi() {
        return lstLocalesDadoCircuitoMiSi;
    }

    public void setLstLocalesDadoCircuitoMiSi(ArrayList<FichaLocales> lstLocalesDadoCircuitoMiSi) {
        this.lstLocalesDadoCircuitoMiSi = lstLocalesDadoCircuitoMiSi;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuitoMiNo() {
        return lstLocalesDadoCircuitoMiNo;
    }

    public void setLstLocalesDadoCircuitoMiNo(ArrayList<FichaLocales> lstLocalesDadoCircuitoMiNo) {
        this.lstLocalesDadoCircuitoMiNo = lstLocalesDadoCircuitoMiNo;
    }

     private CartesianChartModel graficaMiCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstCircuitos = FCircuito.obtenerCircuito();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstLocalesDadoCircuitoMiSi = FFichaLocales.ObtenerDatosDadoPermisoMiCircuito("SI", lstCircuitos.get(i).getId_circuito());
                Si.set(lstCircuitos.get(i).getDescripcion(), lstLocalesDadoCircuitoMiSi.size());
            }

            ChartSeries No = new ChartSeries();
            No.setLabel("No");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstLocalesDadoCircuitoMiNo = FFichaLocales.ObtenerDatosDadoPermisoMiCircuito("NO", lstCircuitos.get(i).getId_circuito());
                No.set(lstCircuitos.get(i).getDescripcion(), lstLocalesDadoCircuitoMiNo.size());
            }

           

            model.addSeries(Si);
            model.addSeries(No);
   

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }
    
}
