import java.util.Stack;

public class Task1 {
    Stack<Integer> stack1, stack2;

    public Task1(String stack1, String stack2) {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
        for(int i = 4; i >= 0; i--){
            this.stack1.push(Integer.parseInt(stack1.substring(i, i+1)));
            this.stack2.push(Integer.parseInt(stack2.substring(i, i+1)));
        }
    }

    private void pushBack(Stack<Integer> s, Integer item){
        Stack<Integer> ns = new Stack<>();
        while (!s.isEmpty())
            ns.push(s.pop());
        s.push(item);
        while (!ns.isEmpty())
            s.push(ns.pop());
    }

    public String game() {
        int count = 0;
        while (!stack1.isEmpty() && !stack2.isEmpty() && count <= 106) {
            if (stack1.peek() > stack2.peek() && stack2.peek() != 0) {
                pushBack(stack1,stack1.pop());
                pushBack(stack1,stack2.pop());
            }
            else {
                pushBack(stack2,stack1.pop());
                pushBack(stack2,stack2.pop());
            }
            count++;
        }

        String res = "";
        if (stack1.isEmpty()) res += "second ";
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
