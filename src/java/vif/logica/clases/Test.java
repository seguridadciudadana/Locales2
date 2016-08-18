/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vif.logica.clases;
import java.util.ArrayList;
import vif.logica.clases.*;
import vif.logica.funciones.*;

/**
 *
 * @author Mars
 */
public class Test {
    public static void main (String [] args) throws Exception{
    
        ArrayList<Circuito> les=FCircuito.obtenerCircuito();
      for(Circuito n:les){
          System.out.println(n.getDescripcion());
      }
    }
    
}
