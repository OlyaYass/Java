public class Task1 {
    public static void exceptionDemo1() {
        System.out.println(2 / 0);
    }

    public static void exceptionDemo2() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        //exceptionDemo1();
        // вывод ошибки java.lang.ArithmeticException: / by zero at
        // при замене на 2.0/ 0.0 вывод Infinity

        exceptionDemo2();
    }
}