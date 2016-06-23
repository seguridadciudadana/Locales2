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
public class CPermisoMunicipioCircuito {
    
      private CartesianChartModel lineLocalesMunicipioCircuitos;
    private ArrayList<Circuito> lstCircuitos;
    private ArrayList<FichaLocales> lstLocalesDadoCircuitoMunicipioSi;
    private ArrayList<FichaLocales> lstLocalesDadoCircuitoMunicipioNo;
    
    
    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesMunicipioCircuitos= graficaMunicipioCircuitos();

    }

    private void reinit() {
        this.init();
    }

    public CPermisoMunicipioCircuito() {
        this.reinit();
    }

    public CartesianChartModel getLineLocalesMunicipioCircuitos() {
        return lineLocalesMunicipioCircuitos;
    }

    public void setLineLocalesMunicipioCircuitos(CartesianChartModel lineLocalesMunicipioCircuitos) {
        this.lineLocalesMunicipioCircuitos = lineLocalesMunicipioCircuitos;
    }

    public ArrayList<Circuito> getLstCircuitos() {
        return lstCircuitos;
    }

    public void setLstCircuitos(ArrayList<Circuito> lstCircuitos) {
        this.lstCircuitos = lstCircuitos;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuitoMunicipioSi() {
        return lstLocalesDadoCircuitoMunicipioSi;
    }

    public void setLstLocalesDadoCircuitoMunicipioSi(ArrayList<FichaLocales> lstLocalesDadoCircuitoMunicipioSi) {
        this.lstLocalesDadoCircuitoMunicipioSi = lstLocalesDadoCircuitoMunicipioSi;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoCircuitoMunicipioNo() {
        return lstLocalesDadoCircuitoMunicipioNo;
    }

    public void setLstLocalesDadoCircuitoMunicipioNo(ArrayList<FichaLocales> lstLocalesDadoCircuitoMunicipioNo) {
        this.lstLocalesDadoCircuitoMunicipioNo = lstLocalesDadoCircuitoMunicipioNo;
    }
    
    
     private CartesianChartModel graficaMunicipioCircuitos() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            lstCircuitos = FCircuito.obtenerCircuito();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstLocalesDadoCircuitoMunicipioSi = FFichaLocales.ObtenerDatosDadoPermisoMunicipioCircuito("SI", lstCircuitos.get(i).getId_circuito());
                Si.set(lstCircuitos.get(i).getDescripcion(), lstLocalesDadoCircuitoMunicipioSi.size());
            }

            ChartSeries No = new ChartSeries();
            No.setLabel("No");
            for (int i = 0; i < lstCircuitos.size(); i++) {
                lstLocalesDadoCircuitoMunicipioNo = FFichaLocales.ObtenerDatosDadoPermisoMunicipioCircuito("NO", lstCircuitos.get(i).getId_circuito());
                No.set(lstCircuitos.get(i).getDescripcion(), lstLocalesDadoCircuitoMunicipioNo.size());
            }

           

            model.addSeries(Si);
            model.addSeries(No);
   

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;

    }
    
}
