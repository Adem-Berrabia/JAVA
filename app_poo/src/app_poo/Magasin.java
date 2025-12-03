package app_poo;

import java.util.Vector;

public class Magasin implements CalculTotal {
    private String nom;
    private Vector<ProduitMagasin> produits;

    public Magasin(String nom) {
        this.nom = nom;
        this.produits = new Vector<>();
    }

    public void ajouter(ProduitMagasin produitMagasin) {
        produits.add(produitMagasin);
    }

    public boolean supprimer(int indice) {
        if (indice >= 0 && indice < produits.size()) {
            produits.remove(indice);
            return true;
        }
        return false;
    }

    public void supprimer(String nomProduit) {
        produits.removeIf(p -> p.getProduit().getDesignation().equalsIgnoreCase(nomProduit));
    }

    public void supprimerTout() {
        produits.clear();
    }

    public int getNbProduits() {
        return produits.size();
    }

    public void rechercher(String nomProduit) {
        for (ProduitMagasin p : produits) {
            if (p.getProduit().getDesignation().equalsIgnoreCase(nomProduit)) {
                p.afficher();
            }
        }
    }

    public void afficher() {
        System.out.println("Magasin: " + nom);
        for (ProduitMagasin p : produits) {
            p.afficher();
            System.out.println("---------------------");
        }
    }

    public int getTotalQuantite() {
        int total = 0;
        for (ProduitMagasin p : produits) {
            total += p.getQuantite();
        }
        return total;
    }

    @Override
    public double getTotalHT() {
        double total = 0;
        for (ProduitMagasin p : produits) {
            total += p.getTotalHT();
        }
        return total;
    }

    @Override
    public double getTotalTTCO() {
        double total = 0;
        for (ProduitMagasin p : produits) {
            total += p.getTotalTTCO();
        }
        return total;
    }
}
