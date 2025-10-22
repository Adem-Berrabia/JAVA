package Main;

public class Point2 extends Point1 {
    protected double y;

    // Constructeurs
    public Point2() {
        super();
        this.y = 0;
    }

    public Point2(double x, double y) {
        super(x);
        this.y = y;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destruction de Point2");
    }

    // Afficher
    @Override
    public void afficher() {
        System.out.println("Point2(" + x + ", " + y + ")");
    }

    // Déplacer
    public void deplacer(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    // Distance
    public double distance(Point2 p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    // Vérifier l’alignement (avec trois points)
    public static boolean alignes(Point2 A, Point2 B, Point2 C) {
        return (A.x - B.x) * (A.y - C.y) == (A.x - C.x) * (A.y - B.y);
    }
}
