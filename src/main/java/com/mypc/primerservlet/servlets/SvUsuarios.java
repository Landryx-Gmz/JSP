
package com.mypc.primerservlet.servlets;

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
import logica.Usuario;

@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("123","Landryx","Joe","44444"));
        listaUsuarios.add(new Usuario("132","Land","oe","5555"));
        listaUsuarios.add(new Usuario("767","Dryx","Jo","7777"));
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaUsuarios", listaUsuarios);

        
        response.sendRedirect("mostrarUsuarios.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
        System.out.println("Dni es:" + dni);
        System.out.println("Nombre es:" + nombre);
        System.out.println("Apellido es:" + apellido);
        System.out.println("Telefono es:" + telefono);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
