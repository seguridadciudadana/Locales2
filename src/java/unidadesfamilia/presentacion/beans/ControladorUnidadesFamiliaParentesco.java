package unidadesfamilia.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.CartesianChartModel;
import unidadesfamilia.logica.clases.UnidadesFamilia;
import unidadesfamilia.logica.funciones.FUnidadesFamilia;

/**
 *
 * @author Gustavo Soto
 */
@ManagedBean
@RequestScoped
public class ControladorUnidadesFamiliaParentesco {

    private ArrayList<UnidadesFamilia> lstParentescos;
    private ArrayList<UnidadesFamilia> lstDatosDadoParentescos;
    private ArrayList<UnidadesFamilia> lstDatosDadoParentescoSM;
    private ArrayList<UnidadesFamilia> lstDatosDadoParentescoSF;
    private CartesianChartModel lineParentescos;
    private CartesianChartModel lineParentescos2015;
    private CartesianChartModel lineParentescos2016;
    private CartesianChartModel lineParentescoSexoVictima;
    private CartesianChartModel lineParentescoSexoVictima2015;
    private CartesianChartModel lineParentescoSexoVictima2016;
    private int anioSel;

    public int getAnioSel() {
        return anioSel;
    }

    public void setAnioSel(int anioSel) {
        this.anioSel = anioSel;
    }

    public ArrayList<UnidadesFamilia> getLstParentescos() {
        return lstParentescos;
    }

    public CartesianChartModel getLineParentescos2015() {
        return lineParentescos2015;
    }

    public void setLineParentescos2015(CartesianChartModel lineParentescos2015) {
        this.lineParentescos2015 = lineParentescos2015;
    }

    public CartesianChartModel getLineParentescos2016() {
        return lineParentescos2016;
    }

    public void setLineParentescos2016(CartesianChartModel lineParentescos2016) {
        this.lineParentescos2016 = lineParentescos2016;
    }

    public CartesianChartModel getLineParentescoSexoVictima2015() {
        return lineParentescoSexoVictima2015;
    }

    public void setLineParentescoSexoVictima2015(CartesianChartModel lineParentescoSexoVictima2015) {
        this.lineParentescoSexoVictima2015 = lineParentescoSexoVictima2015;
    }

    public CartesianChartModel getLineParentescoSexoVictima2016() {
        return lineParentescoSexoVictima2016;
    }

    public void setLineParentescoSexoVictima2016(CartesianChartModel lineParentescoSexoVictima2016) {
        this.lineParentescoSexoVictima2016 = lineParentescoSexoVictima2016;
    }
    
    
    
    public void setLstParentescos(ArrayList<UnidadesFamilia> lstParentescos) {
        this.lstParentescos = lstParentescos;
    }

    public ArrayList<UnidadesFamilia> getLstDatosDadoParentescos() {
        return lstDatosDadoParentescos;
    }

    public void setLstDatosDadoParentescos(ArrayList<UnidadesFamilia> lstDatosDadoParentescos) {
        this.lstDatosDadoParentescos = lstDatosDadoParentescos;
    }

    public ArrayList<UnidadesFamilia> getLstDatosDadoParentescoSM() {
        return lstDatosDadoParentescoSM;
    }

    public void setLstDatosDadoParentescoSM(ArrayList<UnidadesFamilia> lstDatosDadoParentescoSM) {
        this.lstDatosDadoParentescoSM = lstDatosDadoParentescoSM;
    }

    public ArrayList<UnidadesFamilia> getLstDatosDadoParentescoSF() {
        return lstDatosDadoParentescoSF;
    }

    public void setLstDatosDadoParentescoSF(ArrayList<UnidadesFamilia> lstDatosDadoParentescoSF) {
        this.lstDatosDadoParentescoSF = lstDatosDadoParentescoSF;
    }

    public CartesianChartModel getLineParentescos() {
        return lineParentescos;
    }

    public void setLineParentescos(CartesianChartModel lineParentescos) {
        this.lineParentescos = lineParentescos;
    }

    public CartesianChartModel getLineParentescoSexoVictima() {
        return lineParentescoSexoVictima;
    }

    public void setLineParentescoSexoVictima(CartesianChartModel lineParentescoSexoVictima) {
        this.lineParentescoSexoVictima = lineParentescoSexoVictima;
    }

    @PostConstruct
    public void init() {
        this.lineParentescos = graficaParentescos(anioSel);
        this.lineParentescoSexoVictima = graficaParentescoSexoVictima(anioSel);
        /*this.lineParentescos2015 = graficaParentescos2015();
        this.lineParentescoSexoVictima2015 = graficaParentescoSexoVictima2015();
        this.lineParentescos2016 = graficaParentescos2016();
        this.lineParentescoSexoVictima2016 = graficaParentescoSexoVictima2016();*/
    }
    
    public void reinit(){
    this.init();
    }
    public ControladorUnidadesFamiliaParentesco() {
        this.reinit();
    }

