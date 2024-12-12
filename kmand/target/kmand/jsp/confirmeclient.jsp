<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="fr.kmand.beans.Client" %>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Résumé des Informations Client</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="styles.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <h2 class="text-center">Résumé des Informations Client</h2>
    <form action="ajouter-client" method="POST">
        <div class="form-row">
            <div class="col-md-6 mb-3">
                <label for="nom">Nom</label>
                <input type="text" class="form-control" id="nom" name="nom" value="<%= request.getAttribute("client") != null ? ((Client) request.getAttribute("client")).getNom() : "" %>" disabled>
            </div>
            <div class="col-md-6 mb-3">
                <label for="prenom">Prénom</label>
                <input type="text" class="form-control" id="prenom" name="prenom" value="<%= request.getAttribute("client") != null ? ((Client) request.getAttribute("client")).getPrenom() : "" %>" disabled>
            </div>
        </div>

        <div class="form-row">
            <div class="col-md-6 mb-3">
                <label for="email">Email</label>
                <input type="email" class="form-control" id="email" name="email" value="<%= request.getAttribute("client") != null ? ((Client) request.getAttribute("client")).getEmail() : "" %>" disabled>
            </div>
            <div class="col-md-6 mb-3">
                <label for="telephone">Téléphone</label>
                <input type="text" class="form-control" id="telephone" name="telephone" value="<%= request.getAttribute("client") != null ? ((Client) request.getAttribute("client")).getTelephone() : "" %>" disabled>
            </div>
        </div>

        <div class="form-row">
            <div class="col-md-6 mb-3">
                <label for="adresse">Adresse</label>
                <input type="text" class="form-control" id="adresse" name="adresse" value="<%= request.getAttribute("client") != null ? ((Client) request.getAttribute("client")).getAdresse() : "" %>" disabled>
            </div>
            <div class="col-md-6 mb-3">
                <label for="ville">Ville</label>
                <input type="text" class="form-control" id="ville" name="ville" value="<%= request.getAttribute("client") != null ? ((Client) request.getAttribute("client")).getVille() : "" %>" disabled>
            </div>
        </div>

        <div class="form-row">
            <div class="col-md-6 mb-3">
                <label for="codePostal">Code Postal</label>
                <input type="text" class="form-control" id="codePostal" name="codePostal" value="<%= request.getAttribute("client") != null ? ((Client) request.getAttribute("client")).getCodePostal() : "" %>" disabled>
            </div>
        </div>

        <button type="submit" class="btn btn-success">Confirmer</button>
        <a href="formulaire-client.jsp" class="btn btn-danger">Retour</a>
    </form>
</div>

</body>
</html>
