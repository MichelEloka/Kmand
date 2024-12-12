package fr.kmand.servlets;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AccueilServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/accueil.jsp");
        dispatcher.forward(request, response);
    }
}

