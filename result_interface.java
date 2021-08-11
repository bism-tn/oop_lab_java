import java.util.*;
  
interface Student
{
	public int m1=97,m2=90,m3=94;
	public String name="xyz";
	public int cls=12;
	void disp();
}
interface Sports
{
	public int s1=23,s2=50;
	void disp();
}
class Result implements Student,Sports
{
	public void disp()
	{
		System.out.println("\n----STUDENT DETAILS----");
		System.out.println("\n-----------------------\n");
		System.out.println("NAME              :"+name);
		System.out.println("CLASS  	       :"+cls);
		System.out.println("\n----ACADEMIC SCORE----\n");	
		System.out.println("MARK  1      :"+m1);
                System.out.println("MARK  2	   :"+m2);
                System.out.println("MARK  3	   :"+m3);
                System.out.println("\nTOTAL MARK:"+(m1+m2+m3));
		System.out.println("\n----SPORTS SCORE---- \n");
                System.out.println("SCORE  1    :"+s1);
		System.out.println("SCORE  2    :"+s2);
		System.out.println("\nTOTAL SCORE="+(s1+s2));
	}
}
class result_interface
{
	public static void main(String args[])
	{
		Result r=new Result();
		r.disp();
	}
}