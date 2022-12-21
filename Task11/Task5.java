import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        LinkedList<Integer> numbers2 = new LinkedList<Integer>();

        // вставка
        long startTime = System.currentTimeMillis();
        for (int i=0; i<20000; i++) {
            numbers1.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения операции вставки ArrayList: "+(endTime-startTime)+" ms");

        startTime = System.currentTimeMillis();
        for (int i=0; i<20000; i++) {
            numbers2.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения операции вставки LinkedList: "+(endTime-startTime)+" ms");

        System.out.println();
        // удаление
        startTime = System.currentTimeMillis();
        for (int i=0; i<20000; i++) {
            numbers1.remove(0);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения операции удаления ArrayList: "+(endTime-startTime)+" ms");

        startTime = System.currentTimeMillis();
        for (int i=0; i<20000; i++) {
            numbers2.remove(0);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения операции удаления LinkedList: "+(endTime-startTime)+" ms");


        for (int i=0; i<20000; i++) {
            numbers1.add(i);
            numbers2.add(i);
        }
        System.out.println();

        // поиск
        startTime = System.currentTimeMillis();
        numbers1.contains(19000);
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения операции поиска ArrayList: "+(endTime-startTime)+" ms");

        startTime = System.currentTimeMillis();
        numbers2.contains(19000);
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения операции поиска LinkedList: "+(endTime-startTime)+" ms");
    }
}
