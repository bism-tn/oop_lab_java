public class p2 {
    String pcode;
    String pname;
    int price;

    public p2(String pcode_get, String pname_get, int price_get) {
        pcode = pcode_get;
        pname = pname_get;
        price = price_get;
    }

    public int get_price() {
        return price;
    }

    public static void main(String[] args) {
        p2 p_1 = new p2("100", "TV", 300000);
        p2 p_2 = new p2("200", "Fridge", 22221);
        p2 p_3 = new p2("300", "AC", 32222);

        if (p_1.price <= p_3.price && p_1.price <= p_2.price) 
            System.out.println("Lowest product ID is  : " + p_1.pcode);
        if (p_3.price <= p_1.price && p_3.price <= p_2.price) 
            System.out.println("Lowest product ID is  : " + p_3.pcode);
        if (p_2.price <= p_3.price && p_2.price <= p_1.price) 
            System.out.println("Lowest product ID is  : " + p_2.pcode);

    }
}