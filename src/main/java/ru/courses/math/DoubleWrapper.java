package ru.courses.math;

public class DoubleWrapper implements NumberWrapper {
    double value;

    public DoubleWrapper(double value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}
