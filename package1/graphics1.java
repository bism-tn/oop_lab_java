import package1.*;

public class graphics1{
    public static void main(String []args){
        package1 Obj = new package1(); 
	System.out.println("Area of rectangle:"+Obj.recArea(2,3));
        System.out.println("Area of circle:"+Obj.cirArea(8));
        System.out.println("Area of square:"+Obj.squArea(7));
        System.out.println("Area of triangle:"+Obj.triArea(1,3));
   
    }
}