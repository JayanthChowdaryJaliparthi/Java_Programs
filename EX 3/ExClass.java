public class ExClass 
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.add(20, 10);
	}

}

class A 
{
	public void add(int l, int b) 
	{
		System.out.println("sum is:"+(l+b));
		
	}
}