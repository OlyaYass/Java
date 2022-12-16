import java.util.TreeSet;

class Compare implements Comparable<Object> {
    String name;
    int mark;

    Compare(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public int compareTo(Object obj) {
        Compare entry = (Compare) obj;
        int result = name.compareTo(entry.name);
        if(result != 0)
            return result;
        result = mark - entry.mark;
        if(result != 0)
            return (int) result / Math.abs(result);
        return 0;
    }

    @Override
    public String toString()
    {
        return this.name + " " + this.mark;
    }

    public static void main(String[] args) {
        TreeSet<Compare> data = new TreeSet<Compare>();
        data.add(new Compare("Оля",553));
        data.add(new Compare("Катя", 132));
        data.add(new Compare("Оля", 353));
        data.add(new Compare("Егор", 31));
        for (Compare e : data)
            System.out.println(e.toString());
    }
}
