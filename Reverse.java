import java.util.*;
public class Reverse
{
   public static void main(String args[])
   {
      Scanner p=new Scanner(System.in);
      int n,a=0,b=0;
      n=p.nextInt();
      if(n>0)
      {
      while(n>0)
      {
     
         a=n%10;
         n=n/10;
         b=b*10+a;
        
      }
      System.out.print(b);
      }
      else
      System.out.print("NOT IN RANGE");
   }
}
