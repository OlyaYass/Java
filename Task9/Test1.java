public class Test1 {
    public static void main(String[] args) {
        int[] iDNumber = new int[10];
        int n = 10;
        for (int i=0; i<n; i++)
            iDNumber[i] = ((int)(Math.random()*50) - 10);

        Student s = new Student(iDNumber, n);
        System.out.print("До сортировки: ");
        s.Info();
        s.InsertionSort(iDNumber,n);
        System.out.print("\nПосле сортировки: ");
        s.Info();
    }
}