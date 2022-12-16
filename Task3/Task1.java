import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        // использование метода random() класса Math
        for (int i=0; i<10; i++) {
            arr[i] = (int)(Math.random()*40);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int i=0; i<10; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println();

        // использование класса Random
        Random rand = new Random();
        for (int i=0; i<10; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i=0; i<10; i++)
            System.out.print(arr[i]+" ");
    }
}