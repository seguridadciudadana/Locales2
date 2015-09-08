package locales.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import locales.logica.clases.Locales;
import locales.logica.funciones.FLocales;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Distancia;
import recursos.Especificar;

/**
 *
 * @author oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorRangoDistanciaPermisoMI {

    private ArrayList<String> lstDistancias;
    private ArrayList<String> lstEspecificar;
    private ArrayList<Locales> lstLocales;
    private ArrayList<Locales> lstDadoRango;
    private ArrayList<Locales> lstDadoEstado;
    private CartesianChartModel lineLocales;

    public ArrayList<String> getLstDistancias() {
        return lstDistancias;
    }

    public void setLstDistancias(ArrayList<String> lstDistancias) {
        this.lstDistancias = lstDistancias;
    }

    public ArrayList<String> getLstEspecificar() {
        return lstEspecificar;
    }

    public void setLstEspecificar(ArrayList<String> lstEspecificar) {
        this.lstEspecificar = lstEspecificar;
    }

    public ArrayList<Locales> getLstLocales() {
        return lstLocales;
    }

    public void setLstLocales(ArrayList<Locales> lstLocales) {
        this.lstLocales = lstLocales;
    }

    public ArrayList<Locales> getLstDadoRango() {
        return lstDadoRango;
    }

    public void setLstDadoRango(ArrayList<Locales> lstDadoRango) {
        this.lstDadoRango = lstDadoRango;
    }

    public ArrayList<Locales> getLstDadoEstado() {
        return lstDadoEstado;
    }

    public void setLstDadoEstado(ArrayList<Locales> lstDadoEstado) {
        this.lstDadoEstado = lstDadoEstado;
    }

    public CartesianChartModel getLineLocales() {
        return lineLocales;
    }

    public void setLineLocales(CartesianChartModel lineLocales) {
        this.lineLocales = lineLocales;
    }

    @PostConstruct
    private void graficar() {
        this.lineLocales = graficaDistancias();

    }

    public ControladorRangoDistanciaPermisoMI() {
        this.graficar();
    }

    private CartesianChartModel graficaDistancias() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDistancias = Distancia.obtenerDistancias();
            lstEspecificar = Especificar.obtenerEspecificacion();

//            lstLocales = FLocales.ObtenerDatos();
            ChartSeries siTiene = new ChartSeries();
            siTiene.setLabel("Si tiene");
            siTiene.set(lstDistancias.get(0), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(0), lstEspecificar.get(0)).size());
            siTiene.set(lstDistancias.get(1), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(1), lstEspecificar.get(0)).size());
            siTiene.set(lstDistancias.get(2), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(2), lstEspecificar.get(0)).size());
            siTiene.set(lstDistancias.get(3), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(3), lstEspecificar.get(0)).size());
            siTiene.set(lstDistancias.get(4), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(4), lstEspecificar.get(0)).size());
            siTiene.set(lstDistancias.get(5), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(5), lstEspecificar.get(0)).size());
            siTiene.set(lstDistancias.get(6), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(6), lstEspecificar.get(0)).size());
            siTiene.set(lstDistancias.get(7), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(7), lstEspecificar.get(0)).size());
            siTiene.set(lstDistancias.get(8), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(8), lstEspecificar.get(0)).size());

            ChartSeries noTiene = new ChartSeries();
            noTiene.setLabel("No tiene");
            noTiene.set(lstDistancias.get(0), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(0), lstEspecificar.get(1)).size());
            noTiene.set(lstDistancias.get(1), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(1), lstEspecificar.get(1)).size());
            noTiene.set(lstDistancias.get(2), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(2), lstEspecificar.get(1)).size());
            noTiene.set(lstDistancias.get(3), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(3), lstEspecificar.get(1)).size());
            noTiene.set(lstDistancias.get(4), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(4), lstEspecificar.get(1)).size());
            noTiene.set(lstDistancias.get(5), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(5), lstEspecificar.get(1)).size());
            noTiene.set(lstDistancias.get(6), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(6), lstEspecificar.get(1)).size());
            noTiene.set(lstDistancias.get(7), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(7), lstEspecificar.get(1)).size());
            noTiene.set(lstDistancias.get(8), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(8), lstEspecificar.get(1)).size());

            ChartSeries noPresenta = new ChartSeries();
            noPresenta.setLabel("No Presenta");
            noPresenta.set(lstDistancias.get(0), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(0), lstEspecificar.get(2)).size());
            noPresenta.set(lstDistancias.get(1), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(1), lstEspecificar.get(2)).size());
            noPresenta.set(lstDistancias.get(2), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(2), lstEspecificar.get(2)).size());
            noPresenta.set(lstDistancias.get(3), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(3), lstEspecificar.get(2)).size());
            noPresenta.set(lstDistancias.get(4), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(4), lstEspecificar.get(2)).size());
            noPresenta.set(lstDistancias.get(5), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(5), lstEspecificar.get(2)).size());
            noPresenta.set(lstDistancias.get(6), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(6), lstEspecificar.get(2)).size());
            noPresenta.set(lstDistancias.get(7), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(7), lstEspecificar.get(2)).size());
            noPresenta.set(lstDistancias.get(8), FLocales.obtenerDatosDadoRangoDistaciaPermisoMI(lstDistancias.get(8), lstEspecificar.get(2)).size());

            model.addSeries(siTiene);
            model.addSeries(noTiene);
            model.addSeries(noPresenta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

}
