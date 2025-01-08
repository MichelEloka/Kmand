package fr.kmand.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import fr.kmand.beans.Commande;

import java.io.IOException;

public class CreerCommandeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String produit = request.getParameter("article");
        String quantiteStr = request.getParameter("quantite");
        String prixStr = request.getParameter("prix");
        String client = request.getParameter("client");

        boolean hasError = false;
        Commande commande = new Commande();

        if (client == null || client.isEmpty()) {
            request.setAttribute("erreurClient", "Veuillez sélectionner un client.");
            hasError = true;
        } else {
            commande.setClient(client);
        }

        if (produit == null || produit.isEmpty()) {
            request.setAttribute("erreurArticle", "Le champ article est obligatoire.");
            hasError = true;
        } else {
            commande.setProduit(produit);
        }

        int quantite = 0;
        double prix = 0.0;

        try {
            if (quantiteStr != null && !quantiteStr.isEmpty()) {
                quantite = Integer.parseInt(quantiteStr);
                if (quantite <= 0) {
                    request.setAttribute("erreurQuantite", "La quantité doit être supérieure à zéro.");
                    hasError = true;
                } else {
                    commande.setQuantite(quantite);
                }
            } else {
                request.setAttribute("erreurQuantite", "Le champ quantité est obligatoire.");
                hasError = true;
            }
        } catch (NumberFormatException e) {
            request.setAttribute("erreurQuantite", "La quantité doit être un nombre valide.");
            hasError = true;
        }

        try {
            if (prixStr != null && !prixStr.isEmpty()) {
                prix = Double.parseDouble(prixStr);
                if (prix <= 0) {
                    request.setAttribute("erreurPrix", "Le prix doit être supérieur à zéro.");
                    hasError = true;
                } else {
                    commande.setPrix(prix);
                }
            } else {
                request.setAttribute("erreurPrix", "Le champ prix est obligatoire.");
                hasError = true;
            }
        } catch (NumberFormatException e) {
            request.setAttribute("erreurPrix", "Le prix doit être un nombre valide.");
            hasError = true;
        }

        if (hasError) {
            request.setAttribute("commande", commande);
            request.getRequestDispatcher("/jsp/creer-commande.jsp").forward(request, response);
        } else {
            request.setAttribute("commande", commande);
            request.getRequestDispatcher("/jsp/confirmcommande.jsp").forward(request, response);
        }
    }
}
