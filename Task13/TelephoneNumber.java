public class TelephoneNumber {
    private String number;
    private String resNum = "";

    public TelephoneNumber(String number) {
        this.number = number;
    }

    public void converter() {
        if (number.charAt(0) == '8') {
            resNum = "+7";
            resNum += number.substring(1,4)+"-";
            resNum += number.substring(4,7)+"-";
            resNum += number.substring(7,11);
        }
        else {
            int i = number.length();
            String s = number.substring(i-4, i);
            resNum = "-" + s + resNum;
            i -= 4;

            s = number.substring(i-3, i);
            resNum = "-" + s + resNum;
            i-=3;

            s = number.substring(0, i);
            resNum = s + resNum;
        }
        System.out.println(resNum);
    }

    public static void main(String[] args) {
        TelephoneNumber num = new TelephoneNumber("89175655655");
        num.converter();
        num = new TelephoneNumber("+104289652211");
        num.converter();
    }
}
