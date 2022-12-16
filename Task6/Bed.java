public class Bed implements Priceable {
    private int price;

    public Bed(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
