package lab4task3;

public class Point2d {
    private double x;
    private double y;

    public Point2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point2d reverse(Point2d A, Point2d B){
        double dx = B.x - A.x;
        double dy = B.y - A.y;

        double px = this.x - A.x;
        double py = this.y - A.y;

        double dot = px * dx + py * dy;
        double lenSg = dx * dx + dy * dy;

        if (lenSg == 0){
            return new Point2d(this.x, this.y);
        }

        double projX = dot * dx / lenSg;
        double projY = dot * dy / lenSg;

        double gx = A.x + projX;
        double gy = A.y + projY;

        double rx = 2 * gx - this.x;
        double ry = 2 *  gy - this.y;

        return new Point2d(rx, ry);


    }

    @Override
    public String toString(){
        return String.format("(%.3f, %.3f)", x, y);
    }
}
