package Books;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // * Creating a list of Author books and poems etc.
        /**
         * I can also create an object of some entity and ada list of book as a field
         * But in real life we have databases, and we get info right from them
         *Anyway, this decision can be also implemented in my project
         * */
        var ListShevchenko = new ArrayList<String>();
        ListShevchenko.add("Kateryna");
        ListShevchenko.add("Zapovit");
        ListShevchenko.add("Son");

        var ListFranko = new ArrayList<String>();
        ListFranko.add("Zakhar Berkut");
        ListFranko.add("Ukradene Shastia");
        ListFranko.add("Moisei");

        var ListUkrainka = new ArrayList<String>();
        ListUkrainka.add("Contra spem spero");
        ListUkrainka.add("Lisova pisnia");
        ListUkrainka.add("Hvylia");
        // * Create the list of books from Book class
        var bookList = new Book();
        // * Add these lists to the map
        bookList.map.put("Shevchenko", ListShevchenko);
        bookList.map.put("Franko", ListFranko);
        bookList.map.put("Ukrainka", ListUkrainka);
        // * Output the result of method listBooksByAuthor()
        System.out.println(bookList.listBooksByAuthor());

    }
}
