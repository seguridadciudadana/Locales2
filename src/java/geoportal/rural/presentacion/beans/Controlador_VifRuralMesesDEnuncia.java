/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.rural.presentacion.beans;

import geoportal.rural.logica.clases.VifRural2011;
import geoportal.rural.logica.funciones.FVifRural2011;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import recursos.Util;
import recursos.MesesDias;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class Controlador_VifRuralMesesDEnuncia {

    /**
     * Creates a new instance of Controlador_VifRuralMesesDEnuncia
     */
    private ArrayList<String> lstMeses;
    private ArrayList<String> lstSemana;
    private ArrayList<VifRural2011> lstDatos;
    private ArrayList<VifRural2011> lstDadoMes;
    private ArrayList<VifRural2011> lstDadoMesSexoM;
    private ArrayList<VifRural2011> lstDadoMesSexoF;
    private CartesianChartModel lineMeses;
    private CartesianChartModel lineMesesSexoVictima;
    private CartesianChartModel lineMeses2012;
    private CartesianChartModel lineMesesSexoVictima2012;
    private CartesianChartModel lineDias2011;
    private CartesianChartModel lineDias2012;
    private CartesianChartModel lineDiasSexoVictima2011;
    private CartesianChartModel lineDiasSexoVictima2012;

    public CartesianChartModel getLineDias2011() {
        return lineDias2011;
    }

    public void setLineDias2011(CartesianChartModel lineDias2011) {
        this.lineDias2011 = lineDias2011;
    }

    public CartesianChartModel getLineDias2012() {
        return lineDias2012;
    }

    public void setLineDias2012(CartesianChartModel lineDias2012) {
        this.lineDias2012 = lineDias2012;
    }

    public CartesianChartModel getLineDiasSexoVictima2011() {
        return lineDiasSexoVictima2011;
    }

    public void setLineDiasSexoVictima2011(CartesianChartModel lineDiasSexoVictima2011) {
        this.lineDiasSexoVictima2011 = lineDiasSexoVictima2011;
    }

    public CartesianChartModel getLineDiasSexoVictima2012() {
        return lineDiasSexoVictima2012;
    }

    public void setLineDiasSexoVictima2012(CartesianChartModel lineDiasSexoVictima2012) {
        this.lineDiasSexoVictima2012 = lineDiasSexoVictima2012;
    }

    public CartesianChartModel getLineMeses2012() {
        return lineMeses2012;
    }

    public void setLineMeses2012(CartesianChartModel lineMeses2012) {
        this.lineMeses2012 = lineMeses2012;
    }

    public CartesianChartModel getLineMesesSexoVictima2012() {
        return lineMesesSexoVictima2012;
    }

    public void setLineMesesSexoVictima2012(CartesianChartModel lineMesesSexoVictima2012) {
        this.lineMesesSexoVictima2012 = lineMesesSexoVictima2012;
    }

    public ArrayList<VifRural2011> getLstDadoMesSexoM() {
        return lstDadoMesSexoM;
    }

    public void setLstDadoMesSexoM(ArrayList<VifRural2011> lstDadoMesSexoM) {
        this.lstDadoMesSexoM = lstDadoMesSexoM;
    }

    public ArrayList<VifRural2011> getLstDadoMesSexoF() {
        return lstDadoMesSexoF;
    }

    public void setLstDadoMesSexoF(ArrayList<VifRural2011> lstDadoMesSexoF) {
        this.lstDadoMesSexoF = lstDadoMesSexoF;
    }

    public CartesianChartModel getLineMeses() {
        return lineMeses;
    }

    public void setLineMeses(CartesianChartModel lineMeses) {
        this.lineMeses = lineMeses;
    }

    public CartesianChartModel getLineMesesSexoVictima() {
        return lineMesesSexoVictima;
    }

    public void setLineMesesSexoVictima(CartesianChartModel lineMesesSexoVictima) {
        this.lineMesesSexoVictima = lineMesesSexoVictima;
    }

    public ArrayList<VifRural2011> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<VifRural2011> lstDatos) {
        this.lstDatos = lstDatos;
    }

    public ArrayList<VifRural2011> getLstDadoMes() {
        return lstDadoMes;
    }

    public void setLstDadoMes(ArrayList<VifRural2011> lstDadoMes) {
        this.lstDadoMes = lstDadoMes;
    }

    public ArrayList<String> getLstMeses() {
        return lstMeses;
    }

    public void setLstMeses(ArrayList<String> lstMeses) {
        this.lstMeses = lstMeses;
    }

    public ArrayList<String> getLstSemana() {
        return lstSemana;
    }

    public void setLstSemana(ArrayList<String> lstSemana) {
        this.lstSemana = lstSemana;

    }

    @PostConstruct
    private void graficar() {
        this.lineMeses = graficoMeses2011();
        this.lineMesesSexoVictima = graficoMeses2011SexoVictima();
        this.lineMeses2012 = graficoMeses2012();
        this.lineMesesSexoVictima2012 = graficoMeses2012SexoVictima();
        this.lineDias2011 = graficoDias2011();
        this.lineDias2012 = graficoDias2012();
        this.lineDiasSexoVictima2011 = graficoDias2011SexoVictima();
        this.lineDiasSexoVictima2012 = graficoDias2012SexoVictima();
    }

    private void reinit() {
        this.graficar();
    }

    public Controlador_VifRuralMesesDEnuncia() {
        this.reinit();

    }

    private CartesianChartModel graficoMeses2011() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstDatos = FVifRural2011.ObtenerDatosDadoAnio(2011);
            lstMeses = MesesDias.obtenerMeses();
            ChartSeries meses = new ChartSeries();
            meses.setLabel("Meses");
            for (int i = 0; i < lstMeses.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    lstDadoMes = FVifRural2011.ObtenerDatosDadoMesDadoAnio(lstMeses.get(i), 2011);
                    meses.set(lstMeses.get(i), lstDadoMes.size());
                }
            }
            model1.addSeries(meses);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    private CartesianChartModel graficoMeses2011SexoVictima() {
        CartesianChartModel model2 = new CartesianChartModel();
        try {
            lstDatos = FVifRural2011.ObtenerDatosDadoAnio(2011);
            lstMeses = MesesDias.obtenerMeses();
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            for (int i = 0; i < lstMeses.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    lstDadoMesSexoF = FVifRural2011.ObtenerDatosDadoMesDadoSexoDadoAnio(lstMeses.get(i), "F", 2011);
                    femenino.set(lstMeses.get(i), lstDadoMesSexoF.size());
                }
            }

            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");
            for (int i = 0; i < lstMeses.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    lstDadoMesSexoM = FVifRural2011.ObtenerDatosDadoMesDadoSexoDadoAnio(lstMeses.get(i), "M", 2011);
                    masculino.set(lstMeses.get(i), lstDadoMesSexoM.size());
                }
            }

            model2.addSeries(femenino);
            model2.addSeries(masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model2;
    }

    private CartesianChartModel graficoMeses2012() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstDatos = FVifRural2011.ObtenerDatosDadoAnio(2012);
            lstMeses = MesesDias.obtenerMeses();
            ChartSeries meses = new ChartSeries();
            meses.setLabel("Meses");
            for (int i = 0; i < lstMeses.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    lstDadoMes = FVifRural2011.ObtenerDatosDadoMesDadoAnio(lstMeses.get(i), 2012);
                    meses.set(lstMeses.get(i), lstDadoMes.size());
                }
            }
            model1.addSeries(meses);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    private CartesianChartModel graficoMeses2012SexoVictima() {
        CartesianChartModel model2 = new CartesianChartModel();
        try {
            lstDatos = FVifRural2011.ObtenerDatosDadoAnio(2012);
            lstMeses = MesesDias.obtenerMeses();
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            for (int i = 0; i < lstMeses.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    lstDadoMesSexoF = FVifRural2011.ObtenerDatosDadoMesDadoSexoDadoAnio(lstMeses.get(i), "F", 2012);
                    femenino.set(lstMeses.get(i), lstDadoMesSexoF.size());
                }
            }

            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");
            for (int i = 0; i < lstMeses.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    lstDadoMesSexoM = FVifRural2011.ObtenerDatosDadoMesDadoSexoDadoAnio(lstMeses.get(i), "M", 2012);
                    masculino.set(lstMeses.get(i), lstDadoMesSexoM.size());
                }
            }

            model2.addSeries(femenino);
            model2.addSeries(masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model2;
    }

    private CartesianChartModel graficoDias2011() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstDatos = FVifRural2011.ObtenerDatosDadoAnio(2011);
            lstMeses = MesesDias.obtenerDias();
            ChartSeries meses = new ChartSeries();
            meses.setLabel("Dias de la Semana");
            for (int i = 0; i < lstMeses.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    lstDadoMes = FVifRural2011.ObtenerDatosDadoAnioDadoDia(2011, lstMeses.get(i));
                    meses.set(lstMeses.get(i), lstDadoMes.size());
                }
            }
            model1.addSeries(meses);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    private CartesianChartModel graficoDias2011SexoVictima() {
        CartesianChartModel model2 = new CartesianChartModel();
        try {
            lstDatos = FVifRural2011.ObtenerDatosDadoAnio(2011);
            lstMeses = MesesDias.obtenerDias();
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            for (int i = 0; i < lstMeses.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    lstDadoMesSexoF = FVifRural2011.ObtenerDatosDadoAnioDadoDiaDadoSexo(2011, lstMeses.get(i), "F");
                    femenino.set(lstMeses.get(i), lstDadoMesSexoF.size());
                }
            }

            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");
            for (int i = 0; i < lstMeses.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    lstDadoMesSexoM = FVifRural2011.ObtenerDatosDadoAnioDadoDiaDadoSexo(2011, lstMeses.get(i), "M");
                    masculino.set(lstMeses.get(i), lstDadoMesSexoM.size());
                }
            }
            model2.addSeries(femenino);
            model2.addSeries(masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model2;
    }

    private CartesianChartModel graficoDias2012() {
        CartesianChartModel model1 = new CartesianChartModel();
        try {
            lstDatos = FVifRural2011.ObtenerDatosDadoAnio(2012);
            lstMeses = MesesDias.obtenerDias();
            ChartSeries meses = new ChartSeries();
            meses.setLabel("Dias de la Semana");
            for (int i = 0; i < lstMeses.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    lstDadoMes = FVifRural2011.ObtenerDatosDadoAnioDadoDia(2012, lstMeses.get(i));
                    meses.set(lstMeses.get(i), lstDadoMes.size());
                }
            }
            model1.addSeries(meses);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model1;
    }

    private CartesianChartModel graficoDias2012SexoVictima() {
        CartesianChartModel model2 = new CartesianChartModel();
        try {
            lstDatos = FVifRural2011.ObtenerDatosDadoAnio(2012);
            lstMeses = MesesDias.obtenerDias();
            ChartSeries femenino = new ChartSeries();
            femenino.setLabel("femenino");
            for (int i = 0; i < lstMeses.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    lstDadoMesSexoF = FVifRural2011.ObtenerDatosDadoAnioDadoDiaDadoSexo(2012, lstMeses.get(i), "F");
                    femenino.set(lstMeses.get(i), lstDadoMesSexoF.size());
                }
            }

            ChartSeries masculino = new ChartSeries();
            masculino.setLabel("masculino");
            for (int i = 0; i < lstMeses.size(); i++) {
                for (int j = 0; j < lstDatos.size(); j++) {
                    lstDadoMesSexoM = FVifRural2011.ObtenerDatosDadoAnioDadoDiaDadoSexo(2012, lstMeses.get(i), "M");
                    masculino.set(lstMeses.get(i), lstDadoMesSexoM.size());
                }
            }
            model2.addSeries(femenino);
            model2.addSeries(masculino);

        } catch (Exception e) {
            Util.addErrorMessage(e, "Error");
        }
        return model2;
    }

}
