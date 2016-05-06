
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
    private FichaLocales fichaSel;
    private FichaLocales fichaDel;
    private FichaLocales fichaMod;
    private Circuito circuitoSel;

    public Circuito getCircuitoSel() {
        return circuitoSel;
    }

    public void setCircuitoSel(Circuito circuitoSel) {
        this.circuitoSel = circuitoSel;
    }
    
    private ArrayList<Circuito> listaCircuito;
    private String codCircuito;
    
    
    private List<Subcircuito> listaSubCircuito;
    private String codSubCircuito;

    public FichaLocales getFichaNew() {
        return fichaNew;
    }

    public void setFichaNew(FichaLocales fichaNew) {
        this.fichaNew = fichaNew;
    }

    public FichaLocales getFichaSel() {
        return fichaSel;
    }

    public void setFichaSel(FichaLocales fichaSel) {
        this.fichaSel = fichaSel;
    }

    public FichaLocales getFichaDel() {
        return fichaDel;
    }

    public void setFichaDel(FichaLocales fichaDel) {
        this.fichaDel = fichaDel;
    }

    public FichaLocales getFichaMod() {
        return fichaMod;
    }

    public void setFichaMod(FichaLocales fichaMod) {
        this.fichaMod = fichaMod;
    }

    public ArrayList<Circuito> getListaCircuito() {
        return listaCircuito;
    }

    public void setListaCircuito(ArrayList<Circuito> listaCircuito) {
        this.listaCircuito = listaCircuito;
    }

    public String getCodCircuito() {
        return codCircuito;
    }

    public void setCodCircuito(String codCircuito) {
        this.codCircuito = codCircuito;
    }

    public List<Subcircuito> getListaSubCircuito() {
        return listaSubCircuito;
    }

    public void setListaSubCircuito(List<Subcircuito> listaSubCircuito) {
        this.listaSubCircuito = listaSubCircuito;
    }

    public String getCodSubCircuito() {
        return codSubCircuito;
    }

    public void setCodSubCircuito(String codSubCircuito) {
        this.codSubCircuito = codSubCircuito;
    }
    
    

    public CFichaLocales() {
       this.reint();
        
    }
    public void reint(){
        this.circuitoSel=new Circuito();
    this.listaCircuito=new ArrayList<Circuito>();
    this.listaSubCircuito=new ArrayList<Subcircuito>();
   // this.obtnerCircuito();
    }
     public void obtnerCircuito() {
        try {
            this.listaCircuito = FCircuito.obtenerCircuito();
            this.circuitoSel = listaCircuito.get(0);
            System.out.println(listaCircuito.get(0).getId_circuito());
        } catch (Exception e) {
            Util.addErrorMessage("public void obtnerCircuito dice:" + e.getMessage());
            System.out.println("public void obtnerCircuito dice:" + e.getMessage());
        }

    }
}
    
    
    

  
