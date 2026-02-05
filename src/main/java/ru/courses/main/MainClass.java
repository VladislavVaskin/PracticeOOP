package ru.courses.main;

import ru.courses.coocking.Sauce;
import ru.courses.coocking.SpicyLevel;
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

    public static void main(String[] args){
        Sauce sc1 = new Sauce("Tobasco", SpicyLevel.VERY_SPICY);

        System.out.println(sc1);
    }
}
