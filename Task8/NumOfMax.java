import java.util.Scanner;

public class NumOfMax {
    public static void recursion(int max, int count) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num > 0) {

            if (num > max) recursion(num, 1);

            else if (num == max) recursion(max, ++count);

            else recursion(max, count);

        }
        else System.out.println("Num of max numbers: "+count);
    }

    public static void main(String[] args) {
        recursion(0, 0);
    }
}
