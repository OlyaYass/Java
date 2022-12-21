import java.util.Comparator;

public class MarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMark() - o2.getMark();
    }
}