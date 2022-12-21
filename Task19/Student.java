public class Student implements Comparable<Student>{
    private String fio;
    private int mark, groupNum;
    public static final MarkComparator MARK_COMP = new MarkComparator();
    public static final GroupComparator GROUP_COMP = new GroupComparator();

    public Student(String fio, int mark, int groupNum) {
        this.fio = fio;
        this.mark = mark;
        this.groupNum = groupNum;
    }

    public String getFio() {
        return fio;
    }
    public int getMark() {
        return mark;
    }
    public int getGroupNum() {
        return groupNum;
    }

    @Override
    public String toString() {
        return "ФИО: " + fio + ", средний балл = " + mark + ", номер группы = " + groupNum;
    }

    @Override
    public int compareTo(Student o) {
        return this.fio.compareTo(o.fio);
    }
}