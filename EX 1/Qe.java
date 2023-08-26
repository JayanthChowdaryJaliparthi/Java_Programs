import java.io.*;
import java.util.*;
class Qe
{
 public static void main (String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a:");
 int a=sc.nextInt();
 System.out.println("enter b:");
 int b=sc.nextInt();
 System.out.println("enter c:");
 int c=sc.nextInt();
 System.out.println("roots are:");
 int d=(b*b)-(4*a*c);
 if(d>0)
  {
   double d1=((-b+Math.sqrt(d))/2*a); 
   double d2=((-b+Math.sqrt(d))/2*a);
   System.out.println("the equation has two roots");
   System.out.println("distinct root 1:"+d1);
   System.out.println("distinct root 2:"+d2);
  }
 if(d==0)
  {
   double eq=b/2*a;
   System.out.println("equation has two equal roots");
   System.out.println("root:"+eq);
  }
 if(d<0)
  {
   double real=-b/(2*a);
   double imag=Math.sqrt(-d)/(2*a);
   double c1=real+imag;
   double c2=real-imag;
   System.out.println("two complex roots"); 
   System.out.println("complex root 1:"+c1);
   System.out.println("complex root 2:"+c2);
  }
 }
}

 
 
