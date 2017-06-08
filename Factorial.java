import java.util.*;
public class Factorial
{
 public static void main(String args[])
 {  
    Scanner p=new Scanner(System.in);
    String a=new String();
    a=p.next();
    StringBuffer b=new StringBuffer(a);
  if(b.length()>1)
  {
    b.reverse();
    System.out.print(b);
  } 
  else
   System.out.print("enter more than 2 characters");
    
   
  }
}
