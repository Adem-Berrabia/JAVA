package ex2_TD_POO_HERITAGE;

public class Bibliotheque {
    public static void main(String[] args) {

        // Création de quelques documents
        Livre l1 = new Livre(1, "Le Petit Prince", "Saint-Exupéry", 120);
        Livre l2 = new Livre(2, "Harry Potter", "J. K. Rowling", 500);
        Dictionnaire d1 = new Dictionnaire(3, "Larousse", "Français", 2);

        // Création de la liste
        ListeDeDocuments liste = new ListeDeDocuments();

        // Ajout des documents
        liste.ajouterDocument(l1);
        liste.ajouterDocument(l2);
        liste.ajouterDocument(d1);

        // Test méthodes
        liste.tousLesAuteurs();
        liste.tousLesDocuments();
    }
}
