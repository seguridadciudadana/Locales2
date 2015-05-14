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
import vif.logica.clases.Agresor;
import vif.logica.clases.Circuito;
import vif.logica.clases.Subcircuito;
import vif.logica.clases.Denuncia;
import vif.logica.clases.Victima;
import vif.logica.clases.Violencia;
import vif.logica.funciones.FAgresor;
import vif.logica.funciones.FCircuito;
import vif.logica.funciones.FSubcircuito;
import vif.logica.funciones.FVictima;
import vif.logica.funciones.FViolencia;

/**
 *
 * @author Oscunach
 */
public class FDenuncia {

    //llenar datos
    public static ArrayList<Denuncia> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Denuncia> lst = new ArrayList<Denuncia>();
        Denuncia denuncia = null;
        try {
            while (rs.next()) {
                denuncia = new Denuncia(rs.getInt("pid_denucnia"), 
                                        rs.getDate("pfecha"), 
                                        rs.getString("pdenunciante"), 
                                        FVictima.ObtenerVictimaDadoId(rs.getInt("pid_victima")), 
                                        rs.getDouble("px"), 
                                        rs.getDouble("py"),
                                        FCircuito.ObtenerCircuitoDadoId(rs.getInt("pid_circuito")),     
                                        FSubcircuito.ObtenerSubcircuitoDadoId(rs.getInt("pid_subcircuito")), 
                                        FAgresor.ObtenerAgresorDadoId(rs.getInt("pid_agresor")),
                                        rs.getString("prelacion_victima_agresor"), 
                                        rs.getInt("pnumero_hijos"), 
                                        FViolencia.ObtenerViolenciaDadoId(rs.getInt("pid_tipo_violencia")), 
                                        rs.getDate("pfecha_agresion"),
                                        rs.getTime("phora_agresion"), 
                                        rs.getString("pmedidas_amparo"), 
                                        rs.getString("psentencia"), 
                                        rs.getString("papelacion"));
                lst.add(denuncia);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Denuncia> obtenerDenuncia() throws Exception {
        ArrayList<Denuncia> lst = new ArrayList<Denuncia>();
        try {
            String sql = "select * from vif.f_select_denuncia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }

        return lst;
    }

    public static boolean insertarDenuncia(Denuncia denuncia) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.f_insert_denuncia(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, denuncia.getFecha()));
            lstP.add(new Parametro(2, denuncia.getDenunciante()));
            lstP.add(new Parametro(3, denuncia.getId_victima().getId_victima()));
            lstP.add(new Parametro(4, denuncia.getX()));
            lstP.add(new Parametro(5, denuncia.getY()));
            lstP.add(new Parametro(6, denuncia.getId_circuito().getId_circuito()));
            lstP.add(new Parametro(7, denuncia.getId_subcircuito().getId_subcircuito()));
            lstP.add(new Parametro(8, denuncia.getId_agresor().getId_agresor()));
            lstP.add(new Parametro(9, denuncia.getRelacion_victima_agresor()));
            lstP.add(new Parametro(10, denuncia.getNumero_hijos()));
            lstP.add(new Parametro(11, denuncia.getId_tipo_violencia().getId_violencia()));
            lstP.add(new Parametro(12, denuncia.getFecha_agresion()));
            lstP.add(new Parametro(13, denuncia.getHora_agresion()));
            lstP.add(new Parametro(14, denuncia.getMedidas_amparo()));
            lstP.add(new Parametro(15, denuncia.getSentencia()));
            lstP.add(new Parametro(16, denuncia.getApelacion()));
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

    public static boolean actualizarDenuncia(Denuncia denuncia) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from vif.f_update_denuncia(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, denuncia.getFecha()));
            lstP.add(new Parametro(2, denuncia.getDenunciante()));
            lstP.add(new Parametro(3, denuncia.getId_victima().getId_victima()));
            lstP.add(new Parametro(4, denuncia.getX()));
            lstP.add(new Parametro(5, denuncia.getY()));
            lstP.add(new Parametro(6, denuncia.getId_circuito().getId_circuito()));
            lstP.add(new Parametro(7, denuncia.getId_subcircuito().getId_subcircuito()));
            lstP.add(new Parametro(8, denuncia.getId_agresor().getId_agresor()));
            lstP.add(new Parametro(9, denuncia.getRelacion_victima_agresor()));
            lstP.add(new Parametro(10, denuncia.getNumero_hijos()));
            lstP.add(new Parametro(11, denuncia.getId_tipo_violencia().getId_violencia()));
            lstP.add(new Parametro(12, denuncia.getFecha_agresion()));
            lstP.add(new Parametro(13, denuncia.getHora_agresion()));
            lstP.add(new Parametro(14, denuncia.getMedidas_amparo()));
            lstP.add(new Parametro(15, denuncia.getSentencia()));
            lstP.add(new Parametro(16, denuncia.getApelacion()));
            lstP.add(new Parametro(17, denuncia.getId_denucnia()));
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
            String sql = "select * from vif.f_delete_denuncia(?)";
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

}
