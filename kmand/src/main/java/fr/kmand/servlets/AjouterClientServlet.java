package fr.kmand.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;

import fr.kmand.beans.Client;

@WebServlet("/ajouter-client")
public class AjouterClientServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String telephone = request.getParameter("telephone");
        String adresse = request.getParameter("adresse");
        String ville = request.getParameter("ville");
        String codePostal = request.getParameter("codePostal");

        Client client = new Client();
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setEmail(email);
        client.setTelephone(telephone);
        client.setAdresse(adresse);
        client.setVille(ville);
        client.setCodePostal(codePostal);

        request.setAttribute("client", client);

        request.getRequestDispatcher("/jsp/endconfirmclient.jsp").forward(request, response);
    }
}

