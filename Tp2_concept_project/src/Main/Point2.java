package Main;

public class Point2 {
    public String nom;
    public double x, y;

    public void initialiser(String n, double x, double y) {
        this.nom = n;
        this.x = x;
        this.y = y;
    }

    public void afficher() {
        System.out.println(nom + " : (" + x + ", " + y + ")");
    }
}
