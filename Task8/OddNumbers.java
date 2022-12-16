import java.util.Scanner;
import java.lang.String;

public class OddNumbers {
    public static void recursion() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num > 0) {
            if (num % 2 == 1) {
                System.out.println("Odd number: "+num);
                recursion();
            } else {
                recursion();
            }
        }
    }

    public static void main(String[] args) {

        recursion();
    }
}