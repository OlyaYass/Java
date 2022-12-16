public class TestPrintable {
    public static void main(String[] args) {
        Printable[] array = new Printable[4];
        array[0] = new Book("book1");
        array[1] = new Book("book2");
        array[2] = new Book("magazine");
        array[3] = new Book("book3");

        for (Printable o : array) {
            o.print();
        }
    }
}
