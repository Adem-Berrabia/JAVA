package app_poo;

public class ProduitMagasin implements CalculTotal {
    private Produit produit;
    private Prix prix;
    private int quantite;

    public ProduitMagasin(Produit produit, Prix prix, int quantite) {
        this.produit = produit;
        this.prix = prix;
        this.quantite = quantite;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    public Prix getPrix() {
        return prix;
    }

    public void afficher() {
        produit.afficher();
        prix.afficher();
        System.out.println("Quantité: " + quantite);
    }

    @Override
    public double getTotalHT() {
        return prix.getPrixHT() * quantite;
    }

    @Override
    public double getTotalTTCO() {
        return prix.getPrixTTCO() * quantite;
    }
}
