public class Magazine implements Printable {
    private String magazine;
    public Magazine(String magazine) {
        this.magazine = magazine;
    }
    @Override
    public void print() {
        System.out.println("This is a: "+this.magazine);
    }
}
