import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Извлечь из строки цены в USD, RUВ, EUR

public class Task3 {
    public static ArrayList<String> find(String s){
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s{1}((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (m.find()){
            ans.add(m.group());
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(find(": 25.98 USD 44 ERR, 0.004 EUR jnkfanlf842.572RUB"));
    }
}
