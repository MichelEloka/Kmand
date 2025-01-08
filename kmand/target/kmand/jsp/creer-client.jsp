<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="fr.kmand.beans.Client" %>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulaire d'Ajout de Client</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="../styles/clientform.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <h2 class="text-center">Formulaire d'Ajout de Client</h2>

    <form action="creer-client" method="POST" class="border p-4 rounded shadow-sm">
        <div class="form-row">
            <div class="col-md-6 mb-3">
                <label for="nom">Nom</label>
                <input type="text" class="form-control" id="nom" name="nom" 
                       value="<%= request.getAttribute("client") != null ? ((Client) request.getAttribute("client")).getNom() : "" %>" >
                <c:if test="${not empty erreurNom}">
                    <div class="text-danger">${erreurNom}</div>
                </c:if>
            </div>
            <div class="col-md-6 mb-3">
                <label for="prenom">Prénom</label>
                <input type="text" class="form-control" id="prenom" name="prenom" 
                       value="<%= request.getAttribute("client") != null ? ((Client) request.getAttribute("client")).getPrenom() : "" %>" >
                <c:if test="${not empty erreurPrenom}">
                    <div class="text-danger">${erreurPrenom}</div>
                </c:if>
            </div>
        </div>

        <div class="form-row">
            <div class="col-md-6 mb-3">
                <label for="email">Email</label>
                <input type="email" class="form-control" id="email" name="email" 
                       value="<%= request.getAttribute("client") != null ? ((Client) request.getAttribute("client")).getEmail() : "" %>" >
                <c:if test="${not empty erreurEmail}">
                    <div class="text-danger">${erreurEmail}</div>
                </c:if>
            </div>
            <div class="col-md-6 mb-3">
                <label for="telephone">Téléphone</label>
                <input type="text" class="form-control" id="telephone" name="telephone" pattern="\d{10}" maxlength="10" 
                       value="<%= request.getAttribute("client") != null ? ((Client) request.getAttribute("client")).getTelephone() : "" %>" >
                <c:if test="${not empty erreurTelephone}">
                    <div class="text-danger">${erreurTelephone}</div>
                </c:if>
            </div>
        </div>

        <div class="form-row">
            <div class="col-md-6 mb-3">
                <label for="adresse">Adresse</label>
                <input type="text" class="form-control" id="adresse" name="adresse" 
                       value="<%= request.getAttribute("client") != null ? ((Client) request.getAttribute("client")).getAdresse() : "" %>" >
                <c:if test="${not empty erreurAdresse}">
                    <div class="text-danger">${erreurAdresse}</div>
                </c:if>
            </div>
            <div class="col-md-6 mb-3">
                <label for="ville">Ville</label>
                <input type="text" class="form-control" id="ville" name="ville" 
                       value="<%= request.getAttribute("client") != null ? ((Client) request.getAttribute("client")).getVille() : "" %>" >
                <c:if test="${not empty erreurVille}">
                    <div class="text-danger">${erreurVille}</div>
                </c:if>
            </div>
        </div>

        <div class="form-row">
            <div class="col-md-6 mb-3">
                <label for="codePostal">Code Postal</label>
                <input type="text" class="form-control" id="codePostal" name="codePostal" pattern="\d{5}" maxlength="5" 
                       value="<%= request.getAttribute("client") != null ? ((Client) request.getAttribute("client")).getCodePostal() : "" %>" required>
                <c:if test="${not empty erreurCodePostal}">
                    <div class="text-danger">${erreurCodePostal}</div>
                </c:if>
            </div>
        </div>

        <button type="submit" class="btn btn-primary btn-block">Ajouter Client</button>
    </form>
</div>

</body>
</html>
