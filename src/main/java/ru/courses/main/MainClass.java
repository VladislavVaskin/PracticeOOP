package ru.courses.main;

import ru.courses.geometry.Measurable;
import ru.courses.math.DoubleWrapper;
import ru.courses.math.Fraction;
import ru.courses.math.IntWrapper;
import ru.courses.math.NumberWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

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

    public static void main(String[] args) {

        System.out.println("Введите число X и степень Y для возведения в степень: ");
        String x = new Scanner(System.in).next();
        String y = new Scanner(System.in).next();

        System.out.println("Результат возведения в степень:" + mathPow(x, y));
    }
}
