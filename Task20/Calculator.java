public class Calculator {

    public static <T> String res(T a) {
        int num1i; double num1d; long num1l; float num1f;
        if (a instanceof Integer) {
            num1i = ((Integer) a).intValue();
            return "int";
        }
        if (a instanceof Double) {
            num1d = ((Double) a).doubleValue();
            return "double";
        }
        if (a instanceof Long) {
            num1l = ((Long) a).longValue();
            return "long";
        }
        if (a instanceof Float) {
            num1f = ((Float) a).floatValue();
            return "float";
        }
        return "";
    }
    public static <T,V> void sum(T a, V b) {
        String s1, s2;
        s1 = res(a);
        s2 = res(b);
        if (s1.equals("int")) {
            if (s2.equals("int")) System.out.println(((Integer) a).intValue() + ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Integer) a).intValue() + ((Double) b).doubleValue());
            else if (s2.equals("long")) System.out.println(((Integer) a).intValue() + ((Long) b).longValue());
            else if (s2.equals("float")) System.out.println(((Integer) a).intValue() + ((Float) b).floatValue());
        }
        else if (s1.equals("double")) {
            if (s2.equals("int")) System.out.println(((Double) a).doubleValue() + ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Double) a).doubleValue() + ((Double) b).doubleValue());
            else if (s2.equals("long")) System.out.println(((Double) a).doubleValue() + ((Long) b).longValue());
            else if (s2.equals("float")) System.out.println(((Double) a).doubleValue() + ((Float) b).floatValue());
        }
        else if (s1.equals("long")) {
            if (s2.equals("int")) System.out.println(((Long) a).longValue() + ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Long) a).longValue() + ((Double) b).doubleValue());
            else if (s2.equals("long")) System.out.println(((Long) a).longValue() + ((Long) b).longValue());
            else if (s2.equals("float")) System.out.println(((Long) a).longValue() + ((Float) b).floatValue());
        }
        else if (s1.equals("float")) {
            if (s2.equals("int")) System.out.println(((Float) a).floatValue() + ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Float) a).floatValue() + ((Double) b).doubleValue());
            else if (s2.equals("long")) System.out.println(((Float) a).floatValue() + ((Long) b).longValue());
            else if (s2.equals("float")) System.out.println(((Float) a).floatValue() + ((Float) b).floatValue());
        }
        else System.out.println("Ошибка");
    }

    public static <T,V> void multiply(T a, V b) {
        String s1, s2;
        s1 = res(a);
        s2 = res(b);
        if (s1.equals("int")) {
            if (s2.equals("int")) System.out.println(((Integer) a).intValue() * ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Integer) a).intValue() * ((Double) b).doubleValue());
            else if (s2.equals("long")) System.out.println(((Integer) a).intValue() * ((Long) b).longValue());
            else if (s2.equals("float")) System.out.println(((Integer) a).intValue() * ((Float) b).floatValue());
        }
        else if (s1.equals("double")) {
            if (s2.equals("int")) System.out.println(((Double) a).doubleValue() * ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Double) a).doubleValue() * ((Double) b).doubleValue());
            else if (s2.equals("long")) System.out.println(((Double) a).doubleValue() * ((Long) b).longValue());
            else if (s2.equals("float")) System.out.println(((Double) a).doubleValue() * ((Float) b).floatValue());
        }
        else if (s1.equals("long")) {
            if (s2.equals("int")) System.out.println(((Long) a).longValue() * ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Long) a).longValue() * ((Double) b).doubleValue());
            else if (s2.equals("long")) System.out.println(((Long) a).longValue() * ((Long) b).longValue());
            else if (s2.equals("float")) System.out.println(((Long) a).longValue() * ((Float) b).floatValue());
        }
        else if (s1.equals("float")) {
            if (s2.equals("int")) System.out.println(((Float) a).floatValue() * ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Float) a).floatValue() * ((Double) b).doubleValue());
            else if (s2.equals("long")) System.out.println(((Float) a).floatValue() * ((Long) b).longValue());
            else if (s2.equals("float")) System.out.println(((Float) a).floatValue() * ((Float) b).floatValue());
        }
        else System.out.println("Ошибка");
    }

    public static <T,V> void divide(T a, V b) {
        String s1, s2;
        s1 = res(a);
        s2 = res(b);
        if (s1.equals("int")) {
            if (s2.equals("int")) System.out.println(((Integer) a).intValue() / ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Integer) a).intValue() / ((Double) b).doubleValue());
            else if (s2.equals("long")) System.out.println(((Integer) a).intValue() / ((Long) b).longValue());
            else if (s2.equals("float")) System.out.println(((Integer) a).intValue() / ((Float) a).floatValue());
        }
        else if (s1.equals("double")) {
            if (s2.equals("int")) System.out.println(((Double) a).doubleValue() / ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Double) a).doubleValue() / ((Double) b).doubleValue());
            else if (s2.equals("long")) System.out.println(((Double) a).doubleValue() / ((Long) b).longValue());
            else if (s2.equals("float")) System.out.println(((Double) a).doubleValue() / ((Float) b).floatValue());
        }
        else if (s1.equals("long")) {
            if (s2.equals("int")) System.out.println(((Long) a).longValue() / ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Long) a).longValue() / ((Double) b).doubleValue());
            else if (s2.equals("long")) System.out.println(((Long) a).longValue() / ((Long) b).longValue());
            else if (s2.equals("float")) System.out.println(((Long) a).longValue() / ((Float) b).floatValue());
        }
        else if (s1.equals("float")) {
            if (s2.equals("int")) System.out.println(((Float) a).floatValue() / ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Float) a).floatValue() / ((Double) b).doubleValue());
            else if (s2.equals("long")) System.out.println(((Float) a).floatValue() / ((Long) b).longValue());
            else if (s2.equals("float")) System.out.println(((Float) a).floatValue() / ((Float) b).floatValue());
        }
        else System.out.println("Ошибка");
    }

    public static <T,V> void subtraction(T a, V b) {
        String s1, s2;
        s1 = res(a);
        s2 = res(b);
        if (s1.equals("int")) {
            if (s2.equals("int")) System.out.println(((Integer) a).intValue() - ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Integer) a).intValue() - ((Double) b).doubleValue());
            else if (s2.equals("long")) System.out.println(((Integer) a).intValue() - ((Long) b).longValue());
            else if (s2.equals("float")) System.out.println(((Integer) a).intValue() - ((Float) b).floatValue());
        }
        else if (s1.equals("double")) {
            if (s2.equals("int")) System.out.println(((Double) a).doubleValue() - ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Double) a).doubleValue() - ((Double) b).doubleValue());
            else if (s2.equals("long")) System.out.println(((Double) a).doubleValue() - ((Long) b).longValue());
            else if (s2.equals("float")) System.out.println(((Double) a).doubleValue() - ((Float) b).floatValue());
        }
        else if (s1.equals("long")) {
            if (s2.equals("int")) System.out.println(((Long) a).longValue() - ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Long) a).longValue() - ((Double) b).doubleValue());
            else if (s2.equals("long")) System.out.println(((Long) a).longValue() - ((Long) b).longValue());
            else if (s2.equals("float")) System.out.println(((Long) a).longValue() - ((Float) b).floatValue());
        }
        else if (s1.equals("float")) {
            if (s2.equals("int")) System.out.println(((Float) a).floatValue() - ((Integer) b).intValue());
            else if (s2.equals("double")) System.out.println(((Float) a).floatValue() - ((Double) b).doubleValue());
            else if (s2.equals("long")) System.out.println(((Float) a).floatValue() - ((Long) b).longValue());
            else if (s2.equals("float")) System.out.println(((Float) a).floatValue() - ((Float) b).floatValue());
        }
        else System.out.println("Ошибка");
    }

    public static void main(String[] args) {
        int a = 10;
        double b = 10.5;
        long c = 100;
        float d = 20.5f;
        sum(a,b);
        sum(a,c);
        sum(b,d);
        sum(c,d);
    }
}
