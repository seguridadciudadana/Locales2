/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoportal.presentacion.beans;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import static com.lowagie.text.Element.CHUNK;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.ColumnText;
import static com.lowagie.text.pdf.PdfName.IMAGE;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfPageEventHelper;
import com.lowagie.text.pdf.PdfWriter;
import geoportal.logica.clases.Vif_2010;
import geoportal.logica.clases.Vif_2011;
import geoportal.logica.clases.Vif_2012;
import geoportal.logica.clases.Vif_2012_2;
import geoportal.logica.funciones.FVif2012;
import geoportal.logica.funciones.FVif_2010;
import geoportal.logica.funciones.FVif_2011;
import geoportal.logica.funciones.FVif_2012;
import geoportal.logica.funciones.FVif_2012_2;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import recursos.Util;

/**
 *
 * @author servidor
 */
@ManagedBean
@ViewScoped
public class ReportesControlador {

    private ArrayList<Vif_2010> lstVif2010;
    private ArrayList<Vif_2011> lstVif2011;
    private ArrayList<Vif_2012> lstVif_2012;
    private int totalDenuncias;

    public int getTotalDenuncias() {
        return totalDenuncias;
    }

    public void setTotalDenuncias(int totalDenuncias) {
        this.totalDenuncias = totalDenuncias;
    }

    public ArrayList<Vif_2010> getLstVif2010() {
        return lstVif2010;
    }

    public void setLstVif2010(ArrayList<Vif_2010> lstVif2010) {
        this.lstVif2010 = lstVif2010;
    }

    public ArrayList<Vif_2011> getLstVif2011() {
        return lstVif2011;
    }

    public void setLstVif2011(ArrayList<Vif_2011> lstVif2011) {
        this.lstVif2011 = lstVif2011;
    }

    public ArrayList<Vif_2012> getLstVif_2012() {
        return lstVif_2012;
    }

    public void setLstVif_2012(ArrayList<Vif_2012> lstVif_2012) {
        this.lstVif_2012 = lstVif_2012;
    }

    public ReportesControlador() {
        reinit();
    }

    private void reinit() {
        this.lstVif2010 = new ArrayList<Vif_2010>();
        this.lstVif2011 = new ArrayList<Vif_2011>();
        this.lstVif_2012 = new ArrayList<Vif_2012>();
        this.cargarDatos2010();
        this.cargarDatos2011();
        this.cargarDatos2012();
        this.calcularDenuncias();
    }

    public void cargarDatos2010() {
        try {
            lstVif2010 = FVif_2010.ObtenerDatos();
            System.out.println(lstVif2010.get(0).getId());
        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatosVif2010 dice: " + e.getMessage());
            System.out.println("private void cargarDatosVif2010 dice: " + e.getMessage());
        }
    }

    public void cargarDatos2011() {
        try {
            lstVif2011 = FVif_2011.ObtenerDatos();
            System.out.println(lstVif2011.get(0).getId());
        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatosVif2011 dice: " + e.getMessage());
            System.out.println("private void cargarDatosVif2011 dice: " + e.getMessage());
        }
    }

    public void cargarDatos2012() {
        try {
            lstVif_2012 = FVif_2012.ObtenerDatos();
            System.out.println(lstVif_2012.get(0).getPid());
        } catch (Exception e) {
            Util.addErrorMessage("private void cargarDatosVif2012 dice: " + e.getMessage());
            System.out.println("private void cargarDatosVif2012 dice: " + e.getMessage());
        }
    }

    public int calcularDenuncias() {
        totalDenuncias = lstVif2010.size() + lstVif2011.size() + lstVif_2012.size();
        return totalDenuncias;
    }

    public class MembreteHeaderiText extends PdfPageEventHelper {

