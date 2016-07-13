
package locales2.logica.funciones;

import java.util.ArrayList;

public class FEspecificaciones {
    public static ArrayList<String> obtenerEspecificacion() {
        ArrayList<String> lst = new ArrayList<String>();        
        lst.add("SI");
        lst.add("NO");
        lst.add("NO PRESENTA");
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
