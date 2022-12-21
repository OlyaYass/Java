import java.util.*;
import java.text.*;

public class Student {
    private Calendar cal = Calendar.getInstance();

    public Student(int day, int month, int year) {
        cal.set(Calendar.DAY_OF_MONTH,day);
        cal.set(Calendar.MONDAY,month-1);
        cal.set(Calendar.YEAR,year);
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        return sdf.format(cal.getTime());
    }

    public static void main(String[] args) {
        Student student = new Student(1,8,2003);
        System.out.println("Ваша дата рождения: "+student);
    }
}
