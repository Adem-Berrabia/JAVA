package ex2_TD_POO_HERITAGE;

public class Livre extends Document {
    private String auteur;
    private int nbPages;

    public Livre(int numero, String titre, String auteur, int nbPages) {
        super(numero, titre);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    public String getAuteur() {
        return auteur;
    }

    @Override
    public String toString() {
        return "Livre [numéro=" + numero + ", titre=" + titre +
               ", auteur=" + auteur + ", pages=" + nbPages + "]";
    }
}

