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
public class CPermisoMspSubCircuito {
    
      private CartesianChartModel lineLocalesMspSubCircuitos;
    private ArrayList<Subcircuito> lstSubCircuitos;
    private ArrayList<FichaLocales> lstLocalesDadoSubCircuitoMspSi;
    private ArrayList<FichaLocales> lstLocalesDadoSubCircuitoMspNo;
 
    
     @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesMspSubCircuitos= graficaMspSubCircuitos();

    }

    private void reinit() {
        this.init();
    }

    public CPermisoMspSubCircuito() {
        this.reinit();
    }

    public CartesianChartModel getLineLocalesMspSubCircuitos() {
        return lineLocalesMspSubCircuitos;
    }

    public void setLineLocalesMspSubCircuitos(CartesianChartModel lineLocalesMspSubCircuitos) {
        this.lineLocalesMspSubCircuitos = lineLocalesMspSubCircuitos;
    }

    public ArrayList<Subcircuito> getLstSubCircuitos() {
        return lstSubCircuitos;
    }

    public void setLstSubCircuitos(ArrayList<Subcircuito> lstSubCircuitos) {
        this.lstSubCircuitos = lstSubCircuitos;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoSubCircuitoMspSi() {
        return lstLocalesDadoSubCircuitoMspSi;
    }

    public void setLstLocalesDadoSubCircuitoMspSi(ArrayList<FichaLocales> lstLocalesDadoSubCircuitoMspSi) {
        this.lstLocalesDadoSubCircuitoMspSi = lstLocalesDadoSubCircuitoMspSi;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoSubCircuitoMspNo() {
        return lstLocalesDadoSubCircuitoMspNo;
    }

    public void setLstLocalesDadoSubCircuitoMspNo(ArrayList<FichaLocales> lstLocalesDadoSubCircuitoMspNo) {
        this.lstLocalesDadoSubCircuitoMspNo = lstLocalesDadoSubCircuitoMspNo;
    }
    
    
     private CartesianChartModel graficaMspSubCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstSubCircuitos = FSubcircuito.obtenerSubcircuito();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si");
            for (int i = 0; i < lstSubCircuitos.size(); i++) {
                lstLocalesDadoSubCircuitoMspSi = FFichaLocales.ObtenerDatosDadoPermisoMspSubcircuito("SI", lstSubCircuitos.get(i).getId_subcircuito());
                Si.set(lstSubCircuitos.get(i).getDescripcion(), lstLocalesDadoSubCircuitoMspSi.size());
            }

            ChartSeries No = new ChartSeries();
            No.setLabel("No");
            for (int i = 0; i < lstSubCircuitos.size(); i++) {
                lstLocalesDadoSubCircuitoMspNo = FFichaLocales.ObtenerDatosDadoPermisoMspSubcircuito("NO", lstSubCircuitos.get(i).getId_subcircuito());
                No.set(lstSubCircuitos.get(i).getDescripcion(), lstLocalesDadoSubCircuitoMspNo.size());
            }

           

            model.addSeries(Si);
            model.addSeries(No);
   

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }
    
}
