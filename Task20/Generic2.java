public class Generic2<T extends String, V extends Animal, K extends Number> {
    private T a;
    private V b;
    private K c;

    public Generic2(T a, V b, K c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public V getB() {
        return b;
    }

    public K getC() {
        return c;
    }

    public String toString() {
        return a + " (" + a.getClass() + "), "+ b + " ("+b.getClass()+"), "+c+" ("+c.getClass()+")";
    }

    public static void main(String[] args) {
        Generic2<String,Dog,Integer> generic = new Generic2<>("qwe", new Dog(), 5);
        System.out.println(generic);
    }
}