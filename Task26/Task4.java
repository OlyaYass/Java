import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        String[] elements = {"element0", "element1", "element2", "element3", "element4", "element5", "element6", "element7", "element8", "element9"};
        Set<String> mySet = new HashSet<>(Arrays.asList(elements));
        System.out.println(mySet);

        Iterator<String> iter = mySet.iterator();
        int i=0;
        while (i < 3) {
            System.out.println(iter.next());
            i++;
        }
    }
}
