import java.util.*;

public class Converter {
    private String str1 = "рубль";
    private String str2 = "евро";
    public double Convert(double num, String s1, String s2) {
        if (s1.equals(str1)) {
            if (s2.equals(str2)) return num*0.018;
            else return num*0.017;
        }
        else if (s1.equals(str2)) {
            if (s2.equals(str1)) return num*56.97;
            else return num*0.98;
        }
        else {
            if (s2.equals(str2)) return num*1.02;
            else return num*57.83;
        }
    }

    public static void main(String[] args) {
        Converter conv = new Converter();
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        double num;
        System.out.print("Валюта, из которой переводить: ");
        s1 = sc.nextLine();
        System.out.print("Валюта, в которую переводить: ");
        s2 = sc.nextLine();
        System.out.print("Сумма: ");
        num = sc.nextDouble();
        double res = conv.Convert(num,s1,s2);

        Formatter fmt = new Formatter();
        System.out.println("Исходная сумма = "+num);
        fmt.format("Перевод %s в %s",s1,s2);
        System.out.println(fmt);
        System.out.println("Полученная сумма: "+res);
    }
}
