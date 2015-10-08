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
        ArrayList<String> lst = new ArrayList<String>();
        ArrayList<String> lstMes = new ArrayList<String>();
        ArrayList<String> lstDistancia = new ArrayList<String>();
        ArrayList<String> lstEspecificar = new ArrayList<String>();
        ArrayList<String> lstEsatdo = new ArrayList<String>();
        ArrayList<Global> lstDatos = new ArrayList<Global>();

//        lst = MesesDias.obtenerDias();
//        lstMes = MesesDias.obtenerMeses();
//        lstDistancia = Distancia.obtenerDistancias();
//        lstEspecificar = Especificar.obtenerEspecificacion();
//        System.out.println("test " + lst.get(4));
//        System.out.println("test " + lstMes.get(4));
//
//        System.out.println("test de distancias " + lstDistancia.get(0));
//        System.out.println("test de distancias " + lstDistancia.get(1));
//        System.out.println("test de distancias " + lstDistancia.size());
//
//        System.out.println("test de especificaciones " + lstEspecificar.get(0));
//        System.out.println("test de especificaciones " + lstEspecificar.get(1));
//        System.out.println("test de especificaciones " + lstEspecificar.get(2));
//        lstEsatdo = Especificar.obtenerEstado();
//
//        System.out.println(lstEsatdo.get(0));
//
//        for (int i = 0; i < lstDistancia.size(); i++) {
//            System.out.println(lstDistancia.get(i));
//        }
//
//        lst = CircuitosSubcircuitos.obtenerCircuitosUrbanos();
//        for (int i = 0; i < lst.size(); i++) {
//            System.out.println(lst.get(i) + " posicion: " + i);}
        //lst = CircuitoSubcircuitoRural.obtenerCircuitoRural();
        // for (int i = 0; i < lst.size(); i++) {
        //        System.out.println(lst.get(i) + " posicion: " + i);
        //     }
        //lstDatos = FGlobal.ObtenerDatosDadoAnioTipoAgresion(2013);
        lstDatos = FGlobal.ObtenerDatosDadoAnioDadoCircuito(2013,"CAMINO AL SOL");
        for (int i = 0; i < lstDatos.size(); i++) {
            System.out.println(lstDatos.get(i).getCircuito()+ " posicion: " + i);

        }

    }

}
