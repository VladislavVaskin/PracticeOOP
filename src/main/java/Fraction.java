public class Fraction extends Number {
    private int numerator; //Числитель
    private int denominator; //Знаменатель

    public Fraction(int numerator, int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("Знаменатель не может быть меньше или равен нулю");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator <= 0)
            throw new IllegalArgumentException("Знаменатель не может быть меньше или равен нулю");
        this.denominator = denominator;
    }

    public Fraction sum(Fraction f) {
        numerator = numerator * f.getDenominator() + f.getNumerator() * denominator;
        denominator *= f.getDenominator();
        reduce();
        return this;
    }

    public Fraction sum(int number) {
        Fraction f = new Fraction(number, 1);
        return sum(f);
    }

    public Fraction minus(Fraction f) {
        numerator = numerator * f.getDenominator() - f.getNumerator() * denominator;
        denominator *= f.getDenominator();
        reduce();
        return this;
    }

    public Fraction minus(int number) {
        Fraction f = new Fraction(number, 1);
        return minus(f);
    }

    private void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public int intValue() {
        return (int) numerator / denominator;
    }

    @Override
    public long longValue() {
        return (long) numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }
}
