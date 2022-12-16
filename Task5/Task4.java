import java.util.*;

public class Task4 {
    LinkedList<Integer> list1, list2;

    public Task4(String list1, String list2) {
        this.list1 = new LinkedList<>();
        this.list2 = new LinkedList<>();
        for(int i = 0; i < 5; i++){
            this.list1.add(Integer.parseInt(list1.substring(i, i+1)));
            this.list2.add(Integer.parseInt(list2.substring(i, i+1)));
        }
    }

    public String game() {
        int count = 0;
        while (!list1.isEmpty() && !list2.isEmpty() && count <= 106) {
            int q1 = list1.poll(); int q2 = list2.poll();
            if (q1 > q2 && q2 != 0) {
                list1.add(q1);
                list1.add(q2);
            }
            else {
                list2.add(q1);
                list2.add(q2);
            }
            count++;
        }

        String res = "";
        if (list1.isEmpty()) res += "second ";
        else res += "first ";
        res += count;
        if (count >= 106) res = "botva";
        return res;
    }

    public static void main(String[] args) {
        Task1 task = new Task1("13579", "24680");
        System.out.println(task.game());
    }
}