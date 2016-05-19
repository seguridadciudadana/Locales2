/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locales2.Test;
import locales2.logica.clases.FichaLocales;
import locales2.logica.funciones.*;
import vif.logica.clases.*;
import vif.logica.funciones.*;
/**
 *
 * @author Mars
 */

public class Ficha{
    static final int ejem=1;
     public static void main(String[] args) throws Exception
    {
        
         Circuito cir=FCircuito.ObtenerCircuitoDadoId(10);
         Subcircuito sub=FSubcircuito.ObtenerSubcircuitoDadoId(22);
 FichaLocales ficha =new FichaLocales(ejem,1, "ejemplo2", cir, sub, "ejemplo", null, 2, null, null, null, null, null, 654, 24, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 564, null, 8, 9, null, null, null, null, null);
 boolean ne=FFichaLocales.insertarFichasLocales(ficha);
}
}