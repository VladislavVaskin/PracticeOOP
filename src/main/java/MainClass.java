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

    public static void main(String[] args) {

    Fraction fraction1 = new Fraction(3, 5);

        System.out.println(fraction1.intValue());
        System.out.println(fraction1.doubleValue());
    }
}
