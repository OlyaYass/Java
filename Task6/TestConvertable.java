public class TestConvertable {
    public static void main(String[] args) {
        System.out.println("Temperature in Celsius: 15");
        Convertable obj1 = new Kelvin();
        Convertable obj2 = new Fahrenheit();
        obj1.convert(-40);
        obj2.convert(-40);
    }
}
