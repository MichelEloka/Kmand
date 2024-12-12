package fr.kmand.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import fr.kmand.beans.Client;

import java.io.IOException;

public class CreerClientServlet extends HttpServlet {
    @Override
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

        boolean hasErrors = false;

        if (nom == null || nom.isEmpty()) {
            request.setAttribute("erreurNom", "Le nom est obligatoire.");
            hasErrors = true;
        }
        if (prenom == null || prenom.isEmpty()) {
            request.setAttribute("erreurPrenom", "Le prénom est obligatoire.");
            hasErrors = true;
        }
        if (email == null || email.isEmpty() || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            request.setAttribute("erreurEmail", "L'email est invalide.");
            hasErrors = true;
        }
        if (telephone == null || telephone.isEmpty() || !telephone.matches("\\d{10}")) {
            request.setAttribute("erreurTelephone", "Le numéro de téléphone doit contenir 10 chiffres.");
            hasErrors = true;
        }
        if (adresse == null || adresse.isEmpty()) {
            request.setAttribute("erreurAdresse", "L'adresse est obligatoire.");
            hasErrors = true;
        }
        if (ville == null || ville.isEmpty()) {
            request.setAttribute("erreurVille", "La ville est obligatoire.");
            hasErrors = true;
        }
        if (codePostal == null || codePostal.isEmpty() || !codePostal.matches("\\d{5}")) {
            request.setAttribute("erreurCodePostal", "Le code postal doit contenir 5 chiffres.");
            hasErrors = true;
        }

        if (hasErrors) {
            request.setAttribute("client", client);
            request.getRequestDispatcher("/jsp/confirmeclient.jsp").forward(request, response);
        } else {
            request.setAttribute("client", client);
            request.getRequestDispatcher("/jsp/confirmeclient.jsp").forward(request, response);
        }
    }
}
