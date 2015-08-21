package geoportal.rural.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import geoportal.rural.logica.clases.VifRural2011;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gustavo Soto
 */
public class FVifRural2011 {

    public static ArrayList<VifRural2011> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        VifRural2011 datos = null;
        try {
            while (rs.next()) {
                datos = new VifRural2011(
                        rs.getDate("pfecha_denuncia"),
                        rs.getString("pdenunciante"),
                        rs.getString("pvictima"),
                        rs.getString("psexo_victima"),
                        rs.getString("pdireccion_victima"),
                        rs.getDouble("px"),
                        rs.getDouble("py"),
                        rs.getString("pcircuito"),
                        rs.getString("psubcircuito"),
                        rs.getString("pcodigo_subcircuito"),
                        rs.getString("pdomiciliado_victima"),
                        rs.getInt("pedad_victima"),
                        rs.getString("pestado_civil_victima"),
                        rs.getString("pinstruccion_victima"),
                        rs.getString("pocupacion_victima"),
                        rs.getString("pagresor"),
                        rs.getString("psexo_agresor"),
                        rs.getString("pdireccion_agresor"),
                        rs.getString("pedad_agresor"),
                        rs.getString("pdomiciliado_agresor"),
                        rs.getString("pestado_civil_agresor"),
                        rs.getString("pinstruccion_agresor"),
                        rs.getString("pocupacion_agresor"),
                        rs.getString("pparentesco_victima_agresor"),
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

    public static ArrayList<VifRural2011> ObtenerDatos() throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_2011_rural()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosCircuitos() throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_2011_rural_circuitos()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosSubcircuitos() throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_rural_busqueda_subcircuito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
    public static ArrayList<VifRural2011> ObtenerDatosSexo() throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_rural_busqueda_sexo()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
    public static ArrayList<VifRural2011> ObtenerDatosEstadoCivilVictima() throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_rural_busqueda_estado_civil_victima()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
    public static ArrayList<VifRural2011> ObtenerDatosTipoDeViolencia() throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            String sql = "select * from geoportal_rural.f_select_vif_rural_busqueda_tipo_violencia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoAnio(int anio) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_dado_anio(?)";
            lstP.add(new Parametro(1, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoAnioCircuitos(int anio) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_dado_anio_circuitos(?)";
            lstP.add(new Parametro(1, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoAnioDadoCircuitos(int anio, String circuito) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_dado_anio_dado_circuito(?,?)";
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

    public static ArrayList<VifRural2011> ObtenerDatosDadoAnioDadoDia(int anio, String dia) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_dado_anio_dado_dia(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, dia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoAnioDadoDiaDadoSexo(int anio, String dia, String sexo) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_dado_anio_dado_dia_sexo(?,?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, dia));
            lstP.add(new Parametro(3, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoAnioDadoEstadoCivilVictima(int anio, String estado_civil) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_dado_anio_dado_estado_civil_victima(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, estado_civil));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoMesDadoAnio(String mes, int anio) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_dado_mes_dado_anio(?,?)";
            lstP.add(new Parametro(1, mes));
            lstP.add(new Parametro(2, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoMesDadoSexoDadoAnio(String mes, String sexo, int anio) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_dado_mes_sexo_dado_anio(?,?,?)";
            lstP.add(new Parametro(1, mes));
            lstP.add(new Parametro(2, sexo));
            lstP.add(new Parametro(3, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoRangoEdadDadoAnio(String edad, int anio) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_dado_rango_edad_dado_anio(?,?)";
            lstP.add(new Parametro(1, edad));
            lstP.add(new Parametro(2, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoSexoDadoCircuitoDadoAnio(String sexo, String circuito, int anio) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_dado_sexo_circuito_dado_anio(?,?,?)";
            lstP.add(new Parametro(1, sexo));
            lstP.add(new Parametro(2, circuito));
            lstP.add(new Parametro(3, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoSexoDadoSubcircuitoDadoAnio(String sexo, String subcircuito, int anio) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_dado_sexo_subcircuito_dado_anio(?,?,?)";
            lstP.add(new Parametro(1, sexo));
            lstP.add(new Parametro(2, subcircuito));
            lstP.add(new Parametro(3, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoSubcircuitoDadoAnio(String subcircuito, int anio) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_dado_subcircuito_dado_anio(?,?)";
            lstP.add(new Parametro(1, subcircuito));
            lstP.add(new Parametro(2, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoTipoViolenciaDadoAnio(String tipo_de_violencia, int anio) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_dado_tipo_violencia_dado_anio(?,?)";
            lstP.add(new Parametro(1, tipo_de_violencia));
            lstP.add(new Parametro(2, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoAnioDadoSexo1(int anio, String sexo1) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_edad_1_dado_sexo_dado_anio(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, sexo1));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoAnioDadoSexo2(int anio, String sexo2) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_edad_2_dado_sexo_dado_anio(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, sexo2));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoAnioDadoSexo3(int anio, String sexo3) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_edad_3_dado_sexo_dado_anio(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, sexo3));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoAnioDadoSexo4(int anio, String sexo4) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_edad_4_dado_sexo_dado_anio(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, sexo4));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoAnioDadoSexo5(int anio, String sexo5) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_edad_5_dado_sexo_dado_anio(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, sexo5));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoAnioDadoSexo6(int anio, String sexo6) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_edad_6_dado_sexo_dado_anio(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, sexo6));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoAnioDadoSexo7(int anio, String sexo7) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_edad_7_dado_sexo_dado_anio(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, sexo7));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoAnioEstadoCivil(int anio) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_estado_civil_dado_anio(?)";
            lstP.add(new Parametro(1, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoAnioSubcircuito(int anio) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_subcircuito_dado_anio(?)";
            lstP.add(new Parametro(1, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<VifRural2011> ObtenerDatosDadoAnioTipoDeViolencia(int anio) throws Exception {
        ArrayList<VifRural2011> lst = new ArrayList<VifRural2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_rural.f_select_vif_rural_tipo_violencia_dado_anio(?)";
            lstP.add(new Parametro(1, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

}
