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
                denuncia = new Denuncia(rs.getInt("pid_denuncia"),rs.getDate("pfecha_denuncia"),rs.getString("pdenunciante"),FVictima.ObtenerVictimaDadoId(rs.getInt("pid_victima")),rs.getDouble("px"),rs.getDouble("py"),
                                        FCircuito.ObtenerCircuitoDadoId(rs.getInt("pid_circuito")),FSubcircuito.ObtenerSubcircuitoDadoId(rs.getInt("pid_subcircuito")),FAgresor.ObtenerAgresorDadoId(rs.getInt("pid_agresor")),
                                        rs.getString("prelacion_victima_agresor"),rs.getInt("pnumero_hijos"),FViolencia.ObtenerViolenciaDadoId(rs.getInt("pid_tipo_violencia")),rs.getDate("pfecha_agresion"),
                                        rs.getTime("phora_agresion"),rs.getString("pmedidas_amparo"),rs.getString("psentencia"),rs.getString("papelacion"));
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
            String sql = "select * from vif.f_insert_denuncia(?,?,?)";
            lstP.add(new Parametro(1, denuncia.getFecha()));            
            
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
