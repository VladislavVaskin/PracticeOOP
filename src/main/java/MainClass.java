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

        Point p1 = new Point(2, 5);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(6, 8);
        Point p4 = new Point(5, 7);

        PolyLine polyLine1 = new PolyLine();
        polyLine1.addPoint(p1);
        polyLine1.addPoint(p2);
        polyLine1.addPoint(p3);
        polyLine1.addPoint(p4);

        ClosedPolyLine closedPolyLine1 = new ClosedPolyLine();
        closedPolyLine1.addPoint(p1);
        closedPolyLine1.addPoint(p2);
        closedPolyLine1.addPoint(p3);
        closedPolyLine1.addPoint(p4);

        List<Measurable> measurables = new ArrayList<>();
        measurables.add(polyLine1);
        measurables.add(closedPolyLine1);

        System.out.println("Длина всех объектов: " + totalLength(measurables));

    }
}
