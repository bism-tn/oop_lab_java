import java.util.LinkedList;

class ll{
    public static void main(String[] args) {
        // string list
        LinkedList<String> data = new LinkedList<String>();
        data.add("ABC");
        data.add("BCD");
        data.add("CEF");
        data.add("DEF");
        
	
	
        System.out.println("Before removing  : "+data);
        data.clear();
        System.out.println("After removing  : "+data);
    }
}