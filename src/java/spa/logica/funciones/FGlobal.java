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
import spa.logica.clases.Global;

/**
 *
 * @author oscunach
 */
public class FGlobal {

    public static ArrayList<Global> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        Global datos = null;
        try {
            while (rs.next()) {
                datos = new Global(
                        rs.getInt("pcodigo"),
                        rs.getInt("pnumero_ficha"),
                        rs.getString("pprovincia"),
                        rs.getString("pcanton"),
                        rs.getString("pbarrio"),
                        rs.getString("pinstitucion"),
                        rs.getDate("pfecha_atencion"),
                        rs.getString("papellidos_victima"),
                        rs.getString("pnombres_victima"),
                        rs.getInt("pedad_victima"),
                        rs.getString("psexo_victima"),
                        rs.getString("pinstruccion_victima"),
                        rs.getString("pestado_civil_victima"),
                        rs.getString("pocupacion_victima"),
                        rs.getString("ptelefono_victima"),
                        rs.getString("pcanton_domicilio_victima"),
                        rs.getString("pparroquia_domicilio_victima"),
                        rs.getString("pdireccion_domicilio_victima"),
                        rs.getDouble("px"),
                        rs.getDouble("py"),
                        rs.getString("pcircuito"),
                        rs.getString("psubcircuito"),
                        rs.getString("pdireccion_trabajo_victima"),
                        rs.getString("ptelefono_trabajo_victima"),
                        rs.getString("ptipo_agresion"),
                        rs.getString("pfrecuencia_agresion"),
                        rs.getString("plugar_agresion"),
                        rs.getString("pfecha_agresion"),
                        rs.getString("phora_agresion"),
                        rs.getString("pasociacion_agresion"),
                        rs.getString("pobjeto_agresion"),
                        rs.getString("pestado_conciencia_agresion"),
                        rs.getString("papellidos_agresor"),
                        rs.getString("pnombres_agresor"),
                        rs.getInt("pedad_agresor"),
                        rs.getString("psexo_agresor"),
                        rs.getString("pestado_civil_agresor"),
                        rs.getString("pinstruccion_agresor"),
                        rs.getString("pdireccion_domicilio_agresor"),
                        rs.getString("pocupacion_agresor"),
                        rs.getString("pdireccion_trabajo_agresor"),
                        rs.getString("ptelefono_agresor"),
                        rs.getString("pparentesco_victima_agresor"),
                        rs.getString("ptratamiento"),
                        rs.getString("pcaso_medico"),
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

    public static ArrayList<Global> ObtenerDatos() throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Global> ObtenerDatosDadoAnio(int anio) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global_dado_anio(?)";
            lstP.add(new Parametro(1, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Global> ObtenerDatosDadoAnioTipoAgresion(int anio) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global_dado_anio_tipo_agresion (?)";
            lstP.add(new Parametro(1, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Global> ObtenerDatosDadoAnioDadoTipoAgresion(int anio, String tipo_agresion) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global_dado_anio_dado_tipo_agresion(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, tipo_agresion));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Global> ObtenerDatosDadoAnioCircuito(int anio) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global_dado_anio_circuito (?)";
            lstP.add(new Parametro(1, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Global> ObtenerDatosDadoAnioDadoCircuito(int anio, String circuito) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global_dado_anio_dado_circuito(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Global> ObtenerDatosDadoAnioCircuitoSexo(int anio, String circuito, String sexo) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global_dado_anio_dado_circuito_dado_sexo_victima(?,?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, circuito));
            lstP.add(new Parametro(3, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Global> ObtenerDatosDadoAnioSubCircuito(int anio) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global_dado_anio_subcircuito (?)";
            lstP.add(new Parametro(1, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Global> ObtenerDatosDadoAnioDadoSubCircuito(int anio, String subcircuito) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global_dado_anio_dado_subcircuito(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Global> ObtenerDatosDadoAnioSubcircuitoSexo(int anio, String subcircuito, String sexo) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global_dado_anio_dado_subcircuito_dado_sexo_victima(?,?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, subcircuito));
            lstP.add(new Parametro(3, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Global> ObtenerDatosDadoAnioEstadoCivl(int anio) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global_dado_anio_estado_civil_victima (?)";
            lstP.add(new Parametro(1, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Global> ObtenerDatosDadoAnioDadoEstadoCivil(int anio, String estado_civil_victima) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global_dado_anio_dado_estado_civil_victima(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, estado_civil_victima));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Global> ObtenerDatosDadoAnioDadoEstadoCivilGenero(int anio, String estado_civil_victima, String sexo) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global_dado_anio_dado_estado_civil_dado_sexo_victima(?,?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, estado_civil_victima));
            lstP.add(new Parametro(3, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Global> ObtenerDatosDadoAnioSexo(int anio) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global_dado_anio_sexo_victima (?)";
            lstP.add(new Parametro(1, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Global> ObtenerDatosDadoAnioDadoSexo(int anio, String sexo_victima) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global_dado_anio_dado_sexo_victima(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, sexo_victima));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Global> ObtenerDatosDadoAnioParentescoVictimaAgresor(int anio) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global_dado_anio_parentesco_victima_agresor (?)";
            lstP.add(new Parametro(1, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Global> ObtenerDatosDadoAnioDadoParentescoVictimaAgresor(int anio, String sexo_victima) throws Exception {
        ArrayList<Global> lst = new ArrayList<Global>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_global_dado_anio_dado_parentesco_victima_agresor(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, sexo_victima));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

}
