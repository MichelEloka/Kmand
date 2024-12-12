package fr.kmand.beans;

public class Commande {
    private String produit;
    private int quantite;
    private double prix;
    private String client;  


    public String getProduit() {
        return produit;
    }
    public void setProduit(String produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getClient() {
        return client;
    }
    public void setClient(String client) {
        this.client = client;
    }
}
