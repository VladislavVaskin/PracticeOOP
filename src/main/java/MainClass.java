public class MainClass {
    public static void main(String[] args) {
        Point p1 = new Point(1,3);
        Point p2 = new Point(5,8);
        Point p3 = new Point(10,11);
        Point p4 = new Point(15,19);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);
        Line l3 = new Line(l1.end, l2.start);

        System.out.println(l3);

        l3.start.x = 23;
        l3.start.y = 12;
        l3.end.x = 31;
        l3.end.y = 19;

        System.out.println(l3);

        double sum = l1.getLength() + l2.getLength() + l3.getLength();
        System.out.println("Сумма длин: " + sum);
    }
}
