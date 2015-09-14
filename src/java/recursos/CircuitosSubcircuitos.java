/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import java.util.ArrayList;

/**
 *
 * @author Oscunach
 */
public class CircuitosSubcircuitos {

    public static ArrayList<String> obtenerCircuitosUrbanos() {
        ArrayList<String> lst = new ArrayList<String>();
        try {
            lst.add("24 DE MAYO");
            lst.add("CAMILO PONCE");
            lst.add("CAMINOS AL SOL");
            lst.add("LA CONDAMINE");
            lst.add("LA ESTACION");
            lst.add("LA PAZ");
            lst.add("LA PRIMAVERA");
            lst.add("POLITECNICA");
            lst.add("PUCARA");
            lst.add("SAN ALFONSO");
            lst.add("SHOPPING");
            lst.add("TERMINAL TERRESTRE");
            lst.add("YARUQUIES");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return lst;
    }

}
