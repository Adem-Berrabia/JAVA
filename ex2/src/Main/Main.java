package Main;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);
        Point p3 = new Point(3,3);
        // int D=p1.distance(p2);
        // System.out.println("Distance between p1 and p2: " + D);
        Boolean t = p1.Alignement(p2,p3);
        if (t) {
            System.out.println("The points are aligned");
        } else {
            System.out.println("The points are not aligned");
            
        }
    }
}
