import java.util.*;
public class Positive
{ 
   public static void main()
   {
      Scanner p=new Scanner(System.in);
      int number;
      number=p.nextInt();
      if(number==0)
      System.out.print("ZERO");
      else if(number>0)
      System.out.print("POSITIVE");
      else
      System.out.print("NEGATIVE");
   }
}
