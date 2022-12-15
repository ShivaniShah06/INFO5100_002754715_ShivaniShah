package exercises.exercise8;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class JsonParser {

    // Creating function to read the file from given location

    public static JSONObject getFile(String filePath) throws Exception {
        // Creating an object of JSONParser for parsing JSON file
        JSONParser jsonparser = new JSONParser();

        // Creating an object of FileReader class to load the json file to be parsed
        FileReader reader = new FileReader(filePath);

        // Parsing the json data from the object `reader` and saving it as a java Object
        // in a variable named `object`
        Object object = jsonparser.parse(reader);

        // Type casting of object from java to json
        JSONObject bookshelfjsonobj = (JSONObject) object;

        return bookshelfjsonobj;
    }

    // Creating function to print the JSON file in desired format

    public static void printJsonDocument(JSONArray book) {
        // For loop for iterating over the 3 values of the book array and printing out
        // required information
        // for each of the values
        for (int i = 0; i < book.size(); i++) {

            JSONObject objs = (JSONObject) book.get(i);

            String title = (String) objs.get("title");
            String publishedYear = (String) objs.get("publishedYear");
            String numberOfPages = (String) objs.get("numberOfPages");
            String authors = (String) objs.get("authors");

            int bookNumber = i + 1;
            System.out.println("\nThe details for book " + bookNumber + " is:");
            System.out.println("title: " + title);
            System.out.println("publishedYear: " + publishedYear);
            System.out.println("numberOfPages: " + numberOfPages);
            System.out.println("authors: " + authors);
        }
    }

    // Unchecking the warning to supress them
    @SuppressWarnings("unchecked")
    // Main program
    public static void main(String[] args) throws Exception {
        // Calling function `getFile()` to read the JSON file from given location
        JSONObject bookshelfjsonobj = getFile(
                "C:\\Users\\Niralis Envy\\OneDrive\\Documents\\GitHub\\INFO5100_002754715_ShivaniShah\\exercises\\exercise8\\InputFile.json");

        // Extracting json array - bookshelf
        JSONArray array = (JSONArray) bookshelfjsonobj.get("bookshelf");
        // Extracting the object of bookshelf array
        JSONObject bookArray = (JSONObject) array.get(0);

        // Extracting json array - Book
        JSONArray book = (JSONArray) bookArray.get("Book");

        System.out.println("=========================Printing already exisiting JSON File=========================");
        // Calling function `printJsonDocument()` to print the JSON file
        printJsonDocument(book);

        // Creating new object to be added to the JSON array
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("title", "The Perks Of Being a Wallflower");
        map.put("publishedYear", "1999");
        map.put("numberOfPages", "256");
        map.put("authors", "Stephen Chbosky");
        JSONObject obj = new JSONObject(map);

        // Adding new object to the existing JSON array
        book.add(obj);

        // Modifying the existing JSON file
        PrintWriter pw = new PrintWriter(
                "C:\\Users\\Niralis Envy\\OneDrive\\Documents\\GitHub\\INFO5100_002754715_ShivaniShah\\exercises\\exercise8\\InputFile.json");
        pw.write(bookshelfjsonobj.toJSONString());
        pw.flush();
        pw.close();

        // Calling function `getFile()` to read the updated JSON file again
        bookshelfjsonobj = getFile(
                "C:\\Users\\Niralis Envy\\OneDrive\\Documents\\GitHub\\INFO5100_002754715_ShivaniShah\\exercises\\exercise8\\InputFile.json");

        // Extracting json array - bookshelf
        array = (JSONArray) bookshelfjsonobj.get("bookshelf");
        // Extracting the object of bookshelf array
        bookArray = (JSONObject) array.get(0);

        // Extracting json array - Book
        book = (JSONArray) bookArray.get("Book");

        System.out.println(
                "=========================Adding new element to the file and printing the content again=========================");
        // Calling function `printJsonDocument()` for printing the updated JSON file
        printJsonDocument(book);

    }

}
