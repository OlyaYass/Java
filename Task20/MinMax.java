import java.util.Arrays;

public class MinMax<T extends Comparable<T>> implements Comparable<MinMax<T>> {
    private final T[] arr;
    private T data;
    public final int length;

    public MinMax(Class<T> type, int length) {
        // Создает новый массив указанного типа и длины во время выполнения
        this.arr = (T[]) java.lang.reflect.Array.newInstance(type, length);
        this.length = length;
    }

    public T get(int i) {
        return arr[i];
    }

    public void set(int i, T e) {

        arr[i] = e;
    }
    @Override
    public String toString() {

        return Arrays.toString(arr);
    }


    @Override
    public int compareTo(MinMax<T> another) {

        return data.compareTo(another.data);
    }


    public T maxElem() {
        T max = arr[0];
        for (int i = 1; i<length; i++) {
            data = arr[i];
            if (data.compareTo(max) > 0) max = arr[i];
        }
        return max;
    }

    public T minElem() {
        T min = arr[0];
        for (int i = 1; i<length; i++) {
            data = arr[i];
            if (data.compareTo(min) < 0) min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        final int length = 6;
        // создаем целочисленный массив заданной длины
        MinMax<Integer> intArray = new MinMax(Integer.class, length);
        intArray.set(0,5);
        intArray.set(1,2);
        intArray.set(2,10);
        intArray.set(3,12);
        intArray.set(4,-2);
        intArray.set(5,-8);
        System.out.println(intArray);

        System.out.println("Максимальный элемент массива: "+intArray.maxElem());
        System.out.println("Минимальный элемент массива: "+intArray.minElem());

        System.out.println();
        // создаем целочисленный массив заданной длины
        MinMax<String> strArray = new MinMax(String.class, length);
        strArray.set(0,"b");
        strArray.set(1,"d");
        strArray.set(2,"q");
        strArray.set(3,"t");
        strArray.set(4,"o");
        strArray.set(5,"w");
        System.out.println(strArray);

        System.out.println("Максимальный элемент массива: "+strArray.maxElem());
        System.out.println("Минимальный элемент массива: "+strArray.minElem());
    }
}
