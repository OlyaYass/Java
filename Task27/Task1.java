import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Task1 {
    public static <T> Set<T> getInstance(Set<T> hashSet) {
        return new TreeSet<>(hashSet);
    }

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("element 3");
        hashSet.add("element 1");
        hashSet.add("element 2");

        Set<String> treeSet = getInstance(hashSet);
        System.out.println(treeSet);
    }
}