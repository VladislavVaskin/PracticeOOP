import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        Student student1 = new Student("Ivan");
        Student student2 = new Student("Petr");

        student1.setGrade(2);
        student1.setGrade(3);
        student1.setGrade(3);
        student1.setGrade(5);
        student2.setGrade(4);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.getGrades());

        Point3D p1 = new Point3D(1,2,3);
        Point3D p2 = new Point3D(4,5,6);
        System.out.println(p1);
        System.out.println(p2);
    }
}
