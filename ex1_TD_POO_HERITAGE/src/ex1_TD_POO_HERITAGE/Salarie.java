package ex1_TD_POO_HERITAGE;

public class Salarie extends Personne {
    // Attribut spécifique
    private float Salaire;

    // Constructeur
    public Salarie(String Nom, int Enfant, float Salaire) {
        super(Nom, Enfant); // appel du constructeur de Personne
        this.Salaire = Salaire;
    }

    // Méthodes getters
    public String getInfo() {
        return "Nom: " + getNom() + ", Enfants: " + getEnfant();
    }

    public float getSalaire() {
        return Salaire;
    }

    public float getPrime() {
        return (5 * Salaire * getEnfant()) / 100;
    }
}
