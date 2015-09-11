/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master.presentacion.beans;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Oscunach
 */
@ManagedBean
@RequestScoped
public class GaleriasBean {

    /**
     * Creates a new instance of GaleriasBean
     */
    private ArrayList<String> imagesLocales;
    private ArrayList<String> imagesVif;

    /*
     * Metodos get y set
     */
    public ArrayList<String> getImagesLocales() {
        return imagesLocales;
    }

    public ArrayList<String> getImagesVif() {
        return imagesVif;
    }

    /*
     * Graficar
     */
    @PostConstruct
    public void init() {
        imagesVif = new ArrayList<String>();
        for (int i = 1; i <= 3; i++) {
            imagesVif.add("vif" + i + ".JPG");
        }
    }

    public GaleriasBean() {
        this.init();
    }

}
