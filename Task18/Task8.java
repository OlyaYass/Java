import java.util.Scanner;

public class Task8 {
    public void getKey() {
        while (true) {
            int k = 0;
            try {
                Scanner myScanner = new Scanner(System.in);
                String key = myScanner.next();
                printDetails(key);
            }catch (Exception e) {
                k=1;
                System.out.println("Ошибка! Введите другое значение");
            }finally {
                if (k == 1) continue;
                else break;
            }
        }
    }
    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }catch (Exception e){
            throw new Exception();
        }
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("0")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Task8 task = new Task8();
        task.getKey();
    }
}