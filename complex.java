public class complex {
    int real;
    int imaginary;

    public complex(int real_get,int imag_get){
        this.real = real_get;
        this.imaginary = imag_get;
    }
    public static complex sum(p4 c1,p4 c2){
        p4 temp = new p4(0,0);
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }
    public static void main(String []args){
        complex first = new complex(12,25);
        complex second = new complex(2,2);
        complex temp = sum(first,second);
        System.out.println("Sum of complex numbers : " + temp.real + "+" +temp.imaginary + "i");
    }
}