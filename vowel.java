import java.util.*;
	public class vowel
	{
	  public static void main(String ars[])
	  {
	    Scanner p=new Scanner(System.in);
	    char ch=p.next().charAt(0);
	    String s1="";
	    String s2="vowel";
	    String s3="consonant";
	    switch(ch)
	    {
	    case 'a':s1=s2;
	             break;
	    case 'e':s1=s2;
	             break;
	    case 'i':s1=s2;
	             break;
	    case 'o':s1=s2;
	             break;
	    case 'u':s1=s2;
	             break;
	    case 'A':s1=s2;
	             break;
	    case 'E':s1=s2;
	             break;
	    case 'I':s1=s2;
	             break;
	    case 'O':s1=s2;
	             break;
	    case 'U':s1=s2;
	             break;
	    default:s1=s3;
	             break;
	     }
	     System.out.print(s1);
	    
	    }
	}
