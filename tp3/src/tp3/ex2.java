package tp3;
public class ex2 {

	private String titre;
    private String auteur;
    private int nbPages;

    public ex2(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setAuteur(String unAuteur) {
     //   auteur = unAuteur;
        this.auteur=unAuteur;
    }

    public void setTitre(String unTitre) {
        titre = unTitre;
    }

    public void setNbPages(int n) {
        if (n > 0) {
            nbPages = n;
        } else {
            System.out.println("Erreur : le nombre de pages doit être positif !");
        }
    }

   
    public static void main(String[] args) {

    	ex2 livre1 = new ex2("Victor Hugo", "Les Misérables");
        ex2 livre2 = new ex2("Albert Camus", "L'Étranger");

        livre1.setNbPages(500);
        livre2.setNbPages(150);

        System.out.println("Livre 1 : " + livre1.getTitre() + " → " + livre1.getNbPages() + " pages");
        System.out.println("Livre 2 : " + livre2.getTitre() + " → " + livre2.getNbPages() + " pages");

        int totalPages = livre1.getNbPages() + livre2.getNbPages();
        System.out.println("Nombre total de pages : " + totalPages);
    }
}
