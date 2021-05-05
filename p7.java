import java.util.*;

class p7 {
    double width;
    double length;
    double area;
    String color;

    p7() {

    }

    p7(double w, double l, String c) {
        this.width = w;
        this.length = l;
        this.area = w * l;
        this.color = c;
    }

    public void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter color : ");
        this.color = sc.nextLine();
        System.out.print("Enter length : ");
        this.length = sc.nextDouble();
        System.out.print("Enter width : ");
        this.width = sc.nextDouble();

        this.area = this.length * this.width;
    }

    public String get_color() {
        System.out.println("color : " + this.color);
        return this.color;
    }

    public double get_area() {
        System.out.println("area : " + this.area);
        return this.area;
    }

    public static void main(String[] args) {
        p7 rectangle_1 = new p7(8, 68, "blue");
        p7 rectangle_2 = new p7();
        rectangle_2.read();
        if ((rectangle_1.get_area() == rectangle_2.get_area()) && (rectangle_1.get_color().equals(rectangle_2.get_color()))) {
            System.out.println("rectangles are same");
        } else {
            System.out.println("rectangles are not same");
        }

    }
}
