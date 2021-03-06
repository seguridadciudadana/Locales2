
package locales2.presentacion.beans;

import locales2.logica.clases.*;
import locales2.logica.funciones.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.annotation.PostConstruct;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;
import java.util.ArrayList;

@ManagedBean
@RequestScoped
public class CActividadEconomica {
    private ArrayList<FichaLocales> lstLocalesTipoEstablecimiento;
    private ArrayList<FichaLocales> lstTotalLocalesDadoTipoEstablecimiento;
    private CartesianChartModel lineTipoEstablecimiento;
    private ArrayList<FichaLocales> lstLocalesTipo;

    public ArrayList<FichaLocales> getLstLocalesTipo() {
        return lstLocalesTipo;
    }

    public void setLstLocalesTipo(ArrayList<FichaLocales> lstLocalesTipo) {
        this.lstLocalesTipo = lstLocalesTipo;
    }
    

    public ArrayList<FichaLocales> getLstLocalesTipoEstablecimiento() {
        return lstLocalesTipoEstablecimiento;
    }

    public void setLstLocalesTipoEstablecimiento(ArrayList<FichaLocales> lstLocalesTipoEstablecimiento) {
        this.lstLocalesTipoEstablecimiento = lstLocalesTipoEstablecimiento;
    }

    public ArrayList<FichaLocales> getLstTotalLocalesDadoTipoEstablecimiento() {
        return lstTotalLocalesDadoTipoEstablecimiento;
    }

    public void setLstTotalLocalesDadoTipoEstablecimiento(ArrayList<FichaLocales> lstTotalLocalesDadoTipoEstablecimiento) {
        this.lstTotalLocalesDadoTipoEstablecimiento = lstTotalLocalesDadoTipoEstablecimiento;
    }

    public CartesianChartModel getLineTipoEstablecimiento() {
        return lineTipoEstablecimiento;
    }

    public void setLineTipoEstablecimiento(CartesianChartModel lineTipoEstablecimiento) {
        this.lineTipoEstablecimiento = lineTipoEstablecimiento;
    }
    
    @PostConstruct
     public void init() {
        graficar();
    }

      public void graficar() {
        lineTipoEstablecimiento = graficaTipoEstablecimiento();
    }
      private CartesianChartModel graficaTipoEstablecimiento(){
      CartesianChartModel model =new CartesianChartModel();
      
          try {
              lstLocalesTipo=FFichaLocales.ObtenerDatosTipoEstablecimiento();
              ChartSeries nuevo=new ChartSeries();
              nuevo.setLabel("Tipo de establecimiento");
              for (int i = 0; i < lstLocalesTipo.size(); i++) {
                    lstTotalLocalesDadoTipoEstablecimiento=FFichaLocales.ObtenerDatosDadoTipoEstablecimiento(lstLocalesTipo.get(i).getTipo_establecimiento());
               nuevo.set(lstLocalesTipo.get(i).getTipo_establecimiento(), lstTotalLocalesDadoTipoEstablecimiento.size());
                 
              }
              model.addSeries(nuevo);
          } catch (Exception e) {
               Util.addErrorMessage(e, "Error");
          }
          
          return model;
      }
}
