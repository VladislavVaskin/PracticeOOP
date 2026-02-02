package ru.courses.geometry;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + this.x + ";" + this.y + "}";
    }
}

class Point3D extends  Point {
    int z;
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" + this.x + ";" + this.y + ";" + this.z + "}";
    }
}
