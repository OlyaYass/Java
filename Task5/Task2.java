import java.util.ArrayDeque;
import java.util.Queue;

public class Task2 {
    Queue<Integer> queue1, queue2;

    public Task2(String queue1, String queue2) {
        this.queue1 = new ArrayDeque<>();
        this.queue2 = new ArrayDeque<>();
        for(int i = 0; i < 5; i++){
            this.queue1.add(Integer.parseInt(queue1.substring(i, i+1)));
            this.queue2.add(Integer.parseInt(queue2.substring(i, i+1)));
        }
    }

    public String game() {
        int count = 0;
        while (!queue1.isEmpty() && !queue2.isEmpty() && count <= 106) {
            int q1 = queue1.poll(); int q2 = queue2.poll();
            if (q1 > q2 && q2 != 0) {
                queue1.add(q1);
                queue1.add(q2);
            }
            else {
                queue2.add(q1);
                queue2.add(q2);
            }
            count++;
        }

        String res = "";
        if (queue1.isEmpty()) res += "second ";
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