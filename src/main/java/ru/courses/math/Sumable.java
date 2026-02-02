package ru.courses.math;

public interface Sumable {
    Fraction sum(int number);
    Fraction sum(Fraction fraction);
    double doubleValue();
}