import java.util.Hashtable;

public class Task3 {

    public static void hashTabAdd(Hashtable<String,Integer> myTable) {
        myTable.put("element1",10);
        myTable.put("element2",20);
        myTable.put("element3",30);
        myTable.put("element4",40);
        myTable.put("element5",50);
    }

    public static int hashTabLookUp(Hashtable<String,Integer> myTable, String element) {

        return myTable.get(element);
    }

    public static void hashTabDelete(Hashtable<String,Integer> myTable, String element) {

        myTable.remove(element);
    }

    public static void main(String[] args) {
        Hashtable<String,Integer> myTable = new Hashtable<>();
        hashTabAdd(myTable);
        System.out.println(myTable);

        System.out.println(hashTabLookUp(myTable,"element3"));

        hashTabDelete(myTable,"element4");
        System.out.println(myTable);
    }
}