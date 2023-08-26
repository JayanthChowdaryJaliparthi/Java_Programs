import java.io.*;
import java.util.*;
class Binary
{
 static boolean search(int key, ArrayList<Integer> A)
 {
 int low = 0;
 int high = A.size() - 1;
 while (low <= high) 
 {
  int mid = low + (high - low) / 2;
  if (A.get(mid) == key) 
  {
   return true;
  }
  else if (A.get(mid) < key)
  {
   low = mid + 1;
  }
  else 
  {
  high = mid - 1;
  }
 }
 return false;
}
 public static void main(String[] args)
 {
  ArrayList<Integer> A = new ArrayList<>();
  A.add(1);
  A.add(2);
  A.add(3);
  A.add(4);
  A.add(6);
  A.add(7);
  A.add(8);
  A.add(9);
  int key = 19;
  boolean check = search(key, A);
  System.out.println(check);
  int key1 = 2;
  System.out.println(check1);
 }
}
