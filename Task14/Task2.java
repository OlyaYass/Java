// проверить является ли данная строка строкой "abcdefghijklmnopqrstuv18340"

public class Task2 {
    public static boolean isEquals(String s){
        return s.equals("abcdefghijklmnopqrstuv18340");
    }

    public static void main(String[] args) {
        System.out.println(isEquals("abcdefghijklmnopqrstuv18340"));

        System.out.println(isEquals("qwtqefhqebflq"));
    }
}
