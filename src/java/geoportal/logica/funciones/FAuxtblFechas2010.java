/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import geoportal.logica.clases.AuxtblFechas2010;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Oscunach
 */
public class FAuxtblFechas2010 {

    public static ArrayList<AuxtblFechas2010> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<AuxtblFechas2010> lst = new ArrayList<AuxtblFechas2010>();
        AuxtblFechas2010 datos = null;
        try {
            while (rs.next()) {
                datos = new AuxtblFechas2010(rs.getString("pvictima"), rs.getString("psexo"), rs.getString("pfecha"));

                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<AuxtblFechas2010> ObtenerDatos() throws Exception {
        ArrayList<AuxtblFechas2010> lst = new ArrayList<AuxtblFechas2010>();
        try {
            String sql = "select * from geoportal.f_select_auxtbl_fechas2010()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<AuxtblFechas2010> ObtenerDatosDadoMesDia(String dia_o_mes) throws Exception {
        ArrayList<AuxtblFechas2010> lst = new ArrayList<AuxtblFechas2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_auxtbl_fechas2010_dado_dia(?)";
            lstP.add(new Parametro(1, dia_o_mes));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<AuxtblFechas2010> ObtenerDatosDadoMesDiaSexo(String sexo, String dia_o_mes) throws Exception {
        ArrayList<AuxtblFechas2010> lst = new ArrayList<AuxtblFechas2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_auxtbl_fechas2010_dado_mes_dia_sexo(?,?)";
            lstP.add(new Parametro(1, sexo));
            lstP.add(new Parametro(2, dia_o_mes));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

}
