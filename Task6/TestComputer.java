import java.util.Scanner;

public class TestComputer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop comp = new Shop();
        int brand, memory;
        double diagonal;
        String processor;
        System.out.println("Сколько компьютеров хотите добавить?");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            System.out.print("Введите марку компьютера для добавления (1 - Asus, 2 - Acer, 3 - LG, 4 - Lenovo): ");
            brand = sc.nextInt();
            System.out.print("Введите название процессора: ");
            processor = sc.next();
            System.out.print("Введите объём памяти: ");
            memory = sc.nextInt();
            System.out.print("Введите диагональ: ");
            diagonal = sc.nextDouble();
            comp.addComputer(new Computer(processor,memory,diagonal,brand));
        }
        comp.print();
        System.out.println("Какой элемент удалить?");
        comp.deleteComputer(sc.nextInt()-1);
        comp.print();
        System.out.println("Введите характеристики компьютера для поиска:");
        brand = sc.nextInt();
        processor = sc.next();
        memory = sc.nextInt();
        diagonal = sc.nextDouble();
        System.out.println(comp.findComputer(new Computer(processor,memory,diagonal,brand)));
    }
}
