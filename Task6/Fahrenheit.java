public class Fahrenheit implements Convertable {
    @Override
    public void convert(int temp) {
        System.out.println("Temperature in Fahrenheit: "+(temp * 1.8 + 32));
    }
}
