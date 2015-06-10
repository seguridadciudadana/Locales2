/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import geoportal.logica.clases.Vif_2011;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Oscunach
 */
public class FVif_2011 {

    public static ArrayList<Vif_2011> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        Vif_2011 datos = null;
        try {
            while (rs.next()) {
                datos = new Vif_2011(rs.getDate("pfecha_denuncia"),
                        rs.getString("pdenunciante"),
                        rs.getString("pvictima"),
                        rs.getString("psexo_victima"),
                        rs.getString("pdireccion_victima"),
                        rs.getDouble("px"),
                        rs.getDouble("py"),
                        rs.getString("pcircuito"),
                        rs.getString("pcodigo_circuito"),
                        rs.getString("psubcircuito"),
                        rs.getString("pcodigo_subcircuito"),
                        rs.getString("pdomiciliado_victima"),
                        rs.getInt("pedad_victima"),
                        rs.getString("pestado_civil_victima"),
                        rs.getString("pnivel_de_instruccion_victima"),
                        rs.getString("pocupacion"),
                        rs.getString("pagresor"),
                        rs.getString("psexo_agresor"),
                        rs.getString("pdireccion_agresor"),
                        rs.getInt("pedad_agresor"),
                        rs.getString("pdomiciliado_agresor"),
                        rs.getString("pestado_civil_agresor"),
                        rs.getString("pnivel_de_instruccion_agresor"),
                        rs.getString("pocupacion_agresor"),
                        rs.getString("pparentesco_victima_agresor"),
                        rs.getString("pnumeros_hijos_comun"),
                        rs.getString("plugar_agresion"),
                        rs.getString("ptipo_de_violencia"),
                        rs.getDate("pfecha_agresion"),
                        rs.getString("phora_de_agresion"),
                        rs.getString("pmedidas_de_amparo"),
                        rs.getString("psentencia"),
                        rs.getString("papelacion"),
                        rs.getString("pboletas_anteriores"),
                        rs.getString("pobservaciones"),
                        rs.getString("pboletas_de_remision"),
                        rs.getInt("pid")
                );

                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Vif_2011> ObtenerDatos() throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            String sql = "select * from geoportal.select_vif2011()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2011> ObtenerDatosVictima() throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            String sql = "select * from geoportal.select_vif2011_victimas()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2011> ObtenerDatosAgresor() throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            String sql = "select * from geoportal.select_vif2011_agresor()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2011> ObtenerDatosCircuito() throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            String sql = "select * from geoportal.select_vif2011_circuito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2011> ObtenerDatosSubcircuito() throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            String sql = "select * from geoportal.select_vif2011_subcircuito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2011> ObtenerDatosDadoCircuito(String circuito) throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.select_vif2011_dado_circuito(?)";
            lstP.add(new Parametro(1, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Vif_2011> ObtenerDatosDadoSubcircuito(String subcircuito) throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.select_vif2011_dado_subcircuito(?)";
            lstP.add(new Parametro(1, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Vif_2011> ObtenerDatosDadoCircuitoSexo(String circuito, String sexo) throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.select_vif2011_dado_circuito_sexo(?,?)";
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

    public static ArrayList<Vif_2011> ObtenerDatosDadoCircuitoSexoVictima(String circuito, String sexo) throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.select_vif2011_dado_circuito_sexo_victima(?,?)";
            lstP.add(new Parametro(1, circuito));
            lstP.add(new Parametro(2, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2011> ObtenerDatosDadoSubCircuitoSexo(String sexo, String subcircuito) throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.select_vif2011_dado_subcircuito_sexo(?,?)";
            lstP.add(new Parametro(1, sexo));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2011> ObtenerDatosDadoSubCircuitoSexoVictima(String sexo, String subcircuito) throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.select_vif2011_dado_subcircuito_sexo_victima(?,?)";
            lstP.add(new Parametro(1, sexo));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2011> ObtenerDatosDadoTipoViolenciaSexoVictima(String sexo, String violencia) throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.select_vif2011_dado_violencia_sexo_victima(?,?)";
            lstP.add(new Parametro(1, sexo));
            lstP.add(new Parametro(2, violencia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
        public static ArrayList<Vif_2011> ObtenerDatosDadoTipoViolencia(String violencia) throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.select_vif2011_dado_tipo_violencia(?)";
            lstP.add(new Parametro(1, violencia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Vif_2011> ObtenerDatosTipoViolencia() throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            String sql = "select * from geoportal.select_vif2011_tipo_violencia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2011> ObtenerDatosSexoVictimaEdad1(String sexo) throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2011_dado_sexo_victima_rango1(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2011> ObtenerDatosSexoVictimaEdad2(String sexo) throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2011_dado_sexo_victima_rango2(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    public static ArrayList<Vif_2011> ObtenerDatosSexoVictimaEdad3(String sexo) throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2011_dado_sexo_victima_rango3(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2011> ObtenerDatosSexoVictimaEdad4(String sexo) throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2011_dado_sexo_victima_rango4(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2011> ObtenerDatosSexoVictimaEdad5(String sexo) throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2011_dado_sexo_victima_rango5(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2011> ObtenerDatosSexoVictimaEdad6(String sexo) throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2011_dado_sexo_victima_rango6(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2011> ObtenerDatosSexoVictimaEdad7(String sexo) throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2011_dado_sexo_victima_rango7(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2011> ObtenerDatosVictimasEdad1() throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            String sql = "select * from geoportal.f_select_vif_2011_edad_victima_rango1()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2011> ObtenerDatosVictimasEdad2() throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            String sql = "select * from geoportal.f_select_vif_2011_edad_victima_rango2()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    public static ArrayList<Vif_2011> ObtenerDatosVictimasEdad3() throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            String sql = "select * from geoportal.f_select_vif_2011_edad_victima_rango3()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    public static ArrayList<Vif_2011> ObtenerDatosVictimasEdad4() throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            String sql = "select * from geoportal.f_select_vif_2011_edad_victima_rango4()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    public static ArrayList<Vif_2011> ObtenerDatosVictimasEdad5() throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            String sql = "select * from geoportal.f_select_vif_2011_edad_victima_rango5()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    public static ArrayList<Vif_2011> ObtenerDatosVictimasEdad6() throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            String sql = "select * from geoportal.f_select_vif_2011_edad_victima_rango6()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    public static ArrayList<Vif_2011> ObtenerDatosVictimasEdad7() throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            String sql = "select * from geoportal.f_select_vif_2011_edad_victima_rango7()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    public static ArrayList<Vif_2011> ObtenerDatosDadoDiaAgresion(int dia) throws Exception {
        ArrayList<Vif_2011> lst = new ArrayList<Vif_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.select_vif2011_dado_dia_agresion(?)";
            lstP.add(new Parametro(1, dia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
}
