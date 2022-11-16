public class Point {

    private double x, y;   // coordenadas dos pontos

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double polarAngle() {
        return Math.atan2(y, x);
    }

    double ccw(Point p0, Point p1) {
        double ccw = 0.0;
        ccw = (p1.getX()-p0.getX())*(y-p0.getY()-p1.getY())-(p1.getY()-p0.getY()*(x-p0.getX()));
        return ccw;
    }

    public boolean equals(Point p) {
        return (this.getX() == p.getX() && this.getY() == p.getY());
    }

    public String toString() {
        return ("(" + x + " , " + y + ")");
    }

}
