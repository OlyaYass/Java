public class Computer {
    Monitor monitor;
    Memory memory;
    Processor processor;
    Brands brands;

    public Computer(String name, int memory, double diagonal, int brand) {
        this.processor = new Processor(name);
        this.memory = new Memory(memory);
        this.monitor = new Monitor(diagonal);
        switch (brand) {
            case 1:
                brands = Brands.Asus;
                break;
            case 2:
                brands = Brands.Acer;
                break;
            case 3:
                brands = Brands.LG;
                break;
            case 4:
                brands = Brands.Lenovo;
                break;
            default:
                break;
        }
    }

    public String toString() {
        return brands+": процессор "+processor+", объём памяти "+memory+", диагональ "+monitor;
    }
}

