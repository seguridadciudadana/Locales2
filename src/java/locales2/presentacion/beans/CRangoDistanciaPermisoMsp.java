package locales2.presentacion.beans;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import locales2.logica.clases.FichaLocales;
import locales2.logica.funciones.DistanciaLocalInstitucionEducativa;
import locales2.logica.funciones.FEspecificaciones;
import locales2.logica.funciones.FFichaLocales;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;


@ManagedBean
@RequestScoped


public class CRangoDistanciaPermisoMsp {
     private ArrayList<String> lstDistancias;
    private ArrayList<String> lstEspecificar;
    private CartesianChartModel lineLocales;
    
     @PostConstruct
    private void graficar() {
        this.lineLocales = graficaDistancias();
        
    }
    
    public CRangoDistanciaPermisoMsp() {
        this.graficar();
    }

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

    public CartesianChartModel getLineLocales() {
        return lineLocales;
    }

    public void setLineLocales(CartesianChartModel lineLocales) {
        this.lineLocales = lineLocales;
    }
    
    private CartesianChartModel graficaDistancias() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstDistancias = DistanciaLocalInstitucionEducativa.obtenerDistancias();
            lstEspecificar = FEspecificaciones.obtenerEspecificacion();

            ChartSeries siTiene = new ChartSeries();
            siTiene.setLabel("Si tiene");
            siTiene.set(lstDistancias.get(0), FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(0), lstEspecificar.get(0)).size());
            siTiene.set(lstDistancias.get(1), FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(1), lstEspecificar.get(0)).size());
            siTiene.set(lstDistancias.get(2), FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(2), lstEspecificar.get(0)).size());
            siTiene.set(lstDistancias.get(3), FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(3), lstEspecificar.get(0)).size());
            siTiene.set(lstDistancias.get(4), FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(4), lstEspecificar.get(0)).size());
            siTiene.set(lstDistancias.get(5), FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(5), lstEspecificar.get(0)).size());
            siTiene.set(lstDistancias.get(6), FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(6), lstEspecificar.get(0)).size());
            siTiene.set(lstDistancias.get(7), FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(7), lstEspecificar.get(0)).size());
            siTiene.set(lstDistancias.get(8), FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(8), lstEspecificar.get(0)).size());
            siTiene.set(lstDistancias.get(9), FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(9), lstEspecificar.get(0)).size());
          
            
            ChartSeries noTiene = new ChartSeries();
            noTiene.setLabel("No tiene");
            noTiene.set(lstDistancias.get(0),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(0), lstEspecificar.get(1)).size());
            noTiene.set(lstDistancias.get(1),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(1), lstEspecificar.get(1)).size());
            noTiene.set(lstDistancias.get(2),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(2), lstEspecificar.get(1)).size());
            noTiene.set(lstDistancias.get(3),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(3), lstEspecificar.get(1)).size());
            noTiene.set(lstDistancias.get(4),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(4), lstEspecificar.get(1)).size());
            noTiene.set(lstDistancias.get(5),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(5), lstEspecificar.get(1)).size());
            noTiene.set(lstDistancias.get(6),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(6), lstEspecificar.get(1)).size());
            noTiene.set(lstDistancias.get(7),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(7), lstEspecificar.get(1)).size());
            noTiene.set(lstDistancias.get(8),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(8), lstEspecificar.get(1)).size());
            noTiene.set(lstDistancias.get(9),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(9), lstEspecificar.get(1)).size());
            
           
              
            ChartSeries noPresenta = new ChartSeries();
            noPresenta.setLabel("No Presenta");
            noPresenta.set(lstDistancias.get(0),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(0), lstEspecificar.get(2)).size());
            noPresenta.set(lstDistancias.get(1),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(1), lstEspecificar.get(2)).size());
            noPresenta.set(lstDistancias.get(2),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(2), lstEspecificar.get(2)).size());
            noPresenta.set(lstDistancias.get(3),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(3), lstEspecificar.get(2)).size());
            noPresenta.set(lstDistancias.get(4),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(4), lstEspecificar.get(2)).size());
            noPresenta.set(lstDistancias.get(5),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(5), lstEspecificar.get(2)).size());
            noPresenta.set(lstDistancias.get(6),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(6), lstEspecificar.get(2)).size());
            noPresenta.set(lstDistancias.get(7),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(7), lstEspecificar.get(2)).size());
            noPresenta.set(lstDistancias.get(8),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(8), lstEspecificar.get(2)).size());                       
            noPresenta.set(lstDistancias.get(9),FFichaLocales.obtenerDatosDadoRangoDistaciaPermisoMSP(lstDistancias.get(9), lstEspecificar.get(2)).size());
            model.addSeries(siTiene);
            model.addSeries(noTiene);
            model.addSeries(noPresenta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }
}
