package Main;

public class Point3 extends Point2 {
    private double z;

    // Constructeurs
    public Point3() {
        super();
        this.z = 0;
    }

    public Point3(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destruction de Point3");
    }

    // Afficher
    @Override
    public void afficher() {
        System.out.println("Point3(" + x + ", " + y + ", " + z + ")");
    }

    // Déplacer
    public void deplacer(double dx, double dy, double dz) {
        this.x += dx;
        this.y += dy;
        this.z += dz;
    }

    // Distance
    public double distance(Point3 p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2) + Math.pow(this.z - p.z, 2));
    }

    // Vérifier l’alignement (3 points dans l’espace)
    public static boolean alignes(Point3 A, Point3 B, Point3 C) {
        double abx = B.x - A.x;
        double aby = B.y - A.y;
        double abz = B.z - A.z;

        double acx = C.x - A.x;
        double acy = C.y - A.y;
        double acz = C.z - A.z;

        // Vérifie si les vecteurs AB et AC sont colinéaires (produit vectoriel nul)
        double vx = aby * acz - abz * acy;
        double vy = abz * acx - abx * acz;
        double vz = abx * acy - aby * acx;

        return (vx == 0 && vy == 0 && vz == 0);
    }
}
