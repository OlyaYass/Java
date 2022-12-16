import java.util.Scanner;

public class Employee {
    protected String fullname;
    protected double salary;

   public Employee() {
       Scanner sc = new Scanner(System.in);
       System.out.print("Введите фамилию: ");
       this.fullname = sc.nextLine();
       System.out.print("Введите зарплату: ");
       this.salary = sc.nextDouble();
    }
}
