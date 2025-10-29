package tp3;

public class Banque {
    // Variables d'instance
    private int Ncompte;
    private double solde;
    private String cin;

    // Constructeur
    public Banque(int Ncompte, double solde, String cin) {
        this.Ncompte = Ncompte;
        this.solde = solde;
        this.cin = cin;
    }

    // Méthodes de gestion du compte
    public void deposer(double somme) {
            solde += somme;
    }

    public void retirer(double somme) {
                solde -= somme;
    }

    public double avoirSolde() {
        return solde;
    }

    public String avoirInf() {
        return "Compte n°" + Ncompte + " | CIN = " + cin + " | Solde = " + String.format("%.2f €", solde);
    }

    // Accesseurs
    public int getNcompte() {
        return Ncompte;
    }

    public double getSolde() {
        return solde;
    }

    public String getCin() {
        return cin;
    }

    // Modificateurs
    public void setCin(String cin) {
        this.cin = cin;
    }

    // Méthode main pour tester toutes les opérations
    public static void main(String[] args) {
        // Création du compte
        Banque compte1 = new Banque(1, 5000.75, "AB 1200");

        // Affichage initial
        System.out.println("État initial du compte :");
        System.out.println(compte1.avoirInf());

        // Déposer 500
        compte1.deposer(500);
        System.out.println("Après dépôt :");
        System.out.println(compte1.avoirInf());

        // Retirer 200
        compte1.retirer(200);
        System.out.println("Après retrait :");
        System.out.println(compte1.avoirInf());
    }
}
