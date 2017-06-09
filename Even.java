import java.util.*;
public class Even
{
   public static void main(String args[])
   {
      Scanner p=new Scanner(System.in);
      int n;
      n=p.nextInt();
      if(n>0)
      {
      if(n%2==0)
      System.out.print("EVEN");
      else
      System.out.print("ODD");
      }
      else
      {
      System.out.print("NOT IN RANGE");
      }
   }
}
