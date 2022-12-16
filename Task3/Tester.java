public class Tester extends Circle {
    private Circle[] array = new Circle[10];
    private int n = 0;

    public void createCircle(int num) {
        for (int i=0; i<num; i++) {
            n++;
            array[i] = new Circle();
        }
    }

    public void printArray() {
        for (int i=0; i<n; i++)
            System.out.println("Окружность "+(i+1)+": радиус = "+array[i].radius+ " ");
    }

    public void sortArray() {
        for (int i=1; i<n; i++)
            for (int j=i; j>0 && array[j-1].radius > array[j].radius; j--) {
                int temp = array[j-1].radius;
                array[j-1].radius = array[j].radius;
                array[j].radius = temp;
            }
    }

    public void maxCircle() {
        sortArray();
        System.out.println("Самая большая окружность: радиус = "+array[n-1].radius);
    }

    public void minCircle() {
        sortArray();
        System.out.println("Самая маленькая окружность: радиус = "+array[0].radius);
    }

    public static void main(String[] args) {
        Tester test = new Tester();
        test.createCircle(5);
        test.printArray();
        test.maxCircle();
        test.minCircle();
    }
}
