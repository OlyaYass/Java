import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Введите n > 0: ");
            n = in.nextInt();
            if (n > 0) break;
        }
        int[] arr = new int[n];
        System.out.println("Первый массив");
        for (int i=0; i<n; i++) {
            arr[i] = (int)(Math.random()*(n+1));
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] arr2 = new int[n];
        int j=0;
        for (int i=0; i<n; i++) {
            if (arr[i] % 2 == 0) {
                arr2[j] = arr[i];
                j++;
            }
        }
        System.out.println("Второй массив");
        for (int i=0; i<j; i++)
            System.out.print(arr2[i]+" ");
    }
}
