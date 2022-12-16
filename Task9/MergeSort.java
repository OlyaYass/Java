public class MergeSort {

    public static void mergeSort(String[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        String[] l = new String[mid];
        String[] r = new String[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            String[] a, String[] l, String[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }


    public static void main(String[] args) {
        String[] array1 = {"Petrov", "Ivanov", "Smirnov"};
        String[] array2 = {"Popov", "Sokolov", "Volkov", "Novikov"};
        String[] array = new String[array1.length+ array2.length];
        int k=0;
        for (int i=0; i< array1.length;i++) {
            array[i] = array1[i];
            k++;
        }
        for (int i=0; i< array2.length;i++) array[k++] = array2[i];

        MergeSort.mergeSort(array, array.length);
        for (int i=0; i< array.length; i++) {
            System.out.print(array[i] +" ");
        }
    }
}
