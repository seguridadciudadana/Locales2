/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes.templates;

import geoportal.logica.clases.Vif_2010;
import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author servidor
 */
public class prueba1 implements JRDataSource{
    private ArrayList<Vif_2010> lista = new ArrayList<Vif_2010>();
    private int indiceActual = -1;
    
    @Override
    public boolean next() throws JRException {
       return ++indiceActual < lista.size();
    }
    
    public void addAsistente(Vif_2010 Asistente){

        this.lista.add(Asistente);

    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
       Object valor = null;

        if ("id".equals(jrf.getName())){

            valor = lista.get(indiceActual).getId();

        }
        else if ("circuito".equals(jrf.getName())){

            valor = lista.get(indiceActual).getCircuito();

        }
        else if ("tipo de violencia".equals(jrf.getName())){

            valor = lista.get(indiceActual).getTipo_de_vi();

        }
        else if ("sexo victima".equals(jrf.getName())){
            valor = lista.get(indiceActual).getSexo_victi();
        }

        return valor;
    }
}

