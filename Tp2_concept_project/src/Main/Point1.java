package Main;

public class Point1 {
    public String nom;
    public double x;

    public void initialiser(String n, double x) {
        this.nom = n;
        this.x = x;
    }

    public void afficher() {
        System.out.println(nom + " : (" + x + ")");
    }
}
