import java.util.*;
class swaptemp
{
	public static void main(String args[])
	{
		int x,y,temp;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of x");
		x=s1.nextInt();
		System.out.println("enter the value of y");
		y=s1.nextInt();
		System.out.println("output before swapping");
		System.out.println("************************************");
		System.out.println("X= "+x);
		System.out.println("Y= "+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("output after swapping");
		System.out.println("************************************");
		System.out.println("X= "+x);
		System.out.println("Y= "+y);	
	}
}
