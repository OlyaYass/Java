import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static boolean checkPassword(String s) {
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}$");
        Matcher m = p.matcher(s);
        return m.find();
    }

    public static void main(String[] args) {
        System.out.println(checkPassword("F032_Password"));

        System.out.println(checkPassword("smart_pass"));
    }
}
