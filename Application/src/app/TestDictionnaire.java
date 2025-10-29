package app;
public class TestDictionnaire {

    public static void main(String[] args) {

        MotDictionnaire dico = new Dictionnaire();

        dico.Ajouter("Fait", "Nom", 'M', "événement chose");
        dico.Ajouter("Vague", "Nom", 'F', "ondulation à la surface de l'eau");
        dico.Ajouter("Réussir", "V", '-', "avoir un bon résultat");

        System.out.println("\nRecherche du mot 'Fait' :");
        dico.Rechercher("Fait");

        System.out.println("\nSuppression du mot 'Fait' :");
        dico.Supprimer("Fait");

        System.out.println("\nPremier mot du dictionnaire :");
        dico.Premier();

        System.out.println("\nDernier mot du dictionnaire :");
        dico.Dernier();

        System.out.println("\nRecherche du mot 'Fait' après suppression :");
        dico.Rechercher("Fait");
    }
}
