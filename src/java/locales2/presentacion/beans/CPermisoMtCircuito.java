
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
public class CPermisoMtCircuito {
    private CartesianChartModel lineLocalesMtCircuitos;
    private ArrayList<Circuito> lstCircuitos;
    private ArrayList<FichaLocales> lstLocalesDadoCircuitoMtSi;
    private ArrayList<FichaLocales> lstLocalesDadoCircuitoMtNo;
    
     @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesMtCircuitos= graficaMtCircuitos();

    }

    private void reinit() {
        this.init();
    }

    public CPermisoMtCircuito() {
        this.reinit();
    }

    public CartesianChartModel getLineLocalesMtCircuitos() {
        return lineLocalesMtCircuitos;
    }

    public void setLineLocalesMtCircuitos(CartesianChartModel lineLocalesMtCircuitos) {
        this.lineLocalesMtCircuitos = lineLocalesMtCircuitos;
    }

    public ArrayList<Circuito> getLstCircuitos() {
        return lstCircuitos;
    }

    public void setLstCircuitos(ArrayList<Circuito> lstCircuitos) {
        this.lstCircuitos = lstCircuitos;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuitoMtSi() {
        return lstLocalesDadoCircuitoMtSi;
    }

    public void setLstLocalesDadoCircuitoMtSi(ArrayList<FichaLocales> lstLocalesDadoCircuitoMtSi) {
        this.lstLocalesDadoCircuitoMtSi = lstLocalesDadoCircuitoMtSi;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuitoMtNo() {
        return lstLocalesDadoCircuitoMtNo;
    }

    public void setLstLocalesDadoCircuitoMtNo(ArrayList<FichaLocales> lstLocalesDadoCircuitoMtNo) {
        this.lstLocalesDadoCircuitoMtNo = lstLocalesDadoCircuitoMtNo;
    }

     private CartesianChartModel graficaMtCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstCircuitos = FCircuito.obtenerCircuito();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstLocalesDadoCircuitoMtSi = FFichaLocales.ObtenerDatosDadoPermisoMtCircuito("SI", lstCircuitos.get(i).getId_circuito());
                Si.set(lstCircuitos.get(i).getDescripcion(), lstLocalesDadoCircuitoMtSi.size());
            }

            ChartSeries No = new ChartSeries();
            No.setLabel("No");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstLocalesDadoCircuitoMtNo = FFichaLocales.ObtenerDatosDadoPermisoMtCircuito("NO", lstCircuitos.get(i).getId_circuito());
                No.set(lstCircuitos.get(i).getDescripcion(), lstLocalesDadoCircuitoMtNo.size());
            }

           

            model.addSeries(Si);
            model.addSeries(No);
   

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }
}
