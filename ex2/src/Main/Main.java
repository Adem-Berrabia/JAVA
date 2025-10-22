package Main;

public class Main {
    public static void main(String[] args) {
        // Points 1D
        Point1 p1 = new Point1(3);
        Point1 p2 = new Point1(7);
        p1.afficher();
        System.out.println("Distance 1D = " + p1.distance(p2));
        p1.deplacer(2);
        p1.afficher();

        System.out.println("---------------------");

        // Points 2D
        Point2 A = new Point2(1, 2);
        Point2 B = new Point2(3, 4);
        Point2 C = new Point2(5, 6);
        A.afficher();
        B.afficher();
        C.afficher();

        System.out.println("Distance AB = " + A.distance(B));
        System.out.println("A, B, C alignés ? " + Point2.alignes(A, B, C));
        A.deplacer(1, -1);
        A.afficher();

        System.out.println("---------------------");

        // Points 3D
        Point3 X = new Point3(1, 2, 3);
        Point3 Y = new Point3(2, 3, 4);
        Point3 Z = new Point3(3, 4, 5);
        X.afficher();
        Y.afficher();
        Z.afficher();

        System.out.println("Distance XY = " + X.distance(Y));
        System.out.println("X, Y, Z alignés ? " + Point3.alignes(X, Y, Z));
        X.deplacer(1, 1, 1);
        X.afficher();
    }
}
