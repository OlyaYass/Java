public class Book {
    private String author;
    private int year;

    public Book(String auth, int y) {
        author = auth;
        year = y;
    }

    public Book(String auth) {
        author = auth;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void getCentury() {
        if (year % 100 == 0) {
            System.out.println("The book of author "+author+" was written in "+ (year/100) + " century");
        }
        else {
            System.out.println("The book of author "+author+" was written in "+ (year/100+1) + " century");
        }
    }

    public void numOfVowels() {
        String s = "AEIOUYaeiouy";
        int count = 0;
        for (int i=0; i < this.author.length(); i++) {
            char ch = this.author.charAt(i);
            String str = String.valueOf(ch);
            if (s.contains(str)) count++;
        }
        System.out.println("Number of vowels in "+this.author+"'s book: "+count);
    }

}
