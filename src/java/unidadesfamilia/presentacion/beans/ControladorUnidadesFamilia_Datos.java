/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidadesfamilia.presentacion.beans;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import recursos.Util;
import unidadesfamilia.logica.clases.UnidadesFamilia;
import unidadesfamilia.logica.funciones.FUnidadesFamilia;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorUnidadesFamilia_Datos {

    /**
     * Creates a new instance of ControladorUnidadesFamilia_Datos
     */
    private UnidadesFamilia objUnidadesFamilia;
    private ArrayList<UnidadesFamilia> lstDatos;

    public UnidadesFamilia getObjUnidadesFamilia() {
        return objUnidadesFamilia;
    }

    public void setObjUnidadesFamilia(UnidadesFamilia objUnidadesFamilia) {
        this.objUnidadesFamilia = objUnidadesFamilia;
    }

    public ArrayList<UnidadesFamilia> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(ArrayList<UnidadesFamilia> lstDatos) {
        this.lstDatos = lstDatos;
    }

    private void reinit() {
        this.obtenerDatosUnidadesFamilia();
        this.obtenerDatosUnidadesFamilia2013();

    }

    public ControladorUnidadesFamilia_Datos() {
        this.reinit();
    }

    private void obtenerDatosUnidadesFamilia() {
        try {
            lstDatos = FUnidadesFamilia.ObtenerDatosDadoAnio(2014);
            this.objUnidadesFamilia = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getId());
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerDatosUnidadesFamilia 2014 dice: " + e.getMessage());
            System.out.println("public void obtenerDatosUnidadesFamilia 2014 dice: " + e.getMessage());
        }

    }

    private void obtenerDatosUnidadesFamilia2013() {
        try {
            lstDatos = FUnidadesFamilia.ObtenerDatosDadoAnio(2013);
            this.objUnidadesFamilia = lstDatos.get(0);
            System.out.println(lstDatos.get(0).getId());
        } catch (Exception e) {
            Util.addErrorMessage("public void obtenerDatosUnidadesFamilia 2014 dice: " + e.getMessage());
            System.out.println("public void obtenerDatosUnidadesFamilia 2014 dice: " + e.getMessage());
        }

    }

}
