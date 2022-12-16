public class Sofa implements Priceable {
    private int price;

    public Sofa(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
