import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Point p1 = new Point(1,5);
        Point p2 = new Point(2,8);
        Point p3 = new Point(5,3);
        Point p4 = new Point(8,9);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);
        Line l3 = new Line(l1.end, l2.start);

        PolyLine pl1 = new PolyLine();
        pl1.addPoint(p1);
        pl1.addPoint(p2);
        pl1.addPoint(p3);
        pl1.addPoint(p4);


        System.out.println(pl1.getLines());

        System.out.println("Длина ломаной линии: " + pl1.getLength());

        List<Line> lines = pl1.getLines();
        double sumOfLines =  0.0;
        for (Line line : lines) {
            sumOfLines = sumOfLines  + line.getLength();
        }
        System.out.println("Сумма длин  линий: " + sumOfLines);
        System.out.println(pl1.getLength()==sumOfLines);

        p2.x= 12;
        p2.y= 8;
        System.out.println("Новые координаты точки p2: " + p2);
        System.out.println("Длина ломаной линии после изменения координат: " + pl1.getLength());
        System.out.println(pl1.getLines());
    }
}
