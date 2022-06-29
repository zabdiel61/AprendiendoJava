/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jonat
 */
@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        //creamos o recuperamos el objeto httpSession
        HttpSession sesion = req.getSession();

        //recuperamos la lista de articulos agregados previamente si es que existe
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        //verificamos si la lista de articulos existe
        if (articulos == null) {
            //inicializando la lista de articulos
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }

        //procesamos el nuevo articulo
        String articuloNuevo = req.getParameter("articulo");

        //revisamos y agregamos el articulo nuevo
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }

        try ( //imprimimos la lista de articulos
                 PrintWriter out = resp.getWriter()) {
            out.print("<h1>Lista de articulos</h1>");
            out.print("<br>");

            //iteramos todos los articulos
            for (String articulo : articulos) {
                out.print("<li>Articulo: " + articulo + "</li>");
            }

            //agregamos un link para regresar al inicio
            out.print("<br>");
            out.print("<a href='/EjemplocarritoCompras'>Regresar al inicio</a>");
        }
    }

}
