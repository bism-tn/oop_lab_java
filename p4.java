public class p4 {
    int real;
    int imaginary;

    public p4(int real_get,int imag_get){
        this.real = real_get;
        this.imaginary = imag_get;
    }
    public static p4 sum(p4 c1,p4 c2){
        p4 temp = new p4(0,0);
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }
    public static void main(String []args){
        p4 first = new p4(12,25);
        p4 second = new p4(2,2);
        p4 temp = sum(first,second);
        System.out.println("Sum of complex numbers : " + temp.real + "+" +temp.imaginary + "i");
    }
}