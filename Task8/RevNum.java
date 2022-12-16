import java.util.Scanner;

public class RevNum {
    public static int recursion(int num) {  // задание 15
        if (num < 10) {
            return num;
        }
        else {
            System.out.print(num % 10 + " ");
            return recursion(num / 10);
        }
    }

    public static void main(String[] args) {
        System.out.print("Number for test: ");
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        System.out.println(recursion(b));
    }

}
