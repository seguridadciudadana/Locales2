
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

public class CPermisoMiSubCircuito {
    
    private CartesianChartModel lineLocalesMiSubCircuitos;
    private ArrayList<Subcircuito> lstSubCircuitos;
    private ArrayList<FichaLocales> lstLocalesDadoSubCircuitoMiSi;
    private ArrayList<FichaLocales> lstLocalesDadoSubCircuitoMiNo;


    
    
     @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesMiSubCircuitos= graficaMiSubCircuitos();

    }

    private void reinit() {
        this.init();
    }

    public CPermisoMiSubCircuito() {
        this.reinit();
    }

    public CartesianChartModel getLineLocalesMiSubCircuitos() {
        return lineLocalesMiSubCircuitos;
    }

    public void setLineLocalesMiSubCircuitos(CartesianChartModel lineLocalesMiSubCircuitos) {
        this.lineLocalesMiSubCircuitos = lineLocalesMiSubCircuitos;
    }

    public ArrayList<Subcircuito> getLstSubCircuitos() {
        return lstSubCircuitos;
    }

    public void setLstSubCircuitos(ArrayList<Subcircuito> lstSubCircuitos) {
        this.lstSubCircuitos = lstSubCircuitos;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoSubCircuitoMiSi() {
        return lstLocalesDadoSubCircuitoMiSi;
    }

    public void setLstLocalesDadoSubCircuitoMiSi(ArrayList<FichaLocales> lstLocalesDadoSubCircuitoMiSi) {
        this.lstLocalesDadoSubCircuitoMiSi = lstLocalesDadoSubCircuitoMiSi;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoSubCircuitoMiNo() {
        return lstLocalesDadoSubCircuitoMiNo;
    }

    public void setLstLocalesDadoSubCircuitoMiNo(ArrayList<FichaLocales> lstLocalesDadoSubCircuitoMiNo) {
        this.lstLocalesDadoSubCircuitoMiNo = lstLocalesDadoSubCircuitoMiNo;
    }
     private CartesianChartModel graficaMiSubCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstSubCircuitos = FSubcircuito.obtenerSubcircuito();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si");
            for (int i = 0; i < lstSubCircuitos.size(); i++) {
                lstLocalesDadoSubCircuitoMiSi = FFichaLocales.ObtenerDatosDadoPermisoMiSubcircuito("SI", lstSubCircuitos.get(i).getId_subcircuito());
                Si.set(lstSubCircuitos.get(i).getDescripcion(), lstLocalesDadoSubCircuitoMiSi.size());
            }

            ChartSeries No = new ChartSeries();
            No.setLabel("No");
            for (int i = 0; i < lstSubCircuitos.size(); i++) {
                lstLocalesDadoSubCircuitoMiNo = FFichaLocales.ObtenerDatosDadoPermisoMiSubcircuito("NO", lstSubCircuitos.get(i).getId_subcircuito());
                No.set(lstSubCircuitos.get(i).getDescripcion(), lstLocalesDadoSubCircuitoMiNo.size());
            }

           

            model.addSeries(Si);
            model.addSeries(No);
   

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }
}
