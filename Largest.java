import java.util.*;
class Largest
{
   public static void main(String args[])
   { 
      int n;
      Scanner p.new Scanner(System.in);
  
      n=p.nextInt();
      String[] s1=new String[n];
      for(i=0;i<n;i++)
      s1[i]=p.next();
      Arrays.sort(s1);
      for(i=0;i<n;i++)
      System.out.print(s1[i]);
   }
}
