package ru.courses.main;

import ru.courses.geometry.Line;
import ru.courses.geometry.Measurable;
import ru.courses.geometry.Point;
import ru.courses.math.DoubleWrapper;
import ru.courses.math.Fraction;
import ru.courses.math.IntWrapper;
import ru.courses.math.NumberWrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;
import static java.awt.Point.*;


public class MainClass {
    public static double totalLength(List<Measurable> measurables) {
        double total = 0.0;
        for (Measurable measurable : measurables) {
            total += measurable.getLength();
        }
        return total;
    }

    public static double sumAll(List<NumberWrapper> sumables) {
        double sum = 0.0;
        for (NumberWrapper sumable : sumables) {
            sum += sumable.doubleValue();
        }
        return sum;
    }

    public static Integer mathPow(String x, String y) {
        return (int) pow(parseInt(x), parseInt(y));
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(3, 4);
        Point p4 = new Point(2, 4);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);
        Line l3 = new Line(p3, p4);

        System.out.println(l1.equals(l2));
        System.out.println(l2.equals(l3));

        Line l4 = l3.clone();
        System.out.println(l3.equals(l4));
    }
}
