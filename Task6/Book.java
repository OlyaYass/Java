public class Book implements Printable {
   private String book;
    public Book(String book) {
        this.book = book;
    }
    @Override
    public void print() {
        System.out.println("This is a: "+this.book);
    }
}
