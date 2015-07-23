/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes.templates;

import geoportal.logica.clases.Vif_2010;
import java.util.ArrayList;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author servidor
 */
public class prueba implements JRDataSource {

    private int indiceDetalle = -1;
    private ArrayList<Vif_2010> listaViolencia2010 = new ArrayList<Vif_2010>();

    
   
    public Object getFieldValue(JRField jrField) throws JRException {
        Object valor = null;
        if ("circuito".equals(jrField.getName())) {
            valor = listaViolencia2010.get(indiceDetalle).getCircuito();

        } else if ("tipo_de_vi".equals(jrField.getName())) {
            valor = listaViolencia2010.get(indiceDetalle).getTipo_de_vi();
        }
        return valor;
    }

    
    public boolean next() throws JRException {
        return ++indiceDetalle < listaViolencia2010.size();

    }

    public void addDetalle(Vif_2010 detalle) {
        this.listaViolencia2010.add(detalle);
    }
}
