/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import geoportal.logica.clases.Reincidencias2011;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Oscunach
 */
public class FReincidencias2011 {
    public static ArrayList<Reincidencias2011> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Reincidencias2011> lst = new ArrayList<Reincidencias2011>();
        Reincidencias2011 datos = null;
        try {
            while (rs.next()) {
                datos = new Reincidencias2011(rs.getInt("preincidencias"),rs.getString("pvictima"));

                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
    public static ArrayList<Reincidencias2011> ObtenerDatosReincidencias() throws Exception {
        ArrayList<Reincidencias2011> lst = new ArrayList<Reincidencias2011>();
        try {
            String sql = "select * from geoportal.f_select_reincidencias_2011()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Reincidencias2011> ObtenerDatosDadoReincidencias(int pe) throws Exception {
        ArrayList<Reincidencias2011> lst = new ArrayList<Reincidencias2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_reincidencias_2011_dado_reincidencia(?)";
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
