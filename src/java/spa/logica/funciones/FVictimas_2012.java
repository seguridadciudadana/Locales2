/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import spa.logica.clases.Victimas_2012;

/**
 *
 * @author Oscunach
 */
public class FVictimas_2012 {

    public static ArrayList<Victimas_2012> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        Victimas_2012 datos = null;
        try {
            while (rs.next()) {
                datos = new Victimas_2012(
                        rs.getInt("pn_denuncia"),
                        rs.getString("pprovincia"),
                        rs.getString("pcanton"),
                        rs.getString("pbarrio"),
                        rs.getString("pinstitucio"),
                        rs.getDate("pfecha_de_a"),
                        rs.getString("papellido_v"),
                        rs.getString("pnombres_vi"),
                        rs.getInt("pedad_victi"),
                        rs.getString("psexo_victi"),
                        rs.getString("pinstruccio"),
                        rs.getInt("panios_curs"),
                        rs.getString("pestado_civ"),
                        rs.getString("pocupacion_"),
                        rs.getString("ptelefono_v"),
                        rs.getString("pcanton1"),
                        rs.getString("pparroquia"),
                        rs.getString("pcalles"),
                        rs.getDouble("px"),
                        rs.getDouble("py"),
                        rs.getString("pcircuito"),
                        rs.getString("pcod_circui"),
                        rs.getString("psubcircuit"),
                        rs.getString("pcod_subcir"),
                        rs.getString("pdireccion_"),
                        rs.getString("ptelefono_t"),
                        rs.getString("ptipos_agre"),
                        rs.getString("pfrecuencia"),
                        rs.getString("plugar_agre"),
                        rs.getDate("pfecha_agre"),
                        rs.getString("phora_agres"),
                        rs.getString("pasociacion"),
                        rs.getString("pobjeto_agr"),
                        rs.getString("pestado_de_"),
                        rs.getString("prelacion_p"),
                        rs.getString("ptratamient"),
                        rs.getString("pcaso_medic"),
                        rs.getString("preferido")
                );
                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Victimas_2012> ObtenerDatos() throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2012> ObtenerDatosDadoSexoVictima(String sexo) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_sexo_victima(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2012> ObtenerDatosDadoCircuito(String sexo) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_circuito(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2012> ObtenerDatosDadoSubCircuito(String sexo) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_subcircuito(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
    public static ArrayList<Victimas_2012> ObtenerDatosDadoViolencia(String pe) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_violencia(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2012> ObtenerDatosDadoSexoVictimaCircuito(String sexo, String circuito) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_sexo_victima_circuito(?,?)";
            lstP.add(new Parametro(1, sexo));
            lstP.add(new Parametro(2, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2012> ObtenerDatosDadoSexoVictimaSubcircuito(String sexo, String circuito) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_sexo_victima_subcircuito(?,?)";
            lstP.add(new Parametro(1, sexo));
            lstP.add(new Parametro(2, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

}
