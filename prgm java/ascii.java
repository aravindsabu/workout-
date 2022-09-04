import java.util.*;
class ascii
{
	public static void main(String args[])
	{
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character");
		ch=s.next().charAt(0);
		char asciiCode=ch;
		int asciiValue=(int)ch;
		System.out.println(" ASCII Code of "+ch+" is: "+asciiCode);
		System.out.println(" ASCII Value of "+ch+" is: "+asciiValue);
	}	
}