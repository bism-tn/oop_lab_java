import java.util.*;

class p6 {
    String room_no;
    String room_type;
    int room_area;

    p6() {

    }

    p6(String no, String type, int area) {
        this.room_area = area;
        this.room_no = no;
        this.room_type = type;
    }

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter room no : ");
        this.room_no = sc.nextLine();
        System.out.print("Enter room type : ");
        this.room_type = sc.nextLine();
        System.out.print("Enter room area : ");
        this.room_area = sc.nextInt();
    }

    public void display() {
        System.out.println("Room No : " + this.room_no);
        System.out.println("Room Type : " + this.room_type);
        System.out.println("Room Area : " + this.room_area);
		System.out.println("++++++++++++++++++++++++++++++");
    
		
    }

    public static void main(String[] args) {
        p6 room_1 = new p6();
        room_1.read();
        room_1.display();

        p6 room_2 = new p6("Ab36","AC",700);
        room_2.display();
    }
}
