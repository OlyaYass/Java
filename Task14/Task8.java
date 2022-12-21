import java.util.Arrays;

// убрать из массива лишнее используя интерфейс Filter

public class Task8 {

    public static Object[] filter(Object[] array, Filter filter) {
        int offset = 0;

        for(int i = 0; i< array.length; i++){
            if(!filter.apply(array[i])){
                offset++;
            } else{
                array[i - offset] = array[i];
            }
        }

        int n = array.length - offset;
        Object[] newArray = Arrays.copyOf(array,n);
        return newArray;
    }

    public static void main(String[] args) {
        String array[] = new String[]{"qwerty", "sjflaa", "a", "1631ghs", "123qwfc"};

        String[] newArray =  (String[]) filter(array, new Filter() {
            @Override
            public boolean apply(Object o) {
                return o != "a";
            }
        });

        for (int i=0; i< newArray.length; i++)
            System.out.println(newArray[i]);
    }
}
