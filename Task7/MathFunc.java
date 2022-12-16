public class MathFunc implements MathCalculable{
    private double radius;

    public MathFunc() {}
    public MathFunc(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return (2*MathCalculable.pi*this.radius);
    }
    @Override
    public int getPower(int num, int pow) {
        return (int) Math.pow(num,pow);
    }


    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        System.out.println("Число 5 в степени 3 = "+mc1.getPower(5,3));
        MathFunc a = new MathFunc(5);
        System.out.println("Длина окружности с радиусом 5 = "+a.getLength());
    }
}