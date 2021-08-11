import java.util.*;
interface measure
{
	void area();
	void perimeter();


}
class circle implements measure
{
	float radius;
	circle(float r)
	{
		radius=r;
	}
	public void area()
	{
		System.out.println("\nAREA OF CIRCLE: "+(3.14*radius*radius));
	}
	public void perimeter()
	{
		System.out.println("\nPERIMETER OF CIRCLE: "+(2*3.14*radius));
	}

}
class rectangle implements measure
{
	float len,br;
	rectangle(float l,float b)
	{
		len=l;
		br=b;
	}
	public void area()
	{
		System.out.println("\nAREA OF RECTANGLE :"+(len*br));
	}
	public void perimeter()
	{
		System.out.println("\nPERIMETER OF RECTANGLE:"+(2*(len+br)));
	}
}
class interfaces
{
	public static void main(String args[])
	{
		int ch,c1,c2;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\n1.CIRCLE\n2.RECTANGLE\n3.EXIT");
			System.out.println("\nEnter your choice:");
			ch=Integer.parseInt(sc.nextLine());
			switch(ch)
			{
				case 1:System.out.println("Enter Radius:");
				       float r=Float.parseFloat(sc.nextLine());
				       measure c=new circle(r);
				       System.out.println("\n1.AREA\n2.PERIMETER");
				       System.out.println("\nEnter your choice:");
				       c1=Integer.parseInt(sc.nextLine());
				       switch(c1)
				       {
					       case 1:c.area();
						      break;
					       case 2:c.perimeter();
						      break;
				       }
				       break;
				case 2:System.out.println("Enter length:");
				       float l=Float.parseFloat(sc.nextLine());
				       System.out.println("Enter Breadth:");           
				       float b=Float.parseFloat(sc.nextLine());
				       System.out.println("\n1.AREA\n2.PERIMETER");
				       measure s=new rectangle(l,b);

				       System.out.println("\nEnter your choice:");
				       c2=Integer.parseInt(sc.nextLine());
				       switch(c2)
				       {
					       case 1:s.area();
						      break;
					       case 2:s.perimeter();
						      break;
				       }
				       break;
				case 3:break;
			}
		}while(ch!=3);
	}
}


























