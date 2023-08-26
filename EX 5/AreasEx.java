public class AreasEx
{
	public static void main(String[] args) 
	{
		rectangle r1 = new rectangle();
		triangle t1 = new triangle();
		square s1 = new square();
		System.out.println("The area of rectangle is: " + r1.area());
		System.out.println("The area of triangle is: " + t1.area());
		System.out.println("The area of square is: " + s1.area());
	}
}

abstract class shape
{
	abstract double area();
}

class rectangle extends shape
{
	double l=20,b=20;
	double area() {	
		return l*b;
	}
}
class triangle extends shape
{
	double b=120,h=130;
	double area() {
		return 0.5*b*h;
	}
}
class square extends shape
{
	double side=10;
	double area() {
		return side*side;
	}
	
}