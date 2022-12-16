public class TestNameable {
    public static void main(String[] args) {
        Nameable obj1 = new Planet("Earth");
        System.out.println("Planet: "+obj1.getName());

        Nameable obj2 = new Animals("Dog");
        System.out.println("Animal: "+obj2.getName());
    }
}
