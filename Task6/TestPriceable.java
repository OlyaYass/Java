public class TestPriceable {
    public static void main(String[] args) {
        Priceable obj1 = new Bed(15000);
        System.out.println("Bed: "+obj1.getPrice());

        Priceable obj2 = new Sofa(30000);
        System.out.println("Sofa: "+obj2.getPrice());
    }
}
