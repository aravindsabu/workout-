import java.util.*;
class pgm1
{ public static void main(String[] args)
    {
	    int n1,n2,n3,lrg;
	    Scanner s1= new Scanner(System.in);
	    System.out.println("enter first number");
		n1=s1.nextInt();
		System.out.println("enter second number");
		n2=s1.nextInt();
		System.out.println("enter second number");
		n3=s1.nextInt();
		if (n1>=n2 && n1>=n3)
		{
			lrg=n1;
		}
		else if (n2>=n1 && n2>=n3)
		{
			lrg=n2;
		}
		else
		{
			lrg=n3;
		}
		System.out.println(lrg +"is the largest number");
	}
	
}	