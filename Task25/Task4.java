import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static boolean checkIP(String s) {
        Pattern p = Pattern.compile("^[^()]*(?:\\([^()]*\\)[^()]*)*$");
        Matcher m = p.matcher(s);
        return m.find();
    }

    public static void main(String[] args) {
        System.out.println(checkIP("(3*+*5)*–*9*×*4"));
        System.out.println(checkIP("((3*+*5)*–*9*×*4"));
    }
}