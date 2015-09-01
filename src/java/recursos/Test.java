/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import java.util.ArrayList;
import recursos.MesesDias;
import recursos.Distancia;

/**
 *
 * @author Oscunach
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        ArrayList<String> lst = new ArrayList<String>();
        ArrayList<String> lstMes = new ArrayList<String>();
         ArrayList<String> lstDistancia = new ArrayList<String>();
        lst=MesesDias.obtenerDias();
        lstMes=MesesDias.obtenerMeses();
        lstDistancia= Distancia.obtenerDistancias();
        System.out.println("test "+lst.get(4));
        System.out.println("test "+lstMes.get(4));
        
        System.out.println("test de distancias "+lstDistancia.get(0));
        for (int i=0; i<lstDistancia.size();i++){
            System.out.println("test de distancias: "+lstDistancia.get(i));
        }
        

    }

}
