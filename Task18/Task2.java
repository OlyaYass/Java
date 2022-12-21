import java.util.Scanner;

public class Task2 {

    public static void exceptionDemo1() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
    }
    public static void exceptionDemo2() {
        try {
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        catch (NumberFormatException e) {
            System.out.println("String input error");
        }
        catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        //exceptionDemo1();
        // Ошибки
        // Exception in thread "main" java.lang.NumberFormatException: For input string: "qwerty"
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // Exception in thread "main" java.lang.NumberFormatException: For input string: "1.2"
        // при вводе 1 вывод 2

        exceptionDemo2();
    }
}