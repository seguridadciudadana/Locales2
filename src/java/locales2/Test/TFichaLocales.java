/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locales2.Test;

import java.util.List;
import locales2.logica.clases.*;
import locales2.logica.funciones.*;

public class TFichaLocales {

    public static void main (String [] args) throws Exception{
        
//    List<FichaLocales> lista= FFichaLocales.ObtenerDatosParroquia();
//        for(FichaLocales n: lista){
//            System.out.println(n.getTipo_establecimiento());
//        }
//         List<FichaLocales> lista= FFichaLocales.ObtenerDatosDadoRucoRiseParroquias("RISE", 1);
//        for(FichaLocales n: lista){
//            System.out.println(n.getSri());
//        }
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
        
//              List<FichaLocales> l=FFichaLocales.ObtenerDatosEstadoEstablecimiento();
//      for(FichaLocales n:l){
//          System.out.println(n.getTipo_establecimiento());
          
//               List<FichaLocales> les=FFichaLocales.ObtenerDatosDadoTipoEstablecimiento("ABARROTES");
//      for(FichaLocales n:les){
//          System.out.println(n.getTipo_establecimiento());
//      }
//        
        
//         List<FichaLocales> les=FFichaLocales.ObtenerLocalesDadoCircuito(20);
//      for(FichaLocales n:les){
//          System.out.println(n.getNombre_propietario());
//      }
        
//         List<Circuito> les=FCircuito.obtenerCircuito();
//      for(Circuito n:les){
//          System.out.println(n.getDescripcion());
//      }
        
//        List<SubCircuito> les=FSubCircuito.obtenerSubCircuito();
//      for(SubCircuito n:les){
//          System.out.println(n.getDescripcion());
//      }
        
//        List<FichaLocales> les=FFichaLocales.ObtenerLocalesDadoSubcircuito(19);
//      for(FichaLocales n:les){
//          System.out.println(n.getEstado_local());
//      }
//         List<FichaLocales> les=FFichaLocales.ObtenerDatos();
//      for(FichaLocales n:les){
//          System.out.println(n.getCedula_propietario());
//      }
//        List<FichaLocales> les=FFichaLocales.ObtenerDatosDadoPermisoMunicipioBarrio("SI","LA ESPERANZA");
//      for(FichaLocales n:les){
//          System.out.println(n.getCedula_propietario());
//      }
        
        List<FichaLocales> les=FFichaLocales.ObtenerDatosBarrios();
      for(FichaLocales n:les){
          System.out.println(n.getCedula_propietario());
      }
    }
}
