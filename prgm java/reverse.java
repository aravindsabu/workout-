import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		int rev=0,i,num;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number");
		num=s1.nextInt();
		while(num!=0)
		{
			i=num%10;
			rev=rev*10+i;
			num/=10;
		}
		System.out.println("REVERSE= "+rev);
	}
}