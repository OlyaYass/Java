import java.util.*;

public class Report extends Employee {
    static Employee[] array = new Employee[10];
    static int n;

    public static void create(int num) {
        n = num;
        for (int i=0; i<n; i++)
            array[i] = new Employee();
    }

    public static void generateReport() {
        Formatter formatter = new Formatter();
        formatter.format("%-15s %15s","Сотрудник","Зарплата");
        System.out.println(formatter);
        for (int i=0; i<n; i++) {
            System.out.printf("%-15s %15.2f %n",array[i].fullname,array[i].salary);
        }
    }

    public static void main(String[] args) {
        create(2);
        generateReport();
    }
}
