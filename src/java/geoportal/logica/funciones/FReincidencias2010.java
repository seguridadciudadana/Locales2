/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import geoportal.logica.clases.Reincidencias2010;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Oscunach
 */
public class FReincidencias2010 {
    
    public static ArrayList<Reincidencias2010> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Reincidencias2010> lst = new ArrayList<Reincidencias2010>();
        Reincidencias2010 datos = null;
        try {
            while (rs.next()) {
                datos = new Reincidencias2010(rs.getInt("preincidencias"),rs.getString("pvictima"));

                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
    public static ArrayList<Reincidencias2010> ObtenerDatos() throws Exception {
        ArrayList<Reincidencias2010> lst = new ArrayList<Reincidencias2010>();
        try {
            String sql = "select * from geoportal.f_select_reincidencias_2010_2()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Reincidencias2010> ObtenerDatosDadoReincidencias(int pe) throws Exception {
        ArrayList<Reincidencias2010> lst = new ArrayList<Reincidencias2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_reincidencias_2010_2_dado_reincidencia(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
}
