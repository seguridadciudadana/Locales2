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
    
    public static ArrayList<Victimas_2012> ObtenerDatosDadoFrecuenciaAgresion(String pe) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_frecuencia_agresion(?)";
            lstP.add(new Parametro(1, pe));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);

            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Victimas_2012> ObtenerDatosDadoTratamientoRecibido(String pe) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_tratamiento(?)";
            lstP.add(new Parametro(1, pe));
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

    public static ArrayList<Victimas_2012> ObtenerDatosDadoTratamiento(String pe) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_tratamiento(?)";
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
    
    //----------------------------------------DADO SEXO EDADES----------------------------------------------------------------------------
    
    public static ArrayList<Victimas_2012> ObtenerDatosSexoVictimaEdad1(String sexo) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_sexo_edad_rango1(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2012> ObtenerDatosSexoVictimaEdad2(String sexo) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_sexo_edad_rango2(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Victimas_2012> ObtenerDatosSexoVictimaEdad3(String sexo) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_sexo_edad_rango3(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Victimas_2012> ObtenerDatosSexoVictimaEdad4(String sexo) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_sexo_edad_rango4(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Victimas_2012> ObtenerDatosSexoVictimaEdad5(String sexo) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_sexo_edad_rango5(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Victimas_2012> ObtenerDatosSexoVictimaEdad6(String sexo) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_sexo_edad_rango6(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Victimas_2012> ObtenerDatosSexoVictimaEdad7(String sexo) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_sexo_edad_rango7(?)";
            lstP.add(new Parametro(1, sexo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
     //----------------------------------------DADO SEXO EDADES----------------------------------------------------------------------------
    
    // ---------------------------------------ESTADO DE CONCIENCIA----------------------------------------------------------------------------------
    public static ArrayList<Victimas_2012> ObtenerDatosEstado() throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_estado_de()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Victimas_2012> ObtenerDatosDadoEstado(String estado) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_estado_de(?)";
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
    public static ArrayList<Victimas_2012> ObtenerDatosEstadoCivil() throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_estado_civil()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Victimas_2012> ObtenerDatosDadoEstadoCivil(String estado) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_estado_civil(?)";
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
    public static ArrayList<Victimas_2012> ObtenerDatosInstruccion() throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_instruccion()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Victimas_2012> ObtenerDatosDadoInstruccion(String estado) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_instruccion(?)";
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
    
    // ---------------------------------------OBJETO DE ----------------------------------------------------------------------------------
    public static ArrayList<Victimas_2012> ObtenerDatosObjeto() throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_objeto()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Victimas_2012> ObtenerDatosDadoObjeto(String objeto) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_objeto(?)";
            lstP.add(new Parametro(1, objeto));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    // ---------------------------------------OBJETO DE  --------------------------------------------------------------------------------
   
    //----------------------------------------REFERIDO-----------------------------------------------------------------------------------
     public static ArrayList<Victimas_2012> ObtenerDatosReferido() throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_referido()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Victimas_2012> ObtenerDatosDadoReferido(String referido) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_referido(?)";
            lstP.add(new Parametro(1, referido));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    //---------------------------------------------REFERIDO-------------------------------------------------------------------------------
    
    // -------------------------------------- RELACION ----------------------------------------------------------------------------------
    public static ArrayList<Victimas_2012> ObtenerDatosRelacion() throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_relacion()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Victimas_2012> ObtenerDatosDadoRelacion(String relacion) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_relacion(?)";
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

    //----------------------------------------FRECUENCIA---------------------------------------------------------------------------
    
    public static ArrayList<Victimas_2012> ObtenerDatosFrecuencia() throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_frecuencia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    public static ArrayList<Victimas_2012> ObtenerDatosDadoFrecuencia(String frecuencia) throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_dado_frecuencia(?)";
            lstP.add(new Parametro(1, frecuencia));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
    //----------------------------------------FRECUENCIA---------------------------------------------------------------------------
    
    // ------------------------------------------ OCUPACIONES VICTIMAS ------------------------------------------------------------
    public static ArrayList<Victimas_2012> ObtenerDatosEmpleadoPublico() throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_empleado_publico()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2012> ObtenerDatosEmpleadoPrivado() throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_empleado_privado()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2012> ObtenerDatosEstudiante() throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_estudiante()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2012> ObtenerDatosProfesionales() throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_profesionales()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2012> ObtenerDatosSinOcupacion() throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_sin_ocupacion()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2012> ObtenerDatosComerciante() throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_comerciante()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    
    public static ArrayList<Victimas_2012> ObtenerDatosPreso() throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_preso()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static ArrayList<Victimas_2012> ObtenerDatosQueHaceres() throws Exception {
        ArrayList<Victimas_2012> lst = new ArrayList<Victimas_2012>();
        try {
            String sql = "select * from geoportal_sala_primera_acogida.f_select_victimas_2012_que_haceres()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDatos(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
     // ------------------------------------------ OCUPACIONES VICTIMAS ------------------------------------------------------------
    
}
