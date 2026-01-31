interface NumberWrapper {
    double doubleValue();
}

class IntWrapper implements NumberWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

class DoubleWrapper implements NumberWrapper {
    double value;

    public DoubleWrapper(double value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}