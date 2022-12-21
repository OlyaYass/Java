import java.util.regex.Pattern;

// проверить, есть ли в строке цифры, после которых стоит +

public class Task4 {
    public static boolean isDigitPlus(String s) {
        return Pattern.compile("\\d+\\s{1}\\+").matcher(s).find();
    }

    public static void main(String[] args) {
        System.out.println(isDigitPlus("(1 + 8) – 9 / 4"));

        System.out.println(isDigitPlus("6 / 5 – 2 * 9"));
    }
}
