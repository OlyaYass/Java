import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.moreThan(5);
        d2.moreThan(5);
        d3.moreThan(1);

        Ball b1 = new Ball("green", 5, "volleyball");
        Ball b2 = new Ball();
        System.out.println("\nRadius before = " + b2.getRadius());
        b2.setRadius(7.4f);
        System.out.println("Radius after = " + b2.getRadius());
        b1.isGreen();
        b2.getArea();

        Book book1 = new Book("Esenin");
        Book book2 = new Book("Pushkin", 1876);
        System.out.println();
        book2.getCentury();
        book1.setYear(1600);
        book1.getCentury();
        book1.numOfVowels();
        book2.numOfVowels();
    }
}