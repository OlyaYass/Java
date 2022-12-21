import java.util.Scanner;

public class Task3 {

    public static void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        catch (Exception e) {
            System.out.println("Input error");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
