public class Generic<T,V,K> {
    private T a;
    private V b;
    private K c;

    public Generic(T a, V b, K c) {
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
        Generic<Integer,Double,String> generic = new Generic<>(5,10.5,"qwe");
        System.out.println(generic);
    }
}
