public class ProcessStrings implements StringsInterface {

    @Override
    public int count(String str) {
        int k=0;
        for (int i=0; i<str.length(); i++)
            k++;
        return k;
    }

    @Override
    public String newString(String str) {
        String newStr="";
        for (int i=1;i<str.length();i+=2) {
            newStr += str.charAt(i);
        }
        return newStr;
    }

    public static void main(String[] args) {
        StringsInterface s = new ProcessStrings();
        System.out.println(s.count("qwerty"));
        System.out.println(s.newString("qwerty"));
    }
}
