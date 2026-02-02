package ru.courses.math;

public class IntWrapper implements NumberWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}
