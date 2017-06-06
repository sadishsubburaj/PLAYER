import java.util.*;
public class Factorial
{
 public static void main(String args[])
 {  
    Scanner p=new Scanner(System.in)
    int a,i,b=0;
    a=p.nextInt();
    for(i=1;i<=a;i++)
    {
      b=b*i;
    }
    System.out.print(b);
 }
}
