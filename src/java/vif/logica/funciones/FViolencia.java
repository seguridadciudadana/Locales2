/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vif.logica.funciones;

import accesodatos.ConjuntoResultado;
import java.util.ArrayList;
import accesodatos.AccesoDatos;
import accesodatos.Parametro;
import java.sql.SQLException;
import vif.logica.clases.Violencia;

/**
 *
 * @author Oscunach
 */
public class FViolencia {

    public static ArrayList<Violencia> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Violencia> lst = new ArrayList<Violencia>();
        Violencia violencia = null;
        try {
            while (rs.next()) {
                violencia = new Violencia(rs.getInt("pid_violencia"), rs.getString("ptipo"), rs.getString("pdescripcion"));
                lst.add(violencia);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
public static ArrayList<Violencia> obtenerViolencia() throws Exception {
        ArrayList<Violencia> lst = new ArrayList<Violencia>();
        try {
            String sql = "select * from vif.f_select_violencia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
            
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        
        return lst;
    }
}
