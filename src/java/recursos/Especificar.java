/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author oscunach
 */
@ManagedBean
@RequestScoped
public class Especificar {

    public static ArrayList<String> obtenerEspecificacion() {
        ArrayList<String> lst = new ArrayList<String>();        
        lst.add("Si");
        lst.add("No");
        lst.add("No Presenta");
        lst.add("Sin Especificar");
        return lst;

    }
    
     public static ArrayList<String> obtenerEstado() {
        ArrayList<String> lst = new ArrayList<String>();
        
        lst.add("ABIERTO");
        lst.add("CERRADO");        
        lst.add("SIN ESPECIFICAR");        
        return lst;

    }
    
}
