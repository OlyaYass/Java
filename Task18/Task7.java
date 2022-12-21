import java.util.Scanner;

public class Task7 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }
    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("0")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Task7 task = new Task7();
        task.getKey();
    }
}
