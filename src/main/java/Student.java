import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private final List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrade(int grade) {
        if (grade < 2 || grade > 5) throw new IllegalArgumentException("Оценка должна быть в диапазоне от 2 до 5");
        this.grades.add(grade);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", grades=" + grades + "]";
    }
}
