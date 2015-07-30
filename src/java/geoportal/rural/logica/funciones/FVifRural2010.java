/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.rural.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import geoportal.rural.logica.clases.VifRural2010;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Oscunach
 */
public class FVifRural2010 {

    public static ArrayList<VifRural2010> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        VifRural2010 datos = null;
        try {
            while (rs.next()) {
                datos = new VifRural2010(rs.getDate("pfecha_denuncia"),
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
                        rs.getString("pnivel_de_instruccion"),
                        rs.getString("pocupacion_victima"),
                        rs.getString("pagresor"),
                        rs.getString("psexo_agresor"),
                        rs.getString("pdireccion_agresor"),
                        rs.getString("pedad_agresor"),
                        rs.getString("pdomiciliado_agresor"),
                        rs.getString("pestado_civil_agresor"),
                        rs.getString("pnivel_de_instruccion_agresor"),
                        rs.getString("pocupacion_agresor"),
                        rs.getString("pparentesco"),
                        rs.getString("phijos_comun"),
                        rs.getString("plugar_agresion"),
                        rs.getString("ptipo_de_violencia"),
                        rs.getString("pfecha_agresion"),
                        rs.getString("phora_de_agresion"),
                        rs.getString("pmedidas_de_amparo"),
                        rs.getString("psentencia"),
                        rs.getString("papelacion"),
                        rs.getString("pboletas_anteriores"),
                        rs.getString("pobservaciones"),
                        rs.getString("pboletas_de_remision"),
                        rs.getInt("pid"));

                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<VifRural2010> ObtenerDatos() throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2010> ObtenerDatosCircuitos() throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_circuitos()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2010> ObtenerDatosSubCircuitos() throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_subcircuitos()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2010> ObtenerDatosDadoCircuito(String circuito) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_dado_circuito(?)";
            lstP.add(new Parametro(1, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2010> ObtenerDatosDadoSubCircuito(String circuito) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_dado_subcircuito(?)";
            lstP.add(new Parametro(1, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2010> ObtenerDatosDadoCircuitoSexo(String circuito, String sexo) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_dado_sexo_circuito(?,?)";
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

    public static ArrayList<VifRural2010> ObtenerDatosDadoSubCircuitoSexo(String circuito, String sexo) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_dado_sexo_subcircuito(?,?)";
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

    public static ArrayList<VifRural2010> ObtenerDatosDadoDia(String pe) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_dado_dia(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2010> ObtenerDatosDadoDiaSexo(String dia, String sexo) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_dado_dia_sexo(?,?)";
            lstP.add(new Parametro(1, dia));
            lstP.add(new Parametro(2, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2010> ObtenerDatosDadoMes(String pe) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_dado_mes(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2010> ObtenerDatosDadoMesSexo(String mes, String sexo) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_dado_mes_sexo(?,?)";
            lstP.add(new Parametro(1, mes));
            lstP.add(new Parametro(2, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2010> ObtenerDatosDadoTipoViolencia(String pe) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_dado_tipo_violencia(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2010> ObtenerDatosTipoViolencia() throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_tipo_violencia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2010> ObtenerDatosEstadoCivil() throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_estado_civil()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2010> ObtenerDatosDadoEstadoCivil(String pe) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_dado_estado_civil_victima(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2010> ObtenerDatosRangoEdad1() throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_edad_1()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<VifRural2010> ObtenerDatosRangoEdad2() throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_edad_2()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<VifRural2010> ObtenerDatosRangoEdad3() throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_edad_3()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<VifRural2010> ObtenerDatosRangoEdad4() throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_edad_4()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<VifRural2010> ObtenerDatosRangoEdad5() throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_edad_5()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<VifRural2010> ObtenerDatosRangoEdad6() throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_edad_6()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<VifRural2010> ObtenerDatosRangoEdad7() throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_edad_7()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<VifRural2010> ObtenerDatosRangoEdad1DadoSexo(String pe) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_edad_1_dado_sexo(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<VifRural2010> ObtenerDatosRangoEdad2DadoSexo(String pe) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_edad_2_dado_sexo(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<VifRural2010> ObtenerDatosRangoEdad3DadoSexo(String pe) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_edad_3_dado_sexo(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<VifRural2010> ObtenerDatosRangoEdad4DadoSexo(String pe) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_edad_4_dado_sexo(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<VifRural2010> ObtenerDatosRangoEdad5DadoSexo(String pe) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_edad_5_dado_sexo(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<VifRural2010> ObtenerDatosRangoEdad6DadoSexo(String pe) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_edad_6_dado_sexo(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<VifRural2010> ObtenerDatosRangoEdad7DadoSexo(String pe) throws Exception {
        ArrayList<VifRural2010> lst = new ArrayList<VifRural2010>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_2010_rural_edad_7_dado_sexo(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
    
}
