package Main;

public class Point3 {
    public String nom;
    public double x, y, z;

    public void initialiser(String n, double x, double y, double z) {
        this.nom = n;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void afficher() {
        System.out.println(nom + " : (" + x + ", " + y + ", " + z + ")");
    }
}
