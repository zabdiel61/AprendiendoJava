/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jonat
 */
@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String metodoHttp = req.getMethod();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers Http</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Headers http </h1>");
        out.print("<br>");
        out.print("Metodo Http: " + metodoHttp);

        String uri = req.getRequestURI();
        out.print("<br>");
        out.print("Uri solicitada: " + uri);

        //imprimimos todos los cabeceros dispónibles
        out.print("<br>");
        out.print("<br>");
        Enumeration cabeceros = req.getHeaderNames();
        //este metodo es para saber si hay mas elementos a iterar
        while (cabeceros.hasMoreElements()) {
            String nombreCabecero = (String) cabeceros.nextElement();
            out.print("<b>" + nombreCabecero + "</b>:");
            out.print(req.getHeader(nombreCabecero));
            out.print("<br>");
        }

        out.print("");
        out.print("</body>");
        out.print("</html>");
    }

}
