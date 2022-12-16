public class SortingStudents {
    public Student[] array = new Student[4];
    public void quickSort(Student arr[], int begin, int end, String field) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end, field);

            quickSort(arr, begin, partitionIndex-1, field);
            quickSort(arr, partitionIndex+1, end, field);
        }
    }

    private int partition(Student arr[], int begin, int end, String field) {
        Student pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (field.equals("mark")) {
                if (arr[j].mark.compareTo(pivot.mark) <= 0) {
                    i++;

                    Student swapTemp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swapTemp;
                }
            }
            else {
                if (arr[j].name.compareTo(pivot.name) <= 0) {
                    i++;

                    Student swapTemp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swapTemp;
                }
            }
        }

        Student swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

    private Student[] setArray() {
        array[0] = new Student("Kate", "5");
        array[1] = new Student("Olya", "4");
        array[2] = new Student("Mark", "5");
        array[3] = new Student("Ivan", "3");
        return array;
    }

    public void outArray() {
        for (int i=array.length-1; i >= 0; i--) {
            System.out.println(array[i].name + "  " + array[i].mark);
        }
    }

    public static void main(String[] args) {
        SortingStudents sort = new SortingStudents();
        sort.quickSort(sort.setArray(),0, sort.array.length-1, "mark");
        System.out.println("Список студентов после сортировки по баллу:");
        sort.outArray();

        System.out.println("Список студентов после сортировки по именам");
        sort.quickSort(sort.setArray(),0, sort.array.length-1, "name");
        sort.outArray();
    }
}