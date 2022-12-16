import java.util.*;

public class Task3 {
    Deque<Integer> deque1, deque2;

    public Task3(String deque1, String deque2) {
        this.deque1 = new ArrayDeque<>();
        this.deque2 = new ArrayDeque<>();
        for(int i = 0; i < 5; i++){
            this.deque1.add(Integer.parseInt(deque1.substring(i, i+1)));
            this.deque2.add(Integer.parseInt(deque2.substring(i, i+1)));
        }
    }

    public String game() {
        int count = 0;
        while (!deque1.isEmpty() && !deque2.isEmpty() && count <= 106) {
            int q1 = deque1.poll(); int q2 = deque2.poll();
            if (q1 > q2 && q2 != 0) {
                deque1.add(q1);
                deque1.add(q2);
            }
            else {
                deque2.add(q1);
                deque2.add(q2);
            }
            count++;
        }

        String res = "";
        if (deque1.isEmpty()) res += "second ";
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