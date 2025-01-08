<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajouter une Commande - Kmand</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<
<div class="container mt-5">
    <h2 class="text-center">Formulaire d'Ajout de Commande</h2>

    <form action="creer-commande" method="POST">
        <div class="form-row">
            <div class="col-md-6 mb-3">
                <label for="client">Client</label>
                <select class="form-control" id="client" name="client" >
                    <option value="">Sélectionner un client</option>
                    <option value="1">Client 1</option>
                    <option value="2">Client 2</option>
                </select>
                <c:if test="${not empty erreurClient}">
                    <div class="text-danger">${erreurClient}</div>
                </c:if>
            </div>
        </div>

        <div class="form-row">
            <div class="col-md-6 mb-3">
                <label for="article">Article</label>
                <input type="text" class="form-control" id="article" name="article" maxlength="100" value="<%= request.getAttribute("article") != null ? request.getAttribute("article") : "" %>" >
                <c:if test="${not empty erreurArticle}">
                    <div class="text-danger">${erreurArticle}</div>
                </c:if>
            </div>
            <div class="col-md-6 mb-3">
                <label for="quantite">Quantité</label>
                <input type="number" class="form-control" id="quantite" name="quantite" min="1" value="<%= request.getAttribute("quantite") != null ? request.getAttribute("quantite") : "" %>" >
                <c:if test="${not empty erreurQuantite}">
                    <div class="text-danger">${erreurQuantite}</div>
                </c:if>
            </div>
        </div>

        <div class="form-row">
            <div class="col-md-6 mb-3">
                <label for="prix">Prix</label>
                <input type="number" class="form-control" id="prix" name="prix" step="0.01" min="0" value="<%= request.getAttribute("prix") != null ? request.getAttribute("prix") : "" %>" >
                <c:if test="${not empty erreurPrix}">
                    <div class="text-danger">${erreurPrix}</div>
                </c:if>
            </div>
        </div>

        <button type="submit" class="btn btn-primary btn-block">Ajouter Commande</button>
    </form>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
