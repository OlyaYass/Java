import java.util.Scanner;
import java.util.Stack;

public class Task5 {
    Stack<Integer> stack1, stack2;

    public Task5() {}

    public Task5(String stack1, String stack2) {
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

    public boolean same(String s1, String s2) {
        for (int i=0; i<s2.length(); i++) {
            if (s1.indexOf(s2.charAt(i)) != -1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Введите карты, которые будут у первого игрока:");
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        Task5 a = new Task5();
        while (true) {
            System.out.println("Введите карты, которые будут у второго игрока:");
            s2 = sc.nextLine();
            if (!a.same(s1,s2)) {
                break;
            }
            else {
                System.out.println("Ошибка! Карты второго игрока совпадают с картами первого");
            }
        }

        Task1 task = new Task1(s1, s2);
        System.out.println(task.game());
    }
}