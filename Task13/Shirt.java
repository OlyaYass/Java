public class Shirt {
    private String num, type, color, size;

    public Shirt(String str) {
        String[] s = str.split(",");
        this.num = s[0];
        this.type = s[1];
        this.color = s[2];
        this.size = s[3];
    }

    public String toString() {
        return  "Изделие: " + num +
                ", наименование: " + type +
                ", цвет: " + color +
                ", размер: " + size;
    }


    public static void main(String[] args) {
        String[] shirt = new String[] {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt[] arr = new Shirt[shirt.length];
        for (int i=0; i< shirt.length; i++) {
            arr[i] = new Shirt(shirt[i]);
            System.out.println(arr[i]);
        }
    }
}