        @Override
        public void onStartPage(PdfWriter writer, Document document) {

            ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER,
                    new Phrase("EJE DEL OBSERVATORIO DE SEGURIDAD CIUDADANA"), 300, 800, 0);

        }
    }

    public void imprimirReporte() {
        //DateFormat dfDateFull = DateFormat.getDateInstance(DateFormat.FULL);
        try {

            //Generamos el archivo PDF
            String directorioArchivos;
            ServletContext ctx = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
            directorioArchivos = ctx.getRealPath("/") + "reportes";
            String name = directorioArchivos + "/document-reporte.pdf";
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(name));
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(name));
            //PdfWriter writer = PdfWriter.getInstance(document,
            //new FileOutputStream("C:"));

            Paragraph paragraph = new Paragraph();
            Paragraph paragraph1 = new Paragraph();
            Paragraph paragraph2 = new Paragraph();

            //PdfPTable table = new PdfPTable(4);
            PdfPTable table1 = new PdfPTable(1);
            PdfPTable table2 = new PdfPTable(4);
            PdfPTable table3 = new PdfPTable(4);
            PdfPTable table5 = new PdfPTable(1);

            paragraph.add("\n\n\n\n\n\n\n");
            paragraph.setAlignment(Paragraph.ALIGN_CENTER);
            paragraph1.add("\n");
            paragraph1.setAlignment(Paragraph.ALIGN_CENTER);
            paragraph2.add("Total Denuncias:" + totalDenuncias);
            paragraph2.setAlignment(Paragraph.ALIGN_LEFT);

            //  Obtenemos una instancia de nuestro manejador de eventos
            MembreteHeaderiText header = new MembreteHeaderiText();
            //Asignamos el manejador de eventos al escritor.
            writer.setPageEvent(header);

            document.open();
//            Chunk titulo = new Chunk(CHUNK, FontFactory.getFont(FontFactory.COURIER, 20, Font.UNDERLINE, BaseColor.BLACK));
//
//            titulo = new Chunk(IMAGE, FontFactory.getFont(FontFactory.COURIER, 20, Font.UNDERLINE, BaseColor.BLACK));
//            document.add(titulo);
//            Image foto = Image.getInstance(“resources / ferrari.jpg”);
//foto.scaleToFit(100, 100);        foto.setAlignment(Chunk.ALIGN_MIDDLE);

            //primera linea   
            PdfPCell cell5 = new PdfPCell(new Paragraph("VIOLENCIA INTRAFAMILIAR "));
            //segunda linea
            PdfPCell cell12 = new PdfPCell(new Paragraph("AÑO"));
            PdfPCell cell6 = new PdfPCell(new Paragraph("2010"));
            PdfPCell cell7 = new PdfPCell(new Paragraph("2011"));
            PdfPCell cell8 = new PdfPCell(new Paragraph("2012"));

            //tercera fila
            PdfPCell cell13 = new PdfPCell(new Paragraph("# DENUNCIAS"));
            PdfPCell cell9 = new PdfPCell(new Paragraph("" + lstVif2010.size()));
            PdfPCell cell10 = new PdfPCell(new Paragraph("" + lstVif2011.size()));
            PdfPCell cell11 = new PdfPCell(new Paragraph("" + lstVif_2012.size()));

            PdfPCell cell15 = new PdfPCell(new Paragraph("TOTAL DENUNCIAS:" + totalDenuncias));

            cell5.setHorizontalAlignment(Element.ALIGN_CENTER);

            cell6.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell7.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell8.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell9.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell10.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell11.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell12.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell13.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell15.setHorizontalAlignment(Element.ALIGN_LEFT);

            cell12.setBackgroundColor(Color.cyan);
            cell13.setBackgroundColor(Color.cyan);

            cell5.setBorder(Rectangle.NO_BORDER);
            cell15.setBorder(Rectangle.NO_BORDER);

            table1.addCell(cell5);
            //añadir segunda fila
            table2.addCell(cell12);
            table2.addCell(cell6);
            table2.addCell(cell7);
            table2.addCell(cell8);
            //añadir tercera fila
            table3.addCell(cell13);
            table3.addCell(cell9);
            table3.addCell(cell10);
            table3.addCell(cell11);
            //añadir cuarta fila
            table5.addCell(cell15);

            document.add(paragraph);
            document.add(table1);
            document.add(paragraph1);
            document.add(table2);
            document.add(table3);
            document.add(table5);
            //document.add(paragraph2);

            //document.add(table);
            //document.setFooter(event);
            document.close();
            //----------------------------
            //Abrimos el archivo PDF
            FacesContext context = FacesContext.getCurrentInstance();
            HttpServletResponse response = (HttpServletResponse) context.getExternalContext().getResponse();
            response.setContentType("application/pdf");
            response.setHeader("Content-disposition",
                    "inline=filename=" + name);
            try {
                response.getOutputStream().write(Util.getBytesFromFile(new File(name)));
                response.getOutputStream().flush();
                response.getOutputStream().close();
                context.responseComplete();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
