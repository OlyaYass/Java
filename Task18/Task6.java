public class Task6 {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }

    public String getDetails(String key) {
        if(key.equals("0")) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Task6 e = new Task6();
        e.printMessage("0");
        e.printMessage("1");
    }
}
