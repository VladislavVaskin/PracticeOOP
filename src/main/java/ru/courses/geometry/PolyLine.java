package ru.courses.geometry;

import java.util.ArrayList;
import java.util.List;

public class PolyLine implements Measurable {
    List<Point> points;

    public PolyLine() {
        this.points = new ArrayList<>();
    }

    public PolyLine(List<Point> points) {
        this.points = new ArrayList<>(points);
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public double distance(Point start, Point end) {
        return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
    }
    @Override
    public double getLength() {
        double length = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += distance(points.get(i), points.get(i + 1));
        }
        return length;
    }

    public List<Line> getLines() {
        if (points.size() < 2) {
            return new ArrayList<>();
        }
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < points.size() - 1; i++) {
            lines.add(new Line(points.get(i), points.get(i + 1)));
        }
        return lines;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Линия [");
        for (int i = 0; i < points.size(); i++) {
            sb.append(points.get(i));
            if (i < points.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

class ClosedPolyLine extends PolyLine {
    @Override
    public double getLength() {
        double length = super.getLength();
        length += distance(points.get(0), points.get(points.size() - 1));
        return length;
    }
}
