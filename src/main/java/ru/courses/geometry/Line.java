package ru.courses.geometry;

import java.util.Objects;

public class Line implements Measurable, Cloneable {
    public Point start;
    public Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int hashCode() {
        int hash = 9;
        hash = 31 * hash + Objects.hashCode(this.start);
        hash = 31 * hash + Objects.hashCode(this.end);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line line = (Line) obj;
        return Objects.equals(start, line.start) &&
                Objects.equals(end, line.end);
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        Line clonedLine = (Line) super.clone();
        clonedLine.start = this.start.clone();
        clonedLine.end = this.end.clone();
        return clonedLine;
    }

    @Override
    public String toString() {
        return ("Линия от " + start.toString() +
                " до " + end.toString());
    }

    @Override
    public double getLength() {
        return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
    }
}
