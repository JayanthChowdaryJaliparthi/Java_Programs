import java.io.*;
import java.util.*;
class Racing
{
  public static void main (String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter speed of 5 racers");
   float a=sc.nextFloat() ;
   float b=sc.nextFloat() ;
   float c=sc.nextFloat() ;
   float d=sc.nextFloat() ;
   float e=sc.nextFloat() ;
   float avg=(a+b+c+d+e)/5;
   System.out.println("average speed:"+avg);
   if(a>avg)
   {
    System.out.println("racer 1 has qualified,speed"+a);
   }
   if(b>avg)
   {
    System.out.println("racer 2 has qualified,speed"+b);
   }
   if(c>avg)
   {
    System.out.println("racer 3 has qualified,speed"+c);
   }
   if(d>avg)
   {
    System.out.println("racer 4 has qualified,speed"+d);
   }
   if(e>avg)
   {
    System.out.println("racer 5 has qualified,speed"+e);
   }
  }
}