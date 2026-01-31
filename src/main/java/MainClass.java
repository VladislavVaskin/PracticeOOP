import java.util.ArrayList;
import java.util.List;

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

    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(3, 5);
        Fraction fraction2 = new Fraction(49, 12);
        Fraction fraction3 = new Fraction(3, 2);
        Fraction fraction4 = new Fraction(1, 3);

        List<NumberWrapper> sum1 = new ArrayList<>();
        sum1.add(fraction1);
        sum1.add(new IntWrapper(2));
        sum1.add(new DoubleWrapper(2.3));
        System.out.println(sumAll(sum1));

        List<NumberWrapper> sum2 = new ArrayList<>();
        sum2.add(new DoubleWrapper(3.6));
        sum2.add(fraction2);
        sum2.add(new IntWrapper(3));
        sum2.add(fraction3);
        System.out.println(sumAll(sum2));

        List<NumberWrapper> sum3 = new ArrayList<>();
        sum3.add(fraction4);
        sum3.add(new IntWrapper(1));
        System.out.println(sumAll(sum3));
    }
}
