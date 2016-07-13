package locales2.logica.funciones;

import java.util.ArrayList;

public class DistanciaLocalInstitucionEducativa {
    
    public static ArrayList<String> obtenerDistancias() {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("0 m");
        lst.add("1 - 100 m");
        lst.add("101 - 200 m");
        lst.add("201 - 300 m");
        lst.add("301 - 400 m");
        lst.add("401 - 500 m");
        lst.add("501 - 1000 m");
        lst.add("1001 - 1999 m");
        lst.add("2000 - 2999 m");
        lst.add("Mas de 3000 m");
        return lst;

    }
}
