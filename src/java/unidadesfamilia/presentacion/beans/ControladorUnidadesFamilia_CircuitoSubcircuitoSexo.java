/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidadesfamilia.presentacion.beans;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import unidadesfamilia.logica.clases.UnidadesFamilia;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class ControladorUnidadesFamilia_CircuitoSubcircuitoSexo {

    /**
     * Creates a new instance of
     * ControladorUnidadesFamilia_CircuitoSubcircuitoSexo
     */
    
     private ArrayList<UnidadesFamilia> lstDatos;
     
    public ControladorUnidadesFamilia_CircuitoSubcircuitoSexo() {
    }
    
}
