import java.util.*;
class amst
{
	public static void main (String args[])
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		num1=sc.nextInt();
		System.out.println("enter the last number");
		num2=sc.nextInt();
		for(int i=num1;i<=num2;i++)
		{
			int check,rem,ams=0;
			check=i;
			while(check!=0)
			{
				rem=check%10;
				ams=ams+(rem*rem*rem);
				check=check/10;
			}
			if(ams==i)
			{
				System.out.println(i+" is a Armstrong number ");
				
			}
		}
	}
}