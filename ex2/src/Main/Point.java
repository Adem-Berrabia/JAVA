package Main;

public class Point {
    private int x, y, z;
    // Constructor
    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setx(int a) {
        x = a;
    }
    // Alignement 
    public Boolean Alignement(Point p2, Point p3) {
        if (((x-p2.x)/(x-p3.x))==((y-p2.y)/(y-p3.y))) {
            return true;
        }
        return false;
    }
}
