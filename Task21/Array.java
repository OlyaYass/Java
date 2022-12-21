import java.util.Arrays;

class Array<T> {
    private Object[] arr;
    public int length;
    public Array(int length) {
        arr = new Object[length];
        this.length = length;
    }

    T get(int i) {
        T t = (T)arr[i];
        return t;
    }
    void set(int i, T t) {
        arr[i] = t;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int length = 6;
        // создаем целочисленный массив заданной длины
        Array<Integer> intArray = new Array(length);
        intArray.set(0,5);
        intArray.set(1,2);
        intArray.set(2,10);
        intArray.set(3,12);
        intArray.set(4,-2);
        intArray.set(5,-8);
        System.out.println(intArray);
        System.out.println("Элемент под номером 5: "+intArray.get(4));

        System.out.println();
        // создаем целочисленный массив заданной длины
        Array<String> strArray = new Array(length);
        strArray.set(0,"b");
        strArray.set(1,"d");
        strArray.set(2,"q");
        strArray.set(3,"t");
        strArray.set(4,"o");
        strArray.set(5,"w");
        System.out.println(strArray);
        System.out.println("Элемент под номером 2: "+strArray.get(1));

    }
}