public class TestPrintable {
    public static void main(String[] args) {
        Printable[] array = new Printable[5];
        array[0] = new Book("book1");
        array[1] = new Book("book2");
        array[2] = new Magazine("magazine1");
        array[3] = new Book("book3");
        array[4] = new Magazine("magazine2");

        System.out.println("Вывод всех книг:");
        for (Printable o : array) {
            if (o instanceof Book) o.print();
        }

        System.out.println("Вывод всех журналов:");
        for (Printable o : array) {
            if (o instanceof Magazine) o.print();
        }
    }
}