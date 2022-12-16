public class Student {
    public String name;
    private String surname;
    private String speciality;
    private int course;
    private int group;
    public String mark;

    public Student(String name, String surname, String speciality, int course, int group, String mark) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.mark = mark;
    }

    public Student(String name, String mark) {
        this.name = name;
        this.mark = mark;
    }
}
