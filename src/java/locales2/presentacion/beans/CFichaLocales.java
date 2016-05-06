package locales2.presentacion.beans;

import java.sql.Array;
import vif.logica.clases.Circuito;
import vif.logica.funciones.FCircuito;
import vif.logica.clases.Subcircuito;
import vif.logica.funciones.FSubcircuito;
import locales2.logica.clases.FichaLocales;
import locales2.logica.funciones.FFichaLocales;
import java.util.*;
import javax.faces.context.FacesContext;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import recursos.Util;

@ManagedBean
@SessionScoped
public class CFichaLocales {

    private FichaLocales fichanew;
    private String codCircuito;
    private String codSubCircuito;

    private ArrayList<Circuito> circuitoLista;
   private ArrayList<Subcircuito> subcircuitoLista;

    public ArrayList<Circuito> getCircuitoLista() {
        return circuitoLista;
    }

    public void setCircuitoLista(ArrayList<Circuito> circuitoLista) {
        this.circuitoLista = circuitoLista;
    }

    public ArrayList<Subcircuito> getSubcircuitoLista() {
        return subcircuitoLista;
    }

    public void setSubcircuitoLista(ArrayList<Subcircuito> subcircuitoLista) {
        this.subcircuitoLista = subcircuitoLista;
    }
   
    
    
    public FichaLocales getFichanew() {
        return fichanew;
    }

    public void setFichanew(FichaLocales fichanew) {
        this.fichanew = fichanew;
    }

    public String getCodCircuito() {
        return codCircuito;
    }

    public void setCodCircuito(String codCircuito) {
        this.codCircuito = codCircuito;
    }

    public String getCodSubCircuito() {
        return codSubCircuito;
    }

    public void setCodSubCircuito(String codSubCircuito) {
        this.codSubCircuito = codSubCircuito;
    }

    public CFichaLocales() throws Exception {
        fichanew=new FichaLocales();
        circuitoLista=FCircuito.obtenerCircuito();
        subcircuitoLista=FSubcircuito.obtenerSubcircuito();
    }

    
    public  String insertar() throws Exception{
        fichanew.setId_circuito(FCircuito.ObtenerCircuitoDadoId(Integer.parseInt(codCircuito)));
        fichanew.setId_subcircuito(FSubcircuito.ObtenerSubcircuitoDadoId(Integer.parseInt(codSubCircuito)));
        FFichaLocales.insertarFichasLocales(fichanew);
        return "frmFichaLocales?transition=slide";
    }
    
    
    
    
}
