package Main;

public class Point1 {
    protected double x;

    // Constructeurs
    public Point1() {
        this.x = 0;
    }

    public Point1(double x) {
        this.x = x;
    }

    // Destructeur (en Java, on utilise finalize)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destruction de Point1");
    }

    // Afficher
    public void afficher() {
        System.out.println("Point1(" + x + ")");
    }

    // Déplacer
    public void deplacer(double dx) {
        this.x += dx;
    }

    // Distance entre deux points
    public double distance(Point1 p) {
        return Math.abs(this.x - p.x);
    }
}
