import java.util.*;
public class Factorial
{
 public static void main(String args[])
 {  
    Scanner p=new Scanner(System.in)
    int a,i,b=1;
    a=p.nextInt();
  if((a>0)&&(a<100))
  {
    for(i=1;i<=a;i++)
    {
      b=b*i;
    }
    System.out.print(b);
  }
  else
  {
   System.out.print("NOT IN RANGE");
  }
  }
}
