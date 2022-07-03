import java.util.ArrayList;
import java.util.Collections;

public class arrayLs {
    public static void main(String[] args){
    ArrayList<String> obj= new ArrayList<String>();
    System.out.println(obj);
    obj.add("Sanket");      // Adding the element into the arraylist
    obj.add("Abhishek");
    obj.add("kunal");
    System.out.println(obj.get(0)); // accessing element from the arraylist
    obj.set(0,"kumar");     // Change the element from index
    obj.size();                           // Arraylist size
    Collections.sort(obj);
    obj.clear();                           // Remove all element from the arraylist


    }
}
