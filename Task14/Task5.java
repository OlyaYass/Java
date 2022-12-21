import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать регулярное выражение, определяющее является ли данная
//строчка датой в формате dd/mm/yyyy. Начиная с 1900 года до 9999 года.

public class Task5 {
    public static Pattern isDate() {
        Pattern p  = Pattern.compile("^(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/(([1][9]|[2-9]\\d)\\d{2})$");
        return p;
    }

    private static boolean checkDate(String s) {
        Matcher m = isDate().matcher(s);
        boolean result = m.matches();
        if (result) {
            int day = Integer.parseInt(m.group(1));
            int month = Integer.parseInt(m.group(2));
            int year = Integer.parseInt(m.group(3));
            if (day > 28) {
                if (month == 2 && day == 29) {
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                        result = true;
                    else result = false;
                }
                else if (month == 2 && day > 29) result = false;
                else if (day > 31) result = false;
                else if (day == 31) {
                    if (month == 4 || month == 6 || month == 9 || month == 11) result = false;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(checkDate("29/02/2000"));
        System.out.println(checkDate("30/04/2003"));
        System.out.println(checkDate("01/01/2003"));

        System.out.println(checkDate("29/02/2001"));
        System.out.println(checkDate("30-04-2003"));
        System.out.println(checkDate("1/1/1899"));
    }
}
