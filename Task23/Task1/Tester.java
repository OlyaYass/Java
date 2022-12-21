package Task1;

public class Tester {
    public static void main(String[] args) {
        ArrayQueueModule aqm = ArrayQueueModule.getInstance();
        aqm.enqueue("qwe");
        aqm.enqueue("123");
        aqm.enqueue("asd");
        System.out.println(aqm.dequeue());
        System.out.println(aqm.dequeue());
        System.out.println();

        ArrayQueueADT adt = new ArrayQueueADT(aqm);
        adt.clear();
        System.out.println(adt.isEmpty());
        adt.enqueue("qwe");
        System.out.println(adt.dequeue());
        System.out.println();

        ArrayQueue aq = new ArrayQueue();
        aq.enqueue("123");
        aq.enqueue("456");
        System.out.println(aq.isEmpty());
        System.out.println(aq.dequeue());
    }
}