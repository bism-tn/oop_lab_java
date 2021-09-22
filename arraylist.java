import java.util.ArrayList;
import java.util.Collections;

class arraylist{
    public static void main(String[] args) {
        // string list
        ArrayList<String> data = new ArrayList<String>();
        // add 
        data.add("ABC");
        data.add("BCD");
        data.add("CEF");
        data.add("DEF");
        
        data.set(1, "EFG");
        System.out.println(data);
	System.out.println("data @ 0");
        System.out.println(data.get(0));
System.out.println("data @ 1");
        System.out.println(data.get(1));

        
        data.remove(0);
        System.out.println(data+" REMOVED");

        System.out.println("SIZE:");      
        System.out.println(data.size());
	System.out.println("Elements:");
        for (String d : data) {
            System.out.println(d);
        }


        
        Collections.sort(data);
System.out.println("Sorted");
        System.out.println(data);

        
        data.clear();
System.out.println("After clear:");
        System.out.println(data);
    }
}