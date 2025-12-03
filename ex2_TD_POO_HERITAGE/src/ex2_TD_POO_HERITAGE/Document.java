package ex2_TD_POO_HERITAGE;

public class Document {
    protected int numero;
    protected String titre;

    public Document(int numero, String titre) {
        this.numero = numero;
        this.titre = titre;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return "Document [numéro=" + numero + ", titre=" + titre + "]";
    }
}
