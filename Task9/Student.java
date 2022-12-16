public class Student {
    private int[] iDNumber = new int[10];
    private int n = 10;

    public Student(int[] arr, int n) {
        iDNumber = arr;
        this.n = n;
    }

    public void Info() {
        for (int i = 0; i < n; i++) {
            System.out.print(iDNumber[i]+" ");
        }
    }

    public void InsertionSort(int[] iDNumber, int n) {
        for (int i = 1; i < n; i++)
            for (int j=i; j>0 && iDNumber[j-1]>iDNumber[j]; j--) {
                int x = iDNumber[j];
                iDNumber[j] = iDNumber[j-1];
                iDNumber[j-1] = x;
            }
    }

}
