import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static boolean checkIP(String s) {
        Pattern p = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        Matcher m = p.matcher(s);
        return m.find();
    }

    public static void main(String[] args) {
        System.out.println(checkIP("127.0.0.1"));
        System.out.println(checkIP("255.255.255.0"));

        System.out.println(checkIP("1300.6.7.8"));
        System.out.println(checkIP("abc.def.gha.bcd"));
    }
}