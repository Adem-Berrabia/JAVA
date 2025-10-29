package tp3;



public class ex4 {
    // Variables d’instance
    private String titre;
    private String auteur;
    private int nbPages;
    private double prix;
    private boolean prixFixe; // indique si le prix a déjà été fixé

    // Constructeur 1 : sans prix
    public ex4(String unAuteur, String unTitre) {
        this.auteur = unAuteur;
        this.titre = unTitre;
        this.prixFixe = false;
    }

    // Constructeur 2 : avec prix
    public ex4(String unAuteur, String unTitre, double unPrix) {
        this.auteur = unAuteur;
        this.titre = unTitre;
        this.setPrix(unPrix); 
    }

    // Accesseurs
    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    public int getNbPages() {
        return nbPages;
    }

    public double getPrix() {
        return prix;
    }

    // Modificateurs
    public void setAuteur(String unAuteur) {
        this.auteur = unAuteur;
    }

    public void setTitre(String unTitre) {
        this.titre = unTitre;
    }

    public void setNbPages(int n) {
        if (n > 0) {
            this.nbPages = n;
        } else {
            System.out.println("Erreur : le nombre de pages doit être positif !");
        }
    }

    // Méthode setPrix avec contrôle
    public void setPrix(double unPrix) {
        if (!prixFixe) {
            if (unPrix > 0) {
                this.prix = unPrix;
                this.prixFixe = true; 
            } else {
                System.out.println("Erreur : le prix doit être positif !");
            }
        } else {
            System.out.println("Erreur : le prix a déjà été fixé et ne peut plus être modifié !");
        }
    }

    // Méthode toString()
    @Override
    public String toString() {
        String infoPrix;
        if (prixFixe) {
            infoPrix = prix + " €";
        } else {
            infoPrix = "Prix pas encore fixé";
        }

        return "Livre : " + titre + " | Auteur : " + auteur + 
               " | Pages : " + nbPages + " | " + infoPrix;
    }

    // Méthode main pour les tests
    public static void main(String[] args) {
        // Cas 1 : livre sans prix fixé
        ex4 livre1 = new ex4("Victor Hugo", "Les Misérables");
        livre1.setNbPages(500);
        System.out.println(livre1); 

        // Cas 2 : livre avec prix fixé dès le départ
        ex4 livre2 = new ex4("Albert Camus", "L'Étranger", 19.99);
        livre2.setNbPages(150);
        System.out.println(livre2);

        // Cas 3 : tentative de modifier le prix plusieurs fois
        livre2.setPrix(25.0); 

        // Cas 4 : fixer le prix plus tard pour un livre sans prix initial
        livre1.setPrix(29.5);
        System.out.println(livre1);

        // Tentative de le modifier à nouveau
        livre1.setPrix(31.0); 
    }
}
