/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.Parametro;
import accesodatos.ConjuntoResultado;
import java.util.ArrayList;
import geoportal.logica.clases.Vif_2012;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Geovanny Cudco
 */
public class FVif_2012 {

    public static ArrayList<Vif_2012> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        Vif_2012 datos = null;
        try {
            while (rs.next()) {
                datos = new Vif_2012(rs.getDate("pfecha_denuncia"),
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
                        rs.getString("pedad_agresor"),
                        rs.getString("pdomiciliado_agresor"),
                        rs.getString("pestado_civil_agresor"),
                        rs.getString("pnivel_de_instruccion_agresor"),
                        rs.getString("pocupacion_agresor"),
                        rs.getString("pparentesco_victima_agresor"),
                        rs.getString("pnumero_hijos_comun"),
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

    public static ArrayList<Vif_2012> ObtenerDatos() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    //---------------------------------------PARA CONTRASTES DATOS 2012 ---------------------------------------------
    public static ArrayList<Vif_2012> ObtenerDatosMujerHombre() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_mujer_hombre()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosMujerMujer() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_mujer_mujer()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosHombreHombre() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_hombre_hombre()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosHombreMujer() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_hombre_mujer()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    //---------------------------------------PARA CONTRASTES DATOS 2012 ---------------------------------------------

    /*public static ArrayList<Vif_2012> ObtenerDatosDadoCircuitoTipoViolencia(String circuito, String tViolencia) throws Exception {
     ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
     try {
     ArrayList<Parametro> lstP = new ArrayList<Parametro>();
     String sql = "select * from geoportal.f_select_vif_2012_dado_circuito_tipo_violencia(?,?)";
     lstP.add(new Parametro(1, circuito));
     lstP.add(new Parametro(2, tViolencia));
     ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

     lst = llenarDatos(rs);
     rs = null;
     } catch (SQLException exConec) {
     throw new Exception(exConec.getMessage());
     }
     return lst;
     }*/
    public static ArrayList<Vif_2012> ObtenerDatosDadoSubCircuitoTipoViolencia(String subcircuito, String tViolencia) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_subcircuito_tipo_violencia(?,?)";
            lstP.add(new Parametro(1, subcircuito));
            lstP.add(new Parametro(2, tViolencia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    /*
     funciones de las victimas
     */
    public static ArrayList<Vif_2012> ObtenerDatosVictima() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_busqueda_victima()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    /*
     funciones circuitos
     */
    public static ArrayList<Vif_2012> ObtenerDatosCircuito() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_busqueda_circuito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosCircuito2() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_busqueda_circuito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    /*
     funciones circuitos
     */

    public static ArrayList<Vif_2012> ObtenerDatosSubcircuito() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_busqueda_subcircuito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosDadoCircuito(String circuito) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_circuito(?)";
            lstP.add(new Parametro(1, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosDadoSubcircuito(String subcircuito) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_subcircuito(?)";
            lstP.add(new Parametro(1, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosDadoCircuitoSexo(String circuito, String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2010_2_dado_circuito_sexo(?,?)";
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

    public static ArrayList<Vif_2012> ObtenerDatosDadoCircuitoSexoVictima(String circuito, String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_circuito_sexo_victima(?,?)";
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
    
    public static ArrayList<Vif_2012> ObtenerDatosDadoMesAgresion(String mes) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_mes_agresion(?)";
            lstP.add(new Parametro(1, mes));            
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2012> ObtenerDatosDadoMesDenuncia(String mes) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_mes_denuncia(?)";
            lstP.add(new Parametro(1, mes));            
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
    
    public static ArrayList<Vif_2012> ObtenerDatosDadoMesAgresionSexoVictima(String mes, String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_mes_agresion_sexo_victima(?,?)";
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
    
    public static ArrayList<Vif_2012> ObtenerDatosDadoMesDenunciaSexoVictima(String mes, String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_mes_denuncia_sexo_victima(?,?)";
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
    
    
    public static ArrayList<Vif_2012> ObtenerDatosDadoDiaAgresionSexoVictima(String dia, String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_dia_agresion_sexo_victima(?,?)";
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
    
    public static ArrayList<Vif_2012> ObtenerDatosDadoDiaDenunciaSexoVictima(String dia, String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_dia_denuncia_sexo_victima(?,?)";
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
    
    
    

    public static ArrayList<Vif_2012> ObtenerDatosDadoSubCircuitoSexoVictima(String sexo, String subcircuito) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_subcircuito_sexo_victima(?,?)";
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

    public static ArrayList<Vif_2012> ObtenerDatosDadoCodigoSubCircuitoSexoVictima(String sexo, String subcircuito) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_subcircuito_sexo_victima2(?,?)";
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

    public static ArrayList<Vif_2012> ObtenerDatosDadoTipoViolenciaSexoVictima(String sexo, String violencia) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * geoportal.f_select_vif_2012_dado_violencia_sexo_victima(?,?)";
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

    public static ArrayList<Vif_2012> ObtenerDatosDadoTipoViolencia(String violencia) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_tipo_violencia(?)";
            lstP.add(new Parametro(1, violencia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosTipoViolencia() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_tipo_violencia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosEnero() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_enero()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosFebrero() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_febrero()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosMarzo() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_marzo()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosAbril() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_abril()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosMayo() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_mayo()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosJunio() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_junio()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosJulio() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_julio()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosAgosto() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_agosto()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSeptiembre() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_septiembre()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosOctubre() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_octubre()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosNoviembre() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_noviembre()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosDiciembre() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_diciembre()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaEnero(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_enero(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaFebrero(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_febrero(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaMarzo(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_marzo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaAbril(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_abril(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaMayo(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_mayo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaJunio(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_junio(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaJulio(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_julio(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaAgosto(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_agosto(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaSeptiembre(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_septiembre(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaOctubre(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_octubre(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaNoviembre(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_noviembre(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaDiciembre(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_diciembre(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaEdad1(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_rango1(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaEdad2(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_rango2(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaEdad3(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_rango3(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaEdad4(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_rango4(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaEdad5(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_rango5(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaEdad6(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_rango6(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosSexoVictimaEdad7(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_sexo_victima_rango7(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosDadoCircuitoTipoViolencia(String circuito, String violencia) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_circuito_violencia(?,?)";
            lstP.add(new Parametro(1, circuito));
            lstP.add(new Parametro(2, violencia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosParentesco() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_parentesco()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosDadoParentesco(String parentesco) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_parentesco(?)";
            lstP.add(new Parametro(1, parentesco));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosDiaDenuncia(int dia) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_busqueda_dia_agresion(?)";
            lstP.add(new Parametro(1, dia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosDiaDenunciaSexoVictima(int dia, String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_dia_agresion_sexo_victima(?,?)";
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

    public static ArrayList<Vif_2012> ObtenerDatosDadoDiaAgresion(int dia) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * geoportal.f_select_vif_2012_dado_dia_agresion(?)";
            lstP.add(new Parametro(1, dia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosDadoDiaAgresion2(String dia) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_dia_agresion2(?)";
            lstP.add(new Parametro(1, dia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Vif_2012> ObtenerDatosDadoDiaDenuncia(String dia) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_dia_denuncia(?)";
            lstP.add(new Parametro(1, dia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    

    public static ArrayList<Vif_2012> ObtenerDatosDadoEstadoCivil(String pe) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_estado_civil_victima(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<Vif_2012> ObtenerDatosDadoEstadoCivilSexoVictima(String ec,String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_estado_civil_sexo_victima(?,?)";
            lstP.add(new Parametro(1, ec));
            lstP.add(new Parametro(2, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosEstadoCivil() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_estado_civil_victima()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    //ocupaciones victimas
    //
    //
    public static ArrayList<Vif_2012> ObtenerDatosVictimaComerciante() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_comerciante()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosVictimaComercianteDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_comerciante_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
    
    public static ArrayList<Vif_2012> ObtenerDatosVictimaQueHaceres() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_que_haceres()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosVictimaQueHaceresDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_que_haceres_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2012> ObtenerDatosVictimaEmpleadoPrivado() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_empleado_privado()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosVictimaEmpleadoPrivadoDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_empleado_privado_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
    public static ArrayList<Vif_2012> ObtenerDatosVictimaEmpleadoPublico() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_empleado_publico()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2012> ObtenerDatosVictimaEmpleadoPublicoDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_empleado_publico_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosVictimaEstudiantes() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_estudiante()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosVictimaEstudiantesDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_estudiante_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2012> ObtenerDatosVictimaJornalero() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_jornalero()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2012> ObtenerDatosVictimaJornaleroDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_jornalero_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosVictimaJubilado() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_jubilado()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2012> ObtenerDatosVictimaJubiladoDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_jubilado_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosVictimaProfesional() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_profesionales()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2012> ObtenerDatosVictimaProfesionalDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_profesionales_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2012> ObtenerDatosVictimaOcupacionNA() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_ocupacion_na()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosVictimaOcupacionNADadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_ocupacion_na_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2012> ObtenerDatosVictimaDesempleado() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_desempleado()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2012> ObtenerDatosVictimaDesempleadoDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_desempleado_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Vif_2012> ObtenerDatosVictimaDiscapacitado() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_discapacitados()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
     public static ArrayList<Vif_2012> ObtenerDatosVictimaDiscapacitadoDadoSexo(String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_discapacitados_dado_sexo(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
 //
    //   
//FIN DE OCUPACIONES
    //--------------------------------------------------TIPO VIOLENCIA - SEXO-------------------------------------------------

    public static ArrayList<Vif_2012> ObtenerDatosDadoTipoViolenciaSexo(String violencia, String sexo) throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_vif_2012_dado_tipo_violencia_sexo(?,?)";
            lstP.add(new Parametro(1, violencia));
            lstP.add(new Parametro(2, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    //--------------------------------------------------TIPO VIOLENCIA - SEXO-------------------------------------------------
    
    public static ArrayList<Vif_2012> ObtenerDatosVictimaHombre() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_hombres()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Vif_2012> ObtenerDatosVictimaMujer() throws Exception {
        ArrayList<Vif_2012> lst = new ArrayList<Vif_2012>();
        try {
            String sql = "select * from geoportal.f_select_vif_2012_mujeres()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
}
