/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import geoportal.logica.clases.VictimasReincidentes2010;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Oscunach
 */
public class FVictimasReincidentes {
    
    public static ArrayList<VictimasReincidentes2010> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<VictimasReincidentes2010> lst = new ArrayList<VictimasReincidentes2010>();
        VictimasReincidentes2010 datos = null;
        try {
            while (rs.next()) {
                datos = new VictimasReincidentes2010(rs.getInt("preincidencia"),rs.getString("pvictima"),rs.getString("psexo"));
                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
    public static ArrayList<VictimasReincidentes2010> ObtenerDatos() throws Exception {
        ArrayList<VictimasReincidentes2010> lst = new ArrayList<VictimasReincidentes2010>();
        try {
            String sql = "select * from geoportal.f_select_reincidentes_2010()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<VictimasReincidentes2010> ObtenerDatosDadoReincidencias(int pe) throws Exception {
        ArrayList<VictimasReincidentes2010> lst = new ArrayList<VictimasReincidentes2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_reincidentes_2010_dado_reincidencia(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<VictimasReincidentes2010> ObtenerDatosDadoReincidenciasSexo(int pe,String sexo) throws Exception {
        ArrayList<VictimasReincidentes2010> lst = new ArrayList<VictimasReincidentes2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_reincidentes_2010_dado_reincidencia_sexo(?,?)";
            lstP.add(new Parametro(1, pe));
            lstP.add(new Parametro(2, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
}
