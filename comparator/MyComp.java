package comparator;

import java.util.Comparator;

/**
 *
 * @author Chuck
 */
public class MyComp implements Comparator<String> {
    
    public int compare(String a, String b) {
        String aStr, bStr;
        
        aStr = a;
        bStr = b;
        
        // Reverse the comparison
        //return bStr.compareTo(aStr);
        return aStr.compareTo(bStr);
    }
    
}
