import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements Printable {
    ArrayList<Computer> arr = new ArrayList<>();

    public void addComputer(Computer computer) {
        arr.add(computer);
    }
    public void deleteComputer(int num) {
        arr.remove(num);
    }

    public boolean findComputer(Computer computer) {
        for (Computer comp : arr) {
            if (comp.processor.name.equals(computer.processor.name) && comp.monitor.diagonal == computer.monitor.diagonal && comp.memory.memory == computer.memory.memory && comp.brands == computer.brands) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void print() {
        for (Computer comp : arr) {
            System.out.println(comp);
        }
    }
}
