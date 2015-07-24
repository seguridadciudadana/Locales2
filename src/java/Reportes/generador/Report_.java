/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes.generador;

import java.util.HashMap;
import java.util.Map;
import javax.faces.context.FacesContext;
import net.sf.jasperreports.engine.*;

/**
 *
 * @author servidor
 */
public class Report_ {

    public Report_() {
    }

    public String generaReporte(String Name, JRDataSource DataSource, HashMap Parametros) {
        JasperReport jasperReport = null;
        JasperPrint jasperPrint = null;
        String respuesta = null;
        try {
            String archivo = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/reportes") + "/" + Name;
            jasperReport = JasperCompileManager.compileReport(archivo.concat(".jrxml"));
            jasperPrint = JasperFillManager.fillReport(jasperReport, Parametros, DataSource);
            JasperExportManager.exportReportToPdfFile(jasperPrint, archivo.concat(".pdf"));
            respuesta = "/reportes/" + Name + ".pdf";

        } catch (Exception e) {
            System.out.println(e + "GSG");
        }
        return respuesta;
    }

}
