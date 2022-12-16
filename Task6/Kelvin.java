public class Kelvin implements Convertable {
    @Override
    public void convert(int temp) {
        System.out.println("Temperature in Kelvin: "+(temp+273));
    }
}
