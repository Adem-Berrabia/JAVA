package ex2_TD_POO_HERITAGE;

import java.util.ArrayList;

public class ListeDeDocuments {
    private ArrayList<Document> liste;

    public ListeDeDocuments() {
        liste = new ArrayList<>();
    }

    public void ajouterDocument(Document d) {
        liste.add(d);
    }

    public void tousLesAuteurs() {
        System.out.println("Auteurs des documents : ");
        for (Document d : liste) {
            System.out.print("Document n°" + d.getNumero() + " : ");
            if (d instanceof Livre) {
                System.out.println(((Livre) d).getAuteur());
            } else {
                System.out.println("Pas d'auteur");
            }
        }
    }

    public void tousLesDocuments() {
        System.out.println("\nListe des documents : ");
        for (Document d : liste) {
            System.out.println(d.toString());
        }
    }
}
