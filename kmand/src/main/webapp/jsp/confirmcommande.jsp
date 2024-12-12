<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="fr.kmand.beans.Commande" %>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Résumé des Informations de Commande</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="styles.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <h2 class="text-center">Résumé des Informations de Commande</h2>
    <form action="endcommande" method="POST">
        <div class="form-row">
            <div class="col-md-6 mb-3">
                <label for="produit">Produit</label>
                <input type="text" class="form-control" id="produit" name="produit" value="<%= request.getAttribute("commande") != null ? ((Commande) request.getAttribute("commande")).getProduit() : "" %>" disabled>
            </div>
            <div class="col-md-6 mb-3">
                <label for="quantite">Quantité</label>
                <input type="number" class="form-control" id="quantite" name="quantite" value="<%= request.getAttribute("commande") != null ? ((Commande) request.getAttribute("commande")).getQuantite() : "" %>" disabled>
            </div>
        </div>

        <div class="form-row">
            <div class="col-md-6 mb-3">
                <label for="prix">Prix</label>
                <input type="text" class="form-control" id="prix" name="prix" value="<%= request.getAttribute("commande") != null ? ((Commande) request.getAttribute("commande")).getPrix() : "" %>" disabled>
            </div>
            <div class="col-md-6 mb-3">
                <label for="client">Client</label>
                <input type="text" class="form-control" id="client" name="client" value="<%= request.getAttribute("commande") != null ? ((Commande) request.getAttribute("commande")).getClient() : "" %>" disabled>
            </div>
        </div>

        <button type="submit" class="btn btn-success">Confirmer</button>
        <a href="formcommande" class="btn btn-danger">Retour</a>
    </form>
</div>

</body>
</html>
