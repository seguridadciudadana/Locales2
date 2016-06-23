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

public class CPermisosMspCircuito {
    
    private CartesianChartModel lineLocalesMspCircuitos;
    private ArrayList<Circuito> lstCircuitos;
    private ArrayList<FichaLocales> lstLocalesDadoCircuitoMspSi;
    private ArrayList<FichaLocales> lstLocalesDadoCircuitoMspNo;


    
    
     @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesMspCircuitos= graficaMspCircuitos();

    }

    private void reinit() {
        this.init();
    }

    public CPermisosMspCircuito() {
        this.reinit();
    }

    public CartesianChartModel getLineLocalesMspCircuitos() {
        return lineLocalesMspCircuitos;
    }

    public void setLineLocalesMspCircuitos(CartesianChartModel lineLocalesMspCircuitos) {
        this.lineLocalesMspCircuitos = lineLocalesMspCircuitos;
    }

    public ArrayList<Circuito> getLstCircuitos() {
        return lstCircuitos;
    }

    public void setLstCircuitos(ArrayList<Circuito> lstCircuitos) {
        this.lstCircuitos = lstCircuitos;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuitoMspSi() {
        return lstLocalesDadoCircuitoMspSi;
    }

    public void setLstLocalesDadoCircuitoMspSi(ArrayList<FichaLocales> lstLocalesDadoCircuitoMspSi) {
        this.lstLocalesDadoCircuitoMspSi = lstLocalesDadoCircuitoMspSi;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuitoMspNo() {
        return lstLocalesDadoCircuitoMspNo;
    }

    public void setLstLocalesDadoCircuitoMspNo(ArrayList<FichaLocales> lstLocalesDadoCircuitoMspNo) {
        this.lstLocalesDadoCircuitoMspNo = lstLocalesDadoCircuitoMspNo;
    }

    
    
     private CartesianChartModel graficaMspCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstCircuitos = FCircuito.obtenerCircuito();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstLocalesDadoCircuitoMspSi = FFichaLocales.ObtenerDatosDadoPermisoMspCircuito("SI", lstCircuitos.get(i).getId_circuito());
                Si.set(lstCircuitos.get(i).getDescripcion(), lstLocalesDadoCircuitoMspSi.size());
            }

            ChartSeries No = new ChartSeries();
            No.setLabel("No");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstLocalesDadoCircuitoMspNo = FFichaLocales.ObtenerDatosDadoPermisoMspCircuito("NO", lstCircuitos.get(i).getId_circuito());
                No.set(lstCircuitos.get(i).getDescripcion(), lstLocalesDadoCircuitoMspNo.size());
            }

           

            model.addSeries(Si);
            model.addSeries(No);
   

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }
    
}
