public class Person {
    private String surname;
    private String name = "";
    private String fatherName = "";

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String surname, String name, String fatherName) {
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
    }

    public String toString() {
        if (this.name == "")
            return ("Фамилия: "+surname);
        else return ("Фамилия, Имя, Отчество: "+surname+" "+name+" "+fatherName);
    }
}
