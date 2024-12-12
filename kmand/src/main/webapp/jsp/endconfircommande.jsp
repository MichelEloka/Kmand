<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Confirmation Commande</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <h2 class="text-center">Confirmation</h2>

    <div class="alert alert-success">
        <strong>Succès!</strong> La commande pour le produit <strong>${commande.produit}</strong> a bien été ajoutée.
    </div>

    <a href="accueil" class="btn btn-primary">Retour à l'accueil</a>
</div>

</body>
</html>
