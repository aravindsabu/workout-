import java.util.*;
class employee
{
	String name;
	int empid;
	int result;
	int as1,as2,as3;
    employee()
	{
		System.out.println("enter the fields");
		System.out.println("***************************************************************");
		System.out.println("***************************************************************");
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the name");
		name=s1.next();
		System.out.println("enter the employee id");
		empid=s1.nextInt();
		System.out.println("enter the assesment 1 mark");
		as1=s1.nextInt();
		System.out.println("enter the assesment 2 mark");
		as2=s1.nextInt();
		System.out.println("enter the assesment 3 mark");
		as3=s1.nextInt();
		System.out.println("***************************************************************");
		System.out.println("***************************************************************");
		System.out.println("***************************************************************");
		System.out.println("***************************************************************");
		
		
	}
	void display()
	{
		
		System.out.println("NAME = "+name);
		System.out.println("EMPLOYEE ID = "+empid);
	    result= as1+as2+as3;
		float p=(float)(result*100)/300;		
		System.out.println("TOTAL = "+result);
		System.out.println("PERCENTAGE = "+p);
		if((as1>75)&&(as2>75)&&(as3>75))
		{
			System.out.println("PROMOTED");
		}
		else
		{
			System.out.println("DEMOTED");
		}
			
	}                             
}
public class employees
{
	public static void main(String args[])
	{
		employee e=new employee();
		e.display();
		
	}
	
}
