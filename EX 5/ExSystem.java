class ExSystem
{  
void work()
{
	System.out.println("working");
}  
}  
class  ExForsystem  extends ExSystem
{  
void browse()
{
	System.out.println("browsing");
}  
}  
class TestInheritance
{  
	public static void main(String[] args)
{  
	ExForsystem s=new  ExForsystem();  
	s.work();  
	s.browse();  
}}  