    private CartesianChartModel graficaParentescos(int anio) {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstParentescos = FUnidadesFamilia.obtenerDatosParentesco(anioSel);
            ChartSeries parentesco = new ChartSeries();
            
            parentesco.setLabel("Parentesco");
            for (int i = 0; i < lstParentescos.size(); i++) {
                lstDatosDadoParentescos = FUnidadesFamilia.ObtenerDatosDadoAnioParentesco(anio, lstParentescos.get(i).getParentesco_victima_agresor());
                parentesco.set(lstParentescos.get(i).getParentesco_victima_agresor(), lstDatosDadoParentescos.size());
            }
            model.addSeries(parentesco);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }
    
    private CartesianChartModel graficaParentescoSexoVictima(int anio){
    CartesianChartModel model = new CartesianChartModel();
        try {
            lstParentescos = FUnidadesFamilia.obtenerDatosParentesco(anioSel);
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            for (int i = 0; i < lstParentescos.size(); i++) {
                lstDatosDadoParentescoSF = FUnidadesFamilia.ObtenerDatosDadoAnioParentescoSexoVictima(anio, lstParentescos.get(i).getParentesco_victima_agresor(), "F");
                femenino.set(lstParentescos.get(i).getParentesco_victima_agresor(), lstDatosDadoParentescoSF.size());
            }
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");
            for (int i = 0; i < lstParentescos.size(); i++) {
                lstDatosDadoParentescoSM = FUnidadesFamilia.ObtenerDatosDadoAnioParentescoSexoVictima(anio, lstParentescos.get(i).getParentesco_victima_agresor(), "M");
                masculino.set(lstParentescos.get(i).getParentesco_victima_agresor(), lstDatosDadoParentescoSM.size());
            }

            model.addSeries(femenino);
            model.addSeries(masculino);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }
    
    private CartesianChartModel graficaParentescos2015() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstParentescos = FUnidadesFamilia.obtenerDatosParentesco(2015);
            ChartSeries parentesco = new ChartSeries();
            
            parentesco.setLabel("Parentesco");
            for (int i = 0; i < lstParentescos.size(); i++) {
                lstDatosDadoParentescos = FUnidadesFamilia.ObtenerDatosDadoAnioParentesco(2015, lstParentescos.get(i).getParentesco_victima_agresor());
                parentesco.set(lstParentescos.get(i).getParentesco_victima_agresor(), lstDatosDadoParentescos.size());
            }
            model.addSeries(parentesco);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }
    
    private CartesianChartModel graficaParentescoSexoVictima2015(){
    CartesianChartModel model = new CartesianChartModel();
        try {
            lstParentescos = FUnidadesFamilia.obtenerDatosParentesco(2015);
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            for (int i = 0; i < lstParentescos.size(); i++) {
                lstDatosDadoParentescoSF = FUnidadesFamilia.ObtenerDatosDadoAnioParentescoSexoVictima(2015, lstParentescos.get(i).getParentesco_victima_agresor(), "F");
                femenino.set(lstParentescos.get(i).getParentesco_victima_agresor(), lstDatosDadoParentescoSF.size());
            }
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");
            for (int i = 0; i < lstParentescos.size(); i++) {
                lstDatosDadoParentescoSM = FUnidadesFamilia.ObtenerDatosDadoAnioParentescoSexoVictima(2015, lstParentescos.get(i).getParentesco_victima_agresor(), "M");
                masculino.set(lstParentescos.get(i).getParentesco_victima_agresor(), lstDatosDadoParentescoSM.size());
            }

            model.addSeries(femenino);
            model.addSeries(masculino);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }
    
    private CartesianChartModel graficaParentescos2016() {
        CartesianChartModel model = new CartesianChartModel();
        try {
            lstParentescos = FUnidadesFamilia.obtenerDatosParentesco(2016);
            ChartSeries parentesco = new ChartSeries();
            
            parentesco.setLabel("Parentesco");
            for (int i = 0; i < lstParentescos.size(); i++) {
                lstDatosDadoParentescos = FUnidadesFamilia.ObtenerDatosDadoAnioParentesco(2016, lstParentescos.get(i).getParentesco_victima_agresor());
                parentesco.set(lstParentescos.get(i).getParentesco_victima_agresor(), lstDatosDadoParentescos.size());
            }
            model.addSeries(parentesco);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }
    
    private CartesianChartModel graficaParentescoSexoVictima2016(){
    CartesianChartModel model = new CartesianChartModel();
        try {
            lstParentescos = FUnidadesFamilia.obtenerDatosParentesco(2016);
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            for (int i = 0; i < lstParentescos.size(); i++) {
                lstDatosDadoParentescoSF = FUnidadesFamilia.ObtenerDatosDadoAnioParentescoSexoVictima(2016, lstParentescos.get(i).getParentesco_victima_agresor(), "F");
                femenino.set(lstParentescos.get(i).getParentesco_victima_agresor(), lstDatosDadoParentescoSF.size());
            }
            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");
            for (int i = 0; i < lstParentescos.size(); i++) {
                lstDatosDadoParentescoSM = FUnidadesFamilia.ObtenerDatosDadoAnioParentescoSexoVictima(2016, lstParentescos.get(i).getParentesco_victima_agresor(), "M");
                masculino.set(lstParentescos.get(i).getParentesco_victima_agresor(), lstDatosDadoParentescoSM.size());
            }

            model.addSeries(femenino);
            model.addSeries(masculino);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }
    
}
