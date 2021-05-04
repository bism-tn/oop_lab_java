import java.util.*;  
public class p3 {
    String ID;
    String name;
    int salary;

    public void read(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter ID : "); 
        ID = sc.nextLine();
        System.out.print("Enter Name : "); 
        name = sc.nextLine();
        System.out.print("Enter monthly salary : "); 
        salary = sc.nextInt();
    }

    public void display(){
        System.out.println("Annual salary : "+ salary*12);
    }
    public static void main(String []args){
        p3 emp1 = new p3();
        emp1.read();
        emp1.display();

        p3 emp2 = new p3();
        emp2.read();
        emp2.display();
    }
}