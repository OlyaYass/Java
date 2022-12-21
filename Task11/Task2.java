import java.util.*;
import java.text.*;

public class Task2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = sc.nextInt();
        System.out.print("Введите месяц: ");
        int month = sc.nextInt();
        System.out.print("Введите год: ");
        int year = sc.nextInt();
        cal1.set(Calendar.DAY_OF_MONTH,day);
        cal1.set(Calendar.MONDAY,month-1);
        cal1.set(Calendar.YEAR,year);
        System.out.println("Введённая дата: "+sdf.format(cal1.getTime()));
        System.out.println("Сегодняшняя дата: "+sdf.format(cal2.getTime()));

        if (cal1.after(cal2))
            System.out.println("Введённая дата больше сегодняшней");
        else if (cal2.after(cal1))
            System.out.println("Сегодняшняя дата больше введённой");
        else System.out.println("Даты одинаковые");
    }
}
