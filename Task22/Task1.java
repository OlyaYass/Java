import java.util.*;

public class Task1 {

    public static boolean isOperation(String s) {
        if (s.equals("*") || s.equals("+") || s.equals("-") || s.equals("/")) return true;
        else return false;
    }

    public String calculator(String st) {
        Stack<Double> stack = new Stack<>();
        String[] str = st.split(" ");
        for (String s : str) {
            if (!isOperation(s)) {
                stack.push(Double.valueOf(s));
            }
            else {
                if (stack.isEmpty()) {
                    return "error";
                }
                double a = stack.pop();
                if (stack.isEmpty()) {
                    return "error";
                }
                else {
                    double b = stack.pop();
                    if (s.equals("*")) stack.push(a * b);
                    else if (s.equals("+")) stack.push(a + b);
                    else if (s.equals("-")) stack.push(b - a);
                    else {
                        if (a != 0) stack.push(b / a);
                        else {
                            return "error";
                        }
                    }
                }
            }
        }
        if (stack.size() > 1) return "error";
        return Double.toString(stack.pop());
    }
}