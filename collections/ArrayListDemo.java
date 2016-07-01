/**
 * ArrayListDemo
 */
package arraylistdemo;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

import static java.lang.System.out;

/**
 *
 * @author chuck
 */
public class ArrayListDemo {

    public static void main(String... args) {
        // Implement List interface
        List<String> list = new ArrayList<>();

        // Add elements to the list
        list.add("Orders");
        list.add("Cart");
        list.add("Quote");
        list.add("Account");
        list.add("Admin");

        // Make changes to the list
        ListIterator<String> lIter = list.listIterator();
        while (lIter.hasNext()) {
            String element = lIter.next();
            lIter.set(element + "$");
        }

        // Convert list to an array
        String[] strArr = new String[list.size()];
        strArr = list.toArray(strArr);

        // Cycle thru array
        for (String s : strArr) {
            out.println(s);
        }        
    }
}
