import java.util.Comparator;

public class SortingStudents implements Comparable<Students> {
    public void quickSort(Students arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    @Override
    public int compareTo(Students s1, Students s2) {
        if (s1.mark == s2.mark) {
            return 0;
        }
        if (s1.mark > s2.mark) {
            return 1;
        }
        else {
            return -1;
        }
    }


    private int partition(Students arr[], int begin, int end) {
        Students pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (compareTo(arr[j],pivot) <=0 /*arr[j].mark.compareTo(pivot.mark) <=0*/) {
                i++;

                Students swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        Students swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

    public static void main(String[] args) {
        Students[] array = new Students[4];
        array[0] = new Students("Kate", "5");
        array[1] = new Students("Olya", "4");
        array[2] = new Students("Mark", "5");
        array[3] = new Students("Ivan", "3");

        SortingStudents sort = new SortingStudents();
        sort.quickSort(array,0, array.length -1);

        for (int i= array.length-1; i >= 0; i--) {
            System.out.println(array[i].name + "  " + array[i].mark);
        }
    }
}
