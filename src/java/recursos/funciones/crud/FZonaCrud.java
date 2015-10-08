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
import recursos.Zona;

/**
 *
 * @author ICITS SALA5
 */
public class FZonaCrud {

    public static ArrayList<Zona> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Zona> lst = new ArrayList<Zona>();
        Zona zona = null;
        try {
            while (rs.next()) {
                zona = new Zona(
                        rs.getInt("pid_zona"),
                        rs.getString("pdescripcion")
                );
                lst.add(zona);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Zona> obtenerZona() throws Exception {
        ArrayList<Zona> lst = new ArrayList<Zona>();
        try {
            String sql = "select * from  utiles.f_select_zona()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }

        return lst;
    }

    public static boolean insertarZona(Zona zona) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from utiles.f_insert_zona(?)";
            lstP.add(new Parametro(1, zona.getDescripcion()));
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

    public static boolean actualizarZona(Zona zona) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.f_update_subcircuito(?,?)";
            lstP.add(new Parametro(1, zona.getDescripcion()));
            lstP.add(new Parametro(2, zona.getId_zona()));
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

    public static boolean eliminar(int id_zona) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.f_delete_subcircuito(?)";
            lstP.add(new Parametro(1, id_zona));
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
