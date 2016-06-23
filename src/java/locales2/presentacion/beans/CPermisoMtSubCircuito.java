
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
public class CPermisoMtSubCircuito {
         private CartesianChartModel lineLocalesMtSubCircuitos;
    private ArrayList<Subcircuito> lstSubCircuitos;
    private ArrayList<FichaLocales> lstLocalesDadoSubCircuitoMtSi;
    private ArrayList<FichaLocales> lstLocalesDadoSubCircuitoMtNo;
    
    
     @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesMtSubCircuitos= graficaMtSubCircuitos();

    }

    private void reinit() {
        this.init();
    }

    public CPermisoMtSubCircuito() {
        this.reinit();
    }

    public CartesianChartModel getLineLocalesMtSubCircuitos() {
        return lineLocalesMtSubCircuitos;
    }

    public void setLineLocalesMtSubCircuitos(CartesianChartModel lineLocalesMtSubCircuitos) {
        this.lineLocalesMtSubCircuitos = lineLocalesMtSubCircuitos;
    }

    public ArrayList<Subcircuito> getLstSubCircuitos() {
        return lstSubCircuitos;
    }

    public void setLstSubCircuitos(ArrayList<Subcircuito> lstSubCircuitos) {
        this.lstSubCircuitos = lstSubCircuitos;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoSubCircuitoMtSi() {
        return lstLocalesDadoSubCircuitoMtSi;
    }

    public void setLstLocalesDadoSubCircuitoMtSi(ArrayList<FichaLocales> lstLocalesDadoSubCircuitoMtSi) {
        this.lstLocalesDadoSubCircuitoMtSi = lstLocalesDadoSubCircuitoMtSi;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoSubCircuitoMtNo() {
        return lstLocalesDadoSubCircuitoMtNo;
    }

    public void setLstLocalesDadoSubCircuitoMtNo(ArrayList<FichaLocales> lstLocalesDadoSubCircuitoMtNo) {
        this.lstLocalesDadoSubCircuitoMtNo = lstLocalesDadoSubCircuitoMtNo;
    }

      private CartesianChartModel graficaMtSubCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstSubCircuitos = FSubcircuito.obtenerSubcircuito();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si");
            for (int i = 0; i < lstSubCircuitos.size(); i++) {
                lstLocalesDadoSubCircuitoMtSi = FFichaLocales.ObtenerDatosDadoPermisoMtSubcircuito("SI", lstSubCircuitos.get(i).getId_subcircuito());
                Si.set(lstSubCircuitos.get(i).getDescripcion(), lstLocalesDadoSubCircuitoMtSi.size());
            }

            ChartSeries No = new ChartSeries();
            No.setLabel("No");
            for (int i = 0; i < lstSubCircuitos.size(); i++) {
                lstLocalesDadoSubCircuitoMtNo = FFichaLocales.ObtenerDatosDadoPermisoMtSubcircuito("NO", lstSubCircuitos.get(i).getId_subcircuito());
                No.set(lstSubCircuitos.get(i).getDescripcion(), lstLocalesDadoSubCircuitoMtNo.size());
            }

           

            model.addSeries(Si);
            model.addSeries(No);
   

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }
    
    
}

