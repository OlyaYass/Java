import java.util.regex.Matcher;
import java.util.regex.Pattern;

// проверить email на корректность

public class Task6 {
    public static boolean checkEmail(String s) {
        Pattern p = Pattern.compile("[a-zA-Z0-9]+[a-zA-Z0-9\\-/_.]+[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.?[a-zA-Z0-9]+");
        Matcher m = p.matcher(s);
        return m.find();
    }

    public static void main(String[] args) {
        System.out.println(checkEmail("user@example.com"));
        System.out.println(checkEmail("root@localhost"));

        System.out.println(checkEmail("myhost@@@com.ru"));
        System.out.println(checkEmail("@my.ru"));
        System.out.println(checkEmail("Julia String"));
    }
}
