
package locales2.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import locales2.logica.clases.FichaLocales;
import locales2.logica.funciones.FFichaLocales;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;

@ManagedBean
@RequestScoped

public class CBarrioPermisoMunicipio {
    
    private CartesianChartModel lineLocalesBarrios;
    private ArrayList<FichaLocales> lstLocales;
    private ArrayList<FichaLocales> lstLocalesDadoBarrio;
    private ArrayList<FichaLocales> lstLocalesBarrios;
    private ArrayList<FichaLocales> lstLocalesDadoBarrioSi;
    private ArrayList<FichaLocales> lstLocalesDadoBarrioNo;
    private ArrayList<FichaLocales> lstLocalesDadoBarrioNoPresenta;

    public CartesianChartModel getLineLocalesBarrios() {
        return lineLocalesBarrios;
    }

    public void setLineLocalesBarrios(CartesianChartModel lineLocalesBarrios) {
        this.lineLocalesBarrios = lineLocalesBarrios;
    }

    public ArrayList<FichaLocales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<FichaLocales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoBarrio() {
        return lstLocalesDadoBarrio;
    }

    public void setLstLocalesDadoBarrio(ArrayList<FichaLocales> lstLocalesDadoBarrio) {
        this.lstLocalesDadoBarrio = lstLocalesDadoBarrio;
    }

    public ArrayList<FichaLocales> getLstLocalesBarrios() {
        return lstLocalesBarrios;
    }

    public void setLstLocalesBarrios(ArrayList<FichaLocales> lstLocalesBarrios) {
        this.lstLocalesBarrios = lstLocalesBarrios;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoBarrioSi() {
        return lstLocalesDadoBarrioSi;
    }

    public void setLstLocalesDadoBarrioSi(ArrayList<FichaLocales> lstLocalesDadoBarrioSi) {
        this.lstLocalesDadoBarrioSi = lstLocalesDadoBarrioSi;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoBarrioNo() {
        return lstLocalesDadoBarrioNo;
    }

    public void setLstLocalesDadoBarrioNo(ArrayList<FichaLocales> lstLocalesDadoBarrioNo) {
        this.lstLocalesDadoBarrioNo = lstLocalesDadoBarrioNo;
    }

    public ArrayList<FichaLocales> getLstLocalesDadoBarrioNoPresenta() {
        return lstLocalesDadoBarrioNoPresenta;
    }

    public void setLstLocalesDadoBarrioNoPresenta(ArrayList<FichaLocales> lstLocalesDadoBarrioNoPresenta) {
        this.lstLocalesDadoBarrioNoPresenta = lstLocalesDadoBarrioNoPresenta;
    }

    @PostConstruct
    public void init() {
        graficar();
    }

    public void graficar() {
        this.lineLocalesBarrios = graficaBarrios();

    }

    private void reinit() {
        this.init();
    }

    public CBarrioPermisoMunicipio() {
        this.reinit();
    }

    

    private CartesianChartModel graficaBarrios() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstLocalesBarrios = FFichaLocales.ObtenerDatosBarrios();
            ChartSeries Si = new ChartSeries();
            Si.setLabel("Si");
            for (FichaLocales lstLocalesBarrio : lstLocalesBarrios) {
                lstLocalesDadoBarrioSi = FFichaLocales.ObtenerDatosDadoPermisoMunicipioBarrio("SI", lstLocalesBarrio.getBarrio());
                Si.set(lstLocalesBarrio.getBarrio(), lstLocalesDadoBarrioSi.size());
            }
            ChartSeries No = new ChartSeries();
            No.setLabel("No");
            for (FichaLocales lstLocalesBarrio : lstLocalesBarrios) {
                lstLocalesDadoBarrioNo = FFichaLocales.ObtenerDatosDadoPermisoMunicipioBarrio("NO", lstLocalesBarrio.getBarrio());
                No.set(lstLocalesBarrio.getBarrio(), lstLocalesDadoBarrioNo.size());
            }

            ChartSeries NoPresenta = new ChartSeries();
            NoPresenta.setLabel("No Presenta");
            for (FichaLocales lstLocalesBarrio : lstLocalesBarrios) {
                lstLocalesDadoBarrioNoPresenta = FFichaLocales.ObtenerDatosDadoPermisoMunicipioBarrio("NO PRESENTA", lstLocalesBarrio.getBarrio());
                NoPresenta.set(lstLocalesBarrio.getBarrio(), lstLocalesDadoBarrioNoPresenta.size());
            }

            model.addSeries(No);
            model.addSeries(Si);
            model.addSeries(NoPresenta);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model;
    }
}
