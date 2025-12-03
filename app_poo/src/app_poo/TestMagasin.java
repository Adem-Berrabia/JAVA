package app_poo;

public class TestMagasin {
    public static void main(String[] args) {
        Magasin magasin = new Magasin("SuperMarché");

        Produit p1 = new Produit("P001", "Pommes");
        Produit p2 = new Produit("P002", "Bananes");

        Prix prix1 = new Prix(2.0, 10);
        Prix prix2 = new Prix(1.5, 10);

        ProduitMagasin pm1 = new ProduitMagasin(p1, prix1, 10);
        ProduitMagasin pm2 = new ProduitMagasin(p2, prix2, 20);

        magasin.ajouter(pm1);
        magasin.ajouter(pm2);

        magasin.afficher();
        System.out.println("Total Quantité: " + magasin.getTotalQuantite());
        System.out.println("Total HT: " + magasin.getTotalHT());
        System.out.println("Total TTC: " + magasin.getTotalTTCO());

        System.out.println("\nRechercher 'Pommes':");
        magasin.rechercher("Pommes");

        System.out.println("\nSupprimer 'Bananes':");
        magasin.supprimer("Bananes");
        magasin.afficher();
    }
}
