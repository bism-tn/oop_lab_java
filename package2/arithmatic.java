import package2.*;

class arithmatic  {
    public static void main(String []args){
        package2 Obj = new package2();
        System.out.println("SUM:"+Obj.add(1,8));
        System.out.println("DIFFERENCE:"+Obj.substract(99,2));
        System.out.println("PRODUCT:"+Obj.multiple(7,2));
        System.out.println("QUOTIENT:"+Obj.divide(22,2));
        System.out.println("REMINDER:"+Obj.remainder(18,4));
    }
}