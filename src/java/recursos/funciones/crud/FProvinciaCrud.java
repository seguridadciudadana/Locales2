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
import recursos.Provincia;

/**
 *
 * @author ICITS SALA5
 */
public class FProvinciaCrud {
    
 public static ArrayList<Provincia> llenarProvincia(ConjuntoResultado rs) throws Exception {
        ArrayList<Provincia> lst = new ArrayList<Provincia>();
        Provincia provincia = null;
        try {
            while (rs.next()) {
                provincia = new Provincia(
                        rs.getInt("pid_provincia"),
                        rs.getString("pnombre"),
                        rs.getString("pdescripcion"),
                        FZonaCrud.obtenerZonaDadoId(rs.getInt("pid_zona"))
                );
                lst.add(provincia);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Provincia> obtenerProvincia() throws Exception {
        ArrayList<Provincia> lst = new ArrayList<Provincia>();
        try {
            String sql = "select * from  utiles.utiles.f_select_provincia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarProvincia(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }

        return lst;
    }

    public static Provincia obtenerProvinciaDadoId(int id_provincia) throws Exception {
        Provincia lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.utiles.f_select_provincia_dado_id(?)";
            lstP.add(new Parametro(1, id_provincia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Provincia();
            lst = llenarProvincia(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

     public static boolean insertarProvincia(Provincia provincia) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from utiles.f_insert_provincia(?,?,?)";
            lstP.add(new Parametro(1, provincia.getNombre()));
            lstP.add(new Parametro(2, provincia.getDescripcion()));
            lstP.add(new Parametro(3, provincia.getId_zona().getId_zona()));
 
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
    
      public static boolean actualizarZona(Provincia provincia) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.utiles.f_update_provincia(?,?,?,?)";
            lstP.add(new Parametro(1, provincia.getNombre()));
            lstP.add(new Parametro(2, provincia.getDescripcion()));
            lstP.add(new Parametro(3, provincia.getId_zona().getId_zona()));
            lstP.add(new Parametro(4, provincia.getId_provincia()));
            
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
      
      public static boolean eliminarProvincia(int id_provincia) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.utiles.f_delete_provincia(?)";
            lstP.add(new Parametro(1, id_provincia));
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
