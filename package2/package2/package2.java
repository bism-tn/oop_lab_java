package package2;

interface graphics{
   public float add(int a, int b);
   public float divide(int a, int b);
   public float multiple(int a, int b);
   public float substract(int a, int b);
   public float remainder(int a, int b);
}

public class package2 implements graphics {
    
    public float add(int a, int b){
        return a+b;
    }
    public float divide(int a, int b){
        return a/b;
    }
    public float multiple(int a, int b){
        return a*b;
    }
    public float substract(int a, int b){
        return a-b;
    }
    public float remainder(int a, int b){
        return a%b;
    }
    
}