import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        // распечатать последний символ строки
        System.out.println("Последний символ строки: "+str.charAt(str.length()-1));

        // Проверить, заканчивается ли ваша строка подстрокой “!!!”
        if (str.endsWith("!!!")) System.out.println("Строка заканчивается подстрокой: !!!");
        else System.out.println("Строка не заканчивается подстрокой: !!!");

        // Проверить, начинается ли ваша строка подстрокой “I like”
        if (str.startsWith("I like")) System.out.println("Строка начинается с подстроки: I like");
        else System.out.println("Строка не начинается с подстроки: I like");

        // Проверить, содержит ли ваша строка подстроку “Java”
        if (str.contains("Java")) System.out.println("Строка содержит подстроку: Java");
        else System.out.println("Строка не содержит подстроку: Java");

        // Найти позицию подстроки “Java”
        System.out.println("Позиция подстроки Java: "+str.indexOf("Java"));

        // Заменить все символы “а” на “о”
        String str1 = str.replace("a","o");
        System.out.println("Замена симоволов a на o: "+str1);

        // Преобразуйте строку к верхнему регистру
        str1 = str.toUpperCase();
        System.out.println(str1);
        // Преобразуйте строку к нижнему регистру
        str1 = str1.toLowerCase();
        System.out.println(str1);

        // Вырезать строку Java c помощью метода String.substring()
        int n1 = str.indexOf("Java");
        int n2 = n1+4;
        str1 = str.substring(0,n1);
        String str2 = str.substring(n2,str.length());
        System.out.println(str1+str2);
    }
}