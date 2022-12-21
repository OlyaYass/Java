public class Task9 {
    public static void dictionary(String text){
        text = text.toLowerCase();

        int[] result = new int['z' - 'a' + 1];
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                result[ch - 'a']++;
            }
        }

        for(int i = 0; i < result.length; i++){
            System.out.println((char) (i + 'a') + " = " + result[i]);
        }
    }

    public static void main(String[] args) {
        dictionary("abbcccdggg");
    }
}
