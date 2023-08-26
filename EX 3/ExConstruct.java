public class ExConstruct
{
	public static void main(String args[])
	{
		ExForConstruct a1=new ExForConstruct(); 
		int r=a1.area();
		System.out.println("The area is: "+r);
	}
}
class ExForConstruct
{
	int x,y;
	ExForConstruct()
	{
		x=10;
		y=20;
	}
	int area()
	{
		return x*y;
	}
}