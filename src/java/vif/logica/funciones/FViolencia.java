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

    public static boolean insertarViolencia(Violencia violencia) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.f_insert_violencia(?,?)";
            lstP.add(new Parametro(1, violencia.getTipo()));
            lstP.add(new Parametro(2, violencia.getDescripcion()));
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

    public static boolean actualizarViolencia(Violencia violencia) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.f_update_violencia(?,?,?)";
            lstP.add(new Parametro(1, violencia.getTipo()));
            lstP.add(new Parametro(2, violencia.getDescripcion()));
            lstP.add(new Parametro(3, violencia.getId_violencia()));
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

    public static boolean eliminar(int codigo) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.f_delete_violencia(?)";
            lstP.add(new Parametro(1, codigo));
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
    
    
    public static Violencia ObtenerViolenciaDadoId(int id) throws Exception {
        Violencia lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.f_select_violencia_dado_id(?)";
            lstP.add(new Parametro(1, id));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Violencia();
            lst = llenarDatos(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
}
