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

public class CPermisoMunicipioSubCircuito {
    
    private CartesianChartModel lineLocalesMunicipioSubCircuitos;
    private ArrayList<Subcircuito> lstSubCircuitos;
    private ArrayList<FichaLocales> lstLocalesDadoSubCircuitoMunicipioSi;
    private ArrayList<FichaLocales> lstLocalesDadoSubCircuitoMunicipioNo;
    
    
     @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesMunicipioSubCircuitos= graficaMunicipioSubCircuitos();

    }

    private void reinit() {
        this.init();
    }

    public CPermisoMunicipioSubCircuito() {
        this.reinit();
    }

    public CartesianChartModel getLineLocalesMunicipioSubCircuitos() {
        return lineLocalesMunicipioSubCircuitos;
    }

    public void setLineLocalesMunicipioSubCircuitos(CartesianChartModel lineLocalesMunicipioSubCircuitos) {
        this.lineLocalesMunicipioSubCircuitos = lineLocalesMunicipioSubCircuitos;
    }

    public ArrayList<Subcircuito> getLstSubCircuitos() {
        return lstSubCircuitos;
    }

    public void setLstSubCircuitos(ArrayList<Subcircuito> lstSubCircuitos) {
        this.lstSubCircuitos = lstSubCircuitos;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoSubCircuitoMunicipioSi() {
        return lstLocalesDadoSubCircuitoMunicipioSi;
    }

    public void setLstLocalesDadoSubCircuitoMunicipioSi(ArrayList<FichaLocales> lstLocalesDadoSubCircuitoMunicipioSi) {
        this.lstLocalesDadoSubCircuitoMunicipioSi = lstLocalesDadoSubCircuitoMunicipioSi;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoSubCircuitoMunicipioNo() {
        return lstLocalesDadoSubCircuitoMunicipioNo;
    }

    public void setLstLocalesDadoSubCircuitoMunicipioNo(ArrayList<FichaLocales> lstLocalesDadoSubCircuitoMunicipioNo) {
        this.lstLocalesDadoSubCircuitoMunicipioNo = lstLocalesDadoSubCircuitoMunicipioNo;
    }
    
      private CartesianChartModel graficaMunicipioSubCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstSubCircuitos = FSubcircuito.obtenerSubcircuito();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si");
            for (int i = 0; i < lstSubCircuitos.size(); i++) {
                lstLocalesDadoSubCircuitoMunicipioSi = FFichaLocales.ObtenerDatosDadoPermisoMunicipioSubcircuito("SI", lstSubCircuitos.get(i).getId_subcircuito());
                Si.set(lstSubCircuitos.get(i).getDescripcion(), lstLocalesDadoSubCircuitoMunicipioSi.size());
            }

            ChartSeries No = new ChartSeries();
            No.setLabel("No");
            for (int i = 0; i < lstSubCircuitos.size(); i++) {
                lstLocalesDadoSubCircuitoMunicipioNo = FFichaLocales.ObtenerDatosDadoPermisoMunicipioSubcircuito("NO", lstSubCircuitos.get(i).getId_subcircuito());
                No.set(lstSubCircuitos.get(i).getDescripcion(), lstLocalesDadoSubCircuitoMunicipioNo.size());
            }

           

            model.addSeries(Si);
            model.addSeries(No);
   

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }
    
}
