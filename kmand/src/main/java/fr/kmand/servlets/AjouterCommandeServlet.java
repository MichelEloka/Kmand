package fr.kmand.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import fr.kmand.beans.Commande;

import java.io.IOException;

public class AjouterCommandeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String produit = request.getParameter("article");
        String quantiteStr = request.getParameter("quantite");
        String prixStr = request.getParameter("prix");
        String client = request.getParameter("client");

     
        if (produit == null || produit.isEmpty() || client == null || client.isEmpty() ||
            quantiteStr == null || quantiteStr.isEmpty() || prixStr == null || prixStr.isEmpty()) {
            request.setAttribute("erreur", "Tous les champs sont obligatoires.");
            request.getRequestDispatcher("/jsp/confirmcommande.jsp").forward(request, response);
            return; 
        }

        int quantite = 0;
        double prix = 0.0;
        
        try {
            quantite = Integer.parseInt(quantiteStr);
            prix = Double.parseDouble(prixStr);
        } catch (NumberFormatException e) {
            request.setAttribute("erreur", "La quantité ou le prix est invalide.");
            request.getRequestDispatcher("/jsp/confirmcommande.jsp").forward(request, response);
            return;
        }

        Commande commande = new Commande();
        commande.setProduit(produit);
        commande.setQuantite(quantite);
        commande.setPrix(prix);
        commande.setClient(client);

        if (quantite <= 0 || prix <= 0) {
            request.setAttribute("erreur", "Les champs de quantité et de prix doivent être positifs.");
            request.setAttribute("commande", commande);
            request.getRequestDispatcher("/jsp/confirmcommande.jsp").forward(request, response);
        } else {
            request.setAttribute("commande", commande);
            request.getRequestDispatcher("/jsp/confirmcommande.jsp").forward(request, response);
        }
    }
}
