/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.funciones.crud;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import recursos.Canton;

/**
 *
 * @author ICITS SALA5
 */
public class FCantonCrud {

    public static ArrayList<Canton> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Canton> lst = new ArrayList<Canton>();
        Canton canton = null;
        try {
            while (rs.next()) {
                canton = new Canton(
                        rs.getInt("pid_canton"),
                        rs.getString("pnombre"),
                        rs.getString("pdescripcion"),
                        FProvinciaCrud.obtenerProvinciaDadoId(rs.getInt("pid_provincia"))
                );
                lst.add(canton);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Canton> obtenerZona() throws Exception {
        ArrayList<Canton> lst = new ArrayList<Canton>();
        try {
            String sql = "select * from  utiles.f_select_caton()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }

        return lst;
    }

    public static Canton obtenerZonaDadoId(int id_canton) throws Exception {
        Canton lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from utiles.f_select_caton_dado_id(?)";
            lstP.add(new Parametro(1, id_canton));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Canton();
            lst = llenarDatos(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    
     public static boolean insertarCanton(Canton canton) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from utiles.f_insert_canton(?)";
            lstP.add(new Parametro(1, canton.getNombre()));
            lstP.add(new Parametro(2, canton.getDescripcion()));
            lstP.add(new Parametro(3, canton.getId_provincia().getId_provincia()));
 
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;

    }
    
     public static boolean actualizarCanton(Canton canton) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from utiles.f_update_canton(?,?,?,?)";
            lstP.add(new Parametro(1, canton.getNombre()));
            lstP.add(new Parametro(2, canton.getDescripcion()));
            lstP.add(new Parametro(3, canton.getId_provincia().getId_provincia()));
            lstP.add(new Parametro(4, canton.getId_canton()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
        return eje;
    }
     
     
     public static boolean eliminarCanton(int id_canton) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from utiles.f_delete_canton(?)";
            lstP.add(new Parametro(1, id_canton));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    } 
     
     
     
}
