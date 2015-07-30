/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spa.presentacion.beans;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import spa.logica.clases.Victimas_2011;

/**
 *
 * @author servidor
 */
@ManagedBean
@RequestScoped
public class ControladorVictimas2011Relacion {

    /**
     * Creates a new instance of ControladorVictimas2011Relacion
     */
    private ArrayList<Victimas_2011> lstDatosRelacion;
    private ArrayList<Victimas_2011> lstDatosDadoRelacion;
    
    
    
    public ControladorVictimas2011Relacion() {
    }
    
}
