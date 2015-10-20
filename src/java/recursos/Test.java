/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import recursos.MesesDias;
import recursos.Distancia;
import spa.logica.clases.Global;
import spa.logica.funciones.FGlobal;

/**
 *
 * @author Oscunach
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       ArrayList<String> lstCircuitos =CircuitoSubcircuitoUrbano.obtenerCircuitoUrbano();
       ArrayList<Global> lstCircuito2013=new ArrayList<Global>();
        for (int i=0;i<lstCircuitos.size();i++){
         lstCircuito2013=FGlobal.ObtenerDatosDadoAnioDadoCircuito(2013, lstCircuitos.get(i));
            System.out.println(lstCircuitos.get(i)+"Dimension: "+lstCircuito2013.size());
        }
    }

}
