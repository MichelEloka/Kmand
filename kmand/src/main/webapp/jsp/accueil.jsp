<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Kmand - Accueil</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../styles/acceuil.css"> 

</head>
<body>
<style>
body {
    font-family: 'Arial', sans-serif;
    background-color: #f4f7fa;
    color: #333;
}

.header {
    background-color: #2a2a72;
    color: white;
    text-align: center;
    padding: 40px 30px;
    font-size: 28px;
    font-family: 'Brush Script MT', cursive;
}

.header h1 {
    margin: 0;
    font-size: 40px;
}

.container {
    text-align: center;
    padding-top: 50px;
}

.logo {
    font-size: 100px;
    color: #2a2a72;
    margin-bottom: 30px;
}

.buttons a {
    display: inline-block;
    margin: 15px 20px;
    padding: 12px 25px;
    font-size: 18px;
    text-decoration: none;
    border-radius: 5px;
    transition: all 0.3s ease;
}

.btn-custom {
    background-color: #007bff;
    color: white;
    border: none;
    box-shadow: 0 4px 6px rgba(0, 123, 255, 0.3); 
}

.btn-custom:hover {
    background-color: #0056b3;
    box-shadow: 0 6px 12px rgba(0, 123, 255, 0.5); 
    transform: translateY(-3px); 
}


.animation {
    animation: fadeIn 1.5s ease-out;
}

@keyframes fadeIn {
    from {
        opacity: 0;
        transform: translateY(-50px);
    }
    to {
        opacity: 1;
        transform: translateY(0);
    }
}


</style>
    <div class="header">
        <h1 class="animation">Bienvenue sur Kmand</h1>
    </div>
    
    <div class="container animation">
        <div class="logo">
            <i class="fas fa-box-open"></i>
        </div>

        <div class="buttons">
            <a href="/kmand/formclient" class="btn btn-custom">Ajouter Client</a>
            <a href="/kmand/formcommande" class="btn btn-custom">Ajouter Commande</a>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>