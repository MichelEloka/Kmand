package fr.kmand.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import fr.kmand.beans.Commande;

import java.io.IOException;

public class CreerCommandeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String produit = request.getParameter("article");
        int quantite = Integer.parseInt(request.getParameter("quantite"));
        double prix = Double.parseDouble(request.getParameter("prix"));
        String client = request.getParameter("client"); 

        Commande commande = new Commande();
        commande.setProduit(produit);
        commande.setQuantite(quantite);
        commande.setPrix(prix);
        commande.setClient(client);

        if (produit.isEmpty() || quantite <= 0 || prix <= 0 || client.isEmpty()) {
            request.setAttribute("erreur", "Les champs sont invalides.");
            request.setAttribute("commande", commande);
            request.getRequestDispatcher("/jsp/confirmcommande.jsp").forward(request, response);
        } else {
            request.setAttribute("commande", commande);
            request.getRequestDispatcher("/jsp/confirmcommande.jsp").forward(request, response);
        }
    }
}
