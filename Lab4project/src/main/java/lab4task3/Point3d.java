package lab4task3;

public class Point3d {
    private double x;

    private double y;
    private double z;

    public Point3d(double z, double y, double x) {
        this.z = z;
        this.y = y;
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public double getZ() {
        return z;
    }

    public Point3d reversePlane(Point3d A, Point3d B, Point3d C){
        double abx = B.x - A.x;
        double aby = B.y - A.y;
        double abz = B.z - A.z;

        double acx = C.x - A.x;
        double acy = C.y - A.y;
        double acz = C.z - A.z;

        double nx  = aby *acz - abz * acy;
        double ny = abz * acx - abx * acz;
        double nz = abx * acy- aby * acx;

        double normalLenSq =  nx * nx + ny * ny + nz * nz;

        if (normalLenSq == 0) {
            return new Point3d(z, y, x);
        }

        double px = x - A.x;
        double py = y - A.y;
        double pz= z - A.z;
        double dot = px * nx + py * ny + pz * nz;

        double dist  = dot /Math.sqrt(normalLenSq);

        double rx = x - 2 * (dot / normalLenSq) * nx ;
        double ry = y - 2 * (dot / normalLenSq)* ny;
        double rz = z - 2 * (dot / normalLenSq) * nz;

        return new Point3d(rx, ry, rz);
    }

    @Override
    public String toString() {
        return String.format("(%.3f, %.3f, %.3f)", x, y, z);
    }
}



