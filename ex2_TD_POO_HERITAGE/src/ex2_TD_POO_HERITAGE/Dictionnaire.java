package ex2_TD_POO_HERITAGE;

public class Dictionnaire extends Document {
    private String langue;
    private int nbTomes;

    public Dictionnaire(int numero, String titre, String langue, int nbTomes) {
        super(numero, titre);
        this.langue = langue;
        this.nbTomes = nbTomes;
    }

    @Override
    public String toString() {
        return "Dictionnaire [numéro=" + numero + ", titre=" + titre +
               ", langue=" + langue + ", tomes=" + nbTomes + "]";
    }
}
