/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidadesfamilia.logica.funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import unidadesfamilia.logica.clases.UnidadesFamilia;

/**
 *
 * @author Oscunach
 */
public class FUnidadesFamilia {

    public static ArrayList<UnidadesFamilia> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        UnidadesFamilia datos = null;
        try {
            while (rs.next()) {
                datos = new UnidadesFamilia(
                        rs.getInt("pid"),
                        rs.getDate("pfecha_de_recepcion"),
                        rs.getString("psexo_agresor"),
                        rs.getString("psexo_victima"),
                        rs.getString("pbarrio_agresor"),
                        rs.getString("pbarrio_victima"),
                        rs.getString("pedad_agresor"),
                        rs.getString("pedad_victima"),
                        rs.getString("pinstruccion_agresor"),
                        rs.getString("pinstruccion_victima"),
                        rs.getString("pparentesco_victima_agresor"),
                        rs.getInt("pnumero_de_hijos"),
                        rs.getString("plugar_agresion"),
                        rs.getDouble("px"),
                        rs.getDouble("py"),
                        rs.getString("psubcircuito"),
                        rs.getString("pcircuito"),
                        rs.getString("ptipo_de_violencia"),
                        rs.getString("pfecha_agresion"),
                        rs.getString("pmedidas_de_amparo"),
                        rs.getString("psentencia"),
                        rs.getString("papelacion"),
                        rs.getString("pboletas_anteriores"),
                        rs.getString("pboletas_de_remision"),
                        rs.getString("pobservaciones")
                );

                lst.add(datos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<UnidadesFamilia> ObtenerDatos() throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            String sql = "select * from geoportal_unidades_familia.f_select_unidades_familia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<UnidadesFamilia> ObtenerDatosDadoAnio(int anio) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_unidades_familia_dado_anio(?)";
            lstP.add(new Parametro(1, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<UnidadesFamilia> ObtenerCircuitosDadoAnio(int anio) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_circuitos_dado_anio(?)";
            lstP.add(new Parametro(1, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<UnidadesFamilia> ObtenerDadoCircuitos(int anio, String circuito) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_dado_circuitos(?,?)";
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

    public static ArrayList<UnidadesFamilia> ObtenerDadoCircuitosSexoVictima(int anio, String circuito, String sexo) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_circuitos_dado_anio_sexo(?,?,?)";
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

    public static ArrayList<UnidadesFamilia> ObtenerSubcircuitosDadoAnio(int anio) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_subcircuitos_dado_anio(?)";
            lstP.add(new Parametro(1, anio));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<UnidadesFamilia> ObtenerDadoSubCircuitos(int anio, String subcircuito) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_dado_subcircuitos(?,?)";
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

    public static ArrayList<UnidadesFamilia> ObtenerDadoSubcircuitosSexoVictima(int anio, String subcircuito, String sexo) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_subcircuitos_dado_anio_sexo(?,?,?)";
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
    
    public static ArrayList<UnidadesFamilia> obtenerDatosDadoTipoViolenciaSexoVictima(int anio, String tviolencia, String sexo) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_dado_tipo_de_violencia_dado_anio_dado_sexo(?,?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, tviolencia));
            lstP.add(new Parametro(3, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

     public static ArrayList<UnidadesFamilia> obtenerDatosDadoTipoViolencia(int anio, String tviolencia) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_dado_tipo_de_violencia_dado_anio(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, tviolencia));            
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
     
     public static ArrayList<UnidadesFamilia> obtenerDatosTipoViolencia(int anio) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_tipo_violencia_dado_anio(?)";
            lstP.add(new Parametro(1, anio));                     
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
     
    public static ArrayList<UnidadesFamilia> obtenerDatosMedidasAmparo(int anio) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_medidas_de_amparo_dado_anio(?)";
            lstP.add(new Parametro(1, anio));                     
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<UnidadesFamilia> obtenerDatosParentesco(int anio) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_parentesco_dado_anio(?)";
            lstP.add(new Parametro(1, anio));                     
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<UnidadesFamilia> ObtenerDatosDadoAnioParentescoSexoVictima(int anio, String parentesco, String sexo) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_parentesco_dado_sexo_dado_anio(?,?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, parentesco));
            lstP.add(new Parametro(3, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
    public static ArrayList<UnidadesFamilia> ObtenerDatosDadoAnioMedidasAmparoSexoVictima(int anio, String medidas_amparo, String sexo) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_dado_medidas_de_amparo_dado_anio_dado_sexo(?,?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, medidas_amparo));
            lstP.add(new Parametro(3, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<UnidadesFamilia> obtenerDatosDadoMedidasAmparo(String medidas_amparo) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_dado_medidas_de_amparo(?)";
            
            lstP.add(new Parametro(1, medidas_amparo));            
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    public static ArrayList<UnidadesFamilia> obtenerDatosDadoMedidasAmparoSexoVictima(String medidas_amparo, String sexo) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_dado_medidas_de_amparo_dado_sexo(?,?)";
            
            lstP.add(new Parametro(1, medidas_amparo));            
            lstP.add(new Parametro(2, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<UnidadesFamilia> obtenerDatosDadoParentescoSexoVictima(int anio, String parentesco, String sexo) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_parentesco_dado_sexo_dado_anio(?,?,?)";
            
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, parentesco));            
            lstP.add(new Parametro(3, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<UnidadesFamilia> obtenerDatosDadoMedidasAmparoDadoAnio(Integer anio, String medidas_amparo) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_dado_medidas_de_amparo_dado_anio(?,?)";
            
            lstP.add(new Parametro(1, anio));            
            lstP.add(new Parametro(2, medidas_amparo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<UnidadesFamilia> ObtenerDadoAnioMedidasAmparoCircuito(int anio, String medidas, String circuito) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_dado_anio_dado_medidas_de_amparo_dado_circuito(?,?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, medidas));
            lstP.add(new Parametro(3, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<UnidadesFamilia> ObtenerDadoAnioMedidasAmparoSubcircuito(int anio, String medidas, String subcircuito) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_dado_anio_dado_medidas_de_amparo_dado_subcircuito(?,?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, medidas));
            lstP.add(new Parametro(3, subcircuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<UnidadesFamilia> ObtenerDatosDadoAnioParentesco(int anio, String parentesco) throws Exception {
        ArrayList<UnidadesFamilia> lst = new ArrayList<UnidadesFamilia>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_unidades_familia.f_select_dado_parentesco_dado_anio(?,?)";
            lstP.add(new Parametro(1, anio));
            lstP.add(new Parametro(2, parentesco));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
}
