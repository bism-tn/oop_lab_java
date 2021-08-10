class area
{
	public void ar(int l,int b)
	{
		int area=l*b;
		System.out.println("Area of Reactangle "+area);

	}
	public void ar(double r)
	{
		double area=3.14*r*r;
		System.out.println("Area of circle "+area);



	}
	public void ar(int s)
	{

		int area=s*s;
		System.out.println("Area of square "+area);


	}

	public static void main(String args[])
	{
		area a=new area();
		a.ar(10,20);
		a.ar(10.2);
		a.ar(10);

	}


}