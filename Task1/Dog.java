import java.lang.*;
public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a){
        name = n;
        age = a;
    }
    public Dog(String n){
        name = n;
        age = 0;
    }
    public Dog(){
        name = "Pup";
        age = 0;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }

    public void moreThan(int year) {
        if (this.age > year) System.out.println("Yes, the age of "+this.name+" is more than "+year+" years");
        else System.out.println("No, the age of "+this.name+" is not more than "+year+" years");
    }
}