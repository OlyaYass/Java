public class TestAuthor {

    public static void main(String[] args) {
        Author a = new Author("Mike", "mike123@mail.ru", 'm');
        System.out.println("Author's name is "+a.getName());
        System.out.println("Author's email is "+a.getEmail());
        System.out.println("Author's gender is "+a.getGender());
        a.setEmail("mike321@yandex.ru");
        System.out.println(a);
    }
}
