public class Processor  {
    public String name;

    public Processor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "процессор: "+name;
    }
}
