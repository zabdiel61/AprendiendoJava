/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jonat
 */
@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //indicamos el tipo de respuesta al navegador
        resp.setContentType("application/vnd.ms-excel");
        resp.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");
        //para uso mas profesional de excel poi.apache.org

        //Indicar al navegador que no guarde cache
        resp.setHeader("Pragma", "no-cache");
        resp.setHeader("Cache-Control", "no-store");
        resp.setDateHeader("Expires", -1);

        //DESPLEGAR LA INFORMACION AL CLIENTE
        PrintWriter out = resp.getWriter();
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(b2:b3)");
    }

}
