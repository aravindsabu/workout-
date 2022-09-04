import java.util.*;
class three
{
	public static void main (String args[])
	{
		int a,b,c,lrg;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the first number");
		a=s1.nextInt();
		System.out.println("enter the second number");
		b=s1.nextInt();
		System.out.println("enter the third number");
		c=s1.nextInt();
		lrg=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("Largest number is "+lrg);
		
		
	}
}