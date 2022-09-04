import java.util.*;
class swap
{
	public static void main(String args[])
	{
		int x,y;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of X");
        x=s1.nextInt();
		System.out.println("enter the value of Y");
		y=s1.nextInt();
		System.out.println("output before swapping");
		System.out.println("************************************");
		System.out.println("X= "+x);
		System.out.println("Y= "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("output after swapping");
		System.out.println("************************************");
		System.out.println("X= "+x);
		System.out.println("Y= "+y);
	}
}