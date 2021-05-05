public class p5 {
    int rollno;
    String name;
    int mark1;
    int mark2;
    int mark3;

    public p5(int no_get,String name_get,int m1,int m2,int m3){
        this.rollno = no_get;
        this.name = name_get;
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3= m3;
    }
    public void disp(){
        System.out.println(this.rollno);
        System.out.println(this.name);
        System.out.println(this.mark1);
        System.out.println(this.mark2);
        System.out.println(this.mark3);
    }

    public int total(){
        int total  =  this.mark1 + this.mark2 + this.mark3;
        return total;
    }
    public static void main(String[] args) {
        p5 s1 =new p5(1,"Abc",10,29,38);
        p5 s2 =new p5(2,"xyz",51,60,43);
        p5 s3 =new p5(3,"pqr",41,42,43);


        if(s1.total() >= s2.total() && s1.total() >= s3.total()){
            System.out.println("Highest score is for student : " + s1.name);
        }
        if(s2.total() >= s1.total() && s2.total() >= s3.total()){
            System.out.println("Highest score is for student : " + s2.name);
        }
        if(s3.total() >= s2.total() && s3.total() >= s1.total()){
            System.out.println("Highest score is for student : " + s3.name);
        }

    }
}