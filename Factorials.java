import java.io.*;
public class Factorials
{ 
   public static void main(String args[])
   {
      Scanner p=new Scanner(System.in);
      int i,b=1,n;
      n=p.nextInt();
      if((n>0)&&(n<100))
      {
          for(i=1;i<=n;i++)
          b=b*i;
          System.out.print(b);
      }
      else
      System.out.print("NOT IN RANGE");
   }
}
