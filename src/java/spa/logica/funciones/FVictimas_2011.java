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
import spa.logica.clases.Victimas_2011;

/**
 *
 * @author Geovanny Cudco
 */
public class FVictimas_2011 {

    public static ArrayList<Victimas_2011> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        Victimas_2011 datos = null;
        try {
            while (rs.next()) {
                datos = new Victimas_2011(
                        rs.getInt("pn_denuncia"),
                        rs.getString("pprovincia"),
                        rs.getString("pcanton"),
                        rs.getString("pbarrio"),
                        rs.getString("pinstitucio"),
                        rs.getDate("pfecha_de_a"),
                        rs.getString("papellidos"),
                        rs.getString("pnombres"),
                        rs.getInt("pedad"),
                        rs.getString("psexo"),
                        rs.getString("pinstruccion"),
                        rs.getInt("panios"),
                        rs.getString("pestado_civ"),
                        rs.getString("pocupacion"),
                        rs.getInt("ptelefono"),
                        rs.getString("pcanton_dom"),
                        rs.getString("pparroquia"),
                        rs.getString("pcalles"),
                        rs.getDouble("px"),
                        rs.getDouble("py"),
                        rs.getString("pcircuito"),
                        rs.getString("pcod_circui"),
                        rs.getString("psubcircuit"),
                        rs.getString("pcod_subcir"),
                        rs.getString("pdireccion"),
                        rs.getString("ptelefono_t"),
                        rs.getString("ptipos_de_a"),
                        rs.getString("pfrecuencia"),
                        rs.getString("plugar_de_l"),
                        rs.getDate("pfecha_agre"),
                        rs.getString("phora_agres"),
                        rs.getString("pasociacion"),
                        rs.getString("pobjeto_de"),
                        rs.getString("pestado_de"),
                        rs.getString("prelacion_d"),
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

    public static ArrayList<Victimas_2011> ObtenerDatos() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2011> ObtenerDatosCircuitos() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_circuitos()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2011> ObtenerDatosSubCircuitos() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_subcircuitos()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2011> ObtenerDatosDadoCircuito(String circuito) throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_dado_circuito(?)";
            lstP.add(new Parametro(1, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2011> ObtenerDatosDadoSubCircuito(String circuito) throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_dado_subcircuito(?)";
            lstP.add(new Parametro(1, circuito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2011> ObtenerDatosDadoSexoVictimaCircuito(String sexo, String circuito) throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_dado_circuito_sexo(?,?)";
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

    public static ArrayList<Victimas_2011> ObtenerDatosDadoSexoVictimaSubCircuito(String sexo, String circuito) throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_dado_subcircuito_sexo(?,?)";
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

    // ------------------------------------------ OCUPACIONES VICTIMAS ------------------------------------------------------------
    public static ArrayList<Victimas_2011> ObtenerDatosEmpleadoPublico() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_empleado_publico()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2011> ObtenerDatosEmpleadoPrivado() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_empleado_privado()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2011> ObtenerDatosEstudiante() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_estudiante()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2011> ObtenerDatosProfesionales() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_profesionales()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2011> ObtenerDatosSinOcupacion() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_sin_ocupacion()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2011> ObtenerDatosComerciante() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_comerciante()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2011> ObtenerDatosTrabajadoraS() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_trabajadora_sexual()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2011> ObtenerDatosPreso() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_preso()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2011> ObtenerDatosQueHaceres() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_que_haceres()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    //--------                                  OCUPACIONES VICTIMAS   ---------------------------------------------------

    //----------------------------        FRECUENCIAS ----------------------------------------------------------------------
    public static ArrayList<Victimas_2011> ObtenerDatosFrecuenciaPrimera() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_frecuencia_primera()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2011> ObtenerDatosFrecuenciaSubsecuente() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_frecuencia_subsecuente()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2011> ObtenerDatosFrecuenciaNA() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_frecuencia_na()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

     //-------------------------------------- FRECUENCIA -------------------------------------------------------------------------------
    
    // -------------------------------------- RELACION ----------------------------------------------------------------------------------
    public static ArrayList<Victimas_2011> ObtenerDatosRelacion() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_relacion()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Victimas_2011> ObtenerDatosDadoRelacion(String relacion) throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_dado_relacion(?)";
            lstP.add(new Parametro(1, relacion));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    
    // ---------------------------------------RELACION ----------------------------------------------------------------------------------
    
    // ---------------------------------------ESTADO DE CONCIENCIA----------------------------------------------------------------------------------
    public static ArrayList<Victimas_2011> ObtenerDatosEstado() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_estado_de()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Victimas_2011> ObtenerDatosDadoEstado(String estado) throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_dado_estado_de(?)";
            lstP.add(new Parametro(1, estado));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    // ---------------------------------------ESTADO DE CONCIENCIA ----------------------------------------------------------------------------------
    
    // ---------------------------------------ESTADO DE CIVIL----------------------------------------------------------------------------------
    public static ArrayList<Victimas_2011> ObtenerDatosEstadoCivil() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_estado_civil()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Victimas_2011> ObtenerDatosDadoEstadoCivil(String estado) throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_dado_estado_civil(?)";
            lstP.add(new Parametro(1, estado));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    // ---------------------------------------ESTADO DE CIVIL --------------------------------------------------------------------------------
     // ---------------------------------------INSTRUCCION----------------------------------------------------------------------------------
    public static ArrayList<Victimas_2011> ObtenerDatosInstruccion() throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_instruccion()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Victimas_2011> ObtenerDatosDadoInstruccion(String estado) throws Exception {
        ArrayList<Victimas_2011> lst = new ArrayList<Victimas_2011>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_vif2011_spa_dado_instruccion(?)";
            lstP.add(new Parametro(1, estado));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    // ---------------------------------------ESTADO DE CIVIL --------------------------------------------------------------------------------
}
