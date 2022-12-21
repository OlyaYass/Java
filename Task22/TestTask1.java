public class TestTask1 {

    public static void main(String[] args) {
        Task1 t = new Task1();
        System.out.println("Результат выражения 2 3 + : " + t.calculator("2 3 +"));
        System.out.println("Результат выражения 2 3 * 4 5 * + : " + t.calculator("2 3 * 4 5 * +"));
        System.out.println("Результат выражения 2 3 4 5 6 * + - / : " + t.calculator("2 3 4 5 6 * + - /"));

        System.out.println("Результат выражения 2 3 + - : " + t.calculator("2 3 + -"));
        System.out.println("Результат выражения 1 2 3 : " + t.calculator("1 2 3"));
        System.out.println("Результат выражения + - : " + t.calculator("+ -"));
    }
}
