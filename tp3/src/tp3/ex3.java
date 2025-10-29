package tp3;
// Nom du fichier : TestLivre.java
class Livre {
    // Variables d'instance
    private String titre;
    private String auteur;
    private int nbPages;

    // Constructeur sans paramètre
    public Livre() {
        this.auteur = "Inconnu";
        this.titre = "Sans titre";
        this.nbPages = 0;
    }

    // Constructeur avec auteur et titre
    public Livre(String auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = 0;
    }

    // Constructeur avec auteur, titre et nbPages
    public Livre(String auteur, String titre, int nbPages) {
        this.auteur = auteur;
        this.titre = titre;
        setNbPages(nbPages);
    }

    // Accesseurs (getters)
    public String getAuteur() { return auteur; }
    public String getTitre() { return titre; }
    public int getNbPages() { return nbPages; }

    // Modificateurs (setters)
    public void setAuteur(String auteur) { this.auteur = auteur; }
    public void setTitre(String titre) { this.titre = titre; }
    public void setNbPages(int nbPages) {
        if (nbPages > 0) this.nbPages = nbPages;
        else System.out.println("Erreur : le nombre de pages doit être positif !");
    }

    // toString
    @Override
    public String toString() {
        return "Livre : \"" + titre + "\" de " + auteur + " (" + nbPages + " pages)";
    }

    // afficheToi()
    public void afficheToi() {
        System.out.println(toString());
    }
}

// Classe principale avec main
public class ex3 {
    public static void main(String[] args) {
        // Création de 3 livres
        Livre livre1 = new Livre();
        Livre livre2 = new Livre("Victor Hugo", "Les Misérables");
        Livre livre3 = new Livre("J.K. Rowling", "Harry Potter", 300);

        // Modifier le nombre de pages pour les deux premiers
        livre1.setNbPages(300);
        livre2.setNbPages(300);

        // Affichage
        livre1.afficheToi();
        livre2.afficheToi();
        livre3.afficheToi();

        // Total des pages
        int totalPages = livre1.getNbPages() + livre2.getNbPages() + livre3.getNbPages();
        System.out.println("Nombre total de pages : " + totalPages);
    }
}
