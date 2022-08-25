package Books;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book implements BookByAuthorName{
    // * Initialize a field with Map in empty the constructor
    public Book (){
        map = new HashMap<String, List<String>>();
    }
    // * Create a field with READER
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    // * Create a field with Map
    public Map map;
    // * Method that search for a list of books by key with the author name
    @Override
    public List<String> listBooksByAuthor() throws IOException {
        System.out.println("Enter the author you would like to see books of: ");
        String str = String.valueOf(READER.readLine());
        return  (List<String>)map.get(str);
    }
}
