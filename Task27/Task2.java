import java.util.HashMap;
import java.util.Map;


public class Task2 {
    public static HashMap<String, String> createMap() {
        Map<String, String> map = new HashMap();

        map.put("Фамилия1","Петр");
        map.put("Фамилия2","Иван");
        map.put("Фамилия3","Игорь");
        map.put("Фамилия4","Денис");
        map.put("Фамилия5","Алексей");
        map.put("Фамилия6","Иван");
        map.put("Фамилия7","Петр");
        map.put("Фамилия8","Иван");
        map.put("Фамилия9","Денис");
        map.put("Фамилия10","Иван");

        return (HashMap<String, String>) map;

    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
            if (pair.getValue().equals(name)) count++;
        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastname) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
            if (pair.getKey().equals(lastname)) count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(createMap());
        System.out.println(getSameFirstNameCount(createMap(), "Иван"));
        System.out.println(getSameLastNameCount(createMap(), "Фамилия1"));
    }
}