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
    private FichaLocales fichaNew;
    private List<Circuito> circuitoList;
    private List<Subcircuito> subcircuitoList;
    private String codCircuito;
    private String codSubcircuito;

    public CFichaLocales()throws Exception{
        
        circuitoList=FCircuito.obtenerC();
        subcircuitoList=FSubcircuito.obtenerS();
        fichaNew = new FichaLocales();
    }

    public FichaLocales getFichaNew() {
        return fichaNew;
    }

    public void setFichaNew(FichaLocales fichaNew) {
        this.fichaNew = fichaNew;
    }

    public List<Circuito> getCircuitoList() {
        return circuitoList;
    }

    public void setCircuitoList(List<Circuito> circuitoList) {
        this.circuitoList = circuitoList;
    }

    public List<Subcircuito> getSubcircuitoList() {
        return subcircuitoList;
    }

    public void setSubcircuitoList(List<Subcircuito> subcircuitoList) {
        this.subcircuitoList = subcircuitoList;
    }

    public String getCodCircuito() {
        return codCircuito;
    }

    public void setCodCircuito(String codCircuito) {
        this.codCircuito = codCircuito;
    }

    public String getCodSubcircuito() {
        return codSubcircuito;
    }

    public void setCodSubcircuito(String codSubcircuito) {
        this.codSubcircuito = codSubcircuito;
    }
    
    
}
