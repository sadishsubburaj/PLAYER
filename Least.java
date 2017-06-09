import java.io.*;
public class Least
{
  public static void main(String args[])
  {
      Scanner p=new Scanner(System.in);
      int n,k,i,j;
      n=p.nextInt();
      k=p.nextInt();
      int a[]=new int[100];
      for(i=0;n>0;i++)
      {
         a[i]=n%10;
         n=n/10;
       }  
       Arrays.sort(a,0,i);
    if(k<i)
    {
       for(j=0;j<i-k;j++)
        System.out.print(a[j]);
    }
    else
      System.out.print("INVALID INPUT");
  }
  
}
