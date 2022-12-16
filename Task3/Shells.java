public class Shells {
    public static void main(String[] args) {
        Double a = Double.valueOf(10.5);
        System.out.println(a);

        double b = Double.parseDouble("5");
        System.out.println(b);

        Double c = 1.0;
        byte x1 = c.byteValue();
        short x2 = c.shortValue();
        int x3 = c.intValue();
        long x4 = c.longValue();
        float x5 = c.floatValue();
        double x6 = c.doubleValue();
        boolean x7 = c.isNaN();
        char x8;
        System.out.println(x1+" "+x2+" "+x3+" "+x4+" "+x5+" "+x6+" "+x7+" ");

        double d = 3.14;
        String s = Double.toString(d);
        System.out.println(s);
    }
}
