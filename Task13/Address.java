import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, housing, flat;

    public Address(String str, boolean var) {
        if(str == null) throw new NullPointerException();
        String[] s;
        if (var) {
            s = str.split(",");
        }
        else {
            StringTokenizer st = new StringTokenizer(str,",.;");
            s = new String[st.countTokens()];
            int i=0;
            while (st.hasMoreTokens()) s[i++] = st.nextToken();
        }

        if (s.length != 7) throw new IllegalArgumentException("Строка содержит некорректные данные!");
        this.country = s[0].trim();
        this.region = s[1].trim();
        this.city = s[2].trim();
        this.street = s[3].trim();
        this.house = s[4].trim();
        this.housing = s[5].trim();
        this.flat = s[6].trim();
    }

    public String toString() {
        return "Адрес: \n" +
                "страна: " + country +
                ", регион: " + region +
                ", город: " + city +
                ", улица: " + street +
                ", дом: " + house +
                ", корпус: " + housing +
                ", квартира: " + flat;
    }

    public static void main(String[] args) {
        Address a1 = new Address("Россия, MO  ,   Москва,   проспект Вернадского, 78, 7, 6137", true);
        System.out.println(a1);
        System.out.println();

        Address a2 = new Address("Россия, Ульяновская область, Ульяновск.   проспект Ульяновский. 3;7;372", false);
        System.out.println(a2);
        System.out.println();

        Address a3 = new Address("Россия, Ленинградская область, Санкт-Петербург,  Невский проспект, 6,9,9",true);
        System.out.println(a3);
    }
}
