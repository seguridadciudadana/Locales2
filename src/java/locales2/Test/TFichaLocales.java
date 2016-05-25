/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locales2.Test;

import java.util.List;
import locales2.logica.clases.FichaLocales;
import locales2.logica.funciones.FFichaLocales;
public class TFichaLocales {

    public static void main (String [] args) throws Exception{
        
//    List<FichaLocales> lista= FFichaLocales.ObtenerDatosParroquia();
//        for(FichaLocales n: lista){
//            System.out.println(n.getTipo_establecimiento());
//        }
         List<FichaLocales> lista= FFichaLocales.ObtenerDatosDadoRucoRiseParroquias("RISE", 1);
        for(FichaLocales n: lista){
            System.out.println(n.getSri());
        }
//        List<FichaLocales> listas=FFichaLocales.ObtenerDatosEstadoEstablecimiento();
//      for(FichaLocales n:listas){
//          System.out.println(n.getEstado_local());
//      
//      }
//      List<FichaLocales> ls=FFichaLocales.ObtenerDatos();
//      for(FichaLocales n:ls){
//          System.out.println(n.getNombre_propietario());
//      
//      }
      
//      List<FichaLocales> ls2=FFichaLocales.ObtenerDatosDadoTipoEstablecimiento("ABARROTES");
//      for(FichaLocales n:ls2){
//          System.out.println(n.getTipo_establecimiento());
//      
//      }
    }
}
