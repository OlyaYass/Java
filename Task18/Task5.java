public class Task5 {

    public void getDetails1(String key) {

        /* if (key == "0") {
            throw new NullPointerException("null key in getDetails" );
        } */

       try {
           if (key != "0") System.out.println("ляля");
       }
       catch (Exception e) {
           System.out.println("Error");
       }
    }

    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }

    public String getDetails(String key) {
        if(key == "0") {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Task5 e = new Task5();
       // e.getDetails1("0");

        e.printMessage("1");
    }
}
