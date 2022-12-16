import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        int arr[] = new int[4];
        boolean b = true;
        for (int i=0; i<4; i++) {
            arr[i] = (int) (10 + Math.random() * 90);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i=0; i<3; i++) {
            if (arr[i+1] <= arr[i]) {
                b = false;
                break;
            }
        }
        if (b) System.out.println("Является строго возрастающей последовательностью");
        else System.out.println("Не является строго возрастающей последовательностью");
    }
}
