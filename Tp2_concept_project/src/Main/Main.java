package Main;

public class Main {
    public static void main(String[] args) {
        Point1 p1 = new Point1();
        p1.initialiser("P1", 5);

        Point2 p2 = new Point2();
        p2.initialiser("P2", 3, 7);

        Point3 p3 = new Point3();
        p3.initialiser("P3", 2, 4, 9);

        System.out.println("Affichage des points :");
        p1.afficher();
        p2.afficher();
        p3.afficher();
    }
}

