import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Студент 1", 65, 11));
        s.add(new Student("Студент 2", 56, 10));
        s.add(new Student("Студент 3", 88, 8));
        s.add(new Student("Студент 4", 93, 16));
        s.add(new Student("Студент 5", 27, 4));

        new GUI(s);
    }

}