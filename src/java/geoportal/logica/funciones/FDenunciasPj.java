/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import geoportal.logica.clases.DenunciasPj;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author servidor
 */
public class FDenunciasPj {

    public static ArrayList<DenunciasPj> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        DenunciasPj datos = null;
        try {
            while (rs.next()) {
                datos = new DenunciasPj(rs.getInt("pid"), rs.getString("pcanton"), rs.getString("pcodigo_subcircuito"), rs.getString("pdistrito"),
                        rs.getString("pcircuito"), rs.getString("psubcircuito"), rs.getString("pdireccion_agresion"), rs.getString("psector"),
                        rs.getString("pzona"), rs.getDate("pfecha_de_registro"), rs.getString("phora_de_registro"),
                        rs.getDate("pfecha_de_infraccion"), rs.getString("pmes_infraccion"), rs.getString("pdia_infraccion"),
                        rs.getString("phora_de_infraccion"), rs.getString("prango_hora"), rs.getString("pcaso"),
                        rs.getString("pnumero_de_caso"), rs.getInt("pcaso_reincidente"), rs.getString("porigen_de_informacion"),
                        rs.getString("ptipo_de_violencia"), rs.getString("pcausa_de_violencia"), rs.getString("pdescripcion_de_hechos"),
                        rs.getInt("pci_victima"), rs.getString("papellidos_victima"), rs.getString("psexo_victima"),
                        rs.getInt("pedad_victima"), rs.getString("prango_edad_victima"), rs.getString("pestado_civil_victima"),
                        rs.getString("pnacionalid_victima"), rs.getString("pprofesion_victima"), rs.getString("pinstruccion_victima"),
                        rs.getString("pnumero_telefono_victima"), rs.getString("pnovedad_con_denunciante"), rs.getString("papellidos_agresor"),
                        rs.getString("pci_agresor"), rs.getString("psexo_agresor"), rs.getInt("pedad_agresor"),
                        rs.getString("prango_edad_agresor"), rs.getString("pestado_civil_agresor"), rs.getString("pnacionalidad_agresor"),
                        rs.getString("pprofesion_agresor"), rs.getString("pinstruccion_agresor"), rs.getString("ptelefono_agresor"),
                        rs.getString("pparentezco_con_victima"), rs.getString("pnovedad_con_agresor"), rs.getString("ptipo_de_operativo"),
                        rs.getString("pactividad_operativa"), rs.getDouble("px"), rs.getDouble("py"));

                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosDenunciasPjDadoAnio(int anio) throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_denunciaspj_dado_anio(?)";
            lstP.add(new Parametro(1, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosDenunciasPjDadoAnioCircuito(int anio, String circuito) throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_denunciaspj_dado_anio_circuito(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosDenunciasPjDadoAnioCaso(int anio, String caso) throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_denunciaspj_dado_anio_caso(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, caso));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosDenunciasPjDadoAnioCasoReincidente(int anio, int caso) throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_denunciaspj_dado_anio_caso_reincidente(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, caso));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosDenunciasPjDadoAnioCircuitoSexo(int anio, String circuito, String sexo) throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_denunciaspj_dado_anio_circuito_sexo_victima(?,?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, circuito));
            lstP.add(new Parametro(3, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosDenunciasPjDadoAnioSexo(int anio, String sexo) throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_denunciaspj_dado_anio_sexo_victima(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosDenunciasPjDadoAnioSubcircuito(int anio, String subcircuito) throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_denunciaspj_dado_anio_subcircuito(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosDenunciasPjDadoAnioCausaViolencia(int anio, String causa) throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_denunciaspj_dado_anio_causa_violencia(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, causa));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosDenunciasPjDadoAnioSubcircuitoSexo(int anio, String subcircuito, String sexo) throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_denunciaspj_dado_anio_subcircuito_sexo_victima(?,?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, subcircuito));
            lstP.add(new Parametro(3, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosDenunciasPjDadoAnioMesInfraccion(int anio, String mes) throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_denunciaspj_dado_anio_mes_infraccion(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, mes));

            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosDenunciasPjDadoAnioRangoHora(int anio, String hora) throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_denunciaspj_dado_anio_rango_hora(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, hora));

            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosDenunciasPjDadoAnioTipoViolencia(int anio, String violencia) throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_denunciaspj_dado_anio_tipo_violencia(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, violencia));

            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosDenunciasPjDadoAnioDiaInfraccion(int anio, String dia) throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_denunciaspj_dado_anio_dia_infraccion(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, dia));

            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosDenunciasPjDadoAnioRangoEdad(int anio, String rango) throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_denunciaspj_dado_anio_rango_edad_victima(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, rango));

            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    
    public static ArrayList<DenunciasPj> ObtenerDatosDenunciasPjDadoAnioRangoEdadAgresor(int anio, String rango) throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal.f_select_denunciaspj_dado_anio_rango_edad_agresor(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, rango));

            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
        }
        return lst;
    }
    //OBTENER DATOS DISCTICT

    public static ArrayList<DenunciasPj> ObtenerDatosCircuito() throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            String sql = "select * from geoportal.f_select_denunciaspj_circuito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosSubcircuito() throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            String sql = "select * from geoportal.f_select_denunciaspj_subcircuito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosCaso() throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            String sql = "select * from geoportal.f_select_denunciaspj_caso()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosCasoReincidente() throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            String sql = "select * from geoportal.f_select_denunciaspj_caso_reincidente()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosCausaViolencia() throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            String sql = "select * from geoportal.f_select_denunciaspj_causa_violencia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosMeses() throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            String sql = "select * from geoportal.f_select_denunciaspj_mes()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosRangoHora() throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            String sql = "select * from geoportal.f_select_denunciaspj_rango_hora()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosTipoViolencia() throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            String sql = "select * from geoportal.f_select_denunciaspj_tipo_violencia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosDiaInfraccion() throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            String sql = "select * from geoportal.f_select_denunciaspj_dia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<DenunciasPj> ObtenerDatosRangoEdad() throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            String sql = "select * from geoportal.f_select_denunciaspj_rango_edad_victima()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<DenunciasPj> ObtenerDatosRangoEdadAgresor() throws Exception {
        ArrayList<DenunciasPj> lst = new ArrayList<DenunciasPj>();
        try {
            String sql = "select * from geoportal.f_select_denunciaspj_rango_edad_agresor()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

}